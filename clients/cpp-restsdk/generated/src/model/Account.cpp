/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Account.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Account::Account()
{
    m_Account_type = utility::conversions::to_string_t("");
    m_Account_typeIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Profile_image = utility::conversions::to_string_t("");
    m_Profile_imageIsSet = false;
    m_Website_url = utility::conversions::to_string_t("");
    m_Website_urlIsSet = false;
    m_Username = utility::conversions::to_string_t("");
    m_UsernameIsSet = false;
    m_About = utility::conversions::to_string_t("");
    m_AboutIsSet = false;
    m_Business_name = utility::conversions::to_string_t("");
    m_Business_nameIsSet = false;
    m_Board_count = 0;
    m_Board_countIsSet = false;
    m_Pin_count = 0;
    m_Pin_countIsSet = false;
    m_Follower_count = 0;
    m_Follower_countIsSet = false;
    m_Following_count = 0;
    m_Following_countIsSet = false;
    m_Monthly_views = 0;
    m_Monthly_viewsIsSet = false;
}

Account::~Account()
{
}

void Account::validate()
{
    // TODO: implement validation
}

web::json::value Account::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Account_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("account_type"))] = ModelBase::toJson(m_Account_type);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Profile_imageIsSet)
    {
        val[utility::conversions::to_string_t(U("profile_image"))] = ModelBase::toJson(m_Profile_image);
    }
    if(m_Website_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("website_url"))] = ModelBase::toJson(m_Website_url);
    }
    if(m_UsernameIsSet)
    {
        val[utility::conversions::to_string_t(U("username"))] = ModelBase::toJson(m_Username);
    }
    if(m_AboutIsSet)
    {
        val[utility::conversions::to_string_t(U("about"))] = ModelBase::toJson(m_About);
    }
    if(m_Business_nameIsSet)
    {
        val[utility::conversions::to_string_t(U("business_name"))] = ModelBase::toJson(m_Business_name);
    }
    if(m_Board_countIsSet)
    {
        val[utility::conversions::to_string_t(U("board_count"))] = ModelBase::toJson(m_Board_count);
    }
    if(m_Pin_countIsSet)
    {
        val[utility::conversions::to_string_t(U("pin_count"))] = ModelBase::toJson(m_Pin_count);
    }
    if(m_Follower_countIsSet)
    {
        val[utility::conversions::to_string_t(U("follower_count"))] = ModelBase::toJson(m_Follower_count);
    }
    if(m_Following_countIsSet)
    {
        val[utility::conversions::to_string_t(U("following_count"))] = ModelBase::toJson(m_Following_count);
    }
    if(m_Monthly_viewsIsSet)
    {
        val[utility::conversions::to_string_t(U("monthly_views"))] = ModelBase::toJson(m_Monthly_views);
    }

    return val;
}

bool Account::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("account_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("account_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAccountType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAccountType);
            setAccountType(refVal_setAccountType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("profile_image"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("profile_image")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProfileImage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProfileImage);
            setProfileImage(refVal_setProfileImage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("website_url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("website_url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setWebsiteUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWebsiteUrl);
            setWebsiteUrl(refVal_setWebsiteUrl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("username"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("username")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUsername;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUsername);
            setUsername(refVal_setUsername);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("about"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("about")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAbout;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAbout);
            setAbout(refVal_setAbout);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("business_name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("business_name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBusinessName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBusinessName);
            setBusinessName(refVal_setBusinessName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("board_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("board_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setBoardCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBoardCount);
            setBoardCount(refVal_setBoardCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pin_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pin_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPinCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPinCount);
            setPinCount(refVal_setPinCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("follower_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("follower_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setFollowerCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFollowerCount);
            setFollowerCount(refVal_setFollowerCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("following_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("following_count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setFollowingCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFollowingCount);
            setFollowingCount(refVal_setFollowingCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("monthly_views"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("monthly_views")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setMonthlyViews;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMonthlyViews);
            setMonthlyViews(refVal_setMonthlyViews);
        }
    }
    return ok;
}

void Account::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Account_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("account_type")), m_Account_type));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Profile_imageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("profile_image")), m_Profile_image));
    }
    if(m_Website_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("website_url")), m_Website_url));
    }
    if(m_UsernameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("username")), m_Username));
    }
    if(m_AboutIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("about")), m_About));
    }
    if(m_Business_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("business_name")), m_Business_name));
    }
    if(m_Board_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("board_count")), m_Board_count));
    }
    if(m_Pin_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pin_count")), m_Pin_count));
    }
    if(m_Follower_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("follower_count")), m_Follower_count));
    }
    if(m_Following_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("following_count")), m_Following_count));
    }
    if(m_Monthly_viewsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("monthly_views")), m_Monthly_views));
    }
}

bool Account::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("account_type"))))
    {
        utility::string_t refVal_setAccountType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("account_type"))), refVal_setAccountType );
        setAccountType(refVal_setAccountType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("profile_image"))))
    {
        utility::string_t refVal_setProfileImage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("profile_image"))), refVal_setProfileImage );
        setProfileImage(refVal_setProfileImage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("website_url"))))
    {
        utility::string_t refVal_setWebsiteUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("website_url"))), refVal_setWebsiteUrl );
        setWebsiteUrl(refVal_setWebsiteUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("username"))))
    {
        utility::string_t refVal_setUsername;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("username"))), refVal_setUsername );
        setUsername(refVal_setUsername);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("about"))))
    {
        utility::string_t refVal_setAbout;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("about"))), refVal_setAbout );
        setAbout(refVal_setAbout);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("business_name"))))
    {
        utility::string_t refVal_setBusinessName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("business_name"))), refVal_setBusinessName );
        setBusinessName(refVal_setBusinessName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("board_count"))))
    {
        int32_t refVal_setBoardCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("board_count"))), refVal_setBoardCount );
        setBoardCount(refVal_setBoardCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pin_count"))))
    {
        int32_t refVal_setPinCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pin_count"))), refVal_setPinCount );
        setPinCount(refVal_setPinCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("follower_count"))))
    {
        int32_t refVal_setFollowerCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("follower_count"))), refVal_setFollowerCount );
        setFollowerCount(refVal_setFollowerCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("following_count"))))
    {
        int32_t refVal_setFollowingCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("following_count"))), refVal_setFollowingCount );
        setFollowingCount(refVal_setFollowingCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("monthly_views"))))
    {
        int32_t refVal_setMonthlyViews;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("monthly_views"))), refVal_setMonthlyViews );
        setMonthlyViews(refVal_setMonthlyViews);
    }
    return ok;
}

utility::string_t Account::getAccountType() const
{
    return m_Account_type;
}

void Account::setAccountType(const utility::string_t& value)
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
utility::string_t Account::getId() const
{
    return m_Id;
}

void Account::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Account::idIsSet() const
{
    return m_IdIsSet;
}

void Account::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Account::getProfileImage() const
{
    return m_Profile_image;
}

void Account::setProfileImage(const utility::string_t& value)
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
utility::string_t Account::getWebsiteUrl() const
{
    return m_Website_url;
}

void Account::setWebsiteUrl(const utility::string_t& value)
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
utility::string_t Account::getUsername() const
{
    return m_Username;
}

void Account::setUsername(const utility::string_t& value)
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
utility::string_t Account::getAbout() const
{
    return m_About;
}

void Account::setAbout(const utility::string_t& value)
{
    m_About = value;
    m_AboutIsSet = true;
}

bool Account::aboutIsSet() const
{
    return m_AboutIsSet;
}

void Account::unsetAbout()
{
    m_AboutIsSet = false;
}
utility::string_t Account::getBusinessName() const
{
    return m_Business_name;
}

void Account::setBusinessName(const utility::string_t& value)
{
    m_Business_name = value;
    m_Business_nameIsSet = true;
}

bool Account::businessNameIsSet() const
{
    return m_Business_nameIsSet;
}

void Account::unsetBusiness_name()
{
    m_Business_nameIsSet = false;
}
int32_t Account::getBoardCount() const
{
    return m_Board_count;
}

void Account::setBoardCount(int32_t value)
{
    m_Board_count = value;
    m_Board_countIsSet = true;
}

bool Account::boardCountIsSet() const
{
    return m_Board_countIsSet;
}

void Account::unsetBoard_count()
{
    m_Board_countIsSet = false;
}
int32_t Account::getPinCount() const
{
    return m_Pin_count;
}

void Account::setPinCount(int32_t value)
{
    m_Pin_count = value;
    m_Pin_countIsSet = true;
}

bool Account::pinCountIsSet() const
{
    return m_Pin_countIsSet;
}

void Account::unsetPin_count()
{
    m_Pin_countIsSet = false;
}
int32_t Account::getFollowerCount() const
{
    return m_Follower_count;
}

void Account::setFollowerCount(int32_t value)
{
    m_Follower_count = value;
    m_Follower_countIsSet = true;
}

bool Account::followerCountIsSet() const
{
    return m_Follower_countIsSet;
}

void Account::unsetFollower_count()
{
    m_Follower_countIsSet = false;
}
int32_t Account::getFollowingCount() const
{
    return m_Following_count;
}

void Account::setFollowingCount(int32_t value)
{
    m_Following_count = value;
    m_Following_countIsSet = true;
}

bool Account::followingCountIsSet() const
{
    return m_Following_countIsSet;
}

void Account::unsetFollowing_count()
{
    m_Following_countIsSet = false;
}
int32_t Account::getMonthlyViews() const
{
    return m_Monthly_views;
}

void Account::setMonthlyViews(int32_t value)
{
    m_Monthly_views = value;
    m_Monthly_viewsIsSet = true;
}

bool Account::monthlyViewsIsSet() const
{
    return m_Monthly_viewsIsSet;
}

void Account::unsetMonthly_views()
{
    m_Monthly_viewsIsSet = false;
}
}
}
}
}


