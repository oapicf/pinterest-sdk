#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "media_list_200_response.h"



media_list_200_response_t *media_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    media_list_200_response_t *media_list_200_response_local_var = malloc(sizeof(media_list_200_response_t));
    if (!media_list_200_response_local_var) {
        return NULL;
    }
    media_list_200_response_local_var->items = items;
    media_list_200_response_local_var->bookmark = bookmark;

    return media_list_200_response_local_var;
}


void media_list_200_response_free(media_list_200_response_t *media_list_200_response) {
    if(NULL == media_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (media_list_200_response->items) {
        list_ForEach(listEntry, media_list_200_response->items) {
            media_upload_details_free(listEntry->data);
        }
        list_freeList(media_list_200_response->items);
        media_list_200_response->items = NULL;
    }
    if (media_list_200_response->bookmark) {
        free(media_list_200_response->bookmark);
        media_list_200_response->bookmark = NULL;
    }
    free(media_list_200_response);
}

cJSON *media_list_200_response_convertToJSON(media_list_200_response_t *media_list_200_response) {
    cJSON *item = cJSON_CreateObject();

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
    cJSON *itemLocal = media_upload_details_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // media_list_200_response->bookmark
    if(media_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", media_list_200_response->bookmark) == NULL) {
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

media_list_200_response_t *media_list_200_response_parseFromJSON(cJSON *media_list_200_responseJSON){

    media_list_200_response_t *media_list_200_response_local_var = NULL;

    // define the local list for media_list_200_response->items
    list_t *itemsList = NULL;

    // media_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(media_list_200_responseJSON, "items");
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
        media_upload_details_t *itemsItem = media_upload_details_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // media_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(media_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    media_list_200_response_local_var = media_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return media_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            media_upload_details_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
