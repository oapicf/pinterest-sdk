/*
 * oauth_access_token.h
 *
 * Describes the valid schema for possible OAuth access token requests.
 */

#ifndef _oauth_access_token_H_
#define _oauth_access_token_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct oauth_access_token_t oauth_access_token_t;

#include "token_grant_type.h"



typedef struct oauth_access_token_t {
    char *access_token; // string
    int *expires_in; //numeric
    char *refresh_token; // string
    int *refresh_token_expires_at; //numeric
    int *refresh_token_expires_in; //numeric
    token_grant_type_t *response_type; // custom
    char *scope; // string
    char *token_type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} oauth_access_token_t;

__attribute__((deprecated)) oauth_access_token_t *oauth_access_token_create(
    char *access_token,
    int *expires_in,
    char *refresh_token,
    int *refresh_token_expires_at,
    int *refresh_token_expires_in,
    token_grant_type_t *response_type,
    char *scope,
    char *token_type
);

void oauth_access_token_free(oauth_access_token_t *oauth_access_token);

oauth_access_token_t *oauth_access_token_parseFromJSON(cJSON *oauth_access_tokenJSON);

cJSON *oauth_access_token_convertToJSON(oauth_access_token_t *oauth_access_token);

#endif /* _oauth_access_token_H_ */

