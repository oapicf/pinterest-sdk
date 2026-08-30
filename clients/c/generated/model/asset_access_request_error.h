/*
 * asset_access_request_error.h
 *
 * 
 */

#ifndef _asset_access_request_error_H_
#define _asset_access_request_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_access_request_error_t asset_access_request_error_t;




typedef struct asset_access_request_error_t {
    int *code; //numeric
    list_t *messages; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_access_request_error_t;

__attribute__((deprecated)) asset_access_request_error_t *asset_access_request_error_create(
    int *code,
    list_t *messages
);

void asset_access_request_error_free(asset_access_request_error_t *asset_access_request_error);

asset_access_request_error_t *asset_access_request_error_parseFromJSON(cJSON *asset_access_request_errorJSON);

cJSON *asset_access_request_error_convertToJSON(asset_access_request_error_t *asset_access_request_error);

#endif /* _asset_access_request_error_H_ */

