#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_batch_request.h"


char* catalogs_hotel_batch_request_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_batch_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_hotel_batch_request_CATALOGTYPE_e catalogs_hotel_batch_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_hotel_batch_request_country_ToString(pinterest_rest_api_catalogs_hotel_batch_request__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_catalogs_hotel_batch_request__e catalogs_hotel_batch_request_country_FromString(char* country){
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

catalogs_hotel_batch_request_t *catalogs_hotel_batch_request_create(
    pinterest_rest_api_catalogs_hotel_batch_request_CATALOGTYPE_e catalog_type,
    country_t *country,
    catalogs_items_request_language_t *language,
    list_t *items,
    char *catalog_id
    ) {
    catalogs_hotel_batch_request_t *catalogs_hotel_batch_request_local_var = malloc(sizeof(catalogs_hotel_batch_request_t));
    if (!catalogs_hotel_batch_request_local_var) {
        return NULL;
    }
    catalogs_hotel_batch_request_local_var->catalog_type = catalog_type;
    catalogs_hotel_batch_request_local_var->country = country;
    catalogs_hotel_batch_request_local_var->language = language;
    catalogs_hotel_batch_request_local_var->items = items;
    catalogs_hotel_batch_request_local_var->catalog_id = catalog_id;

    return catalogs_hotel_batch_request_local_var;
}


void catalogs_hotel_batch_request_free(catalogs_hotel_batch_request_t *catalogs_hotel_batch_request) {
    if(NULL == catalogs_hotel_batch_request){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_batch_request->country) {
        country_free(catalogs_hotel_batch_request->country);
        catalogs_hotel_batch_request->country = NULL;
    }
    if (catalogs_hotel_batch_request->language) {
        catalogs_items_request_language_free(catalogs_hotel_batch_request->language);
        catalogs_hotel_batch_request->language = NULL;
    }
    if (catalogs_hotel_batch_request->items) {
        list_ForEach(listEntry, catalogs_hotel_batch_request->items) {
            catalogs_hotel_batch_item_free(listEntry->data);
        }
        list_freeList(catalogs_hotel_batch_request->items);
        catalogs_hotel_batch_request->items = NULL;
    }
    if (catalogs_hotel_batch_request->catalog_id) {
        free(catalogs_hotel_batch_request->catalog_id);
        catalogs_hotel_batch_request->catalog_id = NULL;
    }
    free(catalogs_hotel_batch_request);
}

cJSON *catalogs_hotel_batch_request_convertToJSON(catalogs_hotel_batch_request_t *catalogs_hotel_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_batch_request->catalog_type
    if (pinterest_rest_api_catalogs_hotel_batch_request_CATALOGTYPE_NULL == catalogs_hotel_batch_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_hotel_batch_request_ToString(catalogs_hotel_batch_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_hotel_batch_request->country
    if (pinterest_rest_api_catalogs_hotel_batch_request__NULL == catalogs_hotel_batch_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_hotel_batch_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_hotel_batch_request->language
    if (!catalogs_hotel_batch_request->language) {
        goto fail;
    }
    cJSON *language_local_JSON = catalogs_items_request_language_convertToJSON(catalogs_hotel_batch_request->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_hotel_batch_request->items
    if (!catalogs_hotel_batch_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_hotel_batch_request->items) {
    list_ForEach(itemsListEntry, catalogs_hotel_batch_request->items) {
    cJSON *itemLocal = catalogs_hotel_batch_item_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // catalogs_hotel_batch_request->catalog_id
    if(catalogs_hotel_batch_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_hotel_batch_request->catalog_id) == NULL) {
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

catalogs_hotel_batch_request_t *catalogs_hotel_batch_request_parseFromJSON(cJSON *catalogs_hotel_batch_requestJSON){

    catalogs_hotel_batch_request_t *catalogs_hotel_batch_request_local_var = NULL;

    // define the local variable for catalogs_hotel_batch_request->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for catalogs_hotel_batch_request->language
    catalogs_items_request_language_t *language_local_nonprim = NULL;

    // define the local list for catalogs_hotel_batch_request->items
    list_t *itemsList = NULL;

    // catalogs_hotel_batch_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_batch_requestJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_hotel_batch_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_hotel_batch_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_hotel_batch_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_batch_requestJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_hotel_batch_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_batch_requestJSON, "language");
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = catalogs_items_request_language_parseFromJSON(language); //nonprimitive

    // catalogs_hotel_batch_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_batch_requestJSON, "items");
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
        catalogs_hotel_batch_item_t *itemsItem = catalogs_hotel_batch_item_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // catalogs_hotel_batch_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_batch_requestJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }


    catalogs_hotel_batch_request_local_var = catalogs_hotel_batch_request_create (
        catalog_typeVariable,
        country_local_nonprim,
        language_local_nonprim,
        itemsList,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL
        );

    return catalogs_hotel_batch_request_local_var;
end:
    if (country_local_nonprim) {
        country_free(country_local_nonprim);
        country_local_nonprim = NULL;
    }
    if (language_local_nonprim) {
        catalogs_items_request_language_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_hotel_batch_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
