#include "xmlprofilehelper.h"

XMLProfileHelper::XMLProfileHelper()
{

}

XMLP_ret XMLProfileHelper::loadXML(const std::string &data, up_base_node_t &root)
{

    tinyxml2::XMLDocument xmlDoc;
    if (tinyxml2::XMLError::XML_SUCCESS != xmlDoc.Parse(data.c_str()))
    {
        return XMLP_ret::XML_ERROR;
    }

    logInfo(XMLPARSER, "XML loaded successfully");
    return XMLParser::parseXML(xmlDoc, root);
}


XMLP_ret XMLProfileHelper::loadXMLProfile(const std::string& data)
{

    up_base_node_t root_node;
    XMLP_ret loaded_ret = XMLProfileHelper::loadXML(filename, root_node);
    if (!root_node || loaded_ret != XMLP_ret::XML_OK)
    {
        if (filename != std::string(DEFAULT_FASTRTPS_PROFILES))
        {
            logError(XMLPARSER, "Error parsing '" << filename << "'");
        }
        xml_files_.emplace(filename, XMLP_ret::XML_ERROR);
        return XMLP_ret::XML_ERROR;
    }

    logInfo(XMLPARSER, "File '" << filename << "' parsed successfully");

    if (NodeType::ROOT == root_node->getType())
    {
        for (auto&& child: root_node->getChildren())
        {
            if (NodeType::PROFILES == child.get()->getType())
            {
                return XMLProfileManager::extractProfiles(std::move(child), filename);
            }
        }
        return loaded_ret;
    }
    else if (NodeType::PROFILES == root_node->getType())
    {
        return XMLProfileManager::extractProfiles(std::move(root_node), filename);
    }

    return loaded_ret;
}
}


