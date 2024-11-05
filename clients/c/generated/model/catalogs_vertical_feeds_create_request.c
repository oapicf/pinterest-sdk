#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_vertical_feeds_create_request.h"


char* catalogs_vertical_feeds_create_request_default_currency_ToString(pinterest_rest_api_catalogs_vertical_feeds_create_request__e default_currency) {
    char* default_currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD", "" };
    return default_currencyArray[default_currency];
}

pinterest_rest_api_catalogs_vertical_feeds_create_request__e catalogs_vertical_feeds_create_request_default_currency_FromString(char* default_currency){
    int stringToReturn = 0;
    char *default_currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD", "" };
    size_t sizeofArray = sizeof(default_currencyArray) / sizeof(default_currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(default_currency, default_currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_vertical_feeds_create_request_format_ToString(pinterest_rest_api_catalogs_vertical_feeds_create_request__e format) {
    char* formatArray[] =  { "NULL", "TSV", "CSV", "XML" };
    return formatArray[format];
}

pinterest_rest_api_catalogs_vertical_feeds_create_request__e catalogs_vertical_feeds_create_request_format_FromString(char* format){
    int stringToReturn = 0;
    char *formatArray[] =  { "NULL", "TSV", "CSV", "XML" };
    size_t sizeofArray = sizeof(formatArray) / sizeof(formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(format, formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_vertical_feeds_create_request_catalog_type_ToString(pinterest_rest_api_catalogs_vertical_feeds_create_request__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_vertical_feeds_create_request__e catalogs_vertical_feeds_create_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_vertical_feeds_create_request_default_country_ToString(pinterest_rest_api_catalogs_vertical_feeds_create_request__e default_country) {
    char* default_countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return default_countryArray[default_country];
}

pinterest_rest_api_catalogs_vertical_feeds_create_request__e catalogs_vertical_feeds_create_request_default_country_FromString(char* default_country){
    int stringToReturn = 0;
    char *default_countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    size_t sizeofArray = sizeof(default_countryArray) / sizeof(default_countryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(default_country, default_countryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_vertical_feeds_create_request_default_availability_ToString(pinterest_rest_api_catalogs_vertical_feeds_create_request__e default_availability) {
    char* default_availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "" };
    return default_availabilityArray[default_availability];
}

pinterest_rest_api_catalogs_vertical_feeds_create_request__e catalogs_vertical_feeds_create_request_default_availability_FromString(char* default_availability){
    int stringToReturn = 0;
    char *default_availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "" };
    size_t sizeofArray = sizeof(default_availabilityArray) / sizeof(default_availabilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(default_availability, default_availabilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_vertical_feeds_create_request_t *catalogs_vertical_feeds_create_request_create(
    nullable_currency_t *default_currency,
    char *name,
    catalogs_format_t *format,
    catalogs_feeds_create_request_default_locale_t *default_locale,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_type_t *catalog_type,
    country_t *default_country,
    product_availability_type_t *default_availability,
    catalogs_status_t *status,
    char *catalog_id
    ) {
    catalogs_vertical_feeds_create_request_t *catalogs_vertical_feeds_create_request_local_var = malloc(sizeof(catalogs_vertical_feeds_create_request_t));
    if (!catalogs_vertical_feeds_create_request_local_var) {
        return NULL;
    }
    catalogs_vertical_feeds_create_request_local_var->default_currency = default_currency;
    catalogs_vertical_feeds_create_request_local_var->name = name;
    catalogs_vertical_feeds_create_request_local_var->format = format;
    catalogs_vertical_feeds_create_request_local_var->default_locale = default_locale;
    catalogs_vertical_feeds_create_request_local_var->credentials = credentials;
    catalogs_vertical_feeds_create_request_local_var->location = location;
    catalogs_vertical_feeds_create_request_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_vertical_feeds_create_request_local_var->catalog_type = catalog_type;
    catalogs_vertical_feeds_create_request_local_var->default_country = default_country;
    catalogs_vertical_feeds_create_request_local_var->default_availability = default_availability;
    catalogs_vertical_feeds_create_request_local_var->status = status;
    catalogs_vertical_feeds_create_request_local_var->catalog_id = catalog_id;

    return catalogs_vertical_feeds_create_request_local_var;
}


void catalogs_vertical_feeds_create_request_free(catalogs_vertical_feeds_create_request_t *catalogs_vertical_feeds_create_request) {
    if(NULL == catalogs_vertical_feeds_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_vertical_feeds_create_request->default_currency) {
        nullable_currency_free(catalogs_vertical_feeds_create_request->default_currency);
        catalogs_vertical_feeds_create_request->default_currency = NULL;
    }
    if (catalogs_vertical_feeds_create_request->name) {
        free(catalogs_vertical_feeds_create_request->name);
        catalogs_vertical_feeds_create_request->name = NULL;
    }
    if (catalogs_vertical_feeds_create_request->format) {
        catalogs_format_free(catalogs_vertical_feeds_create_request->format);
        catalogs_vertical_feeds_create_request->format = NULL;
    }
    if (catalogs_vertical_feeds_create_request->default_locale) {
        catalogs_feeds_create_request_default_locale_free(catalogs_vertical_feeds_create_request->default_locale);
        catalogs_vertical_feeds_create_request->default_locale = NULL;
    }
    if (catalogs_vertical_feeds_create_request->credentials) {
        catalogs_feed_credentials_free(catalogs_vertical_feeds_create_request->credentials);
        catalogs_vertical_feeds_create_request->credentials = NULL;
    }
    if (catalogs_vertical_feeds_create_request->location) {
        free(catalogs_vertical_feeds_create_request->location);
        catalogs_vertical_feeds_create_request->location = NULL;
    }
    if (catalogs_vertical_feeds_create_request->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_vertical_feeds_create_request->preferred_processing_schedule);
        catalogs_vertical_feeds_create_request->preferred_processing_schedule = NULL;
    }
    if (catalogs_vertical_feeds_create_request->catalog_type) {
        catalogs_type_free(catalogs_vertical_feeds_create_request->catalog_type);
        catalogs_vertical_feeds_create_request->catalog_type = NULL;
    }
    if (catalogs_vertical_feeds_create_request->default_country) {
        country_free(catalogs_vertical_feeds_create_request->default_country);
        catalogs_vertical_feeds_create_request->default_country = NULL;
    }
    if (catalogs_vertical_feeds_create_request->default_availability) {
        product_availability_type_free(catalogs_vertical_feeds_create_request->default_availability);
        catalogs_vertical_feeds_create_request->default_availability = NULL;
    }
    if (catalogs_vertical_feeds_create_request->status) {
        catalogs_status_free(catalogs_vertical_feeds_create_request->status);
        catalogs_vertical_feeds_create_request->status = NULL;
    }
    if (catalogs_vertical_feeds_create_request->catalog_id) {
        free(catalogs_vertical_feeds_create_request->catalog_id);
        catalogs_vertical_feeds_create_request->catalog_id = NULL;
    }
    free(catalogs_vertical_feeds_create_request);
}

cJSON *catalogs_vertical_feeds_create_request_convertToJSON(catalogs_vertical_feeds_create_request_t *catalogs_vertical_feeds_create_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_vertical_feeds_create_request->default_currency
    if(catalogs_vertical_feeds_create_request->default_currency != pinterest_rest_api_catalogs_vertical_feeds_create_request__NULL) {
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_vertical_feeds_create_request->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_vertical_feeds_create_request->name
    if (!catalogs_vertical_feeds_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_vertical_feeds_create_request->name) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_feeds_create_request->format
    if (pinterest_rest_api_catalogs_vertical_feeds_create_request__NULL == catalogs_vertical_feeds_create_request->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_vertical_feeds_create_request->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_vertical_feeds_create_request->default_locale
    if (!catalogs_vertical_feeds_create_request->default_locale) {
        goto fail;
    }
    cJSON *default_locale_local_JSON = catalogs_feeds_create_request_default_locale_convertToJSON(catalogs_vertical_feeds_create_request->default_locale);
    if(default_locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default_locale", default_locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_vertical_feeds_create_request->credentials
    if(catalogs_vertical_feeds_create_request->credentials) {
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_vertical_feeds_create_request->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_vertical_feeds_create_request->location
    if (!catalogs_vertical_feeds_create_request->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", catalogs_vertical_feeds_create_request->location) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_feeds_create_request->preferred_processing_schedule
    if(catalogs_vertical_feeds_create_request->preferred_processing_schedule) {
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_vertical_feeds_create_request->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_vertical_feeds_create_request->catalog_type
    if (pinterest_rest_api_catalogs_vertical_feeds_create_request__NULL == catalogs_vertical_feeds_create_request->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_vertical_feeds_create_request->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_vertical_feeds_create_request->default_country
    if (pinterest_rest_api_catalogs_vertical_feeds_create_request__NULL == catalogs_vertical_feeds_create_request->default_country) {
        goto fail;
    }
    cJSON *default_country_local_JSON = country_convertToJSON(catalogs_vertical_feeds_create_request->default_country);
    if(default_country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_country", default_country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_vertical_feeds_create_request->default_availability
    if(catalogs_vertical_feeds_create_request->default_availability != pinterest_rest_api_catalogs_vertical_feeds_create_request__NULL) {
    cJSON *default_availability_local_JSON = product_availability_type_convertToJSON(catalogs_vertical_feeds_create_request->default_availability);
    if(default_availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_availability", default_availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_vertical_feeds_create_request->status
    if(catalogs_vertical_feeds_create_request->status) {
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_vertical_feeds_create_request->status);
    if(status_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_vertical_feeds_create_request->catalog_id
    if(catalogs_vertical_feeds_create_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_vertical_feeds_create_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_vertical_feeds_create_request_t *catalogs_vertical_feeds_create_request_parseFromJSON(cJSON *catalogs_vertical_feeds_create_requestJSON){

    catalogs_vertical_feeds_create_request_t *catalogs_vertical_feeds_create_request_local_var = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->default_currency
    nullable_currency_t *default_currency_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->format
    catalogs_format_t *format_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->default_locale
    catalogs_feeds_create_request_default_locale_t *default_locale_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->default_country
    country_t *default_country_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->default_availability
    product_availability_type_t *default_availability_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_feeds_create_request->status
    catalogs_status_t *status_local_nonprim = NULL;

    // catalogs_vertical_feeds_create_request->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "default_currency");
    if (default_currency) { 
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom
    }

    // catalogs_vertical_feeds_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // catalogs_vertical_feeds_create_request->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "format");
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // catalogs_vertical_feeds_create_request->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "default_locale");
    if (!default_locale) {
        goto end;
    }

    
    default_locale_local_nonprim = catalogs_feeds_create_request_default_locale_parseFromJSON(default_locale); //nonprimitive

    // catalogs_vertical_feeds_create_request->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "credentials");
    if (credentials) { 
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive
    }

    // catalogs_vertical_feeds_create_request->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "location");
    if (!location) {
        goto end;
    }

    
    if(!cJSON_IsString(location))
    {
    goto end; //String
    }

    // catalogs_vertical_feeds_create_request->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "preferred_processing_schedule");
    if (preferred_processing_schedule) { 
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive
    }

    // catalogs_vertical_feeds_create_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_vertical_feeds_create_request->default_country
    cJSON *default_country = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "default_country");
    if (!default_country) {
        goto end;
    }

    
    default_country_local_nonprim = country_parseFromJSON(default_country); //custom

    // catalogs_vertical_feeds_create_request->default_availability
    cJSON *default_availability = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "default_availability");
    if (default_availability) { 
    default_availability_local_nonprim = product_availability_type_parseFromJSON(default_availability); //custom
    }

    // catalogs_vertical_feeds_create_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "status");
    if (status) { 
    status_local_nonprim = catalogs_status_parseFromJSON(status); //nonprimitive
    }

    // catalogs_vertical_feeds_create_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_feeds_create_requestJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }


    catalogs_vertical_feeds_create_request_local_var = catalogs_vertical_feeds_create_request_create (
        default_currency ? default_currency_local_nonprim : NULL,
        strdup(name->valuestring),
        format_local_nonprim,
        default_locale_local_nonprim,
        credentials ? credentials_local_nonprim : NULL,
        strdup(location->valuestring),
        preferred_processing_schedule ? preferred_processing_schedule_local_nonprim : NULL,
        catalog_type_local_nonprim,
        default_country_local_nonprim,
        default_availability ? default_availability_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL
        );

    return catalogs_vertical_feeds_create_request_local_var;
end:
    if (default_currency_local_nonprim) {
        nullable_currency_free(default_currency_local_nonprim);
        default_currency_local_nonprim = NULL;
    }
    if (format_local_nonprim) {
        catalogs_format_free(format_local_nonprim);
        format_local_nonprim = NULL;
    }
    if (default_locale_local_nonprim) {
        catalogs_feeds_create_request_default_locale_free(default_locale_local_nonprim);
        default_locale_local_nonprim = NULL;
    }
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (preferred_processing_schedule_local_nonprim) {
        catalogs_feed_processing_schedule_free(preferred_processing_schedule_local_nonprim);
        preferred_processing_schedule_local_nonprim = NULL;
    }
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (default_country_local_nonprim) {
        country_free(default_country_local_nonprim);
        default_country_local_nonprim = NULL;
    }
    if (default_availability_local_nonprim) {
        product_availability_type_free(default_availability_local_nonprim);
        default_availability_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        catalogs_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
