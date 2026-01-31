/*
 * targeting_template_update_request.h
 *
 * 
 */

#ifndef _targeting_template_update_request_H_
#define _targeting_template_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_update_request_t targeting_template_update_request_t;

#include "targeting_spec.h"

// Enum OPERATIONTYPE for targeting_template_update_request

typedef enum  { pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_NULL = 0, pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE__REMOVE, pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_UPDATE } pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e;

char* targeting_template_update_request_operation_type_ToString(pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_type);

pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e targeting_template_update_request_operation_type_FromString(char* operation_type);



typedef struct targeting_template_update_request_t {
    char *id; // string
    pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_type; //enum
    struct targeting_spec_t *targeting_attributes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_update_request_t;

__attribute__((deprecated)) targeting_template_update_request_t *targeting_template_update_request_create(
    char *id,
    pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_e operation_type,
    targeting_spec_t *targeting_attributes
);

void targeting_template_update_request_free(targeting_template_update_request_t *targeting_template_update_request);

targeting_template_update_request_t *targeting_template_update_request_parseFromJSON(cJSON *targeting_template_update_requestJSON);

cJSON *targeting_template_update_request_convertToJSON(targeting_template_update_request_t *targeting_template_update_request);

#endif /* _targeting_template_update_request_H_ */

