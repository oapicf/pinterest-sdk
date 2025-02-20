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


#include "GetBusinessAssetsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GetBusinessAssetsResponse::GetBusinessAssetsResponse()
{
    m_Asset_id = "";
    m_Asset_idIsSet = false;
    m_Asset_type = "";
    m_Asset_typeIsSet = false;
    m_Asset_group_infoIsSet = false;
    
}

void GetBusinessAssetsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GetBusinessAssetsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GetBusinessAssetsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GetBusinessAssetsResponse" : pathPrefix;

         
    if (assetIdIsSet())
    {
        const std::string& value = m_Asset_id;
        const std::string currentValuePath = _pathPrefix + ".assetId";
                
        
        if (value.length() < 1)
        {
            success = false;
            msg << currentValuePath << ": must be at least 1 characters long;";
        }
        if (value.length() > 20)
        {
            success = false;
            msg << currentValuePath << ": must be at most 20 characters long;";
        }

    }
            
    return success;
}

bool GetBusinessAssetsResponse::operator==(const GetBusinessAssetsResponse& rhs) const
{
    return
    
    
    
    ((!assetIdIsSet() && !rhs.assetIdIsSet()) || (assetIdIsSet() && rhs.assetIdIsSet() && getAssetId() == rhs.getAssetId())) &&
    
    
    ((!assetTypeIsSet() && !rhs.assetTypeIsSet()) || (assetTypeIsSet() && rhs.assetTypeIsSet() && getAssetType() == rhs.getAssetType())) &&
    
    
    ((!assetGroupInfoIsSet() && !rhs.assetGroupInfoIsSet()) || (assetGroupInfoIsSet() && rhs.assetGroupInfoIsSet() && getAssetGroupInfo() == rhs.getAssetGroupInfo()))
    
    ;
}

bool GetBusinessAssetsResponse::operator!=(const GetBusinessAssetsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GetBusinessAssetsResponse& o)
{
    j = nlohmann::json::object();
    if(o.assetIdIsSet())
        j["asset_id"] = o.m_Asset_id;
    if(o.assetTypeIsSet())
        j["asset_type"] = o.m_Asset_type;
    if(o.assetGroupInfoIsSet())
        j["asset_group_info"] = o.m_Asset_group_info;
    
}

void from_json(const nlohmann::json& j, GetBusinessAssetsResponse& o)
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
    if(j.find("asset_group_info") != j.end())
    {
        j.at("asset_group_info").get_to(o.m_Asset_group_info);
        o.m_Asset_group_infoIsSet = true;
    } 
    
}

std::string GetBusinessAssetsResponse::getAssetId() const
{
    return m_Asset_id;
}
void GetBusinessAssetsResponse::setAssetId(std::string const& value)
{
    m_Asset_id = value;
    m_Asset_idIsSet = true;
}
bool GetBusinessAssetsResponse::assetIdIsSet() const
{
    return m_Asset_idIsSet;
}
void GetBusinessAssetsResponse::unsetAsset_id()
{
    m_Asset_idIsSet = false;
}
std::string GetBusinessAssetsResponse::getAssetType() const
{
    return m_Asset_type;
}
void GetBusinessAssetsResponse::setAssetType(std::string const& value)
{
    m_Asset_type = value;
    m_Asset_typeIsSet = true;
}
bool GetBusinessAssetsResponse::assetTypeIsSet() const
{
    return m_Asset_typeIsSet;
}
void GetBusinessAssetsResponse::unsetAsset_type()
{
    m_Asset_typeIsSet = false;
}
org::openapitools::server::model::AssetGroupBinding GetBusinessAssetsResponse::getAssetGroupInfo() const
{
    return m_Asset_group_info;
}
void GetBusinessAssetsResponse::setAssetGroupInfo(org::openapitools::server::model::AssetGroupBinding const& value)
{
    m_Asset_group_info = value;
    m_Asset_group_infoIsSet = true;
}
bool GetBusinessAssetsResponse::assetGroupInfoIsSet() const
{
    return m_Asset_group_infoIsSet;
}
void GetBusinessAssetsResponse::unsetAsset_group_info()
{
    m_Asset_group_infoIsSet = false;
}


} // namespace org::openapitools::server::model

