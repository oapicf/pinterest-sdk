#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_groups_analytics_metrics.h"



static ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_create_internal(
    char *ad_group_id,
    char *date
    ) {
    ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_local_var = malloc(sizeof(ad_groups_analytics_metrics_t));
    if (!ad_groups_analytics_metrics_local_var) {
        return NULL;
    }
    memset(ad_groups_analytics_metrics_local_var, 0, sizeof(ad_groups_analytics_metrics_t));
    ad_groups_analytics_metrics_local_var->_library_owned = 1;
    ad_groups_analytics_metrics_local_var->ad_group_id = ad_group_id;
    ad_groups_analytics_metrics_local_var->date = date;
    return ad_groups_analytics_metrics_local_var;
}

__attribute__((deprecated)) ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_create(
    char *ad_group_id,
    char *date
    ) {
    ad_groups_analytics_metrics_t *result = ad_groups_analytics_metrics_create_internal (
        ad_group_id,
        date
        );
    if (!result) {
    }
    return result;
}

void ad_groups_analytics_metrics_free(ad_groups_analytics_metrics_t *ad_groups_analytics_metrics) {
    if(NULL == ad_groups_analytics_metrics){
        return ;
    }
    if(ad_groups_analytics_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_groups_analytics_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_groups_analytics_metrics->ad_group_id) {
        free(ad_groups_analytics_metrics->ad_group_id);
        ad_groups_analytics_metrics->ad_group_id = NULL;
    }
    if (ad_groups_analytics_metrics->date) {
        free(ad_groups_analytics_metrics->date);
        ad_groups_analytics_metrics->date = NULL;
    }
    free(ad_groups_analytics_metrics);
}

cJSON *ad_groups_analytics_metrics_convertToJSON(ad_groups_analytics_metrics_t *ad_groups_analytics_metrics) {
    cJSON *item = cJSON_CreateObject();

    // ad_groups_analytics_metrics->ad_group_id
    if(ad_groups_analytics_metrics->ad_group_id) {
    if(cJSON_AddStringToObject(item, "AD_GROUP_ID", ad_groups_analytics_metrics->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_groups_analytics_metrics->date
    if(ad_groups_analytics_metrics->date) {
    if(cJSON_AddStringToObject(item, "DATE", ad_groups_analytics_metrics->date) == NULL) {
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

ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_parseFromJSON(cJSON *ad_groups_analytics_metricsJSON){

    ad_groups_analytics_metrics_t *ad_groups_analytics_metrics_local_var = NULL;

    char *ad_group_id_local_str = NULL;

    char *date_local_str = NULL;

    // ad_groups_analytics_metrics->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(ad_groups_analytics_metricsJSON, "AD_GROUP_ID");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // ad_groups_analytics_metrics->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ad_groups_analytics_metricsJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (date) date_local_str = strdup(date->valuestring);

    ad_groups_analytics_metrics_local_var = ad_groups_analytics_metrics_create_internal (
        ad_group_id_local_str,
        date_local_str
        );

    if (!ad_groups_analytics_metrics_local_var) {
        goto end;
    }

    return ad_groups_analytics_metrics_local_var;
end:
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    return NULL;

}
