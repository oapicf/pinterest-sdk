#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_export_status.h"


char* leads_export_status_leads_export_status_ToString(pinterest_rest_api_leads_export_status__e leads_export_status) {
    char *leads_export_statusArray[] =  { "NULL", "IN_PROGRESS", "FINISHED", "FAILED" };
    return leads_export_statusArray[leads_export_status];
}

pinterest_rest_api_leads_export_status__e leads_export_status_leads_export_status_FromString(char* leads_export_status) {
    int stringToReturn = 0;
    char *leads_export_statusArray[] =  { "NULL", "IN_PROGRESS", "FINISHED", "FAILED" };
    size_t sizeofArray = sizeof(leads_export_statusArray) / sizeof(leads_export_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(leads_export_status, leads_export_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *leads_export_status_leads_export_status_convertToJSON(pinterest_rest_api_leads_export_status__e leads_export_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "leads_export_status", leads_export_status_leads_export_status_ToString(leads_export_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_leads_export_status__e leads_export_status_leads_export_status_parseFromJSON(cJSON *leads_export_statusJSON) {
    pinterest_rest_api_leads_export_status__e *leads_export_status = NULL;
    pinterest_rest_api_leads_export_status__e leads_export_statusVariable;
    cJSON *leads_export_statusVar = cJSON_GetObjectItemCaseSensitive(leads_export_statusJSON, "leads_export_status");
    if(!cJSON_IsString(leads_export_statusVar) || (leads_export_statusVar->valuestring == NULL)){
        goto end;
    }
    leads_export_statusVariable = leads_export_status_leads_export_status_FromString(leads_export_statusVar->valuestring);
    return leads_export_statusVariable;
end:
    return 0;
}
