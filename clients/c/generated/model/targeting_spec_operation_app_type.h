/*
 * targeting_spec_operation_app_type.h
 *
 * 
 */

#ifndef _targeting_spec_operation_app_type_H_
#define _targeting_spec_operation_app_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_app_type_t targeting_spec_operation_app_type_t;

#include "targeting_spec_app_type.h"
#include "targeting_spec_list_operation.h"

// Enum FIELD for targeting_spec_operation_app_type

typedef enum  { pinterest_rest_api_targeting_spec_operation_app_type_FIELD_NULL = 0, pinterest_rest_api_targeting_spec_operation_app_type_FIELD_APPTYPE } pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e;

char* targeting_spec_operation_app_type_field_ToString(pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e field);

pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e targeting_spec_operation_app_type_field_FromString(char* field);

// Enum  for targeting_spec_operation_app_type

typedef enum  { pinterest_rest_api_targeting_spec_operation_app_type__NULL = 0, pinterest_rest_api_targeting_spec_operation_app_type__android_mobile, pinterest_rest_api_targeting_spec_operation_app_type__android_tablet, pinterest_rest_api_targeting_spec_operation_app_type__ipad, pinterest_rest_api_targeting_spec_operation_app_type__iphone, pinterest_rest_api_targeting_spec_operation_app_type__web, pinterest_rest_api_targeting_spec_operation_app_type__web_mobile } pinterest_rest_api_targeting_spec_operation_app_type__e;

char* targeting_spec_operation_app_type_values_ToString(pinterest_rest_api_targeting_spec_operation_app_type__e values);

pinterest_rest_api_targeting_spec_operation_app_type__e targeting_spec_operation_app_type_values_FromString(char* values);



typedef struct targeting_spec_operation_app_type_t {
    pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e field; //enum
    pinterest_rest_api_targeting_spec_list_operation__e operation; //referenced enum
    list_t *values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_app_type_t;

__attribute__((deprecated)) targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_create(
    pinterest_rest_api_targeting_spec_operation_app_type_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
);

void targeting_spec_operation_app_type_free(targeting_spec_operation_app_type_t *targeting_spec_operation_app_type);

targeting_spec_operation_app_type_t *targeting_spec_operation_app_type_parseFromJSON(cJSON *targeting_spec_operation_app_typeJSON);

cJSON *targeting_spec_operation_app_type_convertToJSON(targeting_spec_operation_app_type_t *targeting_spec_operation_app_type);

#endif /* _targeting_spec_operation_app_type_H_ */

