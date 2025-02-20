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


#include "BusinessSharedAudienceResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

BusinessSharedAudienceResponse::BusinessSharedAudienceResponse()
{
    m_Audience_id = "";
    m_Audience_idIsSet = false;
    m_PermissionsIsSet = false;
    m_Recipient_business_idsIsSet = false;
    
}

void BusinessSharedAudienceResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool BusinessSharedAudienceResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool BusinessSharedAudienceResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "BusinessSharedAudienceResponse" : pathPrefix;

             
    if (permissionsIsSet())
    {
        const std::vector<org::openapitools::server::model::Role>& value = m_Permissions;
        const std::string currentValuePath = _pathPrefix + ".permissions";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::Role& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (recipientBusinessIdsIsSet())
    {
        const std::vector<std::string>& value = m_Recipient_business_ids;
        const std::string currentValuePath = _pathPrefix + ".recipientBusinessIds";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool BusinessSharedAudienceResponse::operator==(const BusinessSharedAudienceResponse& rhs) const
{
    return
    
    
    
    ((!audienceIdIsSet() && !rhs.audienceIdIsSet()) || (audienceIdIsSet() && rhs.audienceIdIsSet() && getAudienceId() == rhs.getAudienceId())) &&
    
    
    ((!permissionsIsSet() && !rhs.permissionsIsSet()) || (permissionsIsSet() && rhs.permissionsIsSet() && getPermissions() == rhs.getPermissions())) &&
    
    
    ((!recipientBusinessIdsIsSet() && !rhs.recipientBusinessIdsIsSet()) || (recipientBusinessIdsIsSet() && rhs.recipientBusinessIdsIsSet() && getRecipientBusinessIds() == rhs.getRecipientBusinessIds()))
    
    ;
}

bool BusinessSharedAudienceResponse::operator!=(const BusinessSharedAudienceResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const BusinessSharedAudienceResponse& o)
{
    j = nlohmann::json::object();
    if(o.audienceIdIsSet())
        j["audience_id"] = o.m_Audience_id;
    if(o.permissionsIsSet() || !o.m_Permissions.empty())
        j["permissions"] = o.m_Permissions;
    if(o.recipientBusinessIdsIsSet() || !o.m_Recipient_business_ids.empty())
        j["recipient_business_ids"] = o.m_Recipient_business_ids;
    
}

void from_json(const nlohmann::json& j, BusinessSharedAudienceResponse& o)
{
    if(j.find("audience_id") != j.end())
    {
        j.at("audience_id").get_to(o.m_Audience_id);
        o.m_Audience_idIsSet = true;
    } 
    if(j.find("permissions") != j.end())
    {
        j.at("permissions").get_to(o.m_Permissions);
        o.m_PermissionsIsSet = true;
    } 
    if(j.find("recipient_business_ids") != j.end())
    {
        j.at("recipient_business_ids").get_to(o.m_Recipient_business_ids);
        o.m_Recipient_business_idsIsSet = true;
    } 
    
}

std::string BusinessSharedAudienceResponse::getAudienceId() const
{
    return m_Audience_id;
}
void BusinessSharedAudienceResponse::setAudienceId(std::string const& value)
{
    m_Audience_id = value;
    m_Audience_idIsSet = true;
}
bool BusinessSharedAudienceResponse::audienceIdIsSet() const
{
    return m_Audience_idIsSet;
}
void BusinessSharedAudienceResponse::unsetAudience_id()
{
    m_Audience_idIsSet = false;
}
std::vector<org::openapitools::server::model::Role> BusinessSharedAudienceResponse::getPermissions() const
{
    return m_Permissions;
}
void BusinessSharedAudienceResponse::setPermissions(std::vector<org::openapitools::server::model::Role> const& value)
{
    m_Permissions = value;
    m_PermissionsIsSet = true;
}
bool BusinessSharedAudienceResponse::permissionsIsSet() const
{
    return m_PermissionsIsSet;
}
void BusinessSharedAudienceResponse::unsetPermissions()
{
    m_PermissionsIsSet = false;
}
std::vector<std::string> BusinessSharedAudienceResponse::getRecipientBusinessIds() const
{
    return m_Recipient_business_ids;
}
void BusinessSharedAudienceResponse::setRecipientBusinessIds(std::vector<std::string> const& value)
{
    m_Recipient_business_ids = value;
    m_Recipient_business_idsIsSet = true;
}
bool BusinessSharedAudienceResponse::recipientBusinessIdsIsSet() const
{
    return m_Recipient_business_idsIsSet;
}
void BusinessSharedAudienceResponse::unsetRecipient_business_ids()
{
    m_Recipient_business_idsIsSet = false;
}


} // namespace org::openapitools::server::model

