#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_v3_goal_metadata.h"



static conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_create_internal(
    attribution_windows_t *attribution_windows,
    pinterest_rest_api_conversion_event__e conversion_event,
    char *conversion_tag_id,
    char *cpa_goal_value_in_micro_currency,
    int *is_roas_optimized,
    char *reporting_event
    ) {
    conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_local_var = malloc(sizeof(conversion_tag_v3_goal_metadata_t));
    if (!conversion_tag_v3_goal_metadata_local_var) {
        return NULL;
    }
    memset(conversion_tag_v3_goal_metadata_local_var, 0, sizeof(conversion_tag_v3_goal_metadata_t));
    conversion_tag_v3_goal_metadata_local_var->_library_owned = 1;
    conversion_tag_v3_goal_metadata_local_var->attribution_windows = attribution_windows;
    conversion_tag_v3_goal_metadata_local_var->conversion_event = conversion_event;
    conversion_tag_v3_goal_metadata_local_var->conversion_tag_id = conversion_tag_id;
    conversion_tag_v3_goal_metadata_local_var->cpa_goal_value_in_micro_currency = cpa_goal_value_in_micro_currency;
    conversion_tag_v3_goal_metadata_local_var->is_roas_optimized = is_roas_optimized;
    conversion_tag_v3_goal_metadata_local_var->reporting_event = reporting_event;
    return conversion_tag_v3_goal_metadata_local_var;
}

__attribute__((deprecated)) conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_create(
    attribution_windows_t *attribution_windows,
    pinterest_rest_api_conversion_event__e conversion_event,
    char *conversion_tag_id,
    char *cpa_goal_value_in_micro_currency,
    int *is_roas_optimized,
    char *reporting_event
    ) {
    int *is_roas_optimized_copy = NULL;
    if (is_roas_optimized) {
        is_roas_optimized_copy = malloc(sizeof(int));
        if (is_roas_optimized_copy) *is_roas_optimized_copy = *is_roas_optimized;
    }
    conversion_tag_v3_goal_metadata_t *result = conversion_tag_v3_goal_metadata_create_internal (
        attribution_windows,
        conversion_event,
        conversion_tag_id,
        cpa_goal_value_in_micro_currency,
        is_roas_optimized_copy,
        reporting_event
        );
    if (!result) {
        free(is_roas_optimized_copy);
    }
    return result;
}

void conversion_tag_v3_goal_metadata_free(conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata) {
    if(NULL == conversion_tag_v3_goal_metadata){
        return ;
    }
    if(conversion_tag_v3_goal_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_tag_v3_goal_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tag_v3_goal_metadata->attribution_windows) {
        attribution_windows_free(conversion_tag_v3_goal_metadata->attribution_windows);
        conversion_tag_v3_goal_metadata->attribution_windows = NULL;
    }
    if (conversion_tag_v3_goal_metadata->conversion_tag_id) {
        free(conversion_tag_v3_goal_metadata->conversion_tag_id);
        conversion_tag_v3_goal_metadata->conversion_tag_id = NULL;
    }
    if (conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency) {
        free(conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency);
        conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency = NULL;
    }
    if (conversion_tag_v3_goal_metadata->is_roas_optimized) {
        free(conversion_tag_v3_goal_metadata->is_roas_optimized);
        conversion_tag_v3_goal_metadata->is_roas_optimized = NULL;
    }
    if (conversion_tag_v3_goal_metadata->reporting_event) {
        free(conversion_tag_v3_goal_metadata->reporting_event);
        conversion_tag_v3_goal_metadata->reporting_event = NULL;
    }
    free(conversion_tag_v3_goal_metadata);
}

cJSON *conversion_tag_v3_goal_metadata_convertToJSON(conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_v3_goal_metadata->attribution_windows
    if(conversion_tag_v3_goal_metadata->attribution_windows) {
    cJSON *attribution_windows_local_JSON = attribution_windows_convertToJSON(conversion_tag_v3_goal_metadata->attribution_windows);
    if(attribution_windows_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attribution_windows", attribution_windows_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_tag_v3_goal_metadata->conversion_event
    if(conversion_tag_v3_goal_metadata->conversion_event != pinterest_rest_api_conversion_event__NULL) {
    cJSON *conversion_event_local_JSON = conversion_event_convertToJSON(conversion_tag_v3_goal_metadata->conversion_event);
    if(conversion_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_event", conversion_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_tag_v3_goal_metadata->conversion_tag_id
    if(conversion_tag_v3_goal_metadata->conversion_tag_id) {
    if(cJSON_AddStringToObject(item, "conversion_tag_id", conversion_tag_v3_goal_metadata->conversion_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency
    if(conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency) {
    if(cJSON_AddStringToObject(item, "cpa_goal_value_in_micro_currency", conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_v3_goal_metadata->is_roas_optimized
    if(conversion_tag_v3_goal_metadata->is_roas_optimized) {
    if(cJSON_AddBoolToObject(item, "is_roas_optimized", *conversion_tag_v3_goal_metadata->is_roas_optimized) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_tag_v3_goal_metadata->reporting_event
    if(conversion_tag_v3_goal_metadata->reporting_event) {
    if(cJSON_AddStringToObject(item, "reporting_event", conversion_tag_v3_goal_metadata->reporting_event) == NULL) {
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

conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_parseFromJSON(cJSON *conversion_tag_v3_goal_metadataJSON){

    conversion_tag_v3_goal_metadata_t *conversion_tag_v3_goal_metadata_local_var = NULL;

    // define the local variable for conversion_tag_v3_goal_metadata->attribution_windows
    attribution_windows_t *attribution_windows_local_nonprim = NULL;

    // define the local variable for conversion_tag_v3_goal_metadata->conversion_event
    pinterest_rest_api_conversion_event__e conversion_event_local_nonprim = 0;

    char *conversion_tag_id_local_str = NULL;

    char *cpa_goal_value_in_micro_currency_local_str = NULL;

    // define the local variable for conversion_tag_v3_goal_metadata->is_roas_optimized
    int *is_roas_optimized_local_var = NULL;

    char *reporting_event_local_str = NULL;

    // conversion_tag_v3_goal_metadata->attribution_windows
    cJSON *attribution_windows = cJSON_GetObjectItemCaseSensitive(conversion_tag_v3_goal_metadataJSON, "attribution_windows");
    if (cJSON_IsNull(attribution_windows)) {
        attribution_windows = NULL;
    }
    if (attribution_windows) { 
    attribution_windows_local_nonprim = attribution_windows_parseFromJSON(attribution_windows); //nonprimitive
    }

    // conversion_tag_v3_goal_metadata->conversion_event
    cJSON *conversion_event = cJSON_GetObjectItemCaseSensitive(conversion_tag_v3_goal_metadataJSON, "conversion_event");
    if (cJSON_IsNull(conversion_event)) {
        conversion_event = NULL;
    }
    if (conversion_event) { 
    conversion_event_local_nonprim = conversion_event_parseFromJSON(conversion_event); //custom
    }

    // conversion_tag_v3_goal_metadata->conversion_tag_id
    cJSON *conversion_tag_id = cJSON_GetObjectItemCaseSensitive(conversion_tag_v3_goal_metadataJSON, "conversion_tag_id");
    if (cJSON_IsNull(conversion_tag_id)) {
        conversion_tag_id = NULL;
    }
    if (conversion_tag_id) { 
    if(!cJSON_IsString(conversion_tag_id) && !cJSON_IsNull(conversion_tag_id))
    {
    goto end; //String
    }
    }

    // conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency
    cJSON *cpa_goal_value_in_micro_currency = cJSON_GetObjectItemCaseSensitive(conversion_tag_v3_goal_metadataJSON, "cpa_goal_value_in_micro_currency");
    if (cJSON_IsNull(cpa_goal_value_in_micro_currency)) {
        cpa_goal_value_in_micro_currency = NULL;
    }
    if (cpa_goal_value_in_micro_currency) { 
    if(!cJSON_IsString(cpa_goal_value_in_micro_currency) && !cJSON_IsNull(cpa_goal_value_in_micro_currency))
    {
    goto end; //String
    }
    }

    // conversion_tag_v3_goal_metadata->is_roas_optimized
    cJSON *is_roas_optimized = cJSON_GetObjectItemCaseSensitive(conversion_tag_v3_goal_metadataJSON, "is_roas_optimized");
    if (cJSON_IsNull(is_roas_optimized)) {
        is_roas_optimized = NULL;
    }
    if (is_roas_optimized) { 
    if(!cJSON_IsBool(is_roas_optimized))
    {
    goto end; //Bool
    }
    is_roas_optimized_local_var = malloc(sizeof(int));
    if(!is_roas_optimized_local_var)
    {
        goto end;
    }
    *is_roas_optimized_local_var = is_roas_optimized->valueint;
    }

    // conversion_tag_v3_goal_metadata->reporting_event
    cJSON *reporting_event = cJSON_GetObjectItemCaseSensitive(conversion_tag_v3_goal_metadataJSON, "reporting_event");
    if (cJSON_IsNull(reporting_event)) {
        reporting_event = NULL;
    }
    if (reporting_event) { 
    if(!cJSON_IsString(reporting_event) && !cJSON_IsNull(reporting_event))
    {
    goto end; //String
    }
    }


    if (conversion_tag_id && !cJSON_IsNull(conversion_tag_id)) conversion_tag_id_local_str = strdup(conversion_tag_id->valuestring);
    if (cpa_goal_value_in_micro_currency && !cJSON_IsNull(cpa_goal_value_in_micro_currency)) cpa_goal_value_in_micro_currency_local_str = strdup(cpa_goal_value_in_micro_currency->valuestring);
    if (reporting_event && !cJSON_IsNull(reporting_event)) reporting_event_local_str = strdup(reporting_event->valuestring);

    conversion_tag_v3_goal_metadata_local_var = conversion_tag_v3_goal_metadata_create_internal (
        attribution_windows ? attribution_windows_local_nonprim : NULL,
        conversion_event ? conversion_event_local_nonprim : 0,
        conversion_tag_id_local_str,
        cpa_goal_value_in_micro_currency_local_str,
        is_roas_optimized_local_var,
        reporting_event_local_str
        );

    if (!conversion_tag_v3_goal_metadata_local_var) {
        goto end;
    }

    return conversion_tag_v3_goal_metadata_local_var;
end:
    if (attribution_windows_local_nonprim) {
        attribution_windows_free(attribution_windows_local_nonprim);
        attribution_windows_local_nonprim = NULL;
    }
    if (conversion_event_local_nonprim) {
        conversion_event_local_nonprim = 0;
    }
    if (conversion_tag_id_local_str) {
        free(conversion_tag_id_local_str);
        conversion_tag_id_local_str = NULL;
    }
    if (cpa_goal_value_in_micro_currency_local_str) {
        free(cpa_goal_value_in_micro_currency_local_str);
        cpa_goal_value_in_micro_currency_local_str = NULL;
    }
    if (is_roas_optimized_local_var) {
        free(is_roas_optimized_local_var);
        is_roas_optimized_local_var = NULL;
    }
    if (reporting_event_local_str) {
        free(reporting_event_local_str);
        reporting_event_local_str = NULL;
    }
    return NULL;

}
