/*
 * oauth_access_token_response_everlasting_refresh.h
 *
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 */

#ifndef _oauth_access_token_response_everlasting_refresh_H_
#define _oauth_access_token_response_everlasting_refresh_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_response_everlasting_refresh_t oauth_access_token_response_everlasting_refresh_t;


// Enum RESPONSETYPE for oauth_access_token_response_everlasting_refresh

typedef enum  { pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_NULL = 0, pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_authorization_code, pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_refresh_token, pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_client_credentials } pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_e;

char* oauth_access_token_response_everlasting_refresh_response_type_ToString(pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_e response_type);

pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_e oauth_access_token_response_everlasting_refresh_response_type_FromString(char* response_type);



typedef struct oauth_access_token_response_everlasting_refresh_t {
    pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_e response_type; //enum
    char *access_token; // string
    char *token_type; // string
    int expires_in; //numeric
    char *scope; // string
    char *refresh_token; // string
    int refresh_token_expires_in; //numeric
    int refresh_token_expires_at; //numeric

} oauth_access_token_response_everlasting_refresh_t;

oauth_access_token_response_everlasting_refresh_t *oauth_access_token_response_everlasting_refresh_create(
    pinterest_rest_api_oauth_access_token_response_everlasting_refresh_RESPONSETYPE_e response_type,
    char *access_token,
    char *token_type,
    int expires_in,
    char *scope,
    char *refresh_token,
    int refresh_token_expires_in,
    int refresh_token_expires_at
);

void oauth_access_token_response_everlasting_refresh_free(oauth_access_token_response_everlasting_refresh_t *oauth_access_token_response_everlasting_refresh);

oauth_access_token_response_everlasting_refresh_t *oauth_access_token_response_everlasting_refresh_parseFromJSON(cJSON *oauth_access_token_response_everlasting_refreshJSON);

cJSON *oauth_access_token_response_everlasting_refresh_convertToJSON(oauth_access_token_response_everlasting_refresh_t *oauth_access_token_response_everlasting_refresh);

#endif /* _oauth_access_token_response_everlasting_refresh_H_ */

