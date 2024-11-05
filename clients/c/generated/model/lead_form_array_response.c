#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_array_response.h"



lead_form_array_response_t *lead_form_array_response_create(
    list_t *items
    ) {
    lead_form_array_response_t *lead_form_array_response_local_var = malloc(sizeof(lead_form_array_response_t));
    if (!lead_form_array_response_local_var) {
        return NULL;
    }
    lead_form_array_response_local_var->items = items;

    return lead_form_array_response_local_var;
}


void lead_form_array_response_free(lead_form_array_response_t *lead_form_array_response) {
    if(NULL == lead_form_array_response){
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_array_response->items) {
        list_ForEach(listEntry, lead_form_array_response->items) {
            lead_form_array_response_items_inner_free(listEntry->data);
        }
        list_freeList(lead_form_array_response->items);
        lead_form_array_response->items = NULL;
    }
    free(lead_form_array_response);
}

cJSON *lead_form_array_response_convertToJSON(lead_form_array_response_t *lead_form_array_response) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_array_response->items
    if(lead_form_array_response->items) {
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (lead_form_array_response->items) {
    list_ForEach(itemsListEntry, lead_form_array_response->items) {
    cJSON *itemLocal = lead_form_array_response_items_inner_convertToJSON(itemsListEntry->data);
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

lead_form_array_response_t *lead_form_array_response_parseFromJSON(cJSON *lead_form_array_responseJSON){

    lead_form_array_response_t *lead_form_array_response_local_var = NULL;

    // define the local list for lead_form_array_response->items
    list_t *itemsList = NULL;

    // lead_form_array_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(lead_form_array_responseJSON, "items");
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
        lead_form_array_response_items_inner_t *itemsItem = lead_form_array_response_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }
    }


    lead_form_array_response_local_var = lead_form_array_response_create (
        items ? itemsList : NULL
        );

    return lead_form_array_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            lead_form_array_response_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
