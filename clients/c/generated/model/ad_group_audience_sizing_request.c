#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_audience_sizing_request.h"


char* ad_group_audience_sizing_request_creative_types_ToString(pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_e creative_types) {
    char *creative_typesArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    return creative_typesArray[creative_types - 1];
}

pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_e ad_group_audience_sizing_request_creative_types_FromString(char* creative_types) {
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

ad_group_audience_sizing_request_t *ad_group_audience_sizing_request_create(
    int auto_targeting_enabled,
    placement_group_type_t *placement_group,
    list_t *creative_types,
    targeting_spec_t *targeting_spec,
    list_t *product_group_ids,
    list_t *keywords
    ) {
    ad_group_audience_sizing_request_t *ad_group_audience_sizing_request_local_var = malloc(sizeof(ad_group_audience_sizing_request_t));
    if (!ad_group_audience_sizing_request_local_var) {
        return NULL;
    }
    ad_group_audience_sizing_request_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_audience_sizing_request_local_var->placement_group = placement_group;
    ad_group_audience_sizing_request_local_var->creative_types = creative_types;
    ad_group_audience_sizing_request_local_var->targeting_spec = targeting_spec;
    ad_group_audience_sizing_request_local_var->product_group_ids = product_group_ids;
    ad_group_audience_sizing_request_local_var->keywords = keywords;

    return ad_group_audience_sizing_request_local_var;
}


void ad_group_audience_sizing_request_free(ad_group_audience_sizing_request_t *ad_group_audience_sizing_request) {
    if(NULL == ad_group_audience_sizing_request){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_audience_sizing_request->placement_group) {
        placement_group_type_free(ad_group_audience_sizing_request->placement_group);
        ad_group_audience_sizing_request->placement_group = NULL;
    }
    if (ad_group_audience_sizing_request->creative_types) {
        list_ForEach(listEntry, ad_group_audience_sizing_request->creative_types) {
            free(listEntry->data);
        }
        list_freeList(ad_group_audience_sizing_request->creative_types);
        ad_group_audience_sizing_request->creative_types = NULL;
    }
    if (ad_group_audience_sizing_request->targeting_spec) {
        targeting_spec_free(ad_group_audience_sizing_request->targeting_spec);
        ad_group_audience_sizing_request->targeting_spec = NULL;
    }
    if (ad_group_audience_sizing_request->product_group_ids) {
        list_ForEach(listEntry, ad_group_audience_sizing_request->product_group_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_audience_sizing_request->product_group_ids);
        ad_group_audience_sizing_request->product_group_ids = NULL;
    }
    if (ad_group_audience_sizing_request->keywords) {
        list_ForEach(listEntry, ad_group_audience_sizing_request->keywords) {
            ad_group_audience_sizing_request_keywords_inner_free(listEntry->data);
        }
        list_freeList(ad_group_audience_sizing_request->keywords);
        ad_group_audience_sizing_request->keywords = NULL;
    }
    free(ad_group_audience_sizing_request);
}

cJSON *ad_group_audience_sizing_request_convertToJSON(ad_group_audience_sizing_request_t *ad_group_audience_sizing_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_audience_sizing_request->auto_targeting_enabled
    if(ad_group_audience_sizing_request->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", ad_group_audience_sizing_request->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_audience_sizing_request->placement_group
    if(ad_group_audience_sizing_request->placement_group) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(ad_group_audience_sizing_request->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_audience_sizing_request->creative_types
    if(ad_group_audience_sizing_request->creative_types != pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_NULL) {
    cJSON *creative_types = cJSON_AddArrayToObject(item, "creative_types");
    if(creative_types == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *creative_typesListEntry;
    list_ForEach(creative_typesListEntry, ad_group_audience_sizing_request->creative_types) {
    if(cJSON_AddStringToObject(creative_types, "", (char*)creative_typesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_audience_sizing_request->targeting_spec
    if(ad_group_audience_sizing_request->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_convertToJSON(ad_group_audience_sizing_request->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_audience_sizing_request->product_group_ids
    if(ad_group_audience_sizing_request->product_group_ids) {
    cJSON *product_group_ids = cJSON_AddArrayToObject(item, "product_group_ids");
    if(product_group_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_group_idsListEntry;
    list_ForEach(product_group_idsListEntry, ad_group_audience_sizing_request->product_group_ids) {
    if(cJSON_AddStringToObject(product_group_ids, "", (char*)product_group_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_audience_sizing_request->keywords
    if(ad_group_audience_sizing_request->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (ad_group_audience_sizing_request->keywords) {
    list_ForEach(keywordsListEntry, ad_group_audience_sizing_request->keywords) {
    cJSON *itemLocal = ad_group_audience_sizing_request_keywords_inner_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_group_audience_sizing_request_t *ad_group_audience_sizing_request_parseFromJSON(cJSON *ad_group_audience_sizing_requestJSON){

    ad_group_audience_sizing_request_t *ad_group_audience_sizing_request_local_var = NULL;

    // define the local variable for ad_group_audience_sizing_request->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local list for ad_group_audience_sizing_request->creative_types
    list_t *creative_typesList = NULL;

    // define the local variable for ad_group_audience_sizing_request->targeting_spec
    targeting_spec_t *targeting_spec_local_nonprim = NULL;

    // define the local list for ad_group_audience_sizing_request->product_group_ids
    list_t *product_group_idsList = NULL;

    // define the local list for ad_group_audience_sizing_request->keywords
    list_t *keywordsList = NULL;

    // ad_group_audience_sizing_request->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_requestJSON, "auto_targeting_enabled");
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    }

    // ad_group_audience_sizing_request->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_requestJSON, "placement_group");
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_audience_sizing_request->creative_types
    cJSON *creative_types = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_requestJSON, "creative_types");
    if (creative_types) { 
    cJSON *creative_types_local = NULL;
    if(!cJSON_IsArray(creative_types)) {
        goto end;//primitive container
    }
    creative_typesList = list_createList();

    cJSON_ArrayForEach(creative_types_local, creative_types)
    {
        if(!cJSON_IsString(creative_types_local))
        {
            goto end;
        }
        list_addElement(creative_typesList , strdup(creative_types_local->valuestring));
    }
    }

    // ad_group_audience_sizing_request->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_requestJSON, "targeting_spec");
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_parseFromJSON(targeting_spec); //nonprimitive
    }

    // ad_group_audience_sizing_request->product_group_ids
    cJSON *product_group_ids = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_requestJSON, "product_group_ids");
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

    // ad_group_audience_sizing_request->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_requestJSON, "keywords");
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
        ad_group_audience_sizing_request_keywords_inner_t *keywordsItem = ad_group_audience_sizing_request_keywords_inner_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }


    ad_group_audience_sizing_request_local_var = ad_group_audience_sizing_request_create (
        auto_targeting_enabled ? auto_targeting_enabled->valueint : 0,
        placement_group ? placement_group_local_nonprim : NULL,
        creative_types ? creative_typesList : NULL,
        targeting_spec ? targeting_spec_local_nonprim : NULL,
        product_group_ids ? product_group_idsList : NULL,
        keywords ? keywordsList : NULL
        );

    return ad_group_audience_sizing_request_local_var;
end:
    if (placement_group_local_nonprim) {
        placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
    }
    if (creative_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, creative_typesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(creative_typesList);
        creative_typesList = NULL;
    }
    if (targeting_spec_local_nonprim) {
        targeting_spec_free(targeting_spec_local_nonprim);
        targeting_spec_local_nonprim = NULL;
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
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            ad_group_audience_sizing_request_keywords_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
