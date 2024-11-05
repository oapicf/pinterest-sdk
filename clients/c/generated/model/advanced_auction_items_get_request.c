#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_items_get_request.h"



advanced_auction_items_get_request_t *advanced_auction_items_get_request_create(
    char *catalog_id,
    list_t *items
    ) {
    advanced_auction_items_get_request_t *advanced_auction_items_get_request_local_var = malloc(sizeof(advanced_auction_items_get_request_t));
    if (!advanced_auction_items_get_request_local_var) {
        return NULL;
    }
    advanced_auction_items_get_request_local_var->catalog_id = catalog_id;
    advanced_auction_items_get_request_local_var->items = items;

    return advanced_auction_items_get_request_local_var;
}


void advanced_auction_items_get_request_free(advanced_auction_items_get_request_t *advanced_auction_items_get_request) {
    if(NULL == advanced_auction_items_get_request){
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_items_get_request->catalog_id) {
        free(advanced_auction_items_get_request->catalog_id);
        advanced_auction_items_get_request->catalog_id = NULL;
    }
    if (advanced_auction_items_get_request->items) {
        list_ForEach(listEntry, advanced_auction_items_get_request->items) {
            advanced_auction_items_get_record_free(listEntry->data);
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
    cJSON *itemLocal = advanced_auction_items_get_record_convertToJSON(itemsListEntry->data);
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

    // define the local list for advanced_auction_items_get_request->items
    list_t *itemsList = NULL;

    // advanced_auction_items_get_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_requestJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // advanced_auction_items_get_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_requestJSON, "items");
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
        advanced_auction_items_get_record_t *itemsItem = advanced_auction_items_get_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    advanced_auction_items_get_request_local_var = advanced_auction_items_get_request_create (
        strdup(catalog_id->valuestring),
        itemsList
        );

    return advanced_auction_items_get_request_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            advanced_auction_items_get_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
