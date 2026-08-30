/*
 * label_create_request.h
 *
 * 
 */

#ifndef _label_create_request_H_
#define _label_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_create_request_t label_create_request_t;

#include "label_create_item.h"



typedef struct label_create_request_t {
    list_t *labels; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} label_create_request_t;

__attribute__((deprecated)) label_create_request_t *label_create_request_create(
    list_t *labels
);

void label_create_request_free(label_create_request_t *label_create_request);

label_create_request_t *label_create_request_parseFromJSON(cJSON *label_create_requestJSON);

cJSON *label_create_request_convertToJSON(label_create_request_t *label_create_request);

#endif /* _label_create_request_H_ */

