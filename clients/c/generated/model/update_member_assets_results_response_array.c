#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_member_assets_results_response_array.h"



update_member_assets_results_response_array_t *update_member_assets_results_response_array_create(
    list_t *items
    ) {
    update_member_assets_results_response_array_t *update_member_assets_results_response_array_local_var = malloc(sizeof(update_member_assets_results_response_array_t));
    if (!update_member_assets_results_response_array_local_var) {
        return NULL;
    }
    update_member_assets_results_response_array_local_var->items = items;

    return update_member_assets_results_response_array_local_var;
}


void update_member_assets_results_response_array_free(update_member_assets_results_response_array_t *update_member_assets_results_response_array) {
    if(NULL == update_member_assets_results_response_array){
        return ;
    }
    listEntry_t *listEntry;
    if (update_member_assets_results_response_array->items) {
        list_ForEach(listEntry, update_member_assets_results_response_array->items) {
            update_member_assets_results_response_array_items_inner_free(listEntry->data);
        }
        list_freeList(update_member_assets_results_response_array->items);
        update_member_assets_results_response_array->items = NULL;
    }
    free(update_member_assets_results_response_array);
}

cJSON *update_member_assets_results_response_array_convertToJSON(update_member_assets_results_response_array_t *update_member_assets_results_response_array) {
    cJSON *item = cJSON_CreateObject();

    // update_member_assets_results_response_array->items
    if(update_member_assets_results_response_array->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (update_member_assets_results_response_array->items) {
    list_ForEach(itemsListEntry, update_member_assets_results_response_array->items) {
    cJSON *itemLocal = update_member_assets_results_response_array_items_inner_convertToJSON(itemsListEntry->data);
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

update_member_assets_results_response_array_t *update_member_assets_results_response_array_parseFromJSON(cJSON *update_member_assets_results_response_arrayJSON){

    update_member_assets_results_response_array_t *update_member_assets_results_response_array_local_var = NULL;

    // define the local list for update_member_assets_results_response_array->items
    list_t *itemsList = NULL;

    // update_member_assets_results_response_array->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(update_member_assets_results_response_arrayJSON, "items");
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
        update_member_assets_results_response_array_items_inner_t *itemsItem = update_member_assets_results_response_array_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    update_member_assets_results_response_array_local_var = update_member_assets_results_response_array_create (
        items ? itemsList : NULL
        );

    return update_member_assets_results_response_array_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            update_member_assets_results_response_array_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
