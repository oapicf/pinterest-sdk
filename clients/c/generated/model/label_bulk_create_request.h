/*
 * label_bulk_create_request.h
 *
 * 
 */

#ifndef _label_bulk_create_request_H_
#define _label_bulk_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_bulk_create_request_t label_bulk_create_request_t;

#include "label_create_item.h"



typedef struct label_bulk_create_request_t {
    list_t *labels; //nonprimitive container
    char *parent_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_bulk_create_request_t;

__attribute__((deprecated)) label_bulk_create_request_t *label_bulk_create_request_create(
    list_t *labels,
    char *parent_id
);

void label_bulk_create_request_free(label_bulk_create_request_t *label_bulk_create_request);

label_bulk_create_request_t *label_bulk_create_request_parseFromJSON(cJSON *label_bulk_create_requestJSON);

cJSON *label_bulk_create_request_convertToJSON(label_bulk_create_request_t *label_bulk_create_request);

#endif /* _label_bulk_create_request_H_ */

