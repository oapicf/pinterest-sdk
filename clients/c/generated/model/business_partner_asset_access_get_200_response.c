#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_partner_asset_access_get_200_response.h"



static business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response_create_internal(
    list_t *items,
    char *bookmark
    ) {
    business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response_local_var = malloc(sizeof(business_partner_asset_access_get_200_response_t));
    if (!business_partner_asset_access_get_200_response_local_var) {
        return NULL;
    }
    business_partner_asset_access_get_200_response_local_var->items = items;
    business_partner_asset_access_get_200_response_local_var->bookmark = bookmark;

    business_partner_asset_access_get_200_response_local_var->_library_owned = 1;
    return business_partner_asset_access_get_200_response_local_var;
}

__attribute__((deprecated)) business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    return business_partner_asset_access_get_200_response_create_internal (
        items,
        bookmark
        );
}

void business_partner_asset_access_get_200_response_free(business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response) {
    if(NULL == business_partner_asset_access_get_200_response){
        return ;
    }
    if(business_partner_asset_access_get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_partner_asset_access_get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_partner_asset_access_get_200_response->items) {
        list_ForEach(listEntry, business_partner_asset_access_get_200_response->items) {
            get_partner_assets_response_free(listEntry->data);
        }
        list_freeList(business_partner_asset_access_get_200_response->items);
        business_partner_asset_access_get_200_response->items = NULL;
    }
    if (business_partner_asset_access_get_200_response->bookmark) {
        free(business_partner_asset_access_get_200_response->bookmark);
        business_partner_asset_access_get_200_response->bookmark = NULL;
    }
    free(business_partner_asset_access_get_200_response);
}

cJSON *business_partner_asset_access_get_200_response_convertToJSON(business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // business_partner_asset_access_get_200_response->items
    if (!business_partner_asset_access_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (business_partner_asset_access_get_200_response->items) {
    list_ForEach(itemsListEntry, business_partner_asset_access_get_200_response->items) {
    cJSON *itemLocal = get_partner_assets_response_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // business_partner_asset_access_get_200_response->bookmark
    if(business_partner_asset_access_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", business_partner_asset_access_get_200_response->bookmark) == NULL) {
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

business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response_parseFromJSON(cJSON *business_partner_asset_access_get_200_responseJSON){

    business_partner_asset_access_get_200_response_t *business_partner_asset_access_get_200_response_local_var = NULL;

    // define the local list for business_partner_asset_access_get_200_response->items
    list_t *itemsList = NULL;

    // business_partner_asset_access_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(business_partner_asset_access_get_200_responseJSON, "items");
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
        get_partner_assets_response_t *itemsItem = get_partner_assets_response_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // business_partner_asset_access_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(business_partner_asset_access_get_200_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    business_partner_asset_access_get_200_response_local_var = business_partner_asset_access_get_200_response_create_internal (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return business_partner_asset_access_get_200_response_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            get_partner_assets_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
