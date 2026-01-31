/*
 * targeting_spec_operation_string.h
 *
 * 
 */

#ifndef _targeting_spec_operation_string_H_
#define _targeting_spec_operation_string_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_string_t targeting_spec_operation_string_t;


// Enum OPERATION for targeting_spec_operation_string

typedef enum  { pinterest_rest_api_targeting_spec_operation_string_OPERATION_NULL = 0, pinterest_rest_api_targeting_spec_operation_string_OPERATION_SET } pinterest_rest_api_targeting_spec_operation_string_OPERATION_e;

char* targeting_spec_operation_string_operation_ToString(pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operation);

pinterest_rest_api_targeting_spec_operation_string_OPERATION_e targeting_spec_operation_string_operation_FromString(char* operation);



typedef struct targeting_spec_operation_string_t {
    char *field; // string
    pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operation; //enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_string_t;

__attribute__((deprecated)) targeting_spec_operation_string_t *targeting_spec_operation_string_create(
    char *field,
    pinterest_rest_api_targeting_spec_operation_string_OPERATION_e operation,
    char *value
);

void targeting_spec_operation_string_free(targeting_spec_operation_string_t *targeting_spec_operation_string);

targeting_spec_operation_string_t *targeting_spec_operation_string_parseFromJSON(cJSON *targeting_spec_operation_stringJSON);

cJSON *targeting_spec_operation_string_convertToJSON(targeting_spec_operation_string_t *targeting_spec_operation_string);

#endif /* _targeting_spec_operation_string_H_ */

