#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotions_list_200_response.h"



static promotions_list_200_response_t *promotions_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    promotions_list_200_response_t *promotions_list_200_response_local_var = malloc(sizeof(promotions_list_200_response_t));
    if (!promotions_list_200_response_local_var) {
        return NULL;
    }
    promotions_list_200_response_local_var->bookmark = bookmark;
    promotions_list_200_response_local_var->items = items;

    promotions_list_200_response_local_var->_library_owned = 1;
    return promotions_list_200_response_local_var;
}

__attribute__((deprecated)) promotions_list_200_response_t *promotions_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    return promotions_list_200_response_create_internal (
        bookmark,
        items
        );
}

void promotions_list_200_response_free(promotions_list_200_response_t *promotions_list_200_response) {
    if(NULL == promotions_list_200_response){
        return ;
    }
    if(promotions_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotions_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotions_list_200_response->bookmark) {
        free(promotions_list_200_response->bookmark);
        promotions_list_200_response->bookmark = NULL;
    }
    if (promotions_list_200_response->items) {
        list_ForEach(listEntry, promotions_list_200_response->items) {
            promotion_response_free(listEntry->data);
        }
        list_freeList(promotions_list_200_response->items);
        promotions_list_200_response->items = NULL;
    }
    free(promotions_list_200_response);
}

cJSON *promotions_list_200_response_convertToJSON(promotions_list_200_response_t *promotions_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // promotions_list_200_response->bookmark
    if(promotions_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", promotions_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // promotions_list_200_response->items
    if (!promotions_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (promotions_list_200_response->items) {
    list_ForEach(itemsListEntry, promotions_list_200_response->items) {
    cJSON *itemLocal = promotion_response_convertToJSON(itemsListEntry->data);
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

promotions_list_200_response_t *promotions_list_200_response_parseFromJSON(cJSON *promotions_list_200_responseJSON){

    promotions_list_200_response_t *promotions_list_200_response_local_var = NULL;

    // define the local list for promotions_list_200_response->items
    list_t *itemsList = NULL;

    // promotions_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(promotions_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // promotions_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(promotions_list_200_responseJSON, "items");
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
        promotion_response_t *itemsItem = promotion_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    promotions_list_200_response_local_var = promotions_list_200_response_create_internal (
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL,
        itemsList
        );

    return promotions_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            promotion_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
