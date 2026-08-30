#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_bid_options.h"



static campaign_bid_options_t *campaign_bid_options_create_internal(
    age_bucket_multipliers_t *age_bucket_multipliers,
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window,
    frequency_multipliers_t *frequency_multipliers,
    gender_multipliers_t *gender_multipliers,
    placement_multipliers_t *placement_multipliers
    ) {
    campaign_bid_options_t *campaign_bid_options_local_var = malloc(sizeof(campaign_bid_options_t));
    if (!campaign_bid_options_local_var) {
        return NULL;
    }
    memset(campaign_bid_options_local_var, 0, sizeof(campaign_bid_options_t));
    campaign_bid_options_local_var->_library_owned = 1;
    campaign_bid_options_local_var->age_bucket_multipliers = age_bucket_multipliers;
    campaign_bid_options_local_var->app_type_multipliers = app_type_multipliers;
    campaign_bid_options_local_var->audience_multipliers = audience_multipliers;
    campaign_bid_options_local_var->freq_bid_multiplier_time_window = freq_bid_multiplier_time_window;
    campaign_bid_options_local_var->frequency_multipliers = frequency_multipliers;
    campaign_bid_options_local_var->gender_multipliers = gender_multipliers;
    campaign_bid_options_local_var->placement_multipliers = placement_multipliers;
    return campaign_bid_options_local_var;
}

__attribute__((deprecated)) campaign_bid_options_t *campaign_bid_options_create(
    age_bucket_multipliers_t *age_bucket_multipliers,
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window,
    frequency_multipliers_t *frequency_multipliers,
    gender_multipliers_t *gender_multipliers,
    placement_multipliers_t *placement_multipliers
    ) {
    campaign_bid_options_t *result = campaign_bid_options_create_internal (
        age_bucket_multipliers,
        app_type_multipliers,
        audience_multipliers,
        freq_bid_multiplier_time_window,
        frequency_multipliers,
        gender_multipliers,
        placement_multipliers
        );
    if (!result) {
    }
    return result;
}

void campaign_bid_options_free(campaign_bid_options_t *campaign_bid_options) {
    if(NULL == campaign_bid_options){
        return ;
    }
    if(campaign_bid_options->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_bid_options_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_bid_options->age_bucket_multipliers) {
        age_bucket_multipliers_free(campaign_bid_options->age_bucket_multipliers);
        campaign_bid_options->age_bucket_multipliers = NULL;
    }
    if (campaign_bid_options->app_type_multipliers) {
        app_type_multipliers_free(campaign_bid_options->app_type_multipliers);
        campaign_bid_options->app_type_multipliers = NULL;
    }
    if (campaign_bid_options->audience_multipliers) {
        campaign_audience_multipliers_free(campaign_bid_options->audience_multipliers);
        campaign_bid_options->audience_multipliers = NULL;
    }
    if (campaign_bid_options->freq_bid_multiplier_time_window) {
        freq_bid_multiplier_time_window_free(campaign_bid_options->freq_bid_multiplier_time_window);
        campaign_bid_options->freq_bid_multiplier_time_window = NULL;
    }
    if (campaign_bid_options->frequency_multipliers) {
        frequency_multipliers_free(campaign_bid_options->frequency_multipliers);
        campaign_bid_options->frequency_multipliers = NULL;
    }
    if (campaign_bid_options->gender_multipliers) {
        gender_multipliers_free(campaign_bid_options->gender_multipliers);
        campaign_bid_options->gender_multipliers = NULL;
    }
    if (campaign_bid_options->placement_multipliers) {
        placement_multipliers_free(campaign_bid_options->placement_multipliers);
        campaign_bid_options->placement_multipliers = NULL;
    }
    free(campaign_bid_options);
}

cJSON *campaign_bid_options_convertToJSON(campaign_bid_options_t *campaign_bid_options) {
    cJSON *item = cJSON_CreateObject();

    // campaign_bid_options->age_bucket_multipliers
    if(campaign_bid_options->age_bucket_multipliers) {
    cJSON *age_bucket_multipliers_local_JSON = age_bucket_multipliers_convertToJSON(campaign_bid_options->age_bucket_multipliers);
    if(age_bucket_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "age_bucket_multipliers", age_bucket_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options->app_type_multipliers
    if(campaign_bid_options->app_type_multipliers) {
    cJSON *app_type_multipliers_local_JSON = app_type_multipliers_convertToJSON(campaign_bid_options->app_type_multipliers);
    if(app_type_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "app_type_multipliers", app_type_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options->audience_multipliers
    if(campaign_bid_options->audience_multipliers) {
    cJSON *audience_multipliers_local_JSON = campaign_audience_multipliers_convertToJSON(campaign_bid_options->audience_multipliers);
    if(audience_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_multipliers", audience_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options->freq_bid_multiplier_time_window
    if(campaign_bid_options->freq_bid_multiplier_time_window) {
    cJSON *freq_bid_multiplier_time_window_local_JSON = freq_bid_multiplier_time_window_convertToJSON(campaign_bid_options->freq_bid_multiplier_time_window);
    if(freq_bid_multiplier_time_window_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "freq_bid_multiplier_time_window", freq_bid_multiplier_time_window_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options->frequency_multipliers
    if(campaign_bid_options->frequency_multipliers) {
    cJSON *frequency_multipliers_local_JSON = frequency_multipliers_convertToJSON(campaign_bid_options->frequency_multipliers);
    if(frequency_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "frequency_multipliers", frequency_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options->gender_multipliers
    if(campaign_bid_options->gender_multipliers) {
    cJSON *gender_multipliers_local_JSON = gender_multipliers_convertToJSON(campaign_bid_options->gender_multipliers);
    if(gender_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "gender_multipliers", gender_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options->placement_multipliers
    if(campaign_bid_options->placement_multipliers) {
    cJSON *placement_multipliers_local_JSON = placement_multipliers_convertToJSON(campaign_bid_options->placement_multipliers);
    if(placement_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_multipliers", placement_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_bid_options_t *campaign_bid_options_parseFromJSON(cJSON *campaign_bid_optionsJSON){

    campaign_bid_options_t *campaign_bid_options_local_var = NULL;

    // define the local variable for campaign_bid_options->age_bucket_multipliers
    age_bucket_multipliers_t *age_bucket_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options->app_type_multipliers
    app_type_multipliers_t *app_type_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options->audience_multipliers
    campaign_audience_multipliers_t *audience_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options->freq_bid_multiplier_time_window
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window_local_nonprim = NULL;

    // define the local variable for campaign_bid_options->frequency_multipliers
    frequency_multipliers_t *frequency_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options->gender_multipliers
    gender_multipliers_t *gender_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options->placement_multipliers
    placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // campaign_bid_options->age_bucket_multipliers
    cJSON *age_bucket_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "age_bucket_multipliers");
    if (cJSON_IsNull(age_bucket_multipliers)) {
        age_bucket_multipliers = NULL;
    }
    if (age_bucket_multipliers) { 
    age_bucket_multipliers_local_nonprim = age_bucket_multipliers_parseFromJSON(age_bucket_multipliers); //custom
    }

    // campaign_bid_options->app_type_multipliers
    cJSON *app_type_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "app_type_multipliers");
    if (cJSON_IsNull(app_type_multipliers)) {
        app_type_multipliers = NULL;
    }
    if (app_type_multipliers) { 
    app_type_multipliers_local_nonprim = app_type_multipliers_parseFromJSON(app_type_multipliers); //custom
    }

    // campaign_bid_options->audience_multipliers
    cJSON *audience_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "audience_multipliers");
    if (cJSON_IsNull(audience_multipliers)) {
        audience_multipliers = NULL;
    }
    if (audience_multipliers) { 
    audience_multipliers_local_nonprim = campaign_audience_multipliers_parseFromJSON(audience_multipliers); //custom
    }

    // campaign_bid_options->freq_bid_multiplier_time_window
    cJSON *freq_bid_multiplier_time_window = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "freq_bid_multiplier_time_window");
    if (cJSON_IsNull(freq_bid_multiplier_time_window)) {
        freq_bid_multiplier_time_window = NULL;
    }
    if (freq_bid_multiplier_time_window) { 
    freq_bid_multiplier_time_window_local_nonprim = freq_bid_multiplier_time_window_parseFromJSON(freq_bid_multiplier_time_window); //custom
    }

    // campaign_bid_options->frequency_multipliers
    cJSON *frequency_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "frequency_multipliers");
    if (cJSON_IsNull(frequency_multipliers)) {
        frequency_multipliers = NULL;
    }
    if (frequency_multipliers) { 
    frequency_multipliers_local_nonprim = frequency_multipliers_parseFromJSON(frequency_multipliers); //custom
    }

    // campaign_bid_options->gender_multipliers
    cJSON *gender_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "gender_multipliers");
    if (cJSON_IsNull(gender_multipliers)) {
        gender_multipliers = NULL;
    }
    if (gender_multipliers) { 
    gender_multipliers_local_nonprim = gender_multipliers_parseFromJSON(gender_multipliers); //custom
    }

    // campaign_bid_options->placement_multipliers
    cJSON *placement_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_optionsJSON, "placement_multipliers");
    if (cJSON_IsNull(placement_multipliers)) {
        placement_multipliers = NULL;
    }
    if (placement_multipliers) { 
    placement_multipliers_local_nonprim = placement_multipliers_parseFromJSON(placement_multipliers); //custom
    }



    campaign_bid_options_local_var = campaign_bid_options_create_internal (
        age_bucket_multipliers ? age_bucket_multipliers_local_nonprim : NULL,
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        audience_multipliers ? audience_multipliers_local_nonprim : NULL,
        freq_bid_multiplier_time_window ? freq_bid_multiplier_time_window_local_nonprim : NULL,
        frequency_multipliers ? frequency_multipliers_local_nonprim : NULL,
        gender_multipliers ? gender_multipliers_local_nonprim : NULL,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL
        );

    if (!campaign_bid_options_local_var) {
        goto end;
    }

    return campaign_bid_options_local_var;
end:
    if (age_bucket_multipliers_local_nonprim) {
        age_bucket_multipliers_free(age_bucket_multipliers_local_nonprim);
        age_bucket_multipliers_local_nonprim = NULL;
    }
    if (app_type_multipliers_local_nonprim) {
        app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (audience_multipliers_local_nonprim) {
        campaign_audience_multipliers_free(audience_multipliers_local_nonprim);
        audience_multipliers_local_nonprim = NULL;
    }
    if (freq_bid_multiplier_time_window_local_nonprim) {
        freq_bid_multiplier_time_window_free(freq_bid_multiplier_time_window_local_nonprim);
        freq_bid_multiplier_time_window_local_nonprim = NULL;
    }
    if (frequency_multipliers_local_nonprim) {
        frequency_multipliers_free(frequency_multipliers_local_nonprim);
        frequency_multipliers_local_nonprim = NULL;
    }
    if (gender_multipliers_local_nonprim) {
        gender_multipliers_free(gender_multipliers_local_nonprim);
        gender_multipliers_local_nonprim = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    return NULL;

}
