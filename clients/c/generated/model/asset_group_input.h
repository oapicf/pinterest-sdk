/*
 * asset_group_input.h
 *
 * 
 */

#ifndef _asset_group_input_H_
#define _asset_group_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_input_t asset_group_input_t;

#include "asset_group_binding.h"



typedef struct asset_group_input_t {
    struct asset_group_binding_t *asset_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_input_t;

__attribute__((deprecated)) asset_group_input_t *asset_group_input_create(
    asset_group_binding_t *asset_group
);

void asset_group_input_free(asset_group_input_t *asset_group_input);

asset_group_input_t *asset_group_input_parseFromJSON(cJSON *asset_group_inputJSON);

cJSON *asset_group_input_convertToJSON(asset_group_input_t *asset_group_input);

#endif /* _asset_group_input_H_ */

