/*
 * label_update_request.h
 *
 * 
 */

#ifndef _label_update_request_H_
#define _label_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_update_request_t label_update_request_t;

#include "label_update_request_labels_inner.h"



typedef struct label_update_request_t {
    list_t *labels; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} label_update_request_t;

__attribute__((deprecated)) label_update_request_t *label_update_request_create(
    list_t *labels
);

void label_update_request_free(label_update_request_t *label_update_request);

label_update_request_t *label_update_request_parseFromJSON(cJSON *label_update_requestJSON);

cJSON *label_update_request_convertToJSON(label_update_request_t *label_update_request);

#endif /* _label_update_request_H_ */

