#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_order_lines_get_by_ad_account_200_response.h"



ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response_local_var = malloc(sizeof(ssio_order_lines_get_by_ad_account_200_response_t));
    if (!ssio_order_lines_get_by_ad_account_200_response_local_var) {
        return NULL;
    }
    ssio_order_lines_get_by_ad_account_200_response_local_var->items = items;
    ssio_order_lines_get_by_ad_account_200_response_local_var->bookmark = bookmark;

    return ssio_order_lines_get_by_ad_account_200_response_local_var;
}


void ssio_order_lines_get_by_ad_account_200_response_free(ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response) {
    if(NULL == ssio_order_lines_get_by_ad_account_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_order_lines_get_by_ad_account_200_response->items) {
        list_ForEach(listEntry, ssio_order_lines_get_by_ad_account_200_response->items) {
            ssio_order_line_free(listEntry->data);
        }
        list_freeList(ssio_order_lines_get_by_ad_account_200_response->items);
        ssio_order_lines_get_by_ad_account_200_response->items = NULL;
    }
    if (ssio_order_lines_get_by_ad_account_200_response->bookmark) {
        free(ssio_order_lines_get_by_ad_account_200_response->bookmark);
        ssio_order_lines_get_by_ad_account_200_response->bookmark = NULL;
    }
    free(ssio_order_lines_get_by_ad_account_200_response);
}

cJSON *ssio_order_lines_get_by_ad_account_200_response_convertToJSON(ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response) {
    cJSON *item = cJSON_CreateObject();

    // ssio_order_lines_get_by_ad_account_200_response->items
    if (!ssio_order_lines_get_by_ad_account_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ssio_order_lines_get_by_ad_account_200_response->items) {
    list_ForEach(itemsListEntry, ssio_order_lines_get_by_ad_account_200_response->items) {
    cJSON *itemLocal = ssio_order_line_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // ssio_order_lines_get_by_ad_account_200_response->bookmark
    if(ssio_order_lines_get_by_ad_account_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", ssio_order_lines_get_by_ad_account_200_response->bookmark) == NULL) {
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

ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response_parseFromJSON(cJSON *ssio_order_lines_get_by_ad_account_200_responseJSON){

    ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response_local_var = NULL;

    // define the local list for ssio_order_lines_get_by_ad_account_200_response->items
    list_t *itemsList = NULL;

    // ssio_order_lines_get_by_ad_account_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ssio_order_lines_get_by_ad_account_200_responseJSON, "items");
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
        ssio_order_line_t *itemsItem = ssio_order_line_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // ssio_order_lines_get_by_ad_account_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(ssio_order_lines_get_by_ad_account_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    ssio_order_lines_get_by_ad_account_200_response_local_var = ssio_order_lines_get_by_ad_account_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return ssio_order_lines_get_by_ad_account_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ssio_order_line_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
