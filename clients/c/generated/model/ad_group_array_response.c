#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_array_response.h"



ad_group_array_response_t *ad_group_array_response_create(
    list_t *items
    ) {
    ad_group_array_response_t *ad_group_array_response_local_var = malloc(sizeof(ad_group_array_response_t));
    if (!ad_group_array_response_local_var) {
        return NULL;
    }
    ad_group_array_response_local_var->items = items;

    return ad_group_array_response_local_var;
}


void ad_group_array_response_free(ad_group_array_response_t *ad_group_array_response) {
    if(NULL == ad_group_array_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_array_response->items) {
        list_ForEach(listEntry, ad_group_array_response->items) {
            ad_group_array_response_element_free(listEntry->data);
        }
        list_freeList(ad_group_array_response->items);
        ad_group_array_response->items = NULL;
    }
    free(ad_group_array_response);
}

cJSON *ad_group_array_response_convertToJSON(ad_group_array_response_t *ad_group_array_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_array_response->items
    if(ad_group_array_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ad_group_array_response->items) {
    list_ForEach(itemsListEntry, ad_group_array_response->items) {
    cJSON *itemLocal = ad_group_array_response_element_convertToJSON(itemsListEntry->data);
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

ad_group_array_response_t *ad_group_array_response_parseFromJSON(cJSON *ad_group_array_responseJSON){

    ad_group_array_response_t *ad_group_array_response_local_var = NULL;

    // define the local list for ad_group_array_response->items
    list_t *itemsList = NULL;

    // ad_group_array_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ad_group_array_responseJSON, "items");
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
        ad_group_array_response_element_t *itemsItem = ad_group_array_response_element_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    ad_group_array_response_local_var = ad_group_array_response_create (
        items ? itemsList : NULL
        );

    return ad_group_array_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_group_array_response_element_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
