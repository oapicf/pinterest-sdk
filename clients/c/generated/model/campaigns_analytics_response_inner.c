#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaigns_analytics_response_inner.h"



static campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_create_internal(
    char *campaign_id,
    char *date
    ) {
    campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_local_var = malloc(sizeof(campaigns_analytics_response_inner_t));
    if (!campaigns_analytics_response_inner_local_var) {
        return NULL;
    }
    campaigns_analytics_response_inner_local_var->campaign_id = campaign_id;
    campaigns_analytics_response_inner_local_var->date = date;

    campaigns_analytics_response_inner_local_var->_library_owned = 1;
    return campaigns_analytics_response_inner_local_var;
}

__attribute__((deprecated)) campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_create(
    char *campaign_id,
    char *date
    ) {
    return campaigns_analytics_response_inner_create_internal (
        campaign_id,
        date
        );
}

void campaigns_analytics_response_inner_free(campaigns_analytics_response_inner_t *campaigns_analytics_response_inner) {
    if(NULL == campaigns_analytics_response_inner){
        return ;
    }
    if(campaigns_analytics_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaigns_analytics_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaigns_analytics_response_inner->campaign_id) {
        free(campaigns_analytics_response_inner->campaign_id);
        campaigns_analytics_response_inner->campaign_id = NULL;
    }
    if (campaigns_analytics_response_inner->date) {
        free(campaigns_analytics_response_inner->date);
        campaigns_analytics_response_inner->date = NULL;
    }
    free(campaigns_analytics_response_inner);
}

cJSON *campaigns_analytics_response_inner_convertToJSON(campaigns_analytics_response_inner_t *campaigns_analytics_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // campaigns_analytics_response_inner->campaign_id
    if (!campaigns_analytics_response_inner->campaign_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "CAMPAIGN_ID", campaigns_analytics_response_inner->campaign_id) == NULL) {
    goto fail; //String
    }


    // campaigns_analytics_response_inner->date
    if(campaigns_analytics_response_inner->date) {
    if(cJSON_AddStringToObject(item, "DATE", campaigns_analytics_response_inner->date) == NULL) {
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

campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_parseFromJSON(cJSON *campaigns_analytics_response_innerJSON){

    campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_local_var = NULL;

    // campaigns_analytics_response_inner->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(campaigns_analytics_response_innerJSON, "CAMPAIGN_ID");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsString(campaign_id))
    {
    goto end; //String
    }

    // campaigns_analytics_response_inner->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(campaigns_analytics_response_innerJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    campaigns_analytics_response_inner_local_var = campaigns_analytics_response_inner_create_internal (
        strdup(campaign_id->valuestring),
        date ? strdup(date->valuestring) : NULL
        );

    return campaigns_analytics_response_inner_local_var;
end:
    return NULL;

}
