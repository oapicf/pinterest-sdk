#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_invites_results_response_array.h"



static create_invites_results_response_array_t *create_invites_results_response_array_create_internal(
    list_t *items
    ) {
    create_invites_results_response_array_t *create_invites_results_response_array_local_var = malloc(sizeof(create_invites_results_response_array_t));
    if (!create_invites_results_response_array_local_var) {
        return NULL;
    }
    memset(create_invites_results_response_array_local_var, 0, sizeof(create_invites_results_response_array_t));
    create_invites_results_response_array_local_var->_library_owned = 1;
    create_invites_results_response_array_local_var->items = items;
    return create_invites_results_response_array_local_var;
}

__attribute__((deprecated)) create_invites_results_response_array_t *create_invites_results_response_array_create(
    list_t *items
    ) {
    create_invites_results_response_array_t *result = create_invites_results_response_array_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void create_invites_results_response_array_free(create_invites_results_response_array_t *create_invites_results_response_array) {
    if(NULL == create_invites_results_response_array){
        return ;
    }
    if(create_invites_results_response_array->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_invites_results_response_array_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_invites_results_response_array->items) {
        list_ForEach(listEntry, create_invites_results_response_array->items) {
            invite_action_result_item_free(listEntry->data);
        }
        list_freeList(create_invites_results_response_array->items);
        create_invites_results_response_array->items = NULL;
    }
    free(create_invites_results_response_array);
}

cJSON *create_invites_results_response_array_convertToJSON(create_invites_results_response_array_t *create_invites_results_response_array) {
    cJSON *item = cJSON_CreateObject();

    // create_invites_results_response_array->items
    if(create_invites_results_response_array->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (create_invites_results_response_array->items) {
    list_ForEach(itemsListEntry, create_invites_results_response_array->items) {
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

create_invites_results_response_array_t *create_invites_results_response_array_parseFromJSON(cJSON *create_invites_results_response_arrayJSON){

    create_invites_results_response_array_t *create_invites_results_response_array_local_var = NULL;

    // define the local list for create_invites_results_response_array->items
    list_t *itemsList = NULL;

    // create_invites_results_response_array->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(create_invites_results_response_arrayJSON, "items");
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



    create_invites_results_response_array_local_var = create_invites_results_response_array_create_internal (
        items ? itemsList : NULL
        );

    if (!create_invites_results_response_array_local_var) {
        goto end;
    }

    return create_invites_results_response_array_local_var;
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
