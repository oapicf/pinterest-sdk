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


#include "UpdatePartnerAssetsResult.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdatePartnerAssetsResult::UpdatePartnerAssetsResult()
{
    m_Asset_id = "";
    m_Asset_idIsSet = false;
    m_Asset_type = "";
    m_Asset_typeIsSet = false;
    m_Partner_id = "";
    m_Partner_idIsSet = false;
    m_PermissionsIsSet = false;
    
}

void UpdatePartnerAssetsResult::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdatePartnerAssetsResult::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdatePartnerAssetsResult::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdatePartnerAssetsResult" : pathPrefix;

         
    if (assetIdIsSet())
    {
        const std::string& value = m_Asset_id;
        const std::string currentValuePath = _pathPrefix + ".assetId";
                
        

    }
             
    if (partnerIdIsSet())
    {
        const std::string& value = m_Partner_id;
        const std::string currentValuePath = _pathPrefix + ".partnerId";
                
        

    }
         
    if (permissionsIsSet())
    {
        const std::vector<std::string>& value = m_Permissions;
        const std::string currentValuePath = _pathPrefix + ".permissions";
                
        
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

bool UpdatePartnerAssetsResult::operator==(const UpdatePartnerAssetsResult& rhs) const
{
    return
    
    
    
    ((!assetIdIsSet() && !rhs.assetIdIsSet()) || (assetIdIsSet() && rhs.assetIdIsSet() && getAssetId() == rhs.getAssetId())) &&
    
    
    ((!assetTypeIsSet() && !rhs.assetTypeIsSet()) || (assetTypeIsSet() && rhs.assetTypeIsSet() && getAssetType() == rhs.getAssetType())) &&
    
    
    ((!partnerIdIsSet() && !rhs.partnerIdIsSet()) || (partnerIdIsSet() && rhs.partnerIdIsSet() && getPartnerId() == rhs.getPartnerId())) &&
    
    
    ((!permissionsIsSet() && !rhs.permissionsIsSet()) || (permissionsIsSet() && rhs.permissionsIsSet() && getPermissions() == rhs.getPermissions()))
    
    ;
}

bool UpdatePartnerAssetsResult::operator!=(const UpdatePartnerAssetsResult& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdatePartnerAssetsResult& o)
{
    j = nlohmann::json::object();
    if(o.assetIdIsSet())
        j["asset_id"] = o.m_Asset_id;
    if(o.assetTypeIsSet())
        j["asset_type"] = o.m_Asset_type;
    if(o.partnerIdIsSet())
        j["partner_id"] = o.m_Partner_id;
    if(o.permissionsIsSet() || !o.m_Permissions.empty())
        j["permissions"] = o.m_Permissions;
    
}

void from_json(const nlohmann::json& j, UpdatePartnerAssetsResult& o)
{
    if(j.find("asset_id") != j.end())
    {
        j.at("asset_id").get_to(o.m_Asset_id);
        o.m_Asset_idIsSet = true;
    } 
    if(j.find("asset_type") != j.end())
    {
        j.at("asset_type").get_to(o.m_Asset_type);
        o.m_Asset_typeIsSet = true;
    } 
    if(j.find("partner_id") != j.end())
    {
        j.at("partner_id").get_to(o.m_Partner_id);
        o.m_Partner_idIsSet = true;
    } 
    if(j.find("permissions") != j.end())
    {
        j.at("permissions").get_to(o.m_Permissions);
        o.m_PermissionsIsSet = true;
    } 
    
}

std::string UpdatePartnerAssetsResult::getAssetId() const
{
    return m_Asset_id;
}
void UpdatePartnerAssetsResult::setAssetId(std::string const& value)
{
    m_Asset_id = value;
    m_Asset_idIsSet = true;
}
bool UpdatePartnerAssetsResult::assetIdIsSet() const
{
    return m_Asset_idIsSet;
}
void UpdatePartnerAssetsResult::unsetAsset_id()
{
    m_Asset_idIsSet = false;
}
std::string UpdatePartnerAssetsResult::getAssetType() const
{
    return m_Asset_type;
}
void UpdatePartnerAssetsResult::setAssetType(std::string const& value)
{
    m_Asset_type = value;
    m_Asset_typeIsSet = true;
}
bool UpdatePartnerAssetsResult::assetTypeIsSet() const
{
    return m_Asset_typeIsSet;
}
void UpdatePartnerAssetsResult::unsetAsset_type()
{
    m_Asset_typeIsSet = false;
}
std::string UpdatePartnerAssetsResult::getPartnerId() const
{
    return m_Partner_id;
}
void UpdatePartnerAssetsResult::setPartnerId(std::string const& value)
{
    m_Partner_id = value;
    m_Partner_idIsSet = true;
}
bool UpdatePartnerAssetsResult::partnerIdIsSet() const
{
    return m_Partner_idIsSet;
}
void UpdatePartnerAssetsResult::unsetPartner_id()
{
    m_Partner_idIsSet = false;
}
std::vector<std::string> UpdatePartnerAssetsResult::getPermissions() const
{
    return m_Permissions;
}
void UpdatePartnerAssetsResult::setPermissions(std::vector<std::string> const& value)
{
    m_Permissions = value;
    m_PermissionsIsSet = true;
}
bool UpdatePartnerAssetsResult::permissionsIsSet() const
{
    return m_PermissionsIsSet;
}
void UpdatePartnerAssetsResult::unsetPermissions()
{
    m_PermissionsIsSet = false;
}


} // namespace org::openapitools::server::model

