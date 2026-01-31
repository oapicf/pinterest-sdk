/*
 * oauth_access_token_response_refresh.h
 *
 * A successful OAuth access token response for the refresh token flow.
 */

#ifndef _oauth_access_token_response_refresh_H_
#define _oauth_access_token_response_refresh_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_response_refresh_t oauth_access_token_response_refresh_t;


// Enum RESPONSETYPE for oauth_access_token_response_refresh

typedef enum  { pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_NULL = 0, pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_authorization_code, pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_refresh_token, pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_client_credentials } pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_e;

char* oauth_access_token_response_refresh_response_type_ToString(pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_e response_type);

pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_e oauth_access_token_response_refresh_response_type_FromString(char* response_type);



typedef struct oauth_access_token_response_refresh_t {
    char *access_token; // string
    int expires_in; //numeric
    pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_e response_type; //enum
    char *scope; // string
    char *token_type; // string
    char *refresh_token; // string
    int refresh_token_expires_at; //numeric
    int refresh_token_expires_in; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} oauth_access_token_response_refresh_t;

__attribute__((deprecated)) oauth_access_token_response_refresh_t *oauth_access_token_response_refresh_create(
    char *access_token,
    int expires_in,
    pinterest_rest_api_oauth_access_token_response_refresh_RESPONSETYPE_e response_type,
    char *scope,
    char *token_type,
    char *refresh_token,
    int refresh_token_expires_at,
    int refresh_token_expires_in
);

void oauth_access_token_response_refresh_free(oauth_access_token_response_refresh_t *oauth_access_token_response_refresh);

oauth_access_token_response_refresh_t *oauth_access_token_response_refresh_parseFromJSON(cJSON *oauth_access_token_response_refreshJSON);

cJSON *oauth_access_token_response_refresh_convertToJSON(oauth_access_token_response_refresh_t *oauth_access_token_response_refresh);

#endif /* _oauth_access_token_response_refresh_H_ */

