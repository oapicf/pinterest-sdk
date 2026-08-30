#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feeds_list_200_response.h"



static feeds_list_200_response_t *feeds_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    feeds_list_200_response_t *feeds_list_200_response_local_var = malloc(sizeof(feeds_list_200_response_t));
    if (!feeds_list_200_response_local_var) {
        return NULL;
    }
    memset(feeds_list_200_response_local_var, 0, sizeof(feeds_list_200_response_t));
    feeds_list_200_response_local_var->_library_owned = 1;
    feeds_list_200_response_local_var->bookmark = bookmark;
    feeds_list_200_response_local_var->items = items;
    return feeds_list_200_response_local_var;
}

__attribute__((deprecated)) feeds_list_200_response_t *feeds_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    feeds_list_200_response_t *result = feeds_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void feeds_list_200_response_free(feeds_list_200_response_t *feeds_list_200_response) {
    if(NULL == feeds_list_200_response){
        return ;
    }
    if(feeds_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "feeds_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (feeds_list_200_response->bookmark) {
        free(feeds_list_200_response->bookmark);
        feeds_list_200_response->bookmark = NULL;
    }
    if (feeds_list_200_response->items) {
        list_ForEach(listEntry, feeds_list_200_response->items) {
            catalogs_feed_free(listEntry->data);
        }
        list_freeList(feeds_list_200_response->items);
        feeds_list_200_response->items = NULL;
    }
    free(feeds_list_200_response);
}

cJSON *feeds_list_200_response_convertToJSON(feeds_list_200_response_t *feeds_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // feeds_list_200_response->bookmark
    if(feeds_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", feeds_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // feeds_list_200_response->items
    if (!feeds_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (feeds_list_200_response->items) {
    list_ForEach(itemsListEntry, feeds_list_200_response->items) {
    cJSON *itemLocal = catalogs_feed_convertToJSON(itemsListEntry->data);
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

feeds_list_200_response_t *feeds_list_200_response_parseFromJSON(cJSON *feeds_list_200_responseJSON){

    feeds_list_200_response_t *feeds_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for feeds_list_200_response->items
    list_t *itemsList = NULL;

    // feeds_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(feeds_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // feeds_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(feeds_list_200_responseJSON, "items");
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
        catalogs_feed_t *itemsItem = catalogs_feed_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    feeds_list_200_response_local_var = feeds_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!feeds_list_200_response_local_var) {
        goto end;
    }

    return feeds_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_feed_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
