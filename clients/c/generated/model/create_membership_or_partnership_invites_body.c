#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_membership_or_partnership_invites_body.h"



static create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_create_internal(
    business_role_for_invite_t *business_role,
    pinterest_rest_api_invite_type__e invite_type,
    list_t *members,
    list_t *partners
    ) {
    create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_local_var = malloc(sizeof(create_membership_or_partnership_invites_body_t));
    if (!create_membership_or_partnership_invites_body_local_var) {
        return NULL;
    }
    memset(create_membership_or_partnership_invites_body_local_var, 0, sizeof(create_membership_or_partnership_invites_body_t));
    create_membership_or_partnership_invites_body_local_var->_library_owned = 1;
    create_membership_or_partnership_invites_body_local_var->business_role = business_role;
    create_membership_or_partnership_invites_body_local_var->invite_type = invite_type;
    create_membership_or_partnership_invites_body_local_var->members = members;
    create_membership_or_partnership_invites_body_local_var->partners = partners;
    return create_membership_or_partnership_invites_body_local_var;
}

__attribute__((deprecated)) create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_create(
    business_role_for_invite_t *business_role,
    pinterest_rest_api_invite_type__e invite_type,
    list_t *members,
    list_t *partners
    ) {
    create_membership_or_partnership_invites_body_t *result = create_membership_or_partnership_invites_body_create_internal (
        business_role,
        invite_type,
        members,
        partners
        );
    if (!result) {
    }
    return result;
}

void create_membership_or_partnership_invites_body_free(create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body) {
    if(NULL == create_membership_or_partnership_invites_body){
        return ;
    }
    if(create_membership_or_partnership_invites_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_membership_or_partnership_invites_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_membership_or_partnership_invites_body->business_role) {
        business_role_for_invite_free(create_membership_or_partnership_invites_body->business_role);
        create_membership_or_partnership_invites_body->business_role = NULL;
    }
    if (create_membership_or_partnership_invites_body->members) {
        list_ForEach(listEntry, create_membership_or_partnership_invites_body->members) {
            free(listEntry->data);
        }
        list_freeList(create_membership_or_partnership_invites_body->members);
        create_membership_or_partnership_invites_body->members = NULL;
    }
    if (create_membership_or_partnership_invites_body->partners) {
        list_ForEach(listEntry, create_membership_or_partnership_invites_body->partners) {
            free(listEntry->data);
        }
        list_freeList(create_membership_or_partnership_invites_body->partners);
        create_membership_or_partnership_invites_body->partners = NULL;
    }
    free(create_membership_or_partnership_invites_body);
}

cJSON *create_membership_or_partnership_invites_body_convertToJSON(create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body) {
    cJSON *item = cJSON_CreateObject();

    // create_membership_or_partnership_invites_body->business_role
    if (!create_membership_or_partnership_invites_body->business_role) {
        goto fail;
    }
    cJSON *business_role_local_JSON = business_role_for_invite_convertToJSON(create_membership_or_partnership_invites_body->business_role);
    if(business_role_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "business_role", business_role_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // create_membership_or_partnership_invites_body->invite_type
    if (pinterest_rest_api_invite_type__NULL == create_membership_or_partnership_invites_body->invite_type) {
        goto fail;
    }
    cJSON *invite_type_local_JSON = invite_type_convertToJSON(create_membership_or_partnership_invites_body->invite_type);
    if(invite_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "invite_type", invite_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // create_membership_or_partnership_invites_body->members
    if(create_membership_or_partnership_invites_body->members) {
    cJSON *members = cJSON_AddArrayToObject(item, "members");
    if(members == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *membersListEntry;
    list_ForEach(membersListEntry, create_membership_or_partnership_invites_body->members) {
    if(cJSON_AddStringToObject(members, "", membersListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_membership_or_partnership_invites_body->partners
    if(create_membership_or_partnership_invites_body->partners) {
    cJSON *partners = cJSON_AddArrayToObject(item, "partners");
    if(partners == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *partnersListEntry;
    list_ForEach(partnersListEntry, create_membership_or_partnership_invites_body->partners) {
    if(cJSON_AddStringToObject(partners, "", partnersListEntry->data) == NULL)
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

create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_parseFromJSON(cJSON *create_membership_or_partnership_invites_bodyJSON){

    create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_local_var = NULL;

    // define the local variable for create_membership_or_partnership_invites_body->business_role
    business_role_for_invite_t *business_role_local_nonprim = NULL;

    // define the local variable for create_membership_or_partnership_invites_body->invite_type
    pinterest_rest_api_invite_type__e invite_type_local_nonprim = 0;

    // define the local list for create_membership_or_partnership_invites_body->members
    list_t *membersList = NULL;

    // define the local list for create_membership_or_partnership_invites_body->partners
    list_t *partnersList = NULL;

    // create_membership_or_partnership_invites_body->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "business_role");
    if (cJSON_IsNull(business_role)) {
        business_role = NULL;
    }
    if (!business_role) {
        goto end;
    }

    
    business_role_local_nonprim = business_role_for_invite_parseFromJSON(business_role); //custom

    // create_membership_or_partnership_invites_body->invite_type
    cJSON *invite_type = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "invite_type");
    if (cJSON_IsNull(invite_type)) {
        invite_type = NULL;
    }
    if (!invite_type) {
        goto end;
    }

    
    invite_type_local_nonprim = invite_type_parseFromJSON(invite_type); //custom

    // create_membership_or_partnership_invites_body->members
    cJSON *members = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "members");
    if (cJSON_IsNull(members)) {
        members = NULL;
    }
    if (members) { 
    cJSON *members_local = NULL;
    if(!cJSON_IsArray(members)) {
        goto end;//primitive container
    }
    membersList = list_createList();

    cJSON_ArrayForEach(members_local, members)
    {
        if(!cJSON_IsString(members_local))
        {
            goto end;
        }
        list_addElement(membersList , strdup(members_local->valuestring));
    }
    }

    // create_membership_or_partnership_invites_body->partners
    cJSON *partners = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "partners");
    if (cJSON_IsNull(partners)) {
        partners = NULL;
    }
    if (partners) { 
    cJSON *partners_local = NULL;
    if(!cJSON_IsArray(partners)) {
        goto end;//primitive container
    }
    partnersList = list_createList();

    cJSON_ArrayForEach(partners_local, partners)
    {
        if(!cJSON_IsString(partners_local))
        {
            goto end;
        }
        list_addElement(partnersList , strdup(partners_local->valuestring));
    }
    }



    create_membership_or_partnership_invites_body_local_var = create_membership_or_partnership_invites_body_create_internal (
        business_role_local_nonprim,
        invite_type_local_nonprim,
        members ? membersList : NULL,
        partners ? partnersList : NULL
        );

    if (!create_membership_or_partnership_invites_body_local_var) {
        goto end;
    }

    return create_membership_or_partnership_invites_body_local_var;
end:
    if (business_role_local_nonprim) {
        business_role_for_invite_free(business_role_local_nonprim);
        business_role_local_nonprim = NULL;
    }
    if (invite_type_local_nonprim) {
        invite_type_local_nonprim = 0;
    }
    if (membersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, membersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(membersList);
        membersList = NULL;
    }
    if (partnersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, partnersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(partnersList);
        partnersList = NULL;
    }
    return NULL;

}
