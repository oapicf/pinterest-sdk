#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_currency_criteria.h"


char* catalogs_product_group_currency_criteria_values_ToString(pinterest_rest_api_catalogs_product_group_currency_criteria__e values) {
    char* valuesArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    return valuesArray[values];
}

pinterest_rest_api_catalogs_product_group_currency_criteria__e catalogs_product_group_currency_criteria_values_FromString(char* values){
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_create(
    non_nullable_catalogs_currency_t *values,
    int negated
    ) {
    catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_local_var = malloc(sizeof(catalogs_product_group_currency_criteria_t));
    if (!catalogs_product_group_currency_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_currency_criteria_local_var->values = values;
    catalogs_product_group_currency_criteria_local_var->negated = negated;

    return catalogs_product_group_currency_criteria_local_var;
}


void catalogs_product_group_currency_criteria_free(catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria) {
    if(NULL == catalogs_product_group_currency_criteria){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_currency_criteria->values) {
        non_nullable_catalogs_currency_free(catalogs_product_group_currency_criteria->values);
        catalogs_product_group_currency_criteria->values = NULL;
    }
    free(catalogs_product_group_currency_criteria);
}

cJSON *catalogs_product_group_currency_criteria_convertToJSON(catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_currency_criteria->values
    if (pinterest_rest_api_catalogs_product_group_currency_criteria__NULL == catalogs_product_group_currency_criteria->values) {
        goto fail;
    }
    cJSON *values_local_JSON = non_nullable_catalogs_currency_convertToJSON(catalogs_product_group_currency_criteria->values);
    if(values_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "values", values_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_product_group_currency_criteria->negated
    if(catalogs_product_group_currency_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_currency_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_parseFromJSON(cJSON *catalogs_product_group_currency_criteriaJSON){

    catalogs_product_group_currency_criteria_t *catalogs_product_group_currency_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_currency_criteria->values
    non_nullable_catalogs_currency_t *values_local_nonprim = NULL;

    // catalogs_product_group_currency_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_currency_criteriaJSON, "values");
    if (!values) {
        goto end;
    }

    
    values_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(values); //custom

    // catalogs_product_group_currency_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_currency_criteriaJSON, "negated");
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_currency_criteria_local_var = catalogs_product_group_currency_criteria_create (
        values_local_nonprim,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_currency_criteria_local_var;
end:
    if (values_local_nonprim) {
        non_nullable_catalogs_currency_free(values_local_nonprim);
        values_local_nonprim = NULL;
    }
    return NULL;

}
