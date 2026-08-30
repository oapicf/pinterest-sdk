#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_msot_events_create.h"



static conversion_msot_events_create_t *conversion_msot_events_create_create_internal(
    list_t *action_timestamps,
    char *ad_group_id,
    attribution_model_t *attribution_model,
    attribution_scope_t *attribution_scope,
    double *attribution_score,
    char *campaign_id,
    char *click_window,
    currency_t *currency,
    char *event_id,
    msot_event_name_t *event_name,
    long *event_timestamp,
    int *total_event_touchpoints,
    int *total_events,
    double *total_events_fractional,
    double *value,
    char *view_window
    ) {
    conversion_msot_events_create_t *conversion_msot_events_create_local_var = malloc(sizeof(conversion_msot_events_create_t));
    if (!conversion_msot_events_create_local_var) {
        return NULL;
    }
    memset(conversion_msot_events_create_local_var, 0, sizeof(conversion_msot_events_create_t));
    conversion_msot_events_create_local_var->_library_owned = 1;
    conversion_msot_events_create_local_var->action_timestamps = action_timestamps;
    conversion_msot_events_create_local_var->ad_group_id = ad_group_id;
    conversion_msot_events_create_local_var->attribution_model = attribution_model;
    conversion_msot_events_create_local_var->attribution_scope = attribution_scope;
    conversion_msot_events_create_local_var->attribution_score = attribution_score;
    conversion_msot_events_create_local_var->campaign_id = campaign_id;
    conversion_msot_events_create_local_var->click_window = click_window;
    conversion_msot_events_create_local_var->currency = currency;
    conversion_msot_events_create_local_var->event_id = event_id;
    conversion_msot_events_create_local_var->event_name = event_name;
    conversion_msot_events_create_local_var->event_timestamp = event_timestamp;
    conversion_msot_events_create_local_var->total_event_touchpoints = total_event_touchpoints;
    conversion_msot_events_create_local_var->total_events = total_events;
    conversion_msot_events_create_local_var->total_events_fractional = total_events_fractional;
    conversion_msot_events_create_local_var->value = value;
    conversion_msot_events_create_local_var->view_window = view_window;
    return conversion_msot_events_create_local_var;
}

__attribute__((deprecated)) conversion_msot_events_create_t *conversion_msot_events_create_create(
    list_t *action_timestamps,
    char *ad_group_id,
    attribution_model_t *attribution_model,
    attribution_scope_t *attribution_scope,
    double *attribution_score,
    char *campaign_id,
    char *click_window,
    currency_t *currency,
    char *event_id,
    msot_event_name_t *event_name,
    long *event_timestamp,
    int *total_event_touchpoints,
    int *total_events,
    double *total_events_fractional,
    double *value,
    char *view_window
    ) {
    double *attribution_score_copy = NULL;
    if (attribution_score) {
        attribution_score_copy = malloc(sizeof(double));
        if (attribution_score_copy) *attribution_score_copy = *attribution_score;
    }
    long *event_timestamp_copy = NULL;
    if (event_timestamp) {
        event_timestamp_copy = malloc(sizeof(long));
        if (event_timestamp_copy) *event_timestamp_copy = *event_timestamp;
    }
    int *total_event_touchpoints_copy = NULL;
    if (total_event_touchpoints) {
        total_event_touchpoints_copy = malloc(sizeof(int));
        if (total_event_touchpoints_copy) *total_event_touchpoints_copy = *total_event_touchpoints;
    }
    int *total_events_copy = NULL;
    if (total_events) {
        total_events_copy = malloc(sizeof(int));
        if (total_events_copy) *total_events_copy = *total_events;
    }
    double *total_events_fractional_copy = NULL;
    if (total_events_fractional) {
        total_events_fractional_copy = malloc(sizeof(double));
        if (total_events_fractional_copy) *total_events_fractional_copy = *total_events_fractional;
    }
    double *value_copy = NULL;
    if (value) {
        value_copy = malloc(sizeof(double));
        if (value_copy) *value_copy = *value;
    }
    conversion_msot_events_create_t *result = conversion_msot_events_create_create_internal (
        action_timestamps,
        ad_group_id,
        attribution_model,
        attribution_scope,
        attribution_score_copy,
        campaign_id,
        click_window,
        currency,
        event_id,
        event_name,
        event_timestamp_copy,
        total_event_touchpoints_copy,
        total_events_copy,
        total_events_fractional_copy,
        value_copy,
        view_window
        );
    if (!result) {
        free(attribution_score_copy);
        free(event_timestamp_copy);
        free(total_event_touchpoints_copy);
        free(total_events_copy);
        free(total_events_fractional_copy);
        free(value_copy);
    }
    return result;
}

void conversion_msot_events_create_free(conversion_msot_events_create_t *conversion_msot_events_create) {
    if(NULL == conversion_msot_events_create){
        return ;
    }
    if(conversion_msot_events_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_msot_events_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_msot_events_create->action_timestamps) {
        list_ForEach(listEntry, conversion_msot_events_create->action_timestamps) {
            free(listEntry->data);
        }
        list_freeList(conversion_msot_events_create->action_timestamps);
        conversion_msot_events_create->action_timestamps = NULL;
    }
    if (conversion_msot_events_create->ad_group_id) {
        free(conversion_msot_events_create->ad_group_id);
        conversion_msot_events_create->ad_group_id = NULL;
    }
    if (conversion_msot_events_create->attribution_model) {
        attribution_model_free(conversion_msot_events_create->attribution_model);
        conversion_msot_events_create->attribution_model = NULL;
    }
    if (conversion_msot_events_create->attribution_scope) {
        attribution_scope_free(conversion_msot_events_create->attribution_scope);
        conversion_msot_events_create->attribution_scope = NULL;
    }
    if (conversion_msot_events_create->attribution_score) {
        free(conversion_msot_events_create->attribution_score);
        conversion_msot_events_create->attribution_score = NULL;
    }
    if (conversion_msot_events_create->campaign_id) {
        free(conversion_msot_events_create->campaign_id);
        conversion_msot_events_create->campaign_id = NULL;
    }
    if (conversion_msot_events_create->click_window) {
        free(conversion_msot_events_create->click_window);
        conversion_msot_events_create->click_window = NULL;
    }
    if (conversion_msot_events_create->currency) {
        currency_free(conversion_msot_events_create->currency);
        conversion_msot_events_create->currency = NULL;
    }
    if (conversion_msot_events_create->event_id) {
        free(conversion_msot_events_create->event_id);
        conversion_msot_events_create->event_id = NULL;
    }
    if (conversion_msot_events_create->event_name) {
        msot_event_name_free(conversion_msot_events_create->event_name);
        conversion_msot_events_create->event_name = NULL;
    }
    if (conversion_msot_events_create->event_timestamp) {
        free(conversion_msot_events_create->event_timestamp);
        conversion_msot_events_create->event_timestamp = NULL;
    }
    if (conversion_msot_events_create->total_event_touchpoints) {
        free(conversion_msot_events_create->total_event_touchpoints);
        conversion_msot_events_create->total_event_touchpoints = NULL;
    }
    if (conversion_msot_events_create->total_events) {
        free(conversion_msot_events_create->total_events);
        conversion_msot_events_create->total_events = NULL;
    }
    if (conversion_msot_events_create->total_events_fractional) {
        free(conversion_msot_events_create->total_events_fractional);
        conversion_msot_events_create->total_events_fractional = NULL;
    }
    if (conversion_msot_events_create->value) {
        free(conversion_msot_events_create->value);
        conversion_msot_events_create->value = NULL;
    }
    if (conversion_msot_events_create->view_window) {
        free(conversion_msot_events_create->view_window);
        conversion_msot_events_create->view_window = NULL;
    }
    free(conversion_msot_events_create);
}

cJSON *conversion_msot_events_create_convertToJSON(conversion_msot_events_create_t *conversion_msot_events_create) {
    cJSON *item = cJSON_CreateObject();

    // conversion_msot_events_create->action_timestamps
    if(conversion_msot_events_create->action_timestamps) {
    cJSON *action_timestamps = cJSON_AddArrayToObject(item, "action_timestamps");
    if(action_timestamps == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *action_timestampsListEntry;
    list_ForEach(action_timestampsListEntry, conversion_msot_events_create->action_timestamps) {
    if(cJSON_AddNumberToObject(action_timestamps, "", *(double *)action_timestampsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_msot_events_create->ad_group_id
    if (!conversion_msot_events_create->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", conversion_msot_events_create->ad_group_id) == NULL) {
    goto fail; //String
    }


    // conversion_msot_events_create->attribution_model
    if(conversion_msot_events_create->attribution_model) {
    cJSON *attribution_model_local_JSON = attribution_model_convertToJSON(conversion_msot_events_create->attribution_model);
    if(attribution_model_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "attribution_model", attribution_model_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_msot_events_create->attribution_scope
    if(conversion_msot_events_create->attribution_scope) {
    cJSON *attribution_scope_local_JSON = attribution_scope_convertToJSON(conversion_msot_events_create->attribution_scope);
    if(attribution_scope_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "attribution_scope", attribution_scope_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_msot_events_create->attribution_score
    if(conversion_msot_events_create->attribution_score) {
    if(cJSON_AddNumberToObject(item, "attribution_score", *conversion_msot_events_create->attribution_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events_create->campaign_id
    if(conversion_msot_events_create->campaign_id) {
    if(cJSON_AddStringToObject(item, "campaign_id", conversion_msot_events_create->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_msot_events_create->click_window
    if(conversion_msot_events_create->click_window) {
    if(cJSON_AddStringToObject(item, "click_window", conversion_msot_events_create->click_window) == NULL) {
    goto fail; //String
    }
    }


    // conversion_msot_events_create->currency
    if(conversion_msot_events_create->currency) {
    cJSON *currency_local_JSON = currency_convertToJSON(conversion_msot_events_create->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_msot_events_create->event_id
    if (!conversion_msot_events_create->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", conversion_msot_events_create->event_id) == NULL) {
    goto fail; //String
    }


    // conversion_msot_events_create->event_name
    if (!conversion_msot_events_create->event_name) {
        goto fail;
    }
    cJSON *event_name_local_JSON = msot_event_name_convertToJSON(conversion_msot_events_create->event_name);
    if(event_name_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "event_name", event_name_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // conversion_msot_events_create->event_timestamp
    if (!conversion_msot_events_create->event_timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "event_timestamp", *conversion_msot_events_create->event_timestamp) == NULL) {
    goto fail; //Numeric
    }


    // conversion_msot_events_create->total_event_touchpoints
    if(conversion_msot_events_create->total_event_touchpoints) {
    if(cJSON_AddNumberToObject(item, "total_event_touchpoints", *conversion_msot_events_create->total_event_touchpoints) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events_create->total_events
    if(conversion_msot_events_create->total_events) {
    if(cJSON_AddNumberToObject(item, "total_events", *conversion_msot_events_create->total_events) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events_create->total_events_fractional
    if(conversion_msot_events_create->total_events_fractional) {
    if(cJSON_AddNumberToObject(item, "total_events_fractional", *conversion_msot_events_create->total_events_fractional) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events_create->value
    if(conversion_msot_events_create->value) {
    if(cJSON_AddNumberToObject(item, "value", *conversion_msot_events_create->value) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_msot_events_create->view_window
    if(conversion_msot_events_create->view_window) {
    if(cJSON_AddStringToObject(item, "view_window", conversion_msot_events_create->view_window) == NULL) {
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

conversion_msot_events_create_t *conversion_msot_events_create_parseFromJSON(cJSON *conversion_msot_events_createJSON){

    conversion_msot_events_create_t *conversion_msot_events_create_local_var = NULL;

    // define the local list for conversion_msot_events_create->action_timestamps
    list_t *action_timestampsList = NULL;

    char *ad_group_id_local_str = NULL;

    // define the local variable for conversion_msot_events_create->attribution_model
    attribution_model_t *attribution_model_local_nonprim = NULL;

    // define the local variable for conversion_msot_events_create->attribution_scope
    attribution_scope_t *attribution_scope_local_nonprim = NULL;

    // define the local variable for conversion_msot_events_create->attribution_score
    double *attribution_score_local_var = NULL;

    char *campaign_id_local_str = NULL;

    char *click_window_local_str = NULL;

    // define the local variable for conversion_msot_events_create->currency
    currency_t *currency_local_nonprim = NULL;

    char *event_id_local_str = NULL;

    // define the local variable for conversion_msot_events_create->event_name
    msot_event_name_t *event_name_local_nonprim = NULL;

    // define the local variable for conversion_msot_events_create->event_timestamp
    long *event_timestamp_local_var = NULL;

    // define the local variable for conversion_msot_events_create->total_event_touchpoints
    int *total_event_touchpoints_local_var = NULL;

    // define the local variable for conversion_msot_events_create->total_events
    int *total_events_local_var = NULL;

    // define the local variable for conversion_msot_events_create->total_events_fractional
    double *total_events_fractional_local_var = NULL;

    // define the local variable for conversion_msot_events_create->value
    double *value_local_var = NULL;

    char *view_window_local_str = NULL;

    // conversion_msot_events_create->action_timestamps
    cJSON *action_timestamps = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "action_timestamps");
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

    // conversion_msot_events_create->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "ad_group_id");
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

    // conversion_msot_events_create->attribution_model
    cJSON *attribution_model = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "attribution_model");
    if (cJSON_IsNull(attribution_model)) {
        attribution_model = NULL;
    }
    if (attribution_model) { 
    attribution_model_local_nonprim = attribution_model_parseFromJSON(attribution_model); //custom
    }

    // conversion_msot_events_create->attribution_scope
    cJSON *attribution_scope = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "attribution_scope");
    if (cJSON_IsNull(attribution_scope)) {
        attribution_scope = NULL;
    }
    if (attribution_scope) { 
    attribution_scope_local_nonprim = attribution_scope_parseFromJSON(attribution_scope); //custom
    }

    // conversion_msot_events_create->attribution_score
    cJSON *attribution_score = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "attribution_score");
    if (cJSON_IsNull(attribution_score)) {
        attribution_score = NULL;
    }
    if (attribution_score) { 
    if(!cJSON_IsNumber(attribution_score))
    {
    goto end; //Numeric
    }
    attribution_score_local_var = malloc(sizeof(double));
    if(!attribution_score_local_var)
    {
        goto end;
    }
    *attribution_score_local_var = attribution_score->valuedouble;
    }

    // conversion_msot_events_create->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // conversion_msot_events_create->click_window
    cJSON *click_window = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "click_window");
    if (cJSON_IsNull(click_window)) {
        click_window = NULL;
    }
    if (click_window) { 
    if(!cJSON_IsString(click_window) && !cJSON_IsNull(click_window))
    {
    goto end; //String
    }
    }

    // conversion_msot_events_create->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // conversion_msot_events_create->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "event_id");
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

    // conversion_msot_events_create->event_name
    cJSON *event_name = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "event_name");
    if (cJSON_IsNull(event_name)) {
        event_name = NULL;
    }
    if (!event_name) {
        goto end;
    }

    
    event_name_local_nonprim = msot_event_name_parseFromJSON(event_name); //custom

    // conversion_msot_events_create->event_timestamp
    cJSON *event_timestamp = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "event_timestamp");
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
    event_timestamp_local_var = malloc(sizeof(long));
    if(!event_timestamp_local_var)
    {
        goto end;
    }
    *event_timestamp_local_var = event_timestamp->valuedouble;

    // conversion_msot_events_create->total_event_touchpoints
    cJSON *total_event_touchpoints = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "total_event_touchpoints");
    if (cJSON_IsNull(total_event_touchpoints)) {
        total_event_touchpoints = NULL;
    }
    if (total_event_touchpoints) { 
    if(!cJSON_IsNumber(total_event_touchpoints))
    {
    goto end; //Numeric
    }
    total_event_touchpoints_local_var = malloc(sizeof(int));
    if(!total_event_touchpoints_local_var)
    {
        goto end;
    }
    *total_event_touchpoints_local_var = total_event_touchpoints->valuedouble;
    }

    // conversion_msot_events_create->total_events
    cJSON *total_events = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "total_events");
    if (cJSON_IsNull(total_events)) {
        total_events = NULL;
    }
    if (total_events) { 
    if(!cJSON_IsNumber(total_events))
    {
    goto end; //Numeric
    }
    total_events_local_var = malloc(sizeof(int));
    if(!total_events_local_var)
    {
        goto end;
    }
    *total_events_local_var = total_events->valuedouble;
    }

    // conversion_msot_events_create->total_events_fractional
    cJSON *total_events_fractional = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "total_events_fractional");
    if (cJSON_IsNull(total_events_fractional)) {
        total_events_fractional = NULL;
    }
    if (total_events_fractional) { 
    if(!cJSON_IsNumber(total_events_fractional))
    {
    goto end; //Numeric
    }
    total_events_fractional_local_var = malloc(sizeof(double));
    if(!total_events_fractional_local_var)
    {
        goto end;
    }
    *total_events_fractional_local_var = total_events_fractional->valuedouble;
    }

    // conversion_msot_events_create->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    value_local_var = malloc(sizeof(double));
    if(!value_local_var)
    {
        goto end;
    }
    *value_local_var = value->valuedouble;
    }

    // conversion_msot_events_create->view_window
    cJSON *view_window = cJSON_GetObjectItemCaseSensitive(conversion_msot_events_createJSON, "view_window");
    if (cJSON_IsNull(view_window)) {
        view_window = NULL;
    }
    if (view_window) { 
    if(!cJSON_IsString(view_window) && !cJSON_IsNull(view_window))
    {
    goto end; //String
    }
    }


    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (campaign_id && !cJSON_IsNull(campaign_id)) campaign_id_local_str = strdup(campaign_id->valuestring);
    if (click_window && !cJSON_IsNull(click_window)) click_window_local_str = strdup(click_window->valuestring);
    if (event_id && !cJSON_IsNull(event_id)) event_id_local_str = strdup(event_id->valuestring);
    if (view_window && !cJSON_IsNull(view_window)) view_window_local_str = strdup(view_window->valuestring);

    conversion_msot_events_create_local_var = conversion_msot_events_create_create_internal (
        action_timestamps ? action_timestampsList : NULL,
        ad_group_id_local_str,
        attribution_model ? attribution_model_local_nonprim : NULL,
        attribution_scope ? attribution_scope_local_nonprim : NULL,
        attribution_score_local_var,
        campaign_id_local_str,
        click_window_local_str,
        currency ? currency_local_nonprim : NULL,
        event_id_local_str,
        event_name_local_nonprim,
        event_timestamp_local_var,
        total_event_touchpoints_local_var,
        total_events_local_var,
        total_events_fractional_local_var,
        value_local_var,
        view_window_local_str
        );

    if (!conversion_msot_events_create_local_var) {
        goto end;
    }

    return conversion_msot_events_create_local_var;
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
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (attribution_model_local_nonprim) {
        attribution_model_free(attribution_model_local_nonprim);
        attribution_model_local_nonprim = NULL;
    }
    if (attribution_scope_local_nonprim) {
        attribution_scope_free(attribution_scope_local_nonprim);
        attribution_scope_local_nonprim = NULL;
    }
    if (attribution_score_local_var) {
        free(attribution_score_local_var);
        attribution_score_local_var = NULL;
    }
    if (campaign_id_local_str) {
        free(campaign_id_local_str);
        campaign_id_local_str = NULL;
    }
    if (click_window_local_str) {
        free(click_window_local_str);
        click_window_local_str = NULL;
    }
    if (currency_local_nonprim) {
        currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    if (event_id_local_str) {
        free(event_id_local_str);
        event_id_local_str = NULL;
    }
    if (event_name_local_nonprim) {
        msot_event_name_free(event_name_local_nonprim);
        event_name_local_nonprim = NULL;
    }
    if (event_timestamp_local_var) {
        free(event_timestamp_local_var);
        event_timestamp_local_var = NULL;
    }
    if (total_event_touchpoints_local_var) {
        free(total_event_touchpoints_local_var);
        total_event_touchpoints_local_var = NULL;
    }
    if (total_events_local_var) {
        free(total_events_local_var);
        total_events_local_var = NULL;
    }
    if (total_events_fractional_local_var) {
        free(total_events_fractional_local_var);
        total_events_fractional_local_var = NULL;
    }
    if (value_local_var) {
        free(value_local_var);
        value_local_var = NULL;
    }
    if (view_window_local_str) {
        free(view_window_local_str);
        view_window_local_str = NULL;
    }
    return NULL;

}
