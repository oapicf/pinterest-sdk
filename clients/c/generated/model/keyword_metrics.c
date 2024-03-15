#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_metrics.h"



keyword_metrics_t *keyword_metrics_create(
    double avg_cpc_in_micro_currency,
    char *keyword_query_volume
    ) {
    keyword_metrics_t *keyword_metrics_local_var = malloc(sizeof(keyword_metrics_t));
    if (!keyword_metrics_local_var) {
        return NULL;
    }
    keyword_metrics_local_var->avg_cpc_in_micro_currency = avg_cpc_in_micro_currency;
    keyword_metrics_local_var->keyword_query_volume = keyword_query_volume;

    return keyword_metrics_local_var;
}


void keyword_metrics_free(keyword_metrics_t *keyword_metrics) {
    if(NULL == keyword_metrics){
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_metrics->keyword_query_volume) {
        free(keyword_metrics->keyword_query_volume);
        keyword_metrics->keyword_query_volume = NULL;
    }
    free(keyword_metrics);
}

cJSON *keyword_metrics_convertToJSON(keyword_metrics_t *keyword_metrics) {
    cJSON *item = cJSON_CreateObject();

    // keyword_metrics->avg_cpc_in_micro_currency
    if(keyword_metrics->avg_cpc_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "avg_cpc_in_micro_currency", keyword_metrics->avg_cpc_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // keyword_metrics->keyword_query_volume
    if(keyword_metrics->keyword_query_volume) {
    if(cJSON_AddStringToObject(item, "keyword_query_volume", keyword_metrics->keyword_query_volume) == NULL) {
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

keyword_metrics_t *keyword_metrics_parseFromJSON(cJSON *keyword_metricsJSON){

    keyword_metrics_t *keyword_metrics_local_var = NULL;

    // keyword_metrics->avg_cpc_in_micro_currency
    cJSON *avg_cpc_in_micro_currency = cJSON_GetObjectItemCaseSensitive(keyword_metricsJSON, "avg_cpc_in_micro_currency");
    if (avg_cpc_in_micro_currency) { 
    if(!cJSON_IsNumber(avg_cpc_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // keyword_metrics->keyword_query_volume
    cJSON *keyword_query_volume = cJSON_GetObjectItemCaseSensitive(keyword_metricsJSON, "keyword_query_volume");
    if (keyword_query_volume) { 
    if(!cJSON_IsString(keyword_query_volume) && !cJSON_IsNull(keyword_query_volume))
    {
    goto end; //String
    }
    }


    keyword_metrics_local_var = keyword_metrics_create (
        avg_cpc_in_micro_currency ? avg_cpc_in_micro_currency->valuedouble : 0,
        keyword_query_volume && !cJSON_IsNull(keyword_query_volume) ? strdup(keyword_query_volume->valuestring) : NULL
        );

    return keyword_metrics_local_var;
end:
    return NULL;

}
