#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_upsert_retail_item.h"


char* catalogs_upsert_retail_item_operation_ToString(pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "UPSERT" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e catalogs_upsert_retail_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "UPSERT" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_create_internal(
    item_attributes_request_t *attributes,
    char *item_id,
    pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operation
    ) {
    catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_local_var = malloc(sizeof(catalogs_upsert_retail_item_t));
    if (!catalogs_upsert_retail_item_local_var) {
        return NULL;
    }
    memset(catalogs_upsert_retail_item_local_var, 0, sizeof(catalogs_upsert_retail_item_t));
    catalogs_upsert_retail_item_local_var->_library_owned = 1;
    catalogs_upsert_retail_item_local_var->attributes = attributes;
    catalogs_upsert_retail_item_local_var->item_id = item_id;
    catalogs_upsert_retail_item_local_var->operation = operation;
    return catalogs_upsert_retail_item_local_var;
}

__attribute__((deprecated)) catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_create(
    item_attributes_request_t *attributes,
    char *item_id,
    pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operation
    ) {
    catalogs_upsert_retail_item_t *result = catalogs_upsert_retail_item_create_internal (
        attributes,
        item_id,
        operation
        );
    if (!result) {
    }
    return result;
}

void catalogs_upsert_retail_item_free(catalogs_upsert_retail_item_t *catalogs_upsert_retail_item) {
    if(NULL == catalogs_upsert_retail_item){
        return ;
    }
    if(catalogs_upsert_retail_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_upsert_retail_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_upsert_retail_item->attributes) {
        item_attributes_request_free(catalogs_upsert_retail_item->attributes);
        catalogs_upsert_retail_item->attributes = NULL;
    }
    if (catalogs_upsert_retail_item->item_id) {
        free(catalogs_upsert_retail_item->item_id);
        catalogs_upsert_retail_item->item_id = NULL;
    }
    free(catalogs_upsert_retail_item);
}

cJSON *catalogs_upsert_retail_item_convertToJSON(catalogs_upsert_retail_item_t *catalogs_upsert_retail_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_upsert_retail_item->attributes
    if (!catalogs_upsert_retail_item->attributes) {
        goto fail;
    }
    cJSON *attributes_local_JSON = item_attributes_request_convertToJSON(catalogs_upsert_retail_item->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_upsert_retail_item->item_id
    if (!catalogs_upsert_retail_item->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_upsert_retail_item->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_upsert_retail_item->operation
    if (pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_NULL == catalogs_upsert_retail_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", catalogs_upsert_retail_item_operation_ToString(catalogs_upsert_retail_item->operation)) == NULL)
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

catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_parseFromJSON(cJSON *catalogs_upsert_retail_itemJSON){

    catalogs_upsert_retail_item_t *catalogs_upsert_retail_item_local_var = NULL;

    // define the local variable for catalogs_upsert_retail_item->attributes
    item_attributes_request_t *attributes_local_nonprim = NULL;

    char *item_id_local_str = NULL;

    // catalogs_upsert_retail_item->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_upsert_retail_itemJSON, "attributes");
    if (cJSON_IsNull(attributes)) {
        attributes = NULL;
    }
    if (!attributes) {
        goto end;
    }

    
    attributes_local_nonprim = item_attributes_request_parseFromJSON(attributes); //nonprimitive

    // catalogs_upsert_retail_item->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_upsert_retail_itemJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // catalogs_upsert_retail_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_upsert_retail_itemJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_upsert_retail_item_operation_FromString(operation->valuestring);


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    catalogs_upsert_retail_item_local_var = catalogs_upsert_retail_item_create_internal (
        attributes_local_nonprim,
        item_id_local_str,
        operationVariable
        );

    if (!catalogs_upsert_retail_item_local_var) {
        goto end;
    }

    return catalogs_upsert_retail_item_local_var;
end:
    if (attributes_local_nonprim) {
        item_attributes_request_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    return NULL;

}
