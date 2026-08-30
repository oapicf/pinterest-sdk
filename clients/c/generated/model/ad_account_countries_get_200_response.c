#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_countries_get_200_response.h"



static ad_account_countries_get_200_response_t *ad_account_countries_get_200_response_create_internal(
    list_t *items
    ) {
    ad_account_countries_get_200_response_t *ad_account_countries_get_200_response_local_var = malloc(sizeof(ad_account_countries_get_200_response_t));
    if (!ad_account_countries_get_200_response_local_var) {
        return NULL;
    }
    memset(ad_account_countries_get_200_response_local_var, 0, sizeof(ad_account_countries_get_200_response_t));
    ad_account_countries_get_200_response_local_var->_library_owned = 1;
    ad_account_countries_get_200_response_local_var->items = items;
    return ad_account_countries_get_200_response_local_var;
}

__attribute__((deprecated)) ad_account_countries_get_200_response_t *ad_account_countries_get_200_response_create(
    list_t *items
    ) {
    ad_account_countries_get_200_response_t *result = ad_account_countries_get_200_response_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void ad_account_countries_get_200_response_free(ad_account_countries_get_200_response_t *ad_account_countries_get_200_response) {
    if(NULL == ad_account_countries_get_200_response){
        return ;
    }
    if(ad_account_countries_get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_countries_get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_countries_get_200_response->items) {
        list_ForEach(listEntry, ad_account_countries_get_200_response->items) {
            ad_accounts_country_free(listEntry->data);
        }
        list_freeList(ad_account_countries_get_200_response->items);
        ad_account_countries_get_200_response->items = NULL;
    }
    free(ad_account_countries_get_200_response);
}

cJSON *ad_account_countries_get_200_response_convertToJSON(ad_account_countries_get_200_response_t *ad_account_countries_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_countries_get_200_response->items
    if (!ad_account_countries_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ad_account_countries_get_200_response->items) {
    list_ForEach(itemsListEntry, ad_account_countries_get_200_response->items) {
    cJSON *itemLocal = ad_accounts_country_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_account_countries_get_200_response_t *ad_account_countries_get_200_response_parseFromJSON(cJSON *ad_account_countries_get_200_responseJSON){

    ad_account_countries_get_200_response_t *ad_account_countries_get_200_response_local_var = NULL;

    // define the local list for ad_account_countries_get_200_response->items
    list_t *itemsList = NULL;

    // ad_account_countries_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ad_account_countries_get_200_responseJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        ad_accounts_country_t *itemsItem = ad_accounts_country_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    ad_account_countries_get_200_response_local_var = ad_account_countries_get_200_response_create_internal (
        itemsList
        );

    if (!ad_account_countries_get_200_response_local_var) {
        goto end;
    }

    return ad_account_countries_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_accounts_country_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
