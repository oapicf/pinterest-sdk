#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_asset_group_response.h"



update_asset_group_response_t *update_asset_group_response_create(
    list_t *updated_asset_groups,
    list_t *exceptions
    ) {
    update_asset_group_response_t *update_asset_group_response_local_var = malloc(sizeof(update_asset_group_response_t));
    if (!update_asset_group_response_local_var) {
        return NULL;
    }
    update_asset_group_response_local_var->updated_asset_groups = updated_asset_groups;
    update_asset_group_response_local_var->exceptions = exceptions;

    return update_asset_group_response_local_var;
}


void update_asset_group_response_free(update_asset_group_response_t *update_asset_group_response) {
    if(NULL == update_asset_group_response){
        return ;
    }
    listEntry_t *listEntry;
    if (update_asset_group_response->updated_asset_groups) {
        list_ForEach(listEntry, update_asset_group_response->updated_asset_groups) {
            asset_group_binding_free(listEntry->data);
        }
        list_freeList(update_asset_group_response->updated_asset_groups);
        update_asset_group_response->updated_asset_groups = NULL;
    }
    if (update_asset_group_response->exceptions) {
        list_ForEach(listEntry, update_asset_group_response->exceptions) {
            update_asset_group_response_exceptions_inner_free(listEntry->data);
        }
        list_freeList(update_asset_group_response->exceptions);
        update_asset_group_response->exceptions = NULL;
    }
    free(update_asset_group_response);
}

cJSON *update_asset_group_response_convertToJSON(update_asset_group_response_t *update_asset_group_response) {
    cJSON *item = cJSON_CreateObject();

    // update_asset_group_response->updated_asset_groups
    if(update_asset_group_response->updated_asset_groups) {
    cJSON *updated_asset_groups = cJSON_AddArrayToObject(item, "updated_asset_groups");
    if(updated_asset_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *updated_asset_groupsListEntry;
    if (update_asset_group_response->updated_asset_groups) {
    list_ForEach(updated_asset_groupsListEntry, update_asset_group_response->updated_asset_groups) {
    cJSON *itemLocal = asset_group_binding_convertToJSON(updated_asset_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(updated_asset_groups, itemLocal);
    }
    }
    }


    // update_asset_group_response->exceptions
    if(update_asset_group_response->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (update_asset_group_response->exceptions) {
    list_ForEach(exceptionsListEntry, update_asset_group_response->exceptions) {
    cJSON *itemLocal = update_asset_group_response_exceptions_inner_convertToJSON(exceptionsListEntry->data);
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

update_asset_group_response_t *update_asset_group_response_parseFromJSON(cJSON *update_asset_group_responseJSON){

    update_asset_group_response_t *update_asset_group_response_local_var = NULL;

    // define the local list for update_asset_group_response->updated_asset_groups
    list_t *updated_asset_groupsList = NULL;

    // define the local list for update_asset_group_response->exceptions
    list_t *exceptionsList = NULL;

    // update_asset_group_response->updated_asset_groups
    cJSON *updated_asset_groups = cJSON_GetObjectItemCaseSensitive(update_asset_group_responseJSON, "updated_asset_groups");
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

    // update_asset_group_response->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(update_asset_group_responseJSON, "exceptions");
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
        update_asset_group_response_exceptions_inner_t *exceptionsItem = update_asset_group_response_exceptions_inner_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }


    update_asset_group_response_local_var = update_asset_group_response_create (
        updated_asset_groups ? updated_asset_groupsList : NULL,
        exceptions ? exceptionsList : NULL
        );

    return update_asset_group_response_local_var;
end:
    if (updated_asset_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, updated_asset_groupsList) {
            asset_group_binding_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(updated_asset_groupsList);
        updated_asset_groupsList = NULL;
    }
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            update_asset_group_response_exceptions_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    return NULL;

}
