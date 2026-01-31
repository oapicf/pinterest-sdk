/*
 * targeting_spec_age_bucket.h
 *
 * 
 */

#ifndef _targeting_spec_age_bucket_H_
#define _targeting_spec_age_bucket_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_age_bucket_t targeting_spec_age_bucket_t;


// Enum  for targeting_spec_age_bucket

typedef enum { pinterest_rest_api_targeting_spec_age_bucket__NULL = 0, pinterest_rest_api_targeting_spec_age_bucket___18_24, pinterest_rest_api_targeting_spec_age_bucket___19+, pinterest_rest_api_targeting_spec_age_bucket___20+, pinterest_rest_api_targeting_spec_age_bucket___21+, pinterest_rest_api_targeting_spec_age_bucket___25_34, pinterest_rest_api_targeting_spec_age_bucket___35_44, pinterest_rest_api_targeting_spec_age_bucket___45_49, pinterest_rest_api_targeting_spec_age_bucket___50_54, pinterest_rest_api_targeting_spec_age_bucket___55_64, pinterest_rest_api_targeting_spec_age_bucket___65+ } pinterest_rest_api_targeting_spec_age_bucket__e;

char* targeting_spec_age_bucket_targeting_spec_age_bucket_ToString(pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket);

pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket_targeting_spec_age_bucket_FromString(char* targeting_spec_age_bucket);

cJSON *targeting_spec_age_bucket_convertToJSON(pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket);

pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket_parseFromJSON(cJSON *targeting_spec_age_bucketJSON);

#endif /* _targeting_spec_age_bucket_H_ */

