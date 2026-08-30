#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_items_get_create.h"



static local_inventory_items_get_create_t *local_inventory_items_get_create_create_internal(
    list_t *item_filters
    ) {
    local_inventory_items_get_create_t *local_inventory_items_get_create_local_var = malloc(sizeof(local_inventory_items_get_create_t));
    if (!local_inventory_items_get_create_local_var) {
        return NULL;
    }
    memset(local_inventory_items_get_create_local_var, 0, sizeof(local_inventory_items_get_create_t));
    local_inventory_items_get_create_local_var->_library_owned = 1;
    local_inventory_items_get_create_local_var->item_filters = item_filters;
    return local_inventory_items_get_create_local_var;
}

__attribute__((deprecated)) local_inventory_items_get_create_t *local_inventory_items_get_create_create(
    list_t *item_filters
    ) {
    local_inventory_items_get_create_t *result = local_inventory_items_get_create_create_internal (
        item_filters
        );
    if (!result) {
    }
    return result;
}

void local_inventory_items_get_create_free(local_inventory_items_get_create_t *local_inventory_items_get_create) {
    if(NULL == local_inventory_items_get_create){
        return ;
    }
    if(local_inventory_items_get_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_items_get_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_items_get_create->item_filters) {
        list_ForEach(listEntry, local_inventory_items_get_create->item_filters) {
            item_id_store_code_pair_free(listEntry->data);
        }
        list_freeList(local_inventory_items_get_create->item_filters);
        local_inventory_items_get_create->item_filters = NULL;
    }
    free(local_inventory_items_get_create);
}

cJSON *local_inventory_items_get_create_convertToJSON(local_inventory_items_get_create_t *local_inventory_items_get_create) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_items_get_create->item_filters
    if (!local_inventory_items_get_create->item_filters) {
        goto fail;
    }
    cJSON *item_filters = cJSON_AddArrayToObject(item, "item_filters");
    if(item_filters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *item_filtersListEntry;
    if (local_inventory_items_get_create->item_filters) {
    list_ForEach(item_filtersListEntry, local_inventory_items_get_create->item_filters) {
    cJSON *itemLocal = item_id_store_code_pair_convertToJSON(item_filtersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(item_filters, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_inventory_items_get_create_t *local_inventory_items_get_create_parseFromJSON(cJSON *local_inventory_items_get_createJSON){

    local_inventory_items_get_create_t *local_inventory_items_get_create_local_var = NULL;

    // define the local list for local_inventory_items_get_create->item_filters
    list_t *item_filtersList = NULL;

    // local_inventory_items_get_create->item_filters
    cJSON *item_filters = cJSON_GetObjectItemCaseSensitive(local_inventory_items_get_createJSON, "item_filters");
    if (cJSON_IsNull(item_filters)) {
        item_filters = NULL;
    }
    if (!item_filters) {
        goto end;
    }

    
    cJSON *item_filters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(item_filters)){
        goto end; //nonprimitive container
    }

    item_filtersList = list_createList();

    cJSON_ArrayForEach(item_filters_local_nonprimitive,item_filters )
    {
        if(!cJSON_IsObject(item_filters_local_nonprimitive)){
            goto end;
        }
        item_id_store_code_pair_t *item_filtersItem = item_id_store_code_pair_parseFromJSON(item_filters_local_nonprimitive);

        list_addElement(item_filtersList, item_filtersItem);
    }



    local_inventory_items_get_create_local_var = local_inventory_items_get_create_create_internal (
        item_filtersList
        );

    if (!local_inventory_items_get_create_local_var) {
        goto end;
    }

    return local_inventory_items_get_create_local_var;
end:
    if (item_filtersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, item_filtersList) {
            item_id_store_code_pair_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(item_filtersList);
        item_filtersList = NULL;
    }
    return NULL;

}
