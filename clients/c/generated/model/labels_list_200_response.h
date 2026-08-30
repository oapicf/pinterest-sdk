/*
 * labels_list_200_response.h
 *
 * 
 */

#ifndef _labels_list_200_response_H_
#define _labels_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct labels_list_200_response_t labels_list_200_response_t;

#include "label.h"



typedef struct labels_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} labels_list_200_response_t;

__attribute__((deprecated)) labels_list_200_response_t *labels_list_200_response_create(
    char *bookmark,
    list_t *items
);

void labels_list_200_response_free(labels_list_200_response_t *labels_list_200_response);

labels_list_200_response_t *labels_list_200_response_parseFromJSON(cJSON *labels_list_200_responseJSON);

cJSON *labels_list_200_response_convertToJSON(labels_list_200_response_t *labels_list_200_response);

#endif /* _labels_list_200_response_H_ */

