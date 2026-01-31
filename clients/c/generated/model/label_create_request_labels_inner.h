/*
 * label_create_request_labels_inner.h
 *
 * 
 */

#ifndef _label_create_request_labels_inner_H_
#define _label_create_request_labels_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_create_request_labels_inner_t label_create_request_labels_inner_t;

#include "label_type.h"



typedef struct label_create_request_labels_inner_t {
    pinterest_rest_api_label_type__e label_type; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_create_request_labels_inner_t;

__attribute__((deprecated)) label_create_request_labels_inner_t *label_create_request_labels_inner_create(
    pinterest_rest_api_label_type__e label_type,
    char *value
);

void label_create_request_labels_inner_free(label_create_request_labels_inner_t *label_create_request_labels_inner);

label_create_request_labels_inner_t *label_create_request_labels_inner_parseFromJSON(cJSON *label_create_request_labels_innerJSON);

cJSON *label_create_request_labels_inner_convertToJSON(label_create_request_labels_inner_t *label_create_request_labels_inner);

#endif /* _label_create_request_labels_inner_H_ */

