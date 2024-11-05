#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "items_batch_post_request.h"


char* items_batch_post_request_catalog_type_ToString(pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e items_batch_post_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* items_batch_post_request_country_ToString(pinterest_rest_api_items_batch_post_request__e country) {
    char* countryArray[] =  { "NULL", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW" };
    return countryArray[country];
}

pinterest_rest_api_items_batch_post_request__e items_batch_post_request_country_FromString(char* country){
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
char* items_batch_post_request_operation_ToString(pinterest_rest_api_items_batch_post_request__e operation) {
    char* operationArray[] =  { "NULL", "UPDATE", "UPSERT", "CREATE", "DELETE_DISCONTINUED", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_items_batch_post_request__e items_batch_post_request_operation_FromString(char* operation){
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

items_batch_post_request_t *items_batch_post_request_create(
    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type,
    country_t *country,
    catalogs_items_request_language_t *language,
    list_t *items,
    char *catalog_id,
    batch_operation_t *operation
    ) {
    items_batch_post_request_t *items_batch_post_request_local_var = malloc(sizeof(items_batch_post_request_t));
    if (!items_batch_post_request_local_var) {
        return NULL;
    }
    items_batch_post_request_local_var->catalog_type = catalog_type;
    items_batch_post_request_local_var->country = country;
    items_batch_post_request_local_var->language = language;
    items_batch_post_request_local_var->items = items;
    items_batch_post_request_local_var->catalog_id = catalog_id;
    items_batch_post_request_local_var->operation = operation;

    return items_batch_post_request_local_var;
}


void items_batch_post_request_free(items_batch_post_request_t *items_batch_post_request) {
    if(NULL == items_batch_post_request){
        return ;
    }
    listEntry_t *listEntry;
    if (items_batch_post_request->country) {
        country_free(items_batch_post_request->country);
        items_batch_post_request->country = NULL;
    }
    if (items_batch_post_request->language) {
        catalogs_items_request_language_free(items_batch_post_request->language);
        items_batch_post_request->language = NULL;
    }
    if (items_batch_post_request->items) {
        list_ForEach(listEntry, items_batch_post_request->items) {
            item_delete_batch_record_free(listEntry->data);
        }
        list_freeList(items_batch_post_request->items);
        items_batch_post_request->items = NULL;
    }
    if (items_batch_post_request->catalog_id) {
        free(items_batch_post_request->catalog_id);
        items_batch_post_request->catalog_id = NULL;
    }
    if (items_batch_post_request->operation) {
        batch_operation_free(items_batch_post_request->operation);
        items_batch_post_request->operation = NULL;
    }
    free(items_batch_post_request);
}

cJSON *items_batch_post_request_convertToJSON(items_batch_post_request_t *items_batch_post_request) {
    cJSON *item = cJSON_CreateObject();

    // items_batch_post_request->catalog_type
    if (pinterest_rest_api_items_batch_post_request_CATALOGTYPE_NULL == items_batch_post_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typeitems_batch_post_request_ToString(items_batch_post_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // items_batch_post_request->country
    if (pinterest_rest_api_items_batch_post_request__NULL == items_batch_post_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(items_batch_post_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // items_batch_post_request->language
    if (!items_batch_post_request->language) {
        goto fail;
    }
    cJSON *language_local_JSON = catalogs_items_request_language_convertToJSON(items_batch_post_request->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // items_batch_post_request->items
    if (!items_batch_post_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (items_batch_post_request->items) {
    list_ForEach(itemsListEntry, items_batch_post_request->items) {
    cJSON *itemLocal = item_delete_batch_record_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // items_batch_post_request->catalog_id
    if(items_batch_post_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", items_batch_post_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // items_batch_post_request->operation
    if (pinterest_rest_api_items_batch_post_request__NULL == items_batch_post_request->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = batch_operation_convertToJSON(items_batch_post_request->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
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

items_batch_post_request_t *items_batch_post_request_parseFromJSON(cJSON *items_batch_post_requestJSON){

    items_batch_post_request_t *items_batch_post_request_local_var = NULL;

    // define the local variable for items_batch_post_request->country
    country_t *country_local_nonprim = NULL;

    // define the local variable for items_batch_post_request->language
    catalogs_items_request_language_t *language_local_nonprim = NULL;

    // define the local list for items_batch_post_request->items
    list_t *itemsList = NULL;

    // define the local variable for items_batch_post_request->operation
    batch_operation_t *operation_local_nonprim = NULL;

    // items_batch_post_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = items_batch_post_request_catalog_type_FromString(catalog_type->valuestring);

    // items_batch_post_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "country");
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // items_batch_post_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "language");
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = catalogs_items_request_language_parseFromJSON(language); //nonprimitive

    // items_batch_post_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "items");
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
        item_delete_batch_record_t *itemsItem = item_delete_batch_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // items_batch_post_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "catalog_id");
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // items_batch_post_request->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(items_batch_post_requestJSON, "operation");
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = batch_operation_parseFromJSON(operation); //custom


    items_batch_post_request_local_var = items_batch_post_request_create (
        catalog_typeVariable,
        country_local_nonprim,
        language_local_nonprim,
        itemsList,
        catalog_id && !cJSON_IsNull(catalog_id) ? strdup(catalog_id->valuestring) : NULL,
        operation_local_nonprim
        );

    return items_batch_post_request_local_var;
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
            item_delete_batch_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (operation_local_nonprim) {
        batch_operation_free(operation_local_nonprim);
        operation_local_nonprim = NULL;
    }
    return NULL;

}
