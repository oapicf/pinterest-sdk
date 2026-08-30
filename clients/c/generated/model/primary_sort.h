/*
 * primary_sort.h
 *
 * Whether to first sort the report by date or by ID
 */

#ifndef _primary_sort_H_
#define _primary_sort_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct primary_sort_t primary_sort_t;


// Enum  for primary_sort

typedef enum { pinterest_rest_api_primary_sort__NULL = 0, pinterest_rest_api_primary_sort__BY_ID, pinterest_rest_api_primary_sort__BY_DATE } pinterest_rest_api_primary_sort__e;

char* primary_sort_primary_sort_ToString(pinterest_rest_api_primary_sort__e primary_sort);

pinterest_rest_api_primary_sort__e primary_sort_primary_sort_FromString(char* primary_sort);

cJSON *primary_sort_convertToJSON(pinterest_rest_api_primary_sort__e primary_sort);

pinterest_rest_api_primary_sort__e primary_sort_parseFromJSON(cJSON *primary_sortJSON);

#endif /* _primary_sort_H_ */

