/*
 * targeting_template_update_request_read_or_update.h
 *
 * 
 */

#ifndef _targeting_template_update_request_read_or_update_H_
#define _targeting_template_update_request_read_or_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_update_request_read_or_update_t targeting_template_update_request_read_or_update_t;

#include "audience_update_operation_type.h"
#include "targeting_spec_optimal.h"



typedef struct targeting_template_update_request_read_or_update_t {
    char *id; // string
    pinterest_rest_api_audience_update_operation_type__e operation_type; //referenced enum
    struct targeting_spec_optimal_t *targeting_attributes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_update_request_read_or_update_t;

__attribute__((deprecated)) targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_create(
    char *id,
    pinterest_rest_api_audience_update_operation_type__e operation_type,
    targeting_spec_optimal_t *targeting_attributes
);

void targeting_template_update_request_read_or_update_free(targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update);

targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update_parseFromJSON(cJSON *targeting_template_update_request_read_or_updateJSON);

cJSON *targeting_template_update_request_read_or_update_convertToJSON(targeting_template_update_request_read_or_update_t *targeting_template_update_request_read_or_update);

#endif /* _targeting_template_update_request_read_or_update_H_ */

