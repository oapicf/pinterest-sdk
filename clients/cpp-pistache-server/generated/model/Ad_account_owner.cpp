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


#include "Ad_account_owner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Ad_account_owner::Ad_account_owner()
{
    m_Username = "";
    m_UsernameIsSet = false;
    m_Id = "";
    m_IdIsSet = false;
    
}

void Ad_account_owner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Ad_account_owner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Ad_account_owner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Ad_account_owner" : pathPrefix;

            
    return success;
}

bool Ad_account_owner::operator==(const Ad_account_owner& rhs) const
{
    return
    
    
    
    ((!usernameIsSet() && !rhs.usernameIsSet()) || (usernameIsSet() && rhs.usernameIsSet() && getUsername() == rhs.getUsername())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId()))
    
    ;
}

bool Ad_account_owner::operator!=(const Ad_account_owner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Ad_account_owner& o)
{
    j = nlohmann::json::object();
    if(o.usernameIsSet())
        j["username"] = o.m_Username;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    
}

void from_json(const nlohmann::json& j, Ad_account_owner& o)
{
    if(j.find("username") != j.end())
    {
        j.at("username").get_to(o.m_Username);
        o.m_UsernameIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    
}

std::string Ad_account_owner::getUsername() const
{
    return m_Username;
}
void Ad_account_owner::setUsername(std::string const& value)
{
    m_Username = value;
    m_UsernameIsSet = true;
}
bool Ad_account_owner::usernameIsSet() const
{
    return m_UsernameIsSet;
}
void Ad_account_owner::unsetUsername()
{
    m_UsernameIsSet = false;
}
std::string Ad_account_owner::getId() const
{
    return m_Id;
}
void Ad_account_owner::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool Ad_account_owner::idIsSet() const
{
    return m_IdIsSet;
}
void Ad_account_owner::unsetId()
{
    m_IdIsSet = false;
}


} // namespace org::openapitools::server::model

