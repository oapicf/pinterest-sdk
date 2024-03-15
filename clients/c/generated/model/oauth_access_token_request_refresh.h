/*
 * oauth_access_token_request_refresh.h
 *
 * A request to exchange a refresh token for a new access token.
 */

#ifndef _oauth_access_token_request_refresh_H_
#define _oauth_access_token_request_refresh_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_request_refresh_t oauth_access_token_request_refresh_t;

#include "oauth_access_token_request.h"

// Enum GRANTTYPE for oauth_access_token_request_refresh

typedef enum  { pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_NULL = 0, pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_authorization_code, pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_refresh_token } pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e;

char* oauth_access_token_request_refresh_grant_type_ToString(pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e grant_type);

pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e oauth_access_token_request_refresh_grant_type_FromString(char* grant_type);



typedef struct oauth_access_token_request_refresh_t {
    pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e grant_type; //enum
    char *refresh_token; // string
    char *scope; // string
    int refresh_on; //boolean

} oauth_access_token_request_refresh_t;

oauth_access_token_request_refresh_t *oauth_access_token_request_refresh_create(
    pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e grant_type,
    char *refresh_token,
    char *scope,
    int refresh_on
);

void oauth_access_token_request_refresh_free(oauth_access_token_request_refresh_t *oauth_access_token_request_refresh);

oauth_access_token_request_refresh_t *oauth_access_token_request_refresh_parseFromJSON(cJSON *oauth_access_token_request_refreshJSON);

cJSON *oauth_access_token_request_refresh_convertToJSON(oauth_access_token_request_refresh_t *oauth_access_token_request_refresh);

#endif /* _oauth_access_token_request_refresh_H_ */

