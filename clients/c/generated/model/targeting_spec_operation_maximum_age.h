/*
 * targeting_spec_operation_maximum_age.h
 *
 * 
 */

#ifndef _targeting_spec_operation_maximum_age_H_
#define _targeting_spec_operation_maximum_age_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_maximum_age_t targeting_spec_operation_maximum_age_t;


// Enum FIELD for targeting_spec_operation_maximum_age

typedef enum  { pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_NULL = 0, pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_MAXIMUM_AGE } pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_e;

char* targeting_spec_operation_maximum_age_field_ToString(pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_e field);

pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_e targeting_spec_operation_maximum_age_field_FromString(char* field);

// Enum OPERATION for targeting_spec_operation_maximum_age

typedef enum  { pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_NULL = 0, pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_SET } pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_e;

char* targeting_spec_operation_maximum_age_operation_ToString(pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_e operation);

pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_e targeting_spec_operation_maximum_age_operation_FromString(char* operation);



typedef struct targeting_spec_operation_maximum_age_t {
    pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_e field; //enum
    pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_e operation; //enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_maximum_age_t;

__attribute__((deprecated)) targeting_spec_operation_maximum_age_t *targeting_spec_operation_maximum_age_create(
    pinterest_rest_api_targeting_spec_operation_maximum_age_FIELD_e field,
    pinterest_rest_api_targeting_spec_operation_maximum_age_OPERATION_e operation,
    char *value
);

void targeting_spec_operation_maximum_age_free(targeting_spec_operation_maximum_age_t *targeting_spec_operation_maximum_age);

targeting_spec_operation_maximum_age_t *targeting_spec_operation_maximum_age_parseFromJSON(cJSON *targeting_spec_operation_maximum_ageJSON);

cJSON *targeting_spec_operation_maximum_age_convertToJSON(targeting_spec_operation_maximum_age_t *targeting_spec_operation_maximum_age);

#endif /* _targeting_spec_operation_maximum_age_H_ */

