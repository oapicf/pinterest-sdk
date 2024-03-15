#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion_response.h"



product_group_promotion_response_t *product_group_promotion_response_create(
    list_t *items
    ) {
    product_group_promotion_response_t *product_group_promotion_response_local_var = malloc(sizeof(product_group_promotion_response_t));
    if (!product_group_promotion_response_local_var) {
        return NULL;
    }
    product_group_promotion_response_local_var->items = items;

    return product_group_promotion_response_local_var;
}


void product_group_promotion_response_free(product_group_promotion_response_t *product_group_promotion_response) {
    if(NULL == product_group_promotion_response){
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotion_response->items) {
        list_ForEach(listEntry, product_group_promotion_response->items) {
            product_group_promotion_response_item_free(listEntry->data);
        }
        list_freeList(product_group_promotion_response->items);
        product_group_promotion_response->items = NULL;
    }
    free(product_group_promotion_response);
}

cJSON *product_group_promotion_response_convertToJSON(product_group_promotion_response_t *product_group_promotion_response) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotion_response->items
    if(product_group_promotion_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (product_group_promotion_response->items) {
    list_ForEach(itemsListEntry, product_group_promotion_response->items) {
    cJSON *itemLocal = product_group_promotion_response_item_convertToJSON(itemsListEntry->data);
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

product_group_promotion_response_t *product_group_promotion_response_parseFromJSON(cJSON *product_group_promotion_responseJSON){

    product_group_promotion_response_t *product_group_promotion_response_local_var = NULL;

    // define the local list for product_group_promotion_response->items
    list_t *itemsList = NULL;

    // product_group_promotion_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(product_group_promotion_responseJSON, "items");
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
        product_group_promotion_response_item_t *itemsItem = product_group_promotion_response_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    product_group_promotion_response_local_var = product_group_promotion_response_create (
        items ? itemsList : NULL
        );

    return product_group_promotion_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            product_group_promotion_response_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
