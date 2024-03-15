#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "search_user_boards_get_200_response.h"



search_user_boards_get_200_response_t *search_user_boards_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    search_user_boards_get_200_response_t *search_user_boards_get_200_response_local_var = malloc(sizeof(search_user_boards_get_200_response_t));
    if (!search_user_boards_get_200_response_local_var) {
        return NULL;
    }
    search_user_boards_get_200_response_local_var->items = items;
    search_user_boards_get_200_response_local_var->bookmark = bookmark;

    return search_user_boards_get_200_response_local_var;
}


void search_user_boards_get_200_response_free(search_user_boards_get_200_response_t *search_user_boards_get_200_response) {
    if(NULL == search_user_boards_get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (search_user_boards_get_200_response->items) {
        list_ForEach(listEntry, search_user_boards_get_200_response->items) {
            board_free(listEntry->data);
        }
        list_freeList(search_user_boards_get_200_response->items);
        search_user_boards_get_200_response->items = NULL;
    }
    if (search_user_boards_get_200_response->bookmark) {
        free(search_user_boards_get_200_response->bookmark);
        search_user_boards_get_200_response->bookmark = NULL;
    }
    free(search_user_boards_get_200_response);
}

cJSON *search_user_boards_get_200_response_convertToJSON(search_user_boards_get_200_response_t *search_user_boards_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // search_user_boards_get_200_response->items
    if (!search_user_boards_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (search_user_boards_get_200_response->items) {
    list_ForEach(itemsListEntry, search_user_boards_get_200_response->items) {
    cJSON *itemLocal = board_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // search_user_boards_get_200_response->bookmark
    if(search_user_boards_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", search_user_boards_get_200_response->bookmark) == NULL) {
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

search_user_boards_get_200_response_t *search_user_boards_get_200_response_parseFromJSON(cJSON *search_user_boards_get_200_responseJSON){

    search_user_boards_get_200_response_t *search_user_boards_get_200_response_local_var = NULL;

    // define the local list for search_user_boards_get_200_response->items
    list_t *itemsList = NULL;

    // search_user_boards_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(search_user_boards_get_200_responseJSON, "items");
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
        board_t *itemsItem = board_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // search_user_boards_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(search_user_boards_get_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    search_user_boards_get_200_response_local_var = search_user_boards_get_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return search_user_boards_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            board_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
