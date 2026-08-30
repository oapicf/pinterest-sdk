/*
 * conversion_access_token.h
 *
 * A successful conversion access token response.
 */

#ifndef _conversion_access_token_H_
#define _conversion_access_token_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_access_token_t conversion_access_token_t;




typedef struct conversion_access_token_t {
    char *access_token; // string
    char *token_type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_access_token_t;

__attribute__((deprecated)) conversion_access_token_t *conversion_access_token_create(
    char *access_token,
    char *token_type
);

void conversion_access_token_free(conversion_access_token_t *conversion_access_token);

conversion_access_token_t *conversion_access_token_parseFromJSON(cJSON *conversion_access_tokenJSON);

cJSON *conversion_access_token_convertToJSON(conversion_access_token_t *conversion_access_token);

#endif /* _conversion_access_token_H_ */

