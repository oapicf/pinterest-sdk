#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pins_list_200_response.h"



static pins_list_200_response_t *pins_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    pins_list_200_response_t *pins_list_200_response_local_var = malloc(sizeof(pins_list_200_response_t));
    if (!pins_list_200_response_local_var) {
        return NULL;
    }
    pins_list_200_response_local_var->bookmark = bookmark;
    pins_list_200_response_local_var->items = items;

    pins_list_200_response_local_var->_library_owned = 1;
    return pins_list_200_response_local_var;
}

__attribute__((deprecated)) pins_list_200_response_t *pins_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    return pins_list_200_response_create_internal (
        bookmark,
        items
        );
}

void pins_list_200_response_free(pins_list_200_response_t *pins_list_200_response) {
    if(NULL == pins_list_200_response){
        return ;
    }
    if(pins_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pins_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pins_list_200_response->bookmark) {
        free(pins_list_200_response->bookmark);
        pins_list_200_response->bookmark = NULL;
    }
    if (pins_list_200_response->items) {
        list_ForEach(listEntry, pins_list_200_response->items) {
            pin_free(listEntry->data);
        }
        list_freeList(pins_list_200_response->items);
        pins_list_200_response->items = NULL;
    }
    free(pins_list_200_response);
}

cJSON *pins_list_200_response_convertToJSON(pins_list_200_response_t *pins_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // pins_list_200_response->bookmark
    if(pins_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", pins_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // pins_list_200_response->items
    if (!pins_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (pins_list_200_response->items) {
    list_ForEach(itemsListEntry, pins_list_200_response->items) {
    cJSON *itemLocal = pin_convertToJSON(itemsListEntry->data);
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

pins_list_200_response_t *pins_list_200_response_parseFromJSON(cJSON *pins_list_200_responseJSON){

    pins_list_200_response_t *pins_list_200_response_local_var = NULL;

    // define the local list for pins_list_200_response->items
    list_t *itemsList = NULL;

    // pins_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(pins_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // pins_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pins_list_200_responseJSON, "items");
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
        pin_t *itemsItem = pin_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    pins_list_200_response_local_var = pins_list_200_response_create_internal (
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL,
        itemsList
        );

    return pins_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            pin_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
