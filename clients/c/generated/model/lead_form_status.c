#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_status.h"


char* lead_form_status_lead_form_status_ToString(pinterest_rest_api_lead_form_status__e lead_form_status) {
    char *lead_form_statusArray[] =  { "NULL", "DRAFT", "ACTIVE" };
    return lead_form_statusArray[lead_form_status];
}

pinterest_rest_api_lead_form_status__e lead_form_status_lead_form_status_FromString(char* lead_form_status) {
    int stringToReturn = 0;
    char *lead_form_statusArray[] =  { "NULL", "DRAFT", "ACTIVE" };
    size_t sizeofArray = sizeof(lead_form_statusArray) / sizeof(lead_form_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(lead_form_status, lead_form_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *lead_form_status_lead_form_status_convertToJSON(pinterest_rest_api_lead_form_status__e lead_form_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "lead_form_status", lead_form_status_lead_form_status_ToString(lead_form_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_lead_form_status__e lead_form_status_lead_form_status_parseFromJSON(cJSON *lead_form_statusJSON) {
    pinterest_rest_api_lead_form_status__e *lead_form_status = NULL;
    pinterest_rest_api_lead_form_status__e lead_form_statusVariable;
    cJSON *lead_form_statusVar = cJSON_GetObjectItemCaseSensitive(lead_form_statusJSON, "lead_form_status");
    if(!cJSON_IsString(lead_form_statusVar) || (lead_form_statusVar->valuestring == NULL)){
        goto end;
    }
    lead_form_statusVariable = lead_form_status_lead_form_status_FromString(lead_form_statusVar->valuestring);
    return lead_form_statusVariable;
end:
    return 0;
}
