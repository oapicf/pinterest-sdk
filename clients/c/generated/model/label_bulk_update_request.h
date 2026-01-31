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


// Enum STATUS for label_bulk_update_request

typedef enum  { pinterest_rest_api_label_bulk_update_request_STATUS_NULL = 0, pinterest_rest_api_label_bulk_update_request_STATUS_ARCHIVED } pinterest_rest_api_label_bulk_update_request_STATUS_e;

char* label_bulk_update_request_status_ToString(pinterest_rest_api_label_bulk_update_request_STATUS_e status);

pinterest_rest_api_label_bulk_update_request_STATUS_e label_bulk_update_request_status_FromString(char* status);



typedef struct label_bulk_update_request_t {
    char *id; // string
    pinterest_rest_api_label_bulk_update_request_STATUS_e status; //enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_bulk_update_request_t;

__attribute__((deprecated)) label_bulk_update_request_t *label_bulk_update_request_create(
    char *id,
    pinterest_rest_api_label_bulk_update_request_STATUS_e status,
    char *value
);

void label_bulk_update_request_free(label_bulk_update_request_t *label_bulk_update_request);

label_bulk_update_request_t *label_bulk_update_request_parseFromJSON(cJSON *label_bulk_update_requestJSON);

cJSON *label_bulk_update_request_convertToJSON(label_bulk_update_request_t *label_bulk_update_request);

#endif /* _label_bulk_update_request_H_ */

