#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_access_token_response.h"
#include "../model/error.h"
#include "../model/oauth_access_token_response.h"

// Enum GRANTTYPE for OauthAPI_oauthToken
typedef enum  { pinterest_rest_api_oauthToken_GRANTTYPE_NULL = 0, pinterest_rest_api_oauthToken_GRANTTYPE_authorization_code, pinterest_rest_api_oauthToken_GRANTTYPE_refresh_token, pinterest_rest_api_oauthToken_GRANTTYPE_client_credentials } pinterest_rest_api_oauthToken_grant_type_e;

// Enum TOKENTYPEHINT for OauthAPI_tokenRevoke
typedef enum  { pinterest_rest_api_tokenRevoke_TOKENTYPEHINT_NULL = 0, pinterest_rest_api_tokenRevoke_TOKENTYPEHINT_access_token, pinterest_rest_api_tokenRevoke_TOKENTYPEHINT_refresh_token } pinterest_rest_api_tokenRevoke_token_type_hint_e;


// Generate OAuth access token for conversion API
//
// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
//
conversion_access_token_response_t*
OauthAPI_oauthConversionToken(apiClient_t *apiClient);


// Generate OAuth access token
//
// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
//
oauth_access_token_response_t*
OauthAPI_oauthToken(apiClient_t *apiClient, pinterest_rest_api_oauthToken_grant_type_e grant_type);


// Revoke a token
//
// Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
//
void
OauthAPI_tokenRevoke(apiClient_t *apiClient, char *token, pinterest_rest_api_tokenRevoke_token_type_hint_e token_type_hint);


