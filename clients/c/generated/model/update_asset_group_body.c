#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_asset_group_body.h"



update_asset_group_body_t *update_asset_group_body_create(
    list_t *asset_groups_to_update
    ) {
    update_asset_group_body_t *update_asset_group_body_local_var = malloc(sizeof(update_asset_group_body_t));
    if (!update_asset_group_body_local_var) {
        return NULL;
    }
    update_asset_group_body_local_var->asset_groups_to_update = asset_groups_to_update;

    return update_asset_group_body_local_var;
}


void update_asset_group_body_free(update_asset_group_body_t *update_asset_group_body) {
    if(NULL == update_asset_group_body){
        return ;
    }
    listEntry_t *listEntry;
    if (update_asset_group_body->asset_groups_to_update) {
        list_ForEach(listEntry, update_asset_group_body->asset_groups_to_update) {
            update_asset_group_body_asset_groups_to_update_inner_free(listEntry->data);
        }
        list_freeList(update_asset_group_body->asset_groups_to_update);
        update_asset_group_body->asset_groups_to_update = NULL;
    }
    free(update_asset_group_body);
}

cJSON *update_asset_group_body_convertToJSON(update_asset_group_body_t *update_asset_group_body) {
    cJSON *item = cJSON_CreateObject();

    // update_asset_group_body->asset_groups_to_update
    if(update_asset_group_body->asset_groups_to_update) {
    cJSON *asset_groups_to_update = cJSON_AddArrayToObject(item, "asset_groups_to_update");
    if(asset_groups_to_update == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_groups_to_updateListEntry;
    if (update_asset_group_body->asset_groups_to_update) {
    list_ForEach(asset_groups_to_updateListEntry, update_asset_group_body->asset_groups_to_update) {
    cJSON *itemLocal = update_asset_group_body_asset_groups_to_update_inner_convertToJSON(asset_groups_to_updateListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(asset_groups_to_update, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_asset_group_body_t *update_asset_group_body_parseFromJSON(cJSON *update_asset_group_bodyJSON){

    update_asset_group_body_t *update_asset_group_body_local_var = NULL;

    // define the local list for update_asset_group_body->asset_groups_to_update
    list_t *asset_groups_to_updateList = NULL;

    // update_asset_group_body->asset_groups_to_update
    cJSON *asset_groups_to_update = cJSON_GetObjectItemCaseSensitive(update_asset_group_bodyJSON, "asset_groups_to_update");
    if (asset_groups_to_update) { 
    cJSON *asset_groups_to_update_local_nonprimitive = NULL;
    if(!cJSON_IsArray(asset_groups_to_update)){
        goto end; //nonprimitive container
    }

    asset_groups_to_updateList = list_createList();

    cJSON_ArrayForEach(asset_groups_to_update_local_nonprimitive,asset_groups_to_update )
    {
        if(!cJSON_IsObject(asset_groups_to_update_local_nonprimitive)){
            goto end;
        }
        update_asset_group_body_asset_groups_to_update_inner_t *asset_groups_to_updateItem = update_asset_group_body_asset_groups_to_update_inner_parseFromJSON(asset_groups_to_update_local_nonprimitive);

        list_addElement(asset_groups_to_updateList, asset_groups_to_updateItem);
    }
    }


    update_asset_group_body_local_var = update_asset_group_body_create (
        asset_groups_to_update ? asset_groups_to_updateList : NULL
        );

    return update_asset_group_body_local_var;
end:
    if (asset_groups_to_updateList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_groups_to_updateList) {
            update_asset_group_body_asset_groups_to_update_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_groups_to_updateList);
        asset_groups_to_updateList = NULL;
    }
    return NULL;

}
