#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_create_batch_request.h"


char* catalogs_items_create_batch_request_country_ToString(pinterest_rest_api_catalogs_items_create_batch_request__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_catalogs_items_create_batch_request__e catalogs_items_create_batch_request_country_FromString(char* country){
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
char* catalogs_items_create_batch_request_language_ToString(pinterest_rest_api_catalogs_items_create_batch_request__e language) {
    char* languageArray[] =  { "NULL", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    return languageArray[language];
}

pinterest_rest_api_catalogs_items_create_batch_request__e catalogs_items_create_batch_request_language_FromString(char* language){
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
char* catalogs_items_create_batch_request_operation_ToString(pinterest_rest_api_catalogs_items_create_batch_request__e operation) {
    char* operationArray[] =  { "NULL", "UPDATE", "UPSERT", "CREATE", "DELETE_DISCONTINUED", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_items_create_batch_request__e catalogs_items_create_batch_request_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "UPDATE", "UPSERT", "CREATE", "DELETE_DISCONTINUED", "DELETE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_items_create_batch_request_t *catalogs_items_create_batch_request_create(
    country_t *country,
    language_t *language,
    batch_operation_t *operation,
    list_t *items
    ) {
    catalogs_items_create_batch_request_t *catalogs_items_create_batch_request_local_var = malloc(sizeof(catalogs_items_create_batch_request_t));
    if (!catalogs_items_create_batch_request_local_var) {
        return NULL;
    }
    catalogs_items_create_batch_request_local_var->country = country;
    catalogs_items_create_batch_request_local_var->language = language;
    catalogs_items_create_batch_request_local_var->operation = operation;
    catalogs_items_create_batch_request_local_var->items = items;

    return catalogs_items_create_batch_request_local_var;
}


void catalogs_items_create_batch_request_free(catalogs_items_create_batch_request_t *catalogs_items_create_batch_request) {
    if(NULL == catalogs_items_create_batch_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items_create_batch_request->country) {
        country_free(catalogs_items_create_batch_request->country);
        catalogs_items_create_batch_request->country = NULL;
    }
    if (catalogs_items_create_batch_request->language) {
        language_free(catalogs_items_create_batch_request->language);
        catalogs_items_create_batch_request->language = NULL;
    }
    if (catalogs_items_create_batch_request->operation) {
        batch_operation_free(catalogs_items_create_batch_request->operation);
        catalogs_items_create_batch_request->operation = NULL;
    }
    if (catalogs_items_create_batch_request->items) {
        list_ForEach(listEntry, catalogs_items_create_batch_request->items) {
            item_create_batch_record_free(listEntry->data);
        }
        list_freeList(catalogs_items_create_batch_request->items);
        catalogs_items_create_batch_request->items = NULL;
    }
    free(catalogs_items_create_batch_request);
}

cJSON *catalogs_items_create_batch_request_convertToJSON(catalogs_items_create_batch_request_t *catalogs_items_create_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items_create_batch_request->country
    if (pinterest_rest_api_catalogs_items_create_batch_request__NULL == catalogs_items_create_batch_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_items_create_batch_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_create_batch_request->language
    if (pinterest_rest_api_catalogs_items_create_batch_request__NULL == catalogs_items_create_batch_request->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_convertToJSON(catalogs_items_create_batch_request->language);
    if(language_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_create_batch_request->operation
    if (pinterest_rest_api_catalogs_items_create_batch_request__NULL == catalogs_items_create_batch_request->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = batch_operation_convertToJSON(catalogs_items_create_batch_request->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_create_batch_request->items
    if (!catalogs_items_create_batch_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_items_create_batch_request->items) {
    list_ForEach(itemsListEntry, catalogs_items_create_batch_request->items) {
    cJSON *itemLocal = item_create_batch_record_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_items_create_batch_request_t *catalogs_items_create_batch_request_parseFromJSON(cJSON *catalogs_items_create_batch_requestJSON){

    catalogs_items_create_batch_request_t *catalogs_items_create_batch_request_local_var = NULL;

    // define the local variable for catalogs_items_create_batch_request->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for catalogs_items_create_batch_request->language
    language_t *language_local_nonprim = NULL;

    // define the local variable for catalogs_items_create_batch_request->operation
    batch_operation_t *operation_local_nonprim = NULL;

    // define the local list for catalogs_items_create_batch_request->items
    list_t *itemsList = NULL;

    // catalogs_items_create_batch_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_items_create_batch_requestJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_items_create_batch_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_items_create_batch_requestJSON, "language");
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_parseFromJSON(language); //custom

    // catalogs_items_create_batch_request->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_items_create_batch_requestJSON, "operation");
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = batch_operation_parseFromJSON(operation); //custom

    // catalogs_items_create_batch_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_items_create_batch_requestJSON, "items");
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        item_create_batch_record_t *itemsItem = item_create_batch_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    catalogs_items_create_batch_request_local_var = catalogs_items_create_batch_request_create (
        country_local_nonprim,
        language_local_nonprim,
        operation_local_nonprim,
        itemsList
        );

    return catalogs_items_create_batch_request_local_var;
end:
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (language_local_nonprim) {
        language_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (operation_local_nonprim) {
        batch_operation_free(operation_local_nonprim);
        operation_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_create_batch_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
