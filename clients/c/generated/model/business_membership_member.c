#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_membership_member.h"



static business_membership_member_t *business_membership_member_create_internal(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
    ) {
    business_membership_member_t *business_membership_member_local_var = malloc(sizeof(business_membership_member_t));
    if (!business_membership_member_local_var) {
        return NULL;
    }
    memset(business_membership_member_local_var, 0, sizeof(business_membership_member_t));
    business_membership_member_local_var->_library_owned = 1;
    business_membership_member_local_var->business_role = business_role;
    business_membership_member_local_var->member_id = member_id;
    return business_membership_member_local_var;
}

__attribute__((deprecated)) business_membership_member_t *business_membership_member_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
    ) {
    business_membership_member_t *result = business_membership_member_create_internal (
        business_role,
        member_id
        );
    if (!result) {
    }
    return result;
}

void business_membership_member_free(business_membership_member_t *business_membership_member) {
    if(NULL == business_membership_member){
        return ;
    }
    if(business_membership_member->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_membership_member_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_membership_member->member_id) {
        free(business_membership_member->member_id);
        business_membership_member->member_id = NULL;
    }
    free(business_membership_member);
}

cJSON *business_membership_member_convertToJSON(business_membership_member_t *business_membership_member) {
    cJSON *item = cJSON_CreateObject();

    // business_membership_member->business_role
    if (pinterest_rest_api_business_role_for_members__NULL == business_membership_member->business_role) {
        goto fail;
    }
    cJSON *business_role_local_JSON = business_role_for_members_convertToJSON(business_membership_member->business_role);
    if(business_role_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "business_role", business_role_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // business_membership_member->member_id
    if (!business_membership_member->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", business_membership_member->member_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

business_membership_member_t *business_membership_member_parseFromJSON(cJSON *business_membership_memberJSON){

    business_membership_member_t *business_membership_member_local_var = NULL;

    // define the local variable for business_membership_member->business_role
    pinterest_rest_api_business_role_for_members__e business_role_local_nonprim = 0;

    char *member_id_local_str = NULL;

    // business_membership_member->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(business_membership_memberJSON, "business_role");
    if (cJSON_IsNull(business_role)) {
        business_role = NULL;
    }
    if (!business_role) {
        goto end;
    }

    
    business_role_local_nonprim = business_role_for_members_parseFromJSON(business_role); //custom

    // business_membership_member->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(business_membership_memberJSON, "member_id");
    if (cJSON_IsNull(member_id)) {
        member_id = NULL;
    }
    if (!member_id) {
        goto end;
    }

    
    if(!cJSON_IsString(member_id))
    {
    goto end; //String
    }


    if (member_id && !cJSON_IsNull(member_id)) member_id_local_str = strdup(member_id->valuestring);

    business_membership_member_local_var = business_membership_member_create_internal (
        business_role_local_nonprim,
        member_id_local_str
        );

    if (!business_membership_member_local_var) {
        goto end;
    }

    return business_membership_member_local_var;
end:
    if (business_role_local_nonprim) {
        business_role_local_nonprim = 0;
    }
    if (member_id_local_str) {
        free(member_id_local_str);
        member_id_local_str = NULL;
    }
    return NULL;

}
