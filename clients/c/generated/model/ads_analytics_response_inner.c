#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ads_analytics_response_inner.h"



ads_analytics_response_inner_t *ads_analytics_response_inner_create(
    char *ad_id,
    char *date
    ) {
    ads_analytics_response_inner_t *ads_analytics_response_inner_local_var = malloc(sizeof(ads_analytics_response_inner_t));
    if (!ads_analytics_response_inner_local_var) {
        return NULL;
    }
    ads_analytics_response_inner_local_var->ad_id = ad_id;
    ads_analytics_response_inner_local_var->date = date;

    return ads_analytics_response_inner_local_var;
}


void ads_analytics_response_inner_free(ads_analytics_response_inner_t *ads_analytics_response_inner) {
    if(NULL == ads_analytics_response_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (ads_analytics_response_inner->ad_id) {
        free(ads_analytics_response_inner->ad_id);
        ads_analytics_response_inner->ad_id = NULL;
    }
    if (ads_analytics_response_inner->date) {
        free(ads_analytics_response_inner->date);
        ads_analytics_response_inner->date = NULL;
    }
    free(ads_analytics_response_inner);
}

cJSON *ads_analytics_response_inner_convertToJSON(ads_analytics_response_inner_t *ads_analytics_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // ads_analytics_response_inner->ad_id
    if (!ads_analytics_response_inner->ad_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "AD_ID", ads_analytics_response_inner->ad_id) == NULL) {
    goto fail; //String
    }


    // ads_analytics_response_inner->date
    if(ads_analytics_response_inner->date) {
    if(cJSON_AddStringToObject(item, "DATE", ads_analytics_response_inner->date) == NULL) {
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

ads_analytics_response_inner_t *ads_analytics_response_inner_parseFromJSON(cJSON *ads_analytics_response_innerJSON){

    ads_analytics_response_inner_t *ads_analytics_response_inner_local_var = NULL;

    // ads_analytics_response_inner->ad_id
    cJSON *ad_id = cJSON_GetObjectItemCaseSensitive(ads_analytics_response_innerJSON, "AD_ID");
    if (!ad_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_id))
    {
    goto end; //String
    }

    // ads_analytics_response_inner->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ads_analytics_response_innerJSON, "DATE");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    ads_analytics_response_inner_local_var = ads_analytics_response_inner_create (
        strdup(ad_id->valuestring),
        date ? strdup(date->valuestring) : NULL
        );

    return ads_analytics_response_inner_local_var;
end:
    return NULL;

}
