#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account.h"


char* countryad_account_ToString(pinterest_rest_api_ad_account__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
	return countryArray[country];
}

pinterest_rest_api_ad_account__e countryad_account_FromString(char* country){
    int stringToReturn = 0;
    char *countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    size_t sizeofArray = sizeof(countryArray) / sizeof(countryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(country, countryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* currencyad_account_ToString(pinterest_rest_api_ad_account__e currency) {
    char* currencyArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP" };
	return currencyArray[currency];
}

pinterest_rest_api_ad_account__e currencyad_account_FromString(char* currency){
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

ad_account_t *ad_account_create(
    char *id,
    char *name,
    ad_account_owner_t *owner,
    country_t *country,
    currency_t *currency
    ) {
    ad_account_t *ad_account_local_var = malloc(sizeof(ad_account_t));
    if (!ad_account_local_var) {
        return NULL;
    }
    ad_account_local_var->id = id;
    ad_account_local_var->name = name;
    ad_account_local_var->owner = owner;
    ad_account_local_var->country = country;
    ad_account_local_var->currency = currency;

    return ad_account_local_var;
}


void ad_account_free(ad_account_t *ad_account) {
    if(NULL == ad_account){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account->id) {
        free(ad_account->id);
        ad_account->id = NULL;
    }
    if (ad_account->name) {
        free(ad_account->name);
        ad_account->name = NULL;
    }
    if (ad_account->owner) {
        ad_account_owner_free(ad_account->owner);
        ad_account->owner = NULL;
    }
    if (ad_account->country) {
        country_free(ad_account->country);
        ad_account->country = NULL;
    }
    if (ad_account->currency) {
        currency_free(ad_account->currency);
        ad_account->currency = NULL;
    }
    free(ad_account);
}

cJSON *ad_account_convertToJSON(ad_account_t *ad_account) {
    cJSON *item = cJSON_CreateObject();

    // ad_account->id
    if(ad_account->id) { 
    if(cJSON_AddStringToObject(item, "id", ad_account->id) == NULL) {
    goto fail; //String
    }
     } 


    // ad_account->name
    if(ad_account->name) { 
    if(cJSON_AddStringToObject(item, "name", ad_account->name) == NULL) {
    goto fail; //String
    }
     } 


    // ad_account->owner
    if(ad_account->owner) { 
    cJSON *owner_local_JSON = ad_account_owner_convertToJSON(ad_account->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // ad_account->country
    
    cJSON *country_local_JSON = country_convertToJSON(ad_account->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    


    // ad_account->currency
    
    cJSON *currency_local_JSON = currency_convertToJSON(ad_account->currency);
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

ad_account_t *ad_account_parseFromJSON(cJSON *ad_accountJSON){

    ad_account_t *ad_account_local_var = NULL;

    // define the local variable for ad_account->owner
    ad_account_owner_t *owner_local_nonprim = NULL;

    // define the local variable for ad_account->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for ad_account->currency
    currency_t *currency_local_nonprim = NULL;

    // ad_account->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // ad_account->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // ad_account->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "owner");
    if (owner) { 
    owner_local_nonprim = ad_account_owner_parseFromJSON(owner); //nonprimitive
    }

    // ad_account->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "country");
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // ad_account->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ad_accountJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }


    ad_account_local_var = ad_account_create (
        id ? strdup(id->valuestring) : NULL,
        name ? strdup(name->valuestring) : NULL,
        owner ? owner_local_nonprim : NULL,
        country ? country_local_nonprim : NULL,
        currency ? currency_local_nonprim : NULL
        );

    return ad_account_local_var;
end:
    if (owner_local_nonprim) {
        ad_account_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (currency_local_nonprim) {
        currency_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
