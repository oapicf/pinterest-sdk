#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_list_products_by_catalog_based_filter_request.h"


char* catalogs_retail_list_products_by_catalog_based_filter_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalogs_retail_list_products_by_catalog_based_filter_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_list_products_by_catalog_based_filter_request_country_ToString(pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request__e catalogs_retail_list_products_by_catalog_based_filter_request_country_FromString(char* country){
    int stringToReturn = 0;
    char *countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    size_t sizeofArray = sizeof(countryArray) / sizeof(countryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(country, countryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_list_products_by_catalog_based_filter_request_locale_ToString(pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request__e locale) {
    char* localeArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW" };
    return localeArray[locale];
}

pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request__e catalogs_retail_list_products_by_catalog_based_filter_request_locale_FromString(char* locale){
    int stringToReturn = 0;
    char *localeArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW" };
    size_t sizeofArray = sizeof(localeArray) / sizeof(localeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(locale, localeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request_create(
    pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_type,
    char *catalog_id,
    catalogs_product_group_filters_t *filters,
    country_t *country,
    catalogs_locale_t *locale
    ) {
    catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request_local_var = malloc(sizeof(catalogs_retail_list_products_by_catalog_based_filter_request_t));
    if (!catalogs_retail_list_products_by_catalog_based_filter_request_local_var) {
        return NULL;
    }
    catalogs_retail_list_products_by_catalog_based_filter_request_local_var->catalog_type = catalog_type;
    catalogs_retail_list_products_by_catalog_based_filter_request_local_var->catalog_id = catalog_id;
    catalogs_retail_list_products_by_catalog_based_filter_request_local_var->filters = filters;
    catalogs_retail_list_products_by_catalog_based_filter_request_local_var->country = country;
    catalogs_retail_list_products_by_catalog_based_filter_request_local_var->locale = locale;

    return catalogs_retail_list_products_by_catalog_based_filter_request_local_var;
}


void catalogs_retail_list_products_by_catalog_based_filter_request_free(catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request) {
    if(NULL == catalogs_retail_list_products_by_catalog_based_filter_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id) {
        free(catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id);
        catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id = NULL;
    }
    if (catalogs_retail_list_products_by_catalog_based_filter_request->filters) {
        catalogs_product_group_filters_free(catalogs_retail_list_products_by_catalog_based_filter_request->filters);
        catalogs_retail_list_products_by_catalog_based_filter_request->filters = NULL;
    }
    if (catalogs_retail_list_products_by_catalog_based_filter_request->country) {
        country_free(catalogs_retail_list_products_by_catalog_based_filter_request->country);
        catalogs_retail_list_products_by_catalog_based_filter_request->country = NULL;
    }
    if (catalogs_retail_list_products_by_catalog_based_filter_request->locale) {
        catalogs_locale_free(catalogs_retail_list_products_by_catalog_based_filter_request->locale);
        catalogs_retail_list_products_by_catalog_based_filter_request->locale = NULL;
    }
    free(catalogs_retail_list_products_by_catalog_based_filter_request);
}

cJSON *catalogs_retail_list_products_by_catalog_based_filter_request_convertToJSON(catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_list_products_by_catalog_based_filter_request->catalog_type
    if (pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_NULL == catalogs_retail_list_products_by_catalog_based_filter_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_retail_list_products_by_catalog_based_filter_request_ToString(catalogs_retail_list_products_by_catalog_based_filter_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id
    if (!catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_list_products_by_catalog_based_filter_request->filters
    if (!catalogs_retail_list_products_by_catalog_based_filter_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_convertToJSON(catalogs_retail_list_products_by_catalog_based_filter_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_retail_list_products_by_catalog_based_filter_request->country
    if (pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request__NULL == catalogs_retail_list_products_by_catalog_based_filter_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_retail_list_products_by_catalog_based_filter_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_list_products_by_catalog_based_filter_request->locale
    if (pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request__NULL == catalogs_retail_list_products_by_catalog_based_filter_request->locale) {
        goto fail;
    }
    cJSON *locale_local_JSON = catalogs_locale_convertToJSON(catalogs_retail_list_products_by_catalog_based_filter_request->locale);
    if(locale_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "locale", locale_local_JSON);
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

catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request_parseFromJSON(cJSON *catalogs_retail_list_products_by_catalog_based_filter_requestJSON){

    catalogs_retail_list_products_by_catalog_based_filter_request_t *catalogs_retail_list_products_by_catalog_based_filter_request_local_var = NULL;

    // define the local variable for catalogs_retail_list_products_by_catalog_based_filter_request->filters
    catalogs_product_group_filters_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_retail_list_products_by_catalog_based_filter_request->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for catalogs_retail_list_products_by_catalog_based_filter_request->locale
    catalogs_locale_t *locale_local_nonprim = NULL;

    // catalogs_retail_list_products_by_catalog_based_filter_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_list_products_by_catalog_based_filter_requestJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_list_products_by_catalog_based_filter_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_list_products_by_catalog_based_filter_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_list_products_by_catalog_based_filter_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_list_products_by_catalog_based_filter_requestJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // catalogs_retail_list_products_by_catalog_based_filter_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_retail_list_products_by_catalog_based_filter_requestJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_retail_list_products_by_catalog_based_filter_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_retail_list_products_by_catalog_based_filter_requestJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_retail_list_products_by_catalog_based_filter_request->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(catalogs_retail_list_products_by_catalog_based_filter_requestJSON, "locale");
    if (!locale) {
        goto end;
    }

    
    locale_local_nonprim = catalogs_locale_parseFromJSON(locale); //custom


    catalogs_retail_list_products_by_catalog_based_filter_request_local_var = catalogs_retail_list_products_by_catalog_based_filter_request_create (
        catalog_typeVariable,
        strdup(catalog_id->valuestring),
        filters_local_nonprim,
        country_local_nonprim,
        locale_local_nonprim
        );

    return catalogs_retail_list_products_by_catalog_based_filter_request_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (locale_local_nonprim) {
        catalogs_locale_free(locale_local_nonprim);
        locale_local_nonprim = NULL;
    }
    return NULL;

}
