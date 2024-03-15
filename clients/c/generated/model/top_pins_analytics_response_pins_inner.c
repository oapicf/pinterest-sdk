#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_pins_analytics_response_pins_inner.h"


char* top_pins_analytics_response_pins_inner_inner_ToString(pinterest_rest_api_top_pins_analytics_response_pins_inner__e inner) {
    char *innerArray[] =  { "NULL", "PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE" };
    return innerArray[inner - 1];
}

pinterest_rest_api_top_pins_analytics_response_pins_inner__e top_pins_analytics_response_pins_inner_inner_FromString(char* inner) {
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

top_pins_analytics_response_pins_inner_t *top_pins_analytics_response_pins_inner_create(
    list_t* metrics,
    list_t* data_status,
    char *pin_id
    ) {
    top_pins_analytics_response_pins_inner_t *top_pins_analytics_response_pins_inner_local_var = malloc(sizeof(top_pins_analytics_response_pins_inner_t));
    if (!top_pins_analytics_response_pins_inner_local_var) {
        return NULL;
    }
    top_pins_analytics_response_pins_inner_local_var->metrics = metrics;
    top_pins_analytics_response_pins_inner_local_var->data_status = data_status;
    top_pins_analytics_response_pins_inner_local_var->pin_id = pin_id;

    return top_pins_analytics_response_pins_inner_local_var;
}


void top_pins_analytics_response_pins_inner_free(top_pins_analytics_response_pins_inner_t *top_pins_analytics_response_pins_inner) {
    if(NULL == top_pins_analytics_response_pins_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (top_pins_analytics_response_pins_inner->metrics) {
        list_ForEach(listEntry, top_pins_analytics_response_pins_inner->metrics) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(top_pins_analytics_response_pins_inner->metrics);
        top_pins_analytics_response_pins_inner->metrics = NULL;
    }
    if (top_pins_analytics_response_pins_inner->data_status) {
        list_ForEach(listEntry, top_pins_analytics_response_pins_inner->data_status) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(top_pins_analytics_response_pins_inner->data_status);
        top_pins_analytics_response_pins_inner->data_status = NULL;
    }
    if (top_pins_analytics_response_pins_inner->pin_id) {
        free(top_pins_analytics_response_pins_inner->pin_id);
        top_pins_analytics_response_pins_inner->pin_id = NULL;
    }
    free(top_pins_analytics_response_pins_inner);
}

cJSON *top_pins_analytics_response_pins_inner_convertToJSON(top_pins_analytics_response_pins_inner_t *top_pins_analytics_response_pins_inner) {
    cJSON *item = cJSON_CreateObject();

    // top_pins_analytics_response_pins_inner->metrics
    if(top_pins_analytics_response_pins_inner->metrics) {
    cJSON *metrics = cJSON_AddObjectToObject(item, "metrics");
    if(metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = metrics;
    listEntry_t *metricsListEntry;
    if (top_pins_analytics_response_pins_inner->metrics) {
    list_ForEach(metricsListEntry, top_pins_analytics_response_pins_inner->metrics) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)metricsListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // top_pins_analytics_response_pins_inner->data_status
    if(top_pins_analytics_response_pins_inner->data_status != pinterest_rest_api_top_pins_analytics_response_pins_inner_DATASTATUS_NULL) {
    cJSON *data_status = cJSON_AddObjectToObject(item, "data_status");
    if(data_status == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = data_status;
    listEntry_t *data_statusListEntry;
    if (top_pins_analytics_response_pins_inner->data_status) {
    list_ForEach(data_statusListEntry, top_pins_analytics_response_pins_inner->data_status) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)data_statusListEntry->data;
    }
    }
    }


    // top_pins_analytics_response_pins_inner->pin_id
    if(top_pins_analytics_response_pins_inner->pin_id) {
    if(cJSON_AddStringToObject(item, "pin_id", top_pins_analytics_response_pins_inner->pin_id) == NULL) {
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

top_pins_analytics_response_pins_inner_t *top_pins_analytics_response_pins_inner_parseFromJSON(cJSON *top_pins_analytics_response_pins_innerJSON){

    top_pins_analytics_response_pins_inner_t *top_pins_analytics_response_pins_inner_local_var = NULL;

    // define the local map for top_pins_analytics_response_pins_inner->metrics
    list_t *metricsList = NULL;

    // define the local map for top_pins_analytics_response_pins_inner->data_status
    list_t *data_statusList = NULL;

    // top_pins_analytics_response_pins_inner->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_response_pins_innerJSON, "metrics");
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

    // top_pins_analytics_response_pins_inner->data_status
    cJSON *data_status = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_response_pins_innerJSON, "data_status");
    if (data_status) { 

    // The data type of the elements in top_pins_analytics_response_pins_inner->data_status is currently not supported.

    }

    // top_pins_analytics_response_pins_inner->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(top_pins_analytics_response_pins_innerJSON, "pin_id");
    if (pin_id) { 
    if(!cJSON_IsString(pin_id) && !cJSON_IsNull(pin_id))
    {
    goto end; //String
    }
    }


    top_pins_analytics_response_pins_inner_local_var = top_pins_analytics_response_pins_inner_create (
        metrics ? metricsList : NULL,
        data_status ? data_statusList : NULL,
        pin_id && !cJSON_IsNull(pin_id) ? strdup(pin_id->valuestring) : NULL
        );

    return top_pins_analytics_response_pins_inner_local_var;
end:
    if (metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metricsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(metricsList);
        metricsList = NULL;
    }

    // The data type of the elements in top_pins_analytics_response_pins_inner->data_status is currently not supported.

    return NULL;

}
