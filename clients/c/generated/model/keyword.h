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

// Enum  for keyword

typedef enum  { pinterest_rest_api_keyword__NULL = 0, pinterest_rest_api_keyword__BROAD, pinterest_rest_api_keyword__PHRASE, pinterest_rest_api_keyword__EXACT, pinterest_rest_api_keyword__EXACT_NEGATIVE, pinterest_rest_api_keyword__PHRASE_NEGATIVE, pinterest_rest_api_keyword__null } pinterest_rest_api_keyword__e;

char* keyword_match_type_ToString(pinterest_rest_api_keyword__e match_type);

pinterest_rest_api_keyword__e keyword_match_type_FromString(char* match_type);



typedef struct keyword_t {
    int archived; //boolean
    char *id; // string
    char *parent_id; // string
    char *parent_type; // string
    char *type; // string
    int bid; //numeric
    match_type_response_t *match_type; // custom
    char *value; // string

} keyword_t;

keyword_t *keyword_create(
    int archived,
    char *id,
    char *parent_id,
    char *parent_type,
    char *type,
    int bid,
    match_type_response_t *match_type,
    char *value
);

void keyword_free(keyword_t *keyword);

keyword_t *keyword_parseFromJSON(cJSON *keywordJSON);

cJSON *keyword_convertToJSON(keyword_t *keyword);

#endif /* _keyword_H_ */

