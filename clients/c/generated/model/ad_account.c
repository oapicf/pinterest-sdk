#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account.h"


char* ad_account_permissions_ToString(pinterest_rest_api_ad_account__e permissions) {
    char *permissionsArray[] =  { "NULL", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "FINANCE_VIEW", "FINANCE_EDIT", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    return permissionsArray[permissions - 1];
}

pinterest_rest_api_ad_account__e ad_account_permissions_FromString(char* permissions) {
    int stringToReturn = 0;
    char *permissionsArray[] =  { "NULL", "OWNER", "ADMIN", "ANALYST", "SOS_READER", "FINANCE_MANAGER", "FINANCE_VIEW", "FINANCE_EDIT", "AUDIENCE_MANAGER", "CAMPAIGN_MANAGER", "CATALOGS_MANAGER", "RESTRICTED_OWNER", "PROFILE_MANAGER", "PROFILE_PUBLISHER", "RESOURCE_PINNER_LIST_OWNER", "RESOURCE_PINNER_LIST_READER", "BIZ_PINNER_LIST_SHARER", "RESOURCE_CONVERSION_TAGS_READER" };
    size_t sizeofArray = sizeof(permissionsArray) / sizeof(permissionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(permissions, permissionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_account_t *ad_account_create_internal(
    pinterest_rest_api_country__e country,
    int created_time,
    pinterest_rest_api_currency__e currency,
    char *id,
    char *name,
    ad_account_owner_t *owner,
    list_t *permissions,
    int updated_time
    ) {
    ad_account_t *ad_account_local_var = malloc(sizeof(ad_account_t));
    if (!ad_account_local_var) {
        return NULL;
    }
    ad_account_local_var->country = country;
    ad_account_local_var->created_time = created_time;
    ad_account_local_var->currency = currency;
    ad_account_local_var->id = id;
    ad_account_local_var->name = name;
    ad_account_local_var->owner = owner;
    ad_account_local_var->permissions = permissions;
    ad_account_local_var->updated_time = updated_time;

    ad_account_local_var->_library_owned = 1;
    return ad_account_local_var;
}

__attribute__((deprecated)) ad_account_t *ad_account_create(
    pinterest_rest_api_country__e country,
    int created_time,
    pinterest_rest_api_currency__e currency,
    char *id,
    char *name,
    ad_account_owner_t *owner,
    list_t *permissions,
    int updated_time
    ) {
    return ad_account_create_internal (
        country,
        created_time,
        currency,
        id,
        name,
        owner,
        permissions,
        updated_time
        );
}

void ad_account_free(ad_account_t *ad_account) {
    if(NULL == ad_account){
        return ;
    }
    if(ad_account->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account->id) {
        free(ad_account->id);
        ad_account->id = NULL;
    }
    if (ad_account->name) {
        free(ad_account->name);
        ad_account->name = NULL;
    }
    if (ad_account->owner) {
        ad_account_owner_free(ad_account->owner);
        ad_account->owner = NULL;
    }
    if (ad_account->permissions) {
        list_ForEach(listEntry, ad_account->permissions) {
            business_access_role_free(listEntry->data);
        }
        list_freeList(ad_account->permissions);
        ad_account->permissions = NULL;
    }
    free(ad_account);
}

cJSON *ad_account_convertToJSON(ad_account_t *ad_account) {
    cJSON *item = cJSON_CreateObject();

    // ad_account->country
    if(ad_account->country != pinterest_rest_api_country__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(ad_account->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_account->created_time
    if(ad_account->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", ad_account->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_account->currency
    if(ad_account->currency != pinterest_rest_api_currency__NULL) {
    cJSON *currency_local_JSON = currency_convertToJSON(ad_account->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_account->id
    if (!ad_account->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_account->id) == NULL) {
    goto fail; //String
    }


    // ad_account->name
    if(ad_account->name) {
    if(cJSON_AddStringToObject(item, "name", ad_account->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_account->owner
    if(ad_account->owner) {
    cJSON *owner_local_JSON = ad_account_owner_convertToJSON(ad_account->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_account->permissions
    if(ad_account->permissions != pinterest_rest_api_list_PERMISSIONS_NULL) {
    cJSON *permissions = cJSON_AddArrayToObject(item, "permissions");
    if(permissions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *permissionsListEntry;
    if (ad_account->permissions) {
    list_ForEach(permissionsListEntry, ad_account->permissions) {
    cJSON *itemLocal = business_access_role_convertToJSON((pinterest_rest_api_ad_account__e)permissionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(permissions, itemLocal);
    }
    }
    }


    // ad_account->updated_time
    if(ad_account->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", ad_account->updated_time) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_account_t *ad_account_parseFromJSON(cJSON *ad_accountJSON){

    ad_account_t *ad_account_local_var = NULL;

    // define the local variable for ad_account->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for ad_account->currency
    pinterest_rest_api_currency__e currency_local_nonprim = 0;

    // define the local variable for ad_account->owner
    ad_account_owner_t *owner_local_nonprim = NULL;

    // define the local list for ad_account->permissions
    list_t *permissionsList = NULL;

    // ad_account->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // ad_account->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // ad_account->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // ad_account->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // ad_account->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_account->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (owner) { 
    owner_local_nonprim = ad_account_owner_parseFromJSON(owner); //nonprimitive
    }

    // ad_account->permissions
    cJSON *permissions = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "permissions");
    if (cJSON_IsNull(permissions)) {
        permissions = NULL;
    }
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
        ad_account_business_access_role_e permissionsItem = business_access_role_parseFromJSON(permissions_local_nonprimitive);

        list_addElement(permissionsList, (void *)permissionsItem);
    }
    }

    // ad_account->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }


    ad_account_local_var = ad_account_create_internal (
        country ? country_local_nonprim : 0,
        created_time ? created_time->valuedouble : 0,
        currency ? currency_local_nonprim : 0,
        strdup(id->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        owner ? owner_local_nonprim : NULL,
        permissions ? permissionsList : NULL,
        updated_time ? updated_time->valuedouble : 0
        );

    return ad_account_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    if (owner_local_nonprim) {
        ad_account_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    if (permissionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, permissionsList) {
            business_access_role_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(permissionsList);
        permissionsList = NULL;
    }
    return NULL;

}
