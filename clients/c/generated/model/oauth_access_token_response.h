/*
 * oauth_access_token_response.h
 *
 * A successful OAuth access token response.
 */

#ifndef _oauth_access_token_response_H_
#define _oauth_access_token_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_response_t oauth_access_token_response_t;


// Enum RESPONSETYPE for oauth_access_token_response

typedef enum  { pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_NULL = 0, pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_authorization_code, pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_refresh_token, pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_client_credentials } pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e;

char* oauth_access_token_response_response_type_ToString(pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_type);

pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e oauth_access_token_response_response_type_FromString(char* response_type);



typedef struct oauth_access_token_response_t {
    char *access_token; // string
    int expires_in; //numeric
    pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_type; //enum
    char *scope; // string
    char *token_type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} oauth_access_token_response_t;

__attribute__((deprecated)) oauth_access_token_response_t *oauth_access_token_response_create(
    char *access_token,
    int expires_in,
    pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_e response_type,
    char *scope,
    char *token_type
);

void oauth_access_token_response_free(oauth_access_token_response_t *oauth_access_token_response);

oauth_access_token_response_t *oauth_access_token_response_parseFromJSON(cJSON *oauth_access_token_responseJSON);

cJSON *oauth_access_token_response_convertToJSON(oauth_access_token_response_t *oauth_access_token_response);

#endif /* _oauth_access_token_response_H_ */

