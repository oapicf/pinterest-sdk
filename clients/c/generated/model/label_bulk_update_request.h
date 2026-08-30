/*
 * label_bulk_update_request.h
 *
 * 
 */

#ifndef _label_bulk_update_request_H_
#define _label_bulk_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_bulk_update_request_t label_bulk_update_request_t;

#include "label_status_bulk_update.h"



typedef struct label_bulk_update_request_t {
    char *id; // string
    char *parent_id; // string
    pinterest_rest_api_label_status_bulk_update__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} label_bulk_update_request_t;

__attribute__((deprecated)) label_bulk_update_request_t *label_bulk_update_request_create(
    char *id,
    char *parent_id,
    pinterest_rest_api_label_status_bulk_update__e status
);

void label_bulk_update_request_free(label_bulk_update_request_t *label_bulk_update_request);

label_bulk_update_request_t *label_bulk_update_request_parseFromJSON(cJSON *label_bulk_update_requestJSON);

cJSON *label_bulk_update_request_convertToJSON(label_bulk_update_request_t *label_bulk_update_request);

#endif /* _label_bulk_update_request_H_ */

