#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_request.h"



integration_logs_request_t *integration_logs_request_create(
    list_t *logs
    ) {
    integration_logs_request_t *integration_logs_request_local_var = malloc(sizeof(integration_logs_request_t));
    if (!integration_logs_request_local_var) {
        return NULL;
    }
    integration_logs_request_local_var->logs = logs;

    return integration_logs_request_local_var;
}


void integration_logs_request_free(integration_logs_request_t *integration_logs_request) {
    if(NULL == integration_logs_request){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_request->logs) {
        list_ForEach(listEntry, integration_logs_request->logs) {
            integration_log_free(listEntry->data);
        }
        list_freeList(integration_logs_request->logs);
        integration_logs_request->logs = NULL;
    }
    free(integration_logs_request);
}

cJSON *integration_logs_request_convertToJSON(integration_logs_request_t *integration_logs_request) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_request->logs
    if (!integration_logs_request->logs) {
        goto fail;
    }
    cJSON *logs = cJSON_AddArrayToObject(item, "logs");
    if(logs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *logsListEntry;
    if (integration_logs_request->logs) {
    list_ForEach(logsListEntry, integration_logs_request->logs) {
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

integration_logs_request_t *integration_logs_request_parseFromJSON(cJSON *integration_logs_requestJSON){

    integration_logs_request_t *integration_logs_request_local_var = NULL;

    // define the local list for integration_logs_request->logs
    list_t *logsList = NULL;

    // integration_logs_request->logs
    cJSON *logs = cJSON_GetObjectItemCaseSensitive(integration_logs_requestJSON, "logs");
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


    integration_logs_request_local_var = integration_logs_request_create (
        logsList
        );

    return integration_logs_request_local_var;
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
