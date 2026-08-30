#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_request_create.h"



static integration_logs_request_create_t *integration_logs_request_create_create_internal(
    list_t *logs
    ) {
    integration_logs_request_create_t *integration_logs_request_create_local_var = malloc(sizeof(integration_logs_request_create_t));
    if (!integration_logs_request_create_local_var) {
        return NULL;
    }
    memset(integration_logs_request_create_local_var, 0, sizeof(integration_logs_request_create_t));
    integration_logs_request_create_local_var->_library_owned = 1;
    integration_logs_request_create_local_var->logs = logs;
    return integration_logs_request_create_local_var;
}

__attribute__((deprecated)) integration_logs_request_create_t *integration_logs_request_create_create(
    list_t *logs
    ) {
    integration_logs_request_create_t *result = integration_logs_request_create_create_internal (
        logs
        );
    if (!result) {
    }
    return result;
}

void integration_logs_request_create_free(integration_logs_request_create_t *integration_logs_request_create) {
    if(NULL == integration_logs_request_create){
        return ;
    }
    if(integration_logs_request_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_logs_request_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_request_create->logs) {
        list_ForEach(listEntry, integration_logs_request_create->logs) {
            integration_log_free(listEntry->data);
        }
        list_freeList(integration_logs_request_create->logs);
        integration_logs_request_create->logs = NULL;
    }
    free(integration_logs_request_create);
}

cJSON *integration_logs_request_create_convertToJSON(integration_logs_request_create_t *integration_logs_request_create) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_request_create->logs
    if (!integration_logs_request_create->logs) {
        goto fail;
    }
    cJSON *logs = cJSON_AddArrayToObject(item, "logs");
    if(logs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *logsListEntry;
    if (integration_logs_request_create->logs) {
    list_ForEach(logsListEntry, integration_logs_request_create->logs) {
    cJSON *itemLocal = integration_log_convertToJSON(logsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(logs, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

integration_logs_request_create_t *integration_logs_request_create_parseFromJSON(cJSON *integration_logs_request_createJSON){

    integration_logs_request_create_t *integration_logs_request_create_local_var = NULL;

    // define the local list for integration_logs_request_create->logs
    list_t *logsList = NULL;

    // integration_logs_request_create->logs
    cJSON *logs = cJSON_GetObjectItemCaseSensitive(integration_logs_request_createJSON, "logs");
    if (cJSON_IsNull(logs)) {
        logs = NULL;
    }
    if (!logs) {
        goto end;
    }

    
    cJSON *logs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(logs)){
        goto end; //nonprimitive container
    }

    logsList = list_createList();

    cJSON_ArrayForEach(logs_local_nonprimitive,logs )
    {
        if(!cJSON_IsObject(logs_local_nonprimitive)){
            goto end;
        }
        integration_log_t *logsItem = integration_log_parseFromJSON(logs_local_nonprimitive);

        list_addElement(logsList, logsItem);
    }



    integration_logs_request_create_local_var = integration_logs_request_create_create_internal (
        logsList
        );

    if (!integration_logs_request_create_local_var) {
        goto end;
    }

    return integration_logs_request_create_local_var;
end:
    if (logsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, logsList) {
            integration_log_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(logsList);
        logsList = NULL;
    }
    return NULL;

}
