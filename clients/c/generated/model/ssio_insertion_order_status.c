#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_insertion_order_status.h"



ssio_insertion_order_status_t *ssio_insertion_order_status_create(
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

    return ssio_insertion_order_status_local_var;
}


void ssio_insertion_order_status_free(ssio_insertion_order_status_t *ssio_insertion_order_status) {
    if(NULL == ssio_insertion_order_status){
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
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_status->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_statusJSON, "status");
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_status->creation_time
    cJSON *creation_time = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_statusJSON, "creation_time");
    if (creation_time) { 
    if(!cJSON_IsString(creation_time) && !cJSON_IsNull(creation_time))
    {
    goto end; //String
    }
    }


    ssio_insertion_order_status_local_var = ssio_insertion_order_status_create (
        pin_order_id && !cJSON_IsNull(pin_order_id) ? strdup(pin_order_id->valuestring) : NULL,
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL,
        creation_time && !cJSON_IsNull(creation_time) ? strdup(creation_time->valuestring) : NULL
        );

    return ssio_insertion_order_status_local_var;
end:
    return NULL;

}
