/**
 * Copyright 2017 Florida Institute for Human and Machine Cognition (IHMC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.ihmc.pubsub.attributes;

/**
 * Class QosPolicy, base for all QoS policies defined for Writers and Readers.
 */
public class QosPolicy
{
   private boolean sendAlways = false;
   private boolean hasChanged = false;
   
   public QosPolicy(boolean sendAlways)
   {
      this.sendAlways = sendAlways;
   }

   public boolean isSendAlways()
   {
      return sendAlways;
   }

   public void setSendAlways(boolean sendAlways)
   {
      this.sendAlways = sendAlways;
   }

   public boolean isHasChanged()
   {
      return hasChanged;
   }

   public void setHasChanged(boolean hasChanged)
   {
      this.hasChanged = hasChanged;
   }
}
