#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log.h"


char* integration_log_event_type_ToString(pinterest_rest_api_integration_log_EVENTTYPE_e event_type) {
    char* event_typeArray[] =  { "NULL", "APP", "API" };
    return event_typeArray[event_type];
}

pinterest_rest_api_integration_log_EVENTTYPE_e integration_log_event_type_FromString(char* event_type){
    int stringToReturn = 0;
    char *event_typeArray[] =  { "NULL", "APP", "API" };
    size_t sizeofArray = sizeof(event_typeArray) / sizeof(event_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event_type, event_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* integration_log_log_level_ToString(pinterest_rest_api_integration_log_LOGLEVEL_e log_level) {
    char* log_levelArray[] =  { "NULL", "INFO", "WARN", "ERROR" };
    return log_levelArray[log_level];
}

pinterest_rest_api_integration_log_LOGLEVEL_e integration_log_log_level_FromString(char* log_level){
    int stringToReturn = 0;
    char *log_levelArray[] =  { "NULL", "INFO", "WARN", "ERROR" };
    size_t sizeofArray = sizeof(log_levelArray) / sizeof(log_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(log_level, log_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

integration_log_t *integration_log_create(
    int client_timestamp,
    pinterest_rest_api_integration_log_EVENTTYPE_e event_type,
    pinterest_rest_api_integration_log_LOGLEVEL_e log_level,
    char *external_business_id,
    char *advertiser_id,
    char *merchant_id,
    char *tag_id,
    char *feed_profile_id,
    char *message,
    char *app_version_number,
    char *platform_version_number,
    integration_log_client_error_t *error,
    integration_log_client_request_t *request
    ) {
    integration_log_t *integration_log_local_var = malloc(sizeof(integration_log_t));
    if (!integration_log_local_var) {
        return NULL;
    }
    integration_log_local_var->client_timestamp = client_timestamp;
    integration_log_local_var->event_type = event_type;
    integration_log_local_var->log_level = log_level;
    integration_log_local_var->external_business_id = external_business_id;
    integration_log_local_var->advertiser_id = advertiser_id;
    integration_log_local_var->merchant_id = merchant_id;
    integration_log_local_var->tag_id = tag_id;
    integration_log_local_var->feed_profile_id = feed_profile_id;
    integration_log_local_var->message = message;
    integration_log_local_var->app_version_number = app_version_number;
    integration_log_local_var->platform_version_number = platform_version_number;
    integration_log_local_var->error = error;
    integration_log_local_var->request = request;

    return integration_log_local_var;
}


void integration_log_free(integration_log_t *integration_log) {
    if(NULL == integration_log){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_log->external_business_id) {
        free(integration_log->external_business_id);
        integration_log->external_business_id = NULL;
    }
    if (integration_log->advertiser_id) {
        free(integration_log->advertiser_id);
        integration_log->advertiser_id = NULL;
    }
    if (integration_log->merchant_id) {
        free(integration_log->merchant_id);
        integration_log->merchant_id = NULL;
    }
    if (integration_log->tag_id) {
        free(integration_log->tag_id);
        integration_log->tag_id = NULL;
    }
    if (integration_log->feed_profile_id) {
        free(integration_log->feed_profile_id);
        integration_log->feed_profile_id = NULL;
    }
    if (integration_log->message) {
        free(integration_log->message);
        integration_log->message = NULL;
    }
    if (integration_log->app_version_number) {
        free(integration_log->app_version_number);
        integration_log->app_version_number = NULL;
    }
    if (integration_log->platform_version_number) {
        free(integration_log->platform_version_number);
        integration_log->platform_version_number = NULL;
    }
    if (integration_log->error) {
        integration_log_client_error_free(integration_log->error);
        integration_log->error = NULL;
    }
    if (integration_log->request) {
        integration_log_client_request_free(integration_log->request);
        integration_log->request = NULL;
    }
    free(integration_log);
}

cJSON *integration_log_convertToJSON(integration_log_t *integration_log) {
    cJSON *item = cJSON_CreateObject();

    // integration_log->client_timestamp
    if (!integration_log->client_timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "client_timestamp", integration_log->client_timestamp) == NULL) {
    goto fail; //Numeric
    }


    // integration_log->event_type
    if (pinterest_rest_api_integration_log_EVENTTYPE_NULL == integration_log->event_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_type", event_typeintegration_log_ToString(integration_log->event_type)) == NULL)
    {
    goto fail; //Enum
    }


    // integration_log->log_level
    if (pinterest_rest_api_integration_log_LOGLEVEL_NULL == integration_log->log_level) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "log_level", log_levelintegration_log_ToString(integration_log->log_level)) == NULL)
    {
    goto fail; //Enum
    }


    // integration_log->external_business_id
    if(integration_log->external_business_id) {
    if(cJSON_AddStringToObject(item, "external_business_id", integration_log->external_business_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->advertiser_id
    if(integration_log->advertiser_id) {
    if(cJSON_AddStringToObject(item, "advertiser_id", integration_log->advertiser_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->merchant_id
    if(integration_log->merchant_id) {
    if(cJSON_AddStringToObject(item, "merchant_id", integration_log->merchant_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->tag_id
    if(integration_log->tag_id) {
    if(cJSON_AddStringToObject(item, "tag_id", integration_log->tag_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->feed_profile_id
    if(integration_log->feed_profile_id) {
    if(cJSON_AddStringToObject(item, "feed_profile_id", integration_log->feed_profile_id) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->message
    if(integration_log->message) {
    if(cJSON_AddStringToObject(item, "message", integration_log->message) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->app_version_number
    if(integration_log->app_version_number) {
    if(cJSON_AddStringToObject(item, "app_version_number", integration_log->app_version_number) == NULL) {
    goto fail; //String
    }
    }


    // integration_log->platform_version_number
    if(integration_log->platform_version_number) {
    if(cJSON_AddStringToObject(item, "platform_version_number", integration_log->platform_version_number) == NULL) {
    goto fail; //String
    }
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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

integration_log_t *integration_log_parseFromJSON(cJSON *integration_logJSON){

    integration_log_t *integration_log_local_var = NULL;

    // define the local variable for integration_log->error
    integration_log_client_error_t *error_local_nonprim = NULL;

    // define the local variable for integration_log->request
    integration_log_client_request_t *request_local_nonprim = NULL;

    // integration_log->client_timestamp
    cJSON *client_timestamp = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "client_timestamp");
    if (!client_timestamp) {
        goto end;
    }

    
    if(!cJSON_IsNumber(client_timestamp))
    {
    goto end; //Numeric
    }

    // integration_log->event_type
    cJSON *event_type = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "event_type");
    if (!event_type) {
        goto end;
    }

    pinterest_rest_api_integration_log_EVENTTYPE_e event_typeVariable;
    
    if(!cJSON_IsString(event_type))
    {
    goto end; //Enum
    }
    event_typeVariable = integration_log_event_type_FromString(event_type->valuestring);

    // integration_log->log_level
    cJSON *log_level = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "log_level");
    if (!log_level) {
        goto end;
    }

    pinterest_rest_api_integration_log_LOGLEVEL_e log_levelVariable;
    
    if(!cJSON_IsString(log_level))
    {
    goto end; //Enum
    }
    log_levelVariable = integration_log_log_level_FromString(log_level->valuestring);

    // integration_log->external_business_id
    cJSON *external_business_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "external_business_id");
    if (external_business_id) { 
    if(!cJSON_IsString(external_business_id) && !cJSON_IsNull(external_business_id))
    {
    goto end; //String
    }
    }

    // integration_log->advertiser_id
    cJSON *advertiser_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "advertiser_id");
    if (advertiser_id) { 
    if(!cJSON_IsString(advertiser_id) && !cJSON_IsNull(advertiser_id))
    {
    goto end; //String
    }
    }

    // integration_log->merchant_id
    cJSON *merchant_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "merchant_id");
    if (merchant_id) { 
    if(!cJSON_IsString(merchant_id) && !cJSON_IsNull(merchant_id))
    {
    goto end; //String
    }
    }

    // integration_log->tag_id
    cJSON *tag_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "tag_id");
    if (tag_id) { 
    if(!cJSON_IsString(tag_id) && !cJSON_IsNull(tag_id))
    {
    goto end; //String
    }
    }

    // integration_log->feed_profile_id
    cJSON *feed_profile_id = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "feed_profile_id");
    if (feed_profile_id) { 
    if(!cJSON_IsString(feed_profile_id) && !cJSON_IsNull(feed_profile_id))
    {
    goto end; //String
    }
    }

    // integration_log->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // integration_log->app_version_number
    cJSON *app_version_number = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "app_version_number");
    if (app_version_number) { 
    if(!cJSON_IsString(app_version_number) && !cJSON_IsNull(app_version_number))
    {
    goto end; //String
    }
    }

    // integration_log->platform_version_number
    cJSON *platform_version_number = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "platform_version_number");
    if (platform_version_number) { 
    if(!cJSON_IsString(platform_version_number) && !cJSON_IsNull(platform_version_number))
    {
    goto end; //String
    }
    }

    // integration_log->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "error");
    if (error) { 
    error_local_nonprim = integration_log_client_error_parseFromJSON(error); //nonprimitive
    }

    // integration_log->request
    cJSON *request = cJSON_GetObjectItemCaseSensitive(integration_logJSON, "request");
    if (request) { 
    request_local_nonprim = integration_log_client_request_parseFromJSON(request); //nonprimitive
    }


    integration_log_local_var = integration_log_create (
        client_timestamp->valuedouble,
        event_typeVariable,
        log_levelVariable,
        external_business_id && !cJSON_IsNull(external_business_id) ? strdup(external_business_id->valuestring) : NULL,
        advertiser_id && !cJSON_IsNull(advertiser_id) ? strdup(advertiser_id->valuestring) : NULL,
        merchant_id && !cJSON_IsNull(merchant_id) ? strdup(merchant_id->valuestring) : NULL,
        tag_id && !cJSON_IsNull(tag_id) ? strdup(tag_id->valuestring) : NULL,
        feed_profile_id && !cJSON_IsNull(feed_profile_id) ? strdup(feed_profile_id->valuestring) : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        app_version_number && !cJSON_IsNull(app_version_number) ? strdup(app_version_number->valuestring) : NULL,
        platform_version_number && !cJSON_IsNull(platform_version_number) ? strdup(platform_version_number->valuestring) : NULL,
        error ? error_local_nonprim : NULL,
        request ? request_local_nonprim : NULL
        );

    return integration_log_local_var;
end:
    if (error_local_nonprim) {
        integration_log_client_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    if (request_local_nonprim) {
        integration_log_client_request_free(request_local_nonprim);
        request_local_nonprim = NULL;
    }
    return NULL;

}
