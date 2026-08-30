#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_items_get_request.h"



static advanced_auction_items_get_request_t *advanced_auction_items_get_request_create_internal(
    char *catalog_id,
    list_t *items
    ) {
    advanced_auction_items_get_request_t *advanced_auction_items_get_request_local_var = malloc(sizeof(advanced_auction_items_get_request_t));
    if (!advanced_auction_items_get_request_local_var) {
        return NULL;
    }
    memset(advanced_auction_items_get_request_local_var, 0, sizeof(advanced_auction_items_get_request_t));
    advanced_auction_items_get_request_local_var->_library_owned = 1;
    advanced_auction_items_get_request_local_var->catalog_id = catalog_id;
    advanced_auction_items_get_request_local_var->items = items;
    return advanced_auction_items_get_request_local_var;
}

__attribute__((deprecated)) advanced_auction_items_get_request_t *advanced_auction_items_get_request_create(
    char *catalog_id,
    list_t *items
    ) {
    advanced_auction_items_get_request_t *result = advanced_auction_items_get_request_create_internal (
        catalog_id,
        items
        );
    if (!result) {
    }
    return result;
}

void advanced_auction_items_get_request_free(advanced_auction_items_get_request_t *advanced_auction_items_get_request) {
    if(NULL == advanced_auction_items_get_request){
        return ;
    }
    if(advanced_auction_items_get_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advanced_auction_items_get_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_items_get_request->catalog_id) {
        free(advanced_auction_items_get_request->catalog_id);
        advanced_auction_items_get_request->catalog_id = NULL;
    }
    if (advanced_auction_items_get_request->items) {
        list_ForEach(listEntry, advanced_auction_items_get_request->items) {
            advanced_auction_key_free(listEntry->data);
        }
        list_freeList(advanced_auction_items_get_request->items);
        advanced_auction_items_get_request->items = NULL;
    }
    free(advanced_auction_items_get_request);
}

cJSON *advanced_auction_items_get_request_convertToJSON(advanced_auction_items_get_request_t *advanced_auction_items_get_request) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_items_get_request->catalog_id
    if (!advanced_auction_items_get_request->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", advanced_auction_items_get_request->catalog_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_items_get_request->items
    if (!advanced_auction_items_get_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (advanced_auction_items_get_request->items) {
    list_ForEach(itemsListEntry, advanced_auction_items_get_request->items) {
    cJSON *itemLocal = advanced_auction_key_convertToJSON(itemsListEntry->data);
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

advanced_auction_items_get_request_t *advanced_auction_items_get_request_parseFromJSON(cJSON *advanced_auction_items_get_requestJSON){

    advanced_auction_items_get_request_t *advanced_auction_items_get_request_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local list for advanced_auction_items_get_request->items
    list_t *itemsList = NULL;

    // advanced_auction_items_get_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // advanced_auction_items_get_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_requestJSON, "items");
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
        advanced_auction_key_t *itemsItem = advanced_auction_key_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);

    advanced_auction_items_get_request_local_var = advanced_auction_items_get_request_create_internal (
        catalog_id_local_str,
        itemsList
        );

    if (!advanced_auction_items_get_request_local_var) {
        goto end;
    }

    return advanced_auction_items_get_request_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            advanced_auction_key_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
