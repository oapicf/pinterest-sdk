/*
 * age_trends_bucket.h
 *
 * 
 */

#ifndef _age_trends_bucket_H_
#define _age_trends_bucket_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct age_trends_bucket_t age_trends_bucket_t;


// Enum  for age_trends_bucket

typedef enum { pinterest_rest_api_age_trends_bucket__NULL = 0, pinterest_rest_api_age_trends_bucket___18_24, pinterest_rest_api_age_trends_bucket___25_34, pinterest_rest_api_age_trends_bucket___35_44, pinterest_rest_api_age_trends_bucket___45_49, pinterest_rest_api_age_trends_bucket___50_54, pinterest_rest_api_age_trends_bucket___55_64, pinterest_rest_api_age_trends_bucket___65+ } pinterest_rest_api_age_trends_bucket__e;

char* age_trends_bucket_age_trends_bucket_ToString(pinterest_rest_api_age_trends_bucket__e age_trends_bucket);

pinterest_rest_api_age_trends_bucket__e age_trends_bucket_age_trends_bucket_FromString(char* age_trends_bucket);

cJSON *age_trends_bucket_convertToJSON(pinterest_rest_api_age_trends_bucket__e age_trends_bucket);

pinterest_rest_api_age_trends_bucket__e age_trends_bucket_parseFromJSON(cJSON *age_trends_bucketJSON);

#endif /* _age_trends_bucket_H_ */

