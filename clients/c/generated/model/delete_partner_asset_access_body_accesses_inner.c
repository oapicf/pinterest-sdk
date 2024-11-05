#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partner_asset_access_body_accesses_inner.h"


char* delete_partner_asset_access_body_accesses_inner_partner_type_ToString(pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_e partner_type) {
    char* partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    return partner_typeArray[partner_type];
}

pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_e delete_partner_asset_access_body_accesses_inner_partner_type_FromString(char* partner_type){
    int stringToReturn = 0;
    char *partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    size_t sizeofArray = sizeof(partner_typeArray) / sizeof(partner_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(partner_type, partner_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

delete_partner_asset_access_body_accesses_inner_t *delete_partner_asset_access_body_accesses_inner_create(
    char *partner_id,
    char *asset_id,
    pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_e partner_type
    ) {
    delete_partner_asset_access_body_accesses_inner_t *delete_partner_asset_access_body_accesses_inner_local_var = malloc(sizeof(delete_partner_asset_access_body_accesses_inner_t));
    if (!delete_partner_asset_access_body_accesses_inner_local_var) {
        return NULL;
    }
    delete_partner_asset_access_body_accesses_inner_local_var->partner_id = partner_id;
    delete_partner_asset_access_body_accesses_inner_local_var->asset_id = asset_id;
    delete_partner_asset_access_body_accesses_inner_local_var->partner_type = partner_type;

    return delete_partner_asset_access_body_accesses_inner_local_var;
}


void delete_partner_asset_access_body_accesses_inner_free(delete_partner_asset_access_body_accesses_inner_t *delete_partner_asset_access_body_accesses_inner) {
    if(NULL == delete_partner_asset_access_body_accesses_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partner_asset_access_body_accesses_inner->partner_id) {
        free(delete_partner_asset_access_body_accesses_inner->partner_id);
        delete_partner_asset_access_body_accesses_inner->partner_id = NULL;
    }
    if (delete_partner_asset_access_body_accesses_inner->asset_id) {
        free(delete_partner_asset_access_body_accesses_inner->asset_id);
        delete_partner_asset_access_body_accesses_inner->asset_id = NULL;
    }
    free(delete_partner_asset_access_body_accesses_inner);
}

cJSON *delete_partner_asset_access_body_accesses_inner_convertToJSON(delete_partner_asset_access_body_accesses_inner_t *delete_partner_asset_access_body_accesses_inner) {
    cJSON *item = cJSON_CreateObject();

    // delete_partner_asset_access_body_accesses_inner->partner_id
    if (!delete_partner_asset_access_body_accesses_inner->partner_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "partner_id", delete_partner_asset_access_body_accesses_inner->partner_id) == NULL) {
    goto fail; //String
    }


    // delete_partner_asset_access_body_accesses_inner->asset_id
    if (!delete_partner_asset_access_body_accesses_inner->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", delete_partner_asset_access_body_accesses_inner->asset_id) == NULL) {
    goto fail; //String
    }


    // delete_partner_asset_access_body_accesses_inner->partner_type
    if(delete_partner_asset_access_body_accesses_inner->partner_type != pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "partner_type", partner_typedelete_partner_asset_access_body_accesses_inner_ToString(delete_partner_asset_access_body_accesses_inner->partner_type)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_partner_asset_access_body_accesses_inner_t *delete_partner_asset_access_body_accesses_inner_parseFromJSON(cJSON *delete_partner_asset_access_body_accesses_innerJSON){

    delete_partner_asset_access_body_accesses_inner_t *delete_partner_asset_access_body_accesses_inner_local_var = NULL;

    // delete_partner_asset_access_body_accesses_inner->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_body_accesses_innerJSON, "partner_id");
    if (!partner_id) {
        goto end;
    }

    
    if(!cJSON_IsString(partner_id))
    {
    goto end; //String
    }

    // delete_partner_asset_access_body_accesses_inner->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_body_accesses_innerJSON, "asset_id");
    if (!asset_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_id))
    {
    goto end; //String
    }

    // delete_partner_asset_access_body_accesses_inner->partner_type
    cJSON *partner_type = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_body_accesses_innerJSON, "partner_type");
    pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_e partner_typeVariable;
    if (partner_type) { 
    if(!cJSON_IsString(partner_type))
    {
    goto end; //Enum
    }
    partner_typeVariable = delete_partner_asset_access_body_accesses_inner_partner_type_FromString(partner_type->valuestring);
    }


    delete_partner_asset_access_body_accesses_inner_local_var = delete_partner_asset_access_body_accesses_inner_create (
        strdup(partner_id->valuestring),
        strdup(asset_id->valuestring),
        partner_type ? partner_typeVariable : pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_NULL
        );

    return delete_partner_asset_access_body_accesses_inner_local_var;
end:
    return NULL;

}
