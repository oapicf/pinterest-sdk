#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_data_items.h"



static conversion_events_data_items_t *conversion_events_data_items_create_internal(
    char *action_source,
    char *app_id,
    conversion_event_app_info_t *app_info,
    char *app_name,
    char *app_version,
    conversion_events_data_items_custom_data_t *custom_data,
    char *device_brand,
    char *device_carrier,
    conversion_event_device_info_t *device_info,
    char *device_model,
    char *device_type,
    char *event_id,
    char *event_name,
    char *event_source_url,
    long *event_time,
    char *language,
    int *opt_out,
    char *os_version,
    char *partner_name,
    conversion_events_user_data_properties_t *user_data,
    int *wifi
    ) {
    conversion_events_data_items_t *conversion_events_data_items_local_var = malloc(sizeof(conversion_events_data_items_t));
    if (!conversion_events_data_items_local_var) {
        return NULL;
    }
    memset(conversion_events_data_items_local_var, 0, sizeof(conversion_events_data_items_t));
    conversion_events_data_items_local_var->_library_owned = 1;
    conversion_events_data_items_local_var->action_source = action_source;
    conversion_events_data_items_local_var->app_id = app_id;
    conversion_events_data_items_local_var->app_info = app_info;
    conversion_events_data_items_local_var->app_name = app_name;
    conversion_events_data_items_local_var->app_version = app_version;
    conversion_events_data_items_local_var->custom_data = custom_data;
    conversion_events_data_items_local_var->device_brand = device_brand;
    conversion_events_data_items_local_var->device_carrier = device_carrier;
    conversion_events_data_items_local_var->device_info = device_info;
    conversion_events_data_items_local_var->device_model = device_model;
    conversion_events_data_items_local_var->device_type = device_type;
    conversion_events_data_items_local_var->event_id = event_id;
    conversion_events_data_items_local_var->event_name = event_name;
    conversion_events_data_items_local_var->event_source_url = event_source_url;
    conversion_events_data_items_local_var->event_time = event_time;
    conversion_events_data_items_local_var->language = language;
    conversion_events_data_items_local_var->opt_out = opt_out;
    conversion_events_data_items_local_var->os_version = os_version;
    conversion_events_data_items_local_var->partner_name = partner_name;
    conversion_events_data_items_local_var->user_data = user_data;
    conversion_events_data_items_local_var->wifi = wifi;
    return conversion_events_data_items_local_var;
}

__attribute__((deprecated)) conversion_events_data_items_t *conversion_events_data_items_create(
    char *action_source,
    char *app_id,
    conversion_event_app_info_t *app_info,
    char *app_name,
    char *app_version,
    conversion_events_data_items_custom_data_t *custom_data,
    char *device_brand,
    char *device_carrier,
    conversion_event_device_info_t *device_info,
    char *device_model,
    char *device_type,
    char *event_id,
    char *event_name,
    char *event_source_url,
    long *event_time,
    char *language,
    int *opt_out,
    char *os_version,
    char *partner_name,
    conversion_events_user_data_properties_t *user_data,
    int *wifi
    ) {
    long *event_time_copy = NULL;
    if (event_time) {
        event_time_copy = malloc(sizeof(long));
        if (event_time_copy) *event_time_copy = *event_time;
    }
    int *opt_out_copy = NULL;
    if (opt_out) {
        opt_out_copy = malloc(sizeof(int));
        if (opt_out_copy) *opt_out_copy = *opt_out;
    }
    int *wifi_copy = NULL;
    if (wifi) {
        wifi_copy = malloc(sizeof(int));
        if (wifi_copy) *wifi_copy = *wifi;
    }
    conversion_events_data_items_t *result = conversion_events_data_items_create_internal (
        action_source,
        app_id,
        app_info,
        app_name,
        app_version,
        custom_data,
        device_brand,
        device_carrier,
        device_info,
        device_model,
        device_type,
        event_id,
        event_name,
        event_source_url,
        event_time_copy,
        language,
        opt_out_copy,
        os_version,
        partner_name,
        user_data,
        wifi_copy
        );
    if (!result) {
        free(event_time_copy);
        free(opt_out_copy);
        free(wifi_copy);
    }
    return result;
}

void conversion_events_data_items_free(conversion_events_data_items_t *conversion_events_data_items) {
    if(NULL == conversion_events_data_items){
        return ;
    }
    if(conversion_events_data_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_data_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_data_items->action_source) {
        free(conversion_events_data_items->action_source);
        conversion_events_data_items->action_source = NULL;
    }
    if (conversion_events_data_items->app_id) {
        free(conversion_events_data_items->app_id);
        conversion_events_data_items->app_id = NULL;
    }
    if (conversion_events_data_items->app_info) {
        conversion_event_app_info_free(conversion_events_data_items->app_info);
        conversion_events_data_items->app_info = NULL;
    }
    if (conversion_events_data_items->app_name) {
        free(conversion_events_data_items->app_name);
        conversion_events_data_items->app_name = NULL;
    }
    if (conversion_events_data_items->app_version) {
        free(conversion_events_data_items->app_version);
        conversion_events_data_items->app_version = NULL;
    }
    if (conversion_events_data_items->custom_data) {
        conversion_events_data_items_custom_data_free(conversion_events_data_items->custom_data);
        conversion_events_data_items->custom_data = NULL;
    }
    if (conversion_events_data_items->device_brand) {
        free(conversion_events_data_items->device_brand);
        conversion_events_data_items->device_brand = NULL;
    }
    if (conversion_events_data_items->device_carrier) {
        free(conversion_events_data_items->device_carrier);
        conversion_events_data_items->device_carrier = NULL;
    }
    if (conversion_events_data_items->device_info) {
        conversion_event_device_info_free(conversion_events_data_items->device_info);
        conversion_events_data_items->device_info = NULL;
    }
    if (conversion_events_data_items->device_model) {
        free(conversion_events_data_items->device_model);
        conversion_events_data_items->device_model = NULL;
    }
    if (conversion_events_data_items->device_type) {
        free(conversion_events_data_items->device_type);
        conversion_events_data_items->device_type = NULL;
    }
    if (conversion_events_data_items->event_id) {
        free(conversion_events_data_items->event_id);
        conversion_events_data_items->event_id = NULL;
    }
    if (conversion_events_data_items->event_name) {
        free(conversion_events_data_items->event_name);
        conversion_events_data_items->event_name = NULL;
    }
    if (conversion_events_data_items->event_source_url) {
        free(conversion_events_data_items->event_source_url);
        conversion_events_data_items->event_source_url = NULL;
    }
    if (conversion_events_data_items->event_time) {
        free(conversion_events_data_items->event_time);
        conversion_events_data_items->event_time = NULL;
    }
    if (conversion_events_data_items->language) {
        free(conversion_events_data_items->language);
        conversion_events_data_items->language = NULL;
    }
    if (conversion_events_data_items->opt_out) {
        free(conversion_events_data_items->opt_out);
        conversion_events_data_items->opt_out = NULL;
    }
    if (conversion_events_data_items->os_version) {
        free(conversion_events_data_items->os_version);
        conversion_events_data_items->os_version = NULL;
    }
    if (conversion_events_data_items->partner_name) {
        free(conversion_events_data_items->partner_name);
        conversion_events_data_items->partner_name = NULL;
    }
    if (conversion_events_data_items->user_data) {
        conversion_events_user_data_properties_free(conversion_events_data_items->user_data);
        conversion_events_data_items->user_data = NULL;
    }
    if (conversion_events_data_items->wifi) {
        free(conversion_events_data_items->wifi);
        conversion_events_data_items->wifi = NULL;
    }
    free(conversion_events_data_items);
}

cJSON *conversion_events_data_items_convertToJSON(conversion_events_data_items_t *conversion_events_data_items) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_data_items->action_source
    if (!conversion_events_data_items->action_source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "action_source", conversion_events_data_items->action_source) == NULL) {
    goto fail; //String
    }


    // conversion_events_data_items->app_id
    if(conversion_events_data_items->app_id) {
    if(cJSON_AddStringToObject(item, "app_id", conversion_events_data_items->app_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->app_info
    if(conversion_events_data_items->app_info) {
    cJSON *app_info_local_JSON = conversion_event_app_info_convertToJSON(conversion_events_data_items->app_info);
    if(app_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "app_info", app_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_events_data_items->app_name
    if(conversion_events_data_items->app_name) {
    if(cJSON_AddStringToObject(item, "app_name", conversion_events_data_items->app_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->app_version
    if(conversion_events_data_items->app_version) {
    if(cJSON_AddStringToObject(item, "app_version", conversion_events_data_items->app_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->custom_data
    if(conversion_events_data_items->custom_data) {
    cJSON *custom_data_local_JSON = conversion_events_data_items_custom_data_convertToJSON(conversion_events_data_items->custom_data);
    if(custom_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "custom_data", custom_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_events_data_items->device_brand
    if(conversion_events_data_items->device_brand) {
    if(cJSON_AddStringToObject(item, "device_brand", conversion_events_data_items->device_brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->device_carrier
    if(conversion_events_data_items->device_carrier) {
    if(cJSON_AddStringToObject(item, "device_carrier", conversion_events_data_items->device_carrier) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->device_info
    if(conversion_events_data_items->device_info) {
    cJSON *device_info_local_JSON = conversion_event_device_info_convertToJSON(conversion_events_data_items->device_info);
    if(device_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "device_info", device_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_events_data_items->device_model
    if(conversion_events_data_items->device_model) {
    if(cJSON_AddStringToObject(item, "device_model", conversion_events_data_items->device_model) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->device_type
    if(conversion_events_data_items->device_type) {
    if(cJSON_AddStringToObject(item, "device_type", conversion_events_data_items->device_type) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->event_id
    if (!conversion_events_data_items->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", conversion_events_data_items->event_id) == NULL) {
    goto fail; //String
    }


    // conversion_events_data_items->event_name
    if (!conversion_events_data_items->event_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_name", conversion_events_data_items->event_name) == NULL) {
    goto fail; //String
    }


    // conversion_events_data_items->event_source_url
    if(conversion_events_data_items->event_source_url) {
    if(cJSON_AddStringToObject(item, "event_source_url", conversion_events_data_items->event_source_url) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->event_time
    if (!conversion_events_data_items->event_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "event_time", *conversion_events_data_items->event_time) == NULL) {
    goto fail; //Numeric
    }


    // conversion_events_data_items->language
    if(conversion_events_data_items->language) {
    if(cJSON_AddStringToObject(item, "language", conversion_events_data_items->language) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->opt_out
    if(conversion_events_data_items->opt_out) {
    if(cJSON_AddBoolToObject(item, "opt_out", *conversion_events_data_items->opt_out) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_events_data_items->os_version
    if(conversion_events_data_items->os_version) {
    if(cJSON_AddStringToObject(item, "os_version", conversion_events_data_items->os_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->partner_name
    if(conversion_events_data_items->partner_name) {
    if(cJSON_AddStringToObject(item, "partner_name", conversion_events_data_items->partner_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_items->user_data
    if (!conversion_events_data_items->user_data) {
        goto fail;
    }
    cJSON *user_data_local_JSON = conversion_events_user_data_properties_convertToJSON(conversion_events_data_items->user_data);
    if(user_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user_data", user_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // conversion_events_data_items->wifi
    if(conversion_events_data_items->wifi) {
    if(cJSON_AddBoolToObject(item, "wifi", *conversion_events_data_items->wifi) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_events_data_items_t *conversion_events_data_items_parseFromJSON(cJSON *conversion_events_data_itemsJSON){

    conversion_events_data_items_t *conversion_events_data_items_local_var = NULL;

    char *action_source_local_str = NULL;

    char *app_id_local_str = NULL;

    // define the local variable for conversion_events_data_items->app_info
    conversion_event_app_info_t *app_info_local_nonprim = NULL;

    char *app_name_local_str = NULL;

    char *app_version_local_str = NULL;

    // define the local variable for conversion_events_data_items->custom_data
    conversion_events_data_items_custom_data_t *custom_data_local_nonprim = NULL;

    char *device_brand_local_str = NULL;

    char *device_carrier_local_str = NULL;

    // define the local variable for conversion_events_data_items->device_info
    conversion_event_device_info_t *device_info_local_nonprim = NULL;

    char *device_model_local_str = NULL;

    char *device_type_local_str = NULL;

    char *event_id_local_str = NULL;

    char *event_name_local_str = NULL;

    char *event_source_url_local_str = NULL;

    // define the local variable for conversion_events_data_items->event_time
    long *event_time_local_var = NULL;

    char *language_local_str = NULL;

    // define the local variable for conversion_events_data_items->opt_out
    int *opt_out_local_var = NULL;

    char *os_version_local_str = NULL;

    char *partner_name_local_str = NULL;

    // define the local variable for conversion_events_data_items->user_data
    conversion_events_user_data_properties_t *user_data_local_nonprim = NULL;

    // define the local variable for conversion_events_data_items->wifi
    int *wifi_local_var = NULL;

    // conversion_events_data_items->action_source
    cJSON *action_source = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "action_source");
    if (cJSON_IsNull(action_source)) {
        action_source = NULL;
    }
    if (!action_source) {
        goto end;
    }

    
    if(!cJSON_IsString(action_source))
    {
    goto end; //String
    }

    // conversion_events_data_items->app_id
    cJSON *app_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "app_id");
    if (cJSON_IsNull(app_id)) {
        app_id = NULL;
    }
    if (app_id) { 
    if(!cJSON_IsString(app_id) && !cJSON_IsNull(app_id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->app_info
    cJSON *app_info = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "app_info");
    if (cJSON_IsNull(app_info)) {
        app_info = NULL;
    }
    if (app_info) { 
    app_info_local_nonprim = conversion_event_app_info_parseFromJSON(app_info); //nonprimitive
    }

    // conversion_events_data_items->app_name
    cJSON *app_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "app_name");
    if (cJSON_IsNull(app_name)) {
        app_name = NULL;
    }
    if (app_name) { 
    if(!cJSON_IsString(app_name) && !cJSON_IsNull(app_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->app_version
    cJSON *app_version = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "app_version");
    if (cJSON_IsNull(app_version)) {
        app_version = NULL;
    }
    if (app_version) { 
    if(!cJSON_IsString(app_version) && !cJSON_IsNull(app_version))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->custom_data
    cJSON *custom_data = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "custom_data");
    if (cJSON_IsNull(custom_data)) {
        custom_data = NULL;
    }
    if (custom_data) { 
    custom_data_local_nonprim = conversion_events_data_items_custom_data_parseFromJSON(custom_data); //nonprimitive
    }

    // conversion_events_data_items->device_brand
    cJSON *device_brand = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "device_brand");
    if (cJSON_IsNull(device_brand)) {
        device_brand = NULL;
    }
    if (device_brand) { 
    if(!cJSON_IsString(device_brand) && !cJSON_IsNull(device_brand))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->device_carrier
    cJSON *device_carrier = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "device_carrier");
    if (cJSON_IsNull(device_carrier)) {
        device_carrier = NULL;
    }
    if (device_carrier) { 
    if(!cJSON_IsString(device_carrier) && !cJSON_IsNull(device_carrier))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->device_info
    cJSON *device_info = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "device_info");
    if (cJSON_IsNull(device_info)) {
        device_info = NULL;
    }
    if (device_info) { 
    device_info_local_nonprim = conversion_event_device_info_parseFromJSON(device_info); //nonprimitive
    }

    // conversion_events_data_items->device_model
    cJSON *device_model = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "device_model");
    if (cJSON_IsNull(device_model)) {
        device_model = NULL;
    }
    if (device_model) { 
    if(!cJSON_IsString(device_model) && !cJSON_IsNull(device_model))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->device_type
    cJSON *device_type = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "device_type");
    if (cJSON_IsNull(device_type)) {
        device_type = NULL;
    }
    if (device_type) { 
    if(!cJSON_IsString(device_type) && !cJSON_IsNull(device_type))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "event_id");
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

    // conversion_events_data_items->event_name
    cJSON *event_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "event_name");
    if (cJSON_IsNull(event_name)) {
        event_name = NULL;
    }
    if (!event_name) {
        goto end;
    }

    
    if(!cJSON_IsString(event_name))
    {
    goto end; //String
    }

    // conversion_events_data_items->event_source_url
    cJSON *event_source_url = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "event_source_url");
    if (cJSON_IsNull(event_source_url)) {
        event_source_url = NULL;
    }
    if (event_source_url) { 
    if(!cJSON_IsString(event_source_url) && !cJSON_IsNull(event_source_url))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->event_time
    cJSON *event_time = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "event_time");
    if (cJSON_IsNull(event_time)) {
        event_time = NULL;
    }
    if (!event_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(event_time))
    {
    goto end; //Numeric
    }
    event_time_local_var = malloc(sizeof(long));
    if(!event_time_local_var)
    {
        goto end;
    }
    *event_time_local_var = event_time->valuedouble;

    // conversion_events_data_items->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (language) { 
    if(!cJSON_IsString(language) && !cJSON_IsNull(language))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->opt_out
    cJSON *opt_out = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "opt_out");
    if (cJSON_IsNull(opt_out)) {
        opt_out = NULL;
    }
    if (opt_out) { 
    if(!cJSON_IsBool(opt_out))
    {
    goto end; //Bool
    }
    opt_out_local_var = malloc(sizeof(int));
    if(!opt_out_local_var)
    {
        goto end;
    }
    *opt_out_local_var = opt_out->valueint;
    }

    // conversion_events_data_items->os_version
    cJSON *os_version = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "os_version");
    if (cJSON_IsNull(os_version)) {
        os_version = NULL;
    }
    if (os_version) { 
    if(!cJSON_IsString(os_version) && !cJSON_IsNull(os_version))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->partner_name
    cJSON *partner_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "partner_name");
    if (cJSON_IsNull(partner_name)) {
        partner_name = NULL;
    }
    if (partner_name) { 
    if(!cJSON_IsString(partner_name) && !cJSON_IsNull(partner_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_items->user_data
    cJSON *user_data = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "user_data");
    if (cJSON_IsNull(user_data)) {
        user_data = NULL;
    }
    if (!user_data) {
        goto end;
    }

    
    user_data_local_nonprim = conversion_events_user_data_properties_parseFromJSON(user_data); //nonprimitive

    // conversion_events_data_items->wifi
    cJSON *wifi = cJSON_GetObjectItemCaseSensitive(conversion_events_data_itemsJSON, "wifi");
    if (cJSON_IsNull(wifi)) {
        wifi = NULL;
    }
    if (wifi) { 
    if(!cJSON_IsBool(wifi))
    {
    goto end; //Bool
    }
    wifi_local_var = malloc(sizeof(int));
    if(!wifi_local_var)
    {
        goto end;
    }
    *wifi_local_var = wifi->valueint;
    }


    if (action_source && !cJSON_IsNull(action_source)) action_source_local_str = strdup(action_source->valuestring);
    if (app_id && !cJSON_IsNull(app_id)) app_id_local_str = strdup(app_id->valuestring);
    if (app_name && !cJSON_IsNull(app_name)) app_name_local_str = strdup(app_name->valuestring);
    if (app_version && !cJSON_IsNull(app_version)) app_version_local_str = strdup(app_version->valuestring);
    if (device_brand && !cJSON_IsNull(device_brand)) device_brand_local_str = strdup(device_brand->valuestring);
    if (device_carrier && !cJSON_IsNull(device_carrier)) device_carrier_local_str = strdup(device_carrier->valuestring);
    if (device_model && !cJSON_IsNull(device_model)) device_model_local_str = strdup(device_model->valuestring);
    if (device_type && !cJSON_IsNull(device_type)) device_type_local_str = strdup(device_type->valuestring);
    if (event_id && !cJSON_IsNull(event_id)) event_id_local_str = strdup(event_id->valuestring);
    if (event_name && !cJSON_IsNull(event_name)) event_name_local_str = strdup(event_name->valuestring);
    if (event_source_url && !cJSON_IsNull(event_source_url)) event_source_url_local_str = strdup(event_source_url->valuestring);
    if (language && !cJSON_IsNull(language)) language_local_str = strdup(language->valuestring);
    if (os_version && !cJSON_IsNull(os_version)) os_version_local_str = strdup(os_version->valuestring);
    if (partner_name && !cJSON_IsNull(partner_name)) partner_name_local_str = strdup(partner_name->valuestring);

    conversion_events_data_items_local_var = conversion_events_data_items_create_internal (
        action_source_local_str,
        app_id_local_str,
        app_info ? app_info_local_nonprim : NULL,
        app_name_local_str,
        app_version_local_str,
        custom_data ? custom_data_local_nonprim : NULL,
        device_brand_local_str,
        device_carrier_local_str,
        device_info ? device_info_local_nonprim : NULL,
        device_model_local_str,
        device_type_local_str,
        event_id_local_str,
        event_name_local_str,
        event_source_url_local_str,
        event_time_local_var,
        language_local_str,
        opt_out_local_var,
        os_version_local_str,
        partner_name_local_str,
        user_data_local_nonprim,
        wifi_local_var
        );

    if (!conversion_events_data_items_local_var) {
        goto end;
    }

    return conversion_events_data_items_local_var;
end:
    if (action_source_local_str) {
        free(action_source_local_str);
        action_source_local_str = NULL;
    }
    if (app_id_local_str) {
        free(app_id_local_str);
        app_id_local_str = NULL;
    }
    if (app_info_local_nonprim) {
        conversion_event_app_info_free(app_info_local_nonprim);
        app_info_local_nonprim = NULL;
    }
    if (app_name_local_str) {
        free(app_name_local_str);
        app_name_local_str = NULL;
    }
    if (app_version_local_str) {
        free(app_version_local_str);
        app_version_local_str = NULL;
    }
    if (custom_data_local_nonprim) {
        conversion_events_data_items_custom_data_free(custom_data_local_nonprim);
        custom_data_local_nonprim = NULL;
    }
    if (device_brand_local_str) {
        free(device_brand_local_str);
        device_brand_local_str = NULL;
    }
    if (device_carrier_local_str) {
        free(device_carrier_local_str);
        device_carrier_local_str = NULL;
    }
    if (device_info_local_nonprim) {
        conversion_event_device_info_free(device_info_local_nonprim);
        device_info_local_nonprim = NULL;
    }
    if (device_model_local_str) {
        free(device_model_local_str);
        device_model_local_str = NULL;
    }
    if (device_type_local_str) {
        free(device_type_local_str);
        device_type_local_str = NULL;
    }
    if (event_id_local_str) {
        free(event_id_local_str);
        event_id_local_str = NULL;
    }
    if (event_name_local_str) {
        free(event_name_local_str);
        event_name_local_str = NULL;
    }
    if (event_source_url_local_str) {
        free(event_source_url_local_str);
        event_source_url_local_str = NULL;
    }
    if (event_time_local_var) {
        free(event_time_local_var);
        event_time_local_var = NULL;
    }
    if (language_local_str) {
        free(language_local_str);
        language_local_str = NULL;
    }
    if (opt_out_local_var) {
        free(opt_out_local_var);
        opt_out_local_var = NULL;
    }
    if (os_version_local_str) {
        free(os_version_local_str);
        os_version_local_str = NULL;
    }
    if (partner_name_local_str) {
        free(partner_name_local_str);
        partner_name_local_str = NULL;
    }
    if (user_data_local_nonprim) {
        conversion_events_user_data_properties_free(user_data_local_nonprim);
        user_data_local_nonprim = NULL;
    }
    if (wifi_local_var) {
        free(wifi_local_var);
        wifi_local_var = NULL;
    }
    return NULL;

}
