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


#include "InviteAssetsSummary_profiles_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

InviteAssetsSummary_profiles_inner::InviteAssetsSummary_profiles_inner()
{
    m_Id = "";
    m_IdIsSet = false;
    m_PermissionsIsSet = false;
    
}

void InviteAssetsSummary_profiles_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool InviteAssetsSummary_profiles_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool InviteAssetsSummary_profiles_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "InviteAssetsSummary_profiles_inner" : pathPrefix;

         
    if (idIsSet())
    {
        const std::string& value = m_Id;
        const std::string currentValuePath = _pathPrefix + ".id";
                
        

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

bool InviteAssetsSummary_profiles_inner::operator==(const InviteAssetsSummary_profiles_inner& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!permissionsIsSet() && !rhs.permissionsIsSet()) || (permissionsIsSet() && rhs.permissionsIsSet() && getPermissions() == rhs.getPermissions()))
    
    ;
}

bool InviteAssetsSummary_profiles_inner::operator!=(const InviteAssetsSummary_profiles_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const InviteAssetsSummary_profiles_inner& o)
{
    j = nlohmann::json::object();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.permissionsIsSet() || !o.m_Permissions.empty())
        j["permissions"] = o.m_Permissions;
    
}

void from_json(const nlohmann::json& j, InviteAssetsSummary_profiles_inner& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("permissions") != j.end())
    {
        j.at("permissions").get_to(o.m_Permissions);
        o.m_PermissionsIsSet = true;
    } 
    
}

std::string InviteAssetsSummary_profiles_inner::getId() const
{
    return m_Id;
}
void InviteAssetsSummary_profiles_inner::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool InviteAssetsSummary_profiles_inner::idIsSet() const
{
    return m_IdIsSet;
}
void InviteAssetsSummary_profiles_inner::unsetId()
{
    m_IdIsSet = false;
}
std::vector<std::string> InviteAssetsSummary_profiles_inner::getPermissions() const
{
    return m_Permissions;
}
void InviteAssetsSummary_profiles_inner::setPermissions(std::vector<std::string> const& value)
{
    m_Permissions = value;
    m_PermissionsIsSet = true;
}
bool InviteAssetsSummary_profiles_inner::permissionsIsSet() const
{
    return m_PermissionsIsSet;
}
void InviteAssetsSummary_profiles_inner::unsetPermissions()
{
    m_PermissionsIsSet = false;
}


} // namespace org::openapitools::server::model

