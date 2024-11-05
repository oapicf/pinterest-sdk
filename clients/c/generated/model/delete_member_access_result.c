#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_member_access_result.h"



delete_member_access_result_t *delete_member_access_result_create(
    char *asset_id,
    char *member_id
    ) {
    delete_member_access_result_t *delete_member_access_result_local_var = malloc(sizeof(delete_member_access_result_t));
    if (!delete_member_access_result_local_var) {
        return NULL;
    }
    delete_member_access_result_local_var->asset_id = asset_id;
    delete_member_access_result_local_var->member_id = member_id;

    return delete_member_access_result_local_var;
}


void delete_member_access_result_free(delete_member_access_result_t *delete_member_access_result) {
    if(NULL == delete_member_access_result){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_member_access_result->asset_id) {
        free(delete_member_access_result->asset_id);
        delete_member_access_result->asset_id = NULL;
    }
    if (delete_member_access_result->member_id) {
        free(delete_member_access_result->member_id);
        delete_member_access_result->member_id = NULL;
    }
    free(delete_member_access_result);
}

cJSON *delete_member_access_result_convertToJSON(delete_member_access_result_t *delete_member_access_result) {
    cJSON *item = cJSON_CreateObject();

    // delete_member_access_result->asset_id
    if(delete_member_access_result->asset_id) {
    if(cJSON_AddStringToObject(item, "asset_id", delete_member_access_result->asset_id) == NULL) {
    goto fail; //String
    }
    }


    // delete_member_access_result->member_id
    if(delete_member_access_result->member_id) {
    if(cJSON_AddStringToObject(item, "member_id", delete_member_access_result->member_id) == NULL) {
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

delete_member_access_result_t *delete_member_access_result_parseFromJSON(cJSON *delete_member_access_resultJSON){

    delete_member_access_result_t *delete_member_access_result_local_var = NULL;

    // delete_member_access_result->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(delete_member_access_resultJSON, "asset_id");
    if (asset_id) { 
    if(!cJSON_IsString(asset_id) && !cJSON_IsNull(asset_id))
    {
    goto end; //String
    }
    }

    // delete_member_access_result->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(delete_member_access_resultJSON, "member_id");
    if (member_id) { 
    if(!cJSON_IsString(member_id) && !cJSON_IsNull(member_id))
    {
    goto end; //String
    }
    }


    delete_member_access_result_local_var = delete_member_access_result_create (
        asset_id && !cJSON_IsNull(asset_id) ? strdup(asset_id->valuestring) : NULL,
        member_id && !cJSON_IsNull(member_id) ? strdup(member_id->valuestring) : NULL
        );

    return delete_member_access_result_local_var;
end:
    return NULL;

}
