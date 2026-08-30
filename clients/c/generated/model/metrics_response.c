#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metrics_response.h"



static metrics_response_t *metrics_response_create_internal(
    list_t *data
    ) {
    metrics_response_t *metrics_response_local_var = malloc(sizeof(metrics_response_t));
    if (!metrics_response_local_var) {
        return NULL;
    }
    memset(metrics_response_local_var, 0, sizeof(metrics_response_t));
    metrics_response_local_var->_library_owned = 1;
    metrics_response_local_var->data = data;
    return metrics_response_local_var;
}

__attribute__((deprecated)) metrics_response_t *metrics_response_create(
    list_t *data
    ) {
    metrics_response_t *result = metrics_response_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void metrics_response_free(metrics_response_t *metrics_response) {
    if(NULL == metrics_response){
        return ;
    }
    if(metrics_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "metrics_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (metrics_response->data) {
        list_ForEach(listEntry, metrics_response->data) {
            metrics_response_data_items_free(listEntry->data);
        }
        list_freeList(metrics_response->data);
        metrics_response->data = NULL;
    }
    free(metrics_response);
}

cJSON *metrics_response_convertToJSON(metrics_response_t *metrics_response) {
    cJSON *item = cJSON_CreateObject();

    // metrics_response->data
    if(metrics_response->data) {
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (metrics_response->data) {
    list_ForEach(dataListEntry, metrics_response->data) {
    cJSON *itemLocal = metrics_response_data_items_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

metrics_response_t *metrics_response_parseFromJSON(cJSON *metrics_responseJSON){

    metrics_response_t *metrics_response_local_var = NULL;

    // define the local list for metrics_response->data
    list_t *dataList = NULL;

    // metrics_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(metrics_responseJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
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
        metrics_response_data_items_t *dataItem = metrics_response_data_items_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }
    }



    metrics_response_local_var = metrics_response_create_internal (
        data ? dataList : NULL
        );

    if (!metrics_response_local_var) {
        goto end;
    }

    return metrics_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            metrics_response_data_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
