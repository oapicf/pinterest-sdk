/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * Account.h
 *
 * 
 */

#ifndef Account_H_
#define Account_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Account
{
public:
    Account();
    virtual ~Account() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const Account& rhs) const;
    bool operator!=(const Account& rhs) const;

    /////////////////////////////////////////////
    /// Account members

    /// <summary>
    /// Type of account
    /// </summary>
    std::string getAccountType() const;
    void setAccountType(std::string const& value);
    bool accountTypeIsSet() const;
    void unsetAccount_type();
    /// <summary>
    /// 
    /// </summary>
    std::string getProfileImage() const;
    void setProfileImage(std::string const& value);
    bool profileImageIsSet() const;
    void unsetProfile_image();
    /// <summary>
    /// 
    /// </summary>
    std::string getWebsiteUrl() const;
    void setWebsiteUrl(std::string const& value);
    bool websiteUrlIsSet() const;
    void unsetWebsite_url();
    /// <summary>
    /// 
    /// </summary>
    std::string getUsername() const;
    void setUsername(std::string const& value);
    bool usernameIsSet() const;
    void unsetUsername();

    friend void to_json(nlohmann::json& j, const Account& o);
    friend void from_json(const nlohmann::json& j, Account& o);
protected:
    std::string m_Account_type;
    bool m_Account_typeIsSet;
    std::string m_Profile_image;
    bool m_Profile_imageIsSet;
    std::string m_Website_url;
    bool m_Website_urlIsSet;
    std::string m_Username;
    bool m_UsernameIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Account_H_ */