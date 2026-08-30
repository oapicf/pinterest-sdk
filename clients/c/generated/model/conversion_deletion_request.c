#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_deletion_request.h"



static conversion_deletion_request_t *conversion_deletion_request_create_internal(
    char *created_time,
    char *processed_time,
    char *request_id,
    conversion_deletion_request_status_t *status
    ) {
    conversion_deletion_request_t *conversion_deletion_request_local_var = malloc(sizeof(conversion_deletion_request_t));
    if (!conversion_deletion_request_local_var) {
        return NULL;
    }
    memset(conversion_deletion_request_local_var, 0, sizeof(conversion_deletion_request_t));
    conversion_deletion_request_local_var->_library_owned = 1;
    conversion_deletion_request_local_var->created_time = created_time;
    conversion_deletion_request_local_var->processed_time = processed_time;
    conversion_deletion_request_local_var->request_id = request_id;
    conversion_deletion_request_local_var->status = status;
    return conversion_deletion_request_local_var;
}

__attribute__((deprecated)) conversion_deletion_request_t *conversion_deletion_request_create(
    char *created_time,
    char *processed_time,
    char *request_id,
    conversion_deletion_request_status_t *status
    ) {
    conversion_deletion_request_t *result = conversion_deletion_request_create_internal (
        created_time,
        processed_time,
        request_id,
        status
        );
    if (!result) {
    }
    return result;
}

void conversion_deletion_request_free(conversion_deletion_request_t *conversion_deletion_request) {
    if(NULL == conversion_deletion_request){
        return ;
    }
    if(conversion_deletion_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_deletion_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_deletion_request->created_time) {
        free(conversion_deletion_request->created_time);
        conversion_deletion_request->created_time = NULL;
    }
    if (conversion_deletion_request->processed_time) {
        free(conversion_deletion_request->processed_time);
        conversion_deletion_request->processed_time = NULL;
    }
    if (conversion_deletion_request->request_id) {
        free(conversion_deletion_request->request_id);
        conversion_deletion_request->request_id = NULL;
    }
    if (conversion_deletion_request->status) {
        conversion_deletion_request_status_free(conversion_deletion_request->status);
        conversion_deletion_request->status = NULL;
    }
    free(conversion_deletion_request);
}

cJSON *conversion_deletion_request_convertToJSON(conversion_deletion_request_t *conversion_deletion_request) {
    cJSON *item = cJSON_CreateObject();

    // conversion_deletion_request->created_time
    if (!conversion_deletion_request->created_time) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_time", conversion_deletion_request->created_time) == NULL) {
    goto fail; //Date
    }


    // conversion_deletion_request->processed_time
    if(conversion_deletion_request->processed_time) {
    if(cJSON_AddStringToObject(item, "processed_time", conversion_deletion_request->processed_time) == NULL) {
    goto fail; //Date
    }
    }


    // conversion_deletion_request->request_id
    if (!conversion_deletion_request->request_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "request_id", conversion_deletion_request->request_id) == NULL) {
    goto fail; //String
    }


    // conversion_deletion_request->status
    if (!conversion_deletion_request->status) {
        goto fail;
    }
    cJSON *status_local_JSON = conversion_deletion_request_status_convertToJSON(conversion_deletion_request->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_deletion_request_t *conversion_deletion_request_parseFromJSON(cJSON *conversion_deletion_requestJSON){

    conversion_deletion_request_t *conversion_deletion_request_local_var = NULL;

    char *created_time_local_str = NULL;

    char *processed_time_local_str = NULL;

    char *request_id_local_str = NULL;

    // define the local variable for conversion_deletion_request->status
    conversion_deletion_request_status_t *status_local_nonprim = NULL;

    // conversion_deletion_request->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(conversion_deletion_requestJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (!created_time) {
        goto end;
    }

    
    if(!cJSON_IsString(created_time))
    {
    goto end; //Date
    }

    // conversion_deletion_request->processed_time
    cJSON *processed_time = cJSON_GetObjectItemCaseSensitive(conversion_deletion_requestJSON, "processed_time");
    if (cJSON_IsNull(processed_time)) {
        processed_time = NULL;
    }
    if (processed_time) { 
    if(!cJSON_IsString(processed_time))
    {
    goto end; //Date
    }
    }

    // conversion_deletion_request->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(conversion_deletion_requestJSON, "request_id");
    if (cJSON_IsNull(request_id)) {
        request_id = NULL;
    }
    if (!request_id) {
        goto end;
    }

    
    if(!cJSON_IsString(request_id))
    {
    goto end; //String
    }

    // conversion_deletion_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(conversion_deletion_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    
    status_local_nonprim = conversion_deletion_request_status_parseFromJSON(status); //custom


    if (created_time) created_time_local_str = strdup(created_time->valuestring);
    if (processed_time) processed_time_local_str = strdup(processed_time->valuestring);
    if (request_id && !cJSON_IsNull(request_id)) request_id_local_str = strdup(request_id->valuestring);

    conversion_deletion_request_local_var = conversion_deletion_request_create_internal (
        created_time_local_str,
        processed_time_local_str,
        request_id_local_str,
        status_local_nonprim
        );

    if (!conversion_deletion_request_local_var) {
        goto end;
    }

    return conversion_deletion_request_local_var;
end:
    if (created_time_local_str) {
        free(created_time_local_str);
        created_time_local_str = NULL;
    }
    if (processed_time_local_str) {
        free(processed_time_local_str);
        processed_time_local_str = NULL;
    }
    if (request_id_local_str) {
        free(request_id_local_str);
        request_id_local_str = NULL;
    }
    if (status_local_nonprim) {
        conversion_deletion_request_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
