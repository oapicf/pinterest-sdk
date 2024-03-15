#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_country_response_data.h"


char* ad_accounts_country_response_data_code_ToString(pinterest_rest_api_ad_accounts_country_response_data__e code) {
    char* codeArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return codeArray[code];
}

pinterest_rest_api_ad_accounts_country_response_data__e ad_accounts_country_response_data_code_FromString(char* code){
    int stringToReturn = 0;
    char *codeArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    size_t sizeofArray = sizeof(codeArray) / sizeof(codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(code, codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

ad_accounts_country_response_data_t *ad_accounts_country_response_data_create(
    ad_country_t *code,
    char *currency,
    double index,
    char *name
    ) {
    ad_accounts_country_response_data_t *ad_accounts_country_response_data_local_var = malloc(sizeof(ad_accounts_country_response_data_t));
    if (!ad_accounts_country_response_data_local_var) {
        return NULL;
    }
    ad_accounts_country_response_data_local_var->code = code;
    ad_accounts_country_response_data_local_var->currency = currency;
    ad_accounts_country_response_data_local_var->index = index;
    ad_accounts_country_response_data_local_var->name = name;

    return ad_accounts_country_response_data_local_var;
}


void ad_accounts_country_response_data_free(ad_accounts_country_response_data_t *ad_accounts_country_response_data) {
    if(NULL == ad_accounts_country_response_data){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_country_response_data->code) {
        ad_country_free(ad_accounts_country_response_data->code);
        ad_accounts_country_response_data->code = NULL;
    }
    if (ad_accounts_country_response_data->currency) {
        free(ad_accounts_country_response_data->currency);
        ad_accounts_country_response_data->currency = NULL;
    }
    if (ad_accounts_country_response_data->name) {
        free(ad_accounts_country_response_data->name);
        ad_accounts_country_response_data->name = NULL;
    }
    free(ad_accounts_country_response_data);
}

cJSON *ad_accounts_country_response_data_convertToJSON(ad_accounts_country_response_data_t *ad_accounts_country_response_data) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_country_response_data->code
    if(ad_accounts_country_response_data->code != pinterest_rest_api_ad_accounts_country_response_data__NULL) {
    cJSON *code_local_JSON = ad_country_convertToJSON(ad_accounts_country_response_data->code);
    if(code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "code", code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_country_response_data->currency
    if(ad_accounts_country_response_data->currency) {
    if(cJSON_AddStringToObject(item, "currency", ad_accounts_country_response_data->currency) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_country_response_data->index
    if(ad_accounts_country_response_data->index) {
    if(cJSON_AddNumberToObject(item, "index", ad_accounts_country_response_data->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_country_response_data->name
    if(ad_accounts_country_response_data->name) {
    if(cJSON_AddStringToObject(item, "name", ad_accounts_country_response_data->name) == NULL) {
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

ad_accounts_country_response_data_t *ad_accounts_country_response_data_parseFromJSON(cJSON *ad_accounts_country_response_dataJSON){

    ad_accounts_country_response_data_t *ad_accounts_country_response_data_local_var = NULL;

    // define the local variable for ad_accounts_country_response_data->code
    ad_country_t *code_local_nonprim = NULL;

    // ad_accounts_country_response_data->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "code");
    if (code) { 
    code_local_nonprim = ad_country_parseFromJSON(code); //custom
    }

    // ad_accounts_country_response_data->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "currency");
    if (currency) { 
    if(!cJSON_IsString(currency) && !cJSON_IsNull(currency))
    {
    goto end; //String
    }
    }

    // ad_accounts_country_response_data->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // ad_accounts_country_response_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accounts_country_response_dataJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    ad_accounts_country_response_data_local_var = ad_accounts_country_response_data_create (
        code ? code_local_nonprim : NULL,
        currency && !cJSON_IsNull(currency) ? strdup(currency->valuestring) : NULL,
        index ? index->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return ad_accounts_country_response_data_local_var;
end:
    if (code_local_nonprim) {
        ad_country_free(code_local_nonprim);
        code_local_nonprim = NULL;
    }
    return NULL;

}
