/*
 * trends_gender_filter.h
 *
 * Gender category for trends demographic distribution.
 */

#ifndef _trends_gender_filter_H_
#define _trends_gender_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_gender_filter_t trends_gender_filter_t;


// Enum  for trends_gender_filter

typedef enum { pinterest_rest_api_trends_gender_filter__NULL = 0, pinterest_rest_api_trends_gender_filter__male, pinterest_rest_api_trends_gender_filter__female, pinterest_rest_api_trends_gender_filter__unknown } pinterest_rest_api_trends_gender_filter__e;

char* trends_gender_filter_trends_gender_filter_ToString(pinterest_rest_api_trends_gender_filter__e trends_gender_filter);

pinterest_rest_api_trends_gender_filter__e trends_gender_filter_trends_gender_filter_FromString(char* trends_gender_filter);

cJSON *trends_gender_filter_convertToJSON(pinterest_rest_api_trends_gender_filter__e trends_gender_filter);

pinterest_rest_api_trends_gender_filter__e trends_gender_filter_parseFromJSON(cJSON *trends_gender_filterJSON);

#endif /* _trends_gender_filter_H_ */

