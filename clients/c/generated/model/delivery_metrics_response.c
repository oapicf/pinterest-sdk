#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delivery_metrics_response.h"



static delivery_metrics_response_t *delivery_metrics_response_create_internal(
    list_t *items
    ) {
    delivery_metrics_response_t *delivery_metrics_response_local_var = malloc(sizeof(delivery_metrics_response_t));
    if (!delivery_metrics_response_local_var) {
        return NULL;
    }
    delivery_metrics_response_local_var->items = items;

    delivery_metrics_response_local_var->_library_owned = 1;
    return delivery_metrics_response_local_var;
}

__attribute__((deprecated)) delivery_metrics_response_t *delivery_metrics_response_create(
    list_t *items
    ) {
    return delivery_metrics_response_create_internal (
        items
        );
}

void delivery_metrics_response_free(delivery_metrics_response_t *delivery_metrics_response) {
    if(NULL == delivery_metrics_response){
        return ;
    }
    if(delivery_metrics_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delivery_metrics_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delivery_metrics_response->items) {
        list_ForEach(listEntry, delivery_metrics_response->items) {
            delivery_metrics_response_items_inner_free(listEntry->data);
        }
        list_freeList(delivery_metrics_response->items);
        delivery_metrics_response->items = NULL;
    }
    free(delivery_metrics_response);
}

cJSON *delivery_metrics_response_convertToJSON(delivery_metrics_response_t *delivery_metrics_response) {
    cJSON *item = cJSON_CreateObject();

    // delivery_metrics_response->items
    if(delivery_metrics_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (delivery_metrics_response->items) {
    list_ForEach(itemsListEntry, delivery_metrics_response->items) {
    cJSON *itemLocal = delivery_metrics_response_items_inner_convertToJSON(itemsListEntry->data);
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

delivery_metrics_response_t *delivery_metrics_response_parseFromJSON(cJSON *delivery_metrics_responseJSON){

    delivery_metrics_response_t *delivery_metrics_response_local_var = NULL;

    // define the local list for delivery_metrics_response->items
    list_t *itemsList = NULL;

    // delivery_metrics_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(delivery_metrics_responseJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
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
        delivery_metrics_response_items_inner_t *itemsItem = delivery_metrics_response_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    delivery_metrics_response_local_var = delivery_metrics_response_create_internal (
        items ? itemsList : NULL
        );

    return delivery_metrics_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            delivery_metrics_response_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
