#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_groups_list_200_response.h"



static catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_local_var = malloc(sizeof(catalogs_product_groups_list_200_response_t));
    if (!catalogs_product_groups_list_200_response_local_var) {
        return NULL;
    }
    memset(catalogs_product_groups_list_200_response_local_var, 0, sizeof(catalogs_product_groups_list_200_response_t));
    catalogs_product_groups_list_200_response_local_var->_library_owned = 1;
    catalogs_product_groups_list_200_response_local_var->bookmark = bookmark;
    catalogs_product_groups_list_200_response_local_var->items = items;
    return catalogs_product_groups_list_200_response_local_var;
}

__attribute__((deprecated)) catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    catalogs_product_groups_list_200_response_t *result = catalogs_product_groups_list_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void catalogs_product_groups_list_200_response_free(catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response) {
    if(NULL == catalogs_product_groups_list_200_response){
        return ;
    }
    if(catalogs_product_groups_list_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_groups_list_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_groups_list_200_response->bookmark) {
        free(catalogs_product_groups_list_200_response->bookmark);
        catalogs_product_groups_list_200_response->bookmark = NULL;
    }
    if (catalogs_product_groups_list_200_response->items) {
        list_ForEach(listEntry, catalogs_product_groups_list_200_response->items) {
            catalogs_vertical_product_group_free(listEntry->data);
        }
        list_freeList(catalogs_product_groups_list_200_response->items);
        catalogs_product_groups_list_200_response->items = NULL;
    }
    free(catalogs_product_groups_list_200_response);
}

cJSON *catalogs_product_groups_list_200_response_convertToJSON(catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_groups_list_200_response->bookmark
    if(catalogs_product_groups_list_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", catalogs_product_groups_list_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


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
    cJSON *itemLocal = catalogs_vertical_product_group_convertToJSON(itemsListEntry->data);
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

catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_parseFromJSON(cJSON *catalogs_product_groups_list_200_responseJSON){

    catalogs_product_groups_list_200_response_t *catalogs_product_groups_list_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for catalogs_product_groups_list_200_response->items
    list_t *itemsList = NULL;

    // catalogs_product_groups_list_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_list_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // catalogs_product_groups_list_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_list_200_responseJSON, "items");
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
        catalogs_vertical_product_group_t *itemsItem = catalogs_vertical_product_group_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    catalogs_product_groups_list_200_response_local_var = catalogs_product_groups_list_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!catalogs_product_groups_list_200_response_local_var) {
        goto end;
    }

    return catalogs_product_groups_list_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_vertical_product_group_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
