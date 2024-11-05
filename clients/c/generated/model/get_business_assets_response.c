#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_business_assets_response.h"



get_business_assets_response_t *get_business_assets_response_create(
    char *asset_id,
    char *asset_type,
    asset_group_binding_t *asset_group_info
    ) {
    get_business_assets_response_t *get_business_assets_response_local_var = malloc(sizeof(get_business_assets_response_t));
    if (!get_business_assets_response_local_var) {
        return NULL;
    }
    get_business_assets_response_local_var->asset_id = asset_id;
    get_business_assets_response_local_var->asset_type = asset_type;
    get_business_assets_response_local_var->asset_group_info = asset_group_info;

    return get_business_assets_response_local_var;
}


void get_business_assets_response_free(get_business_assets_response_t *get_business_assets_response) {
    if(NULL == get_business_assets_response){
        return ;
    }
    listEntry_t *listEntry;
    if (get_business_assets_response->asset_id) {
        free(get_business_assets_response->asset_id);
        get_business_assets_response->asset_id = NULL;
    }
    if (get_business_assets_response->asset_type) {
        free(get_business_assets_response->asset_type);
        get_business_assets_response->asset_type = NULL;
    }
    if (get_business_assets_response->asset_group_info) {
        asset_group_binding_free(get_business_assets_response->asset_group_info);
        get_business_assets_response->asset_group_info = NULL;
    }
    free(get_business_assets_response);
}

cJSON *get_business_assets_response_convertToJSON(get_business_assets_response_t *get_business_assets_response) {
    cJSON *item = cJSON_CreateObject();

    // get_business_assets_response->asset_id
    if(get_business_assets_response->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", get_business_assets_response->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // get_business_assets_response->asset_type
    if(get_business_assets_response->asset_type) {
    if(cJSON_AddStringToObject(item, "asset_type", get_business_assets_response->asset_type) == NULL) {
    goto fail; //String
    }
    }


    // get_business_assets_response->asset_group_info
    if(get_business_assets_response->asset_group_info) {
    cJSON *asset_group_info_local_JSON = asset_group_binding_convertToJSON(get_business_assets_response->asset_group_info);
    if(asset_group_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asset_group_info", asset_group_info_local_JSON);
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

get_business_assets_response_t *get_business_assets_response_parseFromJSON(cJSON *get_business_assets_responseJSON){

    get_business_assets_response_t *get_business_assets_response_local_var = NULL;

    // define the local variable for get_business_assets_response->asset_group_info
    asset_group_binding_t *asset_group_info_local_nonprim = NULL;

    // get_business_assets_response->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(get_business_assets_responseJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // get_business_assets_response->asset_type
    cJSON *asset_type = cJSON_GetObjectItemCaseSensitive(get_business_assets_responseJSON, "asset_type");
    if (asset_type) { 
    if(!cJSON_IsString(asset_type) && !cJSON_IsNull(asset_type))
    {
    goto end; //String
    }
    }

    // get_business_assets_response->asset_group_info
    cJSON *asset_group_info = cJSON_GetObjectItemCaseSensitive(get_business_assets_responseJSON, "asset_group_info");
    if (asset_group_info) { 
    asset_group_info_local_nonprim = asset_group_binding_parseFromJSON(asset_group_info); //nonprimitive
    }


    get_business_assets_response_local_var = get_business_assets_response_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        asset_type && !cJSON_IsNull(asset_type) ? strdup(asset_type->valuestring) : NULL,
        asset_group_info ? asset_group_info_local_nonprim : NULL
        );

    return get_business_assets_response_local_var;
end:
    if (asset_group_info_local_nonprim) {
        asset_group_binding_free(asset_group_info_local_nonprim);
        asset_group_info_local_nonprim = NULL;
    }
    return NULL;

}
