#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "labels_list_200_response.h"



static labels_list_200_response_t *labels_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    labels_list_200_response_t *labels_list_200_response_local_var = malloc(sizeof(labels_list_200_response_t));
    if (!labels_list_200_response_local_var) {
        return NULL;
    }
    labels_list_200_response_local_var->bookmark = bookmark;
    labels_list_200_response_local_var->items = items;

    labels_list_200_response_local_var->_library_owned = 1;
    return labels_list_200_response_local_var;
}

__attribute__((deprecated)) labels_list_200_response_t *labels_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    return labels_list_200_response_create_internal (
        bookmark,
        items
        );
}

void labels_list_200_response_free(labels_list_200_response_t *labels_list_200_response) {
    if(NULL == labels_list_200_response){
        return ;
    }
    if(labels_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "labels_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (labels_list_200_response->bookmark) {
        free(labels_list_200_response->bookmark);
        labels_list_200_response->bookmark = NULL;
    }
    if (labels_list_200_response->items) {
        list_ForEach(listEntry, labels_list_200_response->items) {
            labels_response_free(listEntry->data);
        }
        list_freeList(labels_list_200_response->items);
        labels_list_200_response->items = NULL;
    }
    free(labels_list_200_response);
}

cJSON *labels_list_200_response_convertToJSON(labels_list_200_response_t *labels_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // labels_list_200_response->bookmark
    if(labels_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", labels_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // labels_list_200_response->items
    if (!labels_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (labels_list_200_response->items) {
    list_ForEach(itemsListEntry, labels_list_200_response->items) {
    cJSON *itemLocal = labels_response_convertToJSON(itemsListEntry->data);
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

labels_list_200_response_t *labels_list_200_response_parseFromJSON(cJSON *labels_list_200_responseJSON){

    labels_list_200_response_t *labels_list_200_response_local_var = NULL;

    // define the local list for labels_list_200_response->items
    list_t *itemsList = NULL;

    // labels_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(labels_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // labels_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(labels_list_200_responseJSON, "items");
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
        labels_response_t *itemsItem = labels_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    labels_list_200_response_local_var = labels_list_200_response_create_internal (
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL,
        itemsList
        );

    return labels_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            labels_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
