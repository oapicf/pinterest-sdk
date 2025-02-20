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


#include "UpdatePartnerAssetAccessBody_accesses_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdatePartnerAssetAccessBody_accesses_inner::UpdatePartnerAssetAccessBody_accesses_inner()
{
    m_Partner_id = "";
    m_Asset_id = "";
    
}

void UpdatePartnerAssetAccessBody_accesses_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdatePartnerAssetAccessBody_accesses_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdatePartnerAssetAccessBody_accesses_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdatePartnerAssetAccessBody_accesses_inner" : pathPrefix;

         
    
    /* Partner_id */ {
        const std::string& value = m_Partner_id;
        const std::string currentValuePath = _pathPrefix + ".partnerId";
                
        
        if (value.length() > 25)
        {
            success = false;
            msg << currentValuePath << ": must be at most 25 characters long;";
        }

    }
         
    
    /* Asset_id */ {
        const std::string& value = m_Asset_id;
        const std::string currentValuePath = _pathPrefix + ".assetId";
                
        
        if (value.length() > 25)
        {
            success = false;
            msg << currentValuePath << ": must be at most 25 characters long;";
        }

    }
         
    
    /* Permissions */ {
        const std::vector<org::openapitools::server::model::Permissions>& value = m_Permissions;
        const std::string currentValuePath = _pathPrefix + ".permissions";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 50)
        {
            success = false;
            msg << currentValuePath << ": must have at most 50 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::Permissions& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool UpdatePartnerAssetAccessBody_accesses_inner::operator==(const UpdatePartnerAssetAccessBody_accesses_inner& rhs) const
{
    return
    
    
    (getPartnerId() == rhs.getPartnerId())
     &&
    
    (getAssetId() == rhs.getAssetId())
     &&
    
    (getPermissions() == rhs.getPermissions())
    
    
    ;
}

bool UpdatePartnerAssetAccessBody_accesses_inner::operator!=(const UpdatePartnerAssetAccessBody_accesses_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdatePartnerAssetAccessBody_accesses_inner& o)
{
    j = nlohmann::json::object();
    j["partner_id"] = o.m_Partner_id;
    j["asset_id"] = o.m_Asset_id;
    j["permissions"] = o.m_Permissions;
    
}

void from_json(const nlohmann::json& j, UpdatePartnerAssetAccessBody_accesses_inner& o)
{
    j.at("partner_id").get_to(o.m_Partner_id);
    j.at("asset_id").get_to(o.m_Asset_id);
    j.at("permissions").get_to(o.m_Permissions);
    
}

std::string UpdatePartnerAssetAccessBody_accesses_inner::getPartnerId() const
{
    return m_Partner_id;
}
void UpdatePartnerAssetAccessBody_accesses_inner::setPartnerId(std::string const& value)
{
    m_Partner_id = value;
}
std::string UpdatePartnerAssetAccessBody_accesses_inner::getAssetId() const
{
    return m_Asset_id;
}
void UpdatePartnerAssetAccessBody_accesses_inner::setAssetId(std::string const& value)
{
    m_Asset_id = value;
}
std::vector<org::openapitools::server::model::Permissions> UpdatePartnerAssetAccessBody_accesses_inner::getPermissions() const
{
    return m_Permissions;
}
void UpdatePartnerAssetAccessBody_accesses_inner::setPermissions(std::vector<org::openapitools::server::model::Permissions> const& value)
{
    m_Permissions = value;
}


} // namespace org::openapitools::server::model

