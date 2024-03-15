#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_lines_list_200_response.h"



order_lines_list_200_response_t *order_lines_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    order_lines_list_200_response_t *order_lines_list_200_response_local_var = malloc(sizeof(order_lines_list_200_response_t));
    if (!order_lines_list_200_response_local_var) {
        return NULL;
    }
    order_lines_list_200_response_local_var->items = items;
    order_lines_list_200_response_local_var->bookmark = bookmark;

    return order_lines_list_200_response_local_var;
}


void order_lines_list_200_response_free(order_lines_list_200_response_t *order_lines_list_200_response) {
    if(NULL == order_lines_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (order_lines_list_200_response->items) {
        list_ForEach(listEntry, order_lines_list_200_response->items) {
            order_line_free(listEntry->data);
        }
        list_freeList(order_lines_list_200_response->items);
        order_lines_list_200_response->items = NULL;
    }
    if (order_lines_list_200_response->bookmark) {
        free(order_lines_list_200_response->bookmark);
        order_lines_list_200_response->bookmark = NULL;
    }
    free(order_lines_list_200_response);
}

cJSON *order_lines_list_200_response_convertToJSON(order_lines_list_200_response_t *order_lines_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // order_lines_list_200_response->items
    if (!order_lines_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (order_lines_list_200_response->items) {
    list_ForEach(itemsListEntry, order_lines_list_200_response->items) {
    cJSON *itemLocal = order_line_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // order_lines_list_200_response->bookmark
    if(order_lines_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", order_lines_list_200_response->bookmark) == NULL) {
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

order_lines_list_200_response_t *order_lines_list_200_response_parseFromJSON(cJSON *order_lines_list_200_responseJSON){

    order_lines_list_200_response_t *order_lines_list_200_response_local_var = NULL;

    // define the local list for order_lines_list_200_response->items
    list_t *itemsList = NULL;

    // order_lines_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(order_lines_list_200_responseJSON, "items");
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
        order_line_t *itemsItem = order_line_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // order_lines_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(order_lines_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    order_lines_list_200_response_local_var = order_lines_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return order_lines_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            order_line_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
