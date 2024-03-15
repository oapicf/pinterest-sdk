/*
 * keywords_response.h
 *
 * 
 */

#ifndef _keywords_response_H_
#define _keywords_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_response_t keywords_response_t;

#include "keyword.h"
#include "keyword_error.h"



typedef struct keywords_response_t {
    list_t *errors; //nonprimitive container
    list_t *keywords; //nonprimitive container

} keywords_response_t;

keywords_response_t *keywords_response_create(
    list_t *errors,
    list_t *keywords
);

void keywords_response_free(keywords_response_t *keywords_response);

keywords_response_t *keywords_response_parseFromJSON(cJSON *keywords_responseJSON);

cJSON *keywords_response_convertToJSON(keywords_response_t *keywords_response);

#endif /* _keywords_response_H_ */

