#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_get_200_response.h"



static keywords_get_200_response_t *keywords_get_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    keywords_get_200_response_t *keywords_get_200_response_local_var = malloc(sizeof(keywords_get_200_response_t));
    if (!keywords_get_200_response_local_var) {
        return NULL;
    }
    memset(keywords_get_200_response_local_var, 0, sizeof(keywords_get_200_response_t));
    keywords_get_200_response_local_var->_library_owned = 1;
    keywords_get_200_response_local_var->bookmark = bookmark;
    keywords_get_200_response_local_var->items = items;
    return keywords_get_200_response_local_var;
}

__attribute__((deprecated)) keywords_get_200_response_t *keywords_get_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    keywords_get_200_response_t *result = keywords_get_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void keywords_get_200_response_free(keywords_get_200_response_t *keywords_get_200_response) {
    if(NULL == keywords_get_200_response){
        return ;
    }
    if(keywords_get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keywords_get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_get_200_response->bookmark) {
        free(keywords_get_200_response->bookmark);
        keywords_get_200_response->bookmark = NULL;
    }
    if (keywords_get_200_response->items) {
        list_ForEach(listEntry, keywords_get_200_response->items) {
            keyword_free(listEntry->data);
        }
        list_freeList(keywords_get_200_response->items);
        keywords_get_200_response->items = NULL;
    }
    free(keywords_get_200_response);
}

cJSON *keywords_get_200_response_convertToJSON(keywords_get_200_response_t *keywords_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // keywords_get_200_response->bookmark
    if(keywords_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", keywords_get_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keywords_get_200_response_t *keywords_get_200_response_parseFromJSON(cJSON *keywords_get_200_responseJSON){

    keywords_get_200_response_t *keywords_get_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for keywords_get_200_response->items
    list_t *itemsList = NULL;

    // keywords_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(keywords_get_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // keywords_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(keywords_get_200_responseJSON, "items");
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
        keyword_t *itemsItem = keyword_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    keywords_get_200_response_local_var = keywords_get_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!keywords_get_200_response_local_var) {
        goto end;
    }

    return keywords_get_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
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
