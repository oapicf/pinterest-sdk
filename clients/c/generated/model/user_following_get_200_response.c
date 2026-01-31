#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_following_get_200_response.h"



static user_following_get_200_response_t *user_following_get_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    user_following_get_200_response_t *user_following_get_200_response_local_var = malloc(sizeof(user_following_get_200_response_t));
    if (!user_following_get_200_response_local_var) {
        return NULL;
    }
    user_following_get_200_response_local_var->bookmark = bookmark;
    user_following_get_200_response_local_var->items = items;

    user_following_get_200_response_local_var->_library_owned = 1;
    return user_following_get_200_response_local_var;
}

__attribute__((deprecated)) user_following_get_200_response_t *user_following_get_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    return user_following_get_200_response_create_internal (
        bookmark,
        items
        );
}

void user_following_get_200_response_free(user_following_get_200_response_t *user_following_get_200_response) {
    if(NULL == user_following_get_200_response){
        return ;
    }
    if(user_following_get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_following_get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_following_get_200_response->bookmark) {
        free(user_following_get_200_response->bookmark);
        user_following_get_200_response->bookmark = NULL;
    }
    if (user_following_get_200_response->items) {
        list_ForEach(listEntry, user_following_get_200_response->items) {
            user_summary_free(listEntry->data);
        }
        list_freeList(user_following_get_200_response->items);
        user_following_get_200_response->items = NULL;
    }
    free(user_following_get_200_response);
}

cJSON *user_following_get_200_response_convertToJSON(user_following_get_200_response_t *user_following_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // user_following_get_200_response->bookmark
    if(user_following_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", user_following_get_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // user_following_get_200_response->items
    if (!user_following_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (user_following_get_200_response->items) {
    list_ForEach(itemsListEntry, user_following_get_200_response->items) {
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

user_following_get_200_response_t *user_following_get_200_response_parseFromJSON(cJSON *user_following_get_200_responseJSON){

    user_following_get_200_response_t *user_following_get_200_response_local_var = NULL;

    // define the local list for user_following_get_200_response->items
    list_t *itemsList = NULL;

    // user_following_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(user_following_get_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // user_following_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(user_following_get_200_responseJSON, "items");
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


    user_following_get_200_response_local_var = user_following_get_200_response_create_internal (
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL,
        itemsList
        );

    return user_following_get_200_response_local_var;
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
