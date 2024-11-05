#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_asset_partners_get_200_response.h"



business_asset_partners_get_200_response_t *business_asset_partners_get_200_response_create(
    list_t *items,
    char *bookmark
    ) {
    business_asset_partners_get_200_response_t *business_asset_partners_get_200_response_local_var = malloc(sizeof(business_asset_partners_get_200_response_t));
    if (!business_asset_partners_get_200_response_local_var) {
        return NULL;
    }
    business_asset_partners_get_200_response_local_var->items = items;
    business_asset_partners_get_200_response_local_var->bookmark = bookmark;

    return business_asset_partners_get_200_response_local_var;
}


void business_asset_partners_get_200_response_free(business_asset_partners_get_200_response_t *business_asset_partners_get_200_response) {
    if(NULL == business_asset_partners_get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (business_asset_partners_get_200_response->items) {
        list_ForEach(listEntry, business_asset_partners_get_200_response->items) {
            user_single_asset_binding_free(listEntry->data);
        }
        list_freeList(business_asset_partners_get_200_response->items);
        business_asset_partners_get_200_response->items = NULL;
    }
    if (business_asset_partners_get_200_response->bookmark) {
        free(business_asset_partners_get_200_response->bookmark);
        business_asset_partners_get_200_response->bookmark = NULL;
    }
    free(business_asset_partners_get_200_response);
}

cJSON *business_asset_partners_get_200_response_convertToJSON(business_asset_partners_get_200_response_t *business_asset_partners_get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // business_asset_partners_get_200_response->items
    if (!business_asset_partners_get_200_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (business_asset_partners_get_200_response->items) {
    list_ForEach(itemsListEntry, business_asset_partners_get_200_response->items) {
    cJSON *itemLocal = user_single_asset_binding_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // business_asset_partners_get_200_response->bookmark
    if(business_asset_partners_get_200_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", business_asset_partners_get_200_response->bookmark) == NULL) {
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

business_asset_partners_get_200_response_t *business_asset_partners_get_200_response_parseFromJSON(cJSON *business_asset_partners_get_200_responseJSON){

    business_asset_partners_get_200_response_t *business_asset_partners_get_200_response_local_var = NULL;

    // define the local list for business_asset_partners_get_200_response->items
    list_t *itemsList = NULL;

    // business_asset_partners_get_200_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(business_asset_partners_get_200_responseJSON, "items");
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

    // business_asset_partners_get_200_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(business_asset_partners_get_200_responseJSON, "bookmark");
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }


    business_asset_partners_get_200_response_local_var = business_asset_partners_get_200_response_create (
        itemsList,
        bookmark && !cJSON_IsNull(bookmark) ? strdup(bookmark->valuestring) : NULL
        );

    return business_asset_partners_get_200_response_local_var;
end:
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
