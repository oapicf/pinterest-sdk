#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metrics_response.h"



metrics_response_t *metrics_response_create(
    list_t *data
    ) {
    metrics_response_t *metrics_response_local_var = malloc(sizeof(metrics_response_t));
    if (!metrics_response_local_var) {
        return NULL;
    }
    metrics_response_local_var->data = data;

    return metrics_response_local_var;
}


void metrics_response_free(metrics_response_t *metrics_response) {
    if(NULL == metrics_response){
        return ;
    }
    listEntry_t *listEntry;
    if (metrics_response->data) {
        list_ForEach(listEntry, metrics_response->data) {
            object_free(listEntry->data);
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
    cJSON *itemLocal = object_convertToJSON(dataListEntry->data);
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
        object_t *dataItem = object_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }
    }


    metrics_response_local_var = metrics_response_create (
        data ? dataList : NULL
        );

    return metrics_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            object_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
