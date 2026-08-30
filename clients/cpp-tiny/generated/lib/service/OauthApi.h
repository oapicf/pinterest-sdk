#ifndef TINY_CPP_CLIENT_OauthApi_H_
#define TINY_CPP_CLIENT_OauthApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionAccessToken.h"
#include "OauthAccessToken.h"
#include "Pinterest.Lib.Error.h"
#include "TokenGrantType.h"
#include "TokenTypeHint.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class OauthApi : public Service {
public:
    OauthApi() = default;

    virtual ~OauthApi();

    /**
    * Generate OAuth access token for conversion API.
    *
    * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
    */
    Response<
                ConversionAccessToken
        >
    oauth_conversionToken(
    );
    /**
    * Generate OAuth access token.
    *
    * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
    * \param grantType  *Required*
    * \param code 
    * \param continuousRefresh   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
    * \param redirectUri 
    * \param refreshToken 
    * \param scope 
    */
    Response<
                OauthAccessToken
        >
    oauth_token(
            
            TokenGrantType grantType
            , 
            
            std::string code
            , 
            
            std::string continuousRefresh
            , 
            
            std::string redirectUri
            , 
            
            std::string refreshToken
            , 
            
            std::string scope
            
    );
    /**
    * Revoke a token.
    *
    * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
    * \param token The token to revoke. *Required*
    * \param tokenTypeHint The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
    */
    Response<
            String
        >
    token_revoke(
            
            std::string token
            , 
            
            TokenTypeHint tokenTypeHint
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_OauthApi_H_ */