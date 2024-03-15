#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_websites_get_200_response.h"



user_websites_get_200_response_t *user_websites_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    user_websites_get_200_response_t *user_websites_get_200_response_local_var = malloc(sizeof(user_websites_get_200_response_t));
    if (!user_websites_get_200_response_local_var) {
        return NULL;
    }
    user_websites_get_200_response_local_var->items = items;
    user_websites_get_200_response_local_var->bookmark = bookmark;

    return user_websites_get_200_response_local_var;
}


void user_websites_get_200_response_free(user_websites_get_200_response_t *user_websites_get_200_response) {
    if(NULL == user_websites_get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (user_websites_get_200_response->items) {
        list_ForEach(listEntry, user_websites_get_200_response->items) {
            user_website_summary_free(listEntry->data);
        }
        list_freeList(user_websites_get_200_response->items);
        user_websites_get_200_response->items = NULL;
    }
    if (user_websites_get_200_response->bookmark) {
        free(user_websites_get_200_response->bookmark);
        user_websites_get_200_response->bookmark = NULL;
    }
    free(user_websites_get_200_response);
}

cJSON *user_websites_get_200_response_convertToJSON(user_websites_get_200_response_t *user_websites_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // user_websites_get_200_response->items
    if (!user_websites_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (user_websites_get_200_response->items) {
    list_ForEach(itemsListEntry, user_websites_get_200_response->items) {
    cJSON *itemLocal = user_website_summary_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // user_websites_get_200_response->bookmark
    if(user_websites_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", user_websites_get_200_response->bookmark) == NULL) {
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

user_websites_get_200_response_t *user_websites_get_200_response_parseFromJSON(cJSON *user_websites_get_200_responseJSON){

    user_websites_get_200_response_t *user_websites_get_200_response_local_var = NULL;

    // define the local list for user_websites_get_200_response->items
    list_t *itemsList = NULL;

    // user_websites_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(user_websites_get_200_responseJSON, "items");
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
        user_website_summary_t *itemsItem = user_website_summary_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // user_websites_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(user_websites_get_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    user_websites_get_200_response_local_var = user_websites_get_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return user_websites_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            user_website_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
