#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items.h"



catalogs_items_t *catalogs_items_create(
    list_t *items
    ) {
    catalogs_items_t *catalogs_items_local_var = malloc(sizeof(catalogs_items_t));
    if (!catalogs_items_local_var) {
        return NULL;
    }
    catalogs_items_local_var->items = items;

    return catalogs_items_local_var;
}


void catalogs_items_free(catalogs_items_t *catalogs_items) {
    if(NULL == catalogs_items){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items->items) {
        list_ForEach(listEntry, catalogs_items->items) {
            item_response_free(listEntry->data);
        }
        list_freeList(catalogs_items->items);
        catalogs_items->items = NULL;
    }
    free(catalogs_items);
}

cJSON *catalogs_items_convertToJSON(catalogs_items_t *catalogs_items) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items->items
    if(catalogs_items->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_items->items) {
    list_ForEach(itemsListEntry, catalogs_items->items) {
    cJSON *itemLocal = item_response_convertToJSON(itemsListEntry->data);
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

catalogs_items_t *catalogs_items_parseFromJSON(cJSON *catalogs_itemsJSON){

    catalogs_items_t *catalogs_items_local_var = NULL;

    // define the local list for catalogs_items->items
    list_t *itemsList = NULL;

    // catalogs_items->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_itemsJSON, "items");
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
        item_response_t *itemsItem = item_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    catalogs_items_local_var = catalogs_items_create (
        items ? itemsList : NULL
        );

    return catalogs_items_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
