#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_processing_results_list_200_response.h"



feed_processing_results_list_200_response_t *feed_processing_results_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    feed_processing_results_list_200_response_t *feed_processing_results_list_200_response_local_var = malloc(sizeof(feed_processing_results_list_200_response_t));
    if (!feed_processing_results_list_200_response_local_var) {
        return NULL;
    }
    feed_processing_results_list_200_response_local_var->items = items;
    feed_processing_results_list_200_response_local_var->bookmark = bookmark;

    return feed_processing_results_list_200_response_local_var;
}


void feed_processing_results_list_200_response_free(feed_processing_results_list_200_response_t *feed_processing_results_list_200_response) {
    if(NULL == feed_processing_results_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_processing_results_list_200_response->items) {
        list_ForEach(listEntry, feed_processing_results_list_200_response->items) {
            catalogs_feed_processing_result_free(listEntry->data);
        }
        list_freeList(feed_processing_results_list_200_response->items);
        feed_processing_results_list_200_response->items = NULL;
    }
    if (feed_processing_results_list_200_response->bookmark) {
        free(feed_processing_results_list_200_response->bookmark);
        feed_processing_results_list_200_response->bookmark = NULL;
    }
    free(feed_processing_results_list_200_response);
}

cJSON *feed_processing_results_list_200_response_convertToJSON(feed_processing_results_list_200_response_t *feed_processing_results_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // feed_processing_results_list_200_response->items
    if (!feed_processing_results_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (feed_processing_results_list_200_response->items) {
    list_ForEach(itemsListEntry, feed_processing_results_list_200_response->items) {
    cJSON *itemLocal = catalogs_feed_processing_result_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // feed_processing_results_list_200_response->bookmark
    if(feed_processing_results_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", feed_processing_results_list_200_response->bookmark) == NULL) {
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

feed_processing_results_list_200_response_t *feed_processing_results_list_200_response_parseFromJSON(cJSON *feed_processing_results_list_200_responseJSON){

    feed_processing_results_list_200_response_t *feed_processing_results_list_200_response_local_var = NULL;

    // define the local list for feed_processing_results_list_200_response->items
    list_t *itemsList = NULL;

    // feed_processing_results_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(feed_processing_results_list_200_responseJSON, "items");
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
        catalogs_feed_processing_result_t *itemsItem = catalogs_feed_processing_result_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // feed_processing_results_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(feed_processing_results_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    feed_processing_results_list_200_response_local_var = feed_processing_results_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return feed_processing_results_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_feed_processing_result_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
