#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partner_asset_access_item.h"


char* delete_partner_asset_access_item_partner_type_ToString(pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_type) {
    char* partner_typeArray[] =  { "NULL", "INTERNAL", "EXTERNAL" };
    return partner_typeArray[partner_type];
}

pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e delete_partner_asset_access_item_partner_type_FromString(char* partner_type){
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

static delete_partner_asset_access_item_t *delete_partner_asset_access_item_create_internal(
    char *asset_id,
    char *partner_id,
    pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_type
    ) {
    delete_partner_asset_access_item_t *delete_partner_asset_access_item_local_var = malloc(sizeof(delete_partner_asset_access_item_t));
    if (!delete_partner_asset_access_item_local_var) {
        return NULL;
    }
    memset(delete_partner_asset_access_item_local_var, 0, sizeof(delete_partner_asset_access_item_t));
    delete_partner_asset_access_item_local_var->_library_owned = 1;
    delete_partner_asset_access_item_local_var->asset_id = asset_id;
    delete_partner_asset_access_item_local_var->partner_id = partner_id;
    delete_partner_asset_access_item_local_var->partner_type = partner_type;
    return delete_partner_asset_access_item_local_var;
}

__attribute__((deprecated)) delete_partner_asset_access_item_t *delete_partner_asset_access_item_create(
    char *asset_id,
    char *partner_id,
    pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_type
    ) {
    delete_partner_asset_access_item_t *result = delete_partner_asset_access_item_create_internal (
        asset_id,
        partner_id,
        partner_type
        );
    if (!result) {
    }
    return result;
}

void delete_partner_asset_access_item_free(delete_partner_asset_access_item_t *delete_partner_asset_access_item) {
    if(NULL == delete_partner_asset_access_item){
        return ;
    }
    if(delete_partner_asset_access_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_partner_asset_access_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partner_asset_access_item->asset_id) {
        free(delete_partner_asset_access_item->asset_id);
        delete_partner_asset_access_item->asset_id = NULL;
    }
    if (delete_partner_asset_access_item->partner_id) {
        free(delete_partner_asset_access_item->partner_id);
        delete_partner_asset_access_item->partner_id = NULL;
    }
    free(delete_partner_asset_access_item);
}

cJSON *delete_partner_asset_access_item_convertToJSON(delete_partner_asset_access_item_t *delete_partner_asset_access_item) {
    cJSON *item = cJSON_CreateObject();

    // delete_partner_asset_access_item->asset_id
    if (!delete_partner_asset_access_item->asset_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "asset_id", delete_partner_asset_access_item->asset_id) == NULL) {
    goto fail; //String
    }


    // delete_partner_asset_access_item->partner_id
    if (!delete_partner_asset_access_item->partner_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "partner_id", delete_partner_asset_access_item->partner_id) == NULL) {
    goto fail; //String
    }


    // delete_partner_asset_access_item->partner_type
    if(delete_partner_asset_access_item->partner_type != pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "partner_type", delete_partner_asset_access_item_partner_type_ToString(delete_partner_asset_access_item->partner_type)) == NULL)
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

delete_partner_asset_access_item_t *delete_partner_asset_access_item_parseFromJSON(cJSON *delete_partner_asset_access_itemJSON){

    delete_partner_asset_access_item_t *delete_partner_asset_access_item_local_var = NULL;

    char *asset_id_local_str = NULL;

    char *partner_id_local_str = NULL;

    // delete_partner_asset_access_item->asset_id
    cJSON *asset_id = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_itemJSON, "asset_id");
    if (cJSON_IsNull(asset_id)) {
        asset_id = NULL;
    }
    if (!asset_id) {
        goto end;
    }

    
    if(!cJSON_IsString(asset_id))
    {
    goto end; //String
    }

    // delete_partner_asset_access_item->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_itemJSON, "partner_id");
    if (cJSON_IsNull(partner_id)) {
        partner_id = NULL;
    }
    if (!partner_id) {
        goto end;
    }

    
    if(!cJSON_IsString(partner_id))
    {
    goto end; //String
    }

    // delete_partner_asset_access_item->partner_type
    cJSON *partner_type = cJSON_GetObjectItemCaseSensitive(delete_partner_asset_access_itemJSON, "partner_type");
    if (cJSON_IsNull(partner_type)) {
        partner_type = NULL;
    }
    pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_e partner_typeVariable;
    if (partner_type) { 
    if(!cJSON_IsString(partner_type))
    {
    goto end; //Enum
    }
    partner_typeVariable = delete_partner_asset_access_item_partner_type_FromString(partner_type->valuestring);
    }


    if (asset_id && !cJSON_IsNull(asset_id)) asset_id_local_str = strdup(asset_id->valuestring);
    if (partner_id && !cJSON_IsNull(partner_id)) partner_id_local_str = strdup(partner_id->valuestring);

    delete_partner_asset_access_item_local_var = delete_partner_asset_access_item_create_internal (
        asset_id_local_str,
        partner_id_local_str,
        partner_type ? partner_typeVariable : pinterest_rest_api_delete_partner_asset_access_item_PARTNERTYPE_NULL
        );

    if (!delete_partner_asset_access_item_local_var) {
        goto end;
    }

    return delete_partner_asset_access_item_local_var;
end:
    if (asset_id_local_str) {
        free(asset_id_local_str);
        asset_id_local_str = NULL;
    }
    if (partner_id_local_str) {
        free(partner_id_local_str);
        partner_id_local_str = NULL;
    }
    return NULL;

}
