/*
 * customer_list_upload_create_request.h
 *
 * 
 */

#ifndef _customer_list_upload_create_request_H_
#define _customer_list_upload_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_upload_create_request_t customer_list_upload_create_request_t;

#include "user_list_operation_type.h"



typedef struct customer_list_upload_create_request_t {
    pinterest_rest_api_user_list_operation_type__e operation; //referenced enum
    int *total_parts; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_upload_create_request_t;

__attribute__((deprecated)) customer_list_upload_create_request_t *customer_list_upload_create_request_create(
    pinterest_rest_api_user_list_operation_type__e operation,
    int *total_parts
);

void customer_list_upload_create_request_free(customer_list_upload_create_request_t *customer_list_upload_create_request);

customer_list_upload_create_request_t *customer_list_upload_create_request_parseFromJSON(cJSON *customer_list_upload_create_requestJSON);

cJSON *customer_list_upload_create_request_convertToJSON(customer_list_upload_create_request_t *customer_list_upload_create_request);

#endif /* _customer_list_upload_create_request_H_ */

