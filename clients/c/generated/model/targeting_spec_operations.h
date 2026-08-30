/*
 * targeting_spec_operations.h
 *
 * 
 */

#ifndef _targeting_spec_operations_H_
#define _targeting_spec_operations_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operations_t targeting_spec_operations_t;

#include "targeting_spec_operation_age_bucket.h"
#include "targeting_spec_operation_app_type.h"
#include "targeting_spec_operation_audience_exclude.h"
#include "targeting_spec_operation_audience_include.h"
#include "targeting_spec_operation_gender.h"
#include "targeting_spec_operation_geo.h"
#include "targeting_spec_operation_geo_exclude.h"
#include "targeting_spec_operation_interest.h"
#include "targeting_spec_operation_locale.h"
#include "targeting_spec_operation_location.h"
#include "targeting_spec_operation_location_exclude.h"
#include "targeting_spec_operation_maximum_age.h"
#include "targeting_spec_operation_minimum_age.h"
#include "targeting_spec_operation_shopping_retargeting.h"
#include "targeting_spec_shopping_retargeting.h"

// Enum FIELD for targeting_spec_operations

typedef enum  { pinterest_rest_api_targeting_spec_operations_FIELD_NULL = 0, pinterest_rest_api_targeting_spec_operations_FIELD_MINIMUM_AGE } pinterest_rest_api_targeting_spec_operations_FIELD_e;

char* targeting_spec_operations_field_ToString(pinterest_rest_api_targeting_spec_operations_FIELD_e field);

pinterest_rest_api_targeting_spec_operations_FIELD_e targeting_spec_operations_field_FromString(char* field);

// Enum OPERATION for targeting_spec_operations

typedef enum  { pinterest_rest_api_targeting_spec_operations_OPERATION_NULL = 0, pinterest_rest_api_targeting_spec_operations_OPERATION_SET } pinterest_rest_api_targeting_spec_operations_OPERATION_e;

char* targeting_spec_operations_operation_ToString(pinterest_rest_api_targeting_spec_operations_OPERATION_e operation);

pinterest_rest_api_targeting_spec_operations_OPERATION_e targeting_spec_operations_operation_FromString(char* operation);



typedef struct targeting_spec_operations_t {
    pinterest_rest_api_targeting_spec_operations_FIELD_e field; //enum
    pinterest_rest_api_targeting_spec_operations_OPERATION_e operation; //enum
    list_t *values; //nonprimitive container
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operations_t;

__attribute__((deprecated)) targeting_spec_operations_t *targeting_spec_operations_create(
    pinterest_rest_api_targeting_spec_operations_FIELD_e field,
    pinterest_rest_api_targeting_spec_operations_OPERATION_e operation,
    list_t *values,
    char *value
);

void targeting_spec_operations_free(targeting_spec_operations_t *targeting_spec_operations);

targeting_spec_operations_t *targeting_spec_operations_parseFromJSON(cJSON *targeting_spec_operationsJSON);

cJSON *targeting_spec_operations_convertToJSON(targeting_spec_operations_t *targeting_spec_operations);

#endif /* _targeting_spec_operations_H_ */

