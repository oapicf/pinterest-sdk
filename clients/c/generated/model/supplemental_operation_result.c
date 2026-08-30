#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "supplemental_operation_result.h"


char* supplemental_operation_result_supplemental_type_ToString(pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_e supplemental_type) {
    char* supplemental_typeArray[] =  { "NULL", "LOCAL_INVENTORY" };
    return supplemental_typeArray[supplemental_type];
}

pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_e supplemental_operation_result_supplemental_type_FromString(char* supplemental_type){
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

static supplemental_operation_result_t *supplemental_operation_result_create_internal(
    list_t *errors,
    char *item_id,
    supplemental_item_processing_status_t *status,
    char *store_code,
    pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_e supplemental_type,
    list_t *warnings
    ) {
    supplemental_operation_result_t *supplemental_operation_result_local_var = malloc(sizeof(supplemental_operation_result_t));
    if (!supplemental_operation_result_local_var) {
        return NULL;
    }
    memset(supplemental_operation_result_local_var, 0, sizeof(supplemental_operation_result_t));
    supplemental_operation_result_local_var->_library_owned = 1;
    supplemental_operation_result_local_var->errors = errors;
    supplemental_operation_result_local_var->item_id = item_id;
    supplemental_operation_result_local_var->status = status;
    supplemental_operation_result_local_var->store_code = store_code;
    supplemental_operation_result_local_var->supplemental_type = supplemental_type;
    supplemental_operation_result_local_var->warnings = warnings;
    return supplemental_operation_result_local_var;
}

__attribute__((deprecated)) supplemental_operation_result_t *supplemental_operation_result_create(
    list_t *errors,
    char *item_id,
    supplemental_item_processing_status_t *status,
    char *store_code,
    pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_e supplemental_type,
    list_t *warnings
    ) {
    supplemental_operation_result_t *result = supplemental_operation_result_create_internal (
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

void supplemental_operation_result_free(supplemental_operation_result_t *supplemental_operation_result) {
    if(NULL == supplemental_operation_result){
        return ;
    }
    if(supplemental_operation_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "supplemental_operation_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (supplemental_operation_result->errors) {
        list_ForEach(listEntry, supplemental_operation_result->errors) {
            supplemental_item_validation_event_free(listEntry->data);
        }
        list_freeList(supplemental_operation_result->errors);
        supplemental_operation_result->errors = NULL;
    }
    if (supplemental_operation_result->item_id) {
        free(supplemental_operation_result->item_id);
        supplemental_operation_result->item_id = NULL;
    }
    if (supplemental_operation_result->status) {
        supplemental_item_processing_status_free(supplemental_operation_result->status);
        supplemental_operation_result->status = NULL;
    }
    if (supplemental_operation_result->store_code) {
        free(supplemental_operation_result->store_code);
        supplemental_operation_result->store_code = NULL;
    }
    if (supplemental_operation_result->warnings) {
        list_ForEach(listEntry, supplemental_operation_result->warnings) {
            supplemental_item_validation_event_free(listEntry->data);
        }
        list_freeList(supplemental_operation_result->warnings);
        supplemental_operation_result->warnings = NULL;
    }
    free(supplemental_operation_result);
}

cJSON *supplemental_operation_result_convertToJSON(supplemental_operation_result_t *supplemental_operation_result) {
    cJSON *item = cJSON_CreateObject();

    // supplemental_operation_result->errors
    if(supplemental_operation_result->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (supplemental_operation_result->errors) {
    list_ForEach(errorsListEntry, supplemental_operation_result->errors) {
    cJSON *itemLocal = supplemental_item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // supplemental_operation_result->item_id
    if (!supplemental_operation_result->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", supplemental_operation_result->item_id) == NULL) {
    goto fail; //String
    }


    // supplemental_operation_result->status
    if (!supplemental_operation_result->status) {
        goto fail;
    }
    cJSON *status_local_JSON = supplemental_item_processing_status_convertToJSON(supplemental_operation_result->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // supplemental_operation_result->store_code
    if (!supplemental_operation_result->store_code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "store_code", supplemental_operation_result->store_code) == NULL) {
    goto fail; //String
    }


    // supplemental_operation_result->supplemental_type
    if (pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_NULL == supplemental_operation_result->supplemental_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "supplemental_type", supplemental_operation_result_supplemental_type_ToString(supplemental_operation_result->supplemental_type)) == NULL)
    {
    goto fail; //Enum
    }


    // supplemental_operation_result->warnings
    if(supplemental_operation_result->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (supplemental_operation_result->warnings) {
    list_ForEach(warningsListEntry, supplemental_operation_result->warnings) {
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

supplemental_operation_result_t *supplemental_operation_result_parseFromJSON(cJSON *supplemental_operation_resultJSON){

    supplemental_operation_result_t *supplemental_operation_result_local_var = NULL;

    // define the local list for supplemental_operation_result->errors
    list_t *errorsList = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for supplemental_operation_result->status
    supplemental_item_processing_status_t *status_local_nonprim = NULL;

    char *store_code_local_str = NULL;

    // define the local list for supplemental_operation_result->warnings
    list_t *warningsList = NULL;

    // supplemental_operation_result->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(supplemental_operation_resultJSON, "errors");
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

    // supplemental_operation_result->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(supplemental_operation_resultJSON, "item_id");
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

    // supplemental_operation_result->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(supplemental_operation_resultJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = supplemental_item_processing_status_parseFromJSON(status); //custom

    // supplemental_operation_result->store_code
    cJSON *store_code = cJSON_GetObjectItemCaseSensitive(supplemental_operation_resultJSON, "store_code");
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

    // supplemental_operation_result->supplemental_type
    cJSON *supplemental_type = cJSON_GetObjectItemCaseSensitive(supplemental_operation_resultJSON, "supplemental_type");
    if (cJSON_IsNull(supplemental_type)) {
        supplemental_type = NULL;
    }
    if (!supplemental_type) {
        goto end;
    }

    pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_e supplemental_typeVariable;
    
    if(!cJSON_IsString(supplemental_type))
    {
    goto end; //Enum
    }
    supplemental_typeVariable = supplemental_operation_result_supplemental_type_FromString(supplemental_type->valuestring);

    // supplemental_operation_result->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(supplemental_operation_resultJSON, "warnings");
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

    supplemental_operation_result_local_var = supplemental_operation_result_create_internal (
        errors ? errorsList : NULL,
        item_id_local_str,
        status_local_nonprim,
        store_code_local_str,
        supplemental_typeVariable,
        warnings ? warningsList : NULL
        );

    if (!supplemental_operation_result_local_var) {
        goto end;
    }

    return supplemental_operation_result_local_var;
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
