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

private:
	std::string account_type;
	std::string profile_image;
	std::string website_url;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Account_H_ */
