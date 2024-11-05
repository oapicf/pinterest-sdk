#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_product_metadata.h"


char* catalogs_retail_product_metadata_availability_ToString(pinterest_rest_api_catalogs_retail_product_metadata__e availability) {
    char* availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    return availabilityArray[availability];
}

pinterest_rest_api_catalogs_retail_product_metadata__e catalogs_retail_product_metadata_availability_FromString(char* availability){
    int stringToReturn = 0;
    char *availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    size_t sizeofArray = sizeof(availabilityArray) / sizeof(availabilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(availability, availabilityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_product_metadata_currency_ToString(pinterest_rest_api_catalogs_retail_product_metadata__e currency) {
    char* currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    return currencyArray[currency];
}

pinterest_rest_api_catalogs_retail_product_metadata__e catalogs_retail_product_metadata_currency_FromString(char* currency){
    int stringToReturn = 0;
    char *currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    size_t sizeofArray = sizeof(currencyArray) / sizeof(currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency, currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_create(
    char *item_id,
    char *item_group_id,
    non_nullable_product_availability_type_t *availability,
    double price,
    double sale_price,
    non_nullable_catalogs_currency_t *currency
    ) {
    catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_local_var = malloc(sizeof(catalogs_retail_product_metadata_t));
    if (!catalogs_retail_product_metadata_local_var) {
        return NULL;
    }
    catalogs_retail_product_metadata_local_var->item_id = item_id;
    catalogs_retail_product_metadata_local_var->item_group_id = item_group_id;
    catalogs_retail_product_metadata_local_var->availability = availability;
    catalogs_retail_product_metadata_local_var->price = price;
    catalogs_retail_product_metadata_local_var->sale_price = sale_price;
    catalogs_retail_product_metadata_local_var->currency = currency;

    return catalogs_retail_product_metadata_local_var;
}


void catalogs_retail_product_metadata_free(catalogs_retail_product_metadata_t *catalogs_retail_product_metadata) {
    if(NULL == catalogs_retail_product_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_product_metadata->item_id) {
        free(catalogs_retail_product_metadata->item_id);
        catalogs_retail_product_metadata->item_id = NULL;
    }
    if (catalogs_retail_product_metadata->item_group_id) {
        free(catalogs_retail_product_metadata->item_group_id);
        catalogs_retail_product_metadata->item_group_id = NULL;
    }
    if (catalogs_retail_product_metadata->availability) {
        non_nullable_product_availability_type_free(catalogs_retail_product_metadata->availability);
        catalogs_retail_product_metadata->availability = NULL;
    }
    if (catalogs_retail_product_metadata->currency) {
        non_nullable_catalogs_currency_free(catalogs_retail_product_metadata->currency);
        catalogs_retail_product_metadata->currency = NULL;
    }
    free(catalogs_retail_product_metadata);
}

cJSON *catalogs_retail_product_metadata_convertToJSON(catalogs_retail_product_metadata_t *catalogs_retail_product_metadata) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_product_metadata->item_id
    if (!catalogs_retail_product_metadata->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_retail_product_metadata->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_product_metadata->item_group_id
    if (!catalogs_retail_product_metadata->item_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_group_id", catalogs_retail_product_metadata->item_group_id) == NULL) {
    goto fail; //String
    }


    // catalogs_retail_product_metadata->availability
    if (pinterest_rest_api_catalogs_retail_product_metadata__NULL == catalogs_retail_product_metadata->availability) {
        goto fail;
    }
    cJSON *availability_local_JSON = non_nullable_product_availability_type_convertToJSON(catalogs_retail_product_metadata->availability);
    if(availability_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "availability", availability_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_product_metadata->price
    if (!catalogs_retail_product_metadata->price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "price", catalogs_retail_product_metadata->price) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_metadata->sale_price
    if (!catalogs_retail_product_metadata->sale_price) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sale_price", catalogs_retail_product_metadata->sale_price) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_retail_product_metadata->currency
    if (pinterest_rest_api_catalogs_retail_product_metadata__NULL == catalogs_retail_product_metadata->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = non_nullable_catalogs_currency_convertToJSON(catalogs_retail_product_metadata->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
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

catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_parseFromJSON(cJSON *catalogs_retail_product_metadataJSON){

    catalogs_retail_product_metadata_t *catalogs_retail_product_metadata_local_var = NULL;

    // define the local variable for catalogs_retail_product_metadata->availability
    non_nullable_product_availability_type_t *availability_local_nonprim = NULL;

    // define the local variable for catalogs_retail_product_metadata->currency
    non_nullable_catalogs_currency_t *currency_local_nonprim = NULL;

    // catalogs_retail_product_metadata->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "item_id");
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // catalogs_retail_product_metadata->item_group_id
    cJSON *item_group_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "item_group_id");
    if (!item_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_group_id))
    {
    goto end; //String
    }

    // catalogs_retail_product_metadata->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "availability");
    if (!availability) {
        goto end;
    }

    
    availability_local_nonprim = non_nullable_product_availability_type_parseFromJSON(availability); //custom

    // catalogs_retail_product_metadata->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "price");
    if (!price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }

    // catalogs_retail_product_metadata->sale_price
    cJSON *sale_price = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "sale_price");
    if (!sale_price) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sale_price))
    {
    goto end; //Numeric
    }

    // catalogs_retail_product_metadata->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(catalogs_retail_product_metadataJSON, "currency");
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(currency); //custom


    catalogs_retail_product_metadata_local_var = catalogs_retail_product_metadata_create (
        strdup(item_id->valuestring),
        strdup(item_group_id->valuestring),
        availability_local_nonprim,
        price->valuedouble,
        sale_price->valuedouble,
        currency_local_nonprim
        );

    return catalogs_retail_product_metadata_local_var;
end:
    if (availability_local_nonprim) {
        non_nullable_product_availability_type_free(availability_local_nonprim);
        availability_local_nonprim = NULL;
    }
    if (currency_local_nonprim) {
        non_nullable_catalogs_currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
