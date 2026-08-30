/*
 * customer_segment_update_request_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _customer_segment_update_request_update_with_required_body_H_
#define _customer_segment_update_request_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_segment_update_request_update_with_required_body_t customer_segment_update_request_update_with_required_body_t;

#include "audience_update_operation_type.h"



typedef struct customer_segment_update_request_update_with_required_body_t {
    list_t *audience_ids; //primitive container
    char *id; // string
    pinterest_rest_api_audience_update_operation_type__e operation_type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} customer_segment_update_request_update_with_required_body_t;

__attribute__((deprecated)) customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_create(
    list_t *audience_ids,
    char *id,
    pinterest_rest_api_audience_update_operation_type__e operation_type
);

void customer_segment_update_request_update_with_required_body_free(customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body);

customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body_parseFromJSON(cJSON *customer_segment_update_request_update_with_required_bodyJSON);

cJSON *customer_segment_update_request_update_with_required_body_convertToJSON(customer_segment_update_request_update_with_required_body_t *customer_segment_update_request_update_with_required_body);

#endif /* _customer_segment_update_request_update_with_required_body_H_ */

