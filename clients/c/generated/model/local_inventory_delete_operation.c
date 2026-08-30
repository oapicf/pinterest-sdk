#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_delete_operation.h"


char* local_inventory_delete_operation_operation_ToString(pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operation) {
    char* operationArray[] =  { "NULL", "DELETE" };
    return operationArray[operation];
}

pinterest_rest_api_local_inventory_delete_operation_OPERATION_e local_inventory_delete_operation_operation_FromString(char* operation){
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

static local_inventory_delete_operation_t *local_inventory_delete_operation_create_internal(
    char *item_id,
    pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operation,
    char *store_code
    ) {
    local_inventory_delete_operation_t *local_inventory_delete_operation_local_var = malloc(sizeof(local_inventory_delete_operation_t));
    if (!local_inventory_delete_operation_local_var) {
        return NULL;
    }
    memset(local_inventory_delete_operation_local_var, 0, sizeof(local_inventory_delete_operation_t));
    local_inventory_delete_operation_local_var->_library_owned = 1;
    local_inventory_delete_operation_local_var->item_id = item_id;
    local_inventory_delete_operation_local_var->operation = operation;
    local_inventory_delete_operation_local_var->store_code = store_code;
    return local_inventory_delete_operation_local_var;
}

__attribute__((deprecated)) local_inventory_delete_operation_t *local_inventory_delete_operation_create(
    char *item_id,
    pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operation,
    char *store_code
    ) {
    local_inventory_delete_operation_t *result = local_inventory_delete_operation_create_internal (
        item_id,
        operation,
        store_code
        );
    if (!result) {
    }
    return result;
}

void local_inventory_delete_operation_free(local_inventory_delete_operation_t *local_inventory_delete_operation) {
    if(NULL == local_inventory_delete_operation){
        return ;
    }
    if(local_inventory_delete_operation->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_delete_operation_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_delete_operation->item_id) {
        free(local_inventory_delete_operation->item_id);
        local_inventory_delete_operation->item_id = NULL;
    }
    if (local_inventory_delete_operation->store_code) {
        free(local_inventory_delete_operation->store_code);
        local_inventory_delete_operation->store_code = NULL;
    }
    free(local_inventory_delete_operation);
}

cJSON *local_inventory_delete_operation_convertToJSON(local_inventory_delete_operation_t *local_inventory_delete_operation) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_delete_operation->item_id
    if (!local_inventory_delete_operation->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", local_inventory_delete_operation->item_id) == NULL) {
    goto fail; //String
    }


    // local_inventory_delete_operation->operation
    if (pinterest_rest_api_local_inventory_delete_operation_OPERATION_NULL == local_inventory_delete_operation->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", local_inventory_delete_operation_operation_ToString(local_inventory_delete_operation->operation)) == NULL)
    {
    goto fail; //Enum
    }


    // local_inventory_delete_operation->store_code
    if (!local_inventory_delete_operation->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", local_inventory_delete_operation->store_code) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

local_inventory_delete_operation_t *local_inventory_delete_operation_parseFromJSON(cJSON *local_inventory_delete_operationJSON){

    local_inventory_delete_operation_t *local_inventory_delete_operation_local_var = NULL;

    char *item_id_local_str = NULL;

    char *store_code_local_str = NULL;

    // local_inventory_delete_operation->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(local_inventory_delete_operationJSON, "item_id");
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

    // local_inventory_delete_operation->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(local_inventory_delete_operationJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    pinterest_rest_api_local_inventory_delete_operation_OPERATION_e operationVariable;
    
    if(!cJSON_IsString(operation))
    {
    goto end; //Enum
    }
    operationVariable = local_inventory_delete_operation_operation_FromString(operation->valuestring);

    // local_inventory_delete_operation->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(local_inventory_delete_operationJSON, "store_code");
    if (cJSON_IsNull(store_code)) {
        store_code = NULL;
    }
    if (!store_code) {
        goto end;
    }

    
    if(!cJSON_IsString(store_code))
    {
    goto end; //String
    }


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);
    if (store_code && !cJSON_IsNull(store_code)) store_code_local_str = strdup(store_code->valuestring);

    local_inventory_delete_operation_local_var = local_inventory_delete_operation_create_internal (
        item_id_local_str,
        operationVariable,
        store_code_local_str
        );

    if (!local_inventory_delete_operation_local_var) {
        goto end;
    }

    return local_inventory_delete_operation_local_var;
end:
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (store_code_local_str) {
        free(store_code_local_str);
        store_code_local_str = NULL;
    }
    return NULL;

}
