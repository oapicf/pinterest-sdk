#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "members_to_delete_body_members_inner.h"



static members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_create_internal(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
    ) {
    members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_local_var = malloc(sizeof(members_to_delete_body_members_inner_t));
    if (!members_to_delete_body_members_inner_local_var) {
        return NULL;
    }
    members_to_delete_body_members_inner_local_var->business_role = business_role;
    members_to_delete_body_members_inner_local_var->member_id = member_id;

    members_to_delete_body_members_inner_local_var->_library_owned = 1;
    return members_to_delete_body_members_inner_local_var;
}

__attribute__((deprecated)) members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
    ) {
    return members_to_delete_body_members_inner_create_internal (
        business_role,
        member_id
        );
}

void members_to_delete_body_members_inner_free(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner) {
    if(NULL == members_to_delete_body_members_inner){
        return ;
    }
    if(members_to_delete_body_members_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "members_to_delete_body_members_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (members_to_delete_body_members_inner->member_id) {
        free(members_to_delete_body_members_inner->member_id);
        members_to_delete_body_members_inner->member_id = NULL;
    }
    free(members_to_delete_body_members_inner);
}

cJSON *members_to_delete_body_members_inner_convertToJSON(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner) {
    cJSON *item = cJSON_CreateObject();

    // members_to_delete_body_members_inner->business_role
    if (pinterest_rest_api_business_role_for_members__NULL == members_to_delete_body_members_inner->business_role) {
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


    // members_to_delete_body_members_inner->member_id
    if (!members_to_delete_body_members_inner->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", members_to_delete_body_members_inner->member_id) == NULL) {
    goto fail; //String
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
    pinterest_rest_api_business_role_for_members__e business_role_local_nonprim = 0;

    // members_to_delete_body_members_inner->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(members_to_delete_body_members_innerJSON, "business_role");
    if (cJSON_IsNull(business_role)) {
        business_role = NULL;
    }
    if (!business_role) {
        goto end;
    }

    
    business_role_local_nonprim = business_role_for_members_parseFromJSON(business_role); //custom

    // members_to_delete_body_members_inner->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(members_to_delete_body_members_innerJSON, "member_id");
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


    members_to_delete_body_members_inner_local_var = members_to_delete_body_members_inner_create_internal (
        business_role_local_nonprim,
        strdup(member_id->valuestring)
        );

    return members_to_delete_body_members_inner_local_var;
end:
    if (business_role_local_nonprim) {
        business_role_local_nonprim = 0;
    }
    return NULL;

}
