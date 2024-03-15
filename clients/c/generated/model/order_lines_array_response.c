#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_lines_array_response.h"



order_lines_array_response_t *order_lines_array_response_create(
    list_t *items
    ) {
    order_lines_array_response_t *order_lines_array_response_local_var = malloc(sizeof(order_lines_array_response_t));
    if (!order_lines_array_response_local_var) {
        return NULL;
    }
    order_lines_array_response_local_var->items = items;

    return order_lines_array_response_local_var;
}


void order_lines_array_response_free(order_lines_array_response_t *order_lines_array_response) {
    if(NULL == order_lines_array_response){
        return ;
    }
    listEntry_t *listEntry;
    if (order_lines_array_response->items) {
        list_ForEach(listEntry, order_lines_array_response->items) {
            order_lines_free(listEntry->data);
        }
        list_freeList(order_lines_array_response->items);
        order_lines_array_response->items = NULL;
    }
    free(order_lines_array_response);
}

cJSON *order_lines_array_response_convertToJSON(order_lines_array_response_t *order_lines_array_response) {
    cJSON *item = cJSON_CreateObject();

    // order_lines_array_response->items
    if(order_lines_array_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (order_lines_array_response->items) {
    list_ForEach(itemsListEntry, order_lines_array_response->items) {
    cJSON *itemLocal = order_lines_convertToJSON(itemsListEntry->data);
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

order_lines_array_response_t *order_lines_array_response_parseFromJSON(cJSON *order_lines_array_responseJSON){

    order_lines_array_response_t *order_lines_array_response_local_var = NULL;

    // define the local list for order_lines_array_response->items
    list_t *itemsList = NULL;

    // order_lines_array_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(order_lines_array_responseJSON, "items");
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
        order_lines_t *itemsItem = order_lines_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    order_lines_array_response_local_var = order_lines_array_response_create (
        items ? itemsList : NULL
        );

    return order_lines_array_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            order_lines_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
