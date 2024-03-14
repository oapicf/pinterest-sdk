/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.6.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "Account.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Account::Account()
{
    m_Account_type = "";
    m_Account_typeIsSet = false;
    m_Profile_image = "";
    m_Profile_imageIsSet = false;
    m_Website_url = "";
    m_Website_urlIsSet = false;
    m_Username = "";
    m_UsernameIsSet = false;
    
}

void Account::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Account::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Account::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Account" : pathPrefix;

                    
    return success;
}

bool Account::operator==(const Account& rhs) const
{
    return
    
    
    
    ((!accountTypeIsSet() && !rhs.accountTypeIsSet()) || (accountTypeIsSet() && rhs.accountTypeIsSet() && getAccountType() == rhs.getAccountType())) &&
    
    
    ((!profileImageIsSet() && !rhs.profileImageIsSet()) || (profileImageIsSet() && rhs.profileImageIsSet() && getProfileImage() == rhs.getProfileImage())) &&
    
    
    ((!websiteUrlIsSet() && !rhs.websiteUrlIsSet()) || (websiteUrlIsSet() && rhs.websiteUrlIsSet() && getWebsiteUrl() == rhs.getWebsiteUrl())) &&
    
    
    ((!usernameIsSet() && !rhs.usernameIsSet()) || (usernameIsSet() && rhs.usernameIsSet() && getUsername() == rhs.getUsername()))
    
    ;
}

bool Account::operator!=(const Account& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Account& o)
{
    j = nlohmann::json::object();
    if(o.accountTypeIsSet())
        j["account_type"] = o.m_Account_type;
    if(o.profileImageIsSet())
        j["profile_image"] = o.m_Profile_image;
    if(o.websiteUrlIsSet())
        j["website_url"] = o.m_Website_url;
    if(o.usernameIsSet())
        j["username"] = o.m_Username;
    
}

void from_json(const nlohmann::json& j, Account& o)
{
    if(j.find("account_type") != j.end())
    {
        j.at("account_type").get_to(o.m_Account_type);
        o.m_Account_typeIsSet = true;
    } 
    if(j.find("profile_image") != j.end())
    {
        j.at("profile_image").get_to(o.m_Profile_image);
        o.m_Profile_imageIsSet = true;
    } 
    if(j.find("website_url") != j.end())
    {
        j.at("website_url").get_to(o.m_Website_url);
        o.m_Website_urlIsSet = true;
    } 
    if(j.find("username") != j.end())
    {
        j.at("username").get_to(o.m_Username);
        o.m_UsernameIsSet = true;
    } 
    
}

std::string Account::getAccountType() const
{
    return m_Account_type;
}
void Account::setAccountType(std::string const& value)
{
    m_Account_type = value;
    m_Account_typeIsSet = true;
}
bool Account::accountTypeIsSet() const
{
    return m_Account_typeIsSet;
}
void Account::unsetAccount_type()
{
    m_Account_typeIsSet = false;
}
std::string Account::getProfileImage() const
{
    return m_Profile_image;
}
void Account::setProfileImage(std::string const& value)
{
    m_Profile_image = value;
    m_Profile_imageIsSet = true;
}
bool Account::profileImageIsSet() const
{
    return m_Profile_imageIsSet;
}
void Account::unsetProfile_image()
{
    m_Profile_imageIsSet = false;
}
std::string Account::getWebsiteUrl() const
{
    return m_Website_url;
}
void Account::setWebsiteUrl(std::string const& value)
{
    m_Website_url = value;
    m_Website_urlIsSet = true;
}
bool Account::websiteUrlIsSet() const
{
    return m_Website_urlIsSet;
}
void Account::unsetWebsite_url()
{
    m_Website_urlIsSet = false;
}
std::string Account::getUsername() const
{
    return m_Username;
}
void Account::setUsername(std::string const& value)
{
    m_Username = value;
    m_UsernameIsSet = true;
}
bool Account::usernameIsSet() const
{
    return m_UsernameIsSet;
}
void Account::unsetUsername()
{
    m_UsernameIsSet = false;
}


} // namespace org::openapitools::server::model
