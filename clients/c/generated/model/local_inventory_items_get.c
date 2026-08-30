#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_items_get.h"



static local_inventory_items_get_t *local_inventory_items_get_create_internal(
    list_t *items
    ) {
    local_inventory_items_get_t *local_inventory_items_get_local_var = malloc(sizeof(local_inventory_items_get_t));
    if (!local_inventory_items_get_local_var) {
        return NULL;
    }
    memset(local_inventory_items_get_local_var, 0, sizeof(local_inventory_items_get_t));
    local_inventory_items_get_local_var->_library_owned = 1;
    local_inventory_items_get_local_var->items = items;
    return local_inventory_items_get_local_var;
}

__attribute__((deprecated)) local_inventory_items_get_t *local_inventory_items_get_create(
    list_t *items
    ) {
    local_inventory_items_get_t *result = local_inventory_items_get_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void local_inventory_items_get_free(local_inventory_items_get_t *local_inventory_items_get) {
    if(NULL == local_inventory_items_get){
        return ;
    }
    if(local_inventory_items_get->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_items_get_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_items_get->items) {
        list_ForEach(listEntry, local_inventory_items_get->items) {
            local_inventory_item_response_free(listEntry->data);
        }
        list_freeList(local_inventory_items_get->items);
        local_inventory_items_get->items = NULL;
    }
    free(local_inventory_items_get);
}

cJSON *local_inventory_items_get_convertToJSON(local_inventory_items_get_t *local_inventory_items_get) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_items_get->items
    if (!local_inventory_items_get->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (local_inventory_items_get->items) {
    list_ForEach(itemsListEntry, local_inventory_items_get->items) {
    cJSON *itemLocal = local_inventory_item_response_convertToJSON(itemsListEntry->data);
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

local_inventory_items_get_t *local_inventory_items_get_parseFromJSON(cJSON *local_inventory_items_getJSON){

    local_inventory_items_get_t *local_inventory_items_get_local_var = NULL;

    // define the local list for local_inventory_items_get->items
    list_t *itemsList = NULL;

    // local_inventory_items_get->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(local_inventory_items_getJSON, "items");
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
        local_inventory_item_response_t *itemsItem = local_inventory_item_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    local_inventory_items_get_local_var = local_inventory_items_get_create_internal (
        itemsList
        );

    if (!local_inventory_items_get_local_var) {
        goto end;
    }

    return local_inventory_items_get_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            local_inventory_item_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
