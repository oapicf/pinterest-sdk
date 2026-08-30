/*
 * keywords_common.h
 *
 * 
 */

#ifndef _keywords_common_H_
#define _keywords_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_common_t keywords_common_t;

#include "match_type_response.h"



typedef struct keywords_common_t {
    int *bid; //numeric
    pinterest_rest_api_match_type_response__e match_type; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keywords_common_t;

__attribute__((deprecated)) keywords_common_t *keywords_common_create(
    int *bid,
    pinterest_rest_api_match_type_response__e match_type,
    char *value
);

void keywords_common_free(keywords_common_t *keywords_common);

keywords_common_t *keywords_common_parseFromJSON(cJSON *keywords_commonJSON);

cJSON *keywords_common_convertToJSON(keywords_common_t *keywords_common);

#endif /* _keywords_common_H_ */

