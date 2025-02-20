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


#include "DeleteMemberAccessResult.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

DeleteMemberAccessResult::DeleteMemberAccessResult()
{
    m_Asset_id = "";
    m_Asset_idIsSet = false;
    m_Member_id = "";
    m_Member_idIsSet = false;
    
}

void DeleteMemberAccessResult::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool DeleteMemberAccessResult::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool DeleteMemberAccessResult::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "DeleteMemberAccessResult" : pathPrefix;

         
    if (assetIdIsSet())
    {
        const std::string& value = m_Asset_id;
        const std::string currentValuePath = _pathPrefix + ".assetId";
                
        

    }
         
    if (memberIdIsSet())
    {
        const std::string& value = m_Member_id;
        const std::string currentValuePath = _pathPrefix + ".memberId";
                
        

    }
    
    return success;
}

bool DeleteMemberAccessResult::operator==(const DeleteMemberAccessResult& rhs) const
{
    return
    
    
    
    ((!assetIdIsSet() && !rhs.assetIdIsSet()) || (assetIdIsSet() && rhs.assetIdIsSet() && getAssetId() == rhs.getAssetId())) &&
    
    
    ((!memberIdIsSet() && !rhs.memberIdIsSet()) || (memberIdIsSet() && rhs.memberIdIsSet() && getMemberId() == rhs.getMemberId()))
    
    ;
}

bool DeleteMemberAccessResult::operator!=(const DeleteMemberAccessResult& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const DeleteMemberAccessResult& o)
{
    j = nlohmann::json::object();
    if(o.assetIdIsSet())
        j["asset_id"] = o.m_Asset_id;
    if(o.memberIdIsSet())
        j["member_id"] = o.m_Member_id;
    
}

void from_json(const nlohmann::json& j, DeleteMemberAccessResult& o)
{
    if(j.find("asset_id") != j.end())
    {
        j.at("asset_id").get_to(o.m_Asset_id);
        o.m_Asset_idIsSet = true;
    } 
    if(j.find("member_id") != j.end())
    {
        j.at("member_id").get_to(o.m_Member_id);
        o.m_Member_idIsSet = true;
    } 
    
}

std::string DeleteMemberAccessResult::getAssetId() const
{
    return m_Asset_id;
}
void DeleteMemberAccessResult::setAssetId(std::string const& value)
{
    m_Asset_id = value;
    m_Asset_idIsSet = true;
}
bool DeleteMemberAccessResult::assetIdIsSet() const
{
    return m_Asset_idIsSet;
}
void DeleteMemberAccessResult::unsetAsset_id()
{
    m_Asset_idIsSet = false;
}
std::string DeleteMemberAccessResult::getMemberId() const
{
    return m_Member_id;
}
void DeleteMemberAccessResult::setMemberId(std::string const& value)
{
    m_Member_id = value;
    m_Member_idIsSet = true;
}
bool DeleteMemberAccessResult::memberIdIsSet() const
{
    return m_Member_idIsSet;
}
void DeleteMemberAccessResult::unsetMember_id()
{
    m_Member_idIsSet = false;
}


} // namespace org::openapitools::server::model

