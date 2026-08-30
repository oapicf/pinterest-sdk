/*
 * OauthAccessToken.h
 *
 * Describes the valid schema for possible OAuth access token requests.
 */

#ifndef _OauthAccessToken_H_
#define _OauthAccessToken_H_


#include <string>
#include "TokenGrantType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes the valid schema for possible OAuth access token requests.
 *
 *  \ingroup Models
 *
 */

class OauthAccessToken : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessToken();
	OauthAccessToken(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessToken();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAccessToken();

	/*! \brief Set 
	 */
	void setAccessToken(std::string  access_token);
	/*! \brief Get 
	 */
	int getExpiresIn();

	/*! \brief Set 
	 */
	void setExpiresIn(int  expires_in);
	/*! \brief Get 
	 */
	std::string getRefreshToken();

	/*! \brief Set 
	 */
	void setRefreshToken(std::string  refresh_token);
	/*! \brief Get 
	 */
	int getRefreshTokenExpiresAt();

	/*! \brief Set 
	 */
	void setRefreshTokenExpiresAt(int  refresh_token_expires_at);
	/*! \brief Get 
	 */
	int getRefreshTokenExpiresIn();

	/*! \brief Set 
	 */
	void setRefreshTokenExpiresIn(int  refresh_token_expires_in);
	/*! \brief Get 
	 */
	TokenGrantType getResponseType();

	/*! \brief Set 
	 */
	void setResponseType(TokenGrantType  response_type);
	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);
	/*! \brief Get 
	 */
	std::string getTokenType();

	/*! \brief Set 
	 */
	void setTokenType(std::string  token_type);

private:
	std::string access_token;
	int expires_in;
	std::string refresh_token;
	int refresh_token_expires_at;
	int refresh_token_expires_in;
	TokenGrantType response_type;
	std::string scope;
	std::string token_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessToken_H_ */
