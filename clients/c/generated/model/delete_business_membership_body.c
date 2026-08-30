#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_business_membership_body.h"



static delete_business_membership_body_t *delete_business_membership_body_create_internal(
    list_t *members
    ) {
    delete_business_membership_body_t *delete_business_membership_body_local_var = malloc(sizeof(delete_business_membership_body_t));
    if (!delete_business_membership_body_local_var) {
        return NULL;
    }
    memset(delete_business_membership_body_local_var, 0, sizeof(delete_business_membership_body_t));
    delete_business_membership_body_local_var->_library_owned = 1;
    delete_business_membership_body_local_var->members = members;
    return delete_business_membership_body_local_var;
}

__attribute__((deprecated)) delete_business_membership_body_t *delete_business_membership_body_create(
    list_t *members
    ) {
    delete_business_membership_body_t *result = delete_business_membership_body_create_internal (
        members
        );
    if (!result) {
    }
    return result;
}

void delete_business_membership_body_free(delete_business_membership_body_t *delete_business_membership_body) {
    if(NULL == delete_business_membership_body){
        return ;
    }
    if(delete_business_membership_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_business_membership_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_business_membership_body->members) {
        list_ForEach(listEntry, delete_business_membership_body->members) {
            delete_business_membership_member_free(listEntry->data);
        }
        list_freeList(delete_business_membership_body->members);
        delete_business_membership_body->members = NULL;
    }
    free(delete_business_membership_body);
}

cJSON *delete_business_membership_body_convertToJSON(delete_business_membership_body_t *delete_business_membership_body) {
    cJSON *item = cJSON_CreateObject();

    // delete_business_membership_body->members
    if (!delete_business_membership_body->members) {
        goto fail;
    }
    cJSON *members = cJSON_AddArrayToObject(item, "members");
    if(members == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *membersListEntry;
    if (delete_business_membership_body->members) {
    list_ForEach(membersListEntry, delete_business_membership_body->members) {
    cJSON *itemLocal = delete_business_membership_member_convertToJSON(membersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(members, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_business_membership_body_t *delete_business_membership_body_parseFromJSON(cJSON *delete_business_membership_bodyJSON){

    delete_business_membership_body_t *delete_business_membership_body_local_var = NULL;

    // define the local list for delete_business_membership_body->members
    list_t *membersList = NULL;

    // delete_business_membership_body->members
    cJSON *members = cJSON_GetObjectItemCaseSensitive(delete_business_membership_bodyJSON, "members");
    if (cJSON_IsNull(members)) {
        members = NULL;
    }
    if (!members) {
        goto end;
    }

    
    cJSON *members_local_nonprimitive = NULL;
    if(!cJSON_IsArray(members)){
        goto end; //nonprimitive container
    }

    membersList = list_createList();

    cJSON_ArrayForEach(members_local_nonprimitive,members )
    {
        if(!cJSON_IsObject(members_local_nonprimitive)){
            goto end;
        }
        delete_business_membership_member_t *membersItem = delete_business_membership_member_parseFromJSON(members_local_nonprimitive);

        list_addElement(membersList, membersItem);
    }



    delete_business_membership_body_local_var = delete_business_membership_body_create_internal (
        membersList
        );

    if (!delete_business_membership_body_local_var) {
        goto end;
    }

    return delete_business_membership_body_local_var;
end:
    if (membersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, membersList) {
            delete_business_membership_member_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(membersList);
        membersList = NULL;
    }
    return NULL;

}
