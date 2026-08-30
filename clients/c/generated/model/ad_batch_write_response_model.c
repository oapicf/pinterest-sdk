#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_batch_write_response_model.h"



static ad_batch_write_response_model_t *ad_batch_write_response_model_create_internal(
    list_t *items
    ) {
    ad_batch_write_response_model_t *ad_batch_write_response_model_local_var = malloc(sizeof(ad_batch_write_response_model_t));
    if (!ad_batch_write_response_model_local_var) {
        return NULL;
    }
    memset(ad_batch_write_response_model_local_var, 0, sizeof(ad_batch_write_response_model_t));
    ad_batch_write_response_model_local_var->_library_owned = 1;
    ad_batch_write_response_model_local_var->items = items;
    return ad_batch_write_response_model_local_var;
}

__attribute__((deprecated)) ad_batch_write_response_model_t *ad_batch_write_response_model_create(
    list_t *items
    ) {
    ad_batch_write_response_model_t *result = ad_batch_write_response_model_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void ad_batch_write_response_model_free(ad_batch_write_response_model_t *ad_batch_write_response_model) {
    if(NULL == ad_batch_write_response_model){
        return ;
    }
    if(ad_batch_write_response_model->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_batch_write_response_model_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_batch_write_response_model->items) {
        list_ForEach(listEntry, ad_batch_write_response_model->items) {
            ad_batch_item_free(listEntry->data);
        }
        list_freeList(ad_batch_write_response_model->items);
        ad_batch_write_response_model->items = NULL;
    }
    free(ad_batch_write_response_model);
}

cJSON *ad_batch_write_response_model_convertToJSON(ad_batch_write_response_model_t *ad_batch_write_response_model) {
    cJSON *item = cJSON_CreateObject();

    // ad_batch_write_response_model->items
    if (!ad_batch_write_response_model->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (ad_batch_write_response_model->items) {
    list_ForEach(itemsListEntry, ad_batch_write_response_model->items) {
    cJSON *itemLocal = ad_batch_item_convertToJSON(itemsListEntry->data);
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

ad_batch_write_response_model_t *ad_batch_write_response_model_parseFromJSON(cJSON *ad_batch_write_response_modelJSON){

    ad_batch_write_response_model_t *ad_batch_write_response_model_local_var = NULL;

    // define the local list for ad_batch_write_response_model->items
    list_t *itemsList = NULL;

    // ad_batch_write_response_model->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(ad_batch_write_response_modelJSON, "items");
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
        ad_batch_item_t *itemsItem = ad_batch_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    ad_batch_write_response_model_local_var = ad_batch_write_response_model_create_internal (
        itemsList
        );

    if (!ad_batch_write_response_model_local_var) {
        goto end;
    }

    return ad_batch_write_response_model_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ad_batch_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
