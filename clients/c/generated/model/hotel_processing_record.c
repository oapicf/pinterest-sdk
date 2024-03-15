#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "hotel_processing_record.h"


char* hotel_processing_record_status_ToString(pinterest_rest_api_hotel_processing_record__e status) {
    char* statusArray[] =  { "NULL", "SUCCESS", "FAILURE", "PROCESSING" };
    return statusArray[status];
}

pinterest_rest_api_hotel_processing_record__e hotel_processing_record_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "SUCCESS", "FAILURE", "PROCESSING" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

hotel_processing_record_t *hotel_processing_record_create(
    char *hotel_id,
    list_t *errors,
    list_t *warnings,
    item_processing_status_t *status
    ) {
    hotel_processing_record_t *hotel_processing_record_local_var = malloc(sizeof(hotel_processing_record_t));
    if (!hotel_processing_record_local_var) {
        return NULL;
    }
    hotel_processing_record_local_var->hotel_id = hotel_id;
    hotel_processing_record_local_var->errors = errors;
    hotel_processing_record_local_var->warnings = warnings;
    hotel_processing_record_local_var->status = status;

    return hotel_processing_record_local_var;
}


void hotel_processing_record_free(hotel_processing_record_t *hotel_processing_record) {
    if(NULL == hotel_processing_record){
        return ;
    }
    listEntry_t *listEntry;
    if (hotel_processing_record->hotel_id) {
        free(hotel_processing_record->hotel_id);
        hotel_processing_record->hotel_id = NULL;
    }
    if (hotel_processing_record->errors) {
        list_ForEach(listEntry, hotel_processing_record->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(hotel_processing_record->errors);
        hotel_processing_record->errors = NULL;
    }
    if (hotel_processing_record->warnings) {
        list_ForEach(listEntry, hotel_processing_record->warnings) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(hotel_processing_record->warnings);
        hotel_processing_record->warnings = NULL;
    }
    if (hotel_processing_record->status) {
        item_processing_status_free(hotel_processing_record->status);
        hotel_processing_record->status = NULL;
    }
    free(hotel_processing_record);
}

cJSON *hotel_processing_record_convertToJSON(hotel_processing_record_t *hotel_processing_record) {
    cJSON *item = cJSON_CreateObject();

    // hotel_processing_record->hotel_id
    if(hotel_processing_record->hotel_id) {
    if(cJSON_AddStringToObject(item, "hotel_id", hotel_processing_record->hotel_id) == NULL) {
    goto fail; //String
    }
    }


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


    // hotel_processing_record->status
    if(hotel_processing_record->status != pinterest_rest_api_hotel_processing_record__NULL) {
    cJSON *status_local_JSON = item_processing_status_convertToJSON(hotel_processing_record->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
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

    // define the local list for hotel_processing_record->warnings
    list_t *warningsList = NULL;

    // define the local variable for hotel_processing_record->status
    item_processing_status_t *status_local_nonprim = NULL;

    // hotel_processing_record->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "hotel_id");
    if (hotel_id) { 
    if(!cJSON_IsString(hotel_id) && !cJSON_IsNull(hotel_id))
    {
    goto end; //String
    }
    }

    // hotel_processing_record->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "errors");
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

    // hotel_processing_record->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "warnings");
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

    // hotel_processing_record->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(hotel_processing_recordJSON, "status");
    if (status) { 
    status_local_nonprim = item_processing_status_parseFromJSON(status); //custom
    }


    hotel_processing_record_local_var = hotel_processing_record_create (
        hotel_id && !cJSON_IsNull(hotel_id) ? strdup(hotel_id->valuestring) : NULL,
        errors ? errorsList : NULL,
        warnings ? warningsList : NULL,
        status ? status_local_nonprim : NULL
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
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    if (status_local_nonprim) {
        item_processing_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
