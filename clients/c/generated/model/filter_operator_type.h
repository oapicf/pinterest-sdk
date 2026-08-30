/*
 * filter_operator_type.h
 *
 * 
 */

#ifndef _filter_operator_type_H_
#define _filter_operator_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct filter_operator_type_t filter_operator_type_t;


// Enum  for filter_operator_type

typedef enum { pinterest_rest_api_filter_operator_type__NULL = 0, pinterest_rest_api_filter_operator_type__IS, pinterest_rest_api_filter_operator_type__CONTAINS } pinterest_rest_api_filter_operator_type__e;

char* filter_operator_type_filter_operator_type_ToString(pinterest_rest_api_filter_operator_type__e filter_operator_type);

pinterest_rest_api_filter_operator_type__e filter_operator_type_filter_operator_type_FromString(char* filter_operator_type);

cJSON *filter_operator_type_convertToJSON(pinterest_rest_api_filter_operator_type__e filter_operator_type);

pinterest_rest_api_filter_operator_type__e filter_operator_type_parseFromJSON(cJSON *filter_operator_typeJSON);

#endif /* _filter_operator_type_H_ */

