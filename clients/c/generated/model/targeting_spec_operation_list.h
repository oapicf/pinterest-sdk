/*
 * targeting_spec_operation_list.h
 *
 * 
 */

#ifndef _targeting_spec_operation_list_H_
#define _targeting_spec_operation_list_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_list_t targeting_spec_operation_list_t;


// Enum OPERATION for targeting_spec_operation_list

typedef enum  { pinterest_rest_api_targeting_spec_operation_list_OPERATION_NULL = 0, pinterest_rest_api_targeting_spec_operation_list_OPERATION_SET, pinterest_rest_api_targeting_spec_operation_list_OPERATION_ADD, pinterest_rest_api_targeting_spec_operation_list_OPERATION__REMOVE } pinterest_rest_api_targeting_spec_operation_list_OPERATION_e;

char* targeting_spec_operation_list_operation_ToString(pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operation);

pinterest_rest_api_targeting_spec_operation_list_OPERATION_e targeting_spec_operation_list_operation_FromString(char* operation);



typedef struct targeting_spec_operation_list_t {
    char *field; // string
    pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operation; //enum
    list_t *values; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_list_t;

__attribute__((deprecated)) targeting_spec_operation_list_t *targeting_spec_operation_list_create(
    char *field,
    pinterest_rest_api_targeting_spec_operation_list_OPERATION_e operation,
    list_t *values
);

void targeting_spec_operation_list_free(targeting_spec_operation_list_t *targeting_spec_operation_list);

targeting_spec_operation_list_t *targeting_spec_operation_list_parseFromJSON(cJSON *targeting_spec_operation_listJSON);

cJSON *targeting_spec_operation_list_convertToJSON(targeting_spec_operation_list_t *targeting_spec_operation_list);

#endif /* _targeting_spec_operation_list_H_ */

