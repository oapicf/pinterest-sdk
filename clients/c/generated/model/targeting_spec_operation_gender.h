/*
 * targeting_spec_operation_gender.h
 *
 * 
 */

#ifndef _targeting_spec_operation_gender_H_
#define _targeting_spec_operation_gender_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_gender_t targeting_spec_operation_gender_t;

#include "targeting_spec_gender.h"
#include "targeting_spec_list_operation.h"

// Enum FIELD for targeting_spec_operation_gender

typedef enum  { pinterest_rest_api_targeting_spec_operation_gender_FIELD_NULL = 0, pinterest_rest_api_targeting_spec_operation_gender_FIELD_GENDER } pinterest_rest_api_targeting_spec_operation_gender_FIELD_e;

char* targeting_spec_operation_gender_field_ToString(pinterest_rest_api_targeting_spec_operation_gender_FIELD_e field);

pinterest_rest_api_targeting_spec_operation_gender_FIELD_e targeting_spec_operation_gender_field_FromString(char* field);

// Enum  for targeting_spec_operation_gender

typedef enum  { pinterest_rest_api_targeting_spec_operation_gender__NULL = 0, pinterest_rest_api_targeting_spec_operation_gender__unknown, pinterest_rest_api_targeting_spec_operation_gender__male, pinterest_rest_api_targeting_spec_operation_gender__female } pinterest_rest_api_targeting_spec_operation_gender__e;

char* targeting_spec_operation_gender_values_ToString(pinterest_rest_api_targeting_spec_operation_gender__e values);

pinterest_rest_api_targeting_spec_operation_gender__e targeting_spec_operation_gender_values_FromString(char* values);



typedef struct targeting_spec_operation_gender_t {
    pinterest_rest_api_targeting_spec_operation_gender_FIELD_e field; //enum
    pinterest_rest_api_targeting_spec_list_operation__e operation; //referenced enum
    list_t *values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_gender_t;

__attribute__((deprecated)) targeting_spec_operation_gender_t *targeting_spec_operation_gender_create(
    pinterest_rest_api_targeting_spec_operation_gender_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
);

void targeting_spec_operation_gender_free(targeting_spec_operation_gender_t *targeting_spec_operation_gender);

targeting_spec_operation_gender_t *targeting_spec_operation_gender_parseFromJSON(cJSON *targeting_spec_operation_genderJSON);

cJSON *targeting_spec_operation_gender_convertToJSON(targeting_spec_operation_gender_t *targeting_spec_operation_gender);

#endif /* _targeting_spec_operation_gender_H_ */

