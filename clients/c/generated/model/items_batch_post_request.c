#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "items_batch_post_request.h"


char* items_batch_post_request_catalog_type_ToString(pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e items_batch_post_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* items_batch_post_request_language_ToString(pinterest_rest_api_items_batch_post_request_LANGUAGE_e language) {
    char* languageArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    return languageArray[language];
}

pinterest_rest_api_items_batch_post_request_LANGUAGE_e items_batch_post_request_language_FromString(char* language){
    int stringToReturn = 0;
    char *languageArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    size_t sizeofArray = sizeof(languageArray) / sizeof(languageArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(language, languageArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static items_batch_post_request_t *items_batch_post_request_create_internal(
    char *catalog_id,
    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_items_batch_post_request_LANGUAGE_e language,
    pinterest_rest_api_batch_operation__e operation
    ) {
    items_batch_post_request_t *items_batch_post_request_local_var = malloc(sizeof(items_batch_post_request_t));
    if (!items_batch_post_request_local_var) {
        return NULL;
    }
    items_batch_post_request_local_var->catalog_id = catalog_id;
    items_batch_post_request_local_var->catalog_type = catalog_type;
    items_batch_post_request_local_var->country = country;
    items_batch_post_request_local_var->items = items;
    items_batch_post_request_local_var->language = language;
    items_batch_post_request_local_var->operation = operation;

    items_batch_post_request_local_var->_library_owned = 1;
    return items_batch_post_request_local_var;
}

__attribute__((deprecated)) items_batch_post_request_t *items_batch_post_request_create(
    char *catalog_id,
    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_items_batch_post_request_LANGUAGE_e language,
    pinterest_rest_api_batch_operation__e operation
    ) {
    return items_batch_post_request_create_internal (
        catalog_id,
        catalog_type,
        country,
        items,
        language,
        operation
        );
}

void items_batch_post_request_free(items_batch_post_request_t *items_batch_post_request) {
    if(NULL == items_batch_post_request){
        return ;
    }
    if(items_batch_post_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "items_batch_post_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (items_batch_post_request->catalog_id) {
        free(items_batch_post_request->catalog_id);
        items_batch_post_request->catalog_id = NULL;
    }
    if (items_batch_post_request->items) {
        list_ForEach(listEntry, items_batch_post_request->items) {
            item_delete_batch_record_free(listEntry->data);
        }
        list_freeList(items_batch_post_request->items);
        items_batch_post_request->items = NULL;
    }
    free(items_batch_post_request);
}

cJSON *items_batch_post_request_convertToJSON(items_batch_post_request_t *items_batch_post_request) {
    cJSON *item = cJSON_CreateObject();

    // items_batch_post_request->catalog_id
    if(items_batch_post_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", items_batch_post_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // items_batch_post_request->catalog_type
    if (pinterest_rest_api_items_batch_post_request_CATALOGTYPE_NULL == items_batch_post_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", items_batch_post_request_catalog_type_ToString(items_batch_post_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // items_batch_post_request->country
    if (pinterest_rest_api_country__NULL == items_batch_post_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(items_batch_post_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // items_batch_post_request->items
    if (!items_batch_post_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (items_batch_post_request->items) {
    list_ForEach(itemsListEntry, items_batch_post_request->items) {
    cJSON *itemLocal = item_delete_batch_record_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // items_batch_post_request->language
    if (pinterest_rest_api_items_batch_post_request_LANGUAGE_NULL == items_batch_post_request->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", items_batch_post_request_language_ToString(items_batch_post_request->language)) == NULL)
    {
    goto fail; //Enum
    }


    // items_batch_post_request->operation
    if (pinterest_rest_api_batch_operation__NULL == items_batch_post_request->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = batch_operation_convertToJSON(items_batch_post_request->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

items_batch_post_request_t *items_batch_post_request_parseFromJSON(cJSON *items_batch_post_requestJSON){

    items_batch_post_request_t *items_batch_post_request_local_var = NULL;

    // define the local variable for items_batch_post_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local list for items_batch_post_request->items
    list_t *itemsList = NULL;

    // define the local variable for items_batch_post_request->operation
    pinterest_rest_api_batch_operation__e operation_local_nonprim = 0;

    // items_batch_post_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // items_batch_post_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = items_batch_post_request_catalog_type_FromString(catalog_type->valuestring);

    // items_batch_post_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // items_batch_post_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        item_delete_batch_record_t *itemsItem = item_delete_batch_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // items_batch_post_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    pinterest_rest_api_items_batch_post_request_LANGUAGE_e languageVariable;
    
    if(!cJSON_IsString(language))
    {
    goto end; //Enum
    }
    languageVariable = items_batch_post_request_language_FromString(language->valuestring);

    // items_batch_post_request->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = batch_operation_parseFromJSON(operation); //custom


    items_batch_post_request_local_var = items_batch_post_request_create_internal (
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL,
        catalog_typeVariable,
        country_local_nonprim,
        itemsList,
        languageVariable,
        operation_local_nonprim
        );

    return items_batch_post_request_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_delete_batch_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
    return NULL;

}
