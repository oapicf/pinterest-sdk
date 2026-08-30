/*
 * business_to_business_shared_audience_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _business_to_business_shared_audience_update_with_required_body_H_
#define _business_to_business_shared_audience_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_to_business_shared_audience_update_with_required_body_t business_to_business_shared_audience_update_with_required_body_t;

#include "operation_type.h"



typedef struct business_to_business_shared_audience_update_with_required_body_t {
    char *audience_id; // string
    pinterest_rest_api_operation_type__e operation_type; //referenced enum
    list_t *recipient_business_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} business_to_business_shared_audience_update_with_required_body_t;

__attribute__((deprecated)) business_to_business_shared_audience_update_with_required_body_t *business_to_business_shared_audience_update_with_required_body_create(
    char *audience_id,
    pinterest_rest_api_operation_type__e operation_type,
    list_t *recipient_business_ids
);

void business_to_business_shared_audience_update_with_required_body_free(business_to_business_shared_audience_update_with_required_body_t *business_to_business_shared_audience_update_with_required_body);

business_to_business_shared_audience_update_with_required_body_t *business_to_business_shared_audience_update_with_required_body_parseFromJSON(cJSON *business_to_business_shared_audience_update_with_required_bodyJSON);

cJSON *business_to_business_shared_audience_update_with_required_body_convertToJSON(business_to_business_shared_audience_update_with_required_body_t *business_to_business_shared_audience_update_with_required_body);

#endif /* _business_to_business_shared_audience_update_with_required_body_H_ */

