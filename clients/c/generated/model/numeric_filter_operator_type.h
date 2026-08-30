/*
 * numeric_filter_operator_type.h
 *
 * 
 */

#ifndef _numeric_filter_operator_type_H_
#define _numeric_filter_operator_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct numeric_filter_operator_type_t numeric_filter_operator_type_t;


// Enum  for numeric_filter_operator_type

typedef enum { pinterest_rest_api_numeric_filter_operator_type__NULL = 0, pinterest_rest_api_numeric_filter_operator_type__GREATER_THAN, pinterest_rest_api_numeric_filter_operator_type__GREATER_THAN_OR_EQUALS, pinterest_rest_api_numeric_filter_operator_type__LESS_THAN, pinterest_rest_api_numeric_filter_operator_type__LESS_THAN_OR_EQUALS } pinterest_rest_api_numeric_filter_operator_type__e;

char* numeric_filter_operator_type_numeric_filter_operator_type_ToString(pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type);

pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type_numeric_filter_operator_type_FromString(char* numeric_filter_operator_type);

cJSON *numeric_filter_operator_type_convertToJSON(pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type);

pinterest_rest_api_numeric_filter_operator_type__e numeric_filter_operator_type_parseFromJSON(cJSON *numeric_filter_operator_typeJSON);

#endif /* _numeric_filter_operator_type_H_ */

