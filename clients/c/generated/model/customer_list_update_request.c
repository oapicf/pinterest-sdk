#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_update_request.h"



customer_list_update_request_t *customer_list_update_request_create(
    char *records,
    user_list_operation_type_t *operation_type,
    exception_t *exceptions
    ) {
    customer_list_update_request_t *customer_list_update_request_local_var = malloc(sizeof(customer_list_update_request_t));
    if (!customer_list_update_request_local_var) {
        return NULL;
    }
    customer_list_update_request_local_var->records = records;
    customer_list_update_request_local_var->operation_type = operation_type;
    customer_list_update_request_local_var->exceptions = exceptions;

    return customer_list_update_request_local_var;
}


void customer_list_update_request_free(customer_list_update_request_t *customer_list_update_request) {
    if(NULL == customer_list_update_request){
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_update_request->records) {
        free(customer_list_update_request->records);
        customer_list_update_request->records = NULL;
    }
    if (customer_list_update_request->operation_type) {
        user_list_operation_type_free(customer_list_update_request->operation_type);
        customer_list_update_request->operation_type = NULL;
    }
    if (customer_list_update_request->exceptions) {
        object_free(customer_list_update_request->exceptions);
        customer_list_update_request->exceptions = NULL;
    }
    free(customer_list_update_request);
}

cJSON *customer_list_update_request_convertToJSON(customer_list_update_request_t *customer_list_update_request) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_update_request->records
    if (!customer_list_update_request->records) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "records", customer_list_update_request->records) == NULL) {
    goto fail; //String
    }


    // customer_list_update_request->operation_type
    if (!customer_list_update_request->operation_type) {
        goto fail;
    }
    cJSON *operation_type_local_JSON = user_list_operation_type_convertToJSON(customer_list_update_request->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // customer_list_update_request->exceptions
    if(customer_list_update_request->exceptions) {
    cJSON *exceptions_object = object_convertToJSON(customer_list_update_request->exceptions);
    if(exceptions_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exceptions", exceptions_object);
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

customer_list_update_request_t *customer_list_update_request_parseFromJSON(cJSON *customer_list_update_requestJSON){

    customer_list_update_request_t *customer_list_update_request_local_var = NULL;

    // define the local variable for customer_list_update_request->operation_type
    user_list_operation_type_t *operation_type_local_nonprim = NULL;

    // customer_list_update_request->records
    cJSON *records = cJSON_GetObjectItemCaseSensitive(customer_list_update_requestJSON, "records");
    if (!records) {
        goto end;
    }

    
    if(!cJSON_IsString(records))
    {
    goto end; //String
    }

    // customer_list_update_request->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(customer_list_update_requestJSON, "operation_type");
    if (!operation_type) {
        goto end;
    }

    
    operation_type_local_nonprim = user_list_operation_type_parseFromJSON(operation_type); //custom

    // customer_list_update_request->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(customer_list_update_requestJSON, "exceptions");
    object_t *exceptions_local_object = NULL;
    if (exceptions) { 
    exceptions_local_object = object_parseFromJSON(exceptions); //object
    }


    customer_list_update_request_local_var = customer_list_update_request_create (
        strdup(records->valuestring),
        operation_type_local_nonprim,
        exceptions ? exceptions_local_object : NULL
        );

    return customer_list_update_request_local_var;
end:
    if (operation_type_local_nonprim) {
        user_list_operation_type_free(operation_type_local_nonprim);
        operation_type_local_nonprim = NULL;
    }
    return NULL;

}
