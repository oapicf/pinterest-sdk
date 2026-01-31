#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "followers_list_200_response.h"



static followers_list_200_response_t *followers_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    followers_list_200_response_t *followers_list_200_response_local_var = malloc(sizeof(followers_list_200_response_t));
    if (!followers_list_200_response_local_var) {
        return NULL;
    }
    followers_list_200_response_local_var->bookmark = bookmark;
    followers_list_200_response_local_var->items = items;

    followers_list_200_response_local_var->_library_owned = 1;
    return followers_list_200_response_local_var;
}

__attribute__((deprecated)) followers_list_200_response_t *followers_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    return followers_list_200_response_create_internal (
        bookmark,
        items
        );
}

void followers_list_200_response_free(followers_list_200_response_t *followers_list_200_response) {
    if(NULL == followers_list_200_response){
        return ;
    }
    if(followers_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "followers_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (followers_list_200_response->bookmark) {
        free(followers_list_200_response->bookmark);
        followers_list_200_response->bookmark = NULL;
    }
    if (followers_list_200_response->items) {
        list_ForEach(listEntry, followers_list_200_response->items) {
            user_summary_free(listEntry->data);
        }
        list_freeList(followers_list_200_response->items);
        followers_list_200_response->items = NULL;
    }
    free(followers_list_200_response);
}

cJSON *followers_list_200_response_convertToJSON(followers_list_200_response_t *followers_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // followers_list_200_response->bookmark
    if(followers_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", followers_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // followers_list_200_response->items
    if (!followers_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (followers_list_200_response->items) {
    list_ForEach(itemsListEntry, followers_list_200_response->items) {
    cJSON *itemLocal = user_summary_convertToJSON(itemsListEntry->data);
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

followers_list_200_response_t *followers_list_200_response_parseFromJSON(cJSON *followers_list_200_responseJSON){

    followers_list_200_response_t *followers_list_200_response_local_var = NULL;

    // define the local list for followers_list_200_response->items
    list_t *itemsList = NULL;

    // followers_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(followers_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // followers_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(followers_list_200_responseJSON, "items");
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
        user_summary_t *itemsItem = user_summary_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    followers_list_200_response_local_var = followers_list_200_response_create_internal (
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL,
        itemsList
        );

    return followers_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            user_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
