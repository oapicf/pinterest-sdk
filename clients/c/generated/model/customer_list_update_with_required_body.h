/*
 * customer_list_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _customer_list_update_with_required_body_H_
#define _customer_list_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_update_with_required_body_t customer_list_update_with_required_body_t;

#include "customer_list_record_row.h"
#include "user_list_operation_type.h"



typedef struct customer_list_update_with_required_body_t {
    user_list_operation_type_t *operation_type; // custom
    char *records; // string
    list_t *records_v2; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_update_with_required_body_t;

__attribute__((deprecated)) customer_list_update_with_required_body_t *customer_list_update_with_required_body_create(
    user_list_operation_type_t *operation_type,
    char *records,
    list_t *records_v2
);

void customer_list_update_with_required_body_free(customer_list_update_with_required_body_t *customer_list_update_with_required_body);

customer_list_update_with_required_body_t *customer_list_update_with_required_body_parseFromJSON(cJSON *customer_list_update_with_required_bodyJSON);

cJSON *customer_list_update_with_required_body_convertToJSON(customer_list_update_with_required_body_t *customer_list_update_with_required_body);

#endif /* _customer_list_update_with_required_body_H_ */

