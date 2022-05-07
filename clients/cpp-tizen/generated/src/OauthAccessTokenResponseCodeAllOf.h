/*
 * OauthAccessTokenResponseCode_allOf.h
 *
 * 
 */

#ifndef _OauthAccessTokenResponseCode_allOf_H_
#define _OauthAccessTokenResponseCode_allOf_H_


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

class OauthAccessTokenResponseCode_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenResponseCode_allOf();
	OauthAccessTokenResponseCode_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenResponseCode_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getRefreshToken();

	/*! \brief Set 
	 */
	void setRefreshToken(std::string  refresh_token);
	/*! \brief Get 
	 */
	int getRefreshTokenExpiresIn();

	/*! \brief Set 
	 */
	void setRefreshTokenExpiresIn(int  refresh_token_expires_in);

private:
	std::string refresh_token;
	int refresh_token_expires_in;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenResponseCode_allOf_H_ */
