#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_age_bucket.h"


char* targeting_spec_age_bucket_targeting_spec_age_bucket_ToString(pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket) {
    char *targeting_spec_age_bucketArray[] =  { "NULL", "18-24", "19+", "20+", "21+", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return targeting_spec_age_bucketArray[targeting_spec_age_bucket];
}

pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket_targeting_spec_age_bucket_FromString(char* targeting_spec_age_bucket) {
    int stringToReturn = 0;
    char *targeting_spec_age_bucketArray[] =  { "NULL", "18-24", "19+", "20+", "21+", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(targeting_spec_age_bucketArray) / sizeof(targeting_spec_age_bucketArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_spec_age_bucket, targeting_spec_age_bucketArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_spec_age_bucket_convertToJSON(pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_spec_age_bucket", targeting_spec_age_bucket_targeting_spec_age_bucket_ToString(targeting_spec_age_bucket)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_spec_age_bucket__e targeting_spec_age_bucket_parseFromJSON(cJSON *targeting_spec_age_bucketJSON) {
    if(!cJSON_IsString(targeting_spec_age_bucketJSON) || (targeting_spec_age_bucketJSON->valuestring == NULL)) {
        return 0;
    }
    return targeting_spec_age_bucket_targeting_spec_age_bucket_FromString(targeting_spec_age_bucketJSON->valuestring);
}
