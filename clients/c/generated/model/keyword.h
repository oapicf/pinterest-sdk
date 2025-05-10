/*
 * keyword.h
 *
 * 
 */

#ifndef _keyword_H_
#define _keyword_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_t keyword_t;

#include "match_type_response.h"



typedef struct keyword_t {
    int bid; //numeric
    pinterest_rest_api_match_type_response__e match_type; //referenced enum
    char *value; // string
    int archived; //boolean
    char *id; // string
    char *parent_id; // string
    char *parent_type; // string
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_t;

__attribute__((deprecated)) keyword_t *keyword_create(
    int bid,
    pinterest_rest_api_match_type_response__e match_type,
    char *value,
    int archived,
    char *id,
    char *parent_id,
    char *parent_type,
    char *type
);

void keyword_free(keyword_t *keyword);

keyword_t *keyword_parseFromJSON(cJSON *keywordJSON);

cJSON *keyword_convertToJSON(keyword_t *keyword);

#endif /* _keyword_H_ */

