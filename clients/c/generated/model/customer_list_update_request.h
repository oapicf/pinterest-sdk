/*
 * customer_list_update_request.h
 *
 * 
 */

#ifndef _customer_list_update_request_H_
#define _customer_list_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_update_request_t customer_list_update_request_t;

#include "user_list_operation_type.h"



typedef struct customer_list_update_request_t {
    user_list_operation_type_t *operation_type; // custom
    char *records; // string

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_update_request_t;

__attribute__((deprecated)) customer_list_update_request_t *customer_list_update_request_create(
    user_list_operation_type_t *operation_type,
    char *records
);

void customer_list_update_request_free(customer_list_update_request_t *customer_list_update_request);

customer_list_update_request_t *customer_list_update_request_parseFromJSON(cJSON *customer_list_update_requestJSON);

cJSON *customer_list_update_request_convertToJSON(customer_list_update_request_t *customer_list_update_request);

#endif /* _customer_list_update_request_H_ */

