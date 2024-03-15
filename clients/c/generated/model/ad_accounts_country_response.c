#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_country_response.h"



ad_accounts_country_response_t *ad_accounts_country_response_create(
    list_t *items
    ) {
    ad_accounts_country_response_t *ad_accounts_country_response_local_var = malloc(sizeof(ad_accounts_country_response_t));
    if (!ad_accounts_country_response_local_var) {
        return NULL;
    }
    ad_accounts_country_response_local_var->items = items;

    return ad_accounts_country_response_local_var;
}


void ad_accounts_country_response_free(ad_accounts_country_response_t *ad_accounts_country_response) {
    if(NULL == ad_accounts_country_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_country_response->items) {
        list_ForEach(listEntry, ad_accounts_country_response->items) {
            ad_accounts_country_response_data_free(listEntry->data);
        }
        list_freeList(ad_accounts_country_response->items);
        ad_accounts_country_response->items = NULL;
    }
    free(ad_accounts_country_response);
}

cJSON *ad_accounts_country_response_convertToJSON(ad_accounts_country_response_t *ad_accounts_country_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_country_response->items
    if(ad_accounts_country_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ad_accounts_country_response->items) {
    list_ForEach(itemsListEntry, ad_accounts_country_response->items) {
    cJSON *itemLocal = ad_accounts_country_response_data_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
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

ad_accounts_country_response_t *ad_accounts_country_response_parseFromJSON(cJSON *ad_accounts_country_responseJSON){

    ad_accounts_country_response_t *ad_accounts_country_response_local_var = NULL;

    // define the local list for ad_accounts_country_response->items
    list_t *itemsList = NULL;

    // ad_accounts_country_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_responseJSON, "items");
    if (items) { 
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
        ad_accounts_country_response_data_t *itemsItem = ad_accounts_country_response_data_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    ad_accounts_country_response_local_var = ad_accounts_country_response_create (
        items ? itemsList : NULL
        );

    return ad_accounts_country_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_accounts_country_response_data_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
