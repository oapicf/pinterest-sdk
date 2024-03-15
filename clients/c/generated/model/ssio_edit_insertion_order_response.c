#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_edit_insertion_order_response.h"



ssio_edit_insertion_order_response_t *ssio_edit_insertion_order_response_create(
    char *pin_order_id
    ) {
    ssio_edit_insertion_order_response_t *ssio_edit_insertion_order_response_local_var = malloc(sizeof(ssio_edit_insertion_order_response_t));
    if (!ssio_edit_insertion_order_response_local_var) {
        return NULL;
    }
    ssio_edit_insertion_order_response_local_var->pin_order_id = pin_order_id;

    return ssio_edit_insertion_order_response_local_var;
}


void ssio_edit_insertion_order_response_free(ssio_edit_insertion_order_response_t *ssio_edit_insertion_order_response) {
    if(NULL == ssio_edit_insertion_order_response){
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_edit_insertion_order_response->pin_order_id) {
        free(ssio_edit_insertion_order_response->pin_order_id);
        ssio_edit_insertion_order_response->pin_order_id = NULL;
    }
    free(ssio_edit_insertion_order_response);
}

cJSON *ssio_edit_insertion_order_response_convertToJSON(ssio_edit_insertion_order_response_t *ssio_edit_insertion_order_response) {
    cJSON *item = cJSON_CreateObject();

    // ssio_edit_insertion_order_response->pin_order_id
    if(ssio_edit_insertion_order_response->pin_order_id) {
    if(cJSON_AddStringToObject(item, "pin_order_id", ssio_edit_insertion_order_response->pin_order_id) == NULL) {
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

ssio_edit_insertion_order_response_t *ssio_edit_insertion_order_response_parseFromJSON(cJSON *ssio_edit_insertion_order_responseJSON){

    ssio_edit_insertion_order_response_t *ssio_edit_insertion_order_response_local_var = NULL;

    // ssio_edit_insertion_order_response->pin_order_id
    cJSON *pin_order_id = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_responseJSON, "pin_order_id");
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }


    ssio_edit_insertion_order_response_local_var = ssio_edit_insertion_order_response_create (
        pin_order_id && !cJSON_IsNull(pin_order_id) ? strdup(pin_order_id->valuestring) : NULL
        );

    return ssio_edit_insertion_order_response_local_var;
end:
    return NULL;

}
