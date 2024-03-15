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

// Enum  for keywords_common

typedef enum  { pinterest_rest_api_keywords_common__NULL = 0, pinterest_rest_api_keywords_common__BROAD, pinterest_rest_api_keywords_common__PHRASE, pinterest_rest_api_keywords_common__EXACT, pinterest_rest_api_keywords_common__EXACT_NEGATIVE, pinterest_rest_api_keywords_common__PHRASE_NEGATIVE, pinterest_rest_api_keywords_common__null } pinterest_rest_api_keywords_common__e;

char* keywords_common_match_type_ToString(pinterest_rest_api_keywords_common__e match_type);

pinterest_rest_api_keywords_common__e keywords_common_match_type_FromString(char* match_type);



typedef struct keywords_common_t {
    int bid; //numeric
    match_type_response_t *match_type; // custom
    char *value; // string

} keywords_common_t;

keywords_common_t *keywords_common_create(
    int bid,
    match_type_response_t *match_type,
    char *value
);

void keywords_common_free(keywords_common_t *keywords_common);

keywords_common_t *keywords_common_parseFromJSON(cJSON *keywords_commonJSON);

cJSON *keywords_common_convertToJSON(keywords_common_t *keywords_common);

#endif /* _keywords_common_H_ */

