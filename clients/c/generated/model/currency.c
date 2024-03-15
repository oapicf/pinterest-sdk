#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "currency.h"


char* currency_currency_ToString(pinterest_rest_api_currency__e currency) {
    char *currencyArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP" };
    return currencyArray[currency];
}

pinterest_rest_api_currency__e currency_currency_FromString(char* currency) {
    int stringToReturn = 0;
    char *currencyArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP" };
    size_t sizeofArray = sizeof(currencyArray) / sizeof(currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency, currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *currency_currency_convertToJSON(pinterest_rest_api_currency__e currency) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "currency", currency_currency_ToString(currency)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_currency__e currency_currency_parseFromJSON(cJSON *currencyJSON) {
    pinterest_rest_api_currency__e *currency = NULL;
    pinterest_rest_api_currency__e currencyVariable;
    cJSON *currencyVar = cJSON_GetObjectItemCaseSensitive(currencyJSON, "currency");
    if(!cJSON_IsString(currencyVar) || (currencyVar->valuestring == NULL)){
        goto end;
    }
    currencyVariable = currency_currency_FromString(currencyVar->valuestring);
    return currencyVariable;
end:
    return 0;
}
