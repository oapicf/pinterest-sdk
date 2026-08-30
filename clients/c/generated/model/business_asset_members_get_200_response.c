#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_asset_members_get_200_response.h"



static business_asset_members_get_200_response_t *business_asset_members_get_200_response_create_internal(
    char *bookmark,
    list_t *items
    ) {
    business_asset_members_get_200_response_t *business_asset_members_get_200_response_local_var = malloc(sizeof(business_asset_members_get_200_response_t));
    if (!business_asset_members_get_200_response_local_var) {
        return NULL;
    }
    memset(business_asset_members_get_200_response_local_var, 0, sizeof(business_asset_members_get_200_response_t));
    business_asset_members_get_200_response_local_var->_library_owned = 1;
    business_asset_members_get_200_response_local_var->bookmark = bookmark;
    business_asset_members_get_200_response_local_var->items = items;
    return business_asset_members_get_200_response_local_var;
}

__attribute__((deprecated)) business_asset_members_get_200_response_t *business_asset_members_get_200_response_create(
    char *bookmark,
    list_t *items
    ) {
    business_asset_members_get_200_response_t *result = business_asset_members_get_200_response_create_internal (
        bookmark,
        items
        );
    if (!result) {
    }
    return result;
}

void business_asset_members_get_200_response_free(business_asset_members_get_200_response_t *business_asset_members_get_200_response) {
    if(NULL == business_asset_members_get_200_response){
        return ;
    }
    if(business_asset_members_get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_asset_members_get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_asset_members_get_200_response->bookmark) {
        free(business_asset_members_get_200_response->bookmark);
        business_asset_members_get_200_response->bookmark = NULL;
    }
    if (business_asset_members_get_200_response->items) {
        list_ForEach(listEntry, business_asset_members_get_200_response->items) {
            user_single_asset_binding_free(listEntry->data);
        }
        list_freeList(business_asset_members_get_200_response->items);
        business_asset_members_get_200_response->items = NULL;
    }
    free(business_asset_members_get_200_response);
}

cJSON *business_asset_members_get_200_response_convertToJSON(business_asset_members_get_200_response_t *business_asset_members_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // business_asset_members_get_200_response->bookmark
    if(business_asset_members_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", business_asset_members_get_200_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // business_asset_members_get_200_response->items
    if (!business_asset_members_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (business_asset_members_get_200_response->items) {
    list_ForEach(itemsListEntry, business_asset_members_get_200_response->items) {
    cJSON *itemLocal = user_single_asset_binding_convertToJSON(itemsListEntry->data);
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

business_asset_members_get_200_response_t *business_asset_members_get_200_response_parseFromJSON(cJSON *business_asset_members_get_200_responseJSON){

    business_asset_members_get_200_response_t *business_asset_members_get_200_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for business_asset_members_get_200_response->items
    list_t *itemsList = NULL;

    // business_asset_members_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(business_asset_members_get_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // business_asset_members_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(business_asset_members_get_200_responseJSON, "items");
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
        user_single_asset_binding_t *itemsItem = user_single_asset_binding_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    business_asset_members_get_200_response_local_var = business_asset_members_get_200_response_create_internal (
        bookmark_local_str,
        itemsList
        );

    if (!business_asset_members_get_200_response_local_var) {
        goto end;
    }

    return business_asset_members_get_200_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            user_single_asset_binding_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
