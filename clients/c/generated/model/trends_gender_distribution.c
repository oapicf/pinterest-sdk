#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_gender_distribution.h"



static trends_gender_distribution_t *trends_gender_distribution_create_internal(
    pinterest_rest_api_trends_gender__e gender_distribution
    ) {
    trends_gender_distribution_t *trends_gender_distribution_local_var = malloc(sizeof(trends_gender_distribution_t));
    if (!trends_gender_distribution_local_var) {
        return NULL;
    }
    memset(trends_gender_distribution_local_var, 0, sizeof(trends_gender_distribution_t));
    trends_gender_distribution_local_var->_library_owned = 1;
    trends_gender_distribution_local_var->gender_distribution = gender_distribution;
    return trends_gender_distribution_local_var;
}

__attribute__((deprecated)) trends_gender_distribution_t *trends_gender_distribution_create(
    pinterest_rest_api_trends_gender__e gender_distribution
    ) {
    trends_gender_distribution_t *result = trends_gender_distribution_create_internal (
        gender_distribution
        );
    if (!result) {
    }
    return result;
}

void trends_gender_distribution_free(trends_gender_distribution_t *trends_gender_distribution) {
    if(NULL == trends_gender_distribution){
        return ;
    }
    if(trends_gender_distribution->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trends_gender_distribution_free");
        return ;
    }
    listEntry_t *listEntry;
    free(trends_gender_distribution);
}

cJSON *trends_gender_distribution_convertToJSON(trends_gender_distribution_t *trends_gender_distribution) {
    cJSON *item = cJSON_CreateObject();

    // trends_gender_distribution->gender_distribution
    if(trends_gender_distribution->gender_distribution != pinterest_rest_api_trends_gender__NULL) {
    cJSON *gender_distribution_local_JSON = trends_gender_convertToJSON(trends_gender_distribution->gender_distribution);
    if(gender_distribution_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "gender_distribution", gender_distribution_local_JSON);
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

trends_gender_distribution_t *trends_gender_distribution_parseFromJSON(cJSON *trends_gender_distributionJSON){

    trends_gender_distribution_t *trends_gender_distribution_local_var = NULL;

    // define the local variable for trends_gender_distribution->gender_distribution
    pinterest_rest_api_trends_gender__e gender_distribution_local_nonprim = 0;

    // trends_gender_distribution->gender_distribution
    cJSON *gender_distribution = cJSON_GetObjectItemCaseSensitive(trends_gender_distributionJSON, "gender_distribution");
    if (cJSON_IsNull(gender_distribution)) {
        gender_distribution = NULL;
    }
    if (gender_distribution) { 
    gender_distribution_local_nonprim = trends_gender_parseFromJSON(gender_distribution); //custom
    }



    trends_gender_distribution_local_var = trends_gender_distribution_create_internal (
        gender_distribution ? gender_distribution_local_nonprim : 0
        );

    if (!trends_gender_distribution_local_var) {
        goto end;
    }

    return trends_gender_distribution_local_var;
end:
    if (gender_distribution_local_nonprim) {
        gender_distribution_local_nonprim = 0;
    }
    return NULL;

}
