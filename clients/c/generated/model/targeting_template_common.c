#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_common.h"


char* targeting_template_common_placement_group_ToString(pinterest_rest_api_targeting_template_common__e placement_group) {
    char* placement_groupArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    return placement_groupArray[placement_group];
}

pinterest_rest_api_targeting_template_common__e targeting_template_common_placement_group_FromString(char* placement_group){
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

targeting_template_common_t *targeting_template_common_create(
    char *name,
    int auto_targeting_enabled,
    targeting_spec_t *targeting_attributes,
    placement_group_type_t *placement_group,
    list_t *keywords,
    tracking_urls_t *tracking_urls
    ) {
    targeting_template_common_t *targeting_template_common_local_var = malloc(sizeof(targeting_template_common_t));
    if (!targeting_template_common_local_var) {
        return NULL;
    }
    targeting_template_common_local_var->name = name;
    targeting_template_common_local_var->auto_targeting_enabled = auto_targeting_enabled;
    targeting_template_common_local_var->targeting_attributes = targeting_attributes;
    targeting_template_common_local_var->placement_group = placement_group;
    targeting_template_common_local_var->keywords = keywords;
    targeting_template_common_local_var->tracking_urls = tracking_urls;

    return targeting_template_common_local_var;
}


void targeting_template_common_free(targeting_template_common_t *targeting_template_common) {
    if(NULL == targeting_template_common){
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_common->name) {
        free(targeting_template_common->name);
        targeting_template_common->name = NULL;
    }
    if (targeting_template_common->targeting_attributes) {
        targeting_spec_free(targeting_template_common->targeting_attributes);
        targeting_template_common->targeting_attributes = NULL;
    }
    if (targeting_template_common->placement_group) {
        placement_group_type_free(targeting_template_common->placement_group);
        targeting_template_common->placement_group = NULL;
    }
    if (targeting_template_common->keywords) {
        list_ForEach(listEntry, targeting_template_common->keywords) {
            targeting_template_keyword_free(listEntry->data);
        }
        list_freeList(targeting_template_common->keywords);
        targeting_template_common->keywords = NULL;
    }
    if (targeting_template_common->tracking_urls) {
        tracking_urls_free(targeting_template_common->tracking_urls);
        targeting_template_common->tracking_urls = NULL;
    }
    free(targeting_template_common);
}

cJSON *targeting_template_common_convertToJSON(targeting_template_common_t *targeting_template_common) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_common->name
    if(targeting_template_common->name) {
    if(cJSON_AddStringToObject(item, "name", targeting_template_common->name) == NULL) {
    goto fail; //String
    }
    }


    // targeting_template_common->auto_targeting_enabled
    if(targeting_template_common->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", targeting_template_common->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // targeting_template_common->targeting_attributes
    if(targeting_template_common->targeting_attributes) {
    cJSON *targeting_attributes_local_JSON = targeting_spec_convertToJSON(targeting_template_common->targeting_attributes);
    if(targeting_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_attributes", targeting_attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // targeting_template_common->placement_group
    if(targeting_template_common->placement_group != pinterest_rest_api_targeting_template_common__NULL) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(targeting_template_common->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // targeting_template_common->keywords
    if(targeting_template_common->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (targeting_template_common->keywords) {
    list_ForEach(keywordsListEntry, targeting_template_common->keywords) {
    cJSON *itemLocal = targeting_template_keyword_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }


    // targeting_template_common->tracking_urls
    if(targeting_template_common->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(targeting_template_common->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
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

targeting_template_common_t *targeting_template_common_parseFromJSON(cJSON *targeting_template_commonJSON){

    targeting_template_common_t *targeting_template_common_local_var = NULL;

    // define the local variable for targeting_template_common->targeting_attributes
    targeting_spec_t *targeting_attributes_local_nonprim = NULL;

    // define the local variable for targeting_template_common->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local list for targeting_template_common->keywords
    list_t *keywordsList = NULL;

    // define the local variable for targeting_template_common->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // targeting_template_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(targeting_template_commonJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // targeting_template_common->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(targeting_template_commonJSON, "auto_targeting_enabled");
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    }

    // targeting_template_common->targeting_attributes
    cJSON *targeting_attributes = cJSON_GetObjectItemCaseSensitive(targeting_template_commonJSON, "targeting_attributes");
    if (targeting_attributes) { 
    targeting_attributes_local_nonprim = targeting_spec_parseFromJSON(targeting_attributes); //nonprimitive
    }

    // targeting_template_common->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(targeting_template_commonJSON, "placement_group");
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // targeting_template_common->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(targeting_template_commonJSON, "keywords");
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

    // targeting_template_common->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(targeting_template_commonJSON, "tracking_urls");
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }


    targeting_template_common_local_var = targeting_template_common_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        auto_targeting_enabled ? auto_targeting_enabled->valueint : 0,
        targeting_attributes ? targeting_attributes_local_nonprim : NULL,
        placement_group ? placement_group_local_nonprim : NULL,
        keywords ? keywordsList : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL
        );

    return targeting_template_common_local_var;
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
    return NULL;

}
