/*
 * currency.h
 *
 * Currency Codes from ISO 4217
 */

#ifndef _currency_H_
#define _currency_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct currency_t currency_t;


// Enum  for currency

typedef enum { pinterest_rest_api_currency__NULL = 0, pinterest_rest_api_currency__UNK, pinterest_rest_api_currency__USD, pinterest_rest_api_currency__GBP, pinterest_rest_api_currency__CAD, pinterest_rest_api_currency__EUR, pinterest_rest_api_currency__AUD, pinterest_rest_api_currency__NZD, pinterest_rest_api_currency__SEK, pinterest_rest_api_currency__ILS, pinterest_rest_api_currency__CHF, pinterest_rest_api_currency__HKD, pinterest_rest_api_currency__JPY, pinterest_rest_api_currency__SGD, pinterest_rest_api_currency__KRW, pinterest_rest_api_currency__NOK, pinterest_rest_api_currency__DKK, pinterest_rest_api_currency__PLN, pinterest_rest_api_currency__RON, pinterest_rest_api_currency__HUF, pinterest_rest_api_currency__CZK, pinterest_rest_api_currency__BRL, pinterest_rest_api_currency__MXN, pinterest_rest_api_currency__ARS, pinterest_rest_api_currency__CLP, pinterest_rest_api_currency__COP, pinterest_rest_api_currency__INR, pinterest_rest_api_currency___TRY } pinterest_rest_api_currency__e;

char* currency_currency_ToString(pinterest_rest_api_currency__e currency);

pinterest_rest_api_currency__e currency_currency_FromString(char* currency);

//cJSON *currency_currency_convertToJSON(pinterest_rest_api_currency__e currency);

//pinterest_rest_api_currency__e currency_currency_parseFromJSON(cJSON *currencyJSON);

#endif /* _currency_H_ */

