
/*
 * Account.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Account_H_
#define TINY_CPP_CLIENT_Account_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Account{
public:

    /*! \brief Constructor.
	 */
    Account();
    Account(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Account();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Profile about description.
	 */
	std::string getAbout();

	/*! \brief Set Profile about description.
	 */
	void setAbout(std::string  about);
	/*! \brief Get Type of account
	 */
	std::string getAccountType();

	/*! \brief Set Type of account
	 */
	void setAccountType(std::string  account_type);
	/*! \brief Get User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
	 */
	int getBoardCount();

	/*! \brief Set User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
	 */
	void setBoardCount(int  board_count);
	/*! \brief Get 
	 */
	std::string getBusinessName();

	/*! \brief Set 
	 */
	void setBusinessName(std::string  business_name);
	/*! \brief Get User account follower count.
	 */
	int getFollowerCount();

	/*! \brief Set User account follower count.
	 */
	void setFollowerCount(int  follower_count);
	/*! \brief Get User account following count.
	 */
	int getFollowingCount();

	/*! \brief Set User account following count.
	 */
	void setFollowingCount(int  following_count);
	/*! \brief Get User account ID.
	 */
	std::string getId();

	/*! \brief Set User account ID.
	 */
	void setId(std::string  id);
	/*! \brief Get User account monthly views.
	 */
	int getMonthlyViews();

	/*! \brief Set User account monthly views.
	 */
	void setMonthlyViews(int  monthly_views);
	/*! \brief Get User account pin count. This includes both created and saved pins.
	 */
	int getPinCount();

	/*! \brief Set User account pin count. This includes both created and saved pins.
	 */
	void setPinCount(int  pin_count);
	/*! \brief Get 
	 */
	std::string getProfileImage();

	/*! \brief Set 
	 */
	void setProfileImage(std::string  profile_image);
	/*! \brief Get 
	 */
	std::string getUsername();

	/*! \brief Set 
	 */
	void setUsername(std::string  username);
	/*! \brief Get 
	 */
	std::string getWebsiteUrl();

	/*! \brief Set 
	 */
	void setWebsiteUrl(std::string  website_url);


    private:
    std::string about{};
    std::string account_type{};
    int board_count{};
    std::string business_name{};
    int follower_count{};
    int following_count{};
    std::string id{};
    int monthly_views{};
    int pin_count{};
    std::string profile_image{};
    std::string username{};
    std::string website_url{};
};
}

#endif /* TINY_CPP_CLIENT_Account_H_ */
