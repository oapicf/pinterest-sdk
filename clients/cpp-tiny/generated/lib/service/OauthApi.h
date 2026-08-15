#ifndef TINY_CPP_CLIENT_OauthApi_H_
#define TINY_CPP_CLIENT_OauthApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionAccessTokenResponse.h"
#include "Error.h"
#include "OauthAccessTokenResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class OauthApi : public Service {
public:
    OauthApi() = default;

    virtual ~OauthApi() = default;

    /**
    * Generate OAuth access token for conversion API.
    *
    * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
    */
    Response<
                ConversionAccessTokenResponse
        >
    oauth_conversionToken(
    );
    /**
    * Generate OAuth access token.
    *
    * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
    * \param grantType  *Required*
    */
    Response<
                OauthAccessTokenResponse
        >
    oauth_token(
            
            std::string grantType
            
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
            
            std::string tokenTypeHint
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_OauthApi_H_ */