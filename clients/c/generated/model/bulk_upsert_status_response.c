#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_status_response.h"


char* bulk_upsert_status_response_status_ToString(pinterest_rest_api_bulk_upsert_status_response__e status) {
    char* statusArray[] =  { "NULL", "RUNNING", "SUCCEEDED", "FAILED" };
    return statusArray[status];
}

pinterest_rest_api_bulk_upsert_status_response__e bulk_upsert_status_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "RUNNING", "SUCCEEDED", "FAILED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

bulk_upsert_status_response_t *bulk_upsert_status_response_create(
    bulk_upsert_status_t *status,
    char *result_url
    ) {
    bulk_upsert_status_response_t *bulk_upsert_status_response_local_var = malloc(sizeof(bulk_upsert_status_response_t));
    if (!bulk_upsert_status_response_local_var) {
        return NULL;
    }
    bulk_upsert_status_response_local_var->status = status;
    bulk_upsert_status_response_local_var->result_url = result_url;

    return bulk_upsert_status_response_local_var;
}


void bulk_upsert_status_response_free(bulk_upsert_status_response_t *bulk_upsert_status_response) {
    if(NULL == bulk_upsert_status_response){
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_status_response->status) {
        bulk_upsert_status_free(bulk_upsert_status_response->status);
        bulk_upsert_status_response->status = NULL;
    }
    if (bulk_upsert_status_response->result_url) {
        free(bulk_upsert_status_response->result_url);
        bulk_upsert_status_response->result_url = NULL;
    }
    free(bulk_upsert_status_response);
}

cJSON *bulk_upsert_status_response_convertToJSON(bulk_upsert_status_response_t *bulk_upsert_status_response) {
    cJSON *item = cJSON_CreateObject();

    // bulk_upsert_status_response->status
    if(bulk_upsert_status_response->status != pinterest_rest_api_bulk_upsert_status_response__NULL) {
    cJSON *status_local_JSON = bulk_upsert_status_convertToJSON(bulk_upsert_status_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // bulk_upsert_status_response->result_url
    if(bulk_upsert_status_response->result_url) {
    if(cJSON_AddStringToObject(item, "result_url", bulk_upsert_status_response->result_url) == NULL) {
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

bulk_upsert_status_response_t *bulk_upsert_status_response_parseFromJSON(cJSON *bulk_upsert_status_responseJSON){

    bulk_upsert_status_response_t *bulk_upsert_status_response_local_var = NULL;

    // define the local variable for bulk_upsert_status_response->status
    bulk_upsert_status_t *status_local_nonprim = NULL;

    // bulk_upsert_status_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(bulk_upsert_status_responseJSON, "status");
    if (status) { 
    status_local_nonprim = bulk_upsert_status_parseFromJSON(status); //custom
    }

    // bulk_upsert_status_response->result_url
    cJSON *result_url = cJSON_GetObjectItemCaseSensitive(bulk_upsert_status_responseJSON, "result_url");
    if (result_url) { 
    if(!cJSON_IsString(result_url) && !cJSON_IsNull(result_url))
    {
    goto end; //String
    }
    }


    bulk_upsert_status_response_local_var = bulk_upsert_status_response_create (
        status ? status_local_nonprim : NULL,
        result_url && !cJSON_IsNull(result_url) ? strdup(result_url->valuestring) : NULL
        );

    return bulk_upsert_status_response_local_var;
end:
    if (status_local_nonprim) {
        bulk_upsert_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
