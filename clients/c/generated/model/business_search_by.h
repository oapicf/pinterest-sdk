/*
 * business_search_by.h
 *
 * The names of fields that business accounts are searched by
 */

#ifndef _business_search_by_H_
#define _business_search_by_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_search_by_t business_search_by_t;


// Enum  for business_search_by

typedef enum { pinterest_rest_api_business_search_by__NULL = 0, pinterest_rest_api_business_search_by__FULL_NAME, pinterest_rest_api_business_search_by__USERNAME, pinterest_rest_api_business_search_by__BUSINESS_ID, pinterest_rest_api_business_search_by__EMAIL } pinterest_rest_api_business_search_by__e;

char* business_search_by_business_search_by_ToString(pinterest_rest_api_business_search_by__e business_search_by);

pinterest_rest_api_business_search_by__e business_search_by_business_search_by_FromString(char* business_search_by);

cJSON *business_search_by_convertToJSON(pinterest_rest_api_business_search_by__e business_search_by);

pinterest_rest_api_business_search_by__e business_search_by_parseFromJSON(cJSON *business_search_byJSON);

#endif /* _business_search_by_H_ */

