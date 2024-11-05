#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_group_response.h"



create_asset_group_response_t *create_asset_group_response_create(
    asset_group_binding_t *asset_group
    ) {
    create_asset_group_response_t *create_asset_group_response_local_var = malloc(sizeof(create_asset_group_response_t));
    if (!create_asset_group_response_local_var) {
        return NULL;
    }
    create_asset_group_response_local_var->asset_group = asset_group;

    return create_asset_group_response_local_var;
}


void create_asset_group_response_free(create_asset_group_response_t *create_asset_group_response) {
    if(NULL == create_asset_group_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_group_response->asset_group) {
        asset_group_binding_free(create_asset_group_response->asset_group);
        create_asset_group_response->asset_group = NULL;
    }
    free(create_asset_group_response);
}

cJSON *create_asset_group_response_convertToJSON(create_asset_group_response_t *create_asset_group_response) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_group_response->asset_group
    if(create_asset_group_response->asset_group) {
    cJSON *asset_group_local_JSON = asset_group_binding_convertToJSON(create_asset_group_response->asset_group);
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

create_asset_group_response_t *create_asset_group_response_parseFromJSON(cJSON *create_asset_group_responseJSON){

    create_asset_group_response_t *create_asset_group_response_local_var = NULL;

    // define the local variable for create_asset_group_response->asset_group
    asset_group_binding_t *asset_group_local_nonprim = NULL;

    // create_asset_group_response->asset_group
    cJSON *asset_group = cJSON_GetObjectItemCaseSensitive(create_asset_group_responseJSON, "asset_group");
    if (asset_group) { 
    asset_group_local_nonprim = asset_group_binding_parseFromJSON(asset_group); //nonprimitive
    }


    create_asset_group_response_local_var = create_asset_group_response_create (
        asset_group ? asset_group_local_nonprim : NULL
        );

    return create_asset_group_response_local_var;
end:
    if (asset_group_local_nonprim) {
        asset_group_binding_free(asset_group_local_nonprim);
        asset_group_local_nonprim = NULL;
    }
    return NULL;

}
