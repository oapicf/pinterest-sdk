#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "creative_assets_processing_record.h"


char* creative_assets_processing_record_status_ToString(pinterest_rest_api_creative_assets_processing_record__e status) {
    char* statusArray[] =  { "NULL", "SUCCESS", "FAILURE", "PROCESSING" };
    return statusArray[status];
}

pinterest_rest_api_creative_assets_processing_record__e creative_assets_processing_record_status_FromString(char* status){
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

creative_assets_processing_record_t *creative_assets_processing_record_create(
    char *creative_assets_id,
    list_t *errors,
    list_t *warnings,
    item_processing_status_t *status
    ) {
    creative_assets_processing_record_t *creative_assets_processing_record_local_var = malloc(sizeof(creative_assets_processing_record_t));
    if (!creative_assets_processing_record_local_var) {
        return NULL;
    }
    creative_assets_processing_record_local_var->creative_assets_id = creative_assets_id;
    creative_assets_processing_record_local_var->errors = errors;
    creative_assets_processing_record_local_var->warnings = warnings;
    creative_assets_processing_record_local_var->status = status;

    return creative_assets_processing_record_local_var;
}


void creative_assets_processing_record_free(creative_assets_processing_record_t *creative_assets_processing_record) {
    if(NULL == creative_assets_processing_record){
        return ;
    }
    listEntry_t *listEntry;
    if (creative_assets_processing_record->creative_assets_id) {
        free(creative_assets_processing_record->creative_assets_id);
        creative_assets_processing_record->creative_assets_id = NULL;
    }
    if (creative_assets_processing_record->errors) {
        list_ForEach(listEntry, creative_assets_processing_record->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(creative_assets_processing_record->errors);
        creative_assets_processing_record->errors = NULL;
    }
    if (creative_assets_processing_record->warnings) {
        list_ForEach(listEntry, creative_assets_processing_record->warnings) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(creative_assets_processing_record->warnings);
        creative_assets_processing_record->warnings = NULL;
    }
    if (creative_assets_processing_record->status) {
        item_processing_status_free(creative_assets_processing_record->status);
        creative_assets_processing_record->status = NULL;
    }
    free(creative_assets_processing_record);
}

cJSON *creative_assets_processing_record_convertToJSON(creative_assets_processing_record_t *creative_assets_processing_record) {
    cJSON *item = cJSON_CreateObject();

    // creative_assets_processing_record->creative_assets_id
    if(creative_assets_processing_record->creative_assets_id) {
    if(cJSON_AddStringToObject(item, "creative_assets_id", creative_assets_processing_record->creative_assets_id) == NULL) {
    goto fail; //String
    }
    }


    // creative_assets_processing_record->errors
    if(creative_assets_processing_record->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (creative_assets_processing_record->errors) {
    list_ForEach(errorsListEntry, creative_assets_processing_record->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // creative_assets_processing_record->warnings
    if(creative_assets_processing_record->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (creative_assets_processing_record->warnings) {
    list_ForEach(warningsListEntry, creative_assets_processing_record->warnings) {
    cJSON *itemLocal = item_validation_event_convertToJSON(warningsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warnings, itemLocal);
    }
    }
    }


    // creative_assets_processing_record->status
    if(creative_assets_processing_record->status != pinterest_rest_api_creative_assets_processing_record__NULL) {
    cJSON *status_local_JSON = item_processing_status_convertToJSON(creative_assets_processing_record->status);
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

creative_assets_processing_record_t *creative_assets_processing_record_parseFromJSON(cJSON *creative_assets_processing_recordJSON){

    creative_assets_processing_record_t *creative_assets_processing_record_local_var = NULL;

    // define the local list for creative_assets_processing_record->errors
    list_t *errorsList = NULL;

    // define the local list for creative_assets_processing_record->warnings
    list_t *warningsList = NULL;

    // define the local variable for creative_assets_processing_record->status
    item_processing_status_t *status_local_nonprim = NULL;

    // creative_assets_processing_record->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(creative_assets_processing_recordJSON, "creative_assets_id");
    if (creative_assets_id) { 
    if(!cJSON_IsString(creative_assets_id) && !cJSON_IsNull(creative_assets_id))
    {
    goto end; //String
    }
    }

    // creative_assets_processing_record->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(creative_assets_processing_recordJSON, "errors");
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

    // creative_assets_processing_record->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(creative_assets_processing_recordJSON, "warnings");
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

    // creative_assets_processing_record->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(creative_assets_processing_recordJSON, "status");
    if (status) { 
    status_local_nonprim = item_processing_status_parseFromJSON(status); //custom
    }


    creative_assets_processing_record_local_var = creative_assets_processing_record_create (
        creative_assets_id && !cJSON_IsNull(creative_assets_id) ? strdup(creative_assets_id->valuestring) : NULL,
        errors ? errorsList : NULL,
        warnings ? warningsList : NULL,
        status ? status_local_nonprim : NULL
        );

    return creative_assets_processing_record_local_var;
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
