#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_single_response.h"



order_line_single_response_t *order_line_single_response_create(
    order_line_response_t *data
    ) {
    order_line_single_response_t *order_line_single_response_local_var = malloc(sizeof(order_line_single_response_t));
    if (!order_line_single_response_local_var) {
        return NULL;
    }
    order_line_single_response_local_var->data = data;

    return order_line_single_response_local_var;
}


void order_line_single_response_free(order_line_single_response_t *order_line_single_response) {
    if(NULL == order_line_single_response){
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
    object_t *data_local_object = NULL;
    if (data) { 
    data_local_object = object_parseFromJSON(data); //object
    }


    order_line_single_response_local_var = order_line_single_response_create (
        data ? data_local_object : NULL
        );

    return order_line_single_response_local_var;
end:
    return NULL;

}
