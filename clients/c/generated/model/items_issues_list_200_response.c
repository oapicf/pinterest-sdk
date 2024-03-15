#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "items_issues_list_200_response.h"



items_issues_list_200_response_t *items_issues_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    items_issues_list_200_response_t *items_issues_list_200_response_local_var = malloc(sizeof(items_issues_list_200_response_t));
    if (!items_issues_list_200_response_local_var) {
        return NULL;
    }
    items_issues_list_200_response_local_var->items = items;
    items_issues_list_200_response_local_var->bookmark = bookmark;

    return items_issues_list_200_response_local_var;
}


void items_issues_list_200_response_free(items_issues_list_200_response_t *items_issues_list_200_response) {
    if(NULL == items_issues_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (items_issues_list_200_response->items) {
        list_ForEach(listEntry, items_issues_list_200_response->items) {
            catalogs_item_validation_issues_free(listEntry->data);
        }
        list_freeList(items_issues_list_200_response->items);
        items_issues_list_200_response->items = NULL;
    }
    if (items_issues_list_200_response->bookmark) {
        free(items_issues_list_200_response->bookmark);
        items_issues_list_200_response->bookmark = NULL;
    }
    free(items_issues_list_200_response);
}

cJSON *items_issues_list_200_response_convertToJSON(items_issues_list_200_response_t *items_issues_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // items_issues_list_200_response->items
    if (!items_issues_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (items_issues_list_200_response->items) {
    list_ForEach(itemsListEntry, items_issues_list_200_response->items) {
    cJSON *itemLocal = catalogs_item_validation_issues_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // items_issues_list_200_response->bookmark
    if(items_issues_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", items_issues_list_200_response->bookmark) == NULL) {
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

items_issues_list_200_response_t *items_issues_list_200_response_parseFromJSON(cJSON *items_issues_list_200_responseJSON){

    items_issues_list_200_response_t *items_issues_list_200_response_local_var = NULL;

    // define the local list for items_issues_list_200_response->items
    list_t *itemsList = NULL;

    // items_issues_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(items_issues_list_200_responseJSON, "items");
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
        catalogs_item_validation_issues_t *itemsItem = catalogs_item_validation_issues_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // items_issues_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(items_issues_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    items_issues_list_200_response_local_var = items_issues_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return items_issues_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_item_validation_issues_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
