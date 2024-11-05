#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_partner_assets_results_response_array.h"



delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array_create(
    list_t *items
    ) {
    delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array_local_var = malloc(sizeof(delete_partner_assets_results_response_array_t));
    if (!delete_partner_assets_results_response_array_local_var) {
        return NULL;
    }
    delete_partner_assets_results_response_array_local_var->items = items;

    return delete_partner_assets_results_response_array_local_var;
}


void delete_partner_assets_results_response_array_free(delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array) {
    if(NULL == delete_partner_assets_results_response_array){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_partner_assets_results_response_array->items) {
        list_ForEach(listEntry, delete_partner_assets_results_response_array->items) {
            delete_partner_assets_result_free(listEntry->data);
        }
        list_freeList(delete_partner_assets_results_response_array->items);
        delete_partner_assets_results_response_array->items = NULL;
    }
    free(delete_partner_assets_results_response_array);
}

cJSON *delete_partner_assets_results_response_array_convertToJSON(delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array) {
    cJSON *item = cJSON_CreateObject();

    // delete_partner_assets_results_response_array->items
    if(delete_partner_assets_results_response_array->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (delete_partner_assets_results_response_array->items) {
    list_ForEach(itemsListEntry, delete_partner_assets_results_response_array->items) {
    cJSON *itemLocal = delete_partner_assets_result_convertToJSON(itemsListEntry->data);
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

delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array_parseFromJSON(cJSON *delete_partner_assets_results_response_arrayJSON){

    delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array_local_var = NULL;

    // define the local list for delete_partner_assets_results_response_array->items
    list_t *itemsList = NULL;

    // delete_partner_assets_results_response_array->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(delete_partner_assets_results_response_arrayJSON, "items");
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
        delete_partner_assets_result_t *itemsItem = delete_partner_assets_result_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    delete_partner_assets_results_response_array_local_var = delete_partner_assets_results_response_array_create (
        items ? itemsList : NULL
        );

    return delete_partner_assets_results_response_array_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            delete_partner_assets_result_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
