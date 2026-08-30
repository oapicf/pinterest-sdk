/*
 * token_type_hint.h
 *
 * The type of token to revoke.
 */

#ifndef _token_type_hint_H_
#define _token_type_hint_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct token_type_hint_t token_type_hint_t;


// Enum  for token_type_hint

typedef enum { pinterest_rest_api_token_type_hint__NULL = 0, pinterest_rest_api_token_type_hint__access_token, pinterest_rest_api_token_type_hint__refresh_token } pinterest_rest_api_token_type_hint__e;

char* token_type_hint_token_type_hint_ToString(pinterest_rest_api_token_type_hint__e token_type_hint);

pinterest_rest_api_token_type_hint__e token_type_hint_token_type_hint_FromString(char* token_type_hint);

cJSON *token_type_hint_convertToJSON(pinterest_rest_api_token_type_hint__e token_type_hint);

pinterest_rest_api_token_type_hint__e token_type_hint_parseFromJSON(cJSON *token_type_hintJSON);

#endif /* _token_type_hint_H_ */

