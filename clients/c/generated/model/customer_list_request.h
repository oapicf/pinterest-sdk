/*
 * customer_list_request.h
 *
 * 
 */

#ifndef _customer_list_request_H_
#define _customer_list_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_request_t customer_list_request_t;

#include "object.h"
#include "user_list_type.h"



typedef struct customer_list_request_t {
    char *name; // string
    char *records; // string
    user_list_type_t *list_type; // custom
    object_t *exceptions; //object

} customer_list_request_t;

customer_list_request_t *customer_list_request_create(
    char *name,
    char *records,
    user_list_type_t *list_type,
    object_t *exceptions
);

void customer_list_request_free(customer_list_request_t *customer_list_request);

customer_list_request_t *customer_list_request_parseFromJSON(cJSON *customer_list_requestJSON);

cJSON *customer_list_request_convertToJSON(customer_list_request_t *customer_list_request);

#endif /* _customer_list_request_H_ */

