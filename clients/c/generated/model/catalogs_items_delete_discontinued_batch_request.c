#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_delete_discontinued_batch_request.h"



static catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_create_internal(
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_items_delete_discontinued_batch_request_LANGUAGE_e language,
    pinterest_rest_api_batch_operation__e operation,
    list_t *items
    ) {
    catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_local_var = malloc(sizeof(catalogs_items_delete_discontinued_batch_request_t));
    if (!catalogs_items_delete_discontinued_batch_request_local_var) {
        return NULL;
    }
    catalogs_items_delete_discontinued_batch_request_local_var->country = country;
    catalogs_items_delete_discontinued_batch_request_local_var->language = language;
    catalogs_items_delete_discontinued_batch_request_local_var->operation = operation;
    catalogs_items_delete_discontinued_batch_request_local_var->items = items;

    catalogs_items_delete_discontinued_batch_request_local_var->_library_owned = 1;
    return catalogs_items_delete_discontinued_batch_request_local_var;
}

__attribute__((deprecated)) catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_create(
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_items_delete_discontinued_batch_request_LANGUAGE_e language,
    pinterest_rest_api_batch_operation__e operation,
    list_t *items
    ) {
    return catalogs_items_delete_discontinued_batch_request_create_internal (
        country,
        language,
        operation,
        items
        );
}

void catalogs_items_delete_discontinued_batch_request_free(catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request) {
    if(NULL == catalogs_items_delete_discontinued_batch_request){
        return ;
    }
    if(catalogs_items_delete_discontinued_batch_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_items_delete_discontinued_batch_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_items_delete_discontinued_batch_request->items) {
        list_ForEach(listEntry, catalogs_items_delete_discontinued_batch_request->items) {
            item_delete_discontinued_batch_record_free(listEntry->data);
        }
        list_freeList(catalogs_items_delete_discontinued_batch_request->items);
        catalogs_items_delete_discontinued_batch_request->items = NULL;
    }
    free(catalogs_items_delete_discontinued_batch_request);
}

cJSON *catalogs_items_delete_discontinued_batch_request_convertToJSON(catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_items_delete_discontinued_batch_request->country
    if (pinterest_rest_api_country__NULL == catalogs_items_delete_discontinued_batch_request->country) {
        goto fail;
    }
    cJSON *country_local_JSON = country_convertToJSON(catalogs_items_delete_discontinued_batch_request->country);
    if(country_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country", country_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_delete_discontinued_batch_request->language
    if (pinterest_rest_api_catalogs_items_delete_discontinued_batch_request_LANGUAGE_NULL == catalogs_items_delete_discontinued_batch_request->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", catalogs_items_delete_discontinued_batch_request_language_ToString(catalogs_items_delete_discontinued_batch_request->language)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_items_delete_discontinued_batch_request->operation
    if (pinterest_rest_api_batch_operation__NULL == catalogs_items_delete_discontinued_batch_request->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = batch_operation_convertToJSON(catalogs_items_delete_discontinued_batch_request->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_items_delete_discontinued_batch_request->items
    if (!catalogs_items_delete_discontinued_batch_request->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (catalogs_items_delete_discontinued_batch_request->items) {
    list_ForEach(itemsListEntry, catalogs_items_delete_discontinued_batch_request->items) {
    cJSON *itemLocal = item_delete_discontinued_batch_record_convertToJSON(itemsListEntry->data);
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

catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_parseFromJSON(cJSON *catalogs_items_delete_discontinued_batch_requestJSON){

    catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_local_var = NULL;

    // define the local variable for catalogs_items_delete_discontinued_batch_request->country
    pinterest_rest_api_country__e country_local_nonprim = 0;

    // define the local variable for catalogs_items_delete_discontinued_batch_request->operation
    pinterest_rest_api_batch_operation__e operation_local_nonprim = 0;

    // define the local list for catalogs_items_delete_discontinued_batch_request->items
    list_t *itemsList = NULL;

    // catalogs_items_delete_discontinued_batch_request->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(catalogs_items_delete_discontinued_batch_requestJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (!country) {
        goto end;
    }

    
    country_local_nonprim = country_parseFromJSON(country); //custom

    // catalogs_items_delete_discontinued_batch_request->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(catalogs_items_delete_discontinued_batch_requestJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    pinterest_rest_api_catalogs_items_delete_discontinued_batch_request_LANGUAGE_e languageVariable;
    
    if(!cJSON_IsString(language))
    {
    goto end; //Enum
    }
    languageVariable = catalogs_items_delete_discontinued_batch_request_language_FromString(language->valuestring);

    // catalogs_items_delete_discontinued_batch_request->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_items_delete_discontinued_batch_requestJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = batch_operation_parseFromJSON(operation); //custom

    // catalogs_items_delete_discontinued_batch_request->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(catalogs_items_delete_discontinued_batch_requestJSON, "items");
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
        item_delete_discontinued_batch_record_t *itemsItem = item_delete_discontinued_batch_record_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    catalogs_items_delete_discontinued_batch_request_local_var = catalogs_items_delete_discontinued_batch_request_create_internal (
        country_local_nonprim,
        languageVariable,
        operation_local_nonprim,
        itemsList
        );

    return catalogs_items_delete_discontinued_batch_request_local_var;
end:
    if (country_local_nonprim) {
        country_local_nonprim = 0;
    }
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_delete_discontinued_batch_record_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
