#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_single_response.h"



static order_line_single_response_t *order_line_single_response_create_internal(
    order_line_response_t *data
    ) {
    order_line_single_response_t *order_line_single_response_local_var = malloc(sizeof(order_line_single_response_t));
    if (!order_line_single_response_local_var) {
        return NULL;
    }
    order_line_single_response_local_var->data = data;

    order_line_single_response_local_var->_library_owned = 1;
    return order_line_single_response_local_var;
}

__attribute__((deprecated)) order_line_single_response_t *order_line_single_response_create(
    order_line_response_t *data
    ) {
    return order_line_single_response_create_internal (
        data
        );
}

void order_line_single_response_free(order_line_single_response_t *order_line_single_response) {
    if(NULL == order_line_single_response){
        return ;
    }
    if(order_line_single_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "order_line_single_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (order_line_single_response->data) {
        object_free(order_line_single_response->data);
        order_line_single_response->data = NULL;
    }
    free(order_line_single_response);
}

cJSON *order_line_single_response_convertToJSON(order_line_single_response_t *order_line_single_response) {
    cJSON *item = cJSON_CreateObject();

    // order_line_single_response->data
    if(order_line_single_response->data) {
    cJSON *data_object = object_convertToJSON(order_line_single_response->data);
    if(data_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_object);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_line_single_response_t *order_line_single_response_parseFromJSON(cJSON *order_line_single_responseJSON){

    order_line_single_response_t *order_line_single_response_local_var = NULL;

    // order_line_single_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(order_line_single_responseJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    object_t *data_local_object = NULL;
    if (data) { 
    data_local_object = object_parseFromJSON(data); //object
    }


    order_line_single_response_local_var = order_line_single_response_create_internal (
        data ? data_local_object : NULL
        );

    return order_line_single_response_local_var;
end:
    return NULL;

}
