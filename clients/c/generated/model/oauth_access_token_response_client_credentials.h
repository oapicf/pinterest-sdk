/*
 * oauth_access_token_response_client_credentials.h
 *
 * A successful OAuth client token response for the client token flow.
 */

#ifndef _oauth_access_token_response_client_credentials_H_
#define _oauth_access_token_response_client_credentials_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_response_client_credentials_t oauth_access_token_response_client_credentials_t;


// Enum RESPONSETYPE for oauth_access_token_response_client_credentials

typedef enum  { pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_NULL = 0, pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_authorization_code, pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_refresh_token, pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_client_credentials } pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e;

char* oauth_access_token_response_client_credentials_response_type_ToString(pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e response_type);

pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e oauth_access_token_response_client_credentials_response_type_FromString(char* response_type);



typedef struct oauth_access_token_response_client_credentials_t {
    pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e response_type; //enum
    char *access_token; // string
    char *token_type; // string
    int expires_in; //numeric
    char *scope; // string

} oauth_access_token_response_client_credentials_t;

oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials_create(
    pinterest_rest_api_oauth_access_token_response_client_credentials_RESPONSETYPE_e response_type,
    char *access_token,
    char *token_type,
    int expires_in,
    char *scope
);

void oauth_access_token_response_client_credentials_free(oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials);

oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials_parseFromJSON(cJSON *oauth_access_token_response_client_credentialsJSON);

cJSON *oauth_access_token_response_client_credentials_convertToJSON(oauth_access_token_response_client_credentials_t *oauth_access_token_response_client_credentials);

#endif /* _oauth_access_token_response_client_credentials_H_ */

