#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template.h"



static targeting_template_t *targeting_template_create_internal(
    char *ad_account_id,
    int *auto_targeting_enabled,
    int *created_time,
    char *id,
    list_t *keywords,
    char *name,
    pinterest_rest_api_placement_group_type__e placement_group,
    targeting_template_audience_sizing_t *sizing,
    targeting_template_status_t *status,
    targeting_spec_optimal_t *targeting_attributes,
    tracking_urls_t *tracking_urls,
    int *updated_time,
    int *valid
    ) {
    targeting_template_t *targeting_template_local_var = malloc(sizeof(targeting_template_t));
    if (!targeting_template_local_var) {
        return NULL;
    }
    memset(targeting_template_local_var, 0, sizeof(targeting_template_t));
    targeting_template_local_var->_library_owned = 1;
    targeting_template_local_var->ad_account_id = ad_account_id;
    targeting_template_local_var->auto_targeting_enabled = auto_targeting_enabled;
    targeting_template_local_var->created_time = created_time;
    targeting_template_local_var->id = id;
    targeting_template_local_var->keywords = keywords;
    targeting_template_local_var->name = name;
    targeting_template_local_var->placement_group = placement_group;
    targeting_template_local_var->sizing = sizing;
    targeting_template_local_var->status = status;
    targeting_template_local_var->targeting_attributes = targeting_attributes;
    targeting_template_local_var->tracking_urls = tracking_urls;
    targeting_template_local_var->updated_time = updated_time;
    targeting_template_local_var->valid = valid;
    return targeting_template_local_var;
}

__attribute__((deprecated)) targeting_template_t *targeting_template_create(
    char *ad_account_id,
    int *auto_targeting_enabled,
    int *created_time,
    char *id,
    list_t *keywords,
    char *name,
    pinterest_rest_api_placement_group_type__e placement_group,
    targeting_template_audience_sizing_t *sizing,
    targeting_template_status_t *status,
    targeting_spec_optimal_t *targeting_attributes,
    tracking_urls_t *tracking_urls,
    int *updated_time,
    int *valid
    ) {
    int *auto_targeting_enabled_copy = NULL;
    if (auto_targeting_enabled) {
        auto_targeting_enabled_copy = malloc(sizeof(int));
        if (auto_targeting_enabled_copy) *auto_targeting_enabled_copy = *auto_targeting_enabled;
    }
    int *created_time_copy = NULL;
    if (created_time) {
        created_time_copy = malloc(sizeof(int));
        if (created_time_copy) *created_time_copy = *created_time;
    }
    int *updated_time_copy = NULL;
    if (updated_time) {
        updated_time_copy = malloc(sizeof(int));
        if (updated_time_copy) *updated_time_copy = *updated_time;
    }
    int *valid_copy = NULL;
    if (valid) {
        valid_copy = malloc(sizeof(int));
        if (valid_copy) *valid_copy = *valid;
    }
    targeting_template_t *result = targeting_template_create_internal (
        ad_account_id,
        auto_targeting_enabled_copy,
        created_time_copy,
        id,
        keywords,
        name,
        placement_group,
        sizing,
        status,
        targeting_attributes,
        tracking_urls,
        updated_time_copy,
        valid_copy
        );
    if (!result) {
        free(auto_targeting_enabled_copy);
        free(created_time_copy);
        free(updated_time_copy);
        free(valid_copy);
    }
    return result;
}

void targeting_template_free(targeting_template_t *targeting_template) {
    if(NULL == targeting_template){
        return ;
    }
    if(targeting_template->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_template_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template->ad_account_id) {
        free(targeting_template->ad_account_id);
        targeting_template->ad_account_id = NULL;
    }
    if (targeting_template->auto_targeting_enabled) {
        free(targeting_template->auto_targeting_enabled);
        targeting_template->auto_targeting_enabled = NULL;
    }
    if (targeting_template->created_time) {
        free(targeting_template->created_time);
        targeting_template->created_time = NULL;
    }
    if (targeting_template->id) {
        free(targeting_template->id);
        targeting_template->id = NULL;
    }
    if (targeting_template->keywords) {
        list_ForEach(listEntry, targeting_template->keywords) {
            targeting_template_keyword_free(listEntry->data);
        }
        list_freeList(targeting_template->keywords);
        targeting_template->keywords = NULL;
    }
    if (targeting_template->name) {
        free(targeting_template->name);
        targeting_template->name = NULL;
    }
    if (targeting_template->sizing) {
        targeting_template_audience_sizing_free(targeting_template->sizing);
        targeting_template->sizing = NULL;
    }
    if (targeting_template->status) {
        targeting_template_status_free(targeting_template->status);
        targeting_template->status = NULL;
    }
    if (targeting_template->targeting_attributes) {
        targeting_spec_optimal_free(targeting_template->targeting_attributes);
        targeting_template->targeting_attributes = NULL;
    }
    if (targeting_template->tracking_urls) {
        tracking_urls_free(targeting_template->tracking_urls);
        targeting_template->tracking_urls = NULL;
    }
    if (targeting_template->updated_time) {
        free(targeting_template->updated_time);
        targeting_template->updated_time = NULL;
    }
    if (targeting_template->valid) {
        free(targeting_template->valid);
        targeting_template->valid = NULL;
    }
    free(targeting_template);
}

cJSON *targeting_template_convertToJSON(targeting_template_t *targeting_template) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template->ad_account_id
    if(targeting_template->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", targeting_template->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template->auto_targeting_enabled
    if(targeting_template->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", *targeting_template->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // targeting_template->created_time
    if(targeting_template->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", *targeting_template->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template->id
    if(targeting_template->id) {
    if(cJSON_AddStringToObject(item, "id", targeting_template->id) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template->keywords
    if(targeting_template->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (targeting_template->keywords) {
    list_ForEach(keywordsListEntry, targeting_template->keywords) {
    cJSON *itemLocal = targeting_template_keyword_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }


    // targeting_template->name
    if (!targeting_template->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", targeting_template->name) == NULL) {
    goto fail; //String
    }


    // targeting_template->placement_group
    if(targeting_template->placement_group != pinterest_rest_api_placement_group_type__NULL) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(targeting_template->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // targeting_template->sizing
    if(targeting_template->sizing) {
    cJSON *sizing_local_JSON = targeting_template_audience_sizing_convertToJSON(targeting_template->sizing);
    if(sizing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sizing", sizing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // targeting_template->status
    if(targeting_template->status) {
    cJSON *status_local_JSON = targeting_template_status_convertToJSON(targeting_template->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // targeting_template->targeting_attributes
    if (!targeting_template->targeting_attributes) {
        goto fail;
    }
    cJSON *targeting_attributes_local_JSON = targeting_spec_optimal_convertToJSON(targeting_template->targeting_attributes);
    if(targeting_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_attributes", targeting_attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // targeting_template->tracking_urls
    if(targeting_template->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(targeting_template->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // targeting_template->updated_time
    if(targeting_template->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", *targeting_template->updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template->valid
    if(targeting_template->valid) {
    if(cJSON_AddBoolToObject(item, "valid", *targeting_template->valid) == NULL) {
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

targeting_template_t *targeting_template_parseFromJSON(cJSON *targeting_templateJSON){

    targeting_template_t *targeting_template_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for targeting_template->auto_targeting_enabled
    int *auto_targeting_enabled_local_var = NULL;

    // define the local variable for targeting_template->created_time
    int *created_time_local_var = NULL;

    char *id_local_str = NULL;

    // define the local list for targeting_template->keywords
    list_t *keywordsList = NULL;

    char *name_local_str = NULL;

    // define the local variable for targeting_template->placement_group
    pinterest_rest_api_placement_group_type__e placement_group_local_nonprim = 0;

    // define the local variable for targeting_template->sizing
    targeting_template_audience_sizing_t *sizing_local_nonprim = NULL;

    // define the local variable for targeting_template->status
    targeting_template_status_t *status_local_nonprim = NULL;

    // define the local variable for targeting_template->targeting_attributes
    targeting_spec_optimal_t *targeting_attributes_local_nonprim = NULL;

    // define the local variable for targeting_template->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for targeting_template->updated_time
    int *updated_time_local_var = NULL;

    // define the local variable for targeting_template->valid
    int *valid_local_var = NULL;

    // targeting_template->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // targeting_template->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "auto_targeting_enabled");
    if (cJSON_IsNull(auto_targeting_enabled)) {
        auto_targeting_enabled = NULL;
    }
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    auto_targeting_enabled_local_var = malloc(sizeof(int));
    if(!auto_targeting_enabled_local_var)
    {
        goto end;
    }
    *auto_targeting_enabled_local_var = auto_targeting_enabled->valueint;
    }

    // targeting_template->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    created_time_local_var = malloc(sizeof(int));
    if(!created_time_local_var)
    {
        goto end;
    }
    *created_time_local_var = created_time->valuedouble;
    }

    // targeting_template->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // targeting_template->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "keywords");
    if (cJSON_IsNull(keywords)) {
        keywords = NULL;
    }
    if (keywords) { 
    cJSON *keywords_local_nonprimitive = NULL;
    if(!cJSON_IsArray(keywords)){
        goto end; //nonprimitive container
    }

    keywordsList = list_createList();

    cJSON_ArrayForEach(keywords_local_nonprimitive,keywords )
    {
        if(!cJSON_IsObject(keywords_local_nonprimitive)){
            goto end;
        }
        targeting_template_keyword_t *keywordsItem = targeting_template_keyword_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }

    // targeting_template->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // targeting_template->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "placement_group");
    if (cJSON_IsNull(placement_group)) {
        placement_group = NULL;
    }
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // targeting_template->sizing
    cJSON *sizing = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "sizing");
    if (cJSON_IsNull(sizing)) {
        sizing = NULL;
    }
    if (sizing) { 
    sizing_local_nonprim = targeting_template_audience_sizing_parseFromJSON(sizing); //nonprimitive
    }

    // targeting_template->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = targeting_template_status_parseFromJSON(status); //custom
    }

    // targeting_template->targeting_attributes
    cJSON *targeting_attributes = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "targeting_attributes");
    if (cJSON_IsNull(targeting_attributes)) {
        targeting_attributes = NULL;
    }
    if (!targeting_attributes) {
        goto end;
    }

    
    targeting_attributes_local_nonprim = targeting_spec_optimal_parseFromJSON(targeting_attributes); //nonprimitive

    // targeting_template->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // targeting_template->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    updated_time_local_var = malloc(sizeof(int));
    if(!updated_time_local_var)
    {
        goto end;
    }
    *updated_time_local_var = updated_time->valuedouble;
    }

    // targeting_template->valid
    cJSON *valid = cJSON_GetObjectItemCaseSensitive(targeting_templateJSON, "valid");
    if (cJSON_IsNull(valid)) {
        valid = NULL;
    }
    if (valid) { 
    if(!cJSON_IsBool(valid))
    {
    goto end; //Bool
    }
    valid_local_var = malloc(sizeof(int));
    if(!valid_local_var)
    {
        goto end;
    }
    *valid_local_var = valid->valueint;
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    targeting_template_local_var = targeting_template_create_internal (
        ad_account_id_local_str,
        auto_targeting_enabled_local_var,
        created_time_local_var,
        id_local_str,
        keywords ? keywordsList : NULL,
        name_local_str,
        placement_group ? placement_group_local_nonprim : 0,
        sizing ? sizing_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        targeting_attributes_local_nonprim,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        updated_time_local_var,
        valid_local_var
        );

    if (!targeting_template_local_var) {
        goto end;
    }

    return targeting_template_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (auto_targeting_enabled_local_var) {
        free(auto_targeting_enabled_local_var);
        auto_targeting_enabled_local_var = NULL;
    }
    if (created_time_local_var) {
        free(created_time_local_var);
        created_time_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            targeting_template_keyword_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (placement_group_local_nonprim) {
        placement_group_local_nonprim = 0;
    }
    if (sizing_local_nonprim) {
        targeting_template_audience_sizing_free(sizing_local_nonprim);
        sizing_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        targeting_template_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (targeting_attributes_local_nonprim) {
        targeting_spec_optimal_free(targeting_attributes_local_nonprim);
        targeting_attributes_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (updated_time_local_var) {
        free(updated_time_local_var);
        updated_time_local_var = NULL;
    }
    if (valid_local_var) {
        free(valid_local_var);
        valid_local_var = NULL;
    }
    return NULL;

}
