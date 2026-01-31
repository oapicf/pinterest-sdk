#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "optimization_goal_metadata_conversion_tag_v3_goal_metadata.h"


char* optimization_goal_metadata_conversion_tag_v3_goal_metadata_conversion_event_ToString(pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_e conversion_event) {
    char* conversion_eventArray[] =  { "NULL", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL" };
    return conversion_eventArray[conversion_event];
}

pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_e optimization_goal_metadata_conversion_tag_v3_goal_metadata_conversion_event_FromString(char* conversion_event){
    int stringToReturn = 0;
    char *conversion_eventArray[] =  { "NULL", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL" };
    size_t sizeofArray = sizeof(conversion_eventArray) / sizeof(conversion_eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_event, conversion_eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* optimization_goal_metadata_conversion_tag_v3_goal_metadata_learning_mode_type_ToString(pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_e learning_mode_type) {
    char* learning_mode_typeArray[] =  { "NULL", "NOT_ACTIVE", "ACTIVE", "" };
    return learning_mode_typeArray[learning_mode_type];
}

pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_e optimization_goal_metadata_conversion_tag_v3_goal_metadata_learning_mode_type_FromString(char* learning_mode_type){
    int stringToReturn = 0;
    char *learning_mode_typeArray[] =  { "NULL", "NOT_ACTIVE", "ACTIVE", "" };
    size_t sizeofArray = sizeof(learning_mode_typeArray) / sizeof(learning_mode_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(learning_mode_type, learning_mode_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_create_internal(
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *attribution_windows,
    pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_e conversion_event,
    char *conversion_tag_id,
    char *cpa_goal_value_in_micro_currency,
    int is_roas_optimized,
    pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_e learning_mode_type,
    char *reporting_event
    ) {
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var = malloc(sizeof(optimization_goal_metadata_conversion_tag_v3_goal_metadata_t));
    if (!optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var) {
        return NULL;
    }
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->attribution_windows = attribution_windows;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->conversion_event = conversion_event;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->conversion_tag_id = conversion_tag_id;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->cpa_goal_value_in_micro_currency = cpa_goal_value_in_micro_currency;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->is_roas_optimized = is_roas_optimized;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->learning_mode_type = learning_mode_type;
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->reporting_event = reporting_event;

    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var->_library_owned = 1;
    return optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var;
}

__attribute__((deprecated)) optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_create(
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *attribution_windows,
    pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_e conversion_event,
    char *conversion_tag_id,
    char *cpa_goal_value_in_micro_currency,
    int is_roas_optimized,
    pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_e learning_mode_type,
    char *reporting_event
    ) {
    return optimization_goal_metadata_conversion_tag_v3_goal_metadata_create_internal (
        attribution_windows,
        conversion_event,
        conversion_tag_id,
        cpa_goal_value_in_micro_currency,
        is_roas_optimized,
        learning_mode_type,
        reporting_event
        );
}

void optimization_goal_metadata_conversion_tag_v3_goal_metadata_free(optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata) {
    if(NULL == optimization_goal_metadata_conversion_tag_v3_goal_metadata){
        return ;
    }
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "optimization_goal_metadata_conversion_tag_v3_goal_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows) {
        optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_free(optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows);
        optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows = NULL;
    }
    if (optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id) {
        free(optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id);
        optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id = NULL;
    }
    if (optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency) {
        free(optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency);
        optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency = NULL;
    }
    if (optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event) {
        free(optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event);
        optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event = NULL;
    }
    free(optimization_goal_metadata_conversion_tag_v3_goal_metadata);
}

cJSON *optimization_goal_metadata_conversion_tag_v3_goal_metadata_convertToJSON(optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows) {
    cJSON *attribution_windows_local_JSON = optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_convertToJSON(optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows);
    if(attribution_windows_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attribution_windows", attribution_windows_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_event
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_event != pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_NULL) {
    if(cJSON_AddStringToObject(item, "conversion_event", optimization_goal_metadata_conversion_tag_v3_goal_metadata_conversion_event_ToString(optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_event)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id) {
    if(cJSON_AddStringToObject(item, "conversion_tag_id", optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id) == NULL) {
    goto fail; //String
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency) {
    if(cJSON_AddStringToObject(item, "cpa_goal_value_in_micro_currency", optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency) == NULL) {
    goto fail; //String
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->is_roas_optimized
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->is_roas_optimized) {
    if(cJSON_AddBoolToObject(item, "is_roas_optimized", optimization_goal_metadata_conversion_tag_v3_goal_metadata->is_roas_optimized) == NULL) {
    goto fail; //Bool
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->learning_mode_type
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->learning_mode_type != pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_NULL) {
    if(cJSON_AddStringToObject(item, "learning_mode_type", optimization_goal_metadata_conversion_tag_v3_goal_metadata_learning_mode_type_ToString(optimization_goal_metadata_conversion_tag_v3_goal_metadata->learning_mode_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event
    if(optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event) {
    if(cJSON_AddStringToObject(item, "reporting_event", optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event) == NULL) {
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

optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_parseFromJSON(cJSON *optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON){

    optimization_goal_metadata_conversion_tag_v3_goal_metadata_t *optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var = NULL;

    // define the local variable for optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows
    optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t *attribution_windows_local_nonprim = NULL;

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->attribution_windows
    cJSON *attribution_windows = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "attribution_windows");
    if (cJSON_IsNull(attribution_windows)) {
        attribution_windows = NULL;
    }
    if (attribution_windows) { 
    attribution_windows_local_nonprim = optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_parseFromJSON(attribution_windows); //nonprimitive
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_event
    cJSON *conversion_event = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "conversion_event");
    if (cJSON_IsNull(conversion_event)) {
        conversion_event = NULL;
    }
    pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_e conversion_eventVariable;
    if (conversion_event) { 
    if(!cJSON_IsString(conversion_event))
    {
    goto end; //Enum
    }
    conversion_eventVariable = optimization_goal_metadata_conversion_tag_v3_goal_metadata_conversion_event_FromString(conversion_event->valuestring);
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->conversion_tag_id
    cJSON *conversion_tag_id = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "conversion_tag_id");
    if (cJSON_IsNull(conversion_tag_id)) {
        conversion_tag_id = NULL;
    }
    if (conversion_tag_id) { 
    if(!cJSON_IsString(conversion_tag_id) && !cJSON_IsNull(conversion_tag_id))
    {
    goto end; //String
    }
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->cpa_goal_value_in_micro_currency
    cJSON *cpa_goal_value_in_micro_currency = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "cpa_goal_value_in_micro_currency");
    if (cJSON_IsNull(cpa_goal_value_in_micro_currency)) {
        cpa_goal_value_in_micro_currency = NULL;
    }
    if (cpa_goal_value_in_micro_currency) { 
    if(!cJSON_IsString(cpa_goal_value_in_micro_currency) && !cJSON_IsNull(cpa_goal_value_in_micro_currency))
    {
    goto end; //String
    }
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->is_roas_optimized
    cJSON *is_roas_optimized = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "is_roas_optimized");
    if (cJSON_IsNull(is_roas_optimized)) {
        is_roas_optimized = NULL;
    }
    if (is_roas_optimized) { 
    if(!cJSON_IsBool(is_roas_optimized))
    {
    goto end; //Bool
    }
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->learning_mode_type
    cJSON *learning_mode_type = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "learning_mode_type");
    if (cJSON_IsNull(learning_mode_type)) {
        learning_mode_type = NULL;
    }
    pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_e learning_mode_typeVariable;
    if (learning_mode_type) { 
    if(!cJSON_IsString(learning_mode_type))
    {
    goto end; //Enum
    }
    learning_mode_typeVariable = optimization_goal_metadata_conversion_tag_v3_goal_metadata_learning_mode_type_FromString(learning_mode_type->valuestring);
    }

    // optimization_goal_metadata_conversion_tag_v3_goal_metadata->reporting_event
    cJSON *reporting_event = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_conversion_tag_v3_goal_metadataJSON, "reporting_event");
    if (cJSON_IsNull(reporting_event)) {
        reporting_event = NULL;
    }
    if (reporting_event) { 
    if(!cJSON_IsString(reporting_event) && !cJSON_IsNull(reporting_event))
    {
    goto end; //String
    }
    }


    optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var = optimization_goal_metadata_conversion_tag_v3_goal_metadata_create_internal (
        attribution_windows ? attribution_windows_local_nonprim : NULL,
        conversion_event ? conversion_eventVariable : pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_NULL,
        conversion_tag_id && !cJSON_IsNull(conversion_tag_id) ? strdup(conversion_tag_id->valuestring) : NULL,
        cpa_goal_value_in_micro_currency && !cJSON_IsNull(cpa_goal_value_in_micro_currency) ? strdup(cpa_goal_value_in_micro_currency->valuestring) : NULL,
        is_roas_optimized ? is_roas_optimized->valueint : 0,
        learning_mode_type ? learning_mode_typeVariable : pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_NULL,
        reporting_event && !cJSON_IsNull(reporting_event) ? strdup(reporting_event->valuestring) : NULL
        );

    return optimization_goal_metadata_conversion_tag_v3_goal_metadata_local_var;
end:
    if (attribution_windows_local_nonprim) {
        optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_free(attribution_windows_local_nonprim);
        attribution_windows_local_nonprim = NULL;
    }
    return NULL;

}
