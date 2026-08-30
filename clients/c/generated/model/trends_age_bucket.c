#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_age_bucket.h"


char* trends_age_bucket_trends_age_bucket_ToString(pinterest_rest_api_trends_age_bucket__e trends_age_bucket) {
    char *trends_age_bucketArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return trends_age_bucketArray[trends_age_bucket];
}

pinterest_rest_api_trends_age_bucket__e trends_age_bucket_trends_age_bucket_FromString(char* trends_age_bucket) {
    int stringToReturn = 0;
    char *trends_age_bucketArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(trends_age_bucketArray) / sizeof(trends_age_bucketArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(trends_age_bucket, trends_age_bucketArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *trends_age_bucket_convertToJSON(pinterest_rest_api_trends_age_bucket__e trends_age_bucket) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "trends_age_bucket", trends_age_bucket_trends_age_bucket_ToString(trends_age_bucket)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_trends_age_bucket__e trends_age_bucket_parseFromJSON(cJSON *trends_age_bucketJSON) {
    if(!cJSON_IsString(trends_age_bucketJSON) || (trends_age_bucketJSON->valuestring == NULL)) {
        return 0;
    }
    return trends_age_bucket_trends_age_bucket_FromString(trends_age_bucketJSON->valuestring);
}
