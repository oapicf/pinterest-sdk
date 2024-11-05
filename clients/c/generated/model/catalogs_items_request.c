#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_request.h"


char* catalogs_items_request_country_ToString(pinterest_rest_api_catalogs_items_request__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_catalogs_items_request__e catalogs_items_request_country_FromString(char* country){
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

catalogs_items_request_t *catalogs_items_request_create(
    country_t *country,
    catalogs_items_request_language_t *language,
    catalogs_items_post_filters_t *filters
    ) {
    catalogs_items_request_t *catalogs_items_request_local_var = malloc(sizeof(catalogs_items_request_t));
    if (!catalogs_items_request_local_var) {
        return NULL;
    }
    catalogs_items_request_local_var->country = country;
    catalogs_items_request_local_var->language = language;
    catalogs_items_request_local_var->filters = filters;

    return catalogs_items_request_local_var;
}


void catalogs_items_request_free(catalogs_items_request_t *catalogs_items_request) {
    if(NULL == catalogs_items_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items_request->country) {
        country_free(catalogs_items_request->country);
        catalogs_items_request->country = NULL;
    }
    if (catalogs_items_request->language) {
        catalogs_items_request_language_free(catalogs_items_request->language);
        catalogs_items_request->language = NULL;
    }
    if (catalogs_items_request->filters) {
        catalogs_items_post_filters_free(catalogs_items_request->filters);
        catalogs_items_request->filters = NULL;
    }
    free(catalogs_items_request);
}

cJSON *catalogs_items_request_convertToJSON(catalogs_items_request_t *catalogs_items_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items_request->country
    if (pinterest_rest_api_catalogs_items_request__NULL == catalogs_items_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_items_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_request->language
    if (!catalogs_items_request->language) {
        goto fail;
    }
    cJSON *language_local_JSON = catalogs_items_request_language_convertToJSON(catalogs_items_request->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_items_request->filters
    if (!catalogs_items_request->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_items_post_filters_convertToJSON(catalogs_items_request->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
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

catalogs_items_request_t *catalogs_items_request_parseFromJSON(cJSON *catalogs_items_requestJSON){

    catalogs_items_request_t *catalogs_items_request_local_var = NULL;

    // define the local variable for catalogs_items_request->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for catalogs_items_request->language
    catalogs_items_request_language_t *language_local_nonprim = NULL;

    // define the local variable for catalogs_items_request->filters
    catalogs_items_post_filters_t *filters_local_nonprim = NULL;

    // catalogs_items_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_items_requestJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_items_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_items_requestJSON, "language");
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = catalogs_items_request_language_parseFromJSON(language); //nonprimitive

    // catalogs_items_request->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_items_requestJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_items_post_filters_parseFromJSON(filters); //nonprimitive


    catalogs_items_request_local_var = catalogs_items_request_create (
        country_local_nonprim,
        language_local_nonprim,
        filters_local_nonprim
        );

    return catalogs_items_request_local_var;
end:
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (language_local_nonprim) {
        catalogs_items_request_language_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (filters_local_nonprim) {
        catalogs_items_post_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    return NULL;

}
