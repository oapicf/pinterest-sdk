#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_tag_common.h"



static conversion_tag_common_t *conversion_tag_common_create_internal(
    char *ad_account_id,
    char *code_snippet,
    pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status,
    char *id,
    double last_fired_time_ms,
    char *name,
    pinterest_rest_api_entity_status__e status,
    char *version,
    conversion_tag_configs_t *configs
    ) {
    conversion_tag_common_t *conversion_tag_common_local_var = malloc(sizeof(conversion_tag_common_t));
    if (!conversion_tag_common_local_var) {
        return NULL;
    }
    conversion_tag_common_local_var->ad_account_id = ad_account_id;
    conversion_tag_common_local_var->code_snippet = code_snippet;
    conversion_tag_common_local_var->enhanced_match_status = enhanced_match_status;
    conversion_tag_common_local_var->id = id;
    conversion_tag_common_local_var->last_fired_time_ms = last_fired_time_ms;
    conversion_tag_common_local_var->name = name;
    conversion_tag_common_local_var->status = status;
    conversion_tag_common_local_var->version = version;
    conversion_tag_common_local_var->configs = configs;

    conversion_tag_common_local_var->_library_owned = 1;
    return conversion_tag_common_local_var;
}

__attribute__((deprecated)) conversion_tag_common_t *conversion_tag_common_create(
    char *ad_account_id,
    char *code_snippet,
    pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status,
    char *id,
    double last_fired_time_ms,
    char *name,
    pinterest_rest_api_entity_status__e status,
    char *version,
    conversion_tag_configs_t *configs
    ) {
    return conversion_tag_common_create_internal (
        ad_account_id,
        code_snippet,
        enhanced_match_status,
        id,
        last_fired_time_ms,
        name,
        status,
        version,
        configs
        );
}

void conversion_tag_common_free(conversion_tag_common_t *conversion_tag_common) {
    if(NULL == conversion_tag_common){
        return ;
    }
    if(conversion_tag_common->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_tag_common_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_tag_common->ad_account_id) {
        free(conversion_tag_common->ad_account_id);
        conversion_tag_common->ad_account_id = NULL;
    }
    if (conversion_tag_common->code_snippet) {
        free(conversion_tag_common->code_snippet);
        conversion_tag_common->code_snippet = NULL;
    }
    if (conversion_tag_common->id) {
        free(conversion_tag_common->id);
        conversion_tag_common->id = NULL;
    }
    if (conversion_tag_common->name) {
        free(conversion_tag_common->name);
        conversion_tag_common->name = NULL;
    }
    if (conversion_tag_common->version) {
        free(conversion_tag_common->version);
        conversion_tag_common->version = NULL;
    }
    if (conversion_tag_common->configs) {
        conversion_tag_configs_free(conversion_tag_common->configs);
        conversion_tag_common->configs = NULL;
    }
    free(conversion_tag_common);
}

cJSON *conversion_tag_common_convertToJSON(conversion_tag_common_t *conversion_tag_common) {
    cJSON *item = cJSON_CreateObject();

    // conversion_tag_common->ad_account_id
    if(conversion_tag_common->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", conversion_tag_common->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_common->code_snippet
    if(conversion_tag_common->code_snippet) {
    if(cJSON_AddStringToObject(item, "code_snippet", conversion_tag_common->code_snippet) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_common->enhanced_match_status
    if(conversion_tag_common->enhanced_match_status != pinterest_rest_api_enhanced_match_status_type__NULL) {
    cJSON *enhanced_match_status_local_JSON = enhanced_match_status_type_convertToJSON(conversion_tag_common->enhanced_match_status);
    if(enhanced_match_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "enhanced_match_status", enhanced_match_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_tag_common->id
    if(conversion_tag_common->id) {
    if(cJSON_AddStringToObject(item, "id", conversion_tag_common->id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_common->last_fired_time_ms
    if(conversion_tag_common->last_fired_time_ms) {
    if(cJSON_AddNumberToObject(item, "last_fired_time_ms", conversion_tag_common->last_fired_time_ms) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_tag_common->name
    if(conversion_tag_common->name) {
    if(cJSON_AddStringToObject(item, "name", conversion_tag_common->name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_common->status
    if(conversion_tag_common->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(conversion_tag_common->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_tag_common->version
    if(conversion_tag_common->version) {
    if(cJSON_AddStringToObject(item, "version", conversion_tag_common->version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_tag_common->configs
    if(conversion_tag_common->configs) {
    cJSON *configs_local_JSON = conversion_tag_configs_convertToJSON(conversion_tag_common->configs);
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

conversion_tag_common_t *conversion_tag_common_parseFromJSON(cJSON *conversion_tag_commonJSON){

    conversion_tag_common_t *conversion_tag_common_local_var = NULL;

    // define the local variable for conversion_tag_common->enhanced_match_status
    pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_local_nonprim = 0;

    // define the local variable for conversion_tag_common->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // define the local variable for conversion_tag_common->configs
    conversion_tag_configs_t *configs_local_nonprim = NULL;

    // conversion_tag_common->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // conversion_tag_common->code_snippet
    cJSON *code_snippet = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "code_snippet");
    if (cJSON_IsNull(code_snippet)) {
        code_snippet = NULL;
    }
    if (code_snippet) { 
    if(!cJSON_IsString(code_snippet) && !cJSON_IsNull(code_snippet))
    {
    goto end; //String
    }
    }

    // conversion_tag_common->enhanced_match_status
    cJSON *enhanced_match_status = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "enhanced_match_status");
    if (cJSON_IsNull(enhanced_match_status)) {
        enhanced_match_status = NULL;
    }
    if (enhanced_match_status) { 
    enhanced_match_status_local_nonprim = enhanced_match_status_type_parseFromJSON(enhanced_match_status); //custom
    }

    // conversion_tag_common->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // conversion_tag_common->last_fired_time_ms
    cJSON *last_fired_time_ms = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "last_fired_time_ms");
    if (cJSON_IsNull(last_fired_time_ms)) {
        last_fired_time_ms = NULL;
    }
    if (last_fired_time_ms) { 
    if(!cJSON_IsNumber(last_fired_time_ms))
    {
    goto end; //Numeric
    }
    }

    // conversion_tag_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // conversion_tag_common->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // conversion_tag_common->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (version) { 
    if(!cJSON_IsString(version) && !cJSON_IsNull(version))
    {
    goto end; //String
    }
    }

    // conversion_tag_common->configs
    cJSON *configs = cJSON_GetObjectItemCaseSensitive(conversion_tag_commonJSON, "configs");
    if (cJSON_IsNull(configs)) {
        configs = NULL;
    }
    if (configs) { 
    configs_local_nonprim = conversion_tag_configs_parseFromJSON(configs); //nonprimitive
    }


    conversion_tag_common_local_var = conversion_tag_common_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        code_snippet && !cJSON_IsNull(code_snippet) ? strdup(code_snippet->valuestring) : NULL,
        enhanced_match_status ? enhanced_match_status_local_nonprim : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        last_fired_time_ms ? last_fired_time_ms->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        status ? status_local_nonprim : 0,
        version && !cJSON_IsNull(version) ? strdup(version->valuestring) : NULL,
        configs ? configs_local_nonprim : NULL
        );

    return conversion_tag_common_local_var;
end:
    if (enhanced_match_status_local_nonprim) {
        enhanced_match_status_local_nonprim = 0;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (configs_local_nonprim) {
        conversion_tag_configs_free(configs_local_nonprim);
        configs_local_nonprim = NULL;
    }
    return NULL;

}
