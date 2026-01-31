/*
 * oauth_access_token_response_code.h
 *
 * 
 */

#ifndef _oauth_access_token_response_code_H_
#define _oauth_access_token_response_code_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_response_code_t oauth_access_token_response_code_t;


// Enum RESPONSETYPE for oauth_access_token_response_code

typedef enum  { pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_NULL = 0, pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_authorization_code, pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_refresh_token, pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_client_credentials } pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e;

char* oauth_access_token_response_code_response_type_ToString(pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e response_type);

pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e oauth_access_token_response_code_response_type_FromString(char* response_type);



typedef struct oauth_access_token_response_code_t {
    char *refresh_token; // string
    int refresh_token_expires_at; //numeric
    int refresh_token_expires_in; //numeric
    char *access_token; // string
    int expires_in; //numeric
    pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e response_type; //enum
    char *scope; // string
    char *token_type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} oauth_access_token_response_code_t;

__attribute__((deprecated)) oauth_access_token_response_code_t *oauth_access_token_response_code_create(
    char *refresh_token,
    int refresh_token_expires_at,
    int refresh_token_expires_in,
    char *access_token,
    int expires_in,
    pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_e response_type,
    char *scope,
    char *token_type
);

void oauth_access_token_response_code_free(oauth_access_token_response_code_t *oauth_access_token_response_code);

oauth_access_token_response_code_t *oauth_access_token_response_code_parseFromJSON(cJSON *oauth_access_token_response_codeJSON);

cJSON *oauth_access_token_response_code_convertToJSON(oauth_access_token_response_code_t *oauth_access_token_response_code);

#endif /* _oauth_access_token_response_code_H_ */

