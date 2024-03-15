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

#include "exception.h"
#include "user_list_operation_type.h"



typedef struct customer_list_update_request_t {
    char *records; // string
    user_list_operation_type_t *operation_type; // custom
    exception_t *exceptions; //object

} customer_list_update_request_t;

customer_list_update_request_t *customer_list_update_request_create(
    char *records,
    user_list_operation_type_t *operation_type,
    exception_t *exceptions
);

void customer_list_update_request_free(customer_list_update_request_t *customer_list_update_request);

customer_list_update_request_t *customer_list_update_request_parseFromJSON(cJSON *customer_list_update_requestJSON);

cJSON *customer_list_update_request_convertToJSON(customer_list_update_request_t *customer_list_update_request);

#endif /* _customer_list_update_request_H_ */

