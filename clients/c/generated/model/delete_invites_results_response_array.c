#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_invites_results_response_array.h"



static delete_invites_results_response_array_t *delete_invites_results_response_array_create_internal(
    list_t *items
    ) {
    delete_invites_results_response_array_t *delete_invites_results_response_array_local_var = malloc(sizeof(delete_invites_results_response_array_t));
    if (!delete_invites_results_response_array_local_var) {
        return NULL;
    }
    delete_invites_results_response_array_local_var->items = items;

    delete_invites_results_response_array_local_var->_library_owned = 1;
    return delete_invites_results_response_array_local_var;
}

__attribute__((deprecated)) delete_invites_results_response_array_t *delete_invites_results_response_array_create(
    list_t *items
    ) {
    return delete_invites_results_response_array_create_internal (
        items
        );
}

void delete_invites_results_response_array_free(delete_invites_results_response_array_t *delete_invites_results_response_array) {
    if(NULL == delete_invites_results_response_array){
        return ;
    }
    if(delete_invites_results_response_array->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_invites_results_response_array_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_invites_results_response_array->items) {
        list_ForEach(listEntry, delete_invites_results_response_array->items) {
            delete_invites_results_response_array_items_inner_free(listEntry->data);
        }
        list_freeList(delete_invites_results_response_array->items);
        delete_invites_results_response_array->items = NULL;
    }
    free(delete_invites_results_response_array);
}

cJSON *delete_invites_results_response_array_convertToJSON(delete_invites_results_response_array_t *delete_invites_results_response_array) {
    cJSON *item = cJSON_CreateObject();

    // delete_invites_results_response_array->items
    if(delete_invites_results_response_array->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (delete_invites_results_response_array->items) {
    list_ForEach(itemsListEntry, delete_invites_results_response_array->items) {
    cJSON *itemLocal = delete_invites_results_response_array_items_inner_convertToJSON(itemsListEntry->data);
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

delete_invites_results_response_array_t *delete_invites_results_response_array_parseFromJSON(cJSON *delete_invites_results_response_arrayJSON){

    delete_invites_results_response_array_t *delete_invites_results_response_array_local_var = NULL;

    // define the local list for delete_invites_results_response_array->items
    list_t *itemsList = NULL;

    // delete_invites_results_response_array->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(delete_invites_results_response_arrayJSON, "items");
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
        delete_invites_results_response_array_items_inner_t *itemsItem = delete_invites_results_response_array_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    delete_invites_results_response_array_local_var = delete_invites_results_response_array_create_internal (
        items ? itemsList : NULL
        );

    return delete_invites_results_response_array_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            delete_invites_results_response_array_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
