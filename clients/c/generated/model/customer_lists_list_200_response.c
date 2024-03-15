#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_lists_list_200_response.h"



customer_lists_list_200_response_t *customer_lists_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    customer_lists_list_200_response_t *customer_lists_list_200_response_local_var = malloc(sizeof(customer_lists_list_200_response_t));
    if (!customer_lists_list_200_response_local_var) {
        return NULL;
    }
    customer_lists_list_200_response_local_var->items = items;
    customer_lists_list_200_response_local_var->bookmark = bookmark;

    return customer_lists_list_200_response_local_var;
}


void customer_lists_list_200_response_free(customer_lists_list_200_response_t *customer_lists_list_200_response) {
    if(NULL == customer_lists_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (customer_lists_list_200_response->items) {
        list_ForEach(listEntry, customer_lists_list_200_response->items) {
            customer_list_free(listEntry->data);
        }
        list_freeList(customer_lists_list_200_response->items);
        customer_lists_list_200_response->items = NULL;
    }
    if (customer_lists_list_200_response->bookmark) {
        free(customer_lists_list_200_response->bookmark);
        customer_lists_list_200_response->bookmark = NULL;
    }
    free(customer_lists_list_200_response);
}

cJSON *customer_lists_list_200_response_convertToJSON(customer_lists_list_200_response_t *customer_lists_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // customer_lists_list_200_response->items
    if (!customer_lists_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (customer_lists_list_200_response->items) {
    list_ForEach(itemsListEntry, customer_lists_list_200_response->items) {
    cJSON *itemLocal = customer_list_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // customer_lists_list_200_response->bookmark
    if(customer_lists_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", customer_lists_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_lists_list_200_response_t *customer_lists_list_200_response_parseFromJSON(cJSON *customer_lists_list_200_responseJSON){

    customer_lists_list_200_response_t *customer_lists_list_200_response_local_var = NULL;

    // define the local list for customer_lists_list_200_response->items
    list_t *itemsList = NULL;

    // customer_lists_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(customer_lists_list_200_responseJSON, "items");
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
        customer_list_t *itemsItem = customer_list_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // customer_lists_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(customer_lists_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    customer_lists_list_200_response_local_var = customer_lists_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return customer_lists_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            customer_list_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
