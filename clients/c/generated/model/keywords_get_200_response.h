/*
 * keywords_get_200_response.h
 *
 * 
 */

#ifndef _keywords_get_200_response_H_
#define _keywords_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_get_200_response_t keywords_get_200_response_t;

#include "keyword.h"



typedef struct keywords_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} keywords_get_200_response_t;

keywords_get_200_response_t *keywords_get_200_response_create(
    list_t *items,
    char *bookmark
);

void keywords_get_200_response_free(keywords_get_200_response_t *keywords_get_200_response);

keywords_get_200_response_t *keywords_get_200_response_parseFromJSON(cJSON *keywords_get_200_responseJSON);

cJSON *keywords_get_200_response_convertToJSON(keywords_get_200_response_t *keywords_get_200_response);

#endif /* _keywords_get_200_response_H_ */

