#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_result.h"



update_member_result_t *update_member_result_create(
    char *business_role,
    char *member_id
    ) {
    update_member_result_t *update_member_result_local_var = malloc(sizeof(update_member_result_t));
    if (!update_member_result_local_var) {
        return NULL;
    }
    update_member_result_local_var->business_role = business_role;
    update_member_result_local_var->member_id = member_id;

    return update_member_result_local_var;
}


void update_member_result_free(update_member_result_t *update_member_result) {
    if(NULL == update_member_result){
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_result->business_role) {
        free(update_member_result->business_role);
        update_member_result->business_role = NULL;
    }
    if (update_member_result->member_id) {
        free(update_member_result->member_id);
        update_member_result->member_id = NULL;
    }
    free(update_member_result);
}

cJSON *update_member_result_convertToJSON(update_member_result_t *update_member_result) {
    cJSON *item = cJSON_CreateObject();

    // update_member_result->business_role
    if(update_member_result->business_role) {
    if(cJSON_AddStringToObject(item, "business_role", update_member_result->business_role) == NULL) {
    goto fail; //String
    }
    }


    // update_member_result->member_id
    if(update_member_result->member_id) {
    if(cJSON_AddStringToObject(item, "member_id", update_member_result->member_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_member_result_t *update_member_result_parseFromJSON(cJSON *update_member_resultJSON){

    update_member_result_t *update_member_result_local_var = NULL;

    // update_member_result->business_role
    cJSON *business_role = cJSON_GetObjectItemCaseSensitive(update_member_resultJSON, "business_role");
    if (business_role) { 
    if(!cJSON_IsString(business_role) && !cJSON_IsNull(business_role))
    {
    goto end; //String
    }
    }

    // update_member_result->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(update_member_resultJSON, "member_id");
    if (member_id) { 
    if(!cJSON_IsString(member_id) && !cJSON_IsNull(member_id))
    {
    goto end; //String
    }
    }


    update_member_result_local_var = update_member_result_create (
        business_role && !cJSON_IsNull(business_role) ? strdup(business_role->valuestring) : NULL,
        member_id && !cJSON_IsNull(member_id) ? strdup(member_id->valuestring) : NULL
        );

    return update_member_result_local_var;
end:
    return NULL;

}
