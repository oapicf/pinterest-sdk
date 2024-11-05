/*
 * OauthAccessTokenResponseEverlastingRefresh.h
 *
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 */

#ifndef _OauthAccessTokenResponseEverlastingRefresh_H_
#define _OauthAccessTokenResponseEverlastingRefresh_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenResponseEverlastingRefresh : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenResponseEverlastingRefresh();
	OauthAccessTokenResponseEverlastingRefresh(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenResponseEverlastingRefresh();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getResponseType();

	/*! \brief Set 
	 */
	void setResponseType(std::string  response_type);
	/*! \brief Get 
	 */
	std::string getAccessToken();

	/*! \brief Set 
	 */
	void setAccessToken(std::string  access_token);
	/*! \brief Get 
	 */
	std::string getTokenType();

	/*! \brief Set 
	 */
	void setTokenType(std::string  token_type);
	/*! \brief Get 
	 */
	int getExpiresIn();

	/*! \brief Set 
	 */
	void setExpiresIn(int  expires_in);
	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);
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
	/*! \brief Get 
	 */
	int getRefreshTokenExpiresAt();

	/*! \brief Set 
	 */
	void setRefreshTokenExpiresAt(int  refresh_token_expires_at);

private:
	std::string response_type;
	std::string access_token;
	std::string token_type;
	int expires_in;
	std::string scope;
	std::string refresh_token;
	int refresh_token_expires_in;
	int refresh_token_expires_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenResponseEverlastingRefresh_H_ */
