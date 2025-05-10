#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "deleted_members_response.h"



static deleted_members_response_t *deleted_members_response_create_internal(
    list_t *deleted_members
    ) {
    deleted_members_response_t *deleted_members_response_local_var = malloc(sizeof(deleted_members_response_t));
    if (!deleted_members_response_local_var) {
        return NULL;
    }
    deleted_members_response_local_var->deleted_members = deleted_members;

    deleted_members_response_local_var->_library_owned = 1;
    return deleted_members_response_local_var;
}

__attribute__((deprecated)) deleted_members_response_t *deleted_members_response_create(
    list_t *deleted_members
    ) {
    return deleted_members_response_create_internal (
        deleted_members
        );
}

void deleted_members_response_free(deleted_members_response_t *deleted_members_response) {
    if(NULL == deleted_members_response){
        return ;
    }
    if(deleted_members_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "deleted_members_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (deleted_members_response->deleted_members) {
        list_ForEach(listEntry, deleted_members_response->deleted_members) {
            free(listEntry->data);
        }
        list_freeList(deleted_members_response->deleted_members);
        deleted_members_response->deleted_members = NULL;
    }
    free(deleted_members_response);
}

cJSON *deleted_members_response_convertToJSON(deleted_members_response_t *deleted_members_response) {
    cJSON *item = cJSON_CreateObject();

    // deleted_members_response->deleted_members
    if(deleted_members_response->deleted_members) {
    cJSON *deleted_members = cJSON_AddArrayToObject(item, "deleted_members");
    if(deleted_members == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *deleted_membersListEntry;
    list_ForEach(deleted_membersListEntry, deleted_members_response->deleted_members) {
    if(cJSON_AddStringToObject(deleted_members, "", deleted_membersListEntry->data) == NULL)
    {
        goto fail;
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

deleted_members_response_t *deleted_members_response_parseFromJSON(cJSON *deleted_members_responseJSON){

    deleted_members_response_t *deleted_members_response_local_var = NULL;

    // define the local list for deleted_members_response->deleted_members
    list_t *deleted_membersList = NULL;

    // deleted_members_response->deleted_members
    cJSON *deleted_members = cJSON_GetObjectItemCaseSensitive(deleted_members_responseJSON, "deleted_members");
    if (cJSON_IsNull(deleted_members)) {
        deleted_members = NULL;
    }
    if (deleted_members) { 
    cJSON *deleted_members_local = NULL;
    if(!cJSON_IsArray(deleted_members)) {
        goto end;//primitive container
    }
    deleted_membersList = list_createList();

    cJSON_ArrayForEach(deleted_members_local, deleted_members)
    {
        if(!cJSON_IsString(deleted_members_local))
        {
            goto end;
        }
        list_addElement(deleted_membersList , strdup(deleted_members_local->valuestring));
    }
    }


    deleted_members_response_local_var = deleted_members_response_create_internal (
        deleted_members ? deleted_membersList : NULL
        );

    return deleted_members_response_local_var;
end:
    if (deleted_membersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, deleted_membersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(deleted_membersList);
        deleted_membersList = NULL;
    }
    return NULL;

}
