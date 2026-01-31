/*
 * label_update_request_labels_inner.h
 *
 * 
 */

#ifndef _label_update_request_labels_inner_H_
#define _label_update_request_labels_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_update_request_labels_inner_t label_update_request_labels_inner_t;

#include "label_status.h"



typedef struct label_update_request_labels_inner_t {
    char *id; // string
    pinterest_rest_api_label_status__e status; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_update_request_labels_inner_t;

__attribute__((deprecated)) label_update_request_labels_inner_t *label_update_request_labels_inner_create(
    char *id,
    pinterest_rest_api_label_status__e status,
    char *value
);

void label_update_request_labels_inner_free(label_update_request_labels_inner_t *label_update_request_labels_inner);

label_update_request_labels_inner_t *label_update_request_labels_inner_parseFromJSON(cJSON *label_update_request_labels_innerJSON);

cJSON *label_update_request_labels_inner_convertToJSON(label_update_request_labels_inner_t *label_update_request_labels_inner);

#endif /* _label_update_request_labels_inner_H_ */

