#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "page_visit_conversion_tags_get_200_response.h"



page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response_local_var = malloc(sizeof(page_visit_conversion_tags_get_200_response_t));
    if (!page_visit_conversion_tags_get_200_response_local_var) {
        return NULL;
    }
    page_visit_conversion_tags_get_200_response_local_var->items = items;
    page_visit_conversion_tags_get_200_response_local_var->bookmark = bookmark;

    return page_visit_conversion_tags_get_200_response_local_var;
}


void page_visit_conversion_tags_get_200_response_free(page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response) {
    if(NULL == page_visit_conversion_tags_get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (page_visit_conversion_tags_get_200_response->items) {
        list_ForEach(listEntry, page_visit_conversion_tags_get_200_response->items) {
            conversion_event_response_free(listEntry->data);
        }
        list_freeList(page_visit_conversion_tags_get_200_response->items);
        page_visit_conversion_tags_get_200_response->items = NULL;
    }
    if (page_visit_conversion_tags_get_200_response->bookmark) {
        free(page_visit_conversion_tags_get_200_response->bookmark);
        page_visit_conversion_tags_get_200_response->bookmark = NULL;
    }
    free(page_visit_conversion_tags_get_200_response);
}

cJSON *page_visit_conversion_tags_get_200_response_convertToJSON(page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // page_visit_conversion_tags_get_200_response->items
    if (!page_visit_conversion_tags_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (page_visit_conversion_tags_get_200_response->items) {
    list_ForEach(itemsListEntry, page_visit_conversion_tags_get_200_response->items) {
    cJSON *itemLocal = conversion_event_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // page_visit_conversion_tags_get_200_response->bookmark
    if(page_visit_conversion_tags_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", page_visit_conversion_tags_get_200_response->bookmark) == NULL) {
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

page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response_parseFromJSON(cJSON *page_visit_conversion_tags_get_200_responseJSON){

    page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response_local_var = NULL;

    // define the local list for page_visit_conversion_tags_get_200_response->items
    list_t *itemsList = NULL;

    // page_visit_conversion_tags_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(page_visit_conversion_tags_get_200_responseJSON, "items");
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
        conversion_event_response_t *itemsItem = conversion_event_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // page_visit_conversion_tags_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(page_visit_conversion_tags_get_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    page_visit_conversion_tags_get_200_response_local_var = page_visit_conversion_tags_get_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return page_visit_conversion_tags_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            conversion_event_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
