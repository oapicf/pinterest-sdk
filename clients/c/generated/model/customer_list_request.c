#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_request.h"



static customer_list_request_t *customer_list_request_create_internal(
    user_list_type_t *list_type,
    char *name,
    char *records
    ) {
    customer_list_request_t *customer_list_request_local_var = malloc(sizeof(customer_list_request_t));
    if (!customer_list_request_local_var) {
        return NULL;
    }
    customer_list_request_local_var->list_type = list_type;
    customer_list_request_local_var->name = name;
    customer_list_request_local_var->records = records;

    customer_list_request_local_var->_library_owned = 1;
    return customer_list_request_local_var;
}

__attribute__((deprecated)) customer_list_request_t *customer_list_request_create(
    user_list_type_t *list_type,
    char *name,
    char *records
    ) {
    return customer_list_request_create_internal (
        list_type,
        name,
        records
        );
}

void customer_list_request_free(customer_list_request_t *customer_list_request) {
    if(NULL == customer_list_request){
        return ;
    }
    if(customer_list_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_request->list_type) {
        user_list_type_free(customer_list_request->list_type);
        customer_list_request->list_type = NULL;
    }
    if (customer_list_request->name) {
        free(customer_list_request->name);
        customer_list_request->name = NULL;
    }
    if (customer_list_request->records) {
        free(customer_list_request->records);
        customer_list_request->records = NULL;
    }
    free(customer_list_request);
}

cJSON *customer_list_request_convertToJSON(customer_list_request_t *customer_list_request) {
    cJSON *item = cJSON_CreateObject();

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

    // customer_list_request->list_type
    cJSON *list_type = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "list_type");
    if (cJSON_IsNull(list_type)) {
        list_type = NULL;
    }
    if (list_type) { 
    list_type_local_nonprim = user_list_type_parseFromJSON(list_type); //custom
    }

    // customer_list_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // customer_list_request->records
    cJSON *records = cJSON_GetObjectItemCaseSensitive(customer_list_requestJSON, "records");
    if (cJSON_IsNull(records)) {
        records = NULL;
    }
    if (!records) {
        goto end;
    }

    
    if(!cJSON_IsString(records))
    {
    goto end; //String
    }


    customer_list_request_local_var = customer_list_request_create_internal (
        list_type ? list_type_local_nonprim : NULL,
        strdup(name->valuestring),
        strdup(records->valuestring)
        );

    return customer_list_request_local_var;
end:
    if (list_type_local_nonprim) {
        user_list_type_free(list_type_local_nonprim);
        list_type_local_nonprim = NULL;
    }
    return NULL;

}
