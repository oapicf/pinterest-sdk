/*
 * labels_response.h
 *
 * 
 */

#ifndef _labels_response_H_
#define _labels_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct labels_response_t labels_response_t;

#include "label.h"
#include "label_error.h"



typedef struct labels_response_t {
    list_t *errors; //nonprimitive container
    list_t *labels; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} labels_response_t;

__attribute__((deprecated)) labels_response_t *labels_response_create(
    list_t *errors,
    list_t *labels
);

void labels_response_free(labels_response_t *labels_response);

labels_response_t *labels_response_parseFromJSON(cJSON *labels_responseJSON);

cJSON *labels_response_convertToJSON(labels_response_t *labels_response);

#endif /* _labels_response_H_ */

