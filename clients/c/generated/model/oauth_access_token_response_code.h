/*
 * oauth_access_token_response_code.h
 *
 * A successful OAuth access token response for the authorization code flow.
 */

#ifndef _oauth_access_token_response_code_H_
#define _oauth_access_token_response_code_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_response_code_t oauth_access_token_response_code_t;

#include "oauth_access_token_response.h"

// Enum RESPONSETYPE for oauth_access_token_response_code

typedef enum  { pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_NULL = 0, pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_authorization_code, pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_refresh_token } pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e;

char* oauth_access_token_response_code_response_type_ToString(pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e response_type);

pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e oauth_access_token_response_code_response_type_FromString(char* response_type);



typedef struct oauth_access_token_response_code_t {
    pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e response_type; //enum
    char *access_token; // string
    char *token_type; // string
    int expires_in; //numeric
    char *scope; // string
    char *refresh_token; // string
    int refresh_token_expires_in; //numeric

} oauth_access_token_response_code_t;

oauth_access_token_response_code_t *oauth_access_token_response_code_create(
    pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e response_type,
    char *access_token,
    char *token_type,
    int expires_in,
    char *scope,
    char *refresh_token,
    int refresh_token_expires_in
);

void oauth_access_token_response_code_free(oauth_access_token_response_code_t *oauth_access_token_response_code);

oauth_access_token_response_code_t *oauth_access_token_response_code_parseFromJSON(cJSON *oauth_access_token_response_codeJSON);

cJSON *oauth_access_token_response_code_convertToJSON(oauth_access_token_response_code_t *oauth_access_token_response_code);

#endif /* _oauth_access_token_response_code_H_ */

