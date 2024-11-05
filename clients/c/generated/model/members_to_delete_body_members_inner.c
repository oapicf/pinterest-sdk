#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "members_to_delete_body_members_inner.h"


char* members_to_delete_body_members_inner_business_role_ToString(pinterest_rest_api_members_to_delete_body_members_inner__e business_role) {
    char* business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    return business_roleArray[business_role];
}

pinterest_rest_api_members_to_delete_body_members_inner__e members_to_delete_body_members_inner_business_role_FromString(char* business_role){
    int stringToReturn = 0;
    char *business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    size_t sizeofArray = sizeof(business_roleArray) / sizeof(business_roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(business_role, business_roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_create(
    char *member_id,
    business_role_for_members_t *business_role
    ) {
    members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_local_var = malloc(sizeof(members_to_delete_body_members_inner_t));
    if (!members_to_delete_body_members_inner_local_var) {
        return NULL;
    }
    members_to_delete_body_members_inner_local_var->member_id = member_id;
    members_to_delete_body_members_inner_local_var->business_role = business_role;

    return members_to_delete_body_members_inner_local_var;
}


void members_to_delete_body_members_inner_free(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner) {
    if(NULL == members_to_delete_body_members_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (members_to_delete_body_members_inner->member_id) {
        free(members_to_delete_body_members_inner->member_id);
        members_to_delete_body_members_inner->member_id = NULL;
    }
    if (members_to_delete_body_members_inner->business_role) {
        business_role_for_members_free(members_to_delete_body_members_inner->business_role);
        members_to_delete_body_members_inner->business_role = NULL;
    }
    free(members_to_delete_body_members_inner);
}

cJSON *members_to_delete_body_members_inner_convertToJSON(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner) {
    cJSON *item = cJSON_CreateObject();

    // members_to_delete_body_members_inner->member_id
    if (!members_to_delete_body_members_inner->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", members_to_delete_body_members_inner->member_id) == NULL) {
    goto fail; //String
    }


    // members_to_delete_body_members_inner->business_role
    if (pinterest_rest_api_members_to_delete_body_members_inner__NULL == members_to_delete_body_members_inner->business_role) {
        goto fail;
    }
    cJSON *business_role_local_JSON = business_role_for_members_convertToJSON(members_to_delete_body_members_inner->business_role);
    if(business_role_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "business_role", business_role_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_parseFromJSON(cJSON *members_to_delete_body_members_innerJSON){

    members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_local_var = NULL;

    // define the local variable for members_to_delete_body_members_inner->business_role
    business_role_for_members_t *business_role_local_nonprim = NULL;

    // members_to_delete_body_members_inner->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(members_to_delete_body_members_innerJSON, "member_id");
    if (!member_id) {
        goto end;
    }

    
    if(!cJSON_IsString(member_id))
    {
    goto end; //String
    }

    // members_to_delete_body_members_inner->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(members_to_delete_body_members_innerJSON, "business_role");
    if (!business_role) {
        goto end;
    }

    
    business_role_local_nonprim = business_role_for_members_parseFromJSON(business_role); //custom


    members_to_delete_body_members_inner_local_var = members_to_delete_body_members_inner_create (
        strdup(member_id->valuestring),
        business_role_local_nonprim
        );

    return members_to_delete_body_members_inner_local_var;
end:
    if (business_role_local_nonprim) {
        business_role_for_members_free(business_role_local_nonprim);
        business_role_local_nonprim = NULL;
    }
    return NULL;

}
