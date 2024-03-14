#ifndef _OauthManager_H_
#define _OauthManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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

/*! \brief Generate OAuth access token. *Synchronous*
 *
 * Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.
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
 * Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/getting-started/authentication/'>Authentication</a> for more.
 * \param grantType  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool oauthTokenAsync(char * accessToken,
	std::string grantType, 
	void(* handler)(OauthAccessTokenResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* OauthManager_H_ */
