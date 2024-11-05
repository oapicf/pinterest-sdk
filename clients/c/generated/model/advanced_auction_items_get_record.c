#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_items_get_record.h"


char* advanced_auction_items_get_record_country_ToString(pinterest_rest_api_advanced_auction_items_get_record__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_advanced_auction_items_get_record__e advanced_auction_items_get_record_country_FromString(char* country){
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
char* advanced_auction_items_get_record_language_ToString(pinterest_rest_api_advanced_auction_items_get_record__e language) {
    char* languageArray[] =  { "NULL", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    return languageArray[language];
}

pinterest_rest_api_advanced_auction_items_get_record__e advanced_auction_items_get_record_language_FromString(char* language){
    int stringToReturn = 0;
    char *languageArray[] =  { "NULL", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    size_t sizeofArray = sizeof(languageArray) / sizeof(languageArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(language, languageArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

advanced_auction_items_get_record_t *advanced_auction_items_get_record_create(
    char *item_id,
    country_t *country,
    language_t *language
    ) {
    advanced_auction_items_get_record_t *advanced_auction_items_get_record_local_var = malloc(sizeof(advanced_auction_items_get_record_t));
    if (!advanced_auction_items_get_record_local_var) {
        return NULL;
    }
    advanced_auction_items_get_record_local_var->item_id = item_id;
    advanced_auction_items_get_record_local_var->country = country;
    advanced_auction_items_get_record_local_var->language = language;

    return advanced_auction_items_get_record_local_var;
}


void advanced_auction_items_get_record_free(advanced_auction_items_get_record_t *advanced_auction_items_get_record) {
    if(NULL == advanced_auction_items_get_record){
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_items_get_record->item_id) {
        free(advanced_auction_items_get_record->item_id);
        advanced_auction_items_get_record->item_id = NULL;
    }
    if (advanced_auction_items_get_record->country) {
        country_free(advanced_auction_items_get_record->country);
        advanced_auction_items_get_record->country = NULL;
    }
    if (advanced_auction_items_get_record->language) {
        language_free(advanced_auction_items_get_record->language);
        advanced_auction_items_get_record->language = NULL;
    }
    free(advanced_auction_items_get_record);
}

cJSON *advanced_auction_items_get_record_convertToJSON(advanced_auction_items_get_record_t *advanced_auction_items_get_record) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_items_get_record->item_id
    if (!advanced_auction_items_get_record->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", advanced_auction_items_get_record->item_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_items_get_record->country
    if (pinterest_rest_api_advanced_auction_items_get_record__NULL == advanced_auction_items_get_record->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(advanced_auction_items_get_record->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_items_get_record->language
    if (pinterest_rest_api_advanced_auction_items_get_record__NULL == advanced_auction_items_get_record->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(advanced_auction_items_get_record->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
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

advanced_auction_items_get_record_t *advanced_auction_items_get_record_parseFromJSON(cJSON *advanced_auction_items_get_recordJSON){

    advanced_auction_items_get_record_t *advanced_auction_items_get_record_local_var = NULL;

    // define the local variable for advanced_auction_items_get_record->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for advanced_auction_items_get_record->language
    language_t *language_local_nonprim = NULL;

    // advanced_auction_items_get_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_recordJSON, "item_id");
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // advanced_auction_items_get_record->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_recordJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // advanced_auction_items_get_record->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(advanced_auction_items_get_recordJSON, "language");
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom


    advanced_auction_items_get_record_local_var = advanced_auction_items_get_record_create (
        strdup(item_id->valuestring),
        country_local_nonprim,
        language_local_nonprim
        );

    return advanced_auction_items_get_record_local_var;
end:
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (language_local_nonprim) {
        language_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
