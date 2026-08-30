#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_batch_request.h"


char* catalogs_retail_batch_request_catalog_type_ToString(pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalogs_retail_batch_request_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_retail_batch_request_t *catalogs_retail_batch_request_create_internal(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_catalogs_retail_batch_request_LANGUAGE_e language
    ) {
    catalogs_retail_batch_request_t *catalogs_retail_batch_request_local_var = malloc(sizeof(catalogs_retail_batch_request_t));
    if (!catalogs_retail_batch_request_local_var) {
        return NULL;
    }
    memset(catalogs_retail_batch_request_local_var, 0, sizeof(catalogs_retail_batch_request_t));
    catalogs_retail_batch_request_local_var->_library_owned = 1;
    catalogs_retail_batch_request_local_var->catalog_id = catalog_id;
    catalogs_retail_batch_request_local_var->catalog_type = catalog_type;
    catalogs_retail_batch_request_local_var->country = country;
    catalogs_retail_batch_request_local_var->items = items;
    catalogs_retail_batch_request_local_var->language = language;
    return catalogs_retail_batch_request_local_var;
}

__attribute__((deprecated)) catalogs_retail_batch_request_t *catalogs_retail_batch_request_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    list_t *items,
    pinterest_rest_api_catalogs_retail_batch_request_LANGUAGE_e language
    ) {
    catalogs_retail_batch_request_t *result = catalogs_retail_batch_request_create_internal (
        catalog_id,
        catalog_type,
        country,
        items,
        language
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_batch_request_free(catalogs_retail_batch_request_t *catalogs_retail_batch_request) {
    if(NULL == catalogs_retail_batch_request){
        return ;
    }
    if(catalogs_retail_batch_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_batch_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_batch_request->catalog_id) {
        free(catalogs_retail_batch_request->catalog_id);
        catalogs_retail_batch_request->catalog_id = NULL;
    }
    if (catalogs_retail_batch_request->items) {
        list_ForEach(listEntry, catalogs_retail_batch_request->items) {
            catalogs_retail_batch_request_items_items_free(listEntry->data);
        }
        list_freeList(catalogs_retail_batch_request->items);
        catalogs_retail_batch_request->items = NULL;
    }
    free(catalogs_retail_batch_request);
}

cJSON *catalogs_retail_batch_request_convertToJSON(catalogs_retail_batch_request_t *catalogs_retail_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_batch_request->catalog_id
    if(catalogs_retail_batch_request->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_retail_batch_request->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_batch_request->catalog_type
    if (pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_NULL == catalogs_retail_batch_request->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalogs_retail_batch_request_catalog_type_ToString(catalogs_retail_batch_request->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_retail_batch_request->country
    if (pinterest_rest_api_country__NULL == catalogs_retail_batch_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_retail_batch_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_batch_request->items
    if (!catalogs_retail_batch_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_retail_batch_request->items) {
    list_ForEach(itemsListEntry, catalogs_retail_batch_request->items) {
    cJSON *itemLocal = catalogs_retail_batch_request_items_items_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // catalogs_retail_batch_request->language
    if (pinterest_rest_api_catalogs_retail_batch_request_LANGUAGE_NULL == catalogs_retail_batch_request->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", catalogs_retail_batch_request_language_ToString(catalogs_retail_batch_request->language)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_batch_request_t *catalogs_retail_batch_request_parseFromJSON(cJSON *catalogs_retail_batch_requestJSON){

    catalogs_retail_batch_request_t *catalogs_retail_batch_request_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_retail_batch_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local list for catalogs_retail_batch_request->items
    list_t *itemsList = NULL;

    // catalogs_retail_batch_request->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_requestJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_batch_request->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_requestJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_batch_request_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_retail_batch_request_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_retail_batch_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_retail_batch_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_requestJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
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
        catalogs_retail_batch_request_items_items_t *itemsItem = catalogs_retail_batch_request_items_items_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // catalogs_retail_batch_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_retail_batch_requestJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    pinterest_rest_api_catalogs_retail_batch_request_LANGUAGE_e languageVariable;
    
    if(!cJSON_IsString(language))
    {
    goto end; //Enum
    }
    languageVariable = catalogs_retail_batch_request_language_FromString(language->valuestring);


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);

    catalogs_retail_batch_request_local_var = catalogs_retail_batch_request_create_internal (
        catalog_id_local_str,
        catalog_typeVariable,
        country_local_nonprim,
        itemsList,
        languageVariable
        );

    if (!catalogs_retail_batch_request_local_var) {
        goto end;
    }

    return catalogs_retail_batch_request_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            catalogs_retail_batch_request_items_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
