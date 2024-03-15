#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_pricing_currency_criteria.h"


char* catalogs_product_group_pricing_currency_criteria__operator_ToString(pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operator) {
    char* _operatorArray[] =  { "NULL", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS" };
    return _operatorArray[_operator];
}

pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e catalogs_product_group_pricing_currency_criteria__operator_FromString(char* _operator){
    int stringToReturn = 0;
    char *_operatorArray[] =  { "NULL", "GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS" };
    size_t sizeofArray = sizeof(_operatorArray) / sizeof(_operatorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(_operator, _operatorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_product_group_pricing_currency_criteria_currency_ToString(pinterest_rest_api_catalogs_product_group_pricing_currency_criteria__e currency) {
    char* currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    return currencyArray[currency];
}

pinterest_rest_api_catalogs_product_group_pricing_currency_criteria__e catalogs_product_group_pricing_currency_criteria_currency_FromString(char* currency){
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

catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_create(
    pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operator,
    double value,
    non_nullable_catalogs_currency_t *currency,
    int negated
    ) {
    catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_local_var = malloc(sizeof(catalogs_product_group_pricing_currency_criteria_t));
    if (!catalogs_product_group_pricing_currency_criteria_local_var) {
        return NULL;
    }
    catalogs_product_group_pricing_currency_criteria_local_var->_operator = _operator;
    catalogs_product_group_pricing_currency_criteria_local_var->value = value;
    catalogs_product_group_pricing_currency_criteria_local_var->currency = currency;
    catalogs_product_group_pricing_currency_criteria_local_var->negated = negated;

    return catalogs_product_group_pricing_currency_criteria_local_var;
}


void catalogs_product_group_pricing_currency_criteria_free(catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria) {
    if(NULL == catalogs_product_group_pricing_currency_criteria){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_pricing_currency_criteria->currency) {
        non_nullable_catalogs_currency_free(catalogs_product_group_pricing_currency_criteria->currency);
        catalogs_product_group_pricing_currency_criteria->currency = NULL;
    }
    free(catalogs_product_group_pricing_currency_criteria);
}

cJSON *catalogs_product_group_pricing_currency_criteria_convertToJSON(catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_pricing_currency_criteria->_operator
    if (pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_NULL == catalogs_product_group_pricing_currency_criteria->_operator) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operator", _operatorcatalogs_product_group_pricing_currency_criteria_ToString(catalogs_product_group_pricing_currency_criteria->_operator)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product_group_pricing_currency_criteria->value
    if (!catalogs_product_group_pricing_currency_criteria->value) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "value", catalogs_product_group_pricing_currency_criteria->value) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_product_group_pricing_currency_criteria->currency
    if (pinterest_rest_api_catalogs_product_group_pricing_currency_criteria__NULL == catalogs_product_group_pricing_currency_criteria->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = non_nullable_catalogs_currency_convertToJSON(catalogs_product_group_pricing_currency_criteria->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_product_group_pricing_currency_criteria->negated
    if(catalogs_product_group_pricing_currency_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", catalogs_product_group_pricing_currency_criteria->negated) == NULL) {
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

catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_parseFromJSON(cJSON *catalogs_product_group_pricing_currency_criteriaJSON){

    catalogs_product_group_pricing_currency_criteria_t *catalogs_product_group_pricing_currency_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_pricing_currency_criteria->currency
    non_nullable_catalogs_currency_t *currency_local_nonprim = NULL;

    // catalogs_product_group_pricing_currency_criteria->_operator
    cJSON *_operator = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "operator");
    if (!_operator) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_group_pricing_currency_criteria_OPERATOR_e _operatorVariable;
    
    if(!cJSON_IsString(_operator))
    {
    goto end; //Enum
    }
    _operatorVariable = catalogs_product_group_pricing_currency_criteria__operator_FromString(_operator->valuestring);

    // catalogs_product_group_pricing_currency_criteria->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }

    // catalogs_product_group_pricing_currency_criteria->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "currency");
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = non_nullable_catalogs_currency_parseFromJSON(currency); //custom

    // catalogs_product_group_pricing_currency_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_pricing_currency_criteriaJSON, "negated");
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    }


    catalogs_product_group_pricing_currency_criteria_local_var = catalogs_product_group_pricing_currency_criteria_create (
        _operatorVariable,
        value->valuedouble,
        currency_local_nonprim,
        negated ? negated->valueint : 0
        );

    return catalogs_product_group_pricing_currency_criteria_local_var;
end:
    if (currency_local_nonprim) {
        non_nullable_catalogs_currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
