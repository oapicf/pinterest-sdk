#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "non_nullable_catalogs_currency.h"


char* non_nullable_catalogs_currency_non_nullable_catalogs_currency_ToString(pinterest_rest_api_non_nullable_catalogs_currency__e non_nullable_catalogs_currency) {
    char *non_nullable_catalogs_currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    return non_nullable_catalogs_currencyArray[non_nullable_catalogs_currency];
}

pinterest_rest_api_non_nullable_catalogs_currency__e non_nullable_catalogs_currency_non_nullable_catalogs_currency_FromString(char* non_nullable_catalogs_currency) {
    int stringToReturn = 0;
    char *non_nullable_catalogs_currencyArray[] =  { "NULL", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD" };
    size_t sizeofArray = sizeof(non_nullable_catalogs_currencyArray) / sizeof(non_nullable_catalogs_currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(non_nullable_catalogs_currency, non_nullable_catalogs_currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *non_nullable_catalogs_currency_non_nullable_catalogs_currency_convertToJSON(pinterest_rest_api_non_nullable_catalogs_currency__e non_nullable_catalogs_currency) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "non_nullable_catalogs_currency", non_nullable_catalogs_currency_non_nullable_catalogs_currency_ToString(non_nullable_catalogs_currency)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_non_nullable_catalogs_currency__e non_nullable_catalogs_currency_non_nullable_catalogs_currency_parseFromJSON(cJSON *non_nullable_catalogs_currencyJSON) {
    pinterest_rest_api_non_nullable_catalogs_currency__e *non_nullable_catalogs_currency = NULL;
    pinterest_rest_api_non_nullable_catalogs_currency__e non_nullable_catalogs_currencyVariable;
    cJSON *non_nullable_catalogs_currencyVar = cJSON_GetObjectItemCaseSensitive(non_nullable_catalogs_currencyJSON, "non_nullable_catalogs_currency");
    if(!cJSON_IsString(non_nullable_catalogs_currencyVar) || (non_nullable_catalogs_currencyVar->valuestring == NULL)){
        goto end;
    }
    non_nullable_catalogs_currencyVariable = non_nullable_catalogs_currency_non_nullable_catalogs_currency_FromString(non_nullable_catalogs_currencyVar->valuestring);
    return non_nullable_catalogs_currencyVariable;
end:
    return 0;
}
