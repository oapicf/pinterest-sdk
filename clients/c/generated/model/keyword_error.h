/*
 * keyword_error.h
 *
 * 
 */

#ifndef _keyword_error_H_
#define _keyword_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_error_t keyword_error_t;

#include "keyword.h"



typedef struct keyword_error_t {
    struct keyword_t *data; //model
    list_t *error_messages; //primitive container

} keyword_error_t;

keyword_error_t *keyword_error_create(
    keyword_t *data,
    list_t *error_messages
);

void keyword_error_free(keyword_error_t *keyword_error);

keyword_error_t *keyword_error_parseFromJSON(cJSON *keyword_errorJSON);

cJSON *keyword_error_convertToJSON(keyword_error_t *keyword_error);

#endif /* _keyword_error_H_ */

