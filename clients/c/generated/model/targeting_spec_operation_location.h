/*
 * targeting_spec_operation_location.h
 *
 * 
 */

#ifndef _targeting_spec_operation_location_H_
#define _targeting_spec_operation_location_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_location_t targeting_spec_operation_location_t;

#include "targeting_spec_list_operation.h"

// Enum FIELD for targeting_spec_operation_location

typedef enum  { pinterest_rest_api_targeting_spec_operation_location_FIELD_NULL = 0, pinterest_rest_api_targeting_spec_operation_location_FIELD_LOCATION } pinterest_rest_api_targeting_spec_operation_location_FIELD_e;

char* targeting_spec_operation_location_field_ToString(pinterest_rest_api_targeting_spec_operation_location_FIELD_e field);

pinterest_rest_api_targeting_spec_operation_location_FIELD_e targeting_spec_operation_location_field_FromString(char* field);



typedef struct targeting_spec_operation_location_t {
    pinterest_rest_api_targeting_spec_operation_location_FIELD_e field; //enum
    pinterest_rest_api_targeting_spec_list_operation__e operation; //referenced enum
    list_t *values; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_location_t;

__attribute__((deprecated)) targeting_spec_operation_location_t *targeting_spec_operation_location_create(
    pinterest_rest_api_targeting_spec_operation_location_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
);

void targeting_spec_operation_location_free(targeting_spec_operation_location_t *targeting_spec_operation_location);

targeting_spec_operation_location_t *targeting_spec_operation_location_parseFromJSON(cJSON *targeting_spec_operation_locationJSON);

cJSON *targeting_spec_operation_location_convertToJSON(targeting_spec_operation_location_t *targeting_spec_operation_location);

#endif /* _targeting_spec_operation_location_H_ */

