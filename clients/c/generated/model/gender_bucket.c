#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_bucket.h"


char* gender_bucket_gender_bucket_ToString(pinterest_rest_api_gender_bucket__e gender_bucket) {
    char *gender_bucketArray[] =  { "NULL", "MALE", "FEMALE", "UNSPECIFIED" };
    return gender_bucketArray[gender_bucket];
}

pinterest_rest_api_gender_bucket__e gender_bucket_gender_bucket_FromString(char* gender_bucket) {
    int stringToReturn = 0;
    char *gender_bucketArray[] =  { "NULL", "MALE", "FEMALE", "UNSPECIFIED" };
    size_t sizeofArray = sizeof(gender_bucketArray) / sizeof(gender_bucketArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(gender_bucket, gender_bucketArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *gender_bucket_convertToJSON(pinterest_rest_api_gender_bucket__e gender_bucket) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "gender_bucket", gender_bucket_gender_bucket_ToString(gender_bucket)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_gender_bucket__e gender_bucket_parseFromJSON(cJSON *gender_bucketJSON) {
    if(!cJSON_IsString(gender_bucketJSON) || (gender_bucketJSON->valuestring == NULL)) {
        return 0;
    }
    return gender_bucket_gender_bucket_FromString(gender_bucketJSON->valuestring);
}
