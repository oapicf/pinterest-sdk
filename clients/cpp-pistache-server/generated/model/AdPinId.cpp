/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "AdPinId.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdPinId::AdPinId()
{
    m_Pin_id = "";
    m_Pin_idIsSet = false;
    
}

void AdPinId::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdPinId::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdPinId::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdPinId" : pathPrefix;

         
    if (pinIdIsSet())
    {
        const std::string& value = m_Pin_id;
        const std::string currentValuePath = _pathPrefix + ".pinId";
                
        

    }
    
    return success;
}

bool AdPinId::operator==(const AdPinId& rhs) const
{
    return
    
    
    
    ((!pinIdIsSet() && !rhs.pinIdIsSet()) || (pinIdIsSet() && rhs.pinIdIsSet() && getPinId() == rhs.getPinId()))
    
    ;
}

bool AdPinId::operator!=(const AdPinId& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdPinId& o)
{
    j = nlohmann::json::object();
    if(o.pinIdIsSet())
        j["pin_id"] = o.m_Pin_id;
    
}

void from_json(const nlohmann::json& j, AdPinId& o)
{
    if(j.find("pin_id") != j.end())
    {
        j.at("pin_id").get_to(o.m_Pin_id);
        o.m_Pin_idIsSet = true;
    } 
    
}

std::string AdPinId::getPinId() const
{
    return m_Pin_id;
}
void AdPinId::setPinId(std::string const& value)
{
    m_Pin_id = value;
    m_Pin_idIsSet = true;
}
bool AdPinId::pinIdIsSet() const
{
    return m_Pin_idIsSet;
}
void AdPinId::unsetPin_id()
{
    m_Pin_idIsSet = false;
}


} // namespace org::openapitools::server::model

