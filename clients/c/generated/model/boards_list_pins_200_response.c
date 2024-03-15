#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "boards_list_pins_200_response.h"



boards_list_pins_200_response_t *boards_list_pins_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    boards_list_pins_200_response_t *boards_list_pins_200_response_local_var = malloc(sizeof(boards_list_pins_200_response_t));
    if (!boards_list_pins_200_response_local_var) {
        return NULL;
    }
    boards_list_pins_200_response_local_var->items = items;
    boards_list_pins_200_response_local_var->bookmark = bookmark;

    return boards_list_pins_200_response_local_var;
}


void boards_list_pins_200_response_free(boards_list_pins_200_response_t *boards_list_pins_200_response) {
    if(NULL == boards_list_pins_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (boards_list_pins_200_response->items) {
        list_ForEach(listEntry, boards_list_pins_200_response->items) {
            pin_free(listEntry->data);
        }
        list_freeList(boards_list_pins_200_response->items);
        boards_list_pins_200_response->items = NULL;
    }
    if (boards_list_pins_200_response->bookmark) {
        free(boards_list_pins_200_response->bookmark);
        boards_list_pins_200_response->bookmark = NULL;
    }
    free(boards_list_pins_200_response);
}

cJSON *boards_list_pins_200_response_convertToJSON(boards_list_pins_200_response_t *boards_list_pins_200_response) {
    cJSON *item = cJSON_CreateObject();

    // boards_list_pins_200_response->items
    if (!boards_list_pins_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (boards_list_pins_200_response->items) {
    list_ForEach(itemsListEntry, boards_list_pins_200_response->items) {
    cJSON *itemLocal = pin_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // boards_list_pins_200_response->bookmark
    if(boards_list_pins_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", boards_list_pins_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

boards_list_pins_200_response_t *boards_list_pins_200_response_parseFromJSON(cJSON *boards_list_pins_200_responseJSON){

    boards_list_pins_200_response_t *boards_list_pins_200_response_local_var = NULL;

    // define the local list for boards_list_pins_200_response->items
    list_t *itemsList = NULL;

    // boards_list_pins_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(boards_list_pins_200_responseJSON, "items");
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

    // boards_list_pins_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(boards_list_pins_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    boards_list_pins_200_response_local_var = boards_list_pins_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return boards_list_pins_200_response_local_var;
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
