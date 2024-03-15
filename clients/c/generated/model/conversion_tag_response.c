#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_response.h"


char* conversion_tag_response_enhanced_match_status_ToString(pinterest_rest_api_conversion_tag_response__e enhanced_match_status) {
    char* enhanced_match_statusArray[] =  { "NULL", "UNKNOWN", "NOT_VALIDATED", "VALIDATING_IN_PROGRESS", "VALIDATION_COMPLETE", "" };
    return enhanced_match_statusArray[enhanced_match_status];
}

pinterest_rest_api_conversion_tag_response__e conversion_tag_response_enhanced_match_status_FromString(char* enhanced_match_status){
    int stringToReturn = 0;
    char *enhanced_match_statusArray[] =  { "NULL", "UNKNOWN", "NOT_VALIDATED", "VALIDATING_IN_PROGRESS", "VALIDATION_COMPLETE", "" };
    size_t sizeofArray = sizeof(enhanced_match_statusArray) / sizeof(enhanced_match_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(enhanced_match_status, enhanced_match_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_tag_response_status_ToString(pinterest_rest_api_conversion_tag_response__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return statusArray[status];
}

pinterest_rest_api_conversion_tag_response__e conversion_tag_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

conversion_tag_response_t *conversion_tag_response_create(
    char *ad_account_id,
    char *code_snippet,
    enhanced_match_status_type_t *enhanced_match_status,
    char *id,
    double last_fired_time_ms,
    char *name,
    entity_status_t *status,
    char *version,
    conversion_tag_configs_t *configs
    ) {
    conversion_tag_response_t *conversion_tag_response_local_var = malloc(sizeof(conversion_tag_response_t));
    if (!conversion_tag_response_local_var) {
        return NULL;
    }
    conversion_tag_response_local_var->ad_account_id = ad_account_id;
    conversion_tag_response_local_var->code_snippet = code_snippet;
    conversion_tag_response_local_var->enhanced_match_status = enhanced_match_status;
    conversion_tag_response_local_var->id = id;
    conversion_tag_response_local_var->last_fired_time_ms = last_fired_time_ms;
    conversion_tag_response_local_var->name = name;
    conversion_tag_response_local_var->status = status;
    conversion_tag_response_local_var->version = version;
    conversion_tag_response_local_var->configs = configs;

    return conversion_tag_response_local_var;
}


void conversion_tag_response_free(conversion_tag_response_t *conversion_tag_response) {
    if(NULL == conversion_tag_response){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tag_response->ad_account_id) {
        free(conversion_tag_response->ad_account_id);
        conversion_tag_response->ad_account_id = NULL;
    }
    if (conversion_tag_response->code_snippet) {
        free(conversion_tag_response->code_snippet);
        conversion_tag_response->code_snippet = NULL;
    }
    if (conversion_tag_response->enhanced_match_status) {
        enhanced_match_status_type_free(conversion_tag_response->enhanced_match_status);
        conversion_tag_response->enhanced_match_status = NULL;
    }
    if (conversion_tag_response->id) {
        free(conversion_tag_response->id);
        conversion_tag_response->id = NULL;
    }
    if (conversion_tag_response->name) {
        free(conversion_tag_response->name);
        conversion_tag_response->name = NULL;
    }
    if (conversion_tag_response->status) {
        entity_status_free(conversion_tag_response->status);
        conversion_tag_response->status = NULL;
    }
    if (conversion_tag_response->version) {
        free(conversion_tag_response->version);
        conversion_tag_response->version = NULL;
    }
    if (conversion_tag_response->configs) {
        conversion_tag_configs_free(conversion_tag_response->configs);
        conversion_tag_response->configs = NULL;
    }
    free(conversion_tag_response);
}

cJSON *conversion_tag_response_convertToJSON(conversion_tag_response_t *conversion_tag_response) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_response->ad_account_id
    if(conversion_tag_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", conversion_tag_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_response->code_snippet
    if(conversion_tag_response->code_snippet) {
    if(cJSON_AddStringToObject(item, "code_snippet", conversion_tag_response->code_snippet) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_response->enhanced_match_status
    if(conversion_tag_response->enhanced_match_status != pinterest_rest_api_conversion_tag_response__NULL) {
    cJSON *enhanced_match_status_local_JSON = enhanced_match_status_type_convertToJSON(conversion_tag_response->enhanced_match_status);
    if(enhanced_match_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "enhanced_match_status", enhanced_match_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_tag_response->id
    if(conversion_tag_response->id) {
    if(cJSON_AddStringToObject(item, "id", conversion_tag_response->id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_response->last_fired_time_ms
    if(conversion_tag_response->last_fired_time_ms) {
    if(cJSON_AddNumberToObject(item, "last_fired_time_ms", conversion_tag_response->last_fired_time_ms) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_tag_response->name
    if(conversion_tag_response->name) {
    if(cJSON_AddStringToObject(item, "name", conversion_tag_response->name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_response->status
    if(conversion_tag_response->status != pinterest_rest_api_conversion_tag_response__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(conversion_tag_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_tag_response->version
    if(conversion_tag_response->version) {
    if(cJSON_AddStringToObject(item, "version", conversion_tag_response->version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_response->configs
    if(conversion_tag_response->configs) {
    cJSON *configs_local_JSON = conversion_tag_configs_convertToJSON(conversion_tag_response->configs);
    if(configs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configs", configs_local_JSON);
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

conversion_tag_response_t *conversion_tag_response_parseFromJSON(cJSON *conversion_tag_responseJSON){

    conversion_tag_response_t *conversion_tag_response_local_var = NULL;

    // define the local variable for conversion_tag_response->enhanced_match_status
    enhanced_match_status_type_t *enhanced_match_status_local_nonprim = NULL;

    // define the local variable for conversion_tag_response->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for conversion_tag_response->configs
    conversion_tag_configs_t *configs_local_nonprim = NULL;

    // conversion_tag_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // conversion_tag_response->code_snippet
    cJSON *code_snippet = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "code_snippet");
    if (code_snippet) { 
    if(!cJSON_IsString(code_snippet) && !cJSON_IsNull(code_snippet))
    {
    goto end; //String
    }
    }

    // conversion_tag_response->enhanced_match_status
    cJSON *enhanced_match_status = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "enhanced_match_status");
    if (enhanced_match_status) { 
    enhanced_match_status_local_nonprim = enhanced_match_status_type_parseFromJSON(enhanced_match_status); //custom
    }

    // conversion_tag_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // conversion_tag_response->last_fired_time_ms
    cJSON *last_fired_time_ms = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "last_fired_time_ms");
    if (last_fired_time_ms) { 
    if(!cJSON_IsNumber(last_fired_time_ms))
    {
    goto end; //Numeric
    }
    }

    // conversion_tag_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // conversion_tag_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // conversion_tag_response->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "version");
    if (version) { 
    if(!cJSON_IsString(version) && !cJSON_IsNull(version))
    {
    goto end; //String
    }
    }

    // conversion_tag_response->configs
    cJSON *configs = cJSON_GetObjectItemCaseSensitive(conversion_tag_responseJSON, "configs");
    if (configs) { 
    configs_local_nonprim = conversion_tag_configs_parseFromJSON(configs); //nonprimitive
    }


    conversion_tag_response_local_var = conversion_tag_response_create (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        code_snippet && !cJSON_IsNull(code_snippet) ? strdup(code_snippet->valuestring) : NULL,
        enhanced_match_status ? enhanced_match_status_local_nonprim : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        last_fired_time_ms ? last_fired_time_ms->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        version && !cJSON_IsNull(version) ? strdup(version->valuestring) : NULL,
        configs ? configs_local_nonprim : NULL
        );

    return conversion_tag_response_local_var;
end:
    if (enhanced_match_status_local_nonprim) {
        enhanced_match_status_type_free(enhanced_match_status_local_nonprim);
        enhanced_match_status_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (configs_local_nonprim) {
        conversion_tag_configs_free(configs_local_nonprim);
        configs_local_nonprim = NULL;
    }
    return NULL;

}
