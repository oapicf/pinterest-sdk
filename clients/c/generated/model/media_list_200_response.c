#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_list_200_response.h"



static media_list_200_response_t *media_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    media_list_200_response_t *media_list_200_response_local_var = malloc(sizeof(media_list_200_response_t));
    if (!media_list_200_response_local_var) {
        return NULL;
    }
    memset(media_list_200_response_local_var, 0, sizeof(media_list_200_response_t));
    media_list_200_response_local_var->_library_owned = 1;
    media_list_200_response_local_var->bookmark = bookmark;
    media_list_200_response_local_var->items = items;
    return media_list_200_response_local_var;
}

__attribute__((deprecated)) media_list_200_response_t *media_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    media_list_200_response_t *result = media_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void media_list_200_response_free(media_list_200_response_t *media_list_200_response) {
    if(NULL == media_list_200_response){
        return ;
    }
    if(media_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "media_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (media_list_200_response->bookmark) {
        free(media_list_200_response->bookmark);
        media_list_200_response->bookmark = NULL;
    }
    if (media_list_200_response->items) {
        list_ForEach(listEntry, media_list_200_response->items) {
            media_free(listEntry->data);
        }
        list_freeList(media_list_200_response->items);
        media_list_200_response->items = NULL;
    }
    free(media_list_200_response);
}

cJSON *media_list_200_response_convertToJSON(media_list_200_response_t *media_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // media_list_200_response->bookmark
    if(media_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", media_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // media_list_200_response->items
    if (!media_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (media_list_200_response->items) {
    list_ForEach(itemsListEntry, media_list_200_response->items) {
    cJSON *itemLocal = media_convertToJSON(itemsListEntry->data);
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

media_list_200_response_t *media_list_200_response_parseFromJSON(cJSON *media_list_200_responseJSON){

    media_list_200_response_t *media_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for media_list_200_response->items
    list_t *itemsList = NULL;

    // media_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(media_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // media_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(media_list_200_responseJSON, "items");
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
        media_t *itemsItem = media_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    media_list_200_response_local_var = media_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!media_list_200_response_local_var) {
        goto end;
    }

    return media_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            media_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
