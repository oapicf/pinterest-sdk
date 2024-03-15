#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_analytics_metrics_response.h"



pin_analytics_metrics_response_t *pin_analytics_metrics_response_create(
    list_t* lifetime_metrics,
    list_t *daily_metrics,
    list_t* summary_metrics
    ) {
    pin_analytics_metrics_response_t *pin_analytics_metrics_response_local_var = malloc(sizeof(pin_analytics_metrics_response_t));
    if (!pin_analytics_metrics_response_local_var) {
        return NULL;
    }
    pin_analytics_metrics_response_local_var->lifetime_metrics = lifetime_metrics;
    pin_analytics_metrics_response_local_var->daily_metrics = daily_metrics;
    pin_analytics_metrics_response_local_var->summary_metrics = summary_metrics;

    return pin_analytics_metrics_response_local_var;
}


void pin_analytics_metrics_response_free(pin_analytics_metrics_response_t *pin_analytics_metrics_response) {
    if(NULL == pin_analytics_metrics_response){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_analytics_metrics_response->lifetime_metrics) {
        list_ForEach(listEntry, pin_analytics_metrics_response->lifetime_metrics) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(pin_analytics_metrics_response->lifetime_metrics);
        pin_analytics_metrics_response->lifetime_metrics = NULL;
    }
    if (pin_analytics_metrics_response->daily_metrics) {
        list_ForEach(listEntry, pin_analytics_metrics_response->daily_metrics) {
            pin_analytics_metrics_response_daily_metrics_inner_free(listEntry->data);
        }
        list_freeList(pin_analytics_metrics_response->daily_metrics);
        pin_analytics_metrics_response->daily_metrics = NULL;
    }
    if (pin_analytics_metrics_response->summary_metrics) {
        list_ForEach(listEntry, pin_analytics_metrics_response->summary_metrics) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(pin_analytics_metrics_response->summary_metrics);
        pin_analytics_metrics_response->summary_metrics = NULL;
    }
    free(pin_analytics_metrics_response);
}

cJSON *pin_analytics_metrics_response_convertToJSON(pin_analytics_metrics_response_t *pin_analytics_metrics_response) {
    cJSON *item = cJSON_CreateObject();

    // pin_analytics_metrics_response->lifetime_metrics
    if(pin_analytics_metrics_response->lifetime_metrics) {
    cJSON *lifetime_metrics = cJSON_AddObjectToObject(item, "lifetime_metrics");
    if(lifetime_metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = lifetime_metrics;
    listEntry_t *lifetime_metricsListEntry;
    if (pin_analytics_metrics_response->lifetime_metrics) {
    list_ForEach(lifetime_metricsListEntry, pin_analytics_metrics_response->lifetime_metrics) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)lifetime_metricsListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // pin_analytics_metrics_response->daily_metrics
    if(pin_analytics_metrics_response->daily_metrics) {
    cJSON *daily_metrics = cJSON_AddArrayToObject(item, "daily_metrics");
    if(daily_metrics == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *daily_metricsListEntry;
    if (pin_analytics_metrics_response->daily_metrics) {
    list_ForEach(daily_metricsListEntry, pin_analytics_metrics_response->daily_metrics) {
    cJSON *itemLocal = pin_analytics_metrics_response_daily_metrics_inner_convertToJSON(daily_metricsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(daily_metrics, itemLocal);
    }
    }
    }


    // pin_analytics_metrics_response->summary_metrics
    if(pin_analytics_metrics_response->summary_metrics) {
    cJSON *summary_metrics = cJSON_AddObjectToObject(item, "summary_metrics");
    if(summary_metrics == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = summary_metrics;
    listEntry_t *summary_metricsListEntry;
    if (pin_analytics_metrics_response->summary_metrics) {
    list_ForEach(summary_metricsListEntry, pin_analytics_metrics_response->summary_metrics) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)summary_metricsListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
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

pin_analytics_metrics_response_t *pin_analytics_metrics_response_parseFromJSON(cJSON *pin_analytics_metrics_responseJSON){

    pin_analytics_metrics_response_t *pin_analytics_metrics_response_local_var = NULL;

    // define the local map for pin_analytics_metrics_response->lifetime_metrics
    list_t *lifetime_metricsList = NULL;

    // define the local list for pin_analytics_metrics_response->daily_metrics
    list_t *daily_metricsList = NULL;

    // define the local map for pin_analytics_metrics_response->summary_metrics
    list_t *summary_metricsList = NULL;

    // pin_analytics_metrics_response->lifetime_metrics
    cJSON *lifetime_metrics = cJSON_GetObjectItemCaseSensitive(pin_analytics_metrics_responseJSON, "lifetime_metrics");
    if (lifetime_metrics) { 
    cJSON *lifetime_metrics_local_map = NULL;
    if(!cJSON_IsObject(lifetime_metrics) && !cJSON_IsNull(lifetime_metrics))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(lifetime_metrics))
    {
        lifetime_metricsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(lifetime_metrics_local_map, lifetime_metrics)
        {
            cJSON *localMapObject = lifetime_metrics_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(lifetime_metricsList , localMapKeyPair);
        }
    }
    }

    // pin_analytics_metrics_response->daily_metrics
    cJSON *daily_metrics = cJSON_GetObjectItemCaseSensitive(pin_analytics_metrics_responseJSON, "daily_metrics");
    if (daily_metrics) { 
    cJSON *daily_metrics_local_nonprimitive = NULL;
    if(!cJSON_IsArray(daily_metrics)){
        goto end; //nonprimitive container
    }

    daily_metricsList = list_createList();

    cJSON_ArrayForEach(daily_metrics_local_nonprimitive,daily_metrics )
    {
        if(!cJSON_IsObject(daily_metrics_local_nonprimitive)){
            goto end;
        }
        pin_analytics_metrics_response_daily_metrics_inner_t *daily_metricsItem = pin_analytics_metrics_response_daily_metrics_inner_parseFromJSON(daily_metrics_local_nonprimitive);

        list_addElement(daily_metricsList, daily_metricsItem);
    }
    }

    // pin_analytics_metrics_response->summary_metrics
    cJSON *summary_metrics = cJSON_GetObjectItemCaseSensitive(pin_analytics_metrics_responseJSON, "summary_metrics");
    if (summary_metrics) { 
    cJSON *summary_metrics_local_map = NULL;
    if(!cJSON_IsObject(summary_metrics) && !cJSON_IsNull(summary_metrics))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(summary_metrics))
    {
        summary_metricsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(summary_metrics_local_map, summary_metrics)
        {
            cJSON *localMapObject = summary_metrics_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(summary_metricsList , localMapKeyPair);
        }
    }
    }


    pin_analytics_metrics_response_local_var = pin_analytics_metrics_response_create (
        lifetime_metrics ? lifetime_metricsList : NULL,
        daily_metrics ? daily_metricsList : NULL,
        summary_metrics ? summary_metricsList : NULL
        );

    return pin_analytics_metrics_response_local_var;
end:
    if (lifetime_metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, lifetime_metricsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(lifetime_metricsList);
        lifetime_metricsList = NULL;
    }
    if (daily_metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, daily_metricsList) {
            pin_analytics_metrics_response_daily_metrics_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(daily_metricsList);
        daily_metricsList = NULL;
    }
    if (summary_metricsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, summary_metricsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(summary_metricsList);
        summary_metricsList = NULL;
    }
    return NULL;

}
