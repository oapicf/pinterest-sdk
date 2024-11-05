/*
 * targeting_template_keyword.h
 *
 * 
 */

#ifndef _targeting_template_keyword_H_
#define _targeting_template_keyword_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_keyword_t targeting_template_keyword_t;

#include "match_type.h"

// Enum  for targeting_template_keyword

typedef enum  { pinterest_rest_api_targeting_template_keyword__NULL = 0, pinterest_rest_api_targeting_template_keyword__BROAD, pinterest_rest_api_targeting_template_keyword__PHRASE, pinterest_rest_api_targeting_template_keyword__EXACT, pinterest_rest_api_targeting_template_keyword__EXACT_NEGATIVE, pinterest_rest_api_targeting_template_keyword__PHRASE_NEGATIVE } pinterest_rest_api_targeting_template_keyword__e;

char* targeting_template_keyword_match_type_ToString(pinterest_rest_api_targeting_template_keyword__e match_type);

pinterest_rest_api_targeting_template_keyword__e targeting_template_keyword_match_type_FromString(char* match_type);



typedef struct targeting_template_keyword_t {
    match_type_t *match_type; // custom
    char *value; // string

} targeting_template_keyword_t;

targeting_template_keyword_t *targeting_template_keyword_create(
    match_type_t *match_type,
    char *value
);

void targeting_template_keyword_free(targeting_template_keyword_t *targeting_template_keyword);

targeting_template_keyword_t *targeting_template_keyword_parseFromJSON(cJSON *targeting_template_keywordJSON);

cJSON *targeting_template_keyword_convertToJSON(targeting_template_keyword_t *targeting_template_keyword);

#endif /* _targeting_template_keyword_H_ */

