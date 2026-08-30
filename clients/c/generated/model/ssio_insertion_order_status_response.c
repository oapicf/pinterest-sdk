#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_insertion_order_status_response.h"



static ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_create_internal(
    char *creation_time,
    char *pin_order_id,
    char *status
    ) {
    ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_local_var = malloc(sizeof(ssio_insertion_order_status_response_t));
    if (!ssio_insertion_order_status_response_local_var) {
        return NULL;
    }
    memset(ssio_insertion_order_status_response_local_var, 0, sizeof(ssio_insertion_order_status_response_t));
    ssio_insertion_order_status_response_local_var->_library_owned = 1;
    ssio_insertion_order_status_response_local_var->creation_time = creation_time;
    ssio_insertion_order_status_response_local_var->pin_order_id = pin_order_id;
    ssio_insertion_order_status_response_local_var->status = status;
    return ssio_insertion_order_status_response_local_var;
}

__attribute__((deprecated)) ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_create(
    char *creation_time,
    char *pin_order_id,
    char *status
    ) {
    ssio_insertion_order_status_response_t *result = ssio_insertion_order_status_response_create_internal (
        creation_time,
        pin_order_id,
        status
        );
    if (!result) {
    }
    return result;
}

void ssio_insertion_order_status_response_free(ssio_insertion_order_status_response_t *ssio_insertion_order_status_response) {
    if(NULL == ssio_insertion_order_status_response){
        return ;
    }
    if(ssio_insertion_order_status_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_insertion_order_status_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_insertion_order_status_response->creation_time) {
        free(ssio_insertion_order_status_response->creation_time);
        ssio_insertion_order_status_response->creation_time = NULL;
    }
    if (ssio_insertion_order_status_response->pin_order_id) {
        free(ssio_insertion_order_status_response->pin_order_id);
        ssio_insertion_order_status_response->pin_order_id = NULL;
    }
    if (ssio_insertion_order_status_response->status) {
        free(ssio_insertion_order_status_response->status);
        ssio_insertion_order_status_response->status = NULL;
    }
    free(ssio_insertion_order_status_response);
}

cJSON *ssio_insertion_order_status_response_convertToJSON(ssio_insertion_order_status_response_t *ssio_insertion_order_status_response) {
    cJSON *item = cJSON_CreateObject();

    // ssio_insertion_order_status_response->creation_time
    if(ssio_insertion_order_status_response->creation_time) {
    if(cJSON_AddStringToObject(item, "creation_time", ssio_insertion_order_status_response->creation_time) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_status_response->pin_order_id
    if(ssio_insertion_order_status_response->pin_order_id) {
    if(cJSON_AddStringToObject(item, "pin_order_id", ssio_insertion_order_status_response->pin_order_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_status_response->status
    if(ssio_insertion_order_status_response->status) {
    if(cJSON_AddStringToObject(item, "status", ssio_insertion_order_status_response->status) == NULL) {
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

ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_parseFromJSON(cJSON *ssio_insertion_order_status_responseJSON){

    ssio_insertion_order_status_response_t *ssio_insertion_order_status_response_local_var = NULL;

    char *creation_time_local_str = NULL;

    char *pin_order_id_local_str = NULL;

    char *status_local_str = NULL;

    // ssio_insertion_order_status_response->creation_time
    cJSON *creation_time = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_status_responseJSON, "creation_time");
    if (cJSON_IsNull(creation_time)) {
        creation_time = NULL;
    }
    if (creation_time) { 
    if(!cJSON_IsString(creation_time) && !cJSON_IsNull(creation_time))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_status_response->pin_order_id
    cJSON *pin_order_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_status_responseJSON, "pin_order_id");
    if (cJSON_IsNull(pin_order_id)) {
        pin_order_id = NULL;
    }
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_status_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_status_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }


    if (creation_time && !cJSON_IsNull(creation_time)) creation_time_local_str = strdup(creation_time->valuestring);
    if (pin_order_id && !cJSON_IsNull(pin_order_id)) pin_order_id_local_str = strdup(pin_order_id->valuestring);
    if (status && !cJSON_IsNull(status)) status_local_str = strdup(status->valuestring);

    ssio_insertion_order_status_response_local_var = ssio_insertion_order_status_response_create_internal (
        creation_time_local_str,
        pin_order_id_local_str,
        status_local_str
        );

    if (!ssio_insertion_order_status_response_local_var) {
        goto end;
    }

    return ssio_insertion_order_status_response_local_var;
end:
    if (creation_time_local_str) {
        free(creation_time_local_str);
        creation_time_local_str = NULL;
    }
    if (pin_order_id_local_str) {
        free(pin_order_id_local_str);
        pin_order_id_local_str = NULL;
    }
    if (status_local_str) {
        free(status_local_str);
        status_local_str = NULL;
    }
    return NULL;

}
