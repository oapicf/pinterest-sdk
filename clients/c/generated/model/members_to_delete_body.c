#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "members_to_delete_body.h"



members_to_delete_body_t *members_to_delete_body_create(
    list_t *members
    ) {
    members_to_delete_body_t *members_to_delete_body_local_var = malloc(sizeof(members_to_delete_body_t));
    if (!members_to_delete_body_local_var) {
        return NULL;
    }
    members_to_delete_body_local_var->members = members;

    return members_to_delete_body_local_var;
}


void members_to_delete_body_free(members_to_delete_body_t *members_to_delete_body) {
    if(NULL == members_to_delete_body){
        return ;
    }
    listEntry_t *listEntry;
    if (members_to_delete_body->members) {
        list_ForEach(listEntry, members_to_delete_body->members) {
            members_to_delete_body_members_inner_free(listEntry->data);
        }
        list_freeList(members_to_delete_body->members);
        members_to_delete_body->members = NULL;
    }
    free(members_to_delete_body);
}

cJSON *members_to_delete_body_convertToJSON(members_to_delete_body_t *members_to_delete_body) {
    cJSON *item = cJSON_CreateObject();

    // members_to_delete_body->members
    if (!members_to_delete_body->members) {
        goto fail;
    }
    cJSON *members = cJSON_AddArrayToObject(item, "members");
    if(members == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *membersListEntry;
    if (members_to_delete_body->members) {
    list_ForEach(membersListEntry, members_to_delete_body->members) {
    cJSON *itemLocal = members_to_delete_body_members_inner_convertToJSON(membersListEntry->data);
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

members_to_delete_body_t *members_to_delete_body_parseFromJSON(cJSON *members_to_delete_bodyJSON){

    members_to_delete_body_t *members_to_delete_body_local_var = NULL;

    // define the local list for members_to_delete_body->members
    list_t *membersList = NULL;

    // members_to_delete_body->members
    cJSON *members = cJSON_GetObjectItemCaseSensitive(members_to_delete_bodyJSON, "members");
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
        members_to_delete_body_members_inner_t *membersItem = members_to_delete_body_members_inner_parseFromJSON(members_local_nonprimitive);

        list_addElement(membersList, membersItem);
    }


    members_to_delete_body_local_var = members_to_delete_body_create (
        membersList
        );

    return members_to_delete_body_local_var;
end:
    if (membersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, membersList) {
            members_to_delete_body_members_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(membersList);
        membersList = NULL;
    }
    return NULL;

}
