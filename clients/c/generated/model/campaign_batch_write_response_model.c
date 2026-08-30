#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_batch_write_response_model.h"



static campaign_batch_write_response_model_t *campaign_batch_write_response_model_create_internal(
    list_t *items
    ) {
    campaign_batch_write_response_model_t *campaign_batch_write_response_model_local_var = malloc(sizeof(campaign_batch_write_response_model_t));
    if (!campaign_batch_write_response_model_local_var) {
        return NULL;
    }
    memset(campaign_batch_write_response_model_local_var, 0, sizeof(campaign_batch_write_response_model_t));
    campaign_batch_write_response_model_local_var->_library_owned = 1;
    campaign_batch_write_response_model_local_var->items = items;
    return campaign_batch_write_response_model_local_var;
}

__attribute__((deprecated)) campaign_batch_write_response_model_t *campaign_batch_write_response_model_create(
    list_t *items
    ) {
    campaign_batch_write_response_model_t *result = campaign_batch_write_response_model_create_internal (
        items
        );
    if (!result) {
    }
    return result;
}

void campaign_batch_write_response_model_free(campaign_batch_write_response_model_t *campaign_batch_write_response_model) {
    if(NULL == campaign_batch_write_response_model){
        return ;
    }
    if(campaign_batch_write_response_model->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_batch_write_response_model_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_batch_write_response_model->items) {
        list_ForEach(listEntry, campaign_batch_write_response_model->items) {
            campaign_batch_item_free(listEntry->data);
        }
        list_freeList(campaign_batch_write_response_model->items);
        campaign_batch_write_response_model->items = NULL;
    }
    free(campaign_batch_write_response_model);
}

cJSON *campaign_batch_write_response_model_convertToJSON(campaign_batch_write_response_model_t *campaign_batch_write_response_model) {
    cJSON *item = cJSON_CreateObject();

    // campaign_batch_write_response_model->items
    if (!campaign_batch_write_response_model->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (campaign_batch_write_response_model->items) {
    list_ForEach(itemsListEntry, campaign_batch_write_response_model->items) {
    cJSON *itemLocal = campaign_batch_item_convertToJSON(itemsListEntry->data);
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

campaign_batch_write_response_model_t *campaign_batch_write_response_model_parseFromJSON(cJSON *campaign_batch_write_response_modelJSON){

    campaign_batch_write_response_model_t *campaign_batch_write_response_model_local_var = NULL;

    // define the local list for campaign_batch_write_response_model->items
    list_t *itemsList = NULL;

    // campaign_batch_write_response_model->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(campaign_batch_write_response_modelJSON, "items");
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
        campaign_batch_item_t *itemsItem = campaign_batch_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }



    campaign_batch_write_response_model_local_var = campaign_batch_write_response_model_create_internal (
        itemsList
        );

    if (!campaign_batch_write_response_model_local_var) {
        goto end;
    }

    return campaign_batch_write_response_model_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            campaign_batch_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
