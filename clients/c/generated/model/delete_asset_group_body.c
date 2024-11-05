#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_asset_group_body.h"



delete_asset_group_body_t *delete_asset_group_body_create(
    list_t *asset_groups_to_delete
    ) {
    delete_asset_group_body_t *delete_asset_group_body_local_var = malloc(sizeof(delete_asset_group_body_t));
    if (!delete_asset_group_body_local_var) {
        return NULL;
    }
    delete_asset_group_body_local_var->asset_groups_to_delete = asset_groups_to_delete;

    return delete_asset_group_body_local_var;
}


void delete_asset_group_body_free(delete_asset_group_body_t *delete_asset_group_body) {
    if(NULL == delete_asset_group_body){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_asset_group_body->asset_groups_to_delete) {
        list_ForEach(listEntry, delete_asset_group_body->asset_groups_to_delete) {
            free(listEntry->data);
        }
        list_freeList(delete_asset_group_body->asset_groups_to_delete);
        delete_asset_group_body->asset_groups_to_delete = NULL;
    }
    free(delete_asset_group_body);
}

cJSON *delete_asset_group_body_convertToJSON(delete_asset_group_body_t *delete_asset_group_body) {
    cJSON *item = cJSON_CreateObject();

    // delete_asset_group_body->asset_groups_to_delete
    if (!delete_asset_group_body->asset_groups_to_delete) {
        goto fail;
    }
    cJSON *asset_groups_to_delete = cJSON_AddArrayToObject(item, "asset_groups_to_delete");
    if(asset_groups_to_delete == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *asset_groups_to_deleteListEntry;
    list_ForEach(asset_groups_to_deleteListEntry, delete_asset_group_body->asset_groups_to_delete) {
    if(cJSON_AddStringToObject(asset_groups_to_delete, "", (char*)asset_groups_to_deleteListEntry->data) == NULL)
    {
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

delete_asset_group_body_t *delete_asset_group_body_parseFromJSON(cJSON *delete_asset_group_bodyJSON){

    delete_asset_group_body_t *delete_asset_group_body_local_var = NULL;

    // define the local list for delete_asset_group_body->asset_groups_to_delete
    list_t *asset_groups_to_deleteList = NULL;

    // delete_asset_group_body->asset_groups_to_delete
    cJSON *asset_groups_to_delete = cJSON_GetObjectItemCaseSensitive(delete_asset_group_bodyJSON, "asset_groups_to_delete");
    if (!asset_groups_to_delete) {
        goto end;
    }

    
    cJSON *asset_groups_to_delete_local = NULL;
    if(!cJSON_IsArray(asset_groups_to_delete)) {
        goto end;//primitive container
    }
    asset_groups_to_deleteList = list_createList();

    cJSON_ArrayForEach(asset_groups_to_delete_local, asset_groups_to_delete)
    {
        if(!cJSON_IsString(asset_groups_to_delete_local))
        {
            goto end;
        }
        list_addElement(asset_groups_to_deleteList , strdup(asset_groups_to_delete_local->valuestring));
    }


    delete_asset_group_body_local_var = delete_asset_group_body_create (
        asset_groups_to_deleteList
        );

    return delete_asset_group_body_local_var;
end:
    if (asset_groups_to_deleteList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_groups_to_deleteList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_groups_to_deleteList);
        asset_groups_to_deleteList = NULL;
    }
    return NULL;

}
