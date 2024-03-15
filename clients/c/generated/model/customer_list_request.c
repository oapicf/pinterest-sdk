#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_request.h"



customer_list_request_t *customer_list_request_create(
    char *name,
    char *records,
    user_list_type_t *list_type,
    object_t *exceptions
    ) {
    customer_list_request_t *customer_list_request_local_var = malloc(sizeof(customer_list_request_t));
    if (!customer_list_request_local_var) {
        return NULL;
    }
    customer_list_request_local_var->name = name;
    customer_list_request_local_var->records = records;
    customer_list_request_local_var->list_type = list_type;
    customer_list_request_local_var->exceptions = exceptions;

    return customer_list_request_local_var;
}


void customer_list_request_free(customer_list_request_t *customer_list_request) {
    if(NULL == customer_list_request){
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_request->name) {
        free(customer_list_request->name);
        customer_list_request->name = NULL;
    }
    if (customer_list_request->records) {
        free(customer_list_request->records);
        customer_list_request->records = NULL;
    }
    if (customer_list_request->list_type) {
        user_list_type_free(customer_list_request->list_type);
        customer_list_request->list_type = NULL;
    }
    if (customer_list_request->exceptions) {
        object_free(customer_list_request->exceptions);
        customer_list_request->exceptions = NULL;
    }
    free(customer_list_request);
}

cJSON *customer_list_request_convertToJSON(customer_list_request_t *customer_list_request) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_request->name
    if (!customer_list_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", customer_list_request->name) == NULL) {
    goto fail; //String
    }


    // customer_list_request->records
    if (!customer_list_request->records) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "records", customer_list_request->records) == NULL) {
    goto fail; //String
    }


    // customer_list_request->list_type
    if(customer_list_request->list_type) {
    cJSON *list_type_local_JSON = user_list_type_convertToJSON(customer_list_request->list_type);
    if(list_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "list_type", list_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // customer_list_request->exceptions
    if(customer_list_request->exceptions) {
    cJSON *exceptions_object = object_convertToJSON(customer_list_request->exceptions);
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

customer_list_request_t *customer_list_request_parseFromJSON(cJSON *customer_list_requestJSON){

    customer_list_request_t *customer_list_request_local_var = NULL;

    // define the local variable for customer_list_request->list_type
    user_list_type_t *list_type_local_nonprim = NULL;

    // customer_list_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // customer_list_request->records
    cJSON *records = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "records");
    if (!records) {
        goto end;
    }

    
    if(!cJSON_IsString(records))
    {
    goto end; //String
    }

    // customer_list_request->list_type
    cJSON *list_type = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "list_type");
    if (list_type) { 
    list_type_local_nonprim = user_list_type_parseFromJSON(list_type); //custom
    }

    // customer_list_request->exceptions
    cJSON *exceptions = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "exceptions");
    object_t *exceptions_local_object = NULL;
    if (exceptions) { 
    exceptions_local_object = object_parseFromJSON(exceptions); //object
    }


    customer_list_request_local_var = customer_list_request_create (
        strdup(name->valuestring),
        strdup(records->valuestring),
        list_type ? list_type_local_nonprim : NULL,
        exceptions ? exceptions_local_object : NULL
        );

    return customer_list_request_local_var;
end:
    if (list_type_local_nonprim) {
        user_list_type_free(list_type_local_nonprim);
        list_type_local_nonprim = NULL;
    }
    return NULL;

}
