#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_access_token.h"
#include "../model/oauth_access_token.h"
#include "../model/pinterest_lib_error.h"
#include "../model/token_grant_type.h"
#include "../model/token_type_hint.h"

// Enum  for OauthAPI_oauthToken
typedef enum  { pinterest_rest_api_oauthToken__NULL = 0, pinterest_rest_api_oauthToken__authorization_code, pinterest_rest_api_oauthToken__refresh_token, pinterest_rest_api_oauthToken__client_credentials } pinterest_rest_api_oauthToken_grant_type_e;


// Generate OAuth access token for conversion API
//
// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
//
conversion_access_token_t*
OauthAPI_oauthConversionToken(apiClient_t *apiClient);


// Generate OAuth access token
//
// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
//
oauth_access_token_t*
OauthAPI_oauthToken(apiClient_t *apiClient, token_grant_type_e grant_type, char *code, char *continuous_refresh, char *redirect_uri, char *refresh_token, char *scope);


// Revoke a token
//
// Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
//
void
OauthAPI_tokenRevoke(apiClient_t *apiClient, char *token, token_type_hint);


