#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_invites_results_response_array.h"



static update_invites_results_response_array_t *update_invites_results_response_array_create_internal(
    list_t *items
    ) {
    update_invites_results_response_array_t *update_invites_results_response_array_local_var = malloc(sizeof(update_invites_results_response_array_t));
    if (!update_invites_results_response_array_local_var) {
        return NULL;
    }
    memset(update_invites_results_response_array_local_var, 0, sizeof(update_invites_results_response_array_t));
    update_invites_results_response_array_local_var->_library_owned = 1;
    update_invites_results_response_array_local_var->items = items;
    return update_invites_results_response_array_local_var;
}

__attribute__((deprecated)) update_invites_results_response_array_t *update_invites_results_response_array_create(
    list_t *items
    ) {
    update_invites_results_response_array_t *result = update_invites_results_response_array_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void update_invites_results_response_array_free(update_invites_results_response_array_t *update_invites_results_response_array) {
    if(NULL == update_invites_results_response_array){
        return ;
    }
    if(update_invites_results_response_array->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_invites_results_response_array_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_invites_results_response_array->items) {
        list_ForEach(listEntry, update_invites_results_response_array->items) {
            invite_action_result_item_free(listEntry->data);
        }
        list_freeList(update_invites_results_response_array->items);
        update_invites_results_response_array->items = NULL;
    }
    free(update_invites_results_response_array);
}

cJSON *update_invites_results_response_array_convertToJSON(update_invites_results_response_array_t *update_invites_results_response_array) {
    cJSON *item = cJSON_CreateObject();

    // update_invites_results_response_array->items
    if(update_invites_results_response_array->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (update_invites_results_response_array->items) {
    list_ForEach(itemsListEntry, update_invites_results_response_array->items) {
    cJSON *itemLocal = invite_action_result_item_convertToJSON(itemsListEntry->data);
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

update_invites_results_response_array_t *update_invites_results_response_array_parseFromJSON(cJSON *update_invites_results_response_arrayJSON){

    update_invites_results_response_array_t *update_invites_results_response_array_local_var = NULL;

    // define the local list for update_invites_results_response_array->items
    list_t *itemsList = NULL;

    // update_invites_results_response_array->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(update_invites_results_response_arrayJSON, "items");
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
        invite_action_result_item_t *itemsItem = invite_action_result_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }



    update_invites_results_response_array_local_var = update_invites_results_response_array_create_internal (
        items ? itemsList : NULL
        );

    if (!update_invites_results_response_array_local_var) {
        goto end;
    }

    return update_invites_results_response_array_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            invite_action_result_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
