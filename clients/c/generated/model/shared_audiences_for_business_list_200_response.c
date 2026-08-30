#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audiences_for_business_list_200_response.h"



static shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_local_var = malloc(sizeof(shared_audiences_for_business_list_200_response_t));
    if (!shared_audiences_for_business_list_200_response_local_var) {
        return NULL;
    }
    memset(shared_audiences_for_business_list_200_response_local_var, 0, sizeof(shared_audiences_for_business_list_200_response_t));
    shared_audiences_for_business_list_200_response_local_var->_library_owned = 1;
    shared_audiences_for_business_list_200_response_local_var->bookmark = bookmark;
    shared_audiences_for_business_list_200_response_local_var->items = items;
    return shared_audiences_for_business_list_200_response_local_var;
}

__attribute__((deprecated)) shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    shared_audiences_for_business_list_200_response_t *result = shared_audiences_for_business_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void shared_audiences_for_business_list_200_response_free(shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response) {
    if(NULL == shared_audiences_for_business_list_200_response){
        return ;
    }
    if(shared_audiences_for_business_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "shared_audiences_for_business_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (shared_audiences_for_business_list_200_response->bookmark) {
        free(shared_audiences_for_business_list_200_response->bookmark);
        shared_audiences_for_business_list_200_response->bookmark = NULL;
    }
    if (shared_audiences_for_business_list_200_response->items) {
        list_ForEach(listEntry, shared_audiences_for_business_list_200_response->items) {
            audience_free(listEntry->data);
        }
        list_freeList(shared_audiences_for_business_list_200_response->items);
        shared_audiences_for_business_list_200_response->items = NULL;
    }
    free(shared_audiences_for_business_list_200_response);
}

cJSON *shared_audiences_for_business_list_200_response_convertToJSON(shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // shared_audiences_for_business_list_200_response->bookmark
    if(shared_audiences_for_business_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", shared_audiences_for_business_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // shared_audiences_for_business_list_200_response->items
    if (!shared_audiences_for_business_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (shared_audiences_for_business_list_200_response->items) {
    list_ForEach(itemsListEntry, shared_audiences_for_business_list_200_response->items) {
    cJSON *itemLocal = audience_convertToJSON(itemsListEntry->data);
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

shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_parseFromJSON(cJSON *shared_audiences_for_business_list_200_responseJSON){

    shared_audiences_for_business_list_200_response_t *shared_audiences_for_business_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for shared_audiences_for_business_list_200_response->items
    list_t *itemsList = NULL;

    // shared_audiences_for_business_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(shared_audiences_for_business_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // shared_audiences_for_business_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(shared_audiences_for_business_list_200_responseJSON, "items");
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
        audience_t *itemsItem = audience_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    shared_audiences_for_business_list_200_response_local_var = shared_audiences_for_business_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!shared_audiences_for_business_list_200_response_local_var) {
        goto end;
    }

    return shared_audiences_for_business_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            audience_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
