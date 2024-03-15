/*
 * Account.h
 *
 * 
 */

#ifndef _Account_H_
#define _Account_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Account : public Object {
public:
	/*! \brief Constructor.
	 */
	Account();
	Account(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Account();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Type of account
	 */
	std::string getAccountType();

	/*! \brief Set Type of account
	 */
	void setAccountType(std::string  account_type);
	/*! \brief Get User account ID.
	 */
	std::string getId();

	/*! \brief Set User account ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getProfileImage();

	/*! \brief Set 
	 */
	void setProfileImage(std::string  profile_image);
	/*! \brief Get 
	 */
	std::string getWebsiteUrl();

	/*! \brief Set 
	 */
	void setWebsiteUrl(std::string  website_url);
	/*! \brief Get 
	 */
	std::string getUsername();

	/*! \brief Set 
	 */
	void setUsername(std::string  username);
	/*! \brief Get Profile about description.
	 */
	std::string getAbout();

	/*! \brief Set Profile about description.
	 */
	void setAbout(std::string  about);
	/*! \brief Get 
	 */
	std::string getBusinessName();

	/*! \brief Set 
	 */
	void setBusinessName(std::string  business_name);
	/*! \brief Get User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
	 */
	int getBoardCount();

	/*! \brief Set User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
	 */
	void setBoardCount(int  board_count);
	/*! \brief Get User account pin count. This includes both created and saved pins.
	 */
	int getPinCount();

	/*! \brief Set User account pin count. This includes both created and saved pins.
	 */
	void setPinCount(int  pin_count);
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
	/*! \brief Get User account monthly views.
	 */
	int getMonthlyViews();

	/*! \brief Set User account monthly views.
	 */
	void setMonthlyViews(int  monthly_views);

private:
	std::string account_type;
	std::string id;
	std::string profile_image;
	std::string website_url;
	std::string username;
	std::string about;
	std::string business_name;
	int board_count;
	int pin_count;
	int follower_count;
	int following_count;
	int monthly_views;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Account_H_ */
