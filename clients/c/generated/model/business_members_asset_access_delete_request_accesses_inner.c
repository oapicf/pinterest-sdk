#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_members_asset_access_delete_request_accesses_inner.h"



business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner_create(
    char *asset_id,
    char *member_id
    ) {
    business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner_local_var = malloc(sizeof(business_members_asset_access_delete_request_accesses_inner_t));
    if (!business_members_asset_access_delete_request_accesses_inner_local_var) {
        return NULL;
    }
    business_members_asset_access_delete_request_accesses_inner_local_var->asset_id = asset_id;
    business_members_asset_access_delete_request_accesses_inner_local_var->member_id = member_id;

    return business_members_asset_access_delete_request_accesses_inner_local_var;
}


void business_members_asset_access_delete_request_accesses_inner_free(business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner) {
    if(NULL == business_members_asset_access_delete_request_accesses_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (business_members_asset_access_delete_request_accesses_inner->asset_id) {
        free(business_members_asset_access_delete_request_accesses_inner->asset_id);
        business_members_asset_access_delete_request_accesses_inner->asset_id = NULL;
    }
    if (business_members_asset_access_delete_request_accesses_inner->member_id) {
        free(business_members_asset_access_delete_request_accesses_inner->member_id);
        business_members_asset_access_delete_request_accesses_inner->member_id = NULL;
    }
    free(business_members_asset_access_delete_request_accesses_inner);
}

cJSON *business_members_asset_access_delete_request_accesses_inner_convertToJSON(business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner) {
    cJSON *item = cJSON_CreateObject();

    // business_members_asset_access_delete_request_accesses_inner->asset_id
    if (!business_members_asset_access_delete_request_accesses_inner->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", business_members_asset_access_delete_request_accesses_inner->asset_id) == NULL) {
    goto fail; //String
    }


    // business_members_asset_access_delete_request_accesses_inner->member_id
    if (!business_members_asset_access_delete_request_accesses_inner->member_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "member_id", business_members_asset_access_delete_request_accesses_inner->member_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner_parseFromJSON(cJSON *business_members_asset_access_delete_request_accesses_innerJSON){

    business_members_asset_access_delete_request_accesses_inner_t *business_members_asset_access_delete_request_accesses_inner_local_var = NULL;

    // business_members_asset_access_delete_request_accesses_inner->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(business_members_asset_access_delete_request_accesses_innerJSON, "asset_id");
    if (!asset_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_id))
    {
    goto end; //String
    }

    // business_members_asset_access_delete_request_accesses_inner->member_id
    cJSON *member_id = cJSON_GetObjectItemCaseSensitive(business_members_asset_access_delete_request_accesses_innerJSON, "member_id");
    if (!member_id) {
        goto end;
    }

    
    if(!cJSON_IsString(member_id))
    {
    goto end; //String
    }


    business_members_asset_access_delete_request_accesses_inner_local_var = business_members_asset_access_delete_request_accesses_inner_create (
        strdup(asset_id->valuestring),
        strdup(member_id->valuestring)
        );

    return business_members_asset_access_delete_request_accesses_inner_local_var;
end:
    return NULL;

}
