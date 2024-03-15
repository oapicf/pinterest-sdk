/*
 * oauth_access_token_request_code.h
 *
 * A request to exchange an authorization code for an access token.
 */

#ifndef _oauth_access_token_request_code_H_
#define _oauth_access_token_request_code_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_request_code_t oauth_access_token_request_code_t;

#include "oauth_access_token_request.h"

// Enum GRANTTYPE for oauth_access_token_request_code

typedef enum  { pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_NULL = 0, pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_authorization_code, pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_refresh_token } pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e;

char* oauth_access_token_request_code_grant_type_ToString(pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e grant_type);

pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e oauth_access_token_request_code_grant_type_FromString(char* grant_type);



typedef struct oauth_access_token_request_code_t {
    pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e grant_type; //enum
    char *code; // string
    char *redirect_uri; // string

} oauth_access_token_request_code_t;

oauth_access_token_request_code_t *oauth_access_token_request_code_create(
    pinterest_rest_api_oauth_access_token_request_code_GRANTTYPE_e grant_type,
    char *code,
    char *redirect_uri
);

void oauth_access_token_request_code_free(oauth_access_token_request_code_t *oauth_access_token_request_code);

oauth_access_token_request_code_t *oauth_access_token_request_code_parseFromJSON(cJSON *oauth_access_token_request_codeJSON);

cJSON *oauth_access_token_request_code_convertToJSON(oauth_access_token_request_code_t *oauth_access_token_request_code);

#endif /* _oauth_access_token_request_code_H_ */

