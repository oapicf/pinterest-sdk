#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_access_request_body_asset_requests_inner.h"


char* create_asset_access_request_body_asset_requests_inner_inner_ToString(pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_e inner) {
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    return innerArray[inner - 1];
}

pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_INNER_e create_asset_access_request_body_asset_requests_inner_inner_FromString(char* inner) {
    int stringToReturn = 0;
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    size_t sizeofArray = sizeof(innerArray) / sizeof(innerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(inner, innerArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner_create(
    char *partner_id,
    list_t* asset_id_to_permissions
    ) {
    create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner_local_var = malloc(sizeof(create_asset_access_request_body_asset_requests_inner_t));
    if (!create_asset_access_request_body_asset_requests_inner_local_var) {
        return NULL;
    }
    create_asset_access_request_body_asset_requests_inner_local_var->partner_id = partner_id;
    create_asset_access_request_body_asset_requests_inner_local_var->asset_id_to_permissions = asset_id_to_permissions;

    return create_asset_access_request_body_asset_requests_inner_local_var;
}


void create_asset_access_request_body_asset_requests_inner_free(create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner) {
    if(NULL == create_asset_access_request_body_asset_requests_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_access_request_body_asset_requests_inner->partner_id) {
        free(create_asset_access_request_body_asset_requests_inner->partner_id);
        create_asset_access_request_body_asset_requests_inner->partner_id = NULL;
    }
    if (create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions) {
        list_ForEach(listEntry, create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions);
        create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions = NULL;
    }
    free(create_asset_access_request_body_asset_requests_inner);
}

cJSON *create_asset_access_request_body_asset_requests_inner_convertToJSON(create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_access_request_body_asset_requests_inner->partner_id
    if (!create_asset_access_request_body_asset_requests_inner->partner_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "partner_id", create_asset_access_request_body_asset_requests_inner->partner_id) == NULL) {
    goto fail; //String
    }


    // create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions
    if (pinterest_rest_api_create_asset_access_request_body_asset_requests_inner_ASSETIDTOPERMISSIONS_NULL == create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions) {
        goto fail;
    }
    cJSON *asset_id_to_permissions = cJSON_AddObjectToObject(item, "asset_id_to_permissions");
    if(asset_id_to_permissions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = asset_id_to_permissions;
    listEntry_t *asset_id_to_permissionsListEntry;
    if (create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions) {
    list_ForEach(asset_id_to_permissionsListEntry, create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)asset_id_to_permissionsListEntry->data;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner_parseFromJSON(cJSON *create_asset_access_request_body_asset_requests_innerJSON){

    create_asset_access_request_body_asset_requests_inner_t *create_asset_access_request_body_asset_requests_inner_local_var = NULL;

    // define the local map for create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions
    list_t *asset_id_to_permissionsList = NULL;

    // create_asset_access_request_body_asset_requests_inner->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_body_asset_requests_innerJSON, "partner_id");
    if (!partner_id) {
        goto end;
    }

    
    if(!cJSON_IsString(partner_id))
    {
    goto end; //String
    }

    // create_asset_access_request_body_asset_requests_inner->asset_id_to_permissions
    cJSON *asset_id_to_permissions = cJSON_GetObjectItemCaseSensitive(create_asset_access_request_body_asset_requests_innerJSON, "asset_id_to_permissions");
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


    create_asset_access_request_body_asset_requests_inner_local_var = create_asset_access_request_body_asset_requests_inner_create (
        strdup(partner_id->valuestring),
        asset_id_to_permissionsList
        );

    return create_asset_access_request_body_asset_requests_inner_local_var;
end:
    if (asset_id_to_permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, asset_id_to_permissionsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(asset_id_to_permissionsList);
        asset_id_to_permissionsList = NULL;
    }
    return NULL;

}
