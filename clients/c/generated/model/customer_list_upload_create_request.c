#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_upload_create_request.h"



static customer_list_upload_create_request_t *customer_list_upload_create_request_create_internal(
    pinterest_rest_api_user_list_operation_type__e operation,
    int *total_parts
    ) {
    customer_list_upload_create_request_t *customer_list_upload_create_request_local_var = malloc(sizeof(customer_list_upload_create_request_t));
    if (!customer_list_upload_create_request_local_var) {
        return NULL;
    }
    memset(customer_list_upload_create_request_local_var, 0, sizeof(customer_list_upload_create_request_t));
    customer_list_upload_create_request_local_var->_library_owned = 1;
    customer_list_upload_create_request_local_var->operation = operation;
    customer_list_upload_create_request_local_var->total_parts = total_parts;
    return customer_list_upload_create_request_local_var;
}

__attribute__((deprecated)) customer_list_upload_create_request_t *customer_list_upload_create_request_create(
    pinterest_rest_api_user_list_operation_type__e operation,
    int *total_parts
    ) {
    int *total_parts_copy = NULL;
    if (total_parts) {
        total_parts_copy = malloc(sizeof(int));
        if (total_parts_copy) *total_parts_copy = *total_parts;
    }
    customer_list_upload_create_request_t *result = customer_list_upload_create_request_create_internal (
        operation,
        total_parts_copy
        );
    if (!result) {
        free(total_parts_copy);
    }
    return result;
}

void customer_list_upload_create_request_free(customer_list_upload_create_request_t *customer_list_upload_create_request) {
    if(NULL == customer_list_upload_create_request){
        return ;
    }
    if(customer_list_upload_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_upload_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_upload_create_request->total_parts) {
        free(customer_list_upload_create_request->total_parts);
        customer_list_upload_create_request->total_parts = NULL;
    }
    free(customer_list_upload_create_request);
}

cJSON *customer_list_upload_create_request_convertToJSON(customer_list_upload_create_request_t *customer_list_upload_create_request) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_upload_create_request->operation
    if (pinterest_rest_api_user_list_operation_type__NULL == customer_list_upload_create_request->operation) {
        goto fail;
    }
    cJSON *operation_local_JSON = user_list_operation_type_convertToJSON(customer_list_upload_create_request->operation);
    if(operation_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // customer_list_upload_create_request->total_parts
    if (!customer_list_upload_create_request->total_parts) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_parts", *customer_list_upload_create_request->total_parts) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

customer_list_upload_create_request_t *customer_list_upload_create_request_parseFromJSON(cJSON *customer_list_upload_create_requestJSON){

    customer_list_upload_create_request_t *customer_list_upload_create_request_local_var = NULL;

    // define the local variable for customer_list_upload_create_request->operation
    pinterest_rest_api_user_list_operation_type__e operation_local_nonprim = 0;

    // define the local variable for customer_list_upload_create_request->total_parts
    int *total_parts_local_var = NULL;

    // customer_list_upload_create_request->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(customer_list_upload_create_requestJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (!operation) {
        goto end;
    }

    
    operation_local_nonprim = user_list_operation_type_parseFromJSON(operation); //custom

    // customer_list_upload_create_request->total_parts
    cJSON *total_parts = cJSON_GetObjectItemCaseSensitive(customer_list_upload_create_requestJSON, "total_parts");
    if (cJSON_IsNull(total_parts)) {
        total_parts = NULL;
    }
    if (!total_parts) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total_parts))
    {
    goto end; //Numeric
    }
    total_parts_local_var = malloc(sizeof(int));
    if(!total_parts_local_var)
    {
        goto end;
    }
    *total_parts_local_var = total_parts->valuedouble;



    customer_list_upload_create_request_local_var = customer_list_upload_create_request_create_internal (
        operation_local_nonprim,
        total_parts_local_var
        );

    if (!customer_list_upload_create_request_local_var) {
        goto end;
    }

    return customer_list_upload_create_request_local_var;
end:
    if (operation_local_nonprim) {
        operation_local_nonprim = 0;
    }
    if (total_parts_local_var) {
        free(total_parts_local_var);
        total_parts_local_var = NULL;
    }
    return NULL;

}
