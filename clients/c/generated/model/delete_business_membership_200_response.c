#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_business_membership_200_response.h"



static delete_business_membership_200_response_t *delete_business_membership_200_response_create_internal(
    list_t *deleted_members
    ) {
    delete_business_membership_200_response_t *delete_business_membership_200_response_local_var = malloc(sizeof(delete_business_membership_200_response_t));
    if (!delete_business_membership_200_response_local_var) {
        return NULL;
    }
    memset(delete_business_membership_200_response_local_var, 0, sizeof(delete_business_membership_200_response_t));
    delete_business_membership_200_response_local_var->_library_owned = 1;
    delete_business_membership_200_response_local_var->deleted_members = deleted_members;
    return delete_business_membership_200_response_local_var;
}

__attribute__((deprecated)) delete_business_membership_200_response_t *delete_business_membership_200_response_create(
    list_t *deleted_members
    ) {
    delete_business_membership_200_response_t *result = delete_business_membership_200_response_create_internal (
        deleted_members
        );
    if (!result) {
    }
    return result;
}

void delete_business_membership_200_response_free(delete_business_membership_200_response_t *delete_business_membership_200_response) {
    if(NULL == delete_business_membership_200_response){
        return ;
    }
    if(delete_business_membership_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_business_membership_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_business_membership_200_response->deleted_members) {
        list_ForEach(listEntry, delete_business_membership_200_response->deleted_members) {
            free(listEntry->data);
        }
        list_freeList(delete_business_membership_200_response->deleted_members);
        delete_business_membership_200_response->deleted_members = NULL;
    }
    free(delete_business_membership_200_response);
}

cJSON *delete_business_membership_200_response_convertToJSON(delete_business_membership_200_response_t *delete_business_membership_200_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_business_membership_200_response->deleted_members
    if(delete_business_membership_200_response->deleted_members) {
    cJSON *deleted_members = cJSON_AddArrayToObject(item, "deleted_members");
    if(deleted_members == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *deleted_membersListEntry;
    list_ForEach(deleted_membersListEntry, delete_business_membership_200_response->deleted_members) {
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

delete_business_membership_200_response_t *delete_business_membership_200_response_parseFromJSON(cJSON *delete_business_membership_200_responseJSON){

    delete_business_membership_200_response_t *delete_business_membership_200_response_local_var = NULL;

    // define the local list for delete_business_membership_200_response->deleted_members
    list_t *deleted_membersList = NULL;

    // delete_business_membership_200_response->deleted_members
    cJSON *deleted_members = cJSON_GetObjectItemCaseSensitive(delete_business_membership_200_responseJSON, "deleted_members");
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



    delete_business_membership_200_response_local_var = delete_business_membership_200_response_create_internal (
        deleted_members ? deleted_membersList : NULL
        );

    if (!delete_business_membership_200_response_local_var) {
        goto end;
    }

    return delete_business_membership_200_response_local_var;
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
