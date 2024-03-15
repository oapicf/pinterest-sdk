/*
 * interest.h
 *
 * 
 */

#ifndef _interest_H_
#define _interest_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct interest_t interest_t;




typedef struct interest_t {
    char *canonical_url; // string
    char *id; // string
    char *key; // string
    char *name; // string

} interest_t;

interest_t *interest_create(
    char *canonical_url,
    char *id,
    char *key,
    char *name
);

void interest_free(interest_t *interest);

interest_t *interest_parseFromJSON(cJSON *interestJSON);

cJSON *interest_convertToJSON(interest_t *interest);

#endif /* _interest_H_ */

