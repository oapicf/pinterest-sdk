#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_feed.h"


char* catalogs_hotel_feed_format_ToString(pinterest_rest_api_catalogs_hotel_feed__e format) {
    char* formatArray[] =  { "NULL", "TSV", "CSV", "XML" };
    return formatArray[format];
}

pinterest_rest_api_catalogs_hotel_feed__e catalogs_hotel_feed_format_FromString(char* format){
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
char* catalogs_hotel_feed_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_feed__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_feed__e catalogs_hotel_feed_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_hotel_feed_status_ToString(pinterest_rest_api_catalogs_hotel_feed__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    return statusArray[status];
}

pinterest_rest_api_catalogs_hotel_feed__e catalogs_hotel_feed_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_hotel_feed_default_currency_ToString(pinterest_rest_api_catalogs_hotel_feed__e default_currency) {
    char* default_currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD", "" };
    return default_currencyArray[default_currency];
}

pinterest_rest_api_catalogs_hotel_feed__e catalogs_hotel_feed_default_currency_FromString(char* default_currency){
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

catalogs_hotel_feed_t *catalogs_hotel_feed_create(
    char *created_at,
    char *id,
    char *updated_at,
    char *name,
    catalogs_format_t *format,
    catalogs_type_t *catalog_type,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    catalogs_status_t *status,
    nullable_currency_t *default_currency,
    char *default_locale,
    char *catalog_id
    ) {
    catalogs_hotel_feed_t *catalogs_hotel_feed_local_var = malloc(sizeof(catalogs_hotel_feed_t));
    if (!catalogs_hotel_feed_local_var) {
        return NULL;
    }
    catalogs_hotel_feed_local_var->created_at = created_at;
    catalogs_hotel_feed_local_var->id = id;
    catalogs_hotel_feed_local_var->updated_at = updated_at;
    catalogs_hotel_feed_local_var->name = name;
    catalogs_hotel_feed_local_var->format = format;
    catalogs_hotel_feed_local_var->catalog_type = catalog_type;
    catalogs_hotel_feed_local_var->credentials = credentials;
    catalogs_hotel_feed_local_var->location = location;
    catalogs_hotel_feed_local_var->preferred_processing_schedule = preferred_processing_schedule;
    catalogs_hotel_feed_local_var->status = status;
    catalogs_hotel_feed_local_var->default_currency = default_currency;
    catalogs_hotel_feed_local_var->default_locale = default_locale;
    catalogs_hotel_feed_local_var->catalog_id = catalog_id;

    return catalogs_hotel_feed_local_var;
}


void catalogs_hotel_feed_free(catalogs_hotel_feed_t *catalogs_hotel_feed) {
    if(NULL == catalogs_hotel_feed){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_feed->created_at) {
        free(catalogs_hotel_feed->created_at);
        catalogs_hotel_feed->created_at = NULL;
    }
    if (catalogs_hotel_feed->id) {
        free(catalogs_hotel_feed->id);
        catalogs_hotel_feed->id = NULL;
    }
    if (catalogs_hotel_feed->updated_at) {
        free(catalogs_hotel_feed->updated_at);
        catalogs_hotel_feed->updated_at = NULL;
    }
    if (catalogs_hotel_feed->name) {
        free(catalogs_hotel_feed->name);
        catalogs_hotel_feed->name = NULL;
    }
    if (catalogs_hotel_feed->format) {
        catalogs_format_free(catalogs_hotel_feed->format);
        catalogs_hotel_feed->format = NULL;
    }
    if (catalogs_hotel_feed->catalog_type) {
        catalogs_type_free(catalogs_hotel_feed->catalog_type);
        catalogs_hotel_feed->catalog_type = NULL;
    }
    if (catalogs_hotel_feed->credentials) {
        catalogs_feed_credentials_free(catalogs_hotel_feed->credentials);
        catalogs_hotel_feed->credentials = NULL;
    }
    if (catalogs_hotel_feed->location) {
        free(catalogs_hotel_feed->location);
        catalogs_hotel_feed->location = NULL;
    }
    if (catalogs_hotel_feed->preferred_processing_schedule) {
        catalogs_feed_processing_schedule_free(catalogs_hotel_feed->preferred_processing_schedule);
        catalogs_hotel_feed->preferred_processing_schedule = NULL;
    }
    if (catalogs_hotel_feed->status) {
        catalogs_status_free(catalogs_hotel_feed->status);
        catalogs_hotel_feed->status = NULL;
    }
    if (catalogs_hotel_feed->default_currency) {
        nullable_currency_free(catalogs_hotel_feed->default_currency);
        catalogs_hotel_feed->default_currency = NULL;
    }
    if (catalogs_hotel_feed->default_locale) {
        free(catalogs_hotel_feed->default_locale);
        catalogs_hotel_feed->default_locale = NULL;
    }
    if (catalogs_hotel_feed->catalog_id) {
        free(catalogs_hotel_feed->catalog_id);
        catalogs_hotel_feed->catalog_id = NULL;
    }
    free(catalogs_hotel_feed);
}

cJSON *catalogs_hotel_feed_convertToJSON(catalogs_hotel_feed_t *catalogs_hotel_feed) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_feed->created_at
    if(catalogs_hotel_feed->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", catalogs_hotel_feed->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_hotel_feed->id
    if(catalogs_hotel_feed->id) {
    if(cJSON_AddStringToObject(item, "id", catalogs_hotel_feed->id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_feed->updated_at
    if(catalogs_hotel_feed->updated_at) {
    if(cJSON_AddStringToObject(item, "updated_at", catalogs_hotel_feed->updated_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // catalogs_hotel_feed->name
    if (!catalogs_hotel_feed->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalogs_hotel_feed->name) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->format
    if (pinterest_rest_api_catalogs_hotel_feed__NULL == catalogs_hotel_feed->format) {
        goto fail;
    }
    cJSON *format_local_JSON = catalogs_format_convertToJSON(catalogs_hotel_feed->format);
    if(format_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feed->catalog_type
    if (pinterest_rest_api_catalogs_hotel_feed__NULL == catalogs_hotel_feed->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_hotel_feed->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feed->credentials
    if (!catalogs_hotel_feed->credentials) {
        goto fail;
    }
    cJSON *credentials_local_JSON = catalogs_feed_credentials_convertToJSON(catalogs_hotel_feed->credentials);
    if(credentials_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "credentials", credentials_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_feed->location
    if (!catalogs_hotel_feed->location) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location", catalogs_hotel_feed->location) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->preferred_processing_schedule
    if (!catalogs_hotel_feed->preferred_processing_schedule) {
        goto fail;
    }
    cJSON *preferred_processing_schedule_local_JSON = catalogs_feed_processing_schedule_convertToJSON(catalogs_hotel_feed->preferred_processing_schedule);
    if(preferred_processing_schedule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "preferred_processing_schedule", preferred_processing_schedule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_feed->status
    if (pinterest_rest_api_catalogs_hotel_feed__NULL == catalogs_hotel_feed->status) {
        goto fail;
    }
    cJSON *status_local_JSON = catalogs_status_convertToJSON(catalogs_hotel_feed->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feed->default_currency
    if (pinterest_rest_api_catalogs_hotel_feed__NULL == catalogs_hotel_feed->default_currency) {
        goto fail;
    }
    cJSON *default_currency_local_JSON = nullable_currency_convertToJSON(catalogs_hotel_feed->default_currency);
    if(default_currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "default_currency", default_currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_feed->default_locale
    if (!catalogs_hotel_feed->default_locale) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "default_locale", catalogs_hotel_feed->default_locale) == NULL) {
    goto fail; //String
    }


    // catalogs_hotel_feed->catalog_id
    if (!catalogs_hotel_feed->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_feed->catalog_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_feed_t *catalogs_hotel_feed_parseFromJSON(cJSON *catalogs_hotel_feedJSON){

    catalogs_hotel_feed_t *catalogs_hotel_feed_local_var = NULL;

    // define the local variable for catalogs_hotel_feed->format
    catalogs_format_t *format_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->credentials
    catalogs_feed_credentials_t *credentials_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->preferred_processing_schedule
    catalogs_feed_processing_schedule_t *preferred_processing_schedule_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->status
    catalogs_status_t *status_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_feed->default_currency
    nullable_currency_t *default_currency_local_nonprim = NULL;

    // catalogs_hotel_feed->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // catalogs_hotel_feed->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_feed->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "updated_at");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }

    // catalogs_hotel_feed->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // catalogs_hotel_feed->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "format");
    if (!format) {
        goto end;
    }

    
    format_local_nonprim = catalogs_format_parseFromJSON(format); //custom

    // catalogs_hotel_feed->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_hotel_feed->credentials
    cJSON *credentials = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "credentials");
    if (!credentials) {
        goto end;
    }

    
    credentials_local_nonprim = catalogs_feed_credentials_parseFromJSON(credentials); //nonprimitive

    // catalogs_hotel_feed->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "location");
    if (!location) {
        goto end;
    }

    
    if(!cJSON_IsString(location))
    {
    goto end; //String
    }

    // catalogs_hotel_feed->preferred_processing_schedule
    cJSON *preferred_processing_schedule = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "preferred_processing_schedule");
    if (!preferred_processing_schedule) {
        goto end;
    }

    
    preferred_processing_schedule_local_nonprim = catalogs_feed_processing_schedule_parseFromJSON(preferred_processing_schedule); //nonprimitive

    // catalogs_hotel_feed->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "status");
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = catalogs_status_parseFromJSON(status); //custom

    // catalogs_hotel_feed->default_currency
    cJSON *default_currency = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "default_currency");
    if (!default_currency) {
        goto end;
    }

    
    default_currency_local_nonprim = nullable_currency_parseFromJSON(default_currency); //custom

    // catalogs_hotel_feed->default_locale
    cJSON *default_locale = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "default_locale");
    if (!default_locale) {
        goto end;
    }

    
    if(!cJSON_IsString(default_locale))
    {
    goto end; //String
    }

    // catalogs_hotel_feed->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_feedJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }


    catalogs_hotel_feed_local_var = catalogs_hotel_feed_create (
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL,
        strdup(name->valuestring),
        format_local_nonprim,
        catalog_type_local_nonprim,
        credentials_local_nonprim,
        strdup(location->valuestring),
        preferred_processing_schedule_local_nonprim,
        status_local_nonprim,
        default_currency_local_nonprim,
        strdup(default_locale->valuestring),
        strdup(catalog_id->valuestring)
        );

    return catalogs_hotel_feed_local_var;
end:
    if (format_local_nonprim) {
        catalogs_format_free(format_local_nonprim);
        format_local_nonprim = NULL;
    }
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (credentials_local_nonprim) {
        catalogs_feed_credentials_free(credentials_local_nonprim);
        credentials_local_nonprim = NULL;
    }
    if (preferred_processing_schedule_local_nonprim) {
        catalogs_feed_processing_schedule_free(preferred_processing_schedule_local_nonprim);
        preferred_processing_schedule_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        catalogs_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (default_currency_local_nonprim) {
        nullable_currency_free(default_currency_local_nonprim);
        default_currency_local_nonprim = NULL;
    }
    return NULL;

}
