#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audiences_list_200_response.h"



audiences_list_200_response_t *audiences_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    audiences_list_200_response_t *audiences_list_200_response_local_var = malloc(sizeof(audiences_list_200_response_t));
    if (!audiences_list_200_response_local_var) {
        return NULL;
    }
    audiences_list_200_response_local_var->items = items;
    audiences_list_200_response_local_var->bookmark = bookmark;

    return audiences_list_200_response_local_var;
}


void audiences_list_200_response_free(audiences_list_200_response_t *audiences_list_200_response) {
    if(NULL == audiences_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (audiences_list_200_response->items) {
        list_ForEach(listEntry, audiences_list_200_response->items) {
            audience_free(listEntry->data);
        }
        list_freeList(audiences_list_200_response->items);
        audiences_list_200_response->items = NULL;
    }
    if (audiences_list_200_response->bookmark) {
        free(audiences_list_200_response->bookmark);
        audiences_list_200_response->bookmark = NULL;
    }
    free(audiences_list_200_response);
}

cJSON *audiences_list_200_response_convertToJSON(audiences_list_200_response_t *audiences_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // audiences_list_200_response->items
    if (!audiences_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (audiences_list_200_response->items) {
    list_ForEach(itemsListEntry, audiences_list_200_response->items) {
    cJSON *itemLocal = audience_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // audiences_list_200_response->bookmark
    if(audiences_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", audiences_list_200_response->bookmark) == NULL) {
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

audiences_list_200_response_t *audiences_list_200_response_parseFromJSON(cJSON *audiences_list_200_responseJSON){

    audiences_list_200_response_t *audiences_list_200_response_local_var = NULL;

    // define the local list for audiences_list_200_response->items
    list_t *itemsList = NULL;

    // audiences_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(audiences_list_200_responseJSON, "items");
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

    // audiences_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(audiences_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    audiences_list_200_response_local_var = audiences_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return audiences_list_200_response_local_var;
end:
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
