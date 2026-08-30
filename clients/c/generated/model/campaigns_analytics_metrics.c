#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaigns_analytics_metrics.h"



static campaigns_analytics_metrics_t *campaigns_analytics_metrics_create_internal(
    char *campaign_id,
    char *date
    ) {
    campaigns_analytics_metrics_t *campaigns_analytics_metrics_local_var = malloc(sizeof(campaigns_analytics_metrics_t));
    if (!campaigns_analytics_metrics_local_var) {
        return NULL;
    }
    memset(campaigns_analytics_metrics_local_var, 0, sizeof(campaigns_analytics_metrics_t));
    campaigns_analytics_metrics_local_var->_library_owned = 1;
    campaigns_analytics_metrics_local_var->campaign_id = campaign_id;
    campaigns_analytics_metrics_local_var->date = date;
    return campaigns_analytics_metrics_local_var;
}

__attribute__((deprecated)) campaigns_analytics_metrics_t *campaigns_analytics_metrics_create(
    char *campaign_id,
    char *date
    ) {
    campaigns_analytics_metrics_t *result = campaigns_analytics_metrics_create_internal (
        campaign_id,
        date
        );
    if (!result) {
    }
    return result;
}

void campaigns_analytics_metrics_free(campaigns_analytics_metrics_t *campaigns_analytics_metrics) {
    if(NULL == campaigns_analytics_metrics){
        return ;
    }
    if(campaigns_analytics_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaigns_analytics_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaigns_analytics_metrics->campaign_id) {
        free(campaigns_analytics_metrics->campaign_id);
        campaigns_analytics_metrics->campaign_id = NULL;
    }
    if (campaigns_analytics_metrics->date) {
        free(campaigns_analytics_metrics->date);
        campaigns_analytics_metrics->date = NULL;
    }
    free(campaigns_analytics_metrics);
}

cJSON *campaigns_analytics_metrics_convertToJSON(campaigns_analytics_metrics_t *campaigns_analytics_metrics) {
    cJSON *item = cJSON_CreateObject();

    // campaigns_analytics_metrics->campaign_id
    if(campaigns_analytics_metrics->campaign_id) {
    if(cJSON_AddStringToObject(item, "CAMPAIGN_ID", campaigns_analytics_metrics->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // campaigns_analytics_metrics->date
    if(campaigns_analytics_metrics->date) {
    if(cJSON_AddStringToObject(item, "DATE", campaigns_analytics_metrics->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaigns_analytics_metrics_t *campaigns_analytics_metrics_parseFromJSON(cJSON *campaigns_analytics_metricsJSON){

    campaigns_analytics_metrics_t *campaigns_analytics_metrics_local_var = NULL;

    char *campaign_id_local_str = NULL;

    char *date_local_str = NULL;

    // campaigns_analytics_metrics->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(campaigns_analytics_metricsJSON, "CAMPAIGN_ID");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // campaigns_analytics_metrics->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(campaigns_analytics_metricsJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    if (campaign_id && !cJSON_IsNull(campaign_id)) campaign_id_local_str = strdup(campaign_id->valuestring);
    if (date) date_local_str = strdup(date->valuestring);

    campaigns_analytics_metrics_local_var = campaigns_analytics_metrics_create_internal (
        campaign_id_local_str,
        date_local_str
        );

    if (!campaigns_analytics_metrics_local_var) {
        goto end;
    }

    return campaigns_analytics_metrics_local_var;
end:
    if (campaign_id_local_str) {
        free(campaign_id_local_str);
        campaign_id_local_str = NULL;
    }
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    return NULL;

}
