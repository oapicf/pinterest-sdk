#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_delivery_estimates_derived_metrics.h"



static campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_create_internal(
    float *cpc,
    float *cpc_lower,
    float *cpc_upper,
    float *cpm,
    float *cpm_lower,
    float *cpm_upper,
    float *lifetime_frequency,
    float *lifetime_frequency_lower,
    float *lifetime_frequency_upper,
    float *lifetime_impression,
    float *lifetime_impression_lower,
    float *lifetime_impression_upper,
    float *lifetime_reach,
    float *lifetime_reach_lower,
    float *lifetime_reach_upper,
    float *weekly_click,
    float *weekly_click_lower,
    float *weekly_click_upper,
    float *weekly_frequency,
    float *weekly_frequency_lower,
    float *weekly_frequency_upper,
    float *weekly_impression,
    float *weekly_impression_lower,
    float *weekly_impression_upper,
    float *weekly_reach,
    float *weekly_reach_lower,
    float *weekly_reach_upper
    ) {
    campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_local_var = malloc(sizeof(campaign_delivery_estimates_derived_metrics_t));
    if (!campaign_delivery_estimates_derived_metrics_local_var) {
        return NULL;
    }
    memset(campaign_delivery_estimates_derived_metrics_local_var, 0, sizeof(campaign_delivery_estimates_derived_metrics_t));
    campaign_delivery_estimates_derived_metrics_local_var->_library_owned = 1;
    campaign_delivery_estimates_derived_metrics_local_var->cpc = cpc;
    campaign_delivery_estimates_derived_metrics_local_var->cpc_lower = cpc_lower;
    campaign_delivery_estimates_derived_metrics_local_var->cpc_upper = cpc_upper;
    campaign_delivery_estimates_derived_metrics_local_var->cpm = cpm;
    campaign_delivery_estimates_derived_metrics_local_var->cpm_lower = cpm_lower;
    campaign_delivery_estimates_derived_metrics_local_var->cpm_upper = cpm_upper;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_frequency = lifetime_frequency;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_frequency_lower = lifetime_frequency_lower;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_frequency_upper = lifetime_frequency_upper;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_impression = lifetime_impression;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_impression_lower = lifetime_impression_lower;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_impression_upper = lifetime_impression_upper;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_reach = lifetime_reach;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_reach_lower = lifetime_reach_lower;
    campaign_delivery_estimates_derived_metrics_local_var->lifetime_reach_upper = lifetime_reach_upper;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_click = weekly_click;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_click_lower = weekly_click_lower;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_click_upper = weekly_click_upper;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_frequency = weekly_frequency;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_frequency_lower = weekly_frequency_lower;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_frequency_upper = weekly_frequency_upper;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_impression = weekly_impression;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_impression_lower = weekly_impression_lower;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_impression_upper = weekly_impression_upper;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_reach = weekly_reach;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_reach_lower = weekly_reach_lower;
    campaign_delivery_estimates_derived_metrics_local_var->weekly_reach_upper = weekly_reach_upper;
    return campaign_delivery_estimates_derived_metrics_local_var;
}

__attribute__((deprecated)) campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_create(
    float *cpc,
    float *cpc_lower,
    float *cpc_upper,
    float *cpm,
    float *cpm_lower,
    float *cpm_upper,
    float *lifetime_frequency,
    float *lifetime_frequency_lower,
    float *lifetime_frequency_upper,
    float *lifetime_impression,
    float *lifetime_impression_lower,
    float *lifetime_impression_upper,
    float *lifetime_reach,
    float *lifetime_reach_lower,
    float *lifetime_reach_upper,
    float *weekly_click,
    float *weekly_click_lower,
    float *weekly_click_upper,
    float *weekly_frequency,
    float *weekly_frequency_lower,
    float *weekly_frequency_upper,
    float *weekly_impression,
    float *weekly_impression_lower,
    float *weekly_impression_upper,
    float *weekly_reach,
    float *weekly_reach_lower,
    float *weekly_reach_upper
    ) {
    float *cpc_copy = NULL;
    if (cpc) {
        cpc_copy = malloc(sizeof(float));
        if (cpc_copy) *cpc_copy = *cpc;
    }
    float *cpc_lower_copy = NULL;
    if (cpc_lower) {
        cpc_lower_copy = malloc(sizeof(float));
        if (cpc_lower_copy) *cpc_lower_copy = *cpc_lower;
    }
    float *cpc_upper_copy = NULL;
    if (cpc_upper) {
        cpc_upper_copy = malloc(sizeof(float));
        if (cpc_upper_copy) *cpc_upper_copy = *cpc_upper;
    }
    float *cpm_copy = NULL;
    if (cpm) {
        cpm_copy = malloc(sizeof(float));
        if (cpm_copy) *cpm_copy = *cpm;
    }
    float *cpm_lower_copy = NULL;
    if (cpm_lower) {
        cpm_lower_copy = malloc(sizeof(float));
        if (cpm_lower_copy) *cpm_lower_copy = *cpm_lower;
    }
    float *cpm_upper_copy = NULL;
    if (cpm_upper) {
        cpm_upper_copy = malloc(sizeof(float));
        if (cpm_upper_copy) *cpm_upper_copy = *cpm_upper;
    }
    float *lifetime_frequency_copy = NULL;
    if (lifetime_frequency) {
        lifetime_frequency_copy = malloc(sizeof(float));
        if (lifetime_frequency_copy) *lifetime_frequency_copy = *lifetime_frequency;
    }
    float *lifetime_frequency_lower_copy = NULL;
    if (lifetime_frequency_lower) {
        lifetime_frequency_lower_copy = malloc(sizeof(float));
        if (lifetime_frequency_lower_copy) *lifetime_frequency_lower_copy = *lifetime_frequency_lower;
    }
    float *lifetime_frequency_upper_copy = NULL;
    if (lifetime_frequency_upper) {
        lifetime_frequency_upper_copy = malloc(sizeof(float));
        if (lifetime_frequency_upper_copy) *lifetime_frequency_upper_copy = *lifetime_frequency_upper;
    }
    float *lifetime_impression_copy = NULL;
    if (lifetime_impression) {
        lifetime_impression_copy = malloc(sizeof(float));
        if (lifetime_impression_copy) *lifetime_impression_copy = *lifetime_impression;
    }
    float *lifetime_impression_lower_copy = NULL;
    if (lifetime_impression_lower) {
        lifetime_impression_lower_copy = malloc(sizeof(float));
        if (lifetime_impression_lower_copy) *lifetime_impression_lower_copy = *lifetime_impression_lower;
    }
    float *lifetime_impression_upper_copy = NULL;
    if (lifetime_impression_upper) {
        lifetime_impression_upper_copy = malloc(sizeof(float));
        if (lifetime_impression_upper_copy) *lifetime_impression_upper_copy = *lifetime_impression_upper;
    }
    float *lifetime_reach_copy = NULL;
    if (lifetime_reach) {
        lifetime_reach_copy = malloc(sizeof(float));
        if (lifetime_reach_copy) *lifetime_reach_copy = *lifetime_reach;
    }
    float *lifetime_reach_lower_copy = NULL;
    if (lifetime_reach_lower) {
        lifetime_reach_lower_copy = malloc(sizeof(float));
        if (lifetime_reach_lower_copy) *lifetime_reach_lower_copy = *lifetime_reach_lower;
    }
    float *lifetime_reach_upper_copy = NULL;
    if (lifetime_reach_upper) {
        lifetime_reach_upper_copy = malloc(sizeof(float));
        if (lifetime_reach_upper_copy) *lifetime_reach_upper_copy = *lifetime_reach_upper;
    }
    float *weekly_click_copy = NULL;
    if (weekly_click) {
        weekly_click_copy = malloc(sizeof(float));
        if (weekly_click_copy) *weekly_click_copy = *weekly_click;
    }
    float *weekly_click_lower_copy = NULL;
    if (weekly_click_lower) {
        weekly_click_lower_copy = malloc(sizeof(float));
        if (weekly_click_lower_copy) *weekly_click_lower_copy = *weekly_click_lower;
    }
    float *weekly_click_upper_copy = NULL;
    if (weekly_click_upper) {
        weekly_click_upper_copy = malloc(sizeof(float));
        if (weekly_click_upper_copy) *weekly_click_upper_copy = *weekly_click_upper;
    }
    float *weekly_frequency_copy = NULL;
    if (weekly_frequency) {
        weekly_frequency_copy = malloc(sizeof(float));
        if (weekly_frequency_copy) *weekly_frequency_copy = *weekly_frequency;
    }
    float *weekly_frequency_lower_copy = NULL;
    if (weekly_frequency_lower) {
        weekly_frequency_lower_copy = malloc(sizeof(float));
        if (weekly_frequency_lower_copy) *weekly_frequency_lower_copy = *weekly_frequency_lower;
    }
    float *weekly_frequency_upper_copy = NULL;
    if (weekly_frequency_upper) {
        weekly_frequency_upper_copy = malloc(sizeof(float));
        if (weekly_frequency_upper_copy) *weekly_frequency_upper_copy = *weekly_frequency_upper;
    }
    float *weekly_impression_copy = NULL;
    if (weekly_impression) {
        weekly_impression_copy = malloc(sizeof(float));
        if (weekly_impression_copy) *weekly_impression_copy = *weekly_impression;
    }
    float *weekly_impression_lower_copy = NULL;
    if (weekly_impression_lower) {
        weekly_impression_lower_copy = malloc(sizeof(float));
        if (weekly_impression_lower_copy) *weekly_impression_lower_copy = *weekly_impression_lower;
    }
    float *weekly_impression_upper_copy = NULL;
    if (weekly_impression_upper) {
        weekly_impression_upper_copy = malloc(sizeof(float));
        if (weekly_impression_upper_copy) *weekly_impression_upper_copy = *weekly_impression_upper;
    }
    float *weekly_reach_copy = NULL;
    if (weekly_reach) {
        weekly_reach_copy = malloc(sizeof(float));
        if (weekly_reach_copy) *weekly_reach_copy = *weekly_reach;
    }
    float *weekly_reach_lower_copy = NULL;
    if (weekly_reach_lower) {
        weekly_reach_lower_copy = malloc(sizeof(float));
        if (weekly_reach_lower_copy) *weekly_reach_lower_copy = *weekly_reach_lower;
    }
    float *weekly_reach_upper_copy = NULL;
    if (weekly_reach_upper) {
        weekly_reach_upper_copy = malloc(sizeof(float));
        if (weekly_reach_upper_copy) *weekly_reach_upper_copy = *weekly_reach_upper;
    }
    campaign_delivery_estimates_derived_metrics_t *result = campaign_delivery_estimates_derived_metrics_create_internal (
        cpc_copy,
        cpc_lower_copy,
        cpc_upper_copy,
        cpm_copy,
        cpm_lower_copy,
        cpm_upper_copy,
        lifetime_frequency_copy,
        lifetime_frequency_lower_copy,
        lifetime_frequency_upper_copy,
        lifetime_impression_copy,
        lifetime_impression_lower_copy,
        lifetime_impression_upper_copy,
        lifetime_reach_copy,
        lifetime_reach_lower_copy,
        lifetime_reach_upper_copy,
        weekly_click_copy,
        weekly_click_lower_copy,
        weekly_click_upper_copy,
        weekly_frequency_copy,
        weekly_frequency_lower_copy,
        weekly_frequency_upper_copy,
        weekly_impression_copy,
        weekly_impression_lower_copy,
        weekly_impression_upper_copy,
        weekly_reach_copy,
        weekly_reach_lower_copy,
        weekly_reach_upper_copy
        );
    if (!result) {
        free(cpc_copy);
        free(cpc_lower_copy);
        free(cpc_upper_copy);
        free(cpm_copy);
        free(cpm_lower_copy);
        free(cpm_upper_copy);
        free(lifetime_frequency_copy);
        free(lifetime_frequency_lower_copy);
        free(lifetime_frequency_upper_copy);
        free(lifetime_impression_copy);
        free(lifetime_impression_lower_copy);
        free(lifetime_impression_upper_copy);
        free(lifetime_reach_copy);
        free(lifetime_reach_lower_copy);
        free(lifetime_reach_upper_copy);
        free(weekly_click_copy);
        free(weekly_click_lower_copy);
        free(weekly_click_upper_copy);
        free(weekly_frequency_copy);
        free(weekly_frequency_lower_copy);
        free(weekly_frequency_upper_copy);
        free(weekly_impression_copy);
        free(weekly_impression_lower_copy);
        free(weekly_impression_upper_copy);
        free(weekly_reach_copy);
        free(weekly_reach_lower_copy);
        free(weekly_reach_upper_copy);
    }
    return result;
}

void campaign_delivery_estimates_derived_metrics_free(campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics) {
    if(NULL == campaign_delivery_estimates_derived_metrics){
        return ;
    }
    if(campaign_delivery_estimates_derived_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_delivery_estimates_derived_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_delivery_estimates_derived_metrics->cpc) {
        free(campaign_delivery_estimates_derived_metrics->cpc);
        campaign_delivery_estimates_derived_metrics->cpc = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->cpc_lower) {
        free(campaign_delivery_estimates_derived_metrics->cpc_lower);
        campaign_delivery_estimates_derived_metrics->cpc_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->cpc_upper) {
        free(campaign_delivery_estimates_derived_metrics->cpc_upper);
        campaign_delivery_estimates_derived_metrics->cpc_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->cpm) {
        free(campaign_delivery_estimates_derived_metrics->cpm);
        campaign_delivery_estimates_derived_metrics->cpm = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->cpm_lower) {
        free(campaign_delivery_estimates_derived_metrics->cpm_lower);
        campaign_delivery_estimates_derived_metrics->cpm_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->cpm_upper) {
        free(campaign_delivery_estimates_derived_metrics->cpm_upper);
        campaign_delivery_estimates_derived_metrics->cpm_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_frequency) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_frequency);
        campaign_delivery_estimates_derived_metrics->lifetime_frequency = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower);
        campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper);
        campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_impression) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_impression);
        campaign_delivery_estimates_derived_metrics->lifetime_impression = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_impression_lower) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_impression_lower);
        campaign_delivery_estimates_derived_metrics->lifetime_impression_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_impression_upper) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_impression_upper);
        campaign_delivery_estimates_derived_metrics->lifetime_impression_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_reach) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_reach);
        campaign_delivery_estimates_derived_metrics->lifetime_reach = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_reach_lower) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_reach_lower);
        campaign_delivery_estimates_derived_metrics->lifetime_reach_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->lifetime_reach_upper) {
        free(campaign_delivery_estimates_derived_metrics->lifetime_reach_upper);
        campaign_delivery_estimates_derived_metrics->lifetime_reach_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_click) {
        free(campaign_delivery_estimates_derived_metrics->weekly_click);
        campaign_delivery_estimates_derived_metrics->weekly_click = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_click_lower) {
        free(campaign_delivery_estimates_derived_metrics->weekly_click_lower);
        campaign_delivery_estimates_derived_metrics->weekly_click_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_click_upper) {
        free(campaign_delivery_estimates_derived_metrics->weekly_click_upper);
        campaign_delivery_estimates_derived_metrics->weekly_click_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_frequency) {
        free(campaign_delivery_estimates_derived_metrics->weekly_frequency);
        campaign_delivery_estimates_derived_metrics->weekly_frequency = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_frequency_lower) {
        free(campaign_delivery_estimates_derived_metrics->weekly_frequency_lower);
        campaign_delivery_estimates_derived_metrics->weekly_frequency_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_frequency_upper) {
        free(campaign_delivery_estimates_derived_metrics->weekly_frequency_upper);
        campaign_delivery_estimates_derived_metrics->weekly_frequency_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_impression) {
        free(campaign_delivery_estimates_derived_metrics->weekly_impression);
        campaign_delivery_estimates_derived_metrics->weekly_impression = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_impression_lower) {
        free(campaign_delivery_estimates_derived_metrics->weekly_impression_lower);
        campaign_delivery_estimates_derived_metrics->weekly_impression_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_impression_upper) {
        free(campaign_delivery_estimates_derived_metrics->weekly_impression_upper);
        campaign_delivery_estimates_derived_metrics->weekly_impression_upper = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_reach) {
        free(campaign_delivery_estimates_derived_metrics->weekly_reach);
        campaign_delivery_estimates_derived_metrics->weekly_reach = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_reach_lower) {
        free(campaign_delivery_estimates_derived_metrics->weekly_reach_lower);
        campaign_delivery_estimates_derived_metrics->weekly_reach_lower = NULL;
    }
    if (campaign_delivery_estimates_derived_metrics->weekly_reach_upper) {
        free(campaign_delivery_estimates_derived_metrics->weekly_reach_upper);
        campaign_delivery_estimates_derived_metrics->weekly_reach_upper = NULL;
    }
    free(campaign_delivery_estimates_derived_metrics);
}

cJSON *campaign_delivery_estimates_derived_metrics_convertToJSON(campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics) {
    cJSON *item = cJSON_CreateObject();

    // campaign_delivery_estimates_derived_metrics->cpc
    if(campaign_delivery_estimates_derived_metrics->cpc) {
    if(cJSON_AddNumberToObject(item, "cpc", *campaign_delivery_estimates_derived_metrics->cpc) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->cpc_lower
    if(campaign_delivery_estimates_derived_metrics->cpc_lower) {
    if(cJSON_AddNumberToObject(item, "cpc_lower", *campaign_delivery_estimates_derived_metrics->cpc_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->cpc_upper
    if(campaign_delivery_estimates_derived_metrics->cpc_upper) {
    if(cJSON_AddNumberToObject(item, "cpc_upper", *campaign_delivery_estimates_derived_metrics->cpc_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->cpm
    if(campaign_delivery_estimates_derived_metrics->cpm) {
    if(cJSON_AddNumberToObject(item, "cpm", *campaign_delivery_estimates_derived_metrics->cpm) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->cpm_lower
    if(campaign_delivery_estimates_derived_metrics->cpm_lower) {
    if(cJSON_AddNumberToObject(item, "cpm_lower", *campaign_delivery_estimates_derived_metrics->cpm_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->cpm_upper
    if(campaign_delivery_estimates_derived_metrics->cpm_upper) {
    if(cJSON_AddNumberToObject(item, "cpm_upper", *campaign_delivery_estimates_derived_metrics->cpm_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_frequency
    if(campaign_delivery_estimates_derived_metrics->lifetime_frequency) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency", *campaign_delivery_estimates_derived_metrics->lifetime_frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower
    if(campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency_lower", *campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper
    if(campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency_upper", *campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_impression
    if(campaign_delivery_estimates_derived_metrics->lifetime_impression) {
    if(cJSON_AddNumberToObject(item, "lifetime_impression", *campaign_delivery_estimates_derived_metrics->lifetime_impression) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_impression_lower
    if(campaign_delivery_estimates_derived_metrics->lifetime_impression_lower) {
    if(cJSON_AddNumberToObject(item, "lifetime_impression_lower", *campaign_delivery_estimates_derived_metrics->lifetime_impression_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_impression_upper
    if(campaign_delivery_estimates_derived_metrics->lifetime_impression_upper) {
    if(cJSON_AddNumberToObject(item, "lifetime_impression_upper", *campaign_delivery_estimates_derived_metrics->lifetime_impression_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_reach
    if(campaign_delivery_estimates_derived_metrics->lifetime_reach) {
    if(cJSON_AddNumberToObject(item, "lifetime_reach", *campaign_delivery_estimates_derived_metrics->lifetime_reach) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_reach_lower
    if(campaign_delivery_estimates_derived_metrics->lifetime_reach_lower) {
    if(cJSON_AddNumberToObject(item, "lifetime_reach_lower", *campaign_delivery_estimates_derived_metrics->lifetime_reach_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->lifetime_reach_upper
    if(campaign_delivery_estimates_derived_metrics->lifetime_reach_upper) {
    if(cJSON_AddNumberToObject(item, "lifetime_reach_upper", *campaign_delivery_estimates_derived_metrics->lifetime_reach_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_click
    if(campaign_delivery_estimates_derived_metrics->weekly_click) {
    if(cJSON_AddNumberToObject(item, "weekly_click", *campaign_delivery_estimates_derived_metrics->weekly_click) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_click_lower
    if(campaign_delivery_estimates_derived_metrics->weekly_click_lower) {
    if(cJSON_AddNumberToObject(item, "weekly_click_lower", *campaign_delivery_estimates_derived_metrics->weekly_click_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_click_upper
    if(campaign_delivery_estimates_derived_metrics->weekly_click_upper) {
    if(cJSON_AddNumberToObject(item, "weekly_click_upper", *campaign_delivery_estimates_derived_metrics->weekly_click_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_frequency
    if(campaign_delivery_estimates_derived_metrics->weekly_frequency) {
    if(cJSON_AddNumberToObject(item, "weekly_frequency", *campaign_delivery_estimates_derived_metrics->weekly_frequency) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_frequency_lower
    if(campaign_delivery_estimates_derived_metrics->weekly_frequency_lower) {
    if(cJSON_AddNumberToObject(item, "weekly_frequency_lower", *campaign_delivery_estimates_derived_metrics->weekly_frequency_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_frequency_upper
    if(campaign_delivery_estimates_derived_metrics->weekly_frequency_upper) {
    if(cJSON_AddNumberToObject(item, "weekly_frequency_upper", *campaign_delivery_estimates_derived_metrics->weekly_frequency_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_impression
    if(campaign_delivery_estimates_derived_metrics->weekly_impression) {
    if(cJSON_AddNumberToObject(item, "weekly_impression", *campaign_delivery_estimates_derived_metrics->weekly_impression) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_impression_lower
    if(campaign_delivery_estimates_derived_metrics->weekly_impression_lower) {
    if(cJSON_AddNumberToObject(item, "weekly_impression_lower", *campaign_delivery_estimates_derived_metrics->weekly_impression_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_impression_upper
    if(campaign_delivery_estimates_derived_metrics->weekly_impression_upper) {
    if(cJSON_AddNumberToObject(item, "weekly_impression_upper", *campaign_delivery_estimates_derived_metrics->weekly_impression_upper) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_reach
    if(campaign_delivery_estimates_derived_metrics->weekly_reach) {
    if(cJSON_AddNumberToObject(item, "weekly_reach", *campaign_delivery_estimates_derived_metrics->weekly_reach) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_reach_lower
    if(campaign_delivery_estimates_derived_metrics->weekly_reach_lower) {
    if(cJSON_AddNumberToObject(item, "weekly_reach_lower", *campaign_delivery_estimates_derived_metrics->weekly_reach_lower) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_derived_metrics->weekly_reach_upper
    if(campaign_delivery_estimates_derived_metrics->weekly_reach_upper) {
    if(cJSON_AddNumberToObject(item, "weekly_reach_upper", *campaign_delivery_estimates_derived_metrics->weekly_reach_upper) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_parseFromJSON(cJSON *campaign_delivery_estimates_derived_metricsJSON){

    campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->cpc
    float *cpc_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->cpc_lower
    float *cpc_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->cpc_upper
    float *cpc_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->cpm
    float *cpm_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->cpm_lower
    float *cpm_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->cpm_upper
    float *cpm_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_frequency
    float *lifetime_frequency_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower
    float *lifetime_frequency_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper
    float *lifetime_frequency_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_impression
    float *lifetime_impression_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_impression_lower
    float *lifetime_impression_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_impression_upper
    float *lifetime_impression_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_reach
    float *lifetime_reach_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_reach_lower
    float *lifetime_reach_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->lifetime_reach_upper
    float *lifetime_reach_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_click
    float *weekly_click_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_click_lower
    float *weekly_click_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_click_upper
    float *weekly_click_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_frequency
    float *weekly_frequency_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_frequency_lower
    float *weekly_frequency_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_frequency_upper
    float *weekly_frequency_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_impression
    float *weekly_impression_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_impression_lower
    float *weekly_impression_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_impression_upper
    float *weekly_impression_upper_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_reach
    float *weekly_reach_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_reach_lower
    float *weekly_reach_lower_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_derived_metrics->weekly_reach_upper
    float *weekly_reach_upper_local_var = NULL;

    // campaign_delivery_estimates_derived_metrics->cpc
    cJSON *cpc = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "cpc");
    if (cJSON_IsNull(cpc)) {
        cpc = NULL;
    }
    if (cpc) { 
    if(!cJSON_IsNumber(cpc))
    {
    goto end; //Numeric
    }
    cpc_local_var = malloc(sizeof(float));
    if(!cpc_local_var)
    {
        goto end;
    }
    *cpc_local_var = cpc->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->cpc_lower
    cJSON *cpc_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "cpc_lower");
    if (cJSON_IsNull(cpc_lower)) {
        cpc_lower = NULL;
    }
    if (cpc_lower) { 
    if(!cJSON_IsNumber(cpc_lower))
    {
    goto end; //Numeric
    }
    cpc_lower_local_var = malloc(sizeof(float));
    if(!cpc_lower_local_var)
    {
        goto end;
    }
    *cpc_lower_local_var = cpc_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->cpc_upper
    cJSON *cpc_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "cpc_upper");
    if (cJSON_IsNull(cpc_upper)) {
        cpc_upper = NULL;
    }
    if (cpc_upper) { 
    if(!cJSON_IsNumber(cpc_upper))
    {
    goto end; //Numeric
    }
    cpc_upper_local_var = malloc(sizeof(float));
    if(!cpc_upper_local_var)
    {
        goto end;
    }
    *cpc_upper_local_var = cpc_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->cpm
    cJSON *cpm = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "cpm");
    if (cJSON_IsNull(cpm)) {
        cpm = NULL;
    }
    if (cpm) { 
    if(!cJSON_IsNumber(cpm))
    {
    goto end; //Numeric
    }
    cpm_local_var = malloc(sizeof(float));
    if(!cpm_local_var)
    {
        goto end;
    }
    *cpm_local_var = cpm->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->cpm_lower
    cJSON *cpm_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "cpm_lower");
    if (cJSON_IsNull(cpm_lower)) {
        cpm_lower = NULL;
    }
    if (cpm_lower) { 
    if(!cJSON_IsNumber(cpm_lower))
    {
    goto end; //Numeric
    }
    cpm_lower_local_var = malloc(sizeof(float));
    if(!cpm_lower_local_var)
    {
        goto end;
    }
    *cpm_lower_local_var = cpm_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->cpm_upper
    cJSON *cpm_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "cpm_upper");
    if (cJSON_IsNull(cpm_upper)) {
        cpm_upper = NULL;
    }
    if (cpm_upper) { 
    if(!cJSON_IsNumber(cpm_upper))
    {
    goto end; //Numeric
    }
    cpm_upper_local_var = malloc(sizeof(float));
    if(!cpm_upper_local_var)
    {
        goto end;
    }
    *cpm_upper_local_var = cpm_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_frequency
    cJSON *lifetime_frequency = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_frequency");
    if (cJSON_IsNull(lifetime_frequency)) {
        lifetime_frequency = NULL;
    }
    if (lifetime_frequency) { 
    if(!cJSON_IsNumber(lifetime_frequency))
    {
    goto end; //Numeric
    }
    lifetime_frequency_local_var = malloc(sizeof(float));
    if(!lifetime_frequency_local_var)
    {
        goto end;
    }
    *lifetime_frequency_local_var = lifetime_frequency->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_frequency_lower
    cJSON *lifetime_frequency_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_frequency_lower");
    if (cJSON_IsNull(lifetime_frequency_lower)) {
        lifetime_frequency_lower = NULL;
    }
    if (lifetime_frequency_lower) { 
    if(!cJSON_IsNumber(lifetime_frequency_lower))
    {
    goto end; //Numeric
    }
    lifetime_frequency_lower_local_var = malloc(sizeof(float));
    if(!lifetime_frequency_lower_local_var)
    {
        goto end;
    }
    *lifetime_frequency_lower_local_var = lifetime_frequency_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_frequency_upper
    cJSON *lifetime_frequency_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_frequency_upper");
    if (cJSON_IsNull(lifetime_frequency_upper)) {
        lifetime_frequency_upper = NULL;
    }
    if (lifetime_frequency_upper) { 
    if(!cJSON_IsNumber(lifetime_frequency_upper))
    {
    goto end; //Numeric
    }
    lifetime_frequency_upper_local_var = malloc(sizeof(float));
    if(!lifetime_frequency_upper_local_var)
    {
        goto end;
    }
    *lifetime_frequency_upper_local_var = lifetime_frequency_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_impression
    cJSON *lifetime_impression = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_impression");
    if (cJSON_IsNull(lifetime_impression)) {
        lifetime_impression = NULL;
    }
    if (lifetime_impression) { 
    if(!cJSON_IsNumber(lifetime_impression))
    {
    goto end; //Numeric
    }
    lifetime_impression_local_var = malloc(sizeof(float));
    if(!lifetime_impression_local_var)
    {
        goto end;
    }
    *lifetime_impression_local_var = lifetime_impression->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_impression_lower
    cJSON *lifetime_impression_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_impression_lower");
    if (cJSON_IsNull(lifetime_impression_lower)) {
        lifetime_impression_lower = NULL;
    }
    if (lifetime_impression_lower) { 
    if(!cJSON_IsNumber(lifetime_impression_lower))
    {
    goto end; //Numeric
    }
    lifetime_impression_lower_local_var = malloc(sizeof(float));
    if(!lifetime_impression_lower_local_var)
    {
        goto end;
    }
    *lifetime_impression_lower_local_var = lifetime_impression_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_impression_upper
    cJSON *lifetime_impression_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_impression_upper");
    if (cJSON_IsNull(lifetime_impression_upper)) {
        lifetime_impression_upper = NULL;
    }
    if (lifetime_impression_upper) { 
    if(!cJSON_IsNumber(lifetime_impression_upper))
    {
    goto end; //Numeric
    }
    lifetime_impression_upper_local_var = malloc(sizeof(float));
    if(!lifetime_impression_upper_local_var)
    {
        goto end;
    }
    *lifetime_impression_upper_local_var = lifetime_impression_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_reach
    cJSON *lifetime_reach = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_reach");
    if (cJSON_IsNull(lifetime_reach)) {
        lifetime_reach = NULL;
    }
    if (lifetime_reach) { 
    if(!cJSON_IsNumber(lifetime_reach))
    {
    goto end; //Numeric
    }
    lifetime_reach_local_var = malloc(sizeof(float));
    if(!lifetime_reach_local_var)
    {
        goto end;
    }
    *lifetime_reach_local_var = lifetime_reach->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_reach_lower
    cJSON *lifetime_reach_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_reach_lower");
    if (cJSON_IsNull(lifetime_reach_lower)) {
        lifetime_reach_lower = NULL;
    }
    if (lifetime_reach_lower) { 
    if(!cJSON_IsNumber(lifetime_reach_lower))
    {
    goto end; //Numeric
    }
    lifetime_reach_lower_local_var = malloc(sizeof(float));
    if(!lifetime_reach_lower_local_var)
    {
        goto end;
    }
    *lifetime_reach_lower_local_var = lifetime_reach_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->lifetime_reach_upper
    cJSON *lifetime_reach_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "lifetime_reach_upper");
    if (cJSON_IsNull(lifetime_reach_upper)) {
        lifetime_reach_upper = NULL;
    }
    if (lifetime_reach_upper) { 
    if(!cJSON_IsNumber(lifetime_reach_upper))
    {
    goto end; //Numeric
    }
    lifetime_reach_upper_local_var = malloc(sizeof(float));
    if(!lifetime_reach_upper_local_var)
    {
        goto end;
    }
    *lifetime_reach_upper_local_var = lifetime_reach_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_click
    cJSON *weekly_click = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_click");
    if (cJSON_IsNull(weekly_click)) {
        weekly_click = NULL;
    }
    if (weekly_click) { 
    if(!cJSON_IsNumber(weekly_click))
    {
    goto end; //Numeric
    }
    weekly_click_local_var = malloc(sizeof(float));
    if(!weekly_click_local_var)
    {
        goto end;
    }
    *weekly_click_local_var = weekly_click->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_click_lower
    cJSON *weekly_click_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_click_lower");
    if (cJSON_IsNull(weekly_click_lower)) {
        weekly_click_lower = NULL;
    }
    if (weekly_click_lower) { 
    if(!cJSON_IsNumber(weekly_click_lower))
    {
    goto end; //Numeric
    }
    weekly_click_lower_local_var = malloc(sizeof(float));
    if(!weekly_click_lower_local_var)
    {
        goto end;
    }
    *weekly_click_lower_local_var = weekly_click_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_click_upper
    cJSON *weekly_click_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_click_upper");
    if (cJSON_IsNull(weekly_click_upper)) {
        weekly_click_upper = NULL;
    }
    if (weekly_click_upper) { 
    if(!cJSON_IsNumber(weekly_click_upper))
    {
    goto end; //Numeric
    }
    weekly_click_upper_local_var = malloc(sizeof(float));
    if(!weekly_click_upper_local_var)
    {
        goto end;
    }
    *weekly_click_upper_local_var = weekly_click_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_frequency
    cJSON *weekly_frequency = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_frequency");
    if (cJSON_IsNull(weekly_frequency)) {
        weekly_frequency = NULL;
    }
    if (weekly_frequency) { 
    if(!cJSON_IsNumber(weekly_frequency))
    {
    goto end; //Numeric
    }
    weekly_frequency_local_var = malloc(sizeof(float));
    if(!weekly_frequency_local_var)
    {
        goto end;
    }
    *weekly_frequency_local_var = weekly_frequency->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_frequency_lower
    cJSON *weekly_frequency_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_frequency_lower");
    if (cJSON_IsNull(weekly_frequency_lower)) {
        weekly_frequency_lower = NULL;
    }
    if (weekly_frequency_lower) { 
    if(!cJSON_IsNumber(weekly_frequency_lower))
    {
    goto end; //Numeric
    }
    weekly_frequency_lower_local_var = malloc(sizeof(float));
    if(!weekly_frequency_lower_local_var)
    {
        goto end;
    }
    *weekly_frequency_lower_local_var = weekly_frequency_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_frequency_upper
    cJSON *weekly_frequency_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_frequency_upper");
    if (cJSON_IsNull(weekly_frequency_upper)) {
        weekly_frequency_upper = NULL;
    }
    if (weekly_frequency_upper) { 
    if(!cJSON_IsNumber(weekly_frequency_upper))
    {
    goto end; //Numeric
    }
    weekly_frequency_upper_local_var = malloc(sizeof(float));
    if(!weekly_frequency_upper_local_var)
    {
        goto end;
    }
    *weekly_frequency_upper_local_var = weekly_frequency_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_impression
    cJSON *weekly_impression = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_impression");
    if (cJSON_IsNull(weekly_impression)) {
        weekly_impression = NULL;
    }
    if (weekly_impression) { 
    if(!cJSON_IsNumber(weekly_impression))
    {
    goto end; //Numeric
    }
    weekly_impression_local_var = malloc(sizeof(float));
    if(!weekly_impression_local_var)
    {
        goto end;
    }
    *weekly_impression_local_var = weekly_impression->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_impression_lower
    cJSON *weekly_impression_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_impression_lower");
    if (cJSON_IsNull(weekly_impression_lower)) {
        weekly_impression_lower = NULL;
    }
    if (weekly_impression_lower) { 
    if(!cJSON_IsNumber(weekly_impression_lower))
    {
    goto end; //Numeric
    }
    weekly_impression_lower_local_var = malloc(sizeof(float));
    if(!weekly_impression_lower_local_var)
    {
        goto end;
    }
    *weekly_impression_lower_local_var = weekly_impression_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_impression_upper
    cJSON *weekly_impression_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_impression_upper");
    if (cJSON_IsNull(weekly_impression_upper)) {
        weekly_impression_upper = NULL;
    }
    if (weekly_impression_upper) { 
    if(!cJSON_IsNumber(weekly_impression_upper))
    {
    goto end; //Numeric
    }
    weekly_impression_upper_local_var = malloc(sizeof(float));
    if(!weekly_impression_upper_local_var)
    {
        goto end;
    }
    *weekly_impression_upper_local_var = weekly_impression_upper->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_reach
    cJSON *weekly_reach = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_reach");
    if (cJSON_IsNull(weekly_reach)) {
        weekly_reach = NULL;
    }
    if (weekly_reach) { 
    if(!cJSON_IsNumber(weekly_reach))
    {
    goto end; //Numeric
    }
    weekly_reach_local_var = malloc(sizeof(float));
    if(!weekly_reach_local_var)
    {
        goto end;
    }
    *weekly_reach_local_var = weekly_reach->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_reach_lower
    cJSON *weekly_reach_lower = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_reach_lower");
    if (cJSON_IsNull(weekly_reach_lower)) {
        weekly_reach_lower = NULL;
    }
    if (weekly_reach_lower) { 
    if(!cJSON_IsNumber(weekly_reach_lower))
    {
    goto end; //Numeric
    }
    weekly_reach_lower_local_var = malloc(sizeof(float));
    if(!weekly_reach_lower_local_var)
    {
        goto end;
    }
    *weekly_reach_lower_local_var = weekly_reach_lower->valuedouble;
    }

    // campaign_delivery_estimates_derived_metrics->weekly_reach_upper
    cJSON *weekly_reach_upper = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_derived_metricsJSON, "weekly_reach_upper");
    if (cJSON_IsNull(weekly_reach_upper)) {
        weekly_reach_upper = NULL;
    }
    if (weekly_reach_upper) { 
    if(!cJSON_IsNumber(weekly_reach_upper))
    {
    goto end; //Numeric
    }
    weekly_reach_upper_local_var = malloc(sizeof(float));
    if(!weekly_reach_upper_local_var)
    {
        goto end;
    }
    *weekly_reach_upper_local_var = weekly_reach_upper->valuedouble;
    }



    campaign_delivery_estimates_derived_metrics_local_var = campaign_delivery_estimates_derived_metrics_create_internal (
        cpc_local_var,
        cpc_lower_local_var,
        cpc_upper_local_var,
        cpm_local_var,
        cpm_lower_local_var,
        cpm_upper_local_var,
        lifetime_frequency_local_var,
        lifetime_frequency_lower_local_var,
        lifetime_frequency_upper_local_var,
        lifetime_impression_local_var,
        lifetime_impression_lower_local_var,
        lifetime_impression_upper_local_var,
        lifetime_reach_local_var,
        lifetime_reach_lower_local_var,
        lifetime_reach_upper_local_var,
        weekly_click_local_var,
        weekly_click_lower_local_var,
        weekly_click_upper_local_var,
        weekly_frequency_local_var,
        weekly_frequency_lower_local_var,
        weekly_frequency_upper_local_var,
        weekly_impression_local_var,
        weekly_impression_lower_local_var,
        weekly_impression_upper_local_var,
        weekly_reach_local_var,
        weekly_reach_lower_local_var,
        weekly_reach_upper_local_var
        );

    if (!campaign_delivery_estimates_derived_metrics_local_var) {
        goto end;
    }

    return campaign_delivery_estimates_derived_metrics_local_var;
end:
    if (cpc_local_var) {
        free(cpc_local_var);
        cpc_local_var = NULL;
    }
    if (cpc_lower_local_var) {
        free(cpc_lower_local_var);
        cpc_lower_local_var = NULL;
    }
    if (cpc_upper_local_var) {
        free(cpc_upper_local_var);
        cpc_upper_local_var = NULL;
    }
    if (cpm_local_var) {
        free(cpm_local_var);
        cpm_local_var = NULL;
    }
    if (cpm_lower_local_var) {
        free(cpm_lower_local_var);
        cpm_lower_local_var = NULL;
    }
    if (cpm_upper_local_var) {
        free(cpm_upper_local_var);
        cpm_upper_local_var = NULL;
    }
    if (lifetime_frequency_local_var) {
        free(lifetime_frequency_local_var);
        lifetime_frequency_local_var = NULL;
    }
    if (lifetime_frequency_lower_local_var) {
        free(lifetime_frequency_lower_local_var);
        lifetime_frequency_lower_local_var = NULL;
    }
    if (lifetime_frequency_upper_local_var) {
        free(lifetime_frequency_upper_local_var);
        lifetime_frequency_upper_local_var = NULL;
    }
    if (lifetime_impression_local_var) {
        free(lifetime_impression_local_var);
        lifetime_impression_local_var = NULL;
    }
    if (lifetime_impression_lower_local_var) {
        free(lifetime_impression_lower_local_var);
        lifetime_impression_lower_local_var = NULL;
    }
    if (lifetime_impression_upper_local_var) {
        free(lifetime_impression_upper_local_var);
        lifetime_impression_upper_local_var = NULL;
    }
    if (lifetime_reach_local_var) {
        free(lifetime_reach_local_var);
        lifetime_reach_local_var = NULL;
    }
    if (lifetime_reach_lower_local_var) {
        free(lifetime_reach_lower_local_var);
        lifetime_reach_lower_local_var = NULL;
    }
    if (lifetime_reach_upper_local_var) {
        free(lifetime_reach_upper_local_var);
        lifetime_reach_upper_local_var = NULL;
    }
    if (weekly_click_local_var) {
        free(weekly_click_local_var);
        weekly_click_local_var = NULL;
    }
    if (weekly_click_lower_local_var) {
        free(weekly_click_lower_local_var);
        weekly_click_lower_local_var = NULL;
    }
    if (weekly_click_upper_local_var) {
        free(weekly_click_upper_local_var);
        weekly_click_upper_local_var = NULL;
    }
    if (weekly_frequency_local_var) {
        free(weekly_frequency_local_var);
        weekly_frequency_local_var = NULL;
    }
    if (weekly_frequency_lower_local_var) {
        free(weekly_frequency_lower_local_var);
        weekly_frequency_lower_local_var = NULL;
    }
    if (weekly_frequency_upper_local_var) {
        free(weekly_frequency_upper_local_var);
        weekly_frequency_upper_local_var = NULL;
    }
    if (weekly_impression_local_var) {
        free(weekly_impression_local_var);
        weekly_impression_local_var = NULL;
    }
    if (weekly_impression_lower_local_var) {
        free(weekly_impression_lower_local_var);
        weekly_impression_lower_local_var = NULL;
    }
    if (weekly_impression_upper_local_var) {
        free(weekly_impression_upper_local_var);
        weekly_impression_upper_local_var = NULL;
    }
    if (weekly_reach_local_var) {
        free(weekly_reach_local_var);
        weekly_reach_local_var = NULL;
    }
    if (weekly_reach_lower_local_var) {
        free(weekly_reach_lower_local_var);
        weekly_reach_lower_local_var = NULL;
    }
    if (weekly_reach_upper_local_var) {
        free(weekly_reach_upper_local_var);
        weekly_reach_upper_local_var = NULL;
    }
    return NULL;

}
