/*
 * token_grant_type.h
 *
 * The type of OAuth grant being requested.
 */

#ifndef _token_grant_type_H_
#define _token_grant_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct token_grant_type_t token_grant_type_t;


// Enum  for token_grant_type

typedef enum { pinterest_rest_api_token_grant_type__NULL = 0, pinterest_rest_api_token_grant_type__authorization_code, pinterest_rest_api_token_grant_type__refresh_token, pinterest_rest_api_token_grant_type__client_credentials } pinterest_rest_api_token_grant_type__e;

char* token_grant_type_token_grant_type_ToString(pinterest_rest_api_token_grant_type__e token_grant_type);

pinterest_rest_api_token_grant_type__e token_grant_type_token_grant_type_FromString(char* token_grant_type);

cJSON *token_grant_type_convertToJSON(pinterest_rest_api_token_grant_type__e token_grant_type);

pinterest_rest_api_token_grant_type__e token_grant_type_parseFromJSON(cJSON *token_grant_typeJSON);

#endif /* _token_grant_type_H_ */

