/*
 * business_member_sort_by.h
 *
 * The name of field that businesses are sorted by
 */

#ifndef _business_member_sort_by_H_
#define _business_member_sort_by_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_member_sort_by_t business_member_sort_by_t;


// Enum  for business_member_sort_by

typedef enum { pinterest_rest_api_business_member_sort_by__NULL = 0, pinterest_rest_api_business_member_sort_by__FULL_NAME, pinterest_rest_api_business_member_sort_by__BUSINESS_ROLES, pinterest_rest_api_business_member_sort_by__CREATED_TIME } pinterest_rest_api_business_member_sort_by__e;

char* business_member_sort_by_business_member_sort_by_ToString(pinterest_rest_api_business_member_sort_by__e business_member_sort_by);

pinterest_rest_api_business_member_sort_by__e business_member_sort_by_business_member_sort_by_FromString(char* business_member_sort_by);

cJSON *business_member_sort_by_convertToJSON(pinterest_rest_api_business_member_sort_by__e business_member_sort_by);

pinterest_rest_api_business_member_sort_by__e business_member_sort_by_parseFromJSON(cJSON *business_member_sort_byJSON);

#endif /* _business_member_sort_by_H_ */

