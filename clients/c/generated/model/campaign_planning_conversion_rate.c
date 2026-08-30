#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_conversion_rate.h"



static campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_create_internal(
    campaign_planning_conversion_attribution_t *attribution_windows,
    pinterest_rest_api_campaign_planning_conversion_event__e conversion_event,
    float *conversion_rate
    ) {
    campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_local_var = malloc(sizeof(campaign_planning_conversion_rate_t));
    if (!campaign_planning_conversion_rate_local_var) {
        return NULL;
    }
    memset(campaign_planning_conversion_rate_local_var, 0, sizeof(campaign_planning_conversion_rate_t));
    campaign_planning_conversion_rate_local_var->_library_owned = 1;
    campaign_planning_conversion_rate_local_var->attribution_windows = attribution_windows;
    campaign_planning_conversion_rate_local_var->conversion_event = conversion_event;
    campaign_planning_conversion_rate_local_var->conversion_rate = conversion_rate;
    return campaign_planning_conversion_rate_local_var;
}

__attribute__((deprecated)) campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_create(
    campaign_planning_conversion_attribution_t *attribution_windows,
    pinterest_rest_api_campaign_planning_conversion_event__e conversion_event,
    float *conversion_rate
    ) {
    float *conversion_rate_copy = NULL;
    if (conversion_rate) {
        conversion_rate_copy = malloc(sizeof(float));
        if (conversion_rate_copy) *conversion_rate_copy = *conversion_rate;
    }
    campaign_planning_conversion_rate_t *result = campaign_planning_conversion_rate_create_internal (
        attribution_windows,
        conversion_event,
        conversion_rate_copy
        );
    if (!result) {
        free(conversion_rate_copy);
    }
    return result;
}

void campaign_planning_conversion_rate_free(campaign_planning_conversion_rate_t *campaign_planning_conversion_rate) {
    if(NULL == campaign_planning_conversion_rate){
        return ;
    }
    if(campaign_planning_conversion_rate->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_conversion_rate_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_conversion_rate->attribution_windows) {
        campaign_planning_conversion_attribution_free(campaign_planning_conversion_rate->attribution_windows);
        campaign_planning_conversion_rate->attribution_windows = NULL;
    }
    if (campaign_planning_conversion_rate->conversion_rate) {
        free(campaign_planning_conversion_rate->conversion_rate);
        campaign_planning_conversion_rate->conversion_rate = NULL;
    }
    free(campaign_planning_conversion_rate);
}

cJSON *campaign_planning_conversion_rate_convertToJSON(campaign_planning_conversion_rate_t *campaign_planning_conversion_rate) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_conversion_rate->attribution_windows
    if (!campaign_planning_conversion_rate->attribution_windows) {
        goto fail;
    }
    cJSON *attribution_windows_local_JSON = campaign_planning_conversion_attribution_convertToJSON(campaign_planning_conversion_rate->attribution_windows);
    if(attribution_windows_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attribution_windows", attribution_windows_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // campaign_planning_conversion_rate->conversion_event
    if (pinterest_rest_api_campaign_planning_conversion_event__NULL == campaign_planning_conversion_rate->conversion_event) {
        goto fail;
    }
    cJSON *conversion_event_local_JSON = campaign_planning_conversion_event_convertToJSON(campaign_planning_conversion_rate->conversion_event);
    if(conversion_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_event", conversion_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // campaign_planning_conversion_rate->conversion_rate
    if (!campaign_planning_conversion_rate->conversion_rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "conversion_rate", *campaign_planning_conversion_rate->conversion_rate) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_parseFromJSON(cJSON *campaign_planning_conversion_rateJSON){

    campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_local_var = NULL;

    // define the local variable for campaign_planning_conversion_rate->attribution_windows
    campaign_planning_conversion_attribution_t *attribution_windows_local_nonprim = NULL;

    // define the local variable for campaign_planning_conversion_rate->conversion_event
    pinterest_rest_api_campaign_planning_conversion_event__e conversion_event_local_nonprim = 0;

    // define the local variable for campaign_planning_conversion_rate->conversion_rate
    float *conversion_rate_local_var = NULL;

    // campaign_planning_conversion_rate->attribution_windows
    cJSON *attribution_windows = cJSON_GetObjectItemCaseSensitive(campaign_planning_conversion_rateJSON, "attribution_windows");
    if (cJSON_IsNull(attribution_windows)) {
        attribution_windows = NULL;
    }
    if (!attribution_windows) {
        goto end;
    }

    
    attribution_windows_local_nonprim = campaign_planning_conversion_attribution_parseFromJSON(attribution_windows); //nonprimitive

    // campaign_planning_conversion_rate->conversion_event
    cJSON *conversion_event = cJSON_GetObjectItemCaseSensitive(campaign_planning_conversion_rateJSON, "conversion_event");
    if (cJSON_IsNull(conversion_event)) {
        conversion_event = NULL;
    }
    if (!conversion_event) {
        goto end;
    }

    
    conversion_event_local_nonprim = campaign_planning_conversion_event_parseFromJSON(conversion_event); //custom

    // campaign_planning_conversion_rate->conversion_rate
    cJSON *conversion_rate = cJSON_GetObjectItemCaseSensitive(campaign_planning_conversion_rateJSON, "conversion_rate");
    if (cJSON_IsNull(conversion_rate)) {
        conversion_rate = NULL;
    }
    if (!conversion_rate) {
        goto end;
    }

    
    if(!cJSON_IsNumber(conversion_rate))
    {
    goto end; //Numeric
    }
    conversion_rate_local_var = malloc(sizeof(float));
    if(!conversion_rate_local_var)
    {
        goto end;
    }
    *conversion_rate_local_var = conversion_rate->valuedouble;



    campaign_planning_conversion_rate_local_var = campaign_planning_conversion_rate_create_internal (
        attribution_windows_local_nonprim,
        conversion_event_local_nonprim,
        conversion_rate_local_var
        );

    if (!campaign_planning_conversion_rate_local_var) {
        goto end;
    }

    return campaign_planning_conversion_rate_local_var;
end:
    if (attribution_windows_local_nonprim) {
        campaign_planning_conversion_attribution_free(attribution_windows_local_nonprim);
        attribution_windows_local_nonprim = NULL;
    }
    if (conversion_event_local_nonprim) {
        conversion_event_local_nonprim = 0;
    }
    if (conversion_rate_local_var) {
        free(conversion_rate_local_var);
        conversion_rate_local_var = NULL;
    }
    return NULL;

}
