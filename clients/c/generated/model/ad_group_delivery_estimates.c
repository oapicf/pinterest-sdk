#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_delivery_estimates.h"


char* ad_group_delivery_estimates_creative_types_ToString(pinterest_rest_api_ad_group_delivery_estimates__e creative_types) {
    char *creative_typesArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    return creative_typesArray[creative_types - 1];
}

pinterest_rest_api_ad_group_delivery_estimates__e ad_group_delivery_estimates_creative_types_FromString(char* creative_types) {
    int stringToReturn = 0;
    char *creative_typesArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    size_t sizeofArray = sizeof(creative_typesArray) / sizeof(creative_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(creative_types, creative_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_group_delivery_estimates_t *ad_group_delivery_estimates_create_internal(
    int *auto_targeting_enabled,
    list_t *creative_types,
    list_t *keywords,
    int *monthly_frequency_cap,
    optimization_goal_metadata_t *optimization_goal_metadata,
    optimization_type_t *optimization_type,
    pinterest_rest_api_placement_group_type__e placement_group,
    list_t *product_group_ids,
    targeting_spec_optimal_t *targeting_spec
    ) {
    ad_group_delivery_estimates_t *ad_group_delivery_estimates_local_var = malloc(sizeof(ad_group_delivery_estimates_t));
    if (!ad_group_delivery_estimates_local_var) {
        return NULL;
    }
    memset(ad_group_delivery_estimates_local_var, 0, sizeof(ad_group_delivery_estimates_t));
    ad_group_delivery_estimates_local_var->_library_owned = 1;
    ad_group_delivery_estimates_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_delivery_estimates_local_var->creative_types = creative_types;
    ad_group_delivery_estimates_local_var->keywords = keywords;
    ad_group_delivery_estimates_local_var->monthly_frequency_cap = monthly_frequency_cap;
    ad_group_delivery_estimates_local_var->optimization_goal_metadata = optimization_goal_metadata;
    ad_group_delivery_estimates_local_var->optimization_type = optimization_type;
    ad_group_delivery_estimates_local_var->placement_group = placement_group;
    ad_group_delivery_estimates_local_var->product_group_ids = product_group_ids;
    ad_group_delivery_estimates_local_var->targeting_spec = targeting_spec;
    return ad_group_delivery_estimates_local_var;
}

__attribute__((deprecated)) ad_group_delivery_estimates_t *ad_group_delivery_estimates_create(
    int *auto_targeting_enabled,
    list_t *creative_types,
    list_t *keywords,
    int *monthly_frequency_cap,
    optimization_goal_metadata_t *optimization_goal_metadata,
    optimization_type_t *optimization_type,
    pinterest_rest_api_placement_group_type__e placement_group,
    list_t *product_group_ids,
    targeting_spec_optimal_t *targeting_spec
    ) {
    int *auto_targeting_enabled_copy = NULL;
    if (auto_targeting_enabled) {
        auto_targeting_enabled_copy = malloc(sizeof(int));
        if (auto_targeting_enabled_copy) *auto_targeting_enabled_copy = *auto_targeting_enabled;
    }
    int *monthly_frequency_cap_copy = NULL;
    if (monthly_frequency_cap) {
        monthly_frequency_cap_copy = malloc(sizeof(int));
        if (monthly_frequency_cap_copy) *monthly_frequency_cap_copy = *monthly_frequency_cap;
    }
    ad_group_delivery_estimates_t *result = ad_group_delivery_estimates_create_internal (
        auto_targeting_enabled_copy,
        creative_types,
        keywords,
        monthly_frequency_cap_copy,
        optimization_goal_metadata,
        optimization_type,
        placement_group,
        product_group_ids,
        targeting_spec
        );
    if (!result) {
        free(auto_targeting_enabled_copy);
        free(monthly_frequency_cap_copy);
    }
    return result;
}

void ad_group_delivery_estimates_free(ad_group_delivery_estimates_t *ad_group_delivery_estimates) {
    if(NULL == ad_group_delivery_estimates){
        return ;
    }
    if(ad_group_delivery_estimates->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_delivery_estimates_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_delivery_estimates->auto_targeting_enabled) {
        free(ad_group_delivery_estimates->auto_targeting_enabled);
        ad_group_delivery_estimates->auto_targeting_enabled = NULL;
    }
    if (ad_group_delivery_estimates->creative_types) {
        list_ForEach(listEntry, ad_group_delivery_estimates->creative_types) {
            ad_group_audience_sizing_creative_types_free(listEntry->data);
        }
        list_freeList(ad_group_delivery_estimates->creative_types);
        ad_group_delivery_estimates->creative_types = NULL;
    }
    if (ad_group_delivery_estimates->keywords) {
        list_ForEach(listEntry, ad_group_delivery_estimates->keywords) {
            ad_group_delivery_estimates_keywords_items_free(listEntry->data);
        }
        list_freeList(ad_group_delivery_estimates->keywords);
        ad_group_delivery_estimates->keywords = NULL;
    }
    if (ad_group_delivery_estimates->monthly_frequency_cap) {
        free(ad_group_delivery_estimates->monthly_frequency_cap);
        ad_group_delivery_estimates->monthly_frequency_cap = NULL;
    }
    if (ad_group_delivery_estimates->optimization_goal_metadata) {
        optimization_goal_metadata_free(ad_group_delivery_estimates->optimization_goal_metadata);
        ad_group_delivery_estimates->optimization_goal_metadata = NULL;
    }
    if (ad_group_delivery_estimates->optimization_type) {
        optimization_type_free(ad_group_delivery_estimates->optimization_type);
        ad_group_delivery_estimates->optimization_type = NULL;
    }
    if (ad_group_delivery_estimates->product_group_ids) {
        list_ForEach(listEntry, ad_group_delivery_estimates->product_group_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_delivery_estimates->product_group_ids);
        ad_group_delivery_estimates->product_group_ids = NULL;
    }
    if (ad_group_delivery_estimates->targeting_spec) {
        targeting_spec_optimal_free(ad_group_delivery_estimates->targeting_spec);
        ad_group_delivery_estimates->targeting_spec = NULL;
    }
    free(ad_group_delivery_estimates);
}

cJSON *ad_group_delivery_estimates_convertToJSON(ad_group_delivery_estimates_t *ad_group_delivery_estimates) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_delivery_estimates->auto_targeting_enabled
    if(ad_group_delivery_estimates->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", *ad_group_delivery_estimates->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_delivery_estimates->creative_types
    if(ad_group_delivery_estimates->creative_types != pinterest_rest_api_list_CREATIVETYPES_NULL) {
    cJSON *creative_types = cJSON_AddArrayToObject(item, "creative_types");
    if(creative_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *creative_typesListEntry;
    if (ad_group_delivery_estimates->creative_types) {
    list_ForEach(creative_typesListEntry, ad_group_delivery_estimates->creative_types) {
    cJSON *itemLocal = ad_group_audience_sizing_creative_types_convertToJSON((pinterest_rest_api_ad_group_delivery_estimates__e)creative_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(creative_types, itemLocal);
    }
    }
    }


    // ad_group_delivery_estimates->keywords
    if(ad_group_delivery_estimates->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (ad_group_delivery_estimates->keywords) {
    list_ForEach(keywordsListEntry, ad_group_delivery_estimates->keywords) {
    cJSON *itemLocal = ad_group_delivery_estimates_keywords_items_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }


    // ad_group_delivery_estimates->monthly_frequency_cap
    if(ad_group_delivery_estimates->monthly_frequency_cap) {
    if(cJSON_AddNumberToObject(item, "monthly_frequency_cap", *ad_group_delivery_estimates->monthly_frequency_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_delivery_estimates->optimization_goal_metadata
    if(ad_group_delivery_estimates->optimization_goal_metadata) {
    cJSON *optimization_goal_metadata_local_JSON = optimization_goal_metadata_convertToJSON(ad_group_delivery_estimates->optimization_goal_metadata);
    if(optimization_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimization_goal_metadata", optimization_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_delivery_estimates->optimization_type
    if(ad_group_delivery_estimates->optimization_type) {
    cJSON *optimization_type_local_JSON = optimization_type_convertToJSON(ad_group_delivery_estimates->optimization_type);
    if(optimization_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "optimization_type", optimization_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_delivery_estimates->placement_group
    if(ad_group_delivery_estimates->placement_group != pinterest_rest_api_placement_group_type__NULL) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(ad_group_delivery_estimates->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_delivery_estimates->product_group_ids
    if(ad_group_delivery_estimates->product_group_ids) {
    cJSON *product_group_ids = cJSON_AddArrayToObject(item, "product_group_ids");
    if(product_group_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_group_idsListEntry;
    list_ForEach(product_group_idsListEntry, ad_group_delivery_estimates->product_group_ids) {
    if(cJSON_AddStringToObject(product_group_ids, "", product_group_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_delivery_estimates->targeting_spec
    if(ad_group_delivery_estimates->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_optimal_convertToJSON(ad_group_delivery_estimates->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
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

ad_group_delivery_estimates_t *ad_group_delivery_estimates_parseFromJSON(cJSON *ad_group_delivery_estimatesJSON){

    ad_group_delivery_estimates_t *ad_group_delivery_estimates_local_var = NULL;

    // define the local variable for ad_group_delivery_estimates->auto_targeting_enabled
    int *auto_targeting_enabled_local_var = NULL;

    // define the local list for ad_group_delivery_estimates->creative_types
    list_t *creative_typesList = NULL;

    // define the local list for ad_group_delivery_estimates->keywords
    list_t *keywordsList = NULL;

    // define the local variable for ad_group_delivery_estimates->monthly_frequency_cap
    int *monthly_frequency_cap_local_var = NULL;

    // define the local variable for ad_group_delivery_estimates->optimization_goal_metadata
    optimization_goal_metadata_t *optimization_goal_metadata_local_nonprim = NULL;

    // define the local variable for ad_group_delivery_estimates->optimization_type
    optimization_type_t *optimization_type_local_nonprim = NULL;

    // define the local variable for ad_group_delivery_estimates->placement_group
    pinterest_rest_api_placement_group_type__e placement_group_local_nonprim = 0;

    // define the local list for ad_group_delivery_estimates->product_group_ids
    list_t *product_group_idsList = NULL;

    // define the local variable for ad_group_delivery_estimates->targeting_spec
    targeting_spec_optimal_t *targeting_spec_local_nonprim = NULL;

    // ad_group_delivery_estimates->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "auto_targeting_enabled");
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

    // ad_group_delivery_estimates->creative_types
    cJSON *creative_types = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "creative_types");
    if (cJSON_IsNull(creative_types)) {
        creative_types = NULL;
    }
    if (creative_types) { 
    cJSON *creative_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(creative_types)){
        goto end; //nonprimitive container
    }

    creative_typesList = list_createList();

    cJSON_ArrayForEach(creative_types_local_nonprimitive,creative_types )
    {
        if(!cJSON_IsObject(creative_types_local_nonprimitive)){
            goto end;
        }
        ad_group_delivery_estimates_ad_group_audience_sizing_creative_types_e creative_typesItem = ad_group_audience_sizing_creative_types_parseFromJSON(creative_types_local_nonprimitive);

        list_addElement(creative_typesList, (void *)creative_typesItem);
    }
    }

    // ad_group_delivery_estimates->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "keywords");
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
        ad_group_delivery_estimates_keywords_items_t *keywordsItem = ad_group_delivery_estimates_keywords_items_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }

    // ad_group_delivery_estimates->monthly_frequency_cap
    cJSON *monthly_frequency_cap = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "monthly_frequency_cap");
    if (cJSON_IsNull(monthly_frequency_cap)) {
        monthly_frequency_cap = NULL;
    }
    if (monthly_frequency_cap) { 
    if(!cJSON_IsNumber(monthly_frequency_cap))
    {
    goto end; //Numeric
    }
    monthly_frequency_cap_local_var = malloc(sizeof(int));
    if(!monthly_frequency_cap_local_var)
    {
        goto end;
    }
    *monthly_frequency_cap_local_var = monthly_frequency_cap->valuedouble;
    }

    // ad_group_delivery_estimates->optimization_goal_metadata
    cJSON *optimization_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "optimization_goal_metadata");
    if (cJSON_IsNull(optimization_goal_metadata)) {
        optimization_goal_metadata = NULL;
    }
    if (optimization_goal_metadata) { 
    optimization_goal_metadata_local_nonprim = optimization_goal_metadata_parseFromJSON(optimization_goal_metadata); //nonprimitive
    }

    // ad_group_delivery_estimates->optimization_type
    cJSON *optimization_type = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "optimization_type");
    if (cJSON_IsNull(optimization_type)) {
        optimization_type = NULL;
    }
    if (optimization_type) { 
    optimization_type_local_nonprim = optimization_type_parseFromJSON(optimization_type); //custom
    }

    // ad_group_delivery_estimates->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "placement_group");
    if (cJSON_IsNull(placement_group)) {
        placement_group = NULL;
    }
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_delivery_estimates->product_group_ids
    cJSON *product_group_ids = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "product_group_ids");
    if (cJSON_IsNull(product_group_ids)) {
        product_group_ids = NULL;
    }
    if (product_group_ids) { 
    cJSON *product_group_ids_local = NULL;
    if(!cJSON_IsArray(product_group_ids)) {
        goto end;//primitive container
    }
    product_group_idsList = list_createList();

    cJSON_ArrayForEach(product_group_ids_local, product_group_ids)
    {
        if(!cJSON_IsString(product_group_ids_local))
        {
            goto end;
        }
        list_addElement(product_group_idsList , strdup(product_group_ids_local->valuestring));
    }
    }

    // ad_group_delivery_estimates->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_delivery_estimatesJSON, "targeting_spec");
    if (cJSON_IsNull(targeting_spec)) {
        targeting_spec = NULL;
    }
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_optimal_parseFromJSON(targeting_spec); //nonprimitive
    }



    ad_group_delivery_estimates_local_var = ad_group_delivery_estimates_create_internal (
        auto_targeting_enabled_local_var,
        creative_types ? creative_typesList : NULL,
        keywords ? keywordsList : NULL,
        monthly_frequency_cap_local_var,
        optimization_goal_metadata ? optimization_goal_metadata_local_nonprim : NULL,
        optimization_type ? optimization_type_local_nonprim : NULL,
        placement_group ? placement_group_local_nonprim : 0,
        product_group_ids ? product_group_idsList : NULL,
        targeting_spec ? targeting_spec_local_nonprim : NULL
        );

    if (!ad_group_delivery_estimates_local_var) {
        goto end;
    }

    return ad_group_delivery_estimates_local_var;
end:
    if (auto_targeting_enabled_local_var) {
        free(auto_targeting_enabled_local_var);
        auto_targeting_enabled_local_var = NULL;
    }
    if (creative_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, creative_typesList) {
            ad_group_audience_sizing_creative_types_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(creative_typesList);
        creative_typesList = NULL;
    }
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            ad_group_delivery_estimates_keywords_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    if (monthly_frequency_cap_local_var) {
        free(monthly_frequency_cap_local_var);
        monthly_frequency_cap_local_var = NULL;
    }
    if (optimization_goal_metadata_local_nonprim) {
        optimization_goal_metadata_free(optimization_goal_metadata_local_nonprim);
        optimization_goal_metadata_local_nonprim = NULL;
    }
    if (optimization_type_local_nonprim) {
        optimization_type_free(optimization_type_local_nonprim);
        optimization_type_local_nonprim = NULL;
    }
    if (placement_group_local_nonprim) {
        placement_group_local_nonprim = 0;
    }
    if (product_group_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_group_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_group_idsList);
        product_group_idsList = NULL;
    }
    if (targeting_spec_local_nonprim) {
        targeting_spec_optimal_free(targeting_spec_local_nonprim);
        targeting_spec_local_nonprim = NULL;
    }
    return NULL;

}
