#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hotel_processing_record.h"



static hotel_processing_record_t *hotel_processing_record_create_internal(
    list_t *errors,
    char *hotel_id,
    pinterest_rest_api_item_processing_status__e status,
    list_t *warnings
    ) {
    hotel_processing_record_t *hotel_processing_record_local_var = malloc(sizeof(hotel_processing_record_t));
    if (!hotel_processing_record_local_var) {
        return NULL;
    }
    hotel_processing_record_local_var->errors = errors;
    hotel_processing_record_local_var->hotel_id = hotel_id;
    hotel_processing_record_local_var->status = status;
    hotel_processing_record_local_var->warnings = warnings;

    hotel_processing_record_local_var->_library_owned = 1;
    return hotel_processing_record_local_var;
}

__attribute__((deprecated)) hotel_processing_record_t *hotel_processing_record_create(
    list_t *errors,
    char *hotel_id,
    pinterest_rest_api_item_processing_status__e status,
    list_t *warnings
    ) {
    return hotel_processing_record_create_internal (
        errors,
        hotel_id,
        status,
        warnings
        );
}

void hotel_processing_record_free(hotel_processing_record_t *hotel_processing_record) {
    if(NULL == hotel_processing_record){
        return ;
    }
    if(hotel_processing_record->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "hotel_processing_record_free");
        return ;
    }
    listEntry_t *listEntry;
    if (hotel_processing_record->errors) {
        list_ForEach(listEntry, hotel_processing_record->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(hotel_processing_record->errors);
        hotel_processing_record->errors = NULL;
    }
    if (hotel_processing_record->hotel_id) {
        free(hotel_processing_record->hotel_id);
        hotel_processing_record->hotel_id = NULL;
    }
    if (hotel_processing_record->warnings) {
        list_ForEach(listEntry, hotel_processing_record->warnings) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(hotel_processing_record->warnings);
        hotel_processing_record->warnings = NULL;
    }
    free(hotel_processing_record);
}

cJSON *hotel_processing_record_convertToJSON(hotel_processing_record_t *hotel_processing_record) {
    cJSON *item = cJSON_CreateObject();

    // hotel_processing_record->errors
    if(hotel_processing_record->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (hotel_processing_record->errors) {
    list_ForEach(errorsListEntry, hotel_processing_record->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // hotel_processing_record->hotel_id
    if(hotel_processing_record->hotel_id) {
    if(cJSON_AddStringToObject(item, "hotel_id", hotel_processing_record->hotel_id) == NULL) {
    goto fail; //String
    }
    }


    // hotel_processing_record->status
    if(hotel_processing_record->status != pinterest_rest_api_item_processing_status__NULL) {
    cJSON *status_local_JSON = item_processing_status_convertToJSON(hotel_processing_record->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // hotel_processing_record->warnings
    if(hotel_processing_record->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (hotel_processing_record->warnings) {
    list_ForEach(warningsListEntry, hotel_processing_record->warnings) {
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

hotel_processing_record_t *hotel_processing_record_parseFromJSON(cJSON *hotel_processing_recordJSON){

    hotel_processing_record_t *hotel_processing_record_local_var = NULL;

    // define the local list for hotel_processing_record->errors
    list_t *errorsList = NULL;

    // define the local variable for hotel_processing_record->status
    pinterest_rest_api_item_processing_status__e status_local_nonprim = 0;

    // define the local list for hotel_processing_record->warnings
    list_t *warningsList = NULL;

    // hotel_processing_record->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "errors");
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

    // hotel_processing_record->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "hotel_id");
    if (cJSON_IsNull(hotel_id)) {
        hotel_id = NULL;
    }
    if (hotel_id) { 
    if(!cJSON_IsString(hotel_id) && !cJSON_IsNull(hotel_id))
    {
    goto end; //String
    }
    }

    // hotel_processing_record->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = item_processing_status_parseFromJSON(status); //custom
    }

    // hotel_processing_record->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "warnings");
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


    hotel_processing_record_local_var = hotel_processing_record_create_internal (
        errors ? errorsList : NULL,
        hotel_id && !cJSON_IsNull(hotel_id) ? strdup(hotel_id->valuestring) : NULL,
        status ? status_local_nonprim : 0,
        warnings ? warningsList : NULL
        );

    return hotel_processing_record_local_var;
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
