/*
 * gender_bucket.h
 *
 * 
 */

#ifndef _gender_bucket_H_
#define _gender_bucket_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_bucket_t gender_bucket_t;


// Enum  for gender_bucket

typedef enum { pinterest_rest_api_gender_bucket__NULL = 0, pinterest_rest_api_gender_bucket__MALE, pinterest_rest_api_gender_bucket__FEMALE, pinterest_rest_api_gender_bucket__UNSPECIFIED } pinterest_rest_api_gender_bucket__e;

char* gender_bucket_gender_bucket_ToString(pinterest_rest_api_gender_bucket__e gender_bucket);

pinterest_rest_api_gender_bucket__e gender_bucket_gender_bucket_FromString(char* gender_bucket);

cJSON *gender_bucket_convertToJSON(pinterest_rest_api_gender_bucket__e gender_bucket);

pinterest_rest_api_gender_bucket__e gender_bucket_parseFromJSON(cJSON *gender_bucketJSON);

#endif /* _gender_bucket_H_ */

