#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_processing_record.h"



static item_processing_record_t *item_processing_record_create_internal(
    list_t *errors,
    char *item_id,
    pinterest_rest_api_item_processing_status__e status,
    list_t *warnings
    ) {
    item_processing_record_t *item_processing_record_local_var = malloc(sizeof(item_processing_record_t));
    if (!item_processing_record_local_var) {
        return NULL;
    }
    memset(item_processing_record_local_var, 0, sizeof(item_processing_record_t));
    item_processing_record_local_var->_library_owned = 1;
    item_processing_record_local_var->errors = errors;
    item_processing_record_local_var->item_id = item_id;
    item_processing_record_local_var->status = status;
    item_processing_record_local_var->warnings = warnings;
    return item_processing_record_local_var;
}

__attribute__((deprecated)) item_processing_record_t *item_processing_record_create(
    list_t *errors,
    char *item_id,
    pinterest_rest_api_item_processing_status__e status,
    list_t *warnings
    ) {
    item_processing_record_t *result = item_processing_record_create_internal (
        errors,
        item_id,
        status,
        warnings
        );
    if (!result) {
    }
    return result;
}

void item_processing_record_free(item_processing_record_t *item_processing_record) {
    if(NULL == item_processing_record){
        return ;
    }
    if(item_processing_record->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_processing_record_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_processing_record->errors) {
        list_ForEach(listEntry, item_processing_record->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(item_processing_record->errors);
        item_processing_record->errors = NULL;
    }
    if (item_processing_record->item_id) {
        free(item_processing_record->item_id);
        item_processing_record->item_id = NULL;
    }
    if (item_processing_record->warnings) {
        list_ForEach(listEntry, item_processing_record->warnings) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(item_processing_record->warnings);
        item_processing_record->warnings = NULL;
    }
    free(item_processing_record);
}

cJSON *item_processing_record_convertToJSON(item_processing_record_t *item_processing_record) {
    cJSON *item = cJSON_CreateObject();

    // item_processing_record->errors
    if(item_processing_record->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (item_processing_record->errors) {
    list_ForEach(errorsListEntry, item_processing_record->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // item_processing_record->item_id
    if(item_processing_record->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_processing_record->item_id) == NULL) {
    goto fail; //String
    }
    }


    // item_processing_record->status
    if(item_processing_record->status != pinterest_rest_api_item_processing_status__NULL) {
    cJSON *status_local_JSON = item_processing_status_convertToJSON(item_processing_record->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // item_processing_record->warnings
    if(item_processing_record->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (item_processing_record->warnings) {
    list_ForEach(warningsListEntry, item_processing_record->warnings) {
    cJSON *itemLocal = item_validation_event_convertToJSON(warningsListEntry->data);
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

item_processing_record_t *item_processing_record_parseFromJSON(cJSON *item_processing_recordJSON){

    item_processing_record_t *item_processing_record_local_var = NULL;

    // define the local list for item_processing_record->errors
    list_t *errorsList = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for item_processing_record->status
    pinterest_rest_api_item_processing_status__e status_local_nonprim = 0;

    // define the local list for item_processing_record->warnings
    list_t *warningsList = NULL;

    // item_processing_record->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(item_processing_recordJSON, "errors");
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

    // item_processing_record->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_processing_recordJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // item_processing_record->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(item_processing_recordJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = item_processing_status_parseFromJSON(status); //custom
    }

    // item_processing_record->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(item_processing_recordJSON, "warnings");
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
        item_validation_event_t *warningsItem = item_validation_event_parseFromJSON(warnings_local_nonprimitive);

        list_addElement(warningsList, warningsItem);
    }
    }


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    item_processing_record_local_var = item_processing_record_create_internal (
        errors ? errorsList : NULL,
        item_id_local_str,
        status ? status_local_nonprim : 0,
        warnings ? warningsList : NULL
        );

    if (!item_processing_record_local_var) {
        goto end;
    }

    return item_processing_record_local_var;
end:
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            item_validation_event_free(listEntry->data);
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
        status_local_nonprim = 0;
    }
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    return NULL;

}
