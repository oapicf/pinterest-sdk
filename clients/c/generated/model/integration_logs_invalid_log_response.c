#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_logs_invalid_log_response.h"



integration_logs_invalid_log_response_t *integration_logs_invalid_log_response_create(
    list_t *rejected_logs
    ) {
    integration_logs_invalid_log_response_t *integration_logs_invalid_log_response_local_var = malloc(sizeof(integration_logs_invalid_log_response_t));
    if (!integration_logs_invalid_log_response_local_var) {
        return NULL;
    }
    integration_logs_invalid_log_response_local_var->rejected_logs = rejected_logs;

    return integration_logs_invalid_log_response_local_var;
}


void integration_logs_invalid_log_response_free(integration_logs_invalid_log_response_t *integration_logs_invalid_log_response) {
    if(NULL == integration_logs_invalid_log_response){
        return ;
    }
    listEntry_t *listEntry;
    if (integration_logs_invalid_log_response->rejected_logs) {
        list_ForEach(listEntry, integration_logs_invalid_log_response->rejected_logs) {
            integration_logs_invalid_log_response_rejected_logs_inner_free(listEntry->data);
        }
        list_freeList(integration_logs_invalid_log_response->rejected_logs);
        integration_logs_invalid_log_response->rejected_logs = NULL;
    }
    free(integration_logs_invalid_log_response);
}

cJSON *integration_logs_invalid_log_response_convertToJSON(integration_logs_invalid_log_response_t *integration_logs_invalid_log_response) {
    cJSON *item = cJSON_CreateObject();

    // integration_logs_invalid_log_response->rejected_logs
    if(integration_logs_invalid_log_response->rejected_logs) {
    cJSON *rejected_logs = cJSON_AddArrayToObject(item, "rejected_logs");
    if(rejected_logs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *rejected_logsListEntry;
    if (integration_logs_invalid_log_response->rejected_logs) {
    list_ForEach(rejected_logsListEntry, integration_logs_invalid_log_response->rejected_logs) {
    cJSON *itemLocal = integration_logs_invalid_log_response_rejected_logs_inner_convertToJSON(rejected_logsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(rejected_logs, itemLocal);
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

integration_logs_invalid_log_response_t *integration_logs_invalid_log_response_parseFromJSON(cJSON *integration_logs_invalid_log_responseJSON){

    integration_logs_invalid_log_response_t *integration_logs_invalid_log_response_local_var = NULL;

    // define the local list for integration_logs_invalid_log_response->rejected_logs
    list_t *rejected_logsList = NULL;

    // integration_logs_invalid_log_response->rejected_logs
    cJSON *rejected_logs = cJSON_GetObjectItemCaseSensitive(integration_logs_invalid_log_responseJSON, "rejected_logs");
    if (rejected_logs) { 
    cJSON *rejected_logs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(rejected_logs)){
        goto end; //nonprimitive container
    }

    rejected_logsList = list_createList();

    cJSON_ArrayForEach(rejected_logs_local_nonprimitive,rejected_logs )
    {
        if(!cJSON_IsObject(rejected_logs_local_nonprimitive)){
            goto end;
        }
        integration_logs_invalid_log_response_rejected_logs_inner_t *rejected_logsItem = integration_logs_invalid_log_response_rejected_logs_inner_parseFromJSON(rejected_logs_local_nonprimitive);

        list_addElement(rejected_logsList, rejected_logsItem);
    }
    }


    integration_logs_invalid_log_response_local_var = integration_logs_invalid_log_response_create (
        rejected_logs ? rejected_logsList : NULL
        );

    return integration_logs_invalid_log_response_local_var;
end:
    if (rejected_logsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rejected_logsList) {
            integration_logs_invalid_log_response_rejected_logs_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rejected_logsList);
        rejected_logsList = NULL;
    }
    return NULL;

}
