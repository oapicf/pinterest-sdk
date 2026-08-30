#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log.h"



static integration_log_t *integration_log_create_internal(
    char *advertiser_id,
    char *app_version_number,
    int *client_timestamp,
    integration_log_client_error_t *error,
    integration_log_event_type_t *event_type,
    char *external_business_id,
    char *feed_profile_id,
    integration_log_level_t *log_level,
    char *merchant_id,
    char *message,
    char *platform_version_number,
    integration_log_client_request_t *request,
    char *tag_id
    ) {
    integration_log_t *integration_log_local_var = malloc(sizeof(integration_log_t));
    if (!integration_log_local_var) {
        return NULL;
    }
    memset(integration_log_local_var, 0, sizeof(integration_log_t));
    integration_log_local_var->_library_owned = 1;
    integration_log_local_var->advertiser_id = advertiser_id;
    integration_log_local_var->app_version_number = app_version_number;
    integration_log_local_var->client_timestamp = client_timestamp;
    integration_log_local_var->error = error;
    integration_log_local_var->event_type = event_type;
    integration_log_local_var->external_business_id = external_business_id;
    integration_log_local_var->feed_profile_id = feed_profile_id;
    integration_log_local_var->log_level = log_level;
    integration_log_local_var->merchant_id = merchant_id;
    integration_log_local_var->message = message;
    integration_log_local_var->platform_version_number = platform_version_number;
    integration_log_local_var->request = request;
    integration_log_local_var->tag_id = tag_id;
    return integration_log_local_var;
}

__attribute__((deprecated)) integration_log_t *integration_log_create(
    char *advertiser_id,
    char *app_version_number,
    int *client_timestamp,
    integration_log_client_error_t *error,
    integration_log_event_type_t *event_type,
    char *external_business_id,
    char *feed_profile_id,
    integration_log_level_t *log_level,
    char *merchant_id,
    char *message,
    char *platform_version_number,
    integration_log_client_request_t *request,
    char *tag_id
    ) {
    int *client_timestamp_copy = NULL;
    if (client_timestamp) {
        client_timestamp_copy = malloc(sizeof(int));
        if (client_timestamp_copy) *client_timestamp_copy = *client_timestamp;
    }
    integration_log_t *result = integration_log_create_internal (
        advertiser_id,
        app_version_number,
        client_timestamp_copy,
        error,
        event_type,
        external_business_id,
        feed_profile_id,
        log_level,
        merchant_id,
        message,
        platform_version_number,
        request,
        tag_id
        );
    if (!result) {
        free(client_timestamp_copy);
    }
    return result;
}

void integration_log_free(integration_log_t *integration_log) {
    if(NULL == integration_log){
        return ;
    }
    if(integration_log->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_log_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_log->advertiser_id) {
        free(integration_log->advertiser_id);
        integration_log->advertiser_id = NULL;
    }
    if (integration_log->app_version_number) {
        free(integration_log->app_version_number);
        integration_log->app_version_number = NULL;
    }
    if (integration_log->client_timestamp) {
        free(integration_log->client_timestamp);
        integration_log->client_timestamp = NULL;
    }
    if (integration_log->error) {
        integration_log_client_error_free(integration_log->error);
        integration_log->error = NULL;
    }
    if (integration_log->event_type) {
        integration_log_event_type_free(integration_log->event_type);
        integration_log->event_type = NULL;
    }
    if (integration_log->external_business_id) {
        free(integration_log->external_business_id);
        integration_log->external_business_id = NULL;
    }
    if (integration_log->feed_profile_id) {
        free(integration_log->feed_profile_id);
        integration_log->feed_profile_id = NULL;
    }
    if (integration_log->log_level) {
        integration_log_level_free(integration_log->log_level);
        integration_log->log_level = NULL;
    }
    if (integration_log->merchant_id) {
        free(integration_log->merchant_id);
        integration_log->merchant_id = NULL;
    }
    if (integration_log->message) {
        free(integration_log->message);
        integration_log->message = NULL;
    }
    if (integration_log->platform_version_number) {
        free(integration_log->platform_version_number);
        integration_log->platform_version_number = NULL;
    }
    if (integration_log->request) {
        integration_log_client_request_free(integration_log->request);
        integration_log->request = NULL;
    }
    if (integration_log->tag_id) {
        free(integration_log->tag_id);
        integration_log->tag_id = NULL;
    }
    free(integration_log);
}

cJSON *integration_log_convertToJSON(integration_log_t *integration_log) {
    cJSON *item = cJSON_CreateObject();

    // integration_log->advertiser_id
    if(integration_log->advertiser_id) {
    if(cJSON_AddStringToObject(item, "advertiser_id", integration_log->advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->app_version_number
    if(integration_log->app_version_number) {
    if(cJSON_AddStringToObject(item, "app_version_number", integration_log->app_version_number) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->client_timestamp
    if (!integration_log->client_timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "client_timestamp", *integration_log->client_timestamp) == NULL) {
    goto fail; //Numeric
    }


    // integration_log->error
    if(integration_log->error) {
    cJSON *error_local_JSON = integration_log_client_error_convertToJSON(integration_log->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // integration_log->event_type
    if (!integration_log->event_type) {
        goto fail;
    }
    cJSON *event_type_local_JSON = integration_log_event_type_convertToJSON(integration_log->event_type);
    if(event_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "event_type", event_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // integration_log->external_business_id
    if(integration_log->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_log->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->feed_profile_id
    if(integration_log->feed_profile_id) {
    if(cJSON_AddStringToObject(item, "feed_profile_id", integration_log->feed_profile_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->log_level
    if (!integration_log->log_level) {
        goto fail;
    }
    cJSON *log_level_local_JSON = integration_log_level_convertToJSON(integration_log->log_level);
    if(log_level_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "log_level", log_level_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // integration_log->merchant_id
    if(integration_log->merchant_id) {
    if(cJSON_AddStringToObject(item, "merchant_id", integration_log->merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->message
    if(integration_log->message) {
    if(cJSON_AddStringToObject(item, "message", integration_log->message) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->platform_version_number
    if(integration_log->platform_version_number) {
    if(cJSON_AddStringToObject(item, "platform_version_number", integration_log->platform_version_number) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->request
    if(integration_log->request) {
    cJSON *request_local_JSON = integration_log_client_request_convertToJSON(integration_log->request);
    if(request_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request", request_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // integration_log->tag_id
    if(integration_log->tag_id) {
    if(cJSON_AddStringToObject(item, "tag_id", integration_log->tag_id) == NULL) {
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

integration_log_t *integration_log_parseFromJSON(cJSON *integration_logJSON){

    integration_log_t *integration_log_local_var = NULL;

    char *advertiser_id_local_str = NULL;

    char *app_version_number_local_str = NULL;

    // define the local variable for integration_log->client_timestamp
    int *client_timestamp_local_var = NULL;

    // define the local variable for integration_log->error
    integration_log_client_error_t *error_local_nonprim = NULL;

    // define the local variable for integration_log->event_type
    integration_log_event_type_t *event_type_local_nonprim = NULL;

    char *external_business_id_local_str = NULL;

    char *feed_profile_id_local_str = NULL;

    // define the local variable for integration_log->log_level
    integration_log_level_t *log_level_local_nonprim = NULL;

    char *merchant_id_local_str = NULL;

    char *message_local_str = NULL;

    char *platform_version_number_local_str = NULL;

    // define the local variable for integration_log->request
    integration_log_client_request_t *request_local_nonprim = NULL;

    char *tag_id_local_str = NULL;

    // integration_log->advertiser_id
    cJSON *advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "advertiser_id");
    if (cJSON_IsNull(advertiser_id)) {
        advertiser_id = NULL;
    }
    if (advertiser_id) { 
    if(!cJSON_IsString(advertiser_id) && !cJSON_IsNull(advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_log->app_version_number
    cJSON *app_version_number = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "app_version_number");
    if (cJSON_IsNull(app_version_number)) {
        app_version_number = NULL;
    }
    if (app_version_number) { 
    if(!cJSON_IsString(app_version_number) && !cJSON_IsNull(app_version_number))
    {
    goto end; //String
    }
    }

    // integration_log->client_timestamp
    cJSON *client_timestamp = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "client_timestamp");
    if (cJSON_IsNull(client_timestamp)) {
        client_timestamp = NULL;
    }
    if (!client_timestamp) {
        goto end;
    }

    
    if(!cJSON_IsNumber(client_timestamp))
    {
    goto end; //Numeric
    }
    client_timestamp_local_var = malloc(sizeof(int));
    if(!client_timestamp_local_var)
    {
        goto end;
    }
    *client_timestamp_local_var = client_timestamp->valuedouble;

    // integration_log->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "error");
    if (cJSON_IsNull(error)) {
        error = NULL;
    }
    if (error) { 
    error_local_nonprim = integration_log_client_error_parseFromJSON(error); //nonprimitive
    }

    // integration_log->event_type
    cJSON *event_type = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "event_type");
    if (cJSON_IsNull(event_type)) {
        event_type = NULL;
    }
    if (!event_type) {
        goto end;
    }

    
    event_type_local_nonprim = integration_log_event_type_parseFromJSON(event_type); //custom

    // integration_log->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "external_business_id");
    if (cJSON_IsNull(external_business_id)) {
        external_business_id = NULL;
    }
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_log->feed_profile_id
    cJSON *feed_profile_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "feed_profile_id");
    if (cJSON_IsNull(feed_profile_id)) {
        feed_profile_id = NULL;
    }
    if (feed_profile_id) { 
    if(!cJSON_IsString(feed_profile_id) && !cJSON_IsNull(feed_profile_id))
    {
    goto end; //String
    }
    }

    // integration_log->log_level
    cJSON *log_level = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "log_level");
    if (cJSON_IsNull(log_level)) {
        log_level = NULL;
    }
    if (!log_level) {
        goto end;
    }

    
    log_level_local_nonprim = integration_log_level_parseFromJSON(log_level); //custom

    // integration_log->merchant_id
    cJSON *merchant_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "merchant_id");
    if (cJSON_IsNull(merchant_id)) {
        merchant_id = NULL;
    }
    if (merchant_id) { 
    if(!cJSON_IsString(merchant_id) && !cJSON_IsNull(merchant_id))
    {
    goto end; //String
    }
    }

    // integration_log->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // integration_log->platform_version_number
    cJSON *platform_version_number = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "platform_version_number");
    if (cJSON_IsNull(platform_version_number)) {
        platform_version_number = NULL;
    }
    if (platform_version_number) { 
    if(!cJSON_IsString(platform_version_number) && !cJSON_IsNull(platform_version_number))
    {
    goto end; //String
    }
    }

    // integration_log->request
    cJSON *request = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "request");
    if (cJSON_IsNull(request)) {
        request = NULL;
    }
    if (request) { 
    request_local_nonprim = integration_log_client_request_parseFromJSON(request); //nonprimitive
    }

    // integration_log->tag_id
    cJSON *tag_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "tag_id");
    if (cJSON_IsNull(tag_id)) {
        tag_id = NULL;
    }
    if (tag_id) { 
    if(!cJSON_IsString(tag_id) && !cJSON_IsNull(tag_id))
    {
    goto end; //String
    }
    }


    if (advertiser_id && !cJSON_IsNull(advertiser_id)) advertiser_id_local_str = strdup(advertiser_id->valuestring);
    if (app_version_number && !cJSON_IsNull(app_version_number)) app_version_number_local_str = strdup(app_version_number->valuestring);
    if (external_business_id && !cJSON_IsNull(external_business_id)) external_business_id_local_str = strdup(external_business_id->valuestring);
    if (feed_profile_id && !cJSON_IsNull(feed_profile_id)) feed_profile_id_local_str = strdup(feed_profile_id->valuestring);
    if (merchant_id && !cJSON_IsNull(merchant_id)) merchant_id_local_str = strdup(merchant_id->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);
    if (platform_version_number && !cJSON_IsNull(platform_version_number)) platform_version_number_local_str = strdup(platform_version_number->valuestring);
    if (tag_id && !cJSON_IsNull(tag_id)) tag_id_local_str = strdup(tag_id->valuestring);

    integration_log_local_var = integration_log_create_internal (
        advertiser_id_local_str,
        app_version_number_local_str,
        client_timestamp_local_var,
        error ? error_local_nonprim : NULL,
        event_type_local_nonprim,
        external_business_id_local_str,
        feed_profile_id_local_str,
        log_level_local_nonprim,
        merchant_id_local_str,
        message_local_str,
        platform_version_number_local_str,
        request ? request_local_nonprim : NULL,
        tag_id_local_str
        );

    if (!integration_log_local_var) {
        goto end;
    }

    return integration_log_local_var;
end:
    if (advertiser_id_local_str) {
        free(advertiser_id_local_str);
        advertiser_id_local_str = NULL;
    }
    if (app_version_number_local_str) {
        free(app_version_number_local_str);
        app_version_number_local_str = NULL;
    }
    if (client_timestamp_local_var) {
        free(client_timestamp_local_var);
        client_timestamp_local_var = NULL;
    }
    if (error_local_nonprim) {
        integration_log_client_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    if (event_type_local_nonprim) {
        integration_log_event_type_free(event_type_local_nonprim);
        event_type_local_nonprim = NULL;
    }
    if (external_business_id_local_str) {
        free(external_business_id_local_str);
        external_business_id_local_str = NULL;
    }
    if (feed_profile_id_local_str) {
        free(feed_profile_id_local_str);
        feed_profile_id_local_str = NULL;
    }
    if (log_level_local_nonprim) {
        integration_log_level_free(log_level_local_nonprim);
        log_level_local_nonprim = NULL;
    }
    if (merchant_id_local_str) {
        free(merchant_id_local_str);
        merchant_id_local_str = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (platform_version_number_local_str) {
        free(platform_version_number_local_str);
        platform_version_number_local_str = NULL;
    }
    if (request_local_nonprim) {
        integration_log_client_request_free(request_local_nonprim);
        request_local_nonprim = NULL;
    }
    if (tag_id_local_str) {
        free(tag_id_local_str);
        tag_id_local_str = NULL;
    }
    return NULL;

}
