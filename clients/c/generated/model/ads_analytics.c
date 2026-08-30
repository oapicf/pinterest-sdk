#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics.h"



static ads_analytics_t *ads_analytics_create_internal(
    char *ad_id,
    char *date
    ) {
    ads_analytics_t *ads_analytics_local_var = malloc(sizeof(ads_analytics_t));
    if (!ads_analytics_local_var) {
        return NULL;
    }
    memset(ads_analytics_local_var, 0, sizeof(ads_analytics_t));
    ads_analytics_local_var->_library_owned = 1;
    ads_analytics_local_var->ad_id = ad_id;
    ads_analytics_local_var->date = date;
    return ads_analytics_local_var;
}

__attribute__((deprecated)) ads_analytics_t *ads_analytics_create(
    char *ad_id,
    char *date
    ) {
    ads_analytics_t *result = ads_analytics_create_internal (
        ad_id,
        date
        );
    if (!result) {
    }
    return result;
}

void ads_analytics_free(ads_analytics_t *ads_analytics) {
    if(NULL == ads_analytics){
        return ;
    }
    if(ads_analytics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ads_analytics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics->ad_id) {
        free(ads_analytics->ad_id);
        ads_analytics->ad_id = NULL;
    }
    if (ads_analytics->date) {
        free(ads_analytics->date);
        ads_analytics->date = NULL;
    }
    free(ads_analytics);
}

cJSON *ads_analytics_convertToJSON(ads_analytics_t *ads_analytics) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics->ad_id
    if (!ads_analytics->ad_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "AD_ID", ads_analytics->ad_id) == NULL) {
    goto fail; //String
    }


    // ads_analytics->date
    if(ads_analytics->date) {
    if(cJSON_AddStringToObject(item, "DATE", ads_analytics->date) == NULL) {
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

ads_analytics_t *ads_analytics_parseFromJSON(cJSON *ads_analyticsJSON){

    ads_analytics_t *ads_analytics_local_var = NULL;

    char *ad_id_local_str = NULL;

    char *date_local_str = NULL;

    // ads_analytics->ad_id
    cJSON *ad_id = cJSON_GetObjectItemCaseSensitive(ads_analyticsJSON, "AD_ID");
    if (cJSON_IsNull(ad_id)) {
        ad_id = NULL;
    }
    if (!ad_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_id))
    {
    goto end; //String
    }

    // ads_analytics->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ads_analyticsJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    if (ad_id && !cJSON_IsNull(ad_id)) ad_id_local_str = strdup(ad_id->valuestring);
    if (date) date_local_str = strdup(date->valuestring);

    ads_analytics_local_var = ads_analytics_create_internal (
        ad_id_local_str,
        date_local_str
        );

    if (!ads_analytics_local_var) {
        goto end;
    }

    return ads_analytics_local_var;
end:
    if (ad_id_local_str) {
        free(ad_id_local_str);
        ad_id_local_str = NULL;
    }
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    return NULL;

}
