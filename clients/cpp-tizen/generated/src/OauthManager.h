#ifndef _OauthManager_H_
#define _OauthManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ConversionAccessTokenResponse.h"
#include "Error.h"
#include "OauthAccessTokenResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Oauth Oauth
 * \ingroup Operations
 *  @{
 */
class OauthManager {
public:
	OauthManager();
	virtual ~OauthManager();

/*! \brief Generate OAuth access token for conversion API. *Synchronous*
 *
 * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool oauthConversionTokenSync(char * accessToken,
	
	void(* handler)(ConversionAccessTokenResponse, Error, void* )
	, void* userData);

/*! \brief Generate OAuth access token for conversion API. *Asynchronous*
 *
 * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool oauthConversionTokenAsync(char * accessToken,
	
	void(* handler)(ConversionAccessTokenResponse, Error, void* )
	, void* userData);


/*! \brief Generate OAuth access token. *Synchronous*
 *
 * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
 * \param grantType  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool oauthTokenSync(char * accessToken,
	std::string grantType, 
	void(* handler)(OauthAccessTokenResponse, Error, void* )
	, void* userData);

/*! \brief Generate OAuth access token. *Asynchronous*
 *
 * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
 * \param grantType  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool oauthTokenAsync(char * accessToken,
	std::string grantType, 
	void(* handler)(OauthAccessTokenResponse, Error, void* )
	, void* userData);


/*! \brief Revoke a token. *Synchronous*
 *
 * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
 * \param token The token to revoke. *Required*
 * \param tokenTypeHint The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool tokenRevokeSync(char * accessToken,
	std::string token, std::string tokenTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Revoke a token. *Asynchronous*
 *
 * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
 * \param token The token to revoke. *Required*
 * \param tokenTypeHint The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool tokenRevokeAsync(char * accessToken,
	std::string token, std::string tokenTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* OauthManager_H_ */
