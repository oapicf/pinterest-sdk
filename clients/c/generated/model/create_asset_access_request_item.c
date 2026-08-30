#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_access_request_item.h"


char* create_asset_access_request_item_inner_ToString(pinterest_rest_api_create_asset_access_request_item_INNER_e inner) {
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    return innerArray[inner - 1];
}

pinterest_rest_api_create_asset_access_request_item_INNER_e create_asset_access_request_item_inner_FromString(char* inner) {
    int stringToReturn = 0;
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    size_t sizeofArray = sizeof(innerArray) / sizeof(innerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(inner, innerArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static create_asset_access_request_item_t *create_asset_access_request_item_create_internal(
    list_t* asset_id_to_permissions,
    char *partner_id
    ) {
    create_asset_access_request_item_t *create_asset_access_request_item_local_var = malloc(sizeof(create_asset_access_request_item_t));
    if (!create_asset_access_request_item_local_var) {
        return NULL;
    }
    memset(create_asset_access_request_item_local_var, 0, sizeof(create_asset_access_request_item_t));
    create_asset_access_request_item_local_var->_library_owned = 1;
    create_asset_access_request_item_local_var->asset_id_to_permissions = asset_id_to_permissions;
    create_asset_access_request_item_local_var->partner_id = partner_id;
    return create_asset_access_request_item_local_var;
}

__attribute__((deprecated)) create_asset_access_request_item_t *create_asset_access_request_item_create(
    list_t* asset_id_to_permissions,
    char *partner_id
    ) {
    create_asset_access_request_item_t *result = create_asset_access_request_item_create_internal (
        asset_id_to_permissions,
        partner_id
        );
    if (!result) {
    }
    return result;
}

void create_asset_access_request_item_free(create_asset_access_request_item_t *create_asset_access_request_item) {
    if(NULL == create_asset_access_request_item){
        return ;
    }
    if(create_asset_access_request_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_asset_access_request_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_access_request_item->asset_id_to_permissions) {
        list_ForEach(listEntry, create_asset_access_request_item->asset_id_to_permissions) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_asset_access_request_item->asset_id_to_permissions);
        create_asset_access_request_item->asset_id_to_permissions = NULL;
    }
    if (create_asset_access_request_item->partner_id) {
        free(create_asset_access_request_item->partner_id);
        create_asset_access_request_item->partner_id = NULL;
    }
    free(create_asset_access_request_item);
}

cJSON *create_asset_access_request_item_convertToJSON(create_asset_access_request_item_t *create_asset_access_request_item) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_access_request_item->asset_id_to_permissions
    if (pinterest_rest_api_create_asset_access_request_item_ASSETIDTOPERMISSIONS_NULL == create_asset_access_request_item->asset_id_to_permissions) {
        goto fail;
    }
    cJSON *asset_id_to_permissions = cJSON_AddObjectToObject(item, "asset_id_to_permissions");
    if(asset_id_to_permissions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = asset_id_to_permissions;
    listEntry_t *asset_id_to_permissionsListEntry;
    if (create_asset_access_request_item->asset_id_to_permissions) {
    list_ForEach(asset_id_to_permissionsListEntry, create_asset_access_request_item->asset_id_to_permissions) {
        keyValuePair_t *localKeyValue = asset_id_to_permissionsListEntry->data;
    }
    }


    // create_asset_access_request_item->partner_id
    if (!create_asset_access_request_item->partner_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "partner_id", create_asset_access_request_item->partner_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_asset_access_request_item_t *create_asset_access_request_item_parseFromJSON(cJSON *create_asset_access_request_itemJSON){

    create_asset_access_request_item_t *create_asset_access_request_item_local_var = NULL;

    // define the local map for create_asset_access_request_item->asset_id_to_permissions
    list_t *asset_id_to_permissionsList = NULL;

    char *partner_id_local_str = NULL;

    // create_asset_access_request_item->asset_id_to_permissions
    cJSON *asset_id_to_permissions = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_itemJSON, "asset_id_to_permissions");
    if (cJSON_IsNull(asset_id_to_permissions)) {
        asset_id_to_permissions = NULL;
    }
    if (!asset_id_to_permissions) {
        goto end;
    }

    
    cJSON *asset_id_to_permissions_local_map = NULL;
    if(!cJSON_IsObject(asset_id_to_permissions) && !cJSON_IsNull(asset_id_to_permissions))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(asset_id_to_permissions))
    {
        asset_id_to_permissionsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(asset_id_to_permissions_local_map, asset_id_to_permissions)
        {
            cJSON *localMapObject = asset_id_to_permissions_local_map;
            list_addElement(asset_id_to_permissionsList , localMapKeyPair);
        }
    }

    // create_asset_access_request_item->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_itemJSON, "partner_id");
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


    if (partner_id && !cJSON_IsNull(partner_id)) partner_id_local_str = strdup(partner_id->valuestring);

    create_asset_access_request_item_local_var = create_asset_access_request_item_create_internal (
        asset_id_to_permissionsList,
        partner_id_local_str
        );

    if (!create_asset_access_request_item_local_var) {
        goto end;
    }

    return create_asset_access_request_item_local_var;
end:
    if (asset_id_to_permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_id_to_permissionsList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(asset_id_to_permissionsList);
        asset_id_to_permissionsList = NULL;
    }
    if (partner_id_local_str) {
        free(partner_id_local_str);
        partner_id_local_str = NULL;
    }
    return NULL;

}
