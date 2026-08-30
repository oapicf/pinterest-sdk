#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_member_asset_access_item.h"



static delete_member_asset_access_item_t *delete_member_asset_access_item_create_internal(
    char *asset_id,
    char *member_id
    ) {
    delete_member_asset_access_item_t *delete_member_asset_access_item_local_var = malloc(sizeof(delete_member_asset_access_item_t));
    if (!delete_member_asset_access_item_local_var) {
        return NULL;
    }
    memset(delete_member_asset_access_item_local_var, 0, sizeof(delete_member_asset_access_item_t));
    delete_member_asset_access_item_local_var->_library_owned = 1;
    delete_member_asset_access_item_local_var->asset_id = asset_id;
    delete_member_asset_access_item_local_var->member_id = member_id;
    return delete_member_asset_access_item_local_var;
}

__attribute__((deprecated)) delete_member_asset_access_item_t *delete_member_asset_access_item_create(
    char *asset_id,
    char *member_id
    ) {
    delete_member_asset_access_item_t *result = delete_member_asset_access_item_create_internal (
        asset_id,
        member_id
        );
    if (!result) {
    }
    return result;
}

void delete_member_asset_access_item_free(delete_member_asset_access_item_t *delete_member_asset_access_item) {
    if(NULL == delete_member_asset_access_item){
        return ;
    }
    if(delete_member_asset_access_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_member_asset_access_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_member_asset_access_item->asset_id) {
        free(delete_member_asset_access_item->asset_id);
        delete_member_asset_access_item->asset_id = NULL;
    }
    if (delete_member_asset_access_item->member_id) {
        free(delete_member_asset_access_item->member_id);
        delete_member_asset_access_item->member_id = NULL;
    }
    free(delete_member_asset_access_item);
}

cJSON *delete_member_asset_access_item_convertToJSON(delete_member_asset_access_item_t *delete_member_asset_access_item) {
    cJSON *item = cJSON_CreateObject();

    // delete_member_asset_access_item->asset_id
    if (!delete_member_asset_access_item->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", delete_member_asset_access_item->asset_id) == NULL) {
    goto fail; //String
    }


    // delete_member_asset_access_item->member_id
    if (!delete_member_asset_access_item->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", delete_member_asset_access_item->member_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_member_asset_access_item_t *delete_member_asset_access_item_parseFromJSON(cJSON *delete_member_asset_access_itemJSON){

    delete_member_asset_access_item_t *delete_member_asset_access_item_local_var = NULL;

    char *asset_id_local_str = NULL;

    char *member_id_local_str = NULL;

    // delete_member_asset_access_item->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(delete_member_asset_access_itemJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (!asset_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_id))
    {
    goto end; //String
    }

    // delete_member_asset_access_item->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(delete_member_asset_access_itemJSON, "member_id");
    if (cJSON_IsNull(member_id)) {
        member_id = NULL;
    }
    if (!member_id) {
        goto end;
    }

    
    if(!cJSON_IsString(member_id))
    {
    goto end; //String
    }


    if (asset_id && !cJSON_IsNull(asset_id)) asset_id_local_str = strdup(asset_id->valuestring);
    if (member_id && !cJSON_IsNull(member_id)) member_id_local_str = strdup(member_id->valuestring);

    delete_member_asset_access_item_local_var = delete_member_asset_access_item_create_internal (
        asset_id_local_str,
        member_id_local_str
        );

    if (!delete_member_asset_access_item_local_var) {
        goto end;
    }

    return delete_member_asset_access_item_local_var;
end:
    if (asset_id_local_str) {
        free(asset_id_local_str);
        asset_id_local_str = NULL;
    }
    if (member_id_local_str) {
        free(member_id_local_str);
        member_id_local_str = NULL;
    }
    return NULL;

}
