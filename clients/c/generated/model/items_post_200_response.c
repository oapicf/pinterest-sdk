#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "items_post_200_response.h"



static items_post_200_response_t *items_post_200_response_create_internal(
    list_t *items
    ) {
    items_post_200_response_t *items_post_200_response_local_var = malloc(sizeof(items_post_200_response_t));
    if (!items_post_200_response_local_var) {
        return NULL;
    }
    memset(items_post_200_response_local_var, 0, sizeof(items_post_200_response_t));
    items_post_200_response_local_var->_library_owned = 1;
    items_post_200_response_local_var->items = items;
    return items_post_200_response_local_var;
}

__attribute__((deprecated)) items_post_200_response_t *items_post_200_response_create(
    list_t *items
    ) {
    items_post_200_response_t *result = items_post_200_response_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void items_post_200_response_free(items_post_200_response_t *items_post_200_response) {
    if(NULL == items_post_200_response){
        return ;
    }
    if(items_post_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "items_post_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (items_post_200_response->items) {
        list_ForEach(listEntry, items_post_200_response->items) {
            item_response_free(listEntry->data);
        }
        list_freeList(items_post_200_response->items);
        items_post_200_response->items = NULL;
    }
    free(items_post_200_response);
}

cJSON *items_post_200_response_convertToJSON(items_post_200_response_t *items_post_200_response) {
    cJSON *item = cJSON_CreateObject();

    // items_post_200_response->items
    if (!items_post_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (items_post_200_response->items) {
    list_ForEach(itemsListEntry, items_post_200_response->items) {
    cJSON *itemLocal = item_response_convertToJSON(itemsListEntry->data);
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

items_post_200_response_t *items_post_200_response_parseFromJSON(cJSON *items_post_200_responseJSON){

    items_post_200_response_t *items_post_200_response_local_var = NULL;

    // define the local list for items_post_200_response->items
    list_t *itemsList = NULL;

    // items_post_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(items_post_200_responseJSON, "items");
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
        item_response_t *itemsItem = item_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    items_post_200_response_local_var = items_post_200_response_create_internal (
        itemsList
        );

    if (!items_post_200_response_local_var) {
        goto end;
    }

    return items_post_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
