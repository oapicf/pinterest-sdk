#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_membership_or_partnership_invites_body.h"


char* create_membership_or_partnership_invites_body_business_role_ToString(pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e business_role) {
    char* business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN", "PARTNER" };
    return business_roleArray[business_role];
}

pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e create_membership_or_partnership_invites_body_business_role_FromString(char* business_role){
    int stringToReturn = 0;
    char *business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN", "PARTNER" };
    size_t sizeofArray = sizeof(business_roleArray) / sizeof(business_roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_role, business_roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_membership_or_partnership_invites_body_invite_type_ToString(pinterest_rest_api_create_membership_or_partnership_invites_body__e invite_type) {
    char* invite_typeArray[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    return invite_typeArray[invite_type];
}

pinterest_rest_api_create_membership_or_partnership_invites_body__e create_membership_or_partnership_invites_body_invite_type_FromString(char* invite_type){
    int stringToReturn = 0;
    char *invite_typeArray[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    size_t sizeofArray = sizeof(invite_typeArray) / sizeof(invite_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(invite_type, invite_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_create(
    pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e business_role,
    invite_type_t *invite_type,
    list_t *members,
    list_t *partners
    ) {
    create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_local_var = malloc(sizeof(create_membership_or_partnership_invites_body_t));
    if (!create_membership_or_partnership_invites_body_local_var) {
        return NULL;
    }
    create_membership_or_partnership_invites_body_local_var->business_role = business_role;
    create_membership_or_partnership_invites_body_local_var->invite_type = invite_type;
    create_membership_or_partnership_invites_body_local_var->members = members;
    create_membership_or_partnership_invites_body_local_var->partners = partners;

    return create_membership_or_partnership_invites_body_local_var;
}


void create_membership_or_partnership_invites_body_free(create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body) {
    if(NULL == create_membership_or_partnership_invites_body){
        return ;
    }
    listEntry_t *listEntry;
    if (create_membership_or_partnership_invites_body->invite_type) {
        invite_type_free(create_membership_or_partnership_invites_body->invite_type);
        create_membership_or_partnership_invites_body->invite_type = NULL;
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
    if (pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_NULL == create_membership_or_partnership_invites_body->business_role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "business_role", business_rolecreate_membership_or_partnership_invites_body_ToString(create_membership_or_partnership_invites_body->business_role)) == NULL)
    {
    goto fail; //Enum
    }


    // create_membership_or_partnership_invites_body->invite_type
    if (pinterest_rest_api_create_membership_or_partnership_invites_body__NULL == create_membership_or_partnership_invites_body->invite_type) {
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
    if(cJSON_AddStringToObject(members, "", (char*)membersListEntry->data) == NULL)
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
    if(cJSON_AddStringToObject(partners, "", (char*)partnersListEntry->data) == NULL)
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

    // define the local variable for create_membership_or_partnership_invites_body->invite_type
    invite_type_t *invite_type_local_nonprim = NULL;

    // define the local list for create_membership_or_partnership_invites_body->members
    list_t *membersList = NULL;

    // define the local list for create_membership_or_partnership_invites_body->partners
    list_t *partnersList = NULL;

    // create_membership_or_partnership_invites_body->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "business_role");
    if (!business_role) {
        goto end;
    }

    pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e business_roleVariable;
    
    if(!cJSON_IsString(business_role))
    {
    goto end; //Enum
    }
    business_roleVariable = create_membership_or_partnership_invites_body_business_role_FromString(business_role->valuestring);

    // create_membership_or_partnership_invites_body->invite_type
    cJSON *invite_type = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "invite_type");
    if (!invite_type) {
        goto end;
    }

    
    invite_type_local_nonprim = invite_type_parseFromJSON(invite_type); //custom

    // create_membership_or_partnership_invites_body->members
    cJSON *members = cJSON_GetObjectItemCaseSensitive(create_membership_or_partnership_invites_bodyJSON, "members");
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


    create_membership_or_partnership_invites_body_local_var = create_membership_or_partnership_invites_body_create (
        business_roleVariable,
        invite_type_local_nonprim,
        members ? membersList : NULL,
        partners ? partnersList : NULL
        );

    return create_membership_or_partnership_invites_body_local_var;
end:
    if (invite_type_local_nonprim) {
        invite_type_free(invite_type_local_nonprim);
        invite_type_local_nonprim = NULL;
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
