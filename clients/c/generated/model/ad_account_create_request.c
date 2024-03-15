#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_create_request.h"


char* ad_account_create_request_country_ToString(pinterest_rest_api_ad_account_create_request__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_ad_account_create_request__e ad_account_create_request_country_FromString(char* country){
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

ad_account_create_request_t *ad_account_create_request_create(
    country_t *country,
    char *name,
    char *owner_user_id
    ) {
    ad_account_create_request_t *ad_account_create_request_local_var = malloc(sizeof(ad_account_create_request_t));
    if (!ad_account_create_request_local_var) {
        return NULL;
    }
    ad_account_create_request_local_var->country = country;
    ad_account_create_request_local_var->name = name;
    ad_account_create_request_local_var->owner_user_id = owner_user_id;

    return ad_account_create_request_local_var;
}


void ad_account_create_request_free(ad_account_create_request_t *ad_account_create_request) {
    if(NULL == ad_account_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_create_request->country) {
        country_free(ad_account_create_request->country);
        ad_account_create_request->country = NULL;
    }
    if (ad_account_create_request->name) {
        free(ad_account_create_request->name);
        ad_account_create_request->name = NULL;
    }
    if (ad_account_create_request->owner_user_id) {
        free(ad_account_create_request->owner_user_id);
        ad_account_create_request->owner_user_id = NULL;
    }
    free(ad_account_create_request);
}

cJSON *ad_account_create_request_convertToJSON(ad_account_create_request_t *ad_account_create_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_create_request->country
    if(ad_account_create_request->country != pinterest_rest_api_ad_account_create_request__NULL) {
    cJSON *country_local_JSON = country_convertToJSON(ad_account_create_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_account_create_request->name
    if(ad_account_create_request->name) {
    if(cJSON_AddStringToObject(item, "name", ad_account_create_request->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_account_create_request->owner_user_id
    if(ad_account_create_request->owner_user_id) {
    if(cJSON_AddStringToObject(item, "owner_user_id", ad_account_create_request->owner_user_id) == NULL) {
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

ad_account_create_request_t *ad_account_create_request_parseFromJSON(cJSON *ad_account_create_requestJSON){

    ad_account_create_request_t *ad_account_create_request_local_var = NULL;

    // define the local variable for ad_account_create_request->country
    country_t *country_local_nonprim = NULL;

    // ad_account_create_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(ad_account_create_requestJSON, "country");
    if (country) { 
    country_local_nonprim = country_parseFromJSON(country); //custom
    }

    // ad_account_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_account_create_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_account_create_request->owner_user_id
    cJSON *owner_user_id = cJSON_GetObjectItemCaseSensitive(ad_account_create_requestJSON, "owner_user_id");
    if (owner_user_id) { 
    if(!cJSON_IsString(owner_user_id) && !cJSON_IsNull(owner_user_id))
    {
    goto end; //String
    }
    }


    ad_account_create_request_local_var = ad_account_create_request_create (
        country ? country_local_nonprim : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        owner_user_id && !cJSON_IsNull(owner_user_id) ? strdup(owner_user_id->valuestring) : NULL
        );

    return ad_account_create_request_local_var;
end:
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    return NULL;

}
