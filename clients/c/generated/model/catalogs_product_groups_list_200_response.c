#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_groups_list_200_response.h"



catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_local_var = malloc(sizeof(catalogs_product_groups_list_200_response_t));
    if (!catalogs_product_groups_list_200_response_local_var) {
        return NULL;
    }
    catalogs_product_groups_list_200_response_local_var->items = items;
    catalogs_product_groups_list_200_response_local_var->bookmark = bookmark;

    return catalogs_product_groups_list_200_response_local_var;
}


void catalogs_product_groups_list_200_response_free(catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response) {
    if(NULL == catalogs_product_groups_list_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_groups_list_200_response->items) {
        list_ForEach(listEntry, catalogs_product_groups_list_200_response->items) {
            catalogs_product_groups_list_200_response_all_of_items_inner_free(listEntry->data);
        }
        list_freeList(catalogs_product_groups_list_200_response->items);
        catalogs_product_groups_list_200_response->items = NULL;
    }
    if (catalogs_product_groups_list_200_response->bookmark) {
        free(catalogs_product_groups_list_200_response->bookmark);
        catalogs_product_groups_list_200_response->bookmark = NULL;
    }
    free(catalogs_product_groups_list_200_response);
}

cJSON *catalogs_product_groups_list_200_response_convertToJSON(catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_groups_list_200_response->items
    if (!catalogs_product_groups_list_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_product_groups_list_200_response->items) {
    list_ForEach(itemsListEntry, catalogs_product_groups_list_200_response->items) {
    cJSON *itemLocal = catalogs_product_groups_list_200_response_all_of_items_inner_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // catalogs_product_groups_list_200_response->bookmark
    if(catalogs_product_groups_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", catalogs_product_groups_list_200_response->bookmark) == NULL) {
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

catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_parseFromJSON(cJSON *catalogs_product_groups_list_200_responseJSON){

    catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_local_var = NULL;

    // define the local list for catalogs_product_groups_list_200_response->items
    list_t *itemsList = NULL;

    // catalogs_product_groups_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_list_200_responseJSON, "items");
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
        catalogs_product_groups_list_200_response_all_of_items_inner_t *itemsItem = catalogs_product_groups_list_200_response_all_of_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // catalogs_product_groups_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_list_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    catalogs_product_groups_list_200_response_local_var = catalogs_product_groups_list_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return catalogs_product_groups_list_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_product_groups_list_200_response_all_of_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
