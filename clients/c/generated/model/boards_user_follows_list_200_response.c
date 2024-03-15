#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "boards_user_follows_list_200_response.h"



boards_user_follows_list_200_response_t *boards_user_follows_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    boards_user_follows_list_200_response_t *boards_user_follows_list_200_response_local_var = malloc(sizeof(boards_user_follows_list_200_response_t));
    if (!boards_user_follows_list_200_response_local_var) {
        return NULL;
    }
    boards_user_follows_list_200_response_local_var->items = items;
    boards_user_follows_list_200_response_local_var->bookmark = bookmark;

    return boards_user_follows_list_200_response_local_var;
}


void boards_user_follows_list_200_response_free(boards_user_follows_list_200_response_t *boards_user_follows_list_200_response) {
    if(NULL == boards_user_follows_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (boards_user_follows_list_200_response->items) {
        list_ForEach(listEntry, boards_user_follows_list_200_response->items) {
            board_free(listEntry->data);
        }
        list_freeList(boards_user_follows_list_200_response->items);
        boards_user_follows_list_200_response->items = NULL;
    }
    if (boards_user_follows_list_200_response->bookmark) {
        free(boards_user_follows_list_200_response->bookmark);
        boards_user_follows_list_200_response->bookmark = NULL;
    }
    free(boards_user_follows_list_200_response);
}

cJSON *boards_user_follows_list_200_response_convertToJSON(boards_user_follows_list_200_response_t *boards_user_follows_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // boards_user_follows_list_200_response->items
    if (!boards_user_follows_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (boards_user_follows_list_200_response->items) {
    list_ForEach(itemsListEntry, boards_user_follows_list_200_response->items) {
    cJSON *itemLocal = board_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // boards_user_follows_list_200_response->bookmark
    if(boards_user_follows_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", boards_user_follows_list_200_response->bookmark) == NULL) {
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

boards_user_follows_list_200_response_t *boards_user_follows_list_200_response_parseFromJSON(cJSON *boards_user_follows_list_200_responseJSON){

    boards_user_follows_list_200_response_t *boards_user_follows_list_200_response_local_var = NULL;

    // define the local list for boards_user_follows_list_200_response->items
    list_t *itemsList = NULL;

    // boards_user_follows_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(boards_user_follows_list_200_responseJSON, "items");
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

    // boards_user_follows_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(boards_user_follows_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    boards_user_follows_list_200_response_local_var = boards_user_follows_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return boards_user_follows_list_200_response_local_var;
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
