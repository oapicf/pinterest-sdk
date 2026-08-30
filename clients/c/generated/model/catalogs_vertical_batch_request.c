#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_vertical_batch_request.h"


char* catalogs_vertical_batch_request_catalog_type_ToString(pinterest_rest_api_catalogs_vertical_batch_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_vertical_batch_request_CATALOGTYPE_e catalogs_vertical_batch_request_catalog_type_FromString(char* catalog_type){
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
char* catalogs_vertical_batch_request_language_ToString(pinterest_rest_api_catalogs_vertical_batch_request_LANGUAGE_e language) {
    char* languageArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    return languageArray[language];
}

pinterest_rest_api_catalogs_vertical_batch_request_LANGUAGE_e catalogs_vertical_batch_request_language_FromString(char* language){
    int stringToReturn = 0;
    char *languageArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "false", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    size_t sizeofArray = sizeof(languageArray) / sizeof(languageArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(language, languageArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_vertical_batch_request_t *catalogs_vertical_batch_request_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_vertical_batch_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_catalogs_vertical_batch_request_LANGUAGE_e language
    ) {
    catalogs_vertical_batch_request_t *catalogs_vertical_batch_request_local_var = malloc(sizeof(catalogs_vertical_batch_request_t));
    if (!catalogs_vertical_batch_request_local_var) {
        return NULL;
    }
    memset(catalogs_vertical_batch_request_local_var, 0, sizeof(catalogs_vertical_batch_request_t));
    catalogs_vertical_batch_request_local_var->_library_owned = 1;
    catalogs_vertical_batch_request_local_var->catalog_id = catalog_id;
    catalogs_vertical_batch_request_local_var->catalog_type = catalog_type;
    catalogs_vertical_batch_request_local_var->country = country;
    catalogs_vertical_batch_request_local_var->items = items;
    catalogs_vertical_batch_request_local_var->language = language;
    return catalogs_vertical_batch_request_local_var;
}

__attribute__((deprecated)) catalogs_vertical_batch_request_t *catalogs_vertical_batch_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_vertical_batch_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_catalogs_vertical_batch_request_LANGUAGE_e language
    ) {
    catalogs_vertical_batch_request_t *result = catalogs_vertical_batch_request_create_internal (
        catalog_id,
        catalog_type,
        country,
        items,
        language
        );
    if (!result) {
    }
    return result;
}

void catalogs_vertical_batch_request_free(catalogs_vertical_batch_request_t *catalogs_vertical_batch_request) {
    if(NULL == catalogs_vertical_batch_request){
        return ;
    }
    if(catalogs_vertical_batch_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_vertical_batch_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_vertical_batch_request->catalog_id) {
        free(catalogs_vertical_batch_request->catalog_id);
        catalogs_vertical_batch_request->catalog_id = NULL;
    }
    if (catalogs_vertical_batch_request->items) {
        list_ForEach(listEntry, catalogs_vertical_batch_request->items) {
            catalogs_creative_assets_batch_item_free(listEntry->data);
        }
        list_freeList(catalogs_vertical_batch_request->items);
        catalogs_vertical_batch_request->items = NULL;
    }
    free(catalogs_vertical_batch_request);
}

cJSON *catalogs_vertical_batch_request_convertToJSON(catalogs_vertical_batch_request_t *catalogs_vertical_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_vertical_batch_request->catalog_id
    if(catalogs_vertical_batch_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_vertical_batch_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_batch_request->catalog_type
    if (pinterest_rest_api_catalogs_vertical_batch_request_CATALOGTYPE_NULL == catalogs_vertical_batch_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_vertical_batch_request_catalog_type_ToString(catalogs_vertical_batch_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_vertical_batch_request->country
    if (pinterest_rest_api_country__NULL == catalogs_vertical_batch_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_vertical_batch_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_vertical_batch_request->items
    if (!catalogs_vertical_batch_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_vertical_batch_request->items) {
    list_ForEach(itemsListEntry, catalogs_vertical_batch_request->items) {
    cJSON *itemLocal = catalogs_creative_assets_batch_item_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // catalogs_vertical_batch_request->language
    if (pinterest_rest_api_catalogs_vertical_batch_request_LANGUAGE_NULL == catalogs_vertical_batch_request->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", catalogs_vertical_batch_request_language_ToString(catalogs_vertical_batch_request->language)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_vertical_batch_request_t *catalogs_vertical_batch_request_parseFromJSON(cJSON *catalogs_vertical_batch_requestJSON){

    catalogs_vertical_batch_request_t *catalogs_vertical_batch_request_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_vertical_batch_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local list for catalogs_vertical_batch_request->items
    list_t *itemsList = NULL;

    // catalogs_vertical_batch_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_batch_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_batch_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_batch_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_vertical_batch_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_vertical_batch_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_vertical_batch_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_batch_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_vertical_batch_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_batch_requestJSON, "items");
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
        catalogs_creative_assets_batch_item_t *itemsItem = catalogs_creative_assets_batch_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // catalogs_vertical_batch_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_batch_requestJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    pinterest_rest_api_catalogs_vertical_batch_request_LANGUAGE_e languageVariable;
    
    if(!cJSON_IsString(language))
    {
    goto end; //Enum
    }
    languageVariable = catalogs_vertical_batch_request_language_FromString(language->valuestring);


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);

    catalogs_vertical_batch_request_local_var = catalogs_vertical_batch_request_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        country_local_nonprim,
        itemsList,
        languageVariable
        );

    if (!catalogs_vertical_batch_request_local_var) {
        goto end;
    }

    return catalogs_vertical_batch_request_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_creative_assets_batch_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
