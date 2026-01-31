#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_data_inner.h"



static conversion_events_data_inner_t *conversion_events_data_inner_create_internal(
    char *action_source,
    char *app_id,
    conversion_event_app_info_t *app_info,
    char *app_name,
    char *app_version,
    conversion_events_data_inner_custom_data_t *custom_data,
    char *device_brand,
    char *device_carrier,
    conversion_event_device_info_t *device_info,
    char *device_model,
    char *device_type,
    char *event_id,
    char *event_name,
    char *event_source_url,
    long event_time,
    char *language,
    int opt_out,
    char *os_version,
    char *partner_name,
    conversion_events_user_data_t *user_data,
    int wifi
    ) {
    conversion_events_data_inner_t *conversion_events_data_inner_local_var = malloc(sizeof(conversion_events_data_inner_t));
    if (!conversion_events_data_inner_local_var) {
        return NULL;
    }
    conversion_events_data_inner_local_var->action_source = action_source;
    conversion_events_data_inner_local_var->app_id = app_id;
    conversion_events_data_inner_local_var->app_info = app_info;
    conversion_events_data_inner_local_var->app_name = app_name;
    conversion_events_data_inner_local_var->app_version = app_version;
    conversion_events_data_inner_local_var->custom_data = custom_data;
    conversion_events_data_inner_local_var->device_brand = device_brand;
    conversion_events_data_inner_local_var->device_carrier = device_carrier;
    conversion_events_data_inner_local_var->device_info = device_info;
    conversion_events_data_inner_local_var->device_model = device_model;
    conversion_events_data_inner_local_var->device_type = device_type;
    conversion_events_data_inner_local_var->event_id = event_id;
    conversion_events_data_inner_local_var->event_name = event_name;
    conversion_events_data_inner_local_var->event_source_url = event_source_url;
    conversion_events_data_inner_local_var->event_time = event_time;
    conversion_events_data_inner_local_var->language = language;
    conversion_events_data_inner_local_var->opt_out = opt_out;
    conversion_events_data_inner_local_var->os_version = os_version;
    conversion_events_data_inner_local_var->partner_name = partner_name;
    conversion_events_data_inner_local_var->user_data = user_data;
    conversion_events_data_inner_local_var->wifi = wifi;

    conversion_events_data_inner_local_var->_library_owned = 1;
    return conversion_events_data_inner_local_var;
}

__attribute__((deprecated)) conversion_events_data_inner_t *conversion_events_data_inner_create(
    char *action_source,
    char *app_id,
    conversion_event_app_info_t *app_info,
    char *app_name,
    char *app_version,
    conversion_events_data_inner_custom_data_t *custom_data,
    char *device_brand,
    char *device_carrier,
    conversion_event_device_info_t *device_info,
    char *device_model,
    char *device_type,
    char *event_id,
    char *event_name,
    char *event_source_url,
    long event_time,
    char *language,
    int opt_out,
    char *os_version,
    char *partner_name,
    conversion_events_user_data_t *user_data,
    int wifi
    ) {
    return conversion_events_data_inner_create_internal (
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
        event_time,
        language,
        opt_out,
        os_version,
        partner_name,
        user_data,
        wifi
        );
}

void conversion_events_data_inner_free(conversion_events_data_inner_t *conversion_events_data_inner) {
    if(NULL == conversion_events_data_inner){
        return ;
    }
    if(conversion_events_data_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_data_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_data_inner->action_source) {
        free(conversion_events_data_inner->action_source);
        conversion_events_data_inner->action_source = NULL;
    }
    if (conversion_events_data_inner->app_id) {
        free(conversion_events_data_inner->app_id);
        conversion_events_data_inner->app_id = NULL;
    }
    if (conversion_events_data_inner->app_info) {
        conversion_event_app_info_free(conversion_events_data_inner->app_info);
        conversion_events_data_inner->app_info = NULL;
    }
    if (conversion_events_data_inner->app_name) {
        free(conversion_events_data_inner->app_name);
        conversion_events_data_inner->app_name = NULL;
    }
    if (conversion_events_data_inner->app_version) {
        free(conversion_events_data_inner->app_version);
        conversion_events_data_inner->app_version = NULL;
    }
    if (conversion_events_data_inner->custom_data) {
        conversion_events_data_inner_custom_data_free(conversion_events_data_inner->custom_data);
        conversion_events_data_inner->custom_data = NULL;
    }
    if (conversion_events_data_inner->device_brand) {
        free(conversion_events_data_inner->device_brand);
        conversion_events_data_inner->device_brand = NULL;
    }
    if (conversion_events_data_inner->device_carrier) {
        free(conversion_events_data_inner->device_carrier);
        conversion_events_data_inner->device_carrier = NULL;
    }
    if (conversion_events_data_inner->device_info) {
        conversion_event_device_info_free(conversion_events_data_inner->device_info);
        conversion_events_data_inner->device_info = NULL;
    }
    if (conversion_events_data_inner->device_model) {
        free(conversion_events_data_inner->device_model);
        conversion_events_data_inner->device_model = NULL;
    }
    if (conversion_events_data_inner->device_type) {
        free(conversion_events_data_inner->device_type);
        conversion_events_data_inner->device_type = NULL;
    }
    if (conversion_events_data_inner->event_id) {
        free(conversion_events_data_inner->event_id);
        conversion_events_data_inner->event_id = NULL;
    }
    if (conversion_events_data_inner->event_name) {
        free(conversion_events_data_inner->event_name);
        conversion_events_data_inner->event_name = NULL;
    }
    if (conversion_events_data_inner->event_source_url) {
        free(conversion_events_data_inner->event_source_url);
        conversion_events_data_inner->event_source_url = NULL;
    }
    if (conversion_events_data_inner->language) {
        free(conversion_events_data_inner->language);
        conversion_events_data_inner->language = NULL;
    }
    if (conversion_events_data_inner->os_version) {
        free(conversion_events_data_inner->os_version);
        conversion_events_data_inner->os_version = NULL;
    }
    if (conversion_events_data_inner->partner_name) {
        free(conversion_events_data_inner->partner_name);
        conversion_events_data_inner->partner_name = NULL;
    }
    if (conversion_events_data_inner->user_data) {
        conversion_events_user_data_free(conversion_events_data_inner->user_data);
        conversion_events_data_inner->user_data = NULL;
    }
    free(conversion_events_data_inner);
}

cJSON *conversion_events_data_inner_convertToJSON(conversion_events_data_inner_t *conversion_events_data_inner) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_data_inner->action_source
    if (!conversion_events_data_inner->action_source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "action_source", conversion_events_data_inner->action_source) == NULL) {
    goto fail; //String
    }


    // conversion_events_data_inner->app_id
    if(conversion_events_data_inner->app_id) {
    if(cJSON_AddStringToObject(item, "app_id", conversion_events_data_inner->app_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->app_info
    if(conversion_events_data_inner->app_info) {
    cJSON *app_info_local_JSON = conversion_event_app_info_convertToJSON(conversion_events_data_inner->app_info);
    if(app_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "app_info", app_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_events_data_inner->app_name
    if(conversion_events_data_inner->app_name) {
    if(cJSON_AddStringToObject(item, "app_name", conversion_events_data_inner->app_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->app_version
    if(conversion_events_data_inner->app_version) {
    if(cJSON_AddStringToObject(item, "app_version", conversion_events_data_inner->app_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->custom_data
    if(conversion_events_data_inner->custom_data) {
    cJSON *custom_data_local_JSON = conversion_events_data_inner_custom_data_convertToJSON(conversion_events_data_inner->custom_data);
    if(custom_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "custom_data", custom_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_events_data_inner->device_brand
    if(conversion_events_data_inner->device_brand) {
    if(cJSON_AddStringToObject(item, "device_brand", conversion_events_data_inner->device_brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->device_carrier
    if(conversion_events_data_inner->device_carrier) {
    if(cJSON_AddStringToObject(item, "device_carrier", conversion_events_data_inner->device_carrier) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->device_info
    if(conversion_events_data_inner->device_info) {
    cJSON *device_info_local_JSON = conversion_event_device_info_convertToJSON(conversion_events_data_inner->device_info);
    if(device_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "device_info", device_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // conversion_events_data_inner->device_model
    if(conversion_events_data_inner->device_model) {
    if(cJSON_AddStringToObject(item, "device_model", conversion_events_data_inner->device_model) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->device_type
    if(conversion_events_data_inner->device_type) {
    if(cJSON_AddStringToObject(item, "device_type", conversion_events_data_inner->device_type) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->event_id
    if (!conversion_events_data_inner->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", conversion_events_data_inner->event_id) == NULL) {
    goto fail; //String
    }


    // conversion_events_data_inner->event_name
    if (!conversion_events_data_inner->event_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_name", conversion_events_data_inner->event_name) == NULL) {
    goto fail; //String
    }


    // conversion_events_data_inner->event_source_url
    if(conversion_events_data_inner->event_source_url) {
    if(cJSON_AddStringToObject(item, "event_source_url", conversion_events_data_inner->event_source_url) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->event_time
    if (!conversion_events_data_inner->event_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "event_time", conversion_events_data_inner->event_time) == NULL) {
    goto fail; //Numeric
    }


    // conversion_events_data_inner->language
    if(conversion_events_data_inner->language) {
    if(cJSON_AddStringToObject(item, "language", conversion_events_data_inner->language) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->opt_out
    if(conversion_events_data_inner->opt_out) {
    if(cJSON_AddBoolToObject(item, "opt_out", conversion_events_data_inner->opt_out) == NULL) {
    goto fail; //Bool
    }
    }


    // conversion_events_data_inner->os_version
    if(conversion_events_data_inner->os_version) {
    if(cJSON_AddStringToObject(item, "os_version", conversion_events_data_inner->os_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->partner_name
    if(conversion_events_data_inner->partner_name) {
    if(cJSON_AddStringToObject(item, "partner_name", conversion_events_data_inner->partner_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_data_inner->user_data
    if (!conversion_events_data_inner->user_data) {
        goto fail;
    }
    cJSON *user_data_local_JSON = conversion_events_user_data_convertToJSON(conversion_events_data_inner->user_data);
    if(user_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user_data", user_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // conversion_events_data_inner->wifi
    if(conversion_events_data_inner->wifi) {
    if(cJSON_AddBoolToObject(item, "wifi", conversion_events_data_inner->wifi) == NULL) {
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

conversion_events_data_inner_t *conversion_events_data_inner_parseFromJSON(cJSON *conversion_events_data_innerJSON){

    conversion_events_data_inner_t *conversion_events_data_inner_local_var = NULL;

    // define the local variable for conversion_events_data_inner->app_info
    conversion_event_app_info_t *app_info_local_nonprim = NULL;

    // define the local variable for conversion_events_data_inner->custom_data
    conversion_events_data_inner_custom_data_t *custom_data_local_nonprim = NULL;

    // define the local variable for conversion_events_data_inner->device_info
    conversion_event_device_info_t *device_info_local_nonprim = NULL;

    // define the local variable for conversion_events_data_inner->user_data
    conversion_events_user_data_t *user_data_local_nonprim = NULL;

    // conversion_events_data_inner->action_source
    cJSON *action_source = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "action_source");
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

    // conversion_events_data_inner->app_id
    cJSON *app_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "app_id");
    if (cJSON_IsNull(app_id)) {
        app_id = NULL;
    }
    if (app_id) { 
    if(!cJSON_IsString(app_id) && !cJSON_IsNull(app_id))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->app_info
    cJSON *app_info = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "app_info");
    if (cJSON_IsNull(app_info)) {
        app_info = NULL;
    }
    if (app_info) { 
    app_info_local_nonprim = conversion_event_app_info_parseFromJSON(app_info); //nonprimitive
    }

    // conversion_events_data_inner->app_name
    cJSON *app_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "app_name");
    if (cJSON_IsNull(app_name)) {
        app_name = NULL;
    }
    if (app_name) { 
    if(!cJSON_IsString(app_name) && !cJSON_IsNull(app_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->app_version
    cJSON *app_version = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "app_version");
    if (cJSON_IsNull(app_version)) {
        app_version = NULL;
    }
    if (app_version) { 
    if(!cJSON_IsString(app_version) && !cJSON_IsNull(app_version))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->custom_data
    cJSON *custom_data = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "custom_data");
    if (cJSON_IsNull(custom_data)) {
        custom_data = NULL;
    }
    if (custom_data) { 
    custom_data_local_nonprim = conversion_events_data_inner_custom_data_parseFromJSON(custom_data); //nonprimitive
    }

    // conversion_events_data_inner->device_brand
    cJSON *device_brand = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "device_brand");
    if (cJSON_IsNull(device_brand)) {
        device_brand = NULL;
    }
    if (device_brand) { 
    if(!cJSON_IsString(device_brand) && !cJSON_IsNull(device_brand))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->device_carrier
    cJSON *device_carrier = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "device_carrier");
    if (cJSON_IsNull(device_carrier)) {
        device_carrier = NULL;
    }
    if (device_carrier) { 
    if(!cJSON_IsString(device_carrier) && !cJSON_IsNull(device_carrier))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->device_info
    cJSON *device_info = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "device_info");
    if (cJSON_IsNull(device_info)) {
        device_info = NULL;
    }
    if (device_info) { 
    device_info_local_nonprim = conversion_event_device_info_parseFromJSON(device_info); //nonprimitive
    }

    // conversion_events_data_inner->device_model
    cJSON *device_model = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "device_model");
    if (cJSON_IsNull(device_model)) {
        device_model = NULL;
    }
    if (device_model) { 
    if(!cJSON_IsString(device_model) && !cJSON_IsNull(device_model))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->device_type
    cJSON *device_type = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "device_type");
    if (cJSON_IsNull(device_type)) {
        device_type = NULL;
    }
    if (device_type) { 
    if(!cJSON_IsString(device_type) && !cJSON_IsNull(device_type))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "event_id");
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

    // conversion_events_data_inner->event_name
    cJSON *event_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "event_name");
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

    // conversion_events_data_inner->event_source_url
    cJSON *event_source_url = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "event_source_url");
    if (cJSON_IsNull(event_source_url)) {
        event_source_url = NULL;
    }
    if (event_source_url) { 
    if(!cJSON_IsString(event_source_url) && !cJSON_IsNull(event_source_url))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->event_time
    cJSON *event_time = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "event_time");
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

    // conversion_events_data_inner->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (language) { 
    if(!cJSON_IsString(language) && !cJSON_IsNull(language))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->opt_out
    cJSON *opt_out = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "opt_out");
    if (cJSON_IsNull(opt_out)) {
        opt_out = NULL;
    }
    if (opt_out) { 
    if(!cJSON_IsBool(opt_out))
    {
    goto end; //Bool
    }
    }

    // conversion_events_data_inner->os_version
    cJSON *os_version = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "os_version");
    if (cJSON_IsNull(os_version)) {
        os_version = NULL;
    }
    if (os_version) { 
    if(!cJSON_IsString(os_version) && !cJSON_IsNull(os_version))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->partner_name
    cJSON *partner_name = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "partner_name");
    if (cJSON_IsNull(partner_name)) {
        partner_name = NULL;
    }
    if (partner_name) { 
    if(!cJSON_IsString(partner_name) && !cJSON_IsNull(partner_name))
    {
    goto end; //String
    }
    }

    // conversion_events_data_inner->user_data
    cJSON *user_data = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "user_data");
    if (cJSON_IsNull(user_data)) {
        user_data = NULL;
    }
    if (!user_data) {
        goto end;
    }

    
    user_data_local_nonprim = conversion_events_user_data_parseFromJSON(user_data); //nonprimitive

    // conversion_events_data_inner->wifi
    cJSON *wifi = cJSON_GetObjectItemCaseSensitive(conversion_events_data_innerJSON, "wifi");
    if (cJSON_IsNull(wifi)) {
        wifi = NULL;
    }
    if (wifi) { 
    if(!cJSON_IsBool(wifi))
    {
    goto end; //Bool
    }
    }


    conversion_events_data_inner_local_var = conversion_events_data_inner_create_internal (
        strdup(action_source->valuestring),
        app_id && !cJSON_IsNull(app_id) ? strdup(app_id->valuestring) : NULL,
        app_info ? app_info_local_nonprim : NULL,
        app_name && !cJSON_IsNull(app_name) ? strdup(app_name->valuestring) : NULL,
        app_version && !cJSON_IsNull(app_version) ? strdup(app_version->valuestring) : NULL,
        custom_data ? custom_data_local_nonprim : NULL,
        device_brand && !cJSON_IsNull(device_brand) ? strdup(device_brand->valuestring) : NULL,
        device_carrier && !cJSON_IsNull(device_carrier) ? strdup(device_carrier->valuestring) : NULL,
        device_info ? device_info_local_nonprim : NULL,
        device_model && !cJSON_IsNull(device_model) ? strdup(device_model->valuestring) : NULL,
        device_type && !cJSON_IsNull(device_type) ? strdup(device_type->valuestring) : NULL,
        strdup(event_id->valuestring),
        strdup(event_name->valuestring),
        event_source_url && !cJSON_IsNull(event_source_url) ? strdup(event_source_url->valuestring) : NULL,
        event_time->valuedouble,
        language && !cJSON_IsNull(language) ? strdup(language->valuestring) : NULL,
        opt_out ? opt_out->valueint : 0,
        os_version && !cJSON_IsNull(os_version) ? strdup(os_version->valuestring) : NULL,
        partner_name && !cJSON_IsNull(partner_name) ? strdup(partner_name->valuestring) : NULL,
        user_data_local_nonprim,
        wifi ? wifi->valueint : 0
        );

    return conversion_events_data_inner_local_var;
end:
    if (app_info_local_nonprim) {
        conversion_event_app_info_free(app_info_local_nonprim);
        app_info_local_nonprim = NULL;
    }
    if (custom_data_local_nonprim) {
        conversion_events_data_inner_custom_data_free(custom_data_local_nonprim);
        custom_data_local_nonprim = NULL;
    }
    if (device_info_local_nonprim) {
        conversion_event_device_info_free(device_info_local_nonprim);
        device_info_local_nonprim = NULL;
    }
    if (user_data_local_nonprim) {
        conversion_events_user_data_free(user_data_local_nonprim);
        user_data_local_nonprim = NULL;
    }
    return NULL;

}
