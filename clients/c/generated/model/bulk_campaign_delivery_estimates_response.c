#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_campaign_delivery_estimates_response.h"



static bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_create_internal(
    list_t *data
    ) {
    bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_local_var = malloc(sizeof(bulk_campaign_delivery_estimates_response_t));
    if (!bulk_campaign_delivery_estimates_response_local_var) {
        return NULL;
    }
    memset(bulk_campaign_delivery_estimates_response_local_var, 0, sizeof(bulk_campaign_delivery_estimates_response_t));
    bulk_campaign_delivery_estimates_response_local_var->_library_owned = 1;
    bulk_campaign_delivery_estimates_response_local_var->data = data;
    return bulk_campaign_delivery_estimates_response_local_var;
}

__attribute__((deprecated)) bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_create(
    list_t *data
    ) {
    bulk_campaign_delivery_estimates_response_t *result = bulk_campaign_delivery_estimates_response_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void bulk_campaign_delivery_estimates_response_free(bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response) {
    if(NULL == bulk_campaign_delivery_estimates_response){
        return ;
    }
    if(bulk_campaign_delivery_estimates_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_campaign_delivery_estimates_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_campaign_delivery_estimates_response->data) {
        list_ForEach(listEntry, bulk_campaign_delivery_estimates_response->data) {
            bulk_campaign_delivery_estimates_item_free(listEntry->data);
        }
        list_freeList(bulk_campaign_delivery_estimates_response->data);
        bulk_campaign_delivery_estimates_response->data = NULL;
    }
    free(bulk_campaign_delivery_estimates_response);
}

cJSON *bulk_campaign_delivery_estimates_response_convertToJSON(bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response) {
    cJSON *item = cJSON_CreateObject();

    // bulk_campaign_delivery_estimates_response->data
    if (!bulk_campaign_delivery_estimates_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (bulk_campaign_delivery_estimates_response->data) {
    list_ForEach(dataListEntry, bulk_campaign_delivery_estimates_response->data) {
    cJSON *itemLocal = bulk_campaign_delivery_estimates_item_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_parseFromJSON(cJSON *bulk_campaign_delivery_estimates_responseJSON){

    bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_local_var = NULL;

    // define the local list for bulk_campaign_delivery_estimates_response->data
    list_t *dataList = NULL;

    // bulk_campaign_delivery_estimates_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(bulk_campaign_delivery_estimates_responseJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    cJSON *data_local_nonprimitive = NULL;
    if(!cJSON_IsArray(data)){
        goto end; //nonprimitive container
    }

    dataList = list_createList();

    cJSON_ArrayForEach(data_local_nonprimitive,data )
    {
        if(!cJSON_IsObject(data_local_nonprimitive)){
            goto end;
        }
        bulk_campaign_delivery_estimates_item_t *dataItem = bulk_campaign_delivery_estimates_item_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }



    bulk_campaign_delivery_estimates_response_local_var = bulk_campaign_delivery_estimates_response_create_internal (
        dataList
        );

    if (!bulk_campaign_delivery_estimates_response_local_var) {
        goto end;
    }

    return bulk_campaign_delivery_estimates_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            bulk_campaign_delivery_estimates_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
