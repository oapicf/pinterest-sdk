#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_age_bucket_multipliers.h"


char* schedule_age_bucket_multipliers_age_bucket_ToString(pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucket) {
    char* age_bucketArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return age_bucketArray[age_bucket];
}

pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e schedule_age_bucket_multipliers_age_bucket_FromString(char* age_bucket){
    int stringToReturn = 0;
    char *age_bucketArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(age_bucketArray) / sizeof(age_bucketArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(age_bucket, age_bucketArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_create_internal(
    pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucket
    ) {
    schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_local_var = malloc(sizeof(schedule_age_bucket_multipliers_t));
    if (!schedule_age_bucket_multipliers_local_var) {
        return NULL;
    }
    memset(schedule_age_bucket_multipliers_local_var, 0, sizeof(schedule_age_bucket_multipliers_t));
    schedule_age_bucket_multipliers_local_var->_library_owned = 1;
    schedule_age_bucket_multipliers_local_var->age_bucket = age_bucket;
    return schedule_age_bucket_multipliers_local_var;
}

__attribute__((deprecated)) schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_create(
    pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucket
    ) {
    schedule_age_bucket_multipliers_t *result = schedule_age_bucket_multipliers_create_internal (
        age_bucket
        );
    if (!result) {
    }
    return result;
}

void schedule_age_bucket_multipliers_free(schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers) {
    if(NULL == schedule_age_bucket_multipliers){
        return ;
    }
    if(schedule_age_bucket_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_age_bucket_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    free(schedule_age_bucket_multipliers);
}

cJSON *schedule_age_bucket_multipliers_convertToJSON(schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // schedule_age_bucket_multipliers->age_bucket
    if(schedule_age_bucket_multipliers->age_bucket != pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_NULL) {
    if(cJSON_AddStringToObject(item, "AGE_BUCKET", schedule_age_bucket_multipliers_age_bucket_ToString(schedule_age_bucket_multipliers->age_bucket)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_parseFromJSON(cJSON *schedule_age_bucket_multipliersJSON){

    schedule_age_bucket_multipliers_t *schedule_age_bucket_multipliers_local_var = NULL;

    // schedule_age_bucket_multipliers->age_bucket
    cJSON *age_bucket = cJSON_GetObjectItemCaseSensitive(schedule_age_bucket_multipliersJSON, "AGE_BUCKET");
    if (cJSON_IsNull(age_bucket)) {
        age_bucket = NULL;
    }
    pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_e age_bucketVariable;
    if (age_bucket) { 
    if(!cJSON_IsString(age_bucket))
    {
    goto end; //Enum
    }
    age_bucketVariable = schedule_age_bucket_multipliers_age_bucket_FromString(age_bucket->valuestring);
    }



    schedule_age_bucket_multipliers_local_var = schedule_age_bucket_multipliers_create_internal (
        age_bucket ? age_bucketVariable : pinterest_rest_api_schedule_age_bucket_multipliers_AGEBUCKET_NULL
        );

    if (!schedule_age_bucket_multipliers_local_var) {
        goto end;
    }

    return schedule_age_bucket_multipliers_local_var;
end:
    return NULL;

}
