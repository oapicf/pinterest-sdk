#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_item_error_response.h"



static catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_create_internal(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *item_id,
    list_t *errors
    ) {
    catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_local_var = malloc(sizeof(catalogs_retail_item_error_response_t));
    if (!catalogs_retail_item_error_response_local_var) {
        return NULL;
    }
    catalogs_retail_item_error_response_local_var->catalog_type = catalog_type;
    catalogs_retail_item_error_response_local_var->item_id = item_id;
    catalogs_retail_item_error_response_local_var->errors = errors;

    catalogs_retail_item_error_response_local_var->_library_owned = 1;
    return catalogs_retail_item_error_response_local_var;
}

__attribute__((deprecated)) catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *item_id,
    list_t *errors
    ) {
    return catalogs_retail_item_error_response_create_internal (
        catalog_type,
        item_id,
        errors
        );
}

void catalogs_retail_item_error_response_free(catalogs_retail_item_error_response_t *catalogs_retail_item_error_response) {
    if(NULL == catalogs_retail_item_error_response){
        return ;
    }
    if(catalogs_retail_item_error_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_item_error_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_item_error_response->item_id) {
        free(catalogs_retail_item_error_response->item_id);
        catalogs_retail_item_error_response->item_id = NULL;
    }
    if (catalogs_retail_item_error_response->errors) {
        list_ForEach(listEntry, catalogs_retail_item_error_response->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(catalogs_retail_item_error_response->errors);
        catalogs_retail_item_error_response->errors = NULL;
    }
    free(catalogs_retail_item_error_response);
}

cJSON *catalogs_retail_item_error_response_convertToJSON(catalogs_retail_item_error_response_t *catalogs_retail_item_error_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_item_error_response->catalog_type
    if (pinterest_rest_api_catalogs_type__NULL == catalogs_retail_item_error_response->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_retail_item_error_response->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_item_error_response->item_id
    if(catalogs_retail_item_error_response->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", catalogs_retail_item_error_response->item_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_item_error_response->errors
    if(catalogs_retail_item_error_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (catalogs_retail_item_error_response->errors) {
    list_ForEach(errorsListEntry, catalogs_retail_item_error_response->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
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

catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_parseFromJSON(cJSON *catalogs_retail_item_error_responseJSON){

    catalogs_retail_item_error_response_t *catalogs_retail_item_error_response_local_var = NULL;

    // define the local variable for catalogs_retail_item_error_response->catalog_type
    pinterest_rest_api_catalogs_type__e catalog_type_local_nonprim = 0;

    // define the local list for catalogs_retail_item_error_response->errors
    list_t *errorsList = NULL;

    // catalogs_retail_item_error_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_error_responseJSON, "catalog_type");
    if (cJSON_IsNull(catalog_type)) {
        catalog_type = NULL;
    }
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_retail_item_error_response->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_error_responseJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_item_error_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_error_responseJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
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
        item_validation_event_t *errorsItem = item_validation_event_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }


    catalogs_retail_item_error_response_local_var = catalogs_retail_item_error_response_create_internal (
        catalog_type_local_nonprim,
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        errors ? errorsList : NULL
        );

    return catalogs_retail_item_error_response_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalog_type_local_nonprim = 0;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
