/*
 * oauth_access_token_request_client_credentials.h
 *
 * A request to receive a client token.
 */

#ifndef _oauth_access_token_request_client_credentials_H_
#define _oauth_access_token_request_client_credentials_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_request_client_credentials_t oauth_access_token_request_client_credentials_t;


// Enum GRANTTYPE for oauth_access_token_request_client_credentials

typedef enum  { pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_NULL = 0, pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_authorization_code, pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_refresh_token, pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_client_credentials } pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e;

char* oauth_access_token_request_client_credentials_grant_type_ToString(pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_type);

pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e oauth_access_token_request_client_credentials_grant_type_FromString(char* grant_type);



typedef struct oauth_access_token_request_client_credentials_t {
    pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_type; //enum
    char *scope; // string

} oauth_access_token_request_client_credentials_t;

oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_create(
    pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_e grant_type,
    char *scope
);

void oauth_access_token_request_client_credentials_free(oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials);

oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials_parseFromJSON(cJSON *oauth_access_token_request_client_credentialsJSON);

cJSON *oauth_access_token_request_client_credentials_convertToJSON(oauth_access_token_request_client_credentials_t *oauth_access_token_request_client_credentials);

#endif /* _oauth_access_token_request_client_credentials_H_ */

