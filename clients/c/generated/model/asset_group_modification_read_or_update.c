#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_modification_read_or_update.h"



static asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_create_internal(
    list_t *asset_groups_to_update,
    list_t *exceptions,
    list_t *updated_asset_groups
    ) {
    asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_local_var = malloc(sizeof(asset_group_modification_read_or_update_t));
    if (!asset_group_modification_read_or_update_local_var) {
        return NULL;
    }
    memset(asset_group_modification_read_or_update_local_var, 0, sizeof(asset_group_modification_read_or_update_t));
    asset_group_modification_read_or_update_local_var->_library_owned = 1;
    asset_group_modification_read_or_update_local_var->asset_groups_to_update = asset_groups_to_update;
    asset_group_modification_read_or_update_local_var->exceptions = exceptions;
    asset_group_modification_read_or_update_local_var->updated_asset_groups = updated_asset_groups;
    return asset_group_modification_read_or_update_local_var;
}

__attribute__((deprecated)) asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_create(
    list_t *asset_groups_to_update,
    list_t *exceptions,
    list_t *updated_asset_groups
    ) {
    asset_group_modification_read_or_update_t *result = asset_group_modification_read_or_update_create_internal (
        asset_groups_to_update,
        exceptions,
        updated_asset_groups
        );
    if (!result) {
    }
    return result;
}

void asset_group_modification_read_or_update_free(asset_group_modification_read_or_update_t *asset_group_modification_read_or_update) {
    if(NULL == asset_group_modification_read_or_update){
        return ;
    }
    if(asset_group_modification_read_or_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_modification_read_or_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_modification_read_or_update->asset_groups_to_update) {
        list_ForEach(listEntry, asset_group_modification_read_or_update->asset_groups_to_update) {
            asset_group_update_item_read_or_update_item_free(listEntry->data);
        }
        list_freeList(asset_group_modification_read_or_update->asset_groups_to_update);
        asset_group_modification_read_or_update->asset_groups_to_update = NULL;
    }
    if (asset_group_modification_read_or_update->exceptions) {
        list_ForEach(listEntry, asset_group_modification_read_or_update->exceptions) {
            asset_group_update_error_free(listEntry->data);
        }
        list_freeList(asset_group_modification_read_or_update->exceptions);
        asset_group_modification_read_or_update->exceptions = NULL;
    }
    if (asset_group_modification_read_or_update->updated_asset_groups) {
        list_ForEach(listEntry, asset_group_modification_read_or_update->updated_asset_groups) {
            asset_group_binding_free(listEntry->data);
        }
        list_freeList(asset_group_modification_read_or_update->updated_asset_groups);
        asset_group_modification_read_or_update->updated_asset_groups = NULL;
    }
    free(asset_group_modification_read_or_update);
}

cJSON *asset_group_modification_read_or_update_convertToJSON(asset_group_modification_read_or_update_t *asset_group_modification_read_or_update) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_modification_read_or_update->asset_groups_to_update
    if(asset_group_modification_read_or_update->asset_groups_to_update) {
    cJSON *asset_groups_to_update = cJSON_AddArrayToObject(item, "asset_groups_to_update");
    if(asset_groups_to_update == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *asset_groups_to_updateListEntry;
    if (asset_group_modification_read_or_update->asset_groups_to_update) {
    list_ForEach(asset_groups_to_updateListEntry, asset_group_modification_read_or_update->asset_groups_to_update) {
    cJSON *itemLocal = asset_group_update_item_read_or_update_item_convertToJSON(asset_groups_to_updateListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(asset_groups_to_update, itemLocal);
    }
    }
    }


    // asset_group_modification_read_or_update->exceptions
    if(asset_group_modification_read_or_update->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (asset_group_modification_read_or_update->exceptions) {
    list_ForEach(exceptionsListEntry, asset_group_modification_read_or_update->exceptions) {
    cJSON *itemLocal = asset_group_update_error_convertToJSON(exceptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(exceptions, itemLocal);
    }
    }
    }


    // asset_group_modification_read_or_update->updated_asset_groups
    if(asset_group_modification_read_or_update->updated_asset_groups) {
    cJSON *updated_asset_groups = cJSON_AddArrayToObject(item, "updated_asset_groups");
    if(updated_asset_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *updated_asset_groupsListEntry;
    if (asset_group_modification_read_or_update->updated_asset_groups) {
    list_ForEach(updated_asset_groupsListEntry, asset_group_modification_read_or_update->updated_asset_groups) {
    cJSON *itemLocal = asset_group_binding_convertToJSON(updated_asset_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(updated_asset_groups, itemLocal);
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

asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_parseFromJSON(cJSON *asset_group_modification_read_or_updateJSON){

    asset_group_modification_read_or_update_t *asset_group_modification_read_or_update_local_var = NULL;

    // define the local list for asset_group_modification_read_or_update->asset_groups_to_update
    list_t *asset_groups_to_updateList = NULL;

    // define the local list for asset_group_modification_read_or_update->exceptions
    list_t *exceptionsList = NULL;

    // define the local list for asset_group_modification_read_or_update->updated_asset_groups
    list_t *updated_asset_groupsList = NULL;

    // asset_group_modification_read_or_update->asset_groups_to_update
    cJSON *asset_groups_to_update = cJSON_GetObjectItemCaseSensitive(asset_group_modification_read_or_updateJSON, "asset_groups_to_update");
    if (cJSON_IsNull(asset_groups_to_update)) {
        asset_groups_to_update = NULL;
    }
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
        asset_group_update_item_read_or_update_item_t *asset_groups_to_updateItem = asset_group_update_item_read_or_update_item_parseFromJSON(asset_groups_to_update_local_nonprimitive);

        list_addElement(asset_groups_to_updateList, asset_groups_to_updateItem);
    }
    }

    // asset_group_modification_read_or_update->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(asset_group_modification_read_or_updateJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (exceptions) { 
    cJSON *exceptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(exceptions)){
        goto end; //nonprimitive container
    }

    exceptionsList = list_createList();

    cJSON_ArrayForEach(exceptions_local_nonprimitive,exceptions )
    {
        if(!cJSON_IsObject(exceptions_local_nonprimitive)){
            goto end;
        }
        asset_group_update_error_t *exceptionsItem = asset_group_update_error_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }

    // asset_group_modification_read_or_update->updated_asset_groups
    cJSON *updated_asset_groups = cJSON_GetObjectItemCaseSensitive(asset_group_modification_read_or_updateJSON, "updated_asset_groups");
    if (cJSON_IsNull(updated_asset_groups)) {
        updated_asset_groups = NULL;
    }
    if (updated_asset_groups) { 
    cJSON *updated_asset_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(updated_asset_groups)){
        goto end; //nonprimitive container
    }

    updated_asset_groupsList = list_createList();

    cJSON_ArrayForEach(updated_asset_groups_local_nonprimitive,updated_asset_groups )
    {
        if(!cJSON_IsObject(updated_asset_groups_local_nonprimitive)){
            goto end;
        }
        asset_group_binding_t *updated_asset_groupsItem = asset_group_binding_parseFromJSON(updated_asset_groups_local_nonprimitive);

        list_addElement(updated_asset_groupsList, updated_asset_groupsItem);
    }
    }



    asset_group_modification_read_or_update_local_var = asset_group_modification_read_or_update_create_internal (
        asset_groups_to_update ? asset_groups_to_updateList : NULL,
        exceptions ? exceptionsList : NULL,
        updated_asset_groups ? updated_asset_groupsList : NULL
        );

    if (!asset_group_modification_read_or_update_local_var) {
        goto end;
    }

    return asset_group_modification_read_or_update_local_var;
end:
    if (asset_groups_to_updateList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_groups_to_updateList) {
            asset_group_update_item_read_or_update_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(asset_groups_to_updateList);
        asset_groups_to_updateList = NULL;
    }
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            asset_group_update_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    if (updated_asset_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, updated_asset_groupsList) {
            asset_group_binding_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(updated_asset_groupsList);
        updated_asset_groupsList = NULL;
    }
    return NULL;

}
