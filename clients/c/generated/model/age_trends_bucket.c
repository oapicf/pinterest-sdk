#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "age_trends_bucket.h"


char* age_trends_bucket_age_trends_bucket_ToString(pinterest_rest_api_age_trends_bucket__e age_trends_bucket) {
    char *age_trends_bucketArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return age_trends_bucketArray[age_trends_bucket];
}

pinterest_rest_api_age_trends_bucket__e age_trends_bucket_age_trends_bucket_FromString(char* age_trends_bucket) {
    int stringToReturn = 0;
    char *age_trends_bucketArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(age_trends_bucketArray) / sizeof(age_trends_bucketArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(age_trends_bucket, age_trends_bucketArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *age_trends_bucket_convertToJSON(pinterest_rest_api_age_trends_bucket__e age_trends_bucket) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "age_trends_bucket", age_trends_bucket_age_trends_bucket_ToString(age_trends_bucket)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_age_trends_bucket__e age_trends_bucket_parseFromJSON(cJSON *age_trends_bucketJSON) {
    if(!cJSON_IsString(age_trends_bucketJSON) || (age_trends_bucketJSON->valuestring == NULL)) {
        return 0;
    }
    return age_trends_bucket_age_trends_bucket_FromString(age_trends_bucketJSON->valuestring);
}
