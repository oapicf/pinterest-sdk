#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_input.h"



static asset_group_input_t *asset_group_input_create_internal(
    asset_group_binding_t *asset_group
    ) {
    asset_group_input_t *asset_group_input_local_var = malloc(sizeof(asset_group_input_t));
    if (!asset_group_input_local_var) {
        return NULL;
    }
    memset(asset_group_input_local_var, 0, sizeof(asset_group_input_t));
    asset_group_input_local_var->_library_owned = 1;
    asset_group_input_local_var->asset_group = asset_group;
    return asset_group_input_local_var;
}

__attribute__((deprecated)) asset_group_input_t *asset_group_input_create(
    asset_group_binding_t *asset_group
    ) {
    asset_group_input_t *result = asset_group_input_create_internal (
        asset_group
        );
    if (!result) {
    }
    return result;
}

void asset_group_input_free(asset_group_input_t *asset_group_input) {
    if(NULL == asset_group_input){
        return ;
    }
    if(asset_group_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_input_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_input->asset_group) {
        asset_group_binding_free(asset_group_input->asset_group);
        asset_group_input->asset_group = NULL;
    }
    free(asset_group_input);
}

cJSON *asset_group_input_convertToJSON(asset_group_input_t *asset_group_input) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_input->asset_group
    if(asset_group_input->asset_group) {
    cJSON *asset_group_local_JSON = asset_group_binding_convertToJSON(asset_group_input->asset_group);
    if(asset_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_group", asset_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

asset_group_input_t *asset_group_input_parseFromJSON(cJSON *asset_group_inputJSON){

    asset_group_input_t *asset_group_input_local_var = NULL;

    // define the local variable for asset_group_input->asset_group
    asset_group_binding_t *asset_group_local_nonprim = NULL;

    // asset_group_input->asset_group
    cJSON *asset_group = cJSON_GetObjectItemCaseSensitive(asset_group_inputJSON, "asset_group");
    if (cJSON_IsNull(asset_group)) {
        asset_group = NULL;
    }
    if (asset_group) { 
    asset_group_local_nonprim = asset_group_binding_parseFromJSON(asset_group); //nonprimitive
    }



    asset_group_input_local_var = asset_group_input_create_internal (
        asset_group ? asset_group_local_nonprim : NULL
        );

    if (!asset_group_input_local_var) {
        goto end;
    }

    return asset_group_input_local_var;
end:
    if (asset_group_local_nonprim) {
        asset_group_binding_free(asset_group_local_nonprim);
        asset_group_local_nonprim = NULL;
    }
    return NULL;

}
