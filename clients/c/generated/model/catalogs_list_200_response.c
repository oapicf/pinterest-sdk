#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_list_200_response.h"



catalogs_list_200_response_t *catalogs_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    catalogs_list_200_response_t *catalogs_list_200_response_local_var = malloc(sizeof(catalogs_list_200_response_t));
    if (!catalogs_list_200_response_local_var) {
        return NULL;
    }
    catalogs_list_200_response_local_var->items = items;
    catalogs_list_200_response_local_var->bookmark = bookmark;

    return catalogs_list_200_response_local_var;
}


void catalogs_list_200_response_free(catalogs_list_200_response_t *catalogs_list_200_response) {
    if(NULL == catalogs_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_list_200_response->items) {
        list_ForEach(listEntry, catalogs_list_200_response->items) {
            catalog_free(listEntry->data);
        }
        list_freeList(catalogs_list_200_response->items);
        catalogs_list_200_response->items = NULL;
    }
    if (catalogs_list_200_response->bookmark) {
        free(catalogs_list_200_response->bookmark);
        catalogs_list_200_response->bookmark = NULL;
    }
    free(catalogs_list_200_response);
}

cJSON *catalogs_list_200_response_convertToJSON(catalogs_list_200_response_t *catalogs_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_list_200_response->items
    if (!catalogs_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_list_200_response->items) {
    list_ForEach(itemsListEntry, catalogs_list_200_response->items) {
    cJSON *itemLocal = catalog_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // catalogs_list_200_response->bookmark
    if(catalogs_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", catalogs_list_200_response->bookmark) == NULL) {
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

catalogs_list_200_response_t *catalogs_list_200_response_parseFromJSON(cJSON *catalogs_list_200_responseJSON){

    catalogs_list_200_response_t *catalogs_list_200_response_local_var = NULL;

    // define the local list for catalogs_list_200_response->items
    list_t *itemsList = NULL;

    // catalogs_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_list_200_responseJSON, "items");
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
        catalog_t *itemsItem = catalog_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // catalogs_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(catalogs_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    catalogs_list_200_response_local_var = catalogs_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return catalogs_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalog_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
