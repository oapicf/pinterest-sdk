#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_member_assets_get_response.h"



static business_member_assets_get_response_t *business_member_assets_get_response_create_internal(
    char *bookmark,
    list_t *items,
    int *total_data_count,
    total_count_by_entity_status_t *total_data_count_by_status
    ) {
    business_member_assets_get_response_t *business_member_assets_get_response_local_var = malloc(sizeof(business_member_assets_get_response_t));
    if (!business_member_assets_get_response_local_var) {
        return NULL;
    }
    memset(business_member_assets_get_response_local_var, 0, sizeof(business_member_assets_get_response_t));
    business_member_assets_get_response_local_var->_library_owned = 1;
    business_member_assets_get_response_local_var->bookmark = bookmark;
    business_member_assets_get_response_local_var->items = items;
    business_member_assets_get_response_local_var->total_data_count = total_data_count;
    business_member_assets_get_response_local_var->total_data_count_by_status = total_data_count_by_status;
    return business_member_assets_get_response_local_var;
}

__attribute__((deprecated)) business_member_assets_get_response_t *business_member_assets_get_response_create(
    char *bookmark,
    list_t *items,
    int *total_data_count,
    total_count_by_entity_status_t *total_data_count_by_status
    ) {
    int *total_data_count_copy = NULL;
    if (total_data_count) {
        total_data_count_copy = malloc(sizeof(int));
        if (total_data_count_copy) *total_data_count_copy = *total_data_count;
    }
    business_member_assets_get_response_t *result = business_member_assets_get_response_create_internal (
        bookmark,
        items,
        total_data_count_copy,
        total_data_count_by_status
        );
    if (!result) {
        free(total_data_count_copy);
    }
    return result;
}

void business_member_assets_get_response_free(business_member_assets_get_response_t *business_member_assets_get_response) {
    if(NULL == business_member_assets_get_response){
        return ;
    }
    if(business_member_assets_get_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_member_assets_get_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_member_assets_get_response->bookmark) {
        free(business_member_assets_get_response->bookmark);
        business_member_assets_get_response->bookmark = NULL;
    }
    if (business_member_assets_get_response->items) {
        list_ForEach(listEntry, business_member_assets_get_response->items) {
            asset_id_permissions_free(listEntry->data);
        }
        list_freeList(business_member_assets_get_response->items);
        business_member_assets_get_response->items = NULL;
    }
    if (business_member_assets_get_response->total_data_count) {
        free(business_member_assets_get_response->total_data_count);
        business_member_assets_get_response->total_data_count = NULL;
    }
    if (business_member_assets_get_response->total_data_count_by_status) {
        total_count_by_entity_status_free(business_member_assets_get_response->total_data_count_by_status);
        business_member_assets_get_response->total_data_count_by_status = NULL;
    }
    free(business_member_assets_get_response);
}

cJSON *business_member_assets_get_response_convertToJSON(business_member_assets_get_response_t *business_member_assets_get_response) {
    cJSON *item = cJSON_CreateObject();

    // business_member_assets_get_response->bookmark
    if(business_member_assets_get_response->bookmark) {
    if(cJSON_AddStringToObject(item, "bookmark", business_member_assets_get_response->bookmark) == NULL) {
    goto fail; //String
    }
    }


    // business_member_assets_get_response->items
    if (!business_member_assets_get_response->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (business_member_assets_get_response->items) {
    list_ForEach(itemsListEntry, business_member_assets_get_response->items) {
    cJSON *itemLocal = asset_id_permissions_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // business_member_assets_get_response->total_data_count
    if (!business_member_assets_get_response->total_data_count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_data_count", *business_member_assets_get_response->total_data_count) == NULL) {
    goto fail; //Numeric
    }


    // business_member_assets_get_response->total_data_count_by_status
    if(business_member_assets_get_response->total_data_count_by_status) {
    cJSON *total_data_count_by_status_local_JSON = total_count_by_entity_status_convertToJSON(business_member_assets_get_response->total_data_count_by_status);
    if(total_data_count_by_status_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "total_data_count_by_status", total_data_count_by_status_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

business_member_assets_get_response_t *business_member_assets_get_response_parseFromJSON(cJSON *business_member_assets_get_responseJSON){

    business_member_assets_get_response_t *business_member_assets_get_response_local_var = NULL;

    char *bookmark_local_str = NULL;

    // define the local list for business_member_assets_get_response->items
    list_t *itemsList = NULL;

    // define the local variable for business_member_assets_get_response->total_data_count
    int *total_data_count_local_var = NULL;

    // define the local variable for business_member_assets_get_response->total_data_count_by_status
    total_count_by_entity_status_t *total_data_count_by_status_local_nonprim = NULL;

    // business_member_assets_get_response->bookmark
    cJSON *bookmark = cJSON_GetObjectItemCaseSensitive(business_member_assets_get_responseJSON, "bookmark");
    if (cJSON_IsNull(bookmark)) {
        bookmark = NULL;
    }
    if (bookmark) { 
    if(!cJSON_IsString(bookmark) && !cJSON_IsNull(bookmark))
    {
    goto end; //String
    }
    }

    // business_member_assets_get_response->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(business_member_assets_get_responseJSON, "items");
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
        asset_id_permissions_t *itemsItem = asset_id_permissions_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // business_member_assets_get_response->total_data_count
    cJSON *total_data_count = cJSON_GetObjectItemCaseSensitive(business_member_assets_get_responseJSON, "total_data_count");
    if (cJSON_IsNull(total_data_count)) {
        total_data_count = NULL;
    }
    if (!total_data_count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total_data_count))
    {
    goto end; //Numeric
    }
    total_data_count_local_var = malloc(sizeof(int));
    if(!total_data_count_local_var)
    {
        goto end;
    }
    *total_data_count_local_var = total_data_count->valuedouble;

    // business_member_assets_get_response->total_data_count_by_status
    cJSON *total_data_count_by_status = cJSON_GetObjectItemCaseSensitive(business_member_assets_get_responseJSON, "total_data_count_by_status");
    if (cJSON_IsNull(total_data_count_by_status)) {
        total_data_count_by_status = NULL;
    }
    if (total_data_count_by_status) { 
    total_data_count_by_status_local_nonprim = total_count_by_entity_status_parseFromJSON(total_data_count_by_status); //nonprimitive
    }


    if (bookmark && !cJSON_IsNull(bookmark)) bookmark_local_str = strdup(bookmark->valuestring);

    business_member_assets_get_response_local_var = business_member_assets_get_response_create_internal (
        bookmark_local_str,
        itemsList,
        total_data_count_local_var,
        total_data_count_by_status ? total_data_count_by_status_local_nonprim : NULL
        );

    if (!business_member_assets_get_response_local_var) {
        goto end;
    }

    return business_member_assets_get_response_local_var;
end:
    if (bookmark_local_str) {
        free(bookmark_local_str);
        bookmark_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            asset_id_permissions_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (total_data_count_local_var) {
        free(total_data_count_local_var);
        total_data_count_local_var = NULL;
    }
    if (total_data_count_by_status_local_nonprim) {
        total_count_by_entity_status_free(total_data_count_by_status_local_nonprim);
        total_data_count_by_status_local_nonprim = NULL;
    }
    return NULL;

}
