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


#include "CampaignId.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CampaignId::CampaignId()
{
    m_Id = "";
    m_IdIsSet = false;
    
}

void CampaignId::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CampaignId::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CampaignId::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CampaignId" : pathPrefix;

         
    if (idIsSet())
    {
        const std::string& value = m_Id;
        const std::string currentValuePath = _pathPrefix + ".id";
                
        

    }
    
    return success;
}

bool CampaignId::operator==(const CampaignId& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId()))
    
    ;
}

bool CampaignId::operator!=(const CampaignId& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CampaignId& o)
{
    j = nlohmann::json::object();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    
}

void from_json(const nlohmann::json& j, CampaignId& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    
}

std::string CampaignId::getId() const
{
    return m_Id;
}
void CampaignId::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool CampaignId::idIsSet() const
{
    return m_IdIsSet;
}
void CampaignId::unsetId()
{
    m_IdIsSet = false;
}


} // namespace org::openapitools::server::model

