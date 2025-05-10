#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_delete_retail_item.h"


char* catalogs_delete_retail_item_operation_ToString(pinterest_rest_api_catalogs_delete_retail_item_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_catalogs_delete_retail_item_OPERATION_e catalogs_delete_retail_item_operation_FromString(char* operation){
    int stringToReturn = 0;
    char *operationArray[] =  { "NULL", "DELETE" };
    size_t sizeofArray = sizeof(operationArray) / sizeof(operationArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(operation, operationArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_delete_retail_item_t *catalogs_delete_retail_item_create_internal(
    char *item_id,
    pinterest_rest_api_catalogs_delete_retail_item_OPERATION_e operation
    ) {
    catalogs_delete_retail_item_t *catalogs_delete_retail_item_local_var = malloc(sizeof(catalogs_delete_retail_item_t));
    if (!catalogs_delete_retail_item_local_var) {
        return NULL;
    }
    catalogs_delete_retail_item_local_var->item_id = item_id;
    catalogs_delete_retail_item_local_var->operation = operation;

    catalogs_delete_retail_item_local_var->_library_owned = 1;
    return catalogs_delete_retail_item_local_var;
}

__attribute__((deprecated)) catalogs_delete_retail_item_t *catalogs_delete_retail_item_create(
    char *item_id,
    pinterest_rest_api_catalogs_delete_retail_item_OPERATION_e operation
    ) {
    return catalogs_delete_retail_item_create_internal (
        item_id,
        operation
        );
}

void catalogs_delete_retail_item_free(catalogs_delete_retail_item_t *catalogs_delete_retail_item) {
    if(NULL == catalogs_delete_retail_item){
        return ;
    }
    if(catalogs_delete_retail_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_delete_retail_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_delete_retail_item->item_id) {
        free(catalogs_delete_retail_item->item_id);
        catalogs_delete_retail_item->item_id = NULL;
    }
    free(catalogs_delete_retail_item);
}

cJSON *catalogs_delete_retail_item_convertToJSON(catalogs_delete_retail_item_t *catalogs_delete_retail_item) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_delete_retail_item->item_id
    if (!catalogs_delete_retail_item->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_delete_retail_item->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_delete_retail_item->operation
    if (pinterest_rest_api_catalogs_delete_retail_item_OPERATION_NULL == catalogs_delete_retail_item->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", catalogs_delete_retail_item_operation_ToString(catalogs_delete_retail_item->operation)) == NULL)
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

catalogs_delete_retail_item_t *catalogs_delete_retail_item_parseFromJSON(cJSON *catalogs_delete_retail_itemJSON){

    catalogs_delete_retail_item_t *catalogs_delete_retail_item_local_var = NULL;

    // catalogs_delete_retail_item->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_delete_retail_itemJSON, "item_id");
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

    // catalogs_delete_retail_item->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(catalogs_delete_retail_itemJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_catalogs_delete_retail_item_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = catalogs_delete_retail_item_operation_FromString(operation->valuestring);


    catalogs_delete_retail_item_local_var = catalogs_delete_retail_item_create_internal (
        strdup(item_id->valuestring),
        operationVariable
        );

    return catalogs_delete_retail_item_local_var;
end:
    return NULL;

}
