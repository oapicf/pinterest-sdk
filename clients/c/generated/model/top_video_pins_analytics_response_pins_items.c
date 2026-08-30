#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_video_pins_analytics_response_pins_items.h"


char* top_video_pins_analytics_response_pins_items_inner_ToString(pinterest_rest_api_top_video_pins_analytics_response_pins_items__e inner) {
    char *innerArray[] =  { "NULL", "PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE" };
    return innerArray[inner - 1];
}

pinterest_rest_api_top_video_pins_analytics_response_pins_items__e top_video_pins_analytics_response_pins_items_inner_FromString(char* inner) {
    int stringToReturn = 0;
    char *innerArray[] =  { "NULL", "PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE" };
    size_t sizeofArray = sizeof(innerArray) / sizeof(innerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(inner, innerArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items_create_internal(
    list_t* data_status,
    list_t* metrics,
    char *pin_id
    ) {
    top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items_local_var = malloc(sizeof(top_video_pins_analytics_response_pins_items_t));
    if (!top_video_pins_analytics_response_pins_items_local_var) {
        return NULL;
    }
    memset(top_video_pins_analytics_response_pins_items_local_var, 0, sizeof(top_video_pins_analytics_response_pins_items_t));
    top_video_pins_analytics_response_pins_items_local_var->_library_owned = 1;
    top_video_pins_analytics_response_pins_items_local_var->data_status = data_status;
    top_video_pins_analytics_response_pins_items_local_var->metrics = metrics;
    top_video_pins_analytics_response_pins_items_local_var->pin_id = pin_id;
    return top_video_pins_analytics_response_pins_items_local_var;
}

__attribute__((deprecated)) top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items_create(
    list_t* data_status,
    list_t* metrics,
    char *pin_id
    ) {
    top_video_pins_analytics_response_pins_items_t *result = top_video_pins_analytics_response_pins_items_create_internal (
        data_status,
        metrics,
        pin_id
        );
    if (!result) {
    }
    return result;
}

void top_video_pins_analytics_response_pins_items_free(top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items) {
    if(NULL == top_video_pins_analytics_response_pins_items){
        return ;
    }
    if(top_video_pins_analytics_response_pins_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "top_video_pins_analytics_response_pins_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (top_video_pins_analytics_response_pins_items->data_status) {
        list_ForEach(listEntry, top_video_pins_analytics_response_pins_items->data_status) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(top_video_pins_analytics_response_pins_items->data_status);
        top_video_pins_analytics_response_pins_items->data_status = NULL;
    }
    if (top_video_pins_analytics_response_pins_items->metrics) {
        list_ForEach(listEntry, top_video_pins_analytics_response_pins_items->metrics) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(top_video_pins_analytics_response_pins_items->metrics);
        top_video_pins_analytics_response_pins_items->metrics = NULL;
    }
    if (top_video_pins_analytics_response_pins_items->pin_id) {
        free(top_video_pins_analytics_response_pins_items->pin_id);
        top_video_pins_analytics_response_pins_items->pin_id = NULL;
    }
    free(top_video_pins_analytics_response_pins_items);
}

cJSON *top_video_pins_analytics_response_pins_items_convertToJSON(top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items) {
    cJSON *item = cJSON_CreateObject();

    // top_video_pins_analytics_response_pins_items->data_status
    if(top_video_pins_analytics_response_pins_items->data_status != pinterest_rest_api_list_t*_DATASTATUS_NULL) {
    cJSON *data_status = cJSON_AddObjectToObject(item, "data_status");
    if(data_status == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = data_status;
    listEntry_t *data_statusListEntry;
    if (top_video_pins_analytics_response_pins_items->data_status) {
    list_ForEach(data_statusListEntry, top_video_pins_analytics_response_pins_items->data_status) {
        keyValuePair_t *localKeyValue = data_statusListEntry->data;
    }
    }
    }


    // top_video_pins_analytics_response_pins_items->metrics
    if(top_video_pins_analytics_response_pins_items->metrics) {
    cJSON *metrics = cJSON_AddObjectToObject(item, "metrics");
    if(metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = metrics;
    listEntry_t *metricsListEntry;
    if (top_video_pins_analytics_response_pins_items->metrics) {
    list_ForEach(metricsListEntry, top_video_pins_analytics_response_pins_items->metrics) {
        keyValuePair_t *localKeyValue = metricsListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // top_video_pins_analytics_response_pins_items->pin_id
    if(top_video_pins_analytics_response_pins_items->pin_id) {
    if(cJSON_AddStringToObject(item, "pin_id", top_video_pins_analytics_response_pins_items->pin_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items_parseFromJSON(cJSON *top_video_pins_analytics_response_pins_itemsJSON){

    top_video_pins_analytics_response_pins_items_t *top_video_pins_analytics_response_pins_items_local_var = NULL;

    // define the local map for top_video_pins_analytics_response_pins_items->data_status
    list_t *data_statusList = NULL;

    // define the local map for top_video_pins_analytics_response_pins_items->metrics
    list_t *metricsList = NULL;

    char *pin_id_local_str = NULL;

    // top_video_pins_analytics_response_pins_items->data_status
    cJSON *data_status = cJSON_GetObjectItemCaseSensitive(top_video_pins_analytics_response_pins_itemsJSON, "data_status");
    if (cJSON_IsNull(data_status)) {
        data_status = NULL;
    }
    if (data_status) { 

    // The data type of the elements in top_video_pins_analytics_response_pins_items->data_status is currently not supported.

    }

    // top_video_pins_analytics_response_pins_items->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(top_video_pins_analytics_response_pins_itemsJSON, "metrics");
    if (cJSON_IsNull(metrics)) {
        metrics = NULL;
    }
    if (metrics) { 
    cJSON *metrics_local_map = NULL;
    if(!cJSON_IsObject(metrics) && !cJSON_IsNull(metrics))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(metrics))
    {
        metricsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(metrics_local_map, metrics)
        {
            cJSON *localMapObject = metrics_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(metricsList , localMapKeyPair);
        }
    }
    }

    // top_video_pins_analytics_response_pins_items->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(top_video_pins_analytics_response_pins_itemsJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    if(!cJSON_IsString(pin_id) && !cJSON_IsNull(pin_id))
    {
    goto end; //String
    }
    }


    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);

    top_video_pins_analytics_response_pins_items_local_var = top_video_pins_analytics_response_pins_items_create_internal (
        data_status ? data_statusList : NULL,
        metrics ? metricsList : NULL,
        pin_id_local_str
        );

    if (!top_video_pins_analytics_response_pins_items_local_var) {
        goto end;
    }

    return top_video_pins_analytics_response_pins_items_local_var;
end:

    // The data type of the elements in top_video_pins_analytics_response_pins_items->data_status is currently not supported.

    if (metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metricsList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(metricsList);
        metricsList = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    return NULL;

}
