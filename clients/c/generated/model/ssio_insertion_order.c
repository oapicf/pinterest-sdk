#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_insertion_order.h"



static ssio_insertion_order_t *ssio_insertion_order_create_internal(
    char *pin_order_id
    ) {
    ssio_insertion_order_t *ssio_insertion_order_local_var = malloc(sizeof(ssio_insertion_order_t));
    if (!ssio_insertion_order_local_var) {
        return NULL;
    }
    memset(ssio_insertion_order_local_var, 0, sizeof(ssio_insertion_order_t));
    ssio_insertion_order_local_var->_library_owned = 1;
    ssio_insertion_order_local_var->pin_order_id = pin_order_id;
    return ssio_insertion_order_local_var;
}

__attribute__((deprecated)) ssio_insertion_order_t *ssio_insertion_order_create(
    char *pin_order_id
    ) {
    ssio_insertion_order_t *result = ssio_insertion_order_create_internal (
        pin_order_id
        );
    if (!result) {
    }
    return result;
}

void ssio_insertion_order_free(ssio_insertion_order_t *ssio_insertion_order) {
    if(NULL == ssio_insertion_order){
        return ;
    }
    if(ssio_insertion_order->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_insertion_order_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_insertion_order->pin_order_id) {
        free(ssio_insertion_order->pin_order_id);
        ssio_insertion_order->pin_order_id = NULL;
    }
    free(ssio_insertion_order);
}

cJSON *ssio_insertion_order_convertToJSON(ssio_insertion_order_t *ssio_insertion_order) {
    cJSON *item = cJSON_CreateObject();

    // ssio_insertion_order->pin_order_id
    if(ssio_insertion_order->pin_order_id) {
    if(cJSON_AddStringToObject(item, "pin_order_id", ssio_insertion_order->pin_order_id) == NULL) {
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

ssio_insertion_order_t *ssio_insertion_order_parseFromJSON(cJSON *ssio_insertion_orderJSON){

    ssio_insertion_order_t *ssio_insertion_order_local_var = NULL;

    char *pin_order_id_local_str = NULL;

    // ssio_insertion_order->pin_order_id
    cJSON *pin_order_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_orderJSON, "pin_order_id");
    if (cJSON_IsNull(pin_order_id)) {
        pin_order_id = NULL;
    }
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }


    if (pin_order_id && !cJSON_IsNull(pin_order_id)) pin_order_id_local_str = strdup(pin_order_id->valuestring);

    ssio_insertion_order_local_var = ssio_insertion_order_create_internal (
        pin_order_id_local_str
        );

    if (!ssio_insertion_order_local_var) {
        goto end;
    }

    return ssio_insertion_order_local_var;
end:
    if (pin_order_id_local_str) {
        free(pin_order_id_local_str);
        pin_order_id_local_str = NULL;
    }
    return NULL;

}
