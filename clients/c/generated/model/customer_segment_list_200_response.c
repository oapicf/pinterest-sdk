#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_segment_list_200_response.h"



static customer_segment_list_200_response_t *customer_segment_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    customer_segment_list_200_response_t *customer_segment_list_200_response_local_var = malloc(sizeof(customer_segment_list_200_response_t));
    if (!customer_segment_list_200_response_local_var) {
        return NULL;
    }
    memset(customer_segment_list_200_response_local_var, 0, sizeof(customer_segment_list_200_response_t));
    customer_segment_list_200_response_local_var->_library_owned = 1;
    customer_segment_list_200_response_local_var->bookmark = bookmark;
    customer_segment_list_200_response_local_var->items = items;
    return customer_segment_list_200_response_local_var;
}

__attribute__((deprecated)) customer_segment_list_200_response_t *customer_segment_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    customer_segment_list_200_response_t *result = customer_segment_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void customer_segment_list_200_response_free(customer_segment_list_200_response_t *customer_segment_list_200_response) {
    if(NULL == customer_segment_list_200_response){
        return ;
    }
    if(customer_segment_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_segment_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_segment_list_200_response->bookmark) {
        free(customer_segment_list_200_response->bookmark);
        customer_segment_list_200_response->bookmark = NULL;
    }
    if (customer_segment_list_200_response->items) {
        list_ForEach(listEntry, customer_segment_list_200_response->items) {
            customer_segment_free(listEntry->data);
        }
        list_freeList(customer_segment_list_200_response->items);
        customer_segment_list_200_response->items = NULL;
    }
    free(customer_segment_list_200_response);
}

cJSON *customer_segment_list_200_response_convertToJSON(customer_segment_list_200_response_t *customer_segment_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // customer_segment_list_200_response->bookmark
    if(customer_segment_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", customer_segment_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // customer_segment_list_200_response->items
    if (!customer_segment_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (customer_segment_list_200_response->items) {
    list_ForEach(itemsListEntry, customer_segment_list_200_response->items) {
    cJSON *itemLocal = customer_segment_convertToJSON(itemsListEntry->data);
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

customer_segment_list_200_response_t *customer_segment_list_200_response_parseFromJSON(cJSON *customer_segment_list_200_responseJSON){

    customer_segment_list_200_response_t *customer_segment_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for customer_segment_list_200_response->items
    list_t *itemsList = NULL;

    // customer_segment_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(customer_segment_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // customer_segment_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(customer_segment_list_200_responseJSON, "items");
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
        customer_segment_t *itemsItem = customer_segment_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    customer_segment_list_200_response_local_var = customer_segment_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!customer_segment_list_200_response_local_var) {
        goto end;
    }

    return customer_segment_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            customer_segment_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
