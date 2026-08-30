/*
 * asset_group_update_error.h
 *
 * 
 */

#ifndef _asset_group_update_error_H_
#define _asset_group_update_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_update_error_t asset_group_update_error_t;




typedef struct asset_group_update_error_t {
    char *asset_group_id; // string
    int *code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_update_error_t;

__attribute__((deprecated)) asset_group_update_error_t *asset_group_update_error_create(
    char *asset_group_id,
    int *code,
    char *message
);

void asset_group_update_error_free(asset_group_update_error_t *asset_group_update_error);

asset_group_update_error_t *asset_group_update_error_parseFromJSON(cJSON *asset_group_update_errorJSON);

cJSON *asset_group_update_error_convertToJSON(asset_group_update_error_t *asset_group_update_error);

#endif /* _asset_group_update_error_H_ */

