#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label_bulk_update_request.h"


char* label_bulk_update_request_status_ToString(pinterest_rest_api_label_bulk_update_request_STATUS_e status) {
    char* statusArray[] =  { "NULL", "ARCHIVED" };
    return statusArray[status];
}

pinterest_rest_api_label_bulk_update_request_STATUS_e label_bulk_update_request_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ARCHIVED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static label_bulk_update_request_t *label_bulk_update_request_create_internal(
    char *id,
    pinterest_rest_api_label_bulk_update_request_STATUS_e status,
    char *value
    ) {
    label_bulk_update_request_t *label_bulk_update_request_local_var = malloc(sizeof(label_bulk_update_request_t));
    if (!label_bulk_update_request_local_var) {
        return NULL;
    }
    label_bulk_update_request_local_var->id = id;
    label_bulk_update_request_local_var->status = status;
    label_bulk_update_request_local_var->value = value;

    label_bulk_update_request_local_var->_library_owned = 1;
    return label_bulk_update_request_local_var;
}

__attribute__((deprecated)) label_bulk_update_request_t *label_bulk_update_request_create(
    char *id,
    pinterest_rest_api_label_bulk_update_request_STATUS_e status,
    char *value
    ) {
    return label_bulk_update_request_create_internal (
        id,
        status,
        value
        );
}

void label_bulk_update_request_free(label_bulk_update_request_t *label_bulk_update_request) {
    if(NULL == label_bulk_update_request){
        return ;
    }
    if(label_bulk_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_bulk_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label_bulk_update_request->id) {
        free(label_bulk_update_request->id);
        label_bulk_update_request->id = NULL;
    }
    if (label_bulk_update_request->value) {
        free(label_bulk_update_request->value);
        label_bulk_update_request->value = NULL;
    }
    free(label_bulk_update_request);
}

cJSON *label_bulk_update_request_convertToJSON(label_bulk_update_request_t *label_bulk_update_request) {
    cJSON *item = cJSON_CreateObject();

    // label_bulk_update_request->id
    if (!label_bulk_update_request->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", label_bulk_update_request->id) == NULL) {
    goto fail; //String
    }


    // label_bulk_update_request->status
    if(label_bulk_update_request->status != pinterest_rest_api_label_bulk_update_request_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", label_bulk_update_request_status_ToString(label_bulk_update_request->status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // label_bulk_update_request->value
    if(label_bulk_update_request->value) {
    if(cJSON_AddStringToObject(item, "value", label_bulk_update_request->value) == NULL) {
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

label_bulk_update_request_t *label_bulk_update_request_parseFromJSON(cJSON *label_bulk_update_requestJSON){

    label_bulk_update_request_t *label_bulk_update_request_local_var = NULL;

    // label_bulk_update_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(label_bulk_update_requestJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // label_bulk_update_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(label_bulk_update_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    pinterest_rest_api_label_bulk_update_request_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = label_bulk_update_request_status_FromString(status->valuestring);
    }

    // label_bulk_update_request->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(label_bulk_update_requestJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    label_bulk_update_request_local_var = label_bulk_update_request_create_internal (
        strdup(id->valuestring),
        status ? statusVariable : pinterest_rest_api_label_bulk_update_request_STATUS_NULL,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL
        );

    return label_bulk_update_request_local_var;
end:
    return NULL;

}
