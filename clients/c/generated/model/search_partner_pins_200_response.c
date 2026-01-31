#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "search_partner_pins_200_response.h"



static search_partner_pins_200_response_t *search_partner_pins_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    search_partner_pins_200_response_t *search_partner_pins_200_response_local_var = malloc(sizeof(search_partner_pins_200_response_t));
    if (!search_partner_pins_200_response_local_var) {
        return NULL;
    }
    search_partner_pins_200_response_local_var->bookmark = bookmark;
    search_partner_pins_200_response_local_var->items = items;

    search_partner_pins_200_response_local_var->_library_owned = 1;
    return search_partner_pins_200_response_local_var;
}

__attribute__((deprecated)) search_partner_pins_200_response_t *search_partner_pins_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    return search_partner_pins_200_response_create_internal (
        bookmark,
        items
        );
}

void search_partner_pins_200_response_free(search_partner_pins_200_response_t *search_partner_pins_200_response) {
    if(NULL == search_partner_pins_200_response){
        return ;
    }
    if(search_partner_pins_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "search_partner_pins_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (search_partner_pins_200_response->bookmark) {
        free(search_partner_pins_200_response->bookmark);
        search_partner_pins_200_response->bookmark = NULL;
    }
    if (search_partner_pins_200_response->items) {
        list_ForEach(listEntry, search_partner_pins_200_response->items) {
            summary_pin_free(listEntry->data);
        }
        list_freeList(search_partner_pins_200_response->items);
        search_partner_pins_200_response->items = NULL;
    }
    free(search_partner_pins_200_response);
}

cJSON *search_partner_pins_200_response_convertToJSON(search_partner_pins_200_response_t *search_partner_pins_200_response) {
    cJSON *item = cJSON_CreateObject();

    // search_partner_pins_200_response->bookmark
    if(search_partner_pins_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", search_partner_pins_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // search_partner_pins_200_response->items
    if (!search_partner_pins_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (search_partner_pins_200_response->items) {
    list_ForEach(itemsListEntry, search_partner_pins_200_response->items) {
    cJSON *itemLocal = summary_pin_convertToJSON(itemsListEntry->data);
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

search_partner_pins_200_response_t *search_partner_pins_200_response_parseFromJSON(cJSON *search_partner_pins_200_responseJSON){

    search_partner_pins_200_response_t *search_partner_pins_200_response_local_var = NULL;

    // define the local list for search_partner_pins_200_response->items
    list_t *itemsList = NULL;

    // search_partner_pins_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(search_partner_pins_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // search_partner_pins_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(search_partner_pins_200_responseJSON, "items");
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
        summary_pin_t *itemsItem = summary_pin_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    search_partner_pins_200_response_local_var = search_partner_pins_200_response_create_internal (
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL,
        itemsList
        );

    return search_partner_pins_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            summary_pin_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
