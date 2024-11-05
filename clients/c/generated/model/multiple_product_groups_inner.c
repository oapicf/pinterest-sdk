#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "multiple_product_groups_inner.h"


char* multiple_product_groups_inner_catalog_type_ToString(pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e multiple_product_groups_inner_catalog_type_FromString(char* catalog_type){
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
char* multiple_product_groups_inner_country_ToString(pinterest_rest_api_multiple_product_groups_inner__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_multiple_product_groups_inner__e multiple_product_groups_inner_country_FromString(char* country){
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
char* multiple_product_groups_inner_locale_ToString(pinterest_rest_api_multiple_product_groups_inner__e locale) {
    char* localeArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW" };
    return localeArray[locale];
}

pinterest_rest_api_multiple_product_groups_inner__e multiple_product_groups_inner_locale_FromString(char* locale){
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

multiple_product_groups_inner_t *multiple_product_groups_inner_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_creative_assets_product_group_filters_t *filters,
    char *feed_id,
    pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e catalog_type,
    char *catalog_id,
    country_t *country,
    catalogs_locale_t *locale
    ) {
    multiple_product_groups_inner_t *multiple_product_groups_inner_local_var = malloc(sizeof(multiple_product_groups_inner_t));
    if (!multiple_product_groups_inner_local_var) {
        return NULL;
    }
    multiple_product_groups_inner_local_var->name = name;
    multiple_product_groups_inner_local_var->description = description;
    multiple_product_groups_inner_local_var->is_featured = is_featured;
    multiple_product_groups_inner_local_var->filters = filters;
    multiple_product_groups_inner_local_var->feed_id = feed_id;
    multiple_product_groups_inner_local_var->catalog_type = catalog_type;
    multiple_product_groups_inner_local_var->catalog_id = catalog_id;
    multiple_product_groups_inner_local_var->country = country;
    multiple_product_groups_inner_local_var->locale = locale;

    return multiple_product_groups_inner_local_var;
}


void multiple_product_groups_inner_free(multiple_product_groups_inner_t *multiple_product_groups_inner) {
    if(NULL == multiple_product_groups_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (multiple_product_groups_inner->name) {
        free(multiple_product_groups_inner->name);
        multiple_product_groups_inner->name = NULL;
    }
    if (multiple_product_groups_inner->description) {
        free(multiple_product_groups_inner->description);
        multiple_product_groups_inner->description = NULL;
    }
    if (multiple_product_groups_inner->filters) {
        catalogs_creative_assets_product_group_filters_free(multiple_product_groups_inner->filters);
        multiple_product_groups_inner->filters = NULL;
    }
    if (multiple_product_groups_inner->feed_id) {
        free(multiple_product_groups_inner->feed_id);
        multiple_product_groups_inner->feed_id = NULL;
    }
    if (multiple_product_groups_inner->catalog_id) {
        free(multiple_product_groups_inner->catalog_id);
        multiple_product_groups_inner->catalog_id = NULL;
    }
    if (multiple_product_groups_inner->country) {
        country_free(multiple_product_groups_inner->country);
        multiple_product_groups_inner->country = NULL;
    }
    if (multiple_product_groups_inner->locale) {
        catalogs_locale_free(multiple_product_groups_inner->locale);
        multiple_product_groups_inner->locale = NULL;
    }
    free(multiple_product_groups_inner);
}

cJSON *multiple_product_groups_inner_convertToJSON(multiple_product_groups_inner_t *multiple_product_groups_inner) {
    cJSON *item = cJSON_CreateObject();

    // multiple_product_groups_inner->name
    if (!multiple_product_groups_inner->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", multiple_product_groups_inner->name) == NULL) {
    goto fail; //String
    }


    // multiple_product_groups_inner->description
    if(multiple_product_groups_inner->description) {
    if(cJSON_AddStringToObject(item, "description", multiple_product_groups_inner->description) == NULL) {
    goto fail; //String
    }
    }


    // multiple_product_groups_inner->is_featured
    if(multiple_product_groups_inner->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", multiple_product_groups_inner->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // multiple_product_groups_inner->filters
    if (!multiple_product_groups_inner->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_creative_assets_product_group_filters_convertToJSON(multiple_product_groups_inner->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // multiple_product_groups_inner->feed_id
    if (!multiple_product_groups_inner->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", multiple_product_groups_inner->feed_id) == NULL) {
    goto fail; //String
    }


    // multiple_product_groups_inner->catalog_type
    if (pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_NULL == multiple_product_groups_inner->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typemultiple_product_groups_inner_ToString(multiple_product_groups_inner->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // multiple_product_groups_inner->catalog_id
    if (!multiple_product_groups_inner->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", multiple_product_groups_inner->catalog_id) == NULL) {
    goto fail; //String
    }


    // multiple_product_groups_inner->country
    if (pinterest_rest_api_multiple_product_groups_inner__NULL == multiple_product_groups_inner->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(multiple_product_groups_inner->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // multiple_product_groups_inner->locale
    if (pinterest_rest_api_multiple_product_groups_inner__NULL == multiple_product_groups_inner->locale) {
        goto fail;
    }
    cJSON *locale_local_JSON = catalogs_locale_convertToJSON(multiple_product_groups_inner->locale);
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

multiple_product_groups_inner_t *multiple_product_groups_inner_parseFromJSON(cJSON *multiple_product_groups_innerJSON){

    multiple_product_groups_inner_t *multiple_product_groups_inner_local_var = NULL;

    // define the local variable for multiple_product_groups_inner->filters
    catalogs_creative_assets_product_group_filters_t *filters_local_nonprim = NULL;

    // define the local variable for multiple_product_groups_inner->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for multiple_product_groups_inner->locale
    catalogs_locale_t *locale_local_nonprim = NULL;

    // multiple_product_groups_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // multiple_product_groups_inner->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // multiple_product_groups_inner->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "is_featured");
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    }

    // multiple_product_groups_inner->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_creative_assets_product_group_filters_parseFromJSON(filters); //nonprimitive

    // multiple_product_groups_inner->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //String
    }

    // multiple_product_groups_inner->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = multiple_product_groups_inner_catalog_type_FromString(catalog_type->valuestring);

    // multiple_product_groups_inner->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // multiple_product_groups_inner->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // multiple_product_groups_inner->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(multiple_product_groups_innerJSON, "locale");
    if (!locale) {
        goto end;
    }

    
    locale_local_nonprim = catalogs_locale_parseFromJSON(locale); //custom


    multiple_product_groups_inner_local_var = multiple_product_groups_inner_create (
        strdup(name->valuestring),
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        is_featured ? is_featured->valueint : 0,
        filters_local_nonprim,
        strdup(feed_id->valuestring),
        catalog_typeVariable,
        strdup(catalog_id->valuestring),
        country_local_nonprim,
        locale_local_nonprim
        );

    return multiple_product_groups_inner_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_creative_assets_product_group_filters_free(filters_local_nonprim);
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
