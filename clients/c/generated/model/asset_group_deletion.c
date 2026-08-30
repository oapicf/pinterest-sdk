#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "asset_group_deletion.h"



static asset_group_deletion_t *asset_group_deletion_create_internal(
    list_t *deleted_asset_groups,
    list_t *exceptions
    ) {
    asset_group_deletion_t *asset_group_deletion_local_var = malloc(sizeof(asset_group_deletion_t));
    if (!asset_group_deletion_local_var) {
        return NULL;
    }
    memset(asset_group_deletion_local_var, 0, sizeof(asset_group_deletion_t));
    asset_group_deletion_local_var->_library_owned = 1;
    asset_group_deletion_local_var->deleted_asset_groups = deleted_asset_groups;
    asset_group_deletion_local_var->exceptions = exceptions;
    return asset_group_deletion_local_var;
}

__attribute__((deprecated)) asset_group_deletion_t *asset_group_deletion_create(
    list_t *deleted_asset_groups,
    list_t *exceptions
    ) {
    asset_group_deletion_t *result = asset_group_deletion_create_internal (
        deleted_asset_groups,
        exceptions
        );
    if (!result) {
    }
    return result;
}

void asset_group_deletion_free(asset_group_deletion_t *asset_group_deletion) {
    if(NULL == asset_group_deletion){
        return ;
    }
    if(asset_group_deletion->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "asset_group_deletion_free");
        return ;
    }
    listEntry_t *listEntry;
    if (asset_group_deletion->deleted_asset_groups) {
        list_ForEach(listEntry, asset_group_deletion->deleted_asset_groups) {
            free(listEntry->data);
        }
        list_freeList(asset_group_deletion->deleted_asset_groups);
        asset_group_deletion->deleted_asset_groups = NULL;
    }
    if (asset_group_deletion->exceptions) {
        list_ForEach(listEntry, asset_group_deletion->exceptions) {
            asset_group_delete_error_free(listEntry->data);
        }
        list_freeList(asset_group_deletion->exceptions);
        asset_group_deletion->exceptions = NULL;
    }
    free(asset_group_deletion);
}

cJSON *asset_group_deletion_convertToJSON(asset_group_deletion_t *asset_group_deletion) {
    cJSON *item = cJSON_CreateObject();

    // asset_group_deletion->deleted_asset_groups
    if(asset_group_deletion->deleted_asset_groups) {
    cJSON *deleted_asset_groups = cJSON_AddArrayToObject(item, "deleted_asset_groups");
    if(deleted_asset_groups == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *deleted_asset_groupsListEntry;
    list_ForEach(deleted_asset_groupsListEntry, asset_group_deletion->deleted_asset_groups) {
    if(cJSON_AddStringToObject(deleted_asset_groups, "", deleted_asset_groupsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // asset_group_deletion->exceptions
    if(asset_group_deletion->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (asset_group_deletion->exceptions) {
    list_ForEach(exceptionsListEntry, asset_group_deletion->exceptions) {
    cJSON *itemLocal = asset_group_delete_error_convertToJSON(exceptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(exceptions, itemLocal);
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

asset_group_deletion_t *asset_group_deletion_parseFromJSON(cJSON *asset_group_deletionJSON){

    asset_group_deletion_t *asset_group_deletion_local_var = NULL;

    // define the local list for asset_group_deletion->deleted_asset_groups
    list_t *deleted_asset_groupsList = NULL;

    // define the local list for asset_group_deletion->exceptions
    list_t *exceptionsList = NULL;

    // asset_group_deletion->deleted_asset_groups
    cJSON *deleted_asset_groups = cJSON_GetObjectItemCaseSensitive(asset_group_deletionJSON, "deleted_asset_groups");
    if (cJSON_IsNull(deleted_asset_groups)) {
        deleted_asset_groups = NULL;
    }
    if (deleted_asset_groups) { 
    cJSON *deleted_asset_groups_local = NULL;
    if(!cJSON_IsArray(deleted_asset_groups)) {
        goto end;//primitive container
    }
    deleted_asset_groupsList = list_createList();

    cJSON_ArrayForEach(deleted_asset_groups_local, deleted_asset_groups)
    {
        if(!cJSON_IsString(deleted_asset_groups_local))
        {
            goto end;
        }
        list_addElement(deleted_asset_groupsList , strdup(deleted_asset_groups_local->valuestring));
    }
    }

    // asset_group_deletion->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(asset_group_deletionJSON, "exceptions");
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
        asset_group_delete_error_t *exceptionsItem = asset_group_delete_error_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }



    asset_group_deletion_local_var = asset_group_deletion_create_internal (
        deleted_asset_groups ? deleted_asset_groupsList : NULL,
        exceptions ? exceptionsList : NULL
        );

    if (!asset_group_deletion_local_var) {
        goto end;
    }

    return asset_group_deletion_local_var;
end:
    if (deleted_asset_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, deleted_asset_groupsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(deleted_asset_groupsList);
        deleted_asset_groupsList = NULL;
    }
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            asset_group_delete_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    return NULL;

}
