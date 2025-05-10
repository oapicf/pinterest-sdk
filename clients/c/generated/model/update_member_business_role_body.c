#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_business_role_body.h"



static update_member_business_role_body_t *update_member_business_role_body_create_internal(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
    ) {
    update_member_business_role_body_t *update_member_business_role_body_local_var = malloc(sizeof(update_member_business_role_body_t));
    if (!update_member_business_role_body_local_var) {
        return NULL;
    }
    update_member_business_role_body_local_var->business_role = business_role;
    update_member_business_role_body_local_var->member_id = member_id;

    update_member_business_role_body_local_var->_library_owned = 1;
    return update_member_business_role_body_local_var;
}

__attribute__((deprecated)) update_member_business_role_body_t *update_member_business_role_body_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
    ) {
    return update_member_business_role_body_create_internal (
        business_role,
        member_id
        );
}

void update_member_business_role_body_free(update_member_business_role_body_t *update_member_business_role_body) {
    if(NULL == update_member_business_role_body){
        return ;
    }
    if(update_member_business_role_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_member_business_role_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_business_role_body->member_id) {
        free(update_member_business_role_body->member_id);
        update_member_business_role_body->member_id = NULL;
    }
    free(update_member_business_role_body);
}

cJSON *update_member_business_role_body_convertToJSON(update_member_business_role_body_t *update_member_business_role_body) {
    cJSON *item = cJSON_CreateObject();

    // update_member_business_role_body->business_role
    if (pinterest_rest_api_business_role_for_members__NULL == update_member_business_role_body->business_role) {
        goto fail;
    }
    cJSON *business_role_local_JSON = business_role_for_members_convertToJSON(update_member_business_role_body->business_role);
    if(business_role_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "business_role", business_role_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // update_member_business_role_body->member_id
    if (!update_member_business_role_body->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", update_member_business_role_body->member_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_member_business_role_body_t *update_member_business_role_body_parseFromJSON(cJSON *update_member_business_role_bodyJSON){

    update_member_business_role_body_t *update_member_business_role_body_local_var = NULL;

    // define the local variable for update_member_business_role_body->business_role
    pinterest_rest_api_business_role_for_members__e business_role_local_nonprim = 0;

    // update_member_business_role_body->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(update_member_business_role_bodyJSON, "business_role");
    if (cJSON_IsNull(business_role)) {
        business_role = NULL;
    }
    if (!business_role) {
        goto end;
    }

    
    business_role_local_nonprim = business_role_for_members_parseFromJSON(business_role); //custom

    // update_member_business_role_body->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(update_member_business_role_bodyJSON, "member_id");
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


    update_member_business_role_body_local_var = update_member_business_role_body_create_internal (
        business_role_local_nonprim,
        strdup(member_id->valuestring)
        );

    return update_member_business_role_body_local_var;
end:
    if (business_role_local_nonprim) {
        business_role_local_nonprim = 0;
    }
    return NULL;

}
