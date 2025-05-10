#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_insertion_order_status.h"



static ssio_insertion_order_status_t *ssio_insertion_order_status_create_internal(
    char *pin_order_id,
    char *status,
    char *creation_time
    ) {
    ssio_insertion_order_status_t *ssio_insertion_order_status_local_var = malloc(sizeof(ssio_insertion_order_status_t));
    if (!ssio_insertion_order_status_local_var) {
        return NULL;
    }
    ssio_insertion_order_status_local_var->pin_order_id = pin_order_id;
    ssio_insertion_order_status_local_var->status = status;
    ssio_insertion_order_status_local_var->creation_time = creation_time;

    ssio_insertion_order_status_local_var->_library_owned = 1;
    return ssio_insertion_order_status_local_var;
}

__attribute__((deprecated)) ssio_insertion_order_status_t *ssio_insertion_order_status_create(
    char *pin_order_id,
    char *status,
    char *creation_time
    ) {
    return ssio_insertion_order_status_create_internal (
        pin_order_id,
        status,
        creation_time
        );
}

void ssio_insertion_order_status_free(ssio_insertion_order_status_t *ssio_insertion_order_status) {
    if(NULL == ssio_insertion_order_status){
        return ;
    }
    if(ssio_insertion_order_status->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_insertion_order_status_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_insertion_order_status->pin_order_id) {
        free(ssio_insertion_order_status->pin_order_id);
        ssio_insertion_order_status->pin_order_id = NULL;
    }
    if (ssio_insertion_order_status->status) {
        free(ssio_insertion_order_status->status);
        ssio_insertion_order_status->status = NULL;
    }
    if (ssio_insertion_order_status->creation_time) {
        free(ssio_insertion_order_status->creation_time);
        ssio_insertion_order_status->creation_time = NULL;
    }
    free(ssio_insertion_order_status);
}

cJSON *ssio_insertion_order_status_convertToJSON(ssio_insertion_order_status_t *ssio_insertion_order_status) {
    cJSON *item = cJSON_CreateObject();

    // ssio_insertion_order_status->pin_order_id
    if(ssio_insertion_order_status->pin_order_id) {
    if(cJSON_AddStringToObject(item, "pin_order_id", ssio_insertion_order_status->pin_order_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_status->status
    if(ssio_insertion_order_status->status) {
    if(cJSON_AddStringToObject(item, "status", ssio_insertion_order_status->status) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_status->creation_time
    if(ssio_insertion_order_status->creation_time) {
    if(cJSON_AddStringToObject(item, "creation_time", ssio_insertion_order_status->creation_time) == NULL) {
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

ssio_insertion_order_status_t *ssio_insertion_order_status_parseFromJSON(cJSON *ssio_insertion_order_statusJSON){

    ssio_insertion_order_status_t *ssio_insertion_order_status_local_var = NULL;

    // ssio_insertion_order_status->pin_order_id
    cJSON *pin_order_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_statusJSON, "pin_order_id");
    if (cJSON_IsNull(pin_order_id)) {
        pin_order_id = NULL;
    }
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_status->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_statusJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_status->creation_time
    cJSON *creation_time = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_statusJSON, "creation_time");
    if (cJSON_IsNull(creation_time)) {
        creation_time = NULL;
    }
    if (creation_time) { 
    if(!cJSON_IsString(creation_time) && !cJSON_IsNull(creation_time))
    {
    goto end; //String
    }
    }


    ssio_insertion_order_status_local_var = ssio_insertion_order_status_create_internal (
        pin_order_id && !cJSON_IsNull(pin_order_id) ? strdup(pin_order_id->valuestring) : NULL,
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL,
        creation_time && !cJSON_IsNull(creation_time) ? strdup(creation_time->valuestring) : NULL
        );

    return ssio_insertion_order_status_local_var;
end:
    return NULL;

}
