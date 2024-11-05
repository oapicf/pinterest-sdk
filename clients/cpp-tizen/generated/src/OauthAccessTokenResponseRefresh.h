/*
 * OauthAccessTokenResponseRefresh.h
 *
 * A successful OAuth access token response for the refresh token flow.
 */

#ifndef _OauthAccessTokenResponseRefresh_H_
#define _OauthAccessTokenResponseRefresh_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A successful OAuth access token response for the refresh token flow.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenResponseRefresh : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenResponseRefresh();
	OauthAccessTokenResponseRefresh(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenResponseRefresh();

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

private:
	std::string response_type;
	std::string access_token;
	std::string token_type;
	int expires_in;
	std::string scope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenResponseRefresh_H_ */
