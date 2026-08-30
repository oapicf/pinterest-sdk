#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_deletion_delete.h"



static asset_group_deletion_delete_t *asset_group_deletion_delete_create_internal(
    list_t *asset_groups_to_delete
    ) {
    asset_group_deletion_delete_t *asset_group_deletion_delete_local_var = malloc(sizeof(asset_group_deletion_delete_t));
    if (!asset_group_deletion_delete_local_var) {
        return NULL;
    }
    memset(asset_group_deletion_delete_local_var, 0, sizeof(asset_group_deletion_delete_t));
    asset_group_deletion_delete_local_var->_library_owned = 1;
    asset_group_deletion_delete_local_var->asset_groups_to_delete = asset_groups_to_delete;
    return asset_group_deletion_delete_local_var;
}

__attribute__((deprecated)) asset_group_deletion_delete_t *asset_group_deletion_delete_create(
    list_t *asset_groups_to_delete
    ) {
    asset_group_deletion_delete_t *result = asset_group_deletion_delete_create_internal (
        asset_groups_to_delete
        );
    if (!result) {
    }
    return result;
}

void asset_group_deletion_delete_free(asset_group_deletion_delete_t *asset_group_deletion_delete) {
    if(NULL == asset_group_deletion_delete){
        return ;
    }
    if(asset_group_deletion_delete->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_deletion_delete_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_deletion_delete->asset_groups_to_delete) {
        list_ForEach(listEntry, asset_group_deletion_delete->asset_groups_to_delete) {
            free(listEntry->data);
        }
        list_freeList(asset_group_deletion_delete->asset_groups_to_delete);
        asset_group_deletion_delete->asset_groups_to_delete = NULL;
    }
    free(asset_group_deletion_delete);
}

cJSON *asset_group_deletion_delete_convertToJSON(asset_group_deletion_delete_t *asset_group_deletion_delete) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_deletion_delete->asset_groups_to_delete
    if (!asset_group_deletion_delete->asset_groups_to_delete) {
        goto fail;
    }
    cJSON *asset_groups_to_delete = cJSON_AddArrayToObject(item, "asset_groups_to_delete");
    if(asset_groups_to_delete == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *asset_groups_to_deleteListEntry;
    list_ForEach(asset_groups_to_deleteListEntry, asset_group_deletion_delete->asset_groups_to_delete) {
    if(cJSON_AddStringToObject(asset_groups_to_delete, "", asset_groups_to_deleteListEntry->data) == NULL)
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

asset_group_deletion_delete_t *asset_group_deletion_delete_parseFromJSON(cJSON *asset_group_deletion_deleteJSON){

    asset_group_deletion_delete_t *asset_group_deletion_delete_local_var = NULL;

    // define the local list for asset_group_deletion_delete->asset_groups_to_delete
    list_t *asset_groups_to_deleteList = NULL;

    // asset_group_deletion_delete->asset_groups_to_delete
    cJSON *asset_groups_to_delete = cJSON_GetObjectItemCaseSensitive(asset_group_deletion_deleteJSON, "asset_groups_to_delete");
    if (cJSON_IsNull(asset_groups_to_delete)) {
        asset_groups_to_delete = NULL;
    }
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



    asset_group_deletion_delete_local_var = asset_group_deletion_delete_create_internal (
        asset_groups_to_deleteList
        );

    if (!asset_group_deletion_delete_local_var) {
        goto end;
    }

    return asset_group_deletion_delete_local_var;
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
