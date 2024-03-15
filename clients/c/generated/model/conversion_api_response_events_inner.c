#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_api_response_events_inner.h"


char* conversion_api_response_events_inner_status_ToString(pinterest_rest_api_conversion_api_response_events_inner_STATUS_e status) {
    char* statusArray[] =  { "NULL", "failed", "processed" };
    return statusArray[status];
}

pinterest_rest_api_conversion_api_response_events_inner_STATUS_e conversion_api_response_events_inner_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "failed", "processed" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

conversion_api_response_events_inner_t *conversion_api_response_events_inner_create(
    pinterest_rest_api_conversion_api_response_events_inner_STATUS_e status,
    char *error_message,
    char *warning_message
    ) {
    conversion_api_response_events_inner_t *conversion_api_response_events_inner_local_var = malloc(sizeof(conversion_api_response_events_inner_t));
    if (!conversion_api_response_events_inner_local_var) {
        return NULL;
    }
    conversion_api_response_events_inner_local_var->status = status;
    conversion_api_response_events_inner_local_var->error_message = error_message;
    conversion_api_response_events_inner_local_var->warning_message = warning_message;

    return conversion_api_response_events_inner_local_var;
}


void conversion_api_response_events_inner_free(conversion_api_response_events_inner_t *conversion_api_response_events_inner) {
    if(NULL == conversion_api_response_events_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_api_response_events_inner->error_message) {
        free(conversion_api_response_events_inner->error_message);
        conversion_api_response_events_inner->error_message = NULL;
    }
    if (conversion_api_response_events_inner->warning_message) {
        free(conversion_api_response_events_inner->warning_message);
        conversion_api_response_events_inner->warning_message = NULL;
    }
    free(conversion_api_response_events_inner);
}

cJSON *conversion_api_response_events_inner_convertToJSON(conversion_api_response_events_inner_t *conversion_api_response_events_inner) {
    cJSON *item = cJSON_CreateObject();

    // conversion_api_response_events_inner->status
    if (pinterest_rest_api_conversion_api_response_events_inner_STATUS_NULL == conversion_api_response_events_inner->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", statusconversion_api_response_events_inner_ToString(conversion_api_response_events_inner->status)) == NULL)
    {
    goto fail; //Enum
    }


    // conversion_api_response_events_inner->error_message
    if(conversion_api_response_events_inner->error_message) {
    if(cJSON_AddStringToObject(item, "error_message", conversion_api_response_events_inner->error_message) == NULL) {
    goto fail; //String
    }
    }


    // conversion_api_response_events_inner->warning_message
    if(conversion_api_response_events_inner->warning_message) {
    if(cJSON_AddStringToObject(item, "warning_message", conversion_api_response_events_inner->warning_message) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_api_response_events_inner_t *conversion_api_response_events_inner_parseFromJSON(cJSON *conversion_api_response_events_innerJSON){

    conversion_api_response_events_inner_t *conversion_api_response_events_inner_local_var = NULL;

    // conversion_api_response_events_inner->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(conversion_api_response_events_innerJSON, "status");
    if (!status) {
        goto end;
    }

    pinterest_rest_api_conversion_api_response_events_inner_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = conversion_api_response_events_inner_status_FromString(status->valuestring);

    // conversion_api_response_events_inner->error_message
    cJSON *error_message = cJSON_GetObjectItemCaseSensitive(conversion_api_response_events_innerJSON, "error_message");
    if (error_message) { 
    if(!cJSON_IsString(error_message) && !cJSON_IsNull(error_message))
    {
    goto end; //String
    }
    }

    // conversion_api_response_events_inner->warning_message
    cJSON *warning_message = cJSON_GetObjectItemCaseSensitive(conversion_api_response_events_innerJSON, "warning_message");
    if (warning_message) { 
    if(!cJSON_IsString(warning_message) && !cJSON_IsNull(warning_message))
    {
    goto end; //String
    }
    }


    conversion_api_response_events_inner_local_var = conversion_api_response_events_inner_create (
        statusVariable,
        error_message && !cJSON_IsNull(error_message) ? strdup(error_message->valuestring) : NULL,
        warning_message && !cJSON_IsNull(warning_message) ? strdup(warning_message->valuestring) : NULL
        );

    return conversion_api_response_events_inner_local_var;
end:
    return NULL;

}
