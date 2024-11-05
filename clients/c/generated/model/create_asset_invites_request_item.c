#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_asset_invites_request_item.h"


char* create_asset_invites_request_item_invite_type_ToString(pinterest_rest_api_create_asset_invites_request_item__e invite_type) {
    char* invite_typeArray[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    return invite_typeArray[invite_type];
}

pinterest_rest_api_create_asset_invites_request_item__e create_asset_invites_request_item_invite_type_FromString(char* invite_type){
    int stringToReturn = 0;
    char *invite_typeArray[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    size_t sizeofArray = sizeof(invite_typeArray) / sizeof(invite_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(invite_type, invite_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_asset_invites_request_item_inner_ToString(pinterest_rest_api_create_asset_invites_request_item_INNER_e inner) {
    char *innerArray[] =  { "NULL", "ADMIN", "ANALYST", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "PROFILE_PUBLISHER" };
    return innerArray[inner - 1];
}

pinterest_rest_api_create_asset_invites_request_item_INNER_e create_asset_invites_request_item_inner_FromString(char* inner) {
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

create_asset_invites_request_item_t *create_asset_invites_request_item_create(
    char *invite_id,
    invite_type_t *invite_type,
    list_t* asset_id_to_permissions
    ) {
    create_asset_invites_request_item_t *create_asset_invites_request_item_local_var = malloc(sizeof(create_asset_invites_request_item_t));
    if (!create_asset_invites_request_item_local_var) {
        return NULL;
    }
    create_asset_invites_request_item_local_var->invite_id = invite_id;
    create_asset_invites_request_item_local_var->invite_type = invite_type;
    create_asset_invites_request_item_local_var->asset_id_to_permissions = asset_id_to_permissions;

    return create_asset_invites_request_item_local_var;
}


void create_asset_invites_request_item_free(create_asset_invites_request_item_t *create_asset_invites_request_item) {
    if(NULL == create_asset_invites_request_item){
        return ;
    }
    listEntry_t *listEntry;
    if (create_asset_invites_request_item->invite_id) {
        free(create_asset_invites_request_item->invite_id);
        create_asset_invites_request_item->invite_id = NULL;
    }
    if (create_asset_invites_request_item->invite_type) {
        invite_type_free(create_asset_invites_request_item->invite_type);
        create_asset_invites_request_item->invite_type = NULL;
    }
    if (create_asset_invites_request_item->asset_id_to_permissions) {
        list_ForEach(listEntry, create_asset_invites_request_item->asset_id_to_permissions) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_asset_invites_request_item->asset_id_to_permissions);
        create_asset_invites_request_item->asset_id_to_permissions = NULL;
    }
    free(create_asset_invites_request_item);
}

cJSON *create_asset_invites_request_item_convertToJSON(create_asset_invites_request_item_t *create_asset_invites_request_item) {
    cJSON *item = cJSON_CreateObject();

    // create_asset_invites_request_item->invite_id
    if (!create_asset_invites_request_item->invite_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "invite_id", create_asset_invites_request_item->invite_id) == NULL) {
    goto fail; //String
    }


    // create_asset_invites_request_item->invite_type
    if (pinterest_rest_api_create_asset_invites_request_item__NULL == create_asset_invites_request_item->invite_type) {
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

create_asset_invites_request_item_t *create_asset_invites_request_item_parseFromJSON(cJSON *create_asset_invites_request_itemJSON){

    create_asset_invites_request_item_t *create_asset_invites_request_item_local_var = NULL;

    // define the local variable for create_asset_invites_request_item->invite_type
    invite_type_t *invite_type_local_nonprim = NULL;

    // define the local map for create_asset_invites_request_item->asset_id_to_permissions
    list_t *asset_id_to_permissionsList = NULL;

    // create_asset_invites_request_item->invite_id
    cJSON *invite_id = cJSON_GetObjectItemCaseSensitive(create_asset_invites_request_itemJSON, "invite_id");
    if (!invite_id) {
        goto end;
    }

    
    if(!cJSON_IsString(invite_id))
    {
    goto end; //String
    }

    // create_asset_invites_request_item->invite_type
    cJSON *invite_type = cJSON_GetObjectItemCaseSensitive(create_asset_invites_request_itemJSON, "invite_type");
    if (!invite_type) {
        goto end;
    }

    
    invite_type_local_nonprim = invite_type_parseFromJSON(invite_type); //custom

    // create_asset_invites_request_item->asset_id_to_permissions
    cJSON *asset_id_to_permissions = cJSON_GetObjectItemCaseSensitive(create_asset_invites_request_itemJSON, "asset_id_to_permissions");
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


    create_asset_invites_request_item_local_var = create_asset_invites_request_item_create (
        strdup(invite_id->valuestring),
        invite_type_local_nonprim,
        asset_id_to_permissionsList
        );

    return create_asset_invites_request_item_local_var;
end:
    if (invite_type_local_nonprim) {
        invite_type_free(invite_type_local_nonprim);
        invite_type_local_nonprim = NULL;
    }
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
