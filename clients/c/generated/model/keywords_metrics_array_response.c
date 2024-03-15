#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keywords_metrics_array_response.h"



keywords_metrics_array_response_t *keywords_metrics_array_response_create(
    list_t *data
    ) {
    keywords_metrics_array_response_t *keywords_metrics_array_response_local_var = malloc(sizeof(keywords_metrics_array_response_t));
    if (!keywords_metrics_array_response_local_var) {
        return NULL;
    }
    keywords_metrics_array_response_local_var->data = data;

    return keywords_metrics_array_response_local_var;
}


void keywords_metrics_array_response_free(keywords_metrics_array_response_t *keywords_metrics_array_response) {
    if(NULL == keywords_metrics_array_response){
        return ;
    }
    listEntry_t *listEntry;
    if (keywords_metrics_array_response->data) {
        list_ForEach(listEntry, keywords_metrics_array_response->data) {
            keyword_metrics_response_free(listEntry->data);
        }
        list_freeList(keywords_metrics_array_response->data);
        keywords_metrics_array_response->data = NULL;
    }
    free(keywords_metrics_array_response);
}

cJSON *keywords_metrics_array_response_convertToJSON(keywords_metrics_array_response_t *keywords_metrics_array_response) {
    cJSON *item = cJSON_CreateObject();

    // keywords_metrics_array_response->data
    if(keywords_metrics_array_response->data) {
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (keywords_metrics_array_response->data) {
    list_ForEach(dataListEntry, keywords_metrics_array_response->data) {
    cJSON *itemLocal = keyword_metrics_response_convertToJSON(dataListEntry->data);
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

keywords_metrics_array_response_t *keywords_metrics_array_response_parseFromJSON(cJSON *keywords_metrics_array_responseJSON){

    keywords_metrics_array_response_t *keywords_metrics_array_response_local_var = NULL;

    // define the local list for keywords_metrics_array_response->data
    list_t *dataList = NULL;

    // keywords_metrics_array_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(keywords_metrics_array_responseJSON, "data");
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
        keyword_metrics_response_t *dataItem = keyword_metrics_response_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }
    }


    keywords_metrics_array_response_local_var = keywords_metrics_array_response_create (
        data ? dataList : NULL
        );

    return keywords_metrics_array_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            keyword_metrics_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
