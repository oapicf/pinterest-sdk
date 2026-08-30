#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "advertiser_defined_event_processing_record.h"



static advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_create_internal(
    list_t *exceptions,
    char *name,
    char *status
    ) {
    advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_local_var = malloc(sizeof(advertiser_defined_event_processing_record_t));
    if (!advertiser_defined_event_processing_record_local_var) {
        return NULL;
    }
    memset(advertiser_defined_event_processing_record_local_var, 0, sizeof(advertiser_defined_event_processing_record_t));
    advertiser_defined_event_processing_record_local_var->_library_owned = 1;
    advertiser_defined_event_processing_record_local_var->exceptions = exceptions;
    advertiser_defined_event_processing_record_local_var->name = name;
    advertiser_defined_event_processing_record_local_var->status = status;
    return advertiser_defined_event_processing_record_local_var;
}

__attribute__((deprecated)) advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_create(
    list_t *exceptions,
    char *name,
    char *status
    ) {
    advertiser_defined_event_processing_record_t *result = advertiser_defined_event_processing_record_create_internal (
        exceptions,
        name,
        status
        );
    if (!result) {
    }
    return result;
}

void advertiser_defined_event_processing_record_free(advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record) {
    if(NULL == advertiser_defined_event_processing_record){
        return ;
    }
    if(advertiser_defined_event_processing_record->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "advertiser_defined_event_processing_record_free");
        return ;
    }
    listEntry_t *listEntry;
    if (advertiser_defined_event_processing_record->exceptions) {
        list_ForEach(listEntry, advertiser_defined_event_processing_record->exceptions) {
            free(listEntry->data);
        }
        list_freeList(advertiser_defined_event_processing_record->exceptions);
        advertiser_defined_event_processing_record->exceptions = NULL;
    }
    if (advertiser_defined_event_processing_record->name) {
        free(advertiser_defined_event_processing_record->name);
        advertiser_defined_event_processing_record->name = NULL;
    }
    if (advertiser_defined_event_processing_record->status) {
        free(advertiser_defined_event_processing_record->status);
        advertiser_defined_event_processing_record->status = NULL;
    }
    free(advertiser_defined_event_processing_record);
}

cJSON *advertiser_defined_event_processing_record_convertToJSON(advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record) {
    cJSON *item = cJSON_CreateObject();

    // advertiser_defined_event_processing_record->exceptions
    if(advertiser_defined_event_processing_record->exceptions) {
    cJSON *exceptions = cJSON_AddArrayToObject(item, "exceptions");
    if(exceptions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *exceptionsListEntry;
    list_ForEach(exceptionsListEntry, advertiser_defined_event_processing_record->exceptions) {
    if(cJSON_AddStringToObject(exceptions, "", exceptionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // advertiser_defined_event_processing_record->name
    if (!advertiser_defined_event_processing_record->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", advertiser_defined_event_processing_record->name) == NULL) {
    goto fail; //String
    }


    // advertiser_defined_event_processing_record->status
    if (!advertiser_defined_event_processing_record->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", advertiser_defined_event_processing_record->status) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_parseFromJSON(cJSON *advertiser_defined_event_processing_recordJSON){

    advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_local_var = NULL;

    // define the local list for advertiser_defined_event_processing_record->exceptions
    list_t *exceptionsList = NULL;

    char *name_local_str = NULL;

    char *status_local_str = NULL;

    // advertiser_defined_event_processing_record->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(advertiser_defined_event_processing_recordJSON, "exceptions");
    if (cJSON_IsNull(exceptions)) {
        exceptions = NULL;
    }
    if (exceptions) { 
    cJSON *exceptions_local = NULL;
    if(!cJSON_IsArray(exceptions)) {
        goto end;//primitive container
    }
    exceptionsList = list_createList();

    cJSON_ArrayForEach(exceptions_local, exceptions)
    {
        if(!cJSON_IsString(exceptions_local))
        {
            goto end;
        }
        list_addElement(exceptionsList , strdup(exceptions_local->valuestring));
    }
    }

    // advertiser_defined_event_processing_record->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(advertiser_defined_event_processing_recordJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // advertiser_defined_event_processing_record->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(advertiser_defined_event_processing_recordJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    if(!cJSON_IsString(status))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (status && !cJSON_IsNull(status)) status_local_str = strdup(status->valuestring);

    advertiser_defined_event_processing_record_local_var = advertiser_defined_event_processing_record_create_internal (
        exceptions ? exceptionsList : NULL,
        name_local_str,
        status_local_str
        );

    if (!advertiser_defined_event_processing_record_local_var) {
        goto end;
    }

    return advertiser_defined_event_processing_record_local_var;
end:
    if (exceptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, exceptionsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(exceptionsList);
        exceptionsList = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (status_local_str) {
        free(status_local_str);
        status_local_str = NULL;
    }
    return NULL;

}
