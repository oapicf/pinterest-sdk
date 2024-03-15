#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_get_200_response.h"



keywords_get_200_response_t *keywords_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    keywords_get_200_response_t *keywords_get_200_response_local_var = malloc(sizeof(keywords_get_200_response_t));
    if (!keywords_get_200_response_local_var) {
        return NULL;
    }
    keywords_get_200_response_local_var->items = items;
    keywords_get_200_response_local_var->bookmark = bookmark;

    return keywords_get_200_response_local_var;
}


void keywords_get_200_response_free(keywords_get_200_response_t *keywords_get_200_response) {
    if(NULL == keywords_get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_get_200_response->items) {
        list_ForEach(listEntry, keywords_get_200_response->items) {
            keyword_free(listEntry->data);
        }
        list_freeList(keywords_get_200_response->items);
        keywords_get_200_response->items = NULL;
    }
    if (keywords_get_200_response->bookmark) {
        free(keywords_get_200_response->bookmark);
        keywords_get_200_response->bookmark = NULL;
    }
    free(keywords_get_200_response);
}

cJSON *keywords_get_200_response_convertToJSON(keywords_get_200_response_t *keywords_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // keywords_get_200_response->items
    if (!keywords_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (keywords_get_200_response->items) {
    list_ForEach(itemsListEntry, keywords_get_200_response->items) {
    cJSON *itemLocal = keyword_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // keywords_get_200_response->bookmark
    if(keywords_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", keywords_get_200_response->bookmark) == NULL) {
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

keywords_get_200_response_t *keywords_get_200_response_parseFromJSON(cJSON *keywords_get_200_responseJSON){

    keywords_get_200_response_t *keywords_get_200_response_local_var = NULL;

    // define the local list for keywords_get_200_response->items
    list_t *itemsList = NULL;

    // keywords_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(keywords_get_200_responseJSON, "items");
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
        keyword_t *itemsItem = keyword_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // keywords_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(keywords_get_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    keywords_get_200_response_local_var = keywords_get_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return keywords_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            keyword_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
