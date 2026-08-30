#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "local_inventory_operation_result.h"


char* local_inventory_operation_result_supplemental_type_ToString(pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_type) {
    char* supplemental_typeArray[] =  { "NULL", "LOCAL_INVENTORY" };
    return supplemental_typeArray[supplemental_type];
}

pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e local_inventory_operation_result_supplemental_type_FromString(char* supplemental_type){
    int stringToReturn = 0;
    char *supplemental_typeArray[] =  { "NULL", "LOCAL_INVENTORY" };
    size_t sizeofArray = sizeof(supplemental_typeArray) / sizeof(supplemental_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(supplemental_type, supplemental_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static local_inventory_operation_result_t *local_inventory_operation_result_create_internal(
    list_t *errors,
    char *item_id,
    supplemental_item_processing_status_t *status,
    char *store_code,
    pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_type,
    list_t *warnings
    ) {
    local_inventory_operation_result_t *local_inventory_operation_result_local_var = malloc(sizeof(local_inventory_operation_result_t));
    if (!local_inventory_operation_result_local_var) {
        return NULL;
    }
    memset(local_inventory_operation_result_local_var, 0, sizeof(local_inventory_operation_result_t));
    local_inventory_operation_result_local_var->_library_owned = 1;
    local_inventory_operation_result_local_var->errors = errors;
    local_inventory_operation_result_local_var->item_id = item_id;
    local_inventory_operation_result_local_var->status = status;
    local_inventory_operation_result_local_var->store_code = store_code;
    local_inventory_operation_result_local_var->supplemental_type = supplemental_type;
    local_inventory_operation_result_local_var->warnings = warnings;
    return local_inventory_operation_result_local_var;
}

__attribute__((deprecated)) local_inventory_operation_result_t *local_inventory_operation_result_create(
    list_t *errors,
    char *item_id,
    supplemental_item_processing_status_t *status,
    char *store_code,
    pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_type,
    list_t *warnings
    ) {
    local_inventory_operation_result_t *result = local_inventory_operation_result_create_internal (
        errors,
        item_id,
        status,
        store_code,
        supplemental_type,
        warnings
        );
    if (!result) {
    }
    return result;
}

void local_inventory_operation_result_free(local_inventory_operation_result_t *local_inventory_operation_result) {
    if(NULL == local_inventory_operation_result){
        return ;
    }
    if(local_inventory_operation_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "local_inventory_operation_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (local_inventory_operation_result->errors) {
        list_ForEach(listEntry, local_inventory_operation_result->errors) {
            supplemental_item_validation_event_free(listEntry->data);
        }
        list_freeList(local_inventory_operation_result->errors);
        local_inventory_operation_result->errors = NULL;
    }
    if (local_inventory_operation_result->item_id) {
        free(local_inventory_operation_result->item_id);
        local_inventory_operation_result->item_id = NULL;
    }
    if (local_inventory_operation_result->status) {
        supplemental_item_processing_status_free(local_inventory_operation_result->status);
        local_inventory_operation_result->status = NULL;
    }
    if (local_inventory_operation_result->store_code) {
        free(local_inventory_operation_result->store_code);
        local_inventory_operation_result->store_code = NULL;
    }
    if (local_inventory_operation_result->warnings) {
        list_ForEach(listEntry, local_inventory_operation_result->warnings) {
            supplemental_item_validation_event_free(listEntry->data);
        }
        list_freeList(local_inventory_operation_result->warnings);
        local_inventory_operation_result->warnings = NULL;
    }
    free(local_inventory_operation_result);
}

cJSON *local_inventory_operation_result_convertToJSON(local_inventory_operation_result_t *local_inventory_operation_result) {
    cJSON *item = cJSON_CreateObject();

    // local_inventory_operation_result->errors
    if(local_inventory_operation_result->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (local_inventory_operation_result->errors) {
    list_ForEach(errorsListEntry, local_inventory_operation_result->errors) {
    cJSON *itemLocal = supplemental_item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // local_inventory_operation_result->item_id
    if (!local_inventory_operation_result->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", local_inventory_operation_result->item_id) == NULL) {
    goto fail; //String
    }


    // local_inventory_operation_result->status
    if (!local_inventory_operation_result->status) {
        goto fail;
    }
    cJSON *status_local_JSON = supplemental_item_processing_status_convertToJSON(local_inventory_operation_result->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // local_inventory_operation_result->store_code
    if (!local_inventory_operation_result->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", local_inventory_operation_result->store_code) == NULL) {
    goto fail; //String
    }


    // local_inventory_operation_result->supplemental_type
    if (pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_NULL == local_inventory_operation_result->supplemental_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "supplemental_type", local_inventory_operation_result_supplemental_type_ToString(local_inventory_operation_result->supplemental_type)) == NULL)
    {
    goto fail; //Enum
    }


    // local_inventory_operation_result->warnings
    if(local_inventory_operation_result->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (local_inventory_operation_result->warnings) {
    list_ForEach(warningsListEntry, local_inventory_operation_result->warnings) {
    cJSON *itemLocal = supplemental_item_validation_event_convertToJSON(warningsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warnings, itemLocal);
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

local_inventory_operation_result_t *local_inventory_operation_result_parseFromJSON(cJSON *local_inventory_operation_resultJSON){

    local_inventory_operation_result_t *local_inventory_operation_result_local_var = NULL;

    // define the local list for local_inventory_operation_result->errors
    list_t *errorsList = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for local_inventory_operation_result->status
    supplemental_item_processing_status_t *status_local_nonprim = NULL;

    char *store_code_local_str = NULL;

    // define the local list for local_inventory_operation_result->warnings
    list_t *warningsList = NULL;

    // local_inventory_operation_result->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(local_inventory_operation_resultJSON, "errors");
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
        supplemental_item_validation_event_t *errorsItem = supplemental_item_validation_event_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // local_inventory_operation_result->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(local_inventory_operation_resultJSON, "item_id");
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

    // local_inventory_operation_result->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(local_inventory_operation_resultJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = supplemental_item_processing_status_parseFromJSON(status); //custom

    // local_inventory_operation_result->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(local_inventory_operation_resultJSON, "store_code");
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

    // local_inventory_operation_result->supplemental_type
    cJSON *supplemental_type = cJSON_GetObjectItemCaseSensitive(local_inventory_operation_resultJSON, "supplemental_type");
    if (cJSON_IsNull(supplemental_type)) {
        supplemental_type = NULL;
    }
    if (!supplemental_type) {
        goto end;
    }

    pinterest_rest_api_local_inventory_operation_result_SUPPLEMENTALTYPE_e supplemental_typeVariable;
    
    if(!cJSON_IsString(supplemental_type))
    {
    goto end; //Enum
    }
    supplemental_typeVariable = local_inventory_operation_result_supplemental_type_FromString(supplemental_type->valuestring);

    // local_inventory_operation_result->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(local_inventory_operation_resultJSON, "warnings");
    if (cJSON_IsNull(warnings)) {
        warnings = NULL;
    }
    if (warnings) { 
    cJSON *warnings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(warnings)){
        goto end; //nonprimitive container
    }

    warningsList = list_createList();

    cJSON_ArrayForEach(warnings_local_nonprimitive,warnings )
    {
        if(!cJSON_IsObject(warnings_local_nonprimitive)){
            goto end;
        }
        supplemental_item_validation_event_t *warningsItem = supplemental_item_validation_event_parseFromJSON(warnings_local_nonprimitive);

        list_addElement(warningsList, warningsItem);
    }
    }


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);
    if (store_code && !cJSON_IsNull(store_code)) store_code_local_str = strdup(store_code->valuestring);

    local_inventory_operation_result_local_var = local_inventory_operation_result_create_internal (
        errors ? errorsList : NULL,
        item_id_local_str,
        status_local_nonprim,
        store_code_local_str,
        supplemental_typeVariable,
        warnings ? warningsList : NULL
        );

    if (!local_inventory_operation_result_local_var) {
        goto end;
    }

    return local_inventory_operation_result_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            supplemental_item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (status_local_nonprim) {
        supplemental_item_processing_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (store_code_local_str) {
        free(store_code_local_str);
        store_code_local_str = NULL;
    }
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            supplemental_item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    return NULL;

}
