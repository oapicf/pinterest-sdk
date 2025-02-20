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
    /// User account ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
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
    /// <summary>
    /// Profile about description.
    /// </summary>
    std::string getAbout() const;
    void setAbout(std::string const& value);
    bool aboutIsSet() const;
    void unsetAbout();
    /// <summary>
    /// 
    /// </summary>
    std::string getBusinessName() const;
    void setBusinessName(std::string const& value);
    bool businessNameIsSet() const;
    void unsetBusiness_name();
    /// <summary>
    /// User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
    /// </summary>
    int32_t getBoardCount() const;
    void setBoardCount(int32_t const value);
    bool boardCountIsSet() const;
    void unsetBoard_count();
    /// <summary>
    /// User account pin count. This includes both created and saved pins.
    /// </summary>
    int32_t getPinCount() const;
    void setPinCount(int32_t const value);
    bool pinCountIsSet() const;
    void unsetPin_count();
    /// <summary>
    /// User account follower count.
    /// </summary>
    int32_t getFollowerCount() const;
    void setFollowerCount(int32_t const value);
    bool followerCountIsSet() const;
    void unsetFollower_count();
    /// <summary>
    /// User account following count.
    /// </summary>
    int32_t getFollowingCount() const;
    void setFollowingCount(int32_t const value);
    bool followingCountIsSet() const;
    void unsetFollowing_count();
    /// <summary>
    /// User account monthly views.
    /// </summary>
    int32_t getMonthlyViews() const;
    void setMonthlyViews(int32_t const value);
    bool monthlyViewsIsSet() const;
    void unsetMonthly_views();

    friend  void to_json(nlohmann::json& j, const Account& o);
    friend  void from_json(const nlohmann::json& j, Account& o);
protected:
    std::string m_Account_type;
    bool m_Account_typeIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Profile_image;
    bool m_Profile_imageIsSet;
    std::string m_Website_url;
    bool m_Website_urlIsSet;
    std::string m_Username;
    bool m_UsernameIsSet;
    std::string m_About;
    bool m_AboutIsSet;
    std::string m_Business_name;
    bool m_Business_nameIsSet;
    int32_t m_Board_count;
    bool m_Board_countIsSet;
    int32_t m_Pin_count;
    bool m_Pin_countIsSet;
    int32_t m_Follower_count;
    bool m_Follower_countIsSet;
    int32_t m_Following_count;
    bool m_Following_countIsSet;
    int32_t m_Monthly_views;
    bool m_Monthly_viewsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Account_H_ */
