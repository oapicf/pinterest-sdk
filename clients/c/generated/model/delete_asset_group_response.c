#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_asset_group_response.h"



delete_asset_group_response_t *delete_asset_group_response_create(
    list_t *deleted_asset_groups,
    list_t *exceptions
    ) {
    delete_asset_group_response_t *delete_asset_group_response_local_var = malloc(sizeof(delete_asset_group_response_t));
    if (!delete_asset_group_response_local_var) {
        return NULL;
    }
    delete_asset_group_response_local_var->deleted_asset_groups = deleted_asset_groups;
    delete_asset_group_response_local_var->exceptions = exceptions;

    return delete_asset_group_response_local_var;
}


void delete_asset_group_response_free(delete_asset_group_response_t *delete_asset_group_response) {
    if(NULL == delete_asset_group_response){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_asset_group_response->deleted_asset_groups) {
        list_ForEach(listEntry, delete_asset_group_response->deleted_asset_groups) {
            free(listEntry->data);
        }
        list_freeList(delete_asset_group_response->deleted_asset_groups);
        delete_asset_group_response->deleted_asset_groups = NULL;
    }
    if (delete_asset_group_response->exceptions) {
        list_ForEach(listEntry, delete_asset_group_response->exceptions) {
            delete_asset_group_response_exceptions_inner_free(listEntry->data);
        }
        list_freeList(delete_asset_group_response->exceptions);
        delete_asset_group_response->exceptions = NULL;
    }
    free(delete_asset_group_response);
}

cJSON *delete_asset_group_response_convertToJSON(delete_asset_group_response_t *delete_asset_group_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_asset_group_response->deleted_asset_groups
    if(delete_asset_group_response->deleted_asset_groups) {
    cJSON *deleted_asset_groups = cJSON_AddArrayToObject(item, "deleted_asset_groups");
    if(deleted_asset_groups == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *deleted_asset_groupsListEntry;
    list_ForEach(deleted_asset_groupsListEntry, delete_asset_group_response->deleted_asset_groups) {
    if(cJSON_AddStringToObject(deleted_asset_groups, "", (char*)deleted_asset_groupsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // delete_asset_group_response->exceptions
    if(delete_asset_group_response->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *exceptionsListEntry;
    if (delete_asset_group_response->exceptions) {
    list_ForEach(exceptionsListEntry, delete_asset_group_response->exceptions) {
    cJSON *itemLocal = delete_asset_group_response_exceptions_inner_convertToJSON(exceptionsListEntry->data);
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

delete_asset_group_response_t *delete_asset_group_response_parseFromJSON(cJSON *delete_asset_group_responseJSON){

    delete_asset_group_response_t *delete_asset_group_response_local_var = NULL;

    // define the local list for delete_asset_group_response->deleted_asset_groups
    list_t *deleted_asset_groupsList = NULL;

    // define the local list for delete_asset_group_response->exceptions
    list_t *exceptionsList = NULL;

    // delete_asset_group_response->deleted_asset_groups
    cJSON *deleted_asset_groups = cJSON_GetObjectItemCaseSensitive(delete_asset_group_responseJSON, "deleted_asset_groups");
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

    // delete_asset_group_response->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(delete_asset_group_responseJSON, "exceptions");
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
        delete_asset_group_response_exceptions_inner_t *exceptionsItem = delete_asset_group_response_exceptions_inner_parseFromJSON(exceptions_local_nonprimitive);

        list_addElement(exceptionsList, exceptionsItem);
    }
    }


    delete_asset_group_response_local_var = delete_asset_group_response_create (
        deleted_asset_groups ? deleted_asset_groupsList : NULL,
        exceptions ? exceptionsList : NULL
        );

    return delete_asset_group_response_local_var;
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
            delete_asset_group_response_exceptions_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    return NULL;

}
