#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_msot_events.h"


char* conversion_msot_events_attribution_model_ToString(pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_model) {
    char* attribution_modelArray[] =  { "NULL", "first_touch", "last_touch", "multi_touch" };
    return attribution_modelArray[attribution_model];
}

pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e conversion_msot_events_attribution_model_FromString(char* attribution_model){
    int stringToReturn = 0;
    char *attribution_modelArray[] =  { "NULL", "first_touch", "last_touch", "multi_touch" };
    size_t sizeofArray = sizeof(attribution_modelArray) / sizeof(attribution_modelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_model, attribution_modelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_msot_events_attribution_scope_ToString(pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scope) {
    char* attribution_scopeArray[] =  { "NULL", "view", "engagement", "click" };
    return attribution_scopeArray[attribution_scope];
}

pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e conversion_msot_events_attribution_scope_FromString(char* attribution_scope){
    int stringToReturn = 0;
    char *attribution_scopeArray[] =  { "NULL", "view", "engagement", "click" };
    size_t sizeofArray = sizeof(attribution_scopeArray) / sizeof(attribution_scopeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_scope, attribution_scopeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_msot_events_event_name_ToString(pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_name) {
    char* event_nameArray[] =  { "NULL", "add_to_cart", "checkout", "lead", "signup" };
    return event_nameArray[event_name];
}

pinterest_rest_api_conversion_msot_events_EVENTNAME_e conversion_msot_events_event_name_FromString(char* event_name){
    int stringToReturn = 0;
    char *event_nameArray[] =  { "NULL", "add_to_cart", "checkout", "lead", "signup" };
    size_t sizeofArray = sizeof(event_nameArray) / sizeof(event_nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event_name, event_nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static conversion_msot_events_t *conversion_msot_events_create_internal(
    list_t *action_timestamps,
    char *ad_group_id,
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_model,
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scope,
    double attribution_score,
    char *campaign_id,
    currency_t *currency,
    char *event_id,
    pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_name,
    long event_timestamp,
    int total_event_touchpoints,
    int total_events,
    double value
    ) {
    conversion_msot_events_t *conversion_msot_events_local_var = malloc(sizeof(conversion_msot_events_t));
    if (!conversion_msot_events_local_var) {
        return NULL;
    }
    conversion_msot_events_local_var->action_timestamps = action_timestamps;
    conversion_msot_events_local_var->ad_group_id = ad_group_id;
    conversion_msot_events_local_var->attribution_model = attribution_model;
    conversion_msot_events_local_var->attribution_scope = attribution_scope;
    conversion_msot_events_local_var->attribution_score = attribution_score;
    conversion_msot_events_local_var->campaign_id = campaign_id;
    conversion_msot_events_local_var->currency = currency;
    conversion_msot_events_local_var->event_id = event_id;
    conversion_msot_events_local_var->event_name = event_name;
    conversion_msot_events_local_var->event_timestamp = event_timestamp;
    conversion_msot_events_local_var->total_event_touchpoints = total_event_touchpoints;
    conversion_msot_events_local_var->total_events = total_events;
    conversion_msot_events_local_var->value = value;

    conversion_msot_events_local_var->_library_owned = 1;
    return conversion_msot_events_local_var;
}

__attribute__((deprecated)) conversion_msot_events_t *conversion_msot_events_create(
    list_t *action_timestamps,
    char *ad_group_id,
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_model,
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scope,
    double attribution_score,
    char *campaign_id,
    currency_t *currency,
    char *event_id,
    pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_name,
    long event_timestamp,
    int total_event_touchpoints,
    int total_events,
    double value
    ) {
    return conversion_msot_events_create_internal (
        action_timestamps,
        ad_group_id,
        attribution_model,
        attribution_scope,
        attribution_score,
        campaign_id,
        currency,
        event_id,
        event_name,
        event_timestamp,
        total_event_touchpoints,
        total_events,
        value
        );
}

void conversion_msot_events_free(conversion_msot_events_t *conversion_msot_events) {
    if(NULL == conversion_msot_events){
        return ;
    }
    if(conversion_msot_events->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_msot_events_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_msot_events->action_timestamps) {
        list_ForEach(listEntry, conversion_msot_events->action_timestamps) {
            free(listEntry->data);
        }
        list_freeList(conversion_msot_events->action_timestamps);
        conversion_msot_events->action_timestamps = NULL;
    }
    if (conversion_msot_events->ad_group_id) {
        free(conversion_msot_events->ad_group_id);
        conversion_msot_events->ad_group_id = NULL;
    }
    if (conversion_msot_events->campaign_id) {
        free(conversion_msot_events->campaign_id);
        conversion_msot_events->campaign_id = NULL;
    }
    if (conversion_msot_events->currency) {
        currency_free(conversion_msot_events->currency);
        conversion_msot_events->currency = NULL;
    }
    if (conversion_msot_events->event_id) {
        free(conversion_msot_events->event_id);
        conversion_msot_events->event_id = NULL;
    }
    free(conversion_msot_events);
}

cJSON *conversion_msot_events_convertToJSON(conversion_msot_events_t *conversion_msot_events) {
    cJSON *item = cJSON_CreateObject();

    // conversion_msot_events->action_timestamps
    if(conversion_msot_events->action_timestamps) {
    cJSON *action_timestamps = cJSON_AddArrayToObject(item, "action_timestamps");
    if(action_timestamps == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *action_timestampsListEntry;
    list_ForEach(action_timestampsListEntry, conversion_msot_events->action_timestamps) {
    if(cJSON_AddNumberToObject(action_timestamps, "", *(double *)action_timestampsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_msot_events->ad_group_id
    if (!conversion_msot_events->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", conversion_msot_events->ad_group_id) == NULL) {
    goto fail; //String
    }


    // conversion_msot_events->attribution_model
    if(conversion_msot_events->attribution_model != pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_NULL) {
    if(cJSON_AddStringToObject(item, "attribution_model", conversion_msot_events_attribution_model_ToString(conversion_msot_events->attribution_model)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // conversion_msot_events->attribution_scope
    if (pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_NULL == conversion_msot_events->attribution_scope) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "attribution_scope", conversion_msot_events_attribution_scope_ToString(conversion_msot_events->attribution_scope)) == NULL)
    {
    goto fail; //Enum
    }


    // conversion_msot_events->attribution_score
    if(conversion_msot_events->attribution_score) {
    if(cJSON_AddNumberToObject(item, "attribution_score", conversion_msot_events->attribution_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events->campaign_id
    if(conversion_msot_events->campaign_id) {
    if(cJSON_AddStringToObject(item, "campaign_id", conversion_msot_events->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_msot_events->currency
    if(conversion_msot_events->currency) {
    cJSON *currency_local_JSON = currency_convertToJSON(conversion_msot_events->currency);
    if(currency_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_msot_events->event_id
    if (!conversion_msot_events->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", conversion_msot_events->event_id) == NULL) {
    goto fail; //String
    }


    // conversion_msot_events->event_name
    if (pinterest_rest_api_conversion_msot_events_EVENTNAME_NULL == conversion_msot_events->event_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_name", conversion_msot_events_event_name_ToString(conversion_msot_events->event_name)) == NULL)
    {
    goto fail; //Enum
    }


    // conversion_msot_events->event_timestamp
    if (!conversion_msot_events->event_timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "event_timestamp", conversion_msot_events->event_timestamp) == NULL) {
    goto fail; //Numeric
    }


    // conversion_msot_events->total_event_touchpoints
    if(conversion_msot_events->total_event_touchpoints) {
    if(cJSON_AddNumberToObject(item, "total_event_touchpoints", conversion_msot_events->total_event_touchpoints) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events->total_events
    if(conversion_msot_events->total_events) {
    if(cJSON_AddNumberToObject(item, "total_events", conversion_msot_events->total_events) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events->value
    if(conversion_msot_events->value) {
    if(cJSON_AddNumberToObject(item, "value", conversion_msot_events->value) == NULL) {
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

conversion_msot_events_t *conversion_msot_events_parseFromJSON(cJSON *conversion_msot_eventsJSON){

    conversion_msot_events_t *conversion_msot_events_local_var = NULL;

    // define the local list for conversion_msot_events->action_timestamps
    list_t *action_timestampsList = NULL;

    // define the local variable for conversion_msot_events->currency
    currency_t *currency_local_nonprim = NULL;

    // conversion_msot_events->action_timestamps
    cJSON *action_timestamps = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "action_timestamps");
    if (cJSON_IsNull(action_timestamps)) {
        action_timestamps = NULL;
    }
    if (action_timestamps) { 
    cJSON *action_timestamps_local = NULL;
    if(!cJSON_IsArray(action_timestamps)) {
        goto end;//primitive container
    }
    action_timestampsList = list_createList();

    cJSON_ArrayForEach(action_timestamps_local, action_timestamps)
    {
        if(!cJSON_IsNumber(action_timestamps_local))
        {
            goto end;
        }
        double *action_timestamps_local_value = calloc(1, sizeof(double));
        if(!action_timestamps_local_value)
        {
            goto end;
        }
        *action_timestamps_local_value = action_timestamps_local->valuedouble;
        list_addElement(action_timestampsList , action_timestamps_local_value);
    }
    }

    // conversion_msot_events->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // conversion_msot_events->attribution_model
    cJSON *attribution_model = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "attribution_model");
    if (cJSON_IsNull(attribution_model)) {
        attribution_model = NULL;
    }
    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_e attribution_modelVariable;
    if (attribution_model) { 
    if(!cJSON_IsString(attribution_model))
    {
    goto end; //Enum
    }
    attribution_modelVariable = conversion_msot_events_attribution_model_FromString(attribution_model->valuestring);
    }

    // conversion_msot_events->attribution_scope
    cJSON *attribution_scope = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "attribution_scope");
    if (cJSON_IsNull(attribution_scope)) {
        attribution_scope = NULL;
    }
    if (!attribution_scope) {
        goto end;
    }

    pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_e attribution_scopeVariable;
    
    if(!cJSON_IsString(attribution_scope))
    {
    goto end; //Enum
    }
    attribution_scopeVariable = conversion_msot_events_attribution_scope_FromString(attribution_scope->valuestring);

    // conversion_msot_events->attribution_score
    cJSON *attribution_score = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "attribution_score");
    if (cJSON_IsNull(attribution_score)) {
        attribution_score = NULL;
    }
    if (attribution_score) { 
    if(!cJSON_IsNumber(attribution_score))
    {
    goto end; //Numeric
    }
    }

    // conversion_msot_events->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // conversion_msot_events->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //nonprimitive
    }

    // conversion_msot_events->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (!event_id) {
        goto end;
    }

    
    if(!cJSON_IsString(event_id))
    {
    goto end; //String
    }

    // conversion_msot_events->event_name
    cJSON *event_name = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "event_name");
    if (cJSON_IsNull(event_name)) {
        event_name = NULL;
    }
    if (!event_name) {
        goto end;
    }

    pinterest_rest_api_conversion_msot_events_EVENTNAME_e event_nameVariable;
    
    if(!cJSON_IsString(event_name))
    {
    goto end; //Enum
    }
    event_nameVariable = conversion_msot_events_event_name_FromString(event_name->valuestring);

    // conversion_msot_events->event_timestamp
    cJSON *event_timestamp = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "event_timestamp");
    if (cJSON_IsNull(event_timestamp)) {
        event_timestamp = NULL;
    }
    if (!event_timestamp) {
        goto end;
    }

    
    if(!cJSON_IsNumber(event_timestamp))
    {
    goto end; //Numeric
    }

    // conversion_msot_events->total_event_touchpoints
    cJSON *total_event_touchpoints = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "total_event_touchpoints");
    if (cJSON_IsNull(total_event_touchpoints)) {
        total_event_touchpoints = NULL;
    }
    if (total_event_touchpoints) { 
    if(!cJSON_IsNumber(total_event_touchpoints))
    {
    goto end; //Numeric
    }
    }

    // conversion_msot_events->total_events
    cJSON *total_events = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "total_events");
    if (cJSON_IsNull(total_events)) {
        total_events = NULL;
    }
    if (total_events) { 
    if(!cJSON_IsNumber(total_events))
    {
    goto end; //Numeric
    }
    }

    // conversion_msot_events->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(conversion_msot_eventsJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    }


    conversion_msot_events_local_var = conversion_msot_events_create_internal (
        action_timestamps ? action_timestampsList : NULL,
        strdup(ad_group_id->valuestring),
        attribution_model ? attribution_modelVariable : pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_NULL,
        attribution_scopeVariable,
        attribution_score ? attribution_score->valuedouble : 0,
        campaign_id && !cJSON_IsNull(campaign_id) ? strdup(campaign_id->valuestring) : NULL,
        currency ? currency_local_nonprim : NULL,
        strdup(event_id->valuestring),
        event_nameVariable,
        event_timestamp->valuedouble,
        total_event_touchpoints ? total_event_touchpoints->valuedouble : 0,
        total_events ? total_events->valuedouble : 0,
        value ? value->valuedouble : 0
        );

    return conversion_msot_events_local_var;
end:
    if (action_timestampsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, action_timestampsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(action_timestampsList);
        action_timestampsList = NULL;
    }
    if (currency_local_nonprim) {
        currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
