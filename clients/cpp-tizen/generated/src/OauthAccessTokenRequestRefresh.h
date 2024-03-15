/*
 * OauthAccessTokenRequestRefresh.h
 *
 * A request to exchange a refresh token for a new access token.
 */

#ifndef _OauthAccessTokenRequestRefresh_H_
#define _OauthAccessTokenRequestRefresh_H_


#include <string>
#include "OauthAccessTokenRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A request to exchange a refresh token for a new access token.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenRequestRefresh : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenRequestRefresh();
	OauthAccessTokenRequestRefresh(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenRequestRefresh();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getGrantType();

	/*! \brief Set 
	 */
	void setGrantType(std::string  grant_type);
	/*! \brief Get 
	 */
	std::string getRefreshToken();

	/*! \brief Set 
	 */
	void setRefreshToken(std::string  refresh_token);
	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);
	/*! \brief Get Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
	 */
	bool getRefreshOn();

	/*! \brief Set Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
	 */
	void setRefreshOn(bool  refresh_on);

private:
	std::string grant_type;
	std::string refresh_token;
	std::string scope;
	bool refresh_on;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenRequestRefresh_H_ */
