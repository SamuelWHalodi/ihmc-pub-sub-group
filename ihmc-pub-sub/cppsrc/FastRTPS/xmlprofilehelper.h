#ifndef XMLPROFILEHELPER_H
#define XMLPROFILEHELPER_H
#include <fastrtps/xmlparser/XMLProfileManager.h>
#include <fastrtps/xmlparser/XMLParser.h>
#include <fastrtps/xmlparser/XMLParserCommon.h>
#include <fastrtps/xmlparser/XMLTree.h>

#include <tinyxml2.h>

#include <iostream>
#include <cstdlib>

using namespace eprosima::fastrtps::xmlparser;

class XMLProfileHelper : protected XMLParser
{
public:
    XMLProfileHelper();


    XMLP_ret static loadXML(const std::string& data, up_base_node_t& root);


    XMLP_ret static loadXMLProfile(const std::string& data)
};

#endif // XMLPROFILEHELPER_H
