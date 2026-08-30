#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_invites_request_item.h"


char* create_asset_invites_request_item_inner_ToString(pinterest_rest_api_create_asset_invites_request_item_INNER_e inner) {
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "FINANCE_EDIT", "FINANCE_VIEW", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "CATALOGS_VIEWER", "PROFILE_PUBLISHER", "CONSUMER_USER", "BIZ_PINNER_LIST_SHARER" };
    return innerArray[inner - 1];
}

pinterest_rest_api_create_asset_invites_request_item_INNER_e create_asset_invites_request_item_inner_FromString(char* inner) {
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

static create_asset_invites_request_item_t *create_asset_invites_request_item_create_internal(
    list_t* asset_id_to_permissions,
    char *invite_id,
    pinterest_rest_api_invite_type__e invite_type
    ) {
    create_asset_invites_request_item_t *create_asset_invites_request_item_local_var = malloc(sizeof(create_asset_invites_request_item_t));
    if (!create_asset_invites_request_item_local_var) {
        return NULL;
    }
    memset(create_asset_invites_request_item_local_var, 0, sizeof(create_asset_invites_request_item_t));
    create_asset_invites_request_item_local_var->_library_owned = 1;
    create_asset_invites_request_item_local_var->asset_id_to_permissions = asset_id_to_permissions;
    create_asset_invites_request_item_local_var->invite_id = invite_id;
    create_asset_invites_request_item_local_var->invite_type = invite_type;
    return create_asset_invites_request_item_local_var;
}

__attribute__((deprecated)) create_asset_invites_request_item_t *create_asset_invites_request_item_create(
    list_t* asset_id_to_permissions,
    char *invite_id,
    pinterest_rest_api_invite_type__e invite_type
    ) {
    create_asset_invites_request_item_t *result = create_asset_invites_request_item_create_internal (
        asset_id_to_permissions,
        invite_id,
        invite_type
        );
    if (!result) {
    }
    return result;
}

void create_asset_invites_request_item_free(create_asset_invites_request_item_t *create_asset_invites_request_item) {
    if(NULL == create_asset_invites_request_item){
        return ;
    }
    if(create_asset_invites_request_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_asset_invites_request_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_invites_request_item->asset_id_to_permissions) {
        list_ForEach(listEntry, create_asset_invites_request_item->asset_id_to_permissions) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_asset_invites_request_item->asset_id_to_permissions);
        create_asset_invites_request_item->asset_id_to_permissions = NULL;
    }
    if (create_asset_invites_request_item->invite_id) {
        free(create_asset_invites_request_item->invite_id);
        create_asset_invites_request_item->invite_id = NULL;
    }
    free(create_asset_invites_request_item);
}

cJSON *create_asset_invites_request_item_convertToJSON(create_asset_invites_request_item_t *create_asset_invites_request_item) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_invites_request_item->asset_id_to_permissions
    if (pinterest_rest_api_create_asset_invites_request_item_ASSETIDTOPERMISSIONS_NULL == create_asset_invites_request_item->asset_id_to_permissions) {
        goto fail;
    }
    cJSON *asset_id_to_permissions = cJSON_AddObjectToObject(item, "asset_id_to_permissions");
    if(asset_id_to_permissions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = asset_id_to_permissions;
    listEntry_t *asset_id_to_permissionsListEntry;
    if (create_asset_invites_request_item->asset_id_to_permissions) {
    list_ForEach(asset_id_to_permissionsListEntry, create_asset_invites_request_item->asset_id_to_permissions) {
        keyValuePair_t *localKeyValue = asset_id_to_permissionsListEntry->data;
    }
    }


    // create_asset_invites_request_item->invite_id
    if (!create_asset_invites_request_item->invite_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "invite_id", create_asset_invites_request_item->invite_id) == NULL) {
    goto fail; //String
    }


    // create_asset_invites_request_item->invite_type
    if (pinterest_rest_api_invite_type__NULL == create_asset_invites_request_item->invite_type) {
        goto fail;
    }
    cJSON *invite_type_local_JSON = invite_type_convertToJSON(create_asset_invites_request_item->invite_type);
    if(invite_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "invite_type", invite_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_asset_invites_request_item_t *create_asset_invites_request_item_parseFromJSON(cJSON *create_asset_invites_request_itemJSON){

    create_asset_invites_request_item_t *create_asset_invites_request_item_local_var = NULL;

    // define the local map for create_asset_invites_request_item->asset_id_to_permissions
    list_t *asset_id_to_permissionsList = NULL;

    char *invite_id_local_str = NULL;

    // define the local variable for create_asset_invites_request_item->invite_type
    pinterest_rest_api_invite_type__e invite_type_local_nonprim = 0;

    // create_asset_invites_request_item->asset_id_to_permissions
    cJSON *asset_id_to_permissions = cJSON_GetObjectItemCaseSensitive(create_asset_invites_request_itemJSON, "asset_id_to_permissions");
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

    // create_asset_invites_request_item->invite_id
    cJSON *invite_id = cJSON_GetObjectItemCaseSensitive(create_asset_invites_request_itemJSON, "invite_id");
    if (cJSON_IsNull(invite_id)) {
        invite_id = NULL;
    }
    if (!invite_id) {
        goto end;
    }

    
    if(!cJSON_IsString(invite_id))
    {
    goto end; //String
    }

    // create_asset_invites_request_item->invite_type
    cJSON *invite_type = cJSON_GetObjectItemCaseSensitive(create_asset_invites_request_itemJSON, "invite_type");
    if (cJSON_IsNull(invite_type)) {
        invite_type = NULL;
    }
    if (!invite_type) {
        goto end;
    }

    
    invite_type_local_nonprim = invite_type_parseFromJSON(invite_type); //custom


    if (invite_id && !cJSON_IsNull(invite_id)) invite_id_local_str = strdup(invite_id->valuestring);

    create_asset_invites_request_item_local_var = create_asset_invites_request_item_create_internal (
        asset_id_to_permissionsList,
        invite_id_local_str,
        invite_type_local_nonprim
        );

    if (!create_asset_invites_request_item_local_var) {
        goto end;
    }

    return create_asset_invites_request_item_local_var;
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
    if (invite_id_local_str) {
        free(invite_id_local_str);
        invite_id_local_str = NULL;
    }
    if (invite_type_local_nonprim) {
        invite_type_local_nonprim = 0;
    }
    return NULL;

}
