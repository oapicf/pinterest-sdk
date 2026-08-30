#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_audience_sizing_create.h"


char* ad_group_audience_sizing_create_creative_types_ToString(pinterest_rest_api_ad_group_audience_sizing_create__e creative_types) {
    char *creative_typesArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    return creative_typesArray[creative_types - 1];
}

pinterest_rest_api_ad_group_audience_sizing_create__e ad_group_audience_sizing_create_creative_types_FromString(char* creative_types) {
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

static ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_create_internal(
    int *auto_targeting_enabled,
    list_t *creative_types,
    list_t *keywords,
    adgroup_placement_group_type_t *placement_group,
    list_t *product_group_ids,
    targeting_spec_optimal_t *targeting_spec
    ) {
    ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_local_var = malloc(sizeof(ad_group_audience_sizing_create_t));
    if (!ad_group_audience_sizing_create_local_var) {
        return NULL;
    }
    memset(ad_group_audience_sizing_create_local_var, 0, sizeof(ad_group_audience_sizing_create_t));
    ad_group_audience_sizing_create_local_var->_library_owned = 1;
    ad_group_audience_sizing_create_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_audience_sizing_create_local_var->creative_types = creative_types;
    ad_group_audience_sizing_create_local_var->keywords = keywords;
    ad_group_audience_sizing_create_local_var->placement_group = placement_group;
    ad_group_audience_sizing_create_local_var->product_group_ids = product_group_ids;
    ad_group_audience_sizing_create_local_var->targeting_spec = targeting_spec;
    return ad_group_audience_sizing_create_local_var;
}

__attribute__((deprecated)) ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_create(
    int *auto_targeting_enabled,
    list_t *creative_types,
    list_t *keywords,
    adgroup_placement_group_type_t *placement_group,
    list_t *product_group_ids,
    targeting_spec_optimal_t *targeting_spec
    ) {
    int *auto_targeting_enabled_copy = NULL;
    if (auto_targeting_enabled) {
        auto_targeting_enabled_copy = malloc(sizeof(int));
        if (auto_targeting_enabled_copy) *auto_targeting_enabled_copy = *auto_targeting_enabled;
    }
    ad_group_audience_sizing_create_t *result = ad_group_audience_sizing_create_create_internal (
        auto_targeting_enabled_copy,
        creative_types,
        keywords,
        placement_group,
        product_group_ids,
        targeting_spec
        );
    if (!result) {
        free(auto_targeting_enabled_copy);
    }
    return result;
}

void ad_group_audience_sizing_create_free(ad_group_audience_sizing_create_t *ad_group_audience_sizing_create) {
    if(NULL == ad_group_audience_sizing_create){
        return ;
    }
    if(ad_group_audience_sizing_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_audience_sizing_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_audience_sizing_create->auto_targeting_enabled) {
        free(ad_group_audience_sizing_create->auto_targeting_enabled);
        ad_group_audience_sizing_create->auto_targeting_enabled = NULL;
    }
    if (ad_group_audience_sizing_create->creative_types) {
        list_ForEach(listEntry, ad_group_audience_sizing_create->creative_types) {
            ad_group_audience_sizing_creative_types_free(listEntry->data);
        }
        list_freeList(ad_group_audience_sizing_create->creative_types);
        ad_group_audience_sizing_create->creative_types = NULL;
    }
    if (ad_group_audience_sizing_create->keywords) {
        list_ForEach(listEntry, ad_group_audience_sizing_create->keywords) {
            ad_group_audience_sizing_keyword_free(listEntry->data);
        }
        list_freeList(ad_group_audience_sizing_create->keywords);
        ad_group_audience_sizing_create->keywords = NULL;
    }
    if (ad_group_audience_sizing_create->placement_group) {
        adgroup_placement_group_type_free(ad_group_audience_sizing_create->placement_group);
        ad_group_audience_sizing_create->placement_group = NULL;
    }
    if (ad_group_audience_sizing_create->product_group_ids) {
        list_ForEach(listEntry, ad_group_audience_sizing_create->product_group_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_audience_sizing_create->product_group_ids);
        ad_group_audience_sizing_create->product_group_ids = NULL;
    }
    if (ad_group_audience_sizing_create->targeting_spec) {
        targeting_spec_optimal_free(ad_group_audience_sizing_create->targeting_spec);
        ad_group_audience_sizing_create->targeting_spec = NULL;
    }
    free(ad_group_audience_sizing_create);
}

cJSON *ad_group_audience_sizing_create_convertToJSON(ad_group_audience_sizing_create_t *ad_group_audience_sizing_create) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_audience_sizing_create->auto_targeting_enabled
    if(ad_group_audience_sizing_create->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", *ad_group_audience_sizing_create->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_audience_sizing_create->creative_types
    if(ad_group_audience_sizing_create->creative_types != pinterest_rest_api_list_CREATIVETYPES_NULL) {
    cJSON *creative_types = cJSON_AddArrayToObject(item, "creative_types");
    if(creative_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *creative_typesListEntry;
    if (ad_group_audience_sizing_create->creative_types) {
    list_ForEach(creative_typesListEntry, ad_group_audience_sizing_create->creative_types) {
    cJSON *itemLocal = ad_group_audience_sizing_creative_types_convertToJSON((pinterest_rest_api_ad_group_audience_sizing_create__e)creative_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(creative_types, itemLocal);
    }
    }
    }


    // ad_group_audience_sizing_create->keywords
    if(ad_group_audience_sizing_create->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (ad_group_audience_sizing_create->keywords) {
    list_ForEach(keywordsListEntry, ad_group_audience_sizing_create->keywords) {
    cJSON *itemLocal = ad_group_audience_sizing_keyword_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }


    // ad_group_audience_sizing_create->placement_group
    if(ad_group_audience_sizing_create->placement_group) {
    cJSON *placement_group_local_JSON = adgroup_placement_group_type_convertToJSON(ad_group_audience_sizing_create->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_audience_sizing_create->product_group_ids
    if(ad_group_audience_sizing_create->product_group_ids) {
    cJSON *product_group_ids = cJSON_AddArrayToObject(item, "product_group_ids");
    if(product_group_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_group_idsListEntry;
    list_ForEach(product_group_idsListEntry, ad_group_audience_sizing_create->product_group_ids) {
    if(cJSON_AddStringToObject(product_group_ids, "", product_group_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_audience_sizing_create->targeting_spec
    if(ad_group_audience_sizing_create->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_optimal_convertToJSON(ad_group_audience_sizing_create->targeting_spec);
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

ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_parseFromJSON(cJSON *ad_group_audience_sizing_createJSON){

    ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_local_var = NULL;

    // define the local variable for ad_group_audience_sizing_create->auto_targeting_enabled
    int *auto_targeting_enabled_local_var = NULL;

    // define the local list for ad_group_audience_sizing_create->creative_types
    list_t *creative_typesList = NULL;

    // define the local list for ad_group_audience_sizing_create->keywords
    list_t *keywordsList = NULL;

    // define the local variable for ad_group_audience_sizing_create->placement_group
    adgroup_placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local list for ad_group_audience_sizing_create->product_group_ids
    list_t *product_group_idsList = NULL;

    // define the local variable for ad_group_audience_sizing_create->targeting_spec
    targeting_spec_optimal_t *targeting_spec_local_nonprim = NULL;

    // ad_group_audience_sizing_create->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_createJSON, "auto_targeting_enabled");
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

    // ad_group_audience_sizing_create->creative_types
    cJSON *creative_types = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_createJSON, "creative_types");
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
        ad_group_audience_sizing_create_ad_group_audience_sizing_creative_types_e creative_typesItem = ad_group_audience_sizing_creative_types_parseFromJSON(creative_types_local_nonprimitive);

        list_addElement(creative_typesList, (void *)creative_typesItem);
    }
    }

    // ad_group_audience_sizing_create->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_createJSON, "keywords");
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
        ad_group_audience_sizing_keyword_t *keywordsItem = ad_group_audience_sizing_keyword_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }

    // ad_group_audience_sizing_create->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_createJSON, "placement_group");
    if (cJSON_IsNull(placement_group)) {
        placement_group = NULL;
    }
    if (placement_group) { 
    placement_group_local_nonprim = adgroup_placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_audience_sizing_create->product_group_ids
    cJSON *product_group_ids = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_createJSON, "product_group_ids");
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

    // ad_group_audience_sizing_create->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_createJSON, "targeting_spec");
    if (cJSON_IsNull(targeting_spec)) {
        targeting_spec = NULL;
    }
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_optimal_parseFromJSON(targeting_spec); //nonprimitive
    }



    ad_group_audience_sizing_create_local_var = ad_group_audience_sizing_create_create_internal (
        auto_targeting_enabled_local_var,
        creative_types ? creative_typesList : NULL,
        keywords ? keywordsList : NULL,
        placement_group ? placement_group_local_nonprim : NULL,
        product_group_ids ? product_group_idsList : NULL,
        targeting_spec ? targeting_spec_local_nonprim : NULL
        );

    if (!ad_group_audience_sizing_create_local_var) {
        goto end;
    }

    return ad_group_audience_sizing_create_local_var;
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
            ad_group_audience_sizing_keyword_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    if (placement_group_local_nonprim) {
        adgroup_placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
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
