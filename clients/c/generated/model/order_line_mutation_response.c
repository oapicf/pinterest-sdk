#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_line_mutation_response.h"



static order_line_mutation_response_t *order_line_mutation_response_create_internal(
    order_line_mutation_result_t *data
    ) {
    order_line_mutation_response_t *order_line_mutation_response_local_var = malloc(sizeof(order_line_mutation_response_t));
    if (!order_line_mutation_response_local_var) {
        return NULL;
    }
    memset(order_line_mutation_response_local_var, 0, sizeof(order_line_mutation_response_t));
    order_line_mutation_response_local_var->_library_owned = 1;
    order_line_mutation_response_local_var->data = data;
    return order_line_mutation_response_local_var;
}

__attribute__((deprecated)) order_line_mutation_response_t *order_line_mutation_response_create(
    order_line_mutation_result_t *data
    ) {
    order_line_mutation_response_t *result = order_line_mutation_response_create_internal (
        data
        );
    if (!result) {
    }
    return result;
}

void order_line_mutation_response_free(order_line_mutation_response_t *order_line_mutation_response) {
    if(NULL == order_line_mutation_response){
        return ;
    }
    if(order_line_mutation_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "order_line_mutation_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (order_line_mutation_response->data) {
        order_line_mutation_result_free(order_line_mutation_response->data);
        order_line_mutation_response->data = NULL;
    }
    free(order_line_mutation_response);
}

cJSON *order_line_mutation_response_convertToJSON(order_line_mutation_response_t *order_line_mutation_response) {
    cJSON *item = cJSON_CreateObject();

    // order_line_mutation_response->data
    if(order_line_mutation_response->data) {
    cJSON *data_local_JSON = order_line_mutation_result_convertToJSON(order_line_mutation_response->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
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

order_line_mutation_response_t *order_line_mutation_response_parseFromJSON(cJSON *order_line_mutation_responseJSON){

    order_line_mutation_response_t *order_line_mutation_response_local_var = NULL;

    // define the local variable for order_line_mutation_response->data
    order_line_mutation_result_t *data_local_nonprim = NULL;

    // order_line_mutation_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(order_line_mutation_responseJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    data_local_nonprim = order_line_mutation_result_parseFromJSON(data); //nonprimitive
    }



    order_line_mutation_response_local_var = order_line_mutation_response_create_internal (
        data ? data_local_nonprim : NULL
        );

    if (!order_line_mutation_response_local_var) {
        goto end;
    }

    return order_line_mutation_response_local_var;
end:
    if (data_local_nonprim) {
        order_line_mutation_result_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
