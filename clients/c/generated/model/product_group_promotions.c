#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotions.h"



static product_group_promotions_t *product_group_promotions_create_internal(
    list_t *items
    ) {
    product_group_promotions_t *product_group_promotions_local_var = malloc(sizeof(product_group_promotions_t));
    if (!product_group_promotions_local_var) {
        return NULL;
    }
    memset(product_group_promotions_local_var, 0, sizeof(product_group_promotions_t));
    product_group_promotions_local_var->_library_owned = 1;
    product_group_promotions_local_var->items = items;
    return product_group_promotions_local_var;
}

__attribute__((deprecated)) product_group_promotions_t *product_group_promotions_create(
    list_t *items
    ) {
    product_group_promotions_t *result = product_group_promotions_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void product_group_promotions_free(product_group_promotions_t *product_group_promotions) {
    if(NULL == product_group_promotions){
        return ;
    }
    if(product_group_promotions->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_promotions_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotions->items) {
        list_ForEach(listEntry, product_group_promotions->items) {
            product_group_promotion_response_item_free(listEntry->data);
        }
        list_freeList(product_group_promotions->items);
        product_group_promotions->items = NULL;
    }
    free(product_group_promotions);
}

cJSON *product_group_promotions_convertToJSON(product_group_promotions_t *product_group_promotions) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotions->items
    if(product_group_promotions->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (product_group_promotions->items) {
    list_ForEach(itemsListEntry, product_group_promotions->items) {
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

product_group_promotions_t *product_group_promotions_parseFromJSON(cJSON *product_group_promotionsJSON){

    product_group_promotions_t *product_group_promotions_local_var = NULL;

    // define the local list for product_group_promotions->items
    list_t *itemsList = NULL;

    // product_group_promotions->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(product_group_promotionsJSON, "items");
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
        product_group_promotion_response_item_t *itemsItem = product_group_promotion_response_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }



    product_group_promotions_local_var = product_group_promotions_create_internal (
        items ? itemsList : NULL
        );

    if (!product_group_promotions_local_var) {
        goto end;
    }

    return product_group_promotions_local_var;
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
