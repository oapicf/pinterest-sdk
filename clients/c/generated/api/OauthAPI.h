#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/oauth_access_token_response.h"

// Enum GRANTTYPE for OauthAPI_oauthToken
typedef enum  { pinterest_rest_api_oauthToken_GRANTTYPE_NULL = 0, pinterest_rest_api_oauthToken_GRANTTYPE_authorization_code, pinterest_rest_api_oauthToken_GRANTTYPE_refresh_token, pinterest_rest_api_oauthToken_GRANTTYPE_client_credentials } pinterest_rest_api_oauthToken_grant_type_e;


// Generate OAuth access token
//
// Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>
//
oauth_access_token_response_t*
OauthAPI_oauthToken(apiClient_t *apiClient, pinterest_rest_api_oauthToken_grant_type_e grant_type);


