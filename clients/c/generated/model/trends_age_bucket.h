/*
 * trends_age_bucket.h
 *
 * 
 */

#ifndef _trends_age_bucket_H_
#define _trends_age_bucket_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_age_bucket_t trends_age_bucket_t;


// Enum  for trends_age_bucket

typedef enum { pinterest_rest_api_trends_age_bucket__NULL = 0, pinterest_rest_api_trends_age_bucket___18_24, pinterest_rest_api_trends_age_bucket___25_34, pinterest_rest_api_trends_age_bucket___35_44, pinterest_rest_api_trends_age_bucket___45_49, pinterest_rest_api_trends_age_bucket___50_54, pinterest_rest_api_trends_age_bucket___55_64, pinterest_rest_api_trends_age_bucket___65+ } pinterest_rest_api_trends_age_bucket__e;

char* trends_age_bucket_trends_age_bucket_ToString(pinterest_rest_api_trends_age_bucket__e trends_age_bucket);

pinterest_rest_api_trends_age_bucket__e trends_age_bucket_trends_age_bucket_FromString(char* trends_age_bucket);

cJSON *trends_age_bucket_convertToJSON(pinterest_rest_api_trends_age_bucket__e trends_age_bucket);

pinterest_rest_api_trends_age_bucket__e trends_age_bucket_parseFromJSON(cJSON *trends_age_bucketJSON);

#endif /* _trends_age_bucket_H_ */

