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


#include "UpdateMemberResult.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

UpdateMemberResult::UpdateMemberResult()
{
    m_Business_role = "";
    m_Business_roleIsSet = false;
    m_Member_id = "";
    m_Member_idIsSet = false;
    
}

void UpdateMemberResult::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdateMemberResult::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdateMemberResult::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdateMemberResult" : pathPrefix;

             
    if (memberIdIsSet())
    {
        const std::string& value = m_Member_id;
        const std::string currentValuePath = _pathPrefix + ".memberId";
                
        

    }
    
    return success;
}

bool UpdateMemberResult::operator==(const UpdateMemberResult& rhs) const
{
    return
    
    
    
    ((!businessRoleIsSet() && !rhs.businessRoleIsSet()) || (businessRoleIsSet() && rhs.businessRoleIsSet() && getBusinessRole() == rhs.getBusinessRole())) &&
    
    
    ((!memberIdIsSet() && !rhs.memberIdIsSet()) || (memberIdIsSet() && rhs.memberIdIsSet() && getMemberId() == rhs.getMemberId()))
    
    ;
}

bool UpdateMemberResult::operator!=(const UpdateMemberResult& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdateMemberResult& o)
{
    j = nlohmann::json::object();
    if(o.businessRoleIsSet())
        j["business_role"] = o.m_Business_role;
    if(o.memberIdIsSet())
        j["member_id"] = o.m_Member_id;
    
}

void from_json(const nlohmann::json& j, UpdateMemberResult& o)
{
    if(j.find("business_role") != j.end())
    {
        j.at("business_role").get_to(o.m_Business_role);
        o.m_Business_roleIsSet = true;
    } 
    if(j.find("member_id") != j.end())
    {
        j.at("member_id").get_to(o.m_Member_id);
        o.m_Member_idIsSet = true;
    } 
    
}

std::string UpdateMemberResult::getBusinessRole() const
{
    return m_Business_role;
}
void UpdateMemberResult::setBusinessRole(std::string const& value)
{
    m_Business_role = value;
    m_Business_roleIsSet = true;
}
bool UpdateMemberResult::businessRoleIsSet() const
{
    return m_Business_roleIsSet;
}
void UpdateMemberResult::unsetBusiness_role()
{
    m_Business_roleIsSet = false;
}
std::string UpdateMemberResult::getMemberId() const
{
    return m_Member_id;
}
void UpdateMemberResult::setMemberId(std::string const& value)
{
    m_Member_id = value;
    m_Member_idIsSet = true;
}
bool UpdateMemberResult::memberIdIsSet() const
{
    return m_Member_idIsSet;
}
void UpdateMemberResult::unsetMember_id()
{
    m_Member_idIsSet = false;
}


} // namespace org::openapitools::server::model

