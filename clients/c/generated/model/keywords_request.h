/*
 * keywords_request.h
 *
 * 
 */

#ifndef _keywords_request_H_
#define _keywords_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_request_t keywords_request_t;

#include "keywords_common.h"



typedef struct keywords_request_t {
    list_t *keywords; //nonprimitive container
    char *parent_id; // string

} keywords_request_t;

keywords_request_t *keywords_request_create(
    list_t *keywords,
    char *parent_id
);

void keywords_request_free(keywords_request_t *keywords_request);

keywords_request_t *keywords_request_parseFromJSON(cJSON *keywords_requestJSON);

cJSON *keywords_request_convertToJSON(keywords_request_t *keywords_request);

#endif /* _keywords_request_H_ */

