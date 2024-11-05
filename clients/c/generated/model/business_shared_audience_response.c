#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_shared_audience_response.h"


char* business_shared_audience_response_permissions_ToString(pinterest_rest_api_business_shared_audience_response__e permissions) {
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_business_shared_audience_response__e business_shared_audience_response_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "UNKNOWN", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

business_shared_audience_response_t *business_shared_audience_response_create(
    char *audience_id,
    list_t *permissions,
    list_t *recipient_business_ids
    ) {
    business_shared_audience_response_t *business_shared_audience_response_local_var = malloc(sizeof(business_shared_audience_response_t));
    if (!business_shared_audience_response_local_var) {
        return NULL;
    }
    business_shared_audience_response_local_var->audience_id = audience_id;
    business_shared_audience_response_local_var->permissions = permissions;
    business_shared_audience_response_local_var->recipient_business_ids = recipient_business_ids;

    return business_shared_audience_response_local_var;
}


void business_shared_audience_response_free(business_shared_audience_response_t *business_shared_audience_response) {
    if(NULL == business_shared_audience_response){
        return ;
    }
    listEntry_t *listEntry;
    if (business_shared_audience_response->audience_id) {
        free(business_shared_audience_response->audience_id);
        business_shared_audience_response->audience_id = NULL;
    }
    if (business_shared_audience_response->permissions) {
        list_ForEach(listEntry, business_shared_audience_response->permissions) {
            role_free(listEntry->data);
        }
        list_freeList(business_shared_audience_response->permissions);
        business_shared_audience_response->permissions = NULL;
    }
    if (business_shared_audience_response->recipient_business_ids) {
        list_ForEach(listEntry, business_shared_audience_response->recipient_business_ids) {
            free(listEntry->data);
        }
        list_freeList(business_shared_audience_response->recipient_business_ids);
        business_shared_audience_response->recipient_business_ids = NULL;
    }
    free(business_shared_audience_response);
}

cJSON *business_shared_audience_response_convertToJSON(business_shared_audience_response_t *business_shared_audience_response) {
    cJSON *item = cJSON_CreateObject();

    // business_shared_audience_response->audience_id
    if(business_shared_audience_response->audience_id) {
    if(cJSON_AddStringToObject(item, "audience_id", business_shared_audience_response->audience_id) == NULL) {
    goto fail; //String
    }
    }


    // business_shared_audience_response->permissions
    if(business_shared_audience_response->permissions != pinterest_rest_api_business_shared_audience_response_PERMISSIONS_NULL) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (business_shared_audience_response->permissions) {
    list_ForEach(permissionsListEntry, business_shared_audience_response->permissions) {
    cJSON *itemLocal = role_convertToJSON((pinterest_rest_api_business_shared_audience_response__e)permissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(permissions, itemLocal);
    }
    }
    }


    // business_shared_audience_response->recipient_business_ids
    if(business_shared_audience_response->recipient_business_ids) {
    cJSON *recipient_business_ids = cJSON_AddArrayToObject(item, "recipient_business_ids");
    if(recipient_business_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *recipient_business_idsListEntry;
    list_ForEach(recipient_business_idsListEntry, business_shared_audience_response->recipient_business_ids) {
    if(cJSON_AddStringToObject(recipient_business_ids, "", (char*)recipient_business_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

business_shared_audience_response_t *business_shared_audience_response_parseFromJSON(cJSON *business_shared_audience_responseJSON){

    business_shared_audience_response_t *business_shared_audience_response_local_var = NULL;

    // define the local list for business_shared_audience_response->permissions
    list_t *permissionsList = NULL;

    // define the local list for business_shared_audience_response->recipient_business_ids
    list_t *recipient_business_idsList = NULL;

    // business_shared_audience_response->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(business_shared_audience_responseJSON, "audience_id");
    if (audience_id) { 
    if(!cJSON_IsString(audience_id) && !cJSON_IsNull(audience_id))
    {
    goto end; //String
    }
    }

    // business_shared_audience_response->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(business_shared_audience_responseJSON, "permissions");
    if (permissions) { 
    cJSON *permissions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(permissions)){
        goto end; //nonprimitive container
    }

    permissionsList = list_createList();

    cJSON_ArrayForEach(permissions_local_nonprimitive,permissions )
    {
        if(!cJSON_IsObject(permissions_local_nonprimitive)){
            goto end;
        }
        business_shared_audience_response_role_e permissionsItem = role_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }
    }

    // business_shared_audience_response->recipient_business_ids
    cJSON *recipient_business_ids = cJSON_GetObjectItemCaseSensitive(business_shared_audience_responseJSON, "recipient_business_ids");
    if (recipient_business_ids) { 
    cJSON *recipient_business_ids_local = NULL;
    if(!cJSON_IsArray(recipient_business_ids)) {
        goto end;//primitive container
    }
    recipient_business_idsList = list_createList();

    cJSON_ArrayForEach(recipient_business_ids_local, recipient_business_ids)
    {
        if(!cJSON_IsString(recipient_business_ids_local))
        {
            goto end;
        }
        list_addElement(recipient_business_idsList , strdup(recipient_business_ids_local->valuestring));
    }
    }


    business_shared_audience_response_local_var = business_shared_audience_response_create (
        audience_id && !cJSON_IsNull(audience_id) ? strdup(audience_id->valuestring) : NULL,
        permissions ? permissionsList : NULL,
        recipient_business_ids ? recipient_business_idsList : NULL
        );

    return business_shared_audience_response_local_var;
end:
    if (permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, permissionsList) {
            role_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(permissionsList);
        permissionsList = NULL;
    }
    if (recipient_business_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recipient_business_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recipient_business_idsList);
        recipient_business_idsList = NULL;
    }
    return NULL;

}
