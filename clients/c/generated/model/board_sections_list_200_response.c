#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_sections_list_200_response.h"



board_sections_list_200_response_t *board_sections_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    board_sections_list_200_response_t *board_sections_list_200_response_local_var = malloc(sizeof(board_sections_list_200_response_t));
    if (!board_sections_list_200_response_local_var) {
        return NULL;
    }
    board_sections_list_200_response_local_var->items = items;
    board_sections_list_200_response_local_var->bookmark = bookmark;

    return board_sections_list_200_response_local_var;
}


void board_sections_list_200_response_free(board_sections_list_200_response_t *board_sections_list_200_response) {
    if(NULL == board_sections_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (board_sections_list_200_response->items) {
        list_ForEach(listEntry, board_sections_list_200_response->items) {
            board_section_free(listEntry->data);
        }
        list_freeList(board_sections_list_200_response->items);
        board_sections_list_200_response->items = NULL;
    }
    if (board_sections_list_200_response->bookmark) {
        free(board_sections_list_200_response->bookmark);
        board_sections_list_200_response->bookmark = NULL;
    }
    free(board_sections_list_200_response);
}

cJSON *board_sections_list_200_response_convertToJSON(board_sections_list_200_response_t *board_sections_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // board_sections_list_200_response->items
    if (!board_sections_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (board_sections_list_200_response->items) {
    list_ForEach(itemsListEntry, board_sections_list_200_response->items) {
    cJSON *itemLocal = board_section_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // board_sections_list_200_response->bookmark
    if(board_sections_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", board_sections_list_200_response->bookmark) == NULL) {
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

board_sections_list_200_response_t *board_sections_list_200_response_parseFromJSON(cJSON *board_sections_list_200_responseJSON){

    board_sections_list_200_response_t *board_sections_list_200_response_local_var = NULL;

    // define the local list for board_sections_list_200_response->items
    list_t *itemsList = NULL;

    // board_sections_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(board_sections_list_200_responseJSON, "items");
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
        board_section_t *itemsItem = board_section_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // board_sections_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(board_sections_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    board_sections_list_200_response_local_var = board_sections_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return board_sections_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            board_section_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
