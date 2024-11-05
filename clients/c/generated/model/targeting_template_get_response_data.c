#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_get_response_data.h"


char* targeting_template_get_response_data_placement_group_ToString(pinterest_rest_api_targeting_template_get_response_data__e placement_group) {
    char* placement_groupArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    return placement_groupArray[placement_group];
}

pinterest_rest_api_targeting_template_get_response_data__e targeting_template_get_response_data_placement_group_FromString(char* placement_group){
    int stringToReturn = 0;
    char *placement_groupArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    size_t sizeofArray = sizeof(placement_groupArray) / sizeof(placement_groupArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_group, placement_groupArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_template_get_response_data_status_ToString(pinterest_rest_api_targeting_template_get_response_data_STATUS_e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "DELETED" };
    return statusArray[status];
}

pinterest_rest_api_targeting_template_get_response_data_STATUS_e targeting_template_get_response_data_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ACTIVE", "DELETED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

targeting_template_get_response_data_t *targeting_template_get_response_data_create(
    char *name,
    int auto_targeting_enabled,
    targeting_spec_t *targeting_attributes,
    placement_group_type_t *placement_group,
    list_t *keywords,
    tracking_urls_t *tracking_urls,
    char *id,
    int created_time,
    int updated_time,
    char *ad_account_id,
    pinterest_rest_api_targeting_template_get_response_data_STATUS_e status,
    targeting_template_audience_sizing_t *sizing,
    int valid
    ) {
    targeting_template_get_response_data_t *targeting_template_get_response_data_local_var = malloc(sizeof(targeting_template_get_response_data_t));
    if (!targeting_template_get_response_data_local_var) {
        return NULL;
    }
    targeting_template_get_response_data_local_var->name = name;
    targeting_template_get_response_data_local_var->auto_targeting_enabled = auto_targeting_enabled;
    targeting_template_get_response_data_local_var->targeting_attributes = targeting_attributes;
    targeting_template_get_response_data_local_var->placement_group = placement_group;
    targeting_template_get_response_data_local_var->keywords = keywords;
    targeting_template_get_response_data_local_var->tracking_urls = tracking_urls;
    targeting_template_get_response_data_local_var->id = id;
    targeting_template_get_response_data_local_var->created_time = created_time;
    targeting_template_get_response_data_local_var->updated_time = updated_time;
    targeting_template_get_response_data_local_var->ad_account_id = ad_account_id;
    targeting_template_get_response_data_local_var->status = status;
    targeting_template_get_response_data_local_var->sizing = sizing;
    targeting_template_get_response_data_local_var->valid = valid;

    return targeting_template_get_response_data_local_var;
}


void targeting_template_get_response_data_free(targeting_template_get_response_data_t *targeting_template_get_response_data) {
    if(NULL == targeting_template_get_response_data){
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_get_response_data->name) {
        free(targeting_template_get_response_data->name);
        targeting_template_get_response_data->name = NULL;
    }
    if (targeting_template_get_response_data->targeting_attributes) {
        targeting_spec_free(targeting_template_get_response_data->targeting_attributes);
        targeting_template_get_response_data->targeting_attributes = NULL;
    }
    if (targeting_template_get_response_data->placement_group) {
        placement_group_type_free(targeting_template_get_response_data->placement_group);
        targeting_template_get_response_data->placement_group = NULL;
    }
    if (targeting_template_get_response_data->keywords) {
        list_ForEach(listEntry, targeting_template_get_response_data->keywords) {
            targeting_template_keyword_free(listEntry->data);
        }
        list_freeList(targeting_template_get_response_data->keywords);
        targeting_template_get_response_data->keywords = NULL;
    }
    if (targeting_template_get_response_data->tracking_urls) {
        tracking_urls_free(targeting_template_get_response_data->tracking_urls);
        targeting_template_get_response_data->tracking_urls = NULL;
    }
    if (targeting_template_get_response_data->id) {
        free(targeting_template_get_response_data->id);
        targeting_template_get_response_data->id = NULL;
    }
    if (targeting_template_get_response_data->ad_account_id) {
        free(targeting_template_get_response_data->ad_account_id);
        targeting_template_get_response_data->ad_account_id = NULL;
    }
    if (targeting_template_get_response_data->sizing) {
        targeting_template_audience_sizing_free(targeting_template_get_response_data->sizing);
        targeting_template_get_response_data->sizing = NULL;
    }
    free(targeting_template_get_response_data);
}

cJSON *targeting_template_get_response_data_convertToJSON(targeting_template_get_response_data_t *targeting_template_get_response_data) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_get_response_data->name
    if(targeting_template_get_response_data->name) {
    if(cJSON_AddStringToObject(item, "name", targeting_template_get_response_data->name) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template_get_response_data->auto_targeting_enabled
    if(targeting_template_get_response_data->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", targeting_template_get_response_data->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // targeting_template_get_response_data->targeting_attributes
    if(targeting_template_get_response_data->targeting_attributes) {
    cJSON *targeting_attributes_local_JSON = targeting_spec_convertToJSON(targeting_template_get_response_data->targeting_attributes);
    if(targeting_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_attributes", targeting_attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // targeting_template_get_response_data->placement_group
    if(targeting_template_get_response_data->placement_group != pinterest_rest_api_targeting_template_get_response_data__NULL) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(targeting_template_get_response_data->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // targeting_template_get_response_data->keywords
    if(targeting_template_get_response_data->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (targeting_template_get_response_data->keywords) {
    list_ForEach(keywordsListEntry, targeting_template_get_response_data->keywords) {
    cJSON *itemLocal = targeting_template_keyword_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }


    // targeting_template_get_response_data->tracking_urls
    if(targeting_template_get_response_data->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(targeting_template_get_response_data->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // targeting_template_get_response_data->id
    if(targeting_template_get_response_data->id) {
    if(cJSON_AddStringToObject(item, "id", targeting_template_get_response_data->id) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template_get_response_data->created_time
    if(targeting_template_get_response_data->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", targeting_template_get_response_data->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template_get_response_data->updated_time
    if(targeting_template_get_response_data->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", targeting_template_get_response_data->updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template_get_response_data->ad_account_id
    if(targeting_template_get_response_data->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", targeting_template_get_response_data->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template_get_response_data->status
    if(targeting_template_get_response_data->status != pinterest_rest_api_targeting_template_get_response_data_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", statustargeting_template_get_response_data_ToString(targeting_template_get_response_data->status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // targeting_template_get_response_data->sizing
    if(targeting_template_get_response_data->sizing) {
    cJSON *sizing_local_JSON = targeting_template_audience_sizing_convertToJSON(targeting_template_get_response_data->sizing);
    if(sizing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sizing", sizing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // targeting_template_get_response_data->valid
    if(targeting_template_get_response_data->valid) {
    if(cJSON_AddBoolToObject(item, "valid", targeting_template_get_response_data->valid) == NULL) {
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

targeting_template_get_response_data_t *targeting_template_get_response_data_parseFromJSON(cJSON *targeting_template_get_response_dataJSON){

    targeting_template_get_response_data_t *targeting_template_get_response_data_local_var = NULL;

    // define the local variable for targeting_template_get_response_data->targeting_attributes
    targeting_spec_t *targeting_attributes_local_nonprim = NULL;

    // define the local variable for targeting_template_get_response_data->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local list for targeting_template_get_response_data->keywords
    list_t *keywordsList = NULL;

    // define the local variable for targeting_template_get_response_data->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for targeting_template_get_response_data->sizing
    targeting_template_audience_sizing_t *sizing_local_nonprim = NULL;

    // targeting_template_get_response_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // targeting_template_get_response_data->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "auto_targeting_enabled");
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    }

    // targeting_template_get_response_data->targeting_attributes
    cJSON *targeting_attributes = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "targeting_attributes");
    if (targeting_attributes) { 
    targeting_attributes_local_nonprim = targeting_spec_parseFromJSON(targeting_attributes); //nonprimitive
    }

    // targeting_template_get_response_data->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "placement_group");
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // targeting_template_get_response_data->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "keywords");
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

    // targeting_template_get_response_data->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "tracking_urls");
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // targeting_template_get_response_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // targeting_template_get_response_data->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // targeting_template_get_response_data->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "updated_time");
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }

    // targeting_template_get_response_data->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // targeting_template_get_response_data->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "status");
    pinterest_rest_api_targeting_template_get_response_data_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = targeting_template_get_response_data_status_FromString(status->valuestring);
    }

    // targeting_template_get_response_data->sizing
    cJSON *sizing = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "sizing");
    if (sizing) { 
    sizing_local_nonprim = targeting_template_audience_sizing_parseFromJSON(sizing); //nonprimitive
    }

    // targeting_template_get_response_data->valid
    cJSON *valid = cJSON_GetObjectItemCaseSensitive(targeting_template_get_response_dataJSON, "valid");
    if (valid) { 
    if(!cJSON_IsBool(valid))
    {
    goto end; //Bool
    }
    }


    targeting_template_get_response_data_local_var = targeting_template_get_response_data_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        auto_targeting_enabled ? auto_targeting_enabled->valueint : 0,
        targeting_attributes ? targeting_attributes_local_nonprim : NULL,
        placement_group ? placement_group_local_nonprim : NULL,
        keywords ? keywordsList : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0,
        updated_time ? updated_time->valuedouble : 0,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        status ? statusVariable : pinterest_rest_api_targeting_template_get_response_data_STATUS_NULL,
        sizing ? sizing_local_nonprim : NULL,
        valid ? valid->valueint : 0
        );

    return targeting_template_get_response_data_local_var;
end:
    if (targeting_attributes_local_nonprim) {
        targeting_spec_free(targeting_attributes_local_nonprim);
        targeting_attributes_local_nonprim = NULL;
    }
    if (placement_group_local_nonprim) {
        placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
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
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (sizing_local_nonprim) {
        targeting_template_audience_sizing_free(sizing_local_nonprim);
        sizing_local_nonprim = NULL;
    }
    return NULL;

}
