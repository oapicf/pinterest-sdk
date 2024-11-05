#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_business_role_body.h"


char* update_member_business_role_body_business_role_ToString(pinterest_rest_api_update_member_business_role_body__e business_role) {
    char* business_roleArray[] =  { "NULL", "EMPLOYEE", "BIZ_ADMIN" };
    return business_roleArray[business_role];
}

pinterest_rest_api_update_member_business_role_body__e update_member_business_role_body_business_role_FromString(char* business_role){
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

update_member_business_role_body_t *update_member_business_role_body_create(
    business_role_for_members_t *business_role,
    char *member_id
    ) {
    update_member_business_role_body_t *update_member_business_role_body_local_var = malloc(sizeof(update_member_business_role_body_t));
    if (!update_member_business_role_body_local_var) {
        return NULL;
    }
    update_member_business_role_body_local_var->business_role = business_role;
    update_member_business_role_body_local_var->member_id = member_id;

    return update_member_business_role_body_local_var;
}


void update_member_business_role_body_free(update_member_business_role_body_t *update_member_business_role_body) {
    if(NULL == update_member_business_role_body){
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_business_role_body->business_role) {
        business_role_for_members_free(update_member_business_role_body->business_role);
        update_member_business_role_body->business_role = NULL;
    }
    if (update_member_business_role_body->member_id) {
        free(update_member_business_role_body->member_id);
        update_member_business_role_body->member_id = NULL;
    }
    free(update_member_business_role_body);
}

cJSON *update_member_business_role_body_convertToJSON(update_member_business_role_body_t *update_member_business_role_body) {
    cJSON *item = cJSON_CreateObject();

    // update_member_business_role_body->business_role
    if (pinterest_rest_api_update_member_business_role_body__NULL == update_member_business_role_body->business_role) {
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
    business_role_for_members_t *business_role_local_nonprim = NULL;

    // update_member_business_role_body->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(update_member_business_role_bodyJSON, "business_role");
    if (!business_role) {
        goto end;
    }

    
    business_role_local_nonprim = business_role_for_members_parseFromJSON(business_role); //custom

    // update_member_business_role_body->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(update_member_business_role_bodyJSON, "member_id");
    if (!member_id) {
        goto end;
    }

    
    if(!cJSON_IsString(member_id))
    {
    goto end; //String
    }


    update_member_business_role_body_local_var = update_member_business_role_body_create (
        business_role_local_nonprim,
        strdup(member_id->valuestring)
        );

    return update_member_business_role_body_local_var;
end:
    if (business_role_local_nonprim) {
        business_role_for_members_free(business_role_local_nonprim);
        business_role_local_nonprim = NULL;
    }
    return NULL;

}
