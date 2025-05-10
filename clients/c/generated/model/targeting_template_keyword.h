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



typedef struct targeting_template_keyword_t {
    pinterest_rest_api_match_type__e match_type; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_keyword_t;

__attribute__((deprecated)) targeting_template_keyword_t *targeting_template_keyword_create(
    pinterest_rest_api_match_type__e match_type,
    char *value
);

void targeting_template_keyword_free(targeting_template_keyword_t *targeting_template_keyword);

targeting_template_keyword_t *targeting_template_keyword_parseFromJSON(cJSON *targeting_template_keywordJSON);

cJSON *targeting_template_keyword_convertToJSON(targeting_template_keyword_t *targeting_template_keyword);

#endif /* _targeting_template_keyword_H_ */

