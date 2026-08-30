#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_age_distribution.h"



static trends_age_distribution_t *trends_age_distribution_create_internal(
    pinterest_rest_api_trends_age_bucket__e age_distribution
    ) {
    trends_age_distribution_t *trends_age_distribution_local_var = malloc(sizeof(trends_age_distribution_t));
    if (!trends_age_distribution_local_var) {
        return NULL;
    }
    memset(trends_age_distribution_local_var, 0, sizeof(trends_age_distribution_t));
    trends_age_distribution_local_var->_library_owned = 1;
    trends_age_distribution_local_var->age_distribution = age_distribution;
    return trends_age_distribution_local_var;
}

__attribute__((deprecated)) trends_age_distribution_t *trends_age_distribution_create(
    pinterest_rest_api_trends_age_bucket__e age_distribution
    ) {
    trends_age_distribution_t *result = trends_age_distribution_create_internal (
        age_distribution
        );
    if (!result) {
    }
    return result;
}

void trends_age_distribution_free(trends_age_distribution_t *trends_age_distribution) {
    if(NULL == trends_age_distribution){
        return ;
    }
    if(trends_age_distribution->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trends_age_distribution_free");
        return ;
    }
    listEntry_t *listEntry;
    free(trends_age_distribution);
}

cJSON *trends_age_distribution_convertToJSON(trends_age_distribution_t *trends_age_distribution) {
    cJSON *item = cJSON_CreateObject();

    // trends_age_distribution->age_distribution
    if(trends_age_distribution->age_distribution != pinterest_rest_api_trends_age_bucket__NULL) {
    cJSON *age_distribution_local_JSON = trends_age_bucket_convertToJSON(trends_age_distribution->age_distribution);
    if(age_distribution_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "age_distribution", age_distribution_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

trends_age_distribution_t *trends_age_distribution_parseFromJSON(cJSON *trends_age_distributionJSON){

    trends_age_distribution_t *trends_age_distribution_local_var = NULL;

    // define the local variable for trends_age_distribution->age_distribution
    pinterest_rest_api_trends_age_bucket__e age_distribution_local_nonprim = 0;

    // trends_age_distribution->age_distribution
    cJSON *age_distribution = cJSON_GetObjectItemCaseSensitive(trends_age_distributionJSON, "age_distribution");
    if (cJSON_IsNull(age_distribution)) {
        age_distribution = NULL;
    }
    if (age_distribution) { 
    age_distribution_local_nonprim = trends_age_bucket_parseFromJSON(age_distribution); //custom
    }



    trends_age_distribution_local_var = trends_age_distribution_create_internal (
        age_distribution ? age_distribution_local_nonprim : 0
        );

    if (!trends_age_distribution_local_var) {
        goto end;
    }

    return trends_age_distribution_local_var;
end:
    if (age_distribution_local_nonprim) {
        age_distribution_local_nonprim = 0;
    }
    return NULL;

}
