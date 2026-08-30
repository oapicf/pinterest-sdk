#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "event_quality_score.h"



static event_quality_score_t *event_quality_score_create_internal(
    pinterest_rest_api_ingestion_source_options__e ingestion_source,
    pinterest_rest_api_lookback_period_options__e lookback_period,
    pinterest_rest_api_overall_status_options__e overall_status,
    quality_components_t *quality_components,
    pinterest_rest_api_source_platform_options__e source_platform
    ) {
    event_quality_score_t *event_quality_score_local_var = malloc(sizeof(event_quality_score_t));
    if (!event_quality_score_local_var) {
        return NULL;
    }
    memset(event_quality_score_local_var, 0, sizeof(event_quality_score_t));
    event_quality_score_local_var->_library_owned = 1;
    event_quality_score_local_var->ingestion_source = ingestion_source;
    event_quality_score_local_var->lookback_period = lookback_period;
    event_quality_score_local_var->overall_status = overall_status;
    event_quality_score_local_var->quality_components = quality_components;
    event_quality_score_local_var->source_platform = source_platform;
    return event_quality_score_local_var;
}

__attribute__((deprecated)) event_quality_score_t *event_quality_score_create(
    pinterest_rest_api_ingestion_source_options__e ingestion_source,
    pinterest_rest_api_lookback_period_options__e lookback_period,
    pinterest_rest_api_overall_status_options__e overall_status,
    quality_components_t *quality_components,
    pinterest_rest_api_source_platform_options__e source_platform
    ) {
    event_quality_score_t *result = event_quality_score_create_internal (
        ingestion_source,
        lookback_period,
        overall_status,
        quality_components,
        source_platform
        );
    if (!result) {
    }
    return result;
}

void event_quality_score_free(event_quality_score_t *event_quality_score) {
    if(NULL == event_quality_score){
        return ;
    }
    if(event_quality_score->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "event_quality_score_free");
        return ;
    }
    listEntry_t *listEntry;
    if (event_quality_score->quality_components) {
        quality_components_free(event_quality_score->quality_components);
        event_quality_score->quality_components = NULL;
    }
    free(event_quality_score);
}

cJSON *event_quality_score_convertToJSON(event_quality_score_t *event_quality_score) {
    cJSON *item = cJSON_CreateObject();

    // event_quality_score->ingestion_source
    if (pinterest_rest_api_ingestion_source_options__NULL == event_quality_score->ingestion_source) {
        goto fail;
    }
    cJSON *ingestion_source_local_JSON = ingestion_source_options_convertToJSON(event_quality_score->ingestion_source);
    if(ingestion_source_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "ingestion_source", ingestion_source_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // event_quality_score->lookback_period
    if (pinterest_rest_api_lookback_period_options__NULL == event_quality_score->lookback_period) {
        goto fail;
    }
    cJSON *lookback_period_local_JSON = lookback_period_options_convertToJSON(event_quality_score->lookback_period);
    if(lookback_period_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "lookback_period", lookback_period_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // event_quality_score->overall_status
    if (pinterest_rest_api_overall_status_options__NULL == event_quality_score->overall_status) {
        goto fail;
    }
    cJSON *overall_status_local_JSON = overall_status_options_convertToJSON(event_quality_score->overall_status);
    if(overall_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "overall_status", overall_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // event_quality_score->quality_components
    if (!event_quality_score->quality_components) {
        goto fail;
    }
    cJSON *quality_components_local_JSON = quality_components_convertToJSON(event_quality_score->quality_components);
    if(quality_components_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quality_components", quality_components_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // event_quality_score->source_platform
    if (pinterest_rest_api_source_platform_options__NULL == event_quality_score->source_platform) {
        goto fail;
    }
    cJSON *source_platform_local_JSON = source_platform_options_convertToJSON(event_quality_score->source_platform);
    if(source_platform_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "source_platform", source_platform_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

event_quality_score_t *event_quality_score_parseFromJSON(cJSON *event_quality_scoreJSON){

    event_quality_score_t *event_quality_score_local_var = NULL;

    // define the local variable for event_quality_score->ingestion_source
    pinterest_rest_api_ingestion_source_options__e ingestion_source_local_nonprim = 0;

    // define the local variable for event_quality_score->lookback_period
    pinterest_rest_api_lookback_period_options__e lookback_period_local_nonprim = 0;

    // define the local variable for event_quality_score->overall_status
    pinterest_rest_api_overall_status_options__e overall_status_local_nonprim = 0;

    // define the local variable for event_quality_score->quality_components
    quality_components_t *quality_components_local_nonprim = NULL;

    // define the local variable for event_quality_score->source_platform
    pinterest_rest_api_source_platform_options__e source_platform_local_nonprim = 0;

    // event_quality_score->ingestion_source
    cJSON *ingestion_source = cJSON_GetObjectItemCaseSensitive(event_quality_scoreJSON, "ingestion_source");
    if (cJSON_IsNull(ingestion_source)) {
        ingestion_source = NULL;
    }
    if (!ingestion_source) {
        goto end;
    }

    
    ingestion_source_local_nonprim = ingestion_source_options_parseFromJSON(ingestion_source); //custom

    // event_quality_score->lookback_period
    cJSON *lookback_period = cJSON_GetObjectItemCaseSensitive(event_quality_scoreJSON, "lookback_period");
    if (cJSON_IsNull(lookback_period)) {
        lookback_period = NULL;
    }
    if (!lookback_period) {
        goto end;
    }

    
    lookback_period_local_nonprim = lookback_period_options_parseFromJSON(lookback_period); //custom

    // event_quality_score->overall_status
    cJSON *overall_status = cJSON_GetObjectItemCaseSensitive(event_quality_scoreJSON, "overall_status");
    if (cJSON_IsNull(overall_status)) {
        overall_status = NULL;
    }
    if (!overall_status) {
        goto end;
    }

    
    overall_status_local_nonprim = overall_status_options_parseFromJSON(overall_status); //custom

    // event_quality_score->quality_components
    cJSON *quality_components = cJSON_GetObjectItemCaseSensitive(event_quality_scoreJSON, "quality_components");
    if (cJSON_IsNull(quality_components)) {
        quality_components = NULL;
    }
    if (!quality_components) {
        goto end;
    }

    
    quality_components_local_nonprim = quality_components_parseFromJSON(quality_components); //nonprimitive

    // event_quality_score->source_platform
    cJSON *source_platform = cJSON_GetObjectItemCaseSensitive(event_quality_scoreJSON, "source_platform");
    if (cJSON_IsNull(source_platform)) {
        source_platform = NULL;
    }
    if (!source_platform) {
        goto end;
    }

    
    source_platform_local_nonprim = source_platform_options_parseFromJSON(source_platform); //custom



    event_quality_score_local_var = event_quality_score_create_internal (
        ingestion_source_local_nonprim,
        lookback_period_local_nonprim,
        overall_status_local_nonprim,
        quality_components_local_nonprim,
        source_platform_local_nonprim
        );

    if (!event_quality_score_local_var) {
        goto end;
    }

    return event_quality_score_local_var;
end:
    if (ingestion_source_local_nonprim) {
        ingestion_source_local_nonprim = 0;
    }
    if (lookback_period_local_nonprim) {
        lookback_period_local_nonprim = 0;
    }
    if (overall_status_local_nonprim) {
        overall_status_local_nonprim = 0;
    }
    if (quality_components_local_nonprim) {
        quality_components_free(quality_components_local_nonprim);
        quality_components_local_nonprim = NULL;
    }
    if (source_platform_local_nonprim) {
        source_platform_local_nonprim = 0;
    }
    return NULL;

}
