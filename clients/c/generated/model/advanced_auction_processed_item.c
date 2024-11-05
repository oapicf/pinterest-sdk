#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advanced_auction_processed_item.h"


char* advanced_auction_processed_item_operation_ToString(pinterest_rest_api_advanced_auction_processed_item__e operation) {
    char* operationArray[] =  { "NULL", "UPSERT", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_advanced_auction_processed_item__e advanced_auction_processed_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "UPSERT", "DELETE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* advanced_auction_processed_item_country_ToString(pinterest_rest_api_advanced_auction_processed_item__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_advanced_auction_processed_item__e advanced_auction_processed_item_country_FromString(char* country){
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
char* advanced_auction_processed_item_language_ToString(pinterest_rest_api_advanced_auction_processed_item__e language) {
    char* languageArray[] =  { "NULL", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    return languageArray[language];
}

pinterest_rest_api_advanced_auction_processed_item__e advanced_auction_processed_item_language_FromString(char* language){
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
char* advanced_auction_processed_item_update_mask_ToString(pinterest_rest_api_advanced_auction_processed_item__e update_mask) {
    char *update_maskArray[] =  { "NULL", "BID", "APP_TYPE_BID_MULTIPLIER_SET", "PLACEMENT_BID_MULTIPLIER_SET" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_advanced_auction_processed_item__e advanced_auction_processed_item_update_mask_FromString(char* update_mask) {
    int stringToReturn = 0;
    char *update_maskArray[] =  { "NULL", "BID", "APP_TYPE_BID_MULTIPLIER_SET", "PLACEMENT_BID_MULTIPLIER_SET" };
    size_t sizeofArray = sizeof(update_maskArray) / sizeof(update_maskArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_mask, update_maskArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

advanced_auction_processed_item_t *advanced_auction_processed_item_create(
    advanced_auction_operation_t *operation,
    char *item_id,
    country_t *country,
    language_t *language,
    advanced_auction_bid_options_t *bid_options,
    list_t *update_mask,
    list_t *errors
    ) {
    advanced_auction_processed_item_t *advanced_auction_processed_item_local_var = malloc(sizeof(advanced_auction_processed_item_t));
    if (!advanced_auction_processed_item_local_var) {
        return NULL;
    }
    advanced_auction_processed_item_local_var->operation = operation;
    advanced_auction_processed_item_local_var->item_id = item_id;
    advanced_auction_processed_item_local_var->country = country;
    advanced_auction_processed_item_local_var->language = language;
    advanced_auction_processed_item_local_var->bid_options = bid_options;
    advanced_auction_processed_item_local_var->update_mask = update_mask;
    advanced_auction_processed_item_local_var->errors = errors;

    return advanced_auction_processed_item_local_var;
}


void advanced_auction_processed_item_free(advanced_auction_processed_item_t *advanced_auction_processed_item) {
    if(NULL == advanced_auction_processed_item){
        return ;
    }
    listEntry_t *listEntry;
    if (advanced_auction_processed_item->operation) {
        advanced_auction_operation_free(advanced_auction_processed_item->operation);
        advanced_auction_processed_item->operation = NULL;
    }
    if (advanced_auction_processed_item->item_id) {
        free(advanced_auction_processed_item->item_id);
        advanced_auction_processed_item->item_id = NULL;
    }
    if (advanced_auction_processed_item->country) {
        country_free(advanced_auction_processed_item->country);
        advanced_auction_processed_item->country = NULL;
    }
    if (advanced_auction_processed_item->language) {
        language_free(advanced_auction_processed_item->language);
        advanced_auction_processed_item->language = NULL;
    }
    if (advanced_auction_processed_item->bid_options) {
        advanced_auction_bid_options_free(advanced_auction_processed_item->bid_options);
        advanced_auction_processed_item->bid_options = NULL;
    }
    if (advanced_auction_processed_item->update_mask) {
        list_ForEach(listEntry, advanced_auction_processed_item->update_mask) {
            update_mask_bid_option_field_free(listEntry->data);
        }
        list_freeList(advanced_auction_processed_item->update_mask);
        advanced_auction_processed_item->update_mask = NULL;
    }
    if (advanced_auction_processed_item->errors) {
        list_ForEach(listEntry, advanced_auction_processed_item->errors) {
            advanced_auction_operation_error_free(listEntry->data);
        }
        list_freeList(advanced_auction_processed_item->errors);
        advanced_auction_processed_item->errors = NULL;
    }
    free(advanced_auction_processed_item);
}

cJSON *advanced_auction_processed_item_convertToJSON(advanced_auction_processed_item_t *advanced_auction_processed_item) {
    cJSON *item = cJSON_CreateObject();

    // advanced_auction_processed_item->operation
    if (pinterest_rest_api_advanced_auction_processed_item__NULL == advanced_auction_processed_item->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = advanced_auction_operation_convertToJSON(advanced_auction_processed_item->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_processed_item->item_id
    if (!advanced_auction_processed_item->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", advanced_auction_processed_item->item_id) == NULL) {
    goto fail; //String
    }


    // advanced_auction_processed_item->country
    if (pinterest_rest_api_advanced_auction_processed_item__NULL == advanced_auction_processed_item->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(advanced_auction_processed_item->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_processed_item->language
    if (pinterest_rest_api_advanced_auction_processed_item__NULL == advanced_auction_processed_item->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(advanced_auction_processed_item->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // advanced_auction_processed_item->bid_options
    if (!advanced_auction_processed_item->bid_options) {
        goto fail;
    }
    cJSON *bid_options_local_JSON = advanced_auction_bid_options_convertToJSON(advanced_auction_processed_item->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // advanced_auction_processed_item->update_mask
    if (pinterest_rest_api_advanced_auction_processed_item_UPDATEMASK_NULL == advanced_auction_processed_item->update_mask) {
        goto fail;
    }
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *update_maskListEntry;
    if (advanced_auction_processed_item->update_mask) {
    list_ForEach(update_maskListEntry, advanced_auction_processed_item->update_mask) {
    cJSON *itemLocal = update_mask_bid_option_field_convertToJSON((pinterest_rest_api_advanced_auction_processed_item__e)update_maskListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(update_mask, itemLocal);
    }
    }


    // advanced_auction_processed_item->errors
    if(advanced_auction_processed_item->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (advanced_auction_processed_item->errors) {
    list_ForEach(errorsListEntry, advanced_auction_processed_item->errors) {
    cJSON *itemLocal = advanced_auction_operation_error_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advanced_auction_processed_item_t *advanced_auction_processed_item_parseFromJSON(cJSON *advanced_auction_processed_itemJSON){

    advanced_auction_processed_item_t *advanced_auction_processed_item_local_var = NULL;

    // define the local variable for advanced_auction_processed_item->operation
    advanced_auction_operation_t *operation_local_nonprim = NULL;

    // define the local variable for advanced_auction_processed_item->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for advanced_auction_processed_item->language
    language_t *language_local_nonprim = NULL;

    // define the local variable for advanced_auction_processed_item->bid_options
    advanced_auction_bid_options_t *bid_options_local_nonprim = NULL;

    // define the local list for advanced_auction_processed_item->update_mask
    list_t *update_maskList = NULL;

    // define the local list for advanced_auction_processed_item->errors
    list_t *errorsList = NULL;

    // advanced_auction_processed_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "operation");
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = advanced_auction_operation_parseFromJSON(operation); //custom

    // advanced_auction_processed_item->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "item_id");
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // advanced_auction_processed_item->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // advanced_auction_processed_item->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "language");
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom

    // advanced_auction_processed_item->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "bid_options");
    if (!bid_options) {
        goto end;
    }

    
    bid_options_local_nonprim = advanced_auction_bid_options_parseFromJSON(bid_options); //nonprimitive

    // advanced_auction_processed_item->update_mask
    cJSON *update_mask = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "update_mask");
    if (!update_mask) {
        goto end;
    }

    
    cJSON *update_mask_local_nonprimitive = NULL;
    if(!cJSON_IsArray(update_mask)){
        goto end; //nonprimitive container
    }

    update_maskList = list_createList();

    cJSON_ArrayForEach(update_mask_local_nonprimitive,update_mask )
    {
        if(!cJSON_IsObject(update_mask_local_nonprimitive)){
            goto end;
        }
        advanced_auction_processed_item_update_mask_bid_option_field_e update_maskItem = update_mask_bid_option_field_parseFromJSON(update_mask_local_nonprimitive);

        list_addElement(update_maskList, (void *)update_maskItem);
    }

    // advanced_auction_processed_item->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(advanced_auction_processed_itemJSON, "errors");
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        advanced_auction_operation_error_t *errorsItem = advanced_auction_operation_error_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }


    advanced_auction_processed_item_local_var = advanced_auction_processed_item_create (
        operation_local_nonprim,
        strdup(item_id->valuestring),
        country_local_nonprim,
        language_local_nonprim,
        bid_options_local_nonprim,
        update_maskList,
        errors ? errorsList : NULL
        );

    return advanced_auction_processed_item_local_var;
end:
    if (operation_local_nonprim) {
        advanced_auction_operation_free(operation_local_nonprim);
        operation_local_nonprim = NULL;
    }
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (language_local_nonprim) {
        language_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (bid_options_local_nonprim) {
        advanced_auction_bid_options_free(bid_options_local_nonprim);
        bid_options_local_nonprim = NULL;
    }
    if (update_maskList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, update_maskList) {
            update_mask_bid_option_field_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(update_maskList);
        update_maskList = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            advanced_auction_operation_error_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
