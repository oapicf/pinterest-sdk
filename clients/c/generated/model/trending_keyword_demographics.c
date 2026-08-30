#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keyword_demographics.h"



static trending_keyword_demographics_t *trending_keyword_demographics_create_internal(
    trends_age_distribution_t *age_distribution,
    trends_gender_distribution_t *gender_distribution
    ) {
    trending_keyword_demographics_t *trending_keyword_demographics_local_var = malloc(sizeof(trending_keyword_demographics_t));
    if (!trending_keyword_demographics_local_var) {
        return NULL;
    }
    memset(trending_keyword_demographics_local_var, 0, sizeof(trending_keyword_demographics_t));
    trending_keyword_demographics_local_var->_library_owned = 1;
    trending_keyword_demographics_local_var->age_distribution = age_distribution;
    trending_keyword_demographics_local_var->gender_distribution = gender_distribution;
    return trending_keyword_demographics_local_var;
}

__attribute__((deprecated)) trending_keyword_demographics_t *trending_keyword_demographics_create(
    trends_age_distribution_t *age_distribution,
    trends_gender_distribution_t *gender_distribution
    ) {
    trending_keyword_demographics_t *result = trending_keyword_demographics_create_internal (
        age_distribution,
        gender_distribution
        );
    if (!result) {
    }
    return result;
}

void trending_keyword_demographics_free(trending_keyword_demographics_t *trending_keyword_demographics) {
    if(NULL == trending_keyword_demographics){
        return ;
    }
    if(trending_keyword_demographics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_keyword_demographics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (trending_keyword_demographics->age_distribution) {
        trends_age_distribution_free(trending_keyword_demographics->age_distribution);
        trending_keyword_demographics->age_distribution = NULL;
    }
    if (trending_keyword_demographics->gender_distribution) {
        trends_gender_distribution_free(trending_keyword_demographics->gender_distribution);
        trending_keyword_demographics->gender_distribution = NULL;
    }
    free(trending_keyword_demographics);
}

cJSON *trending_keyword_demographics_convertToJSON(trending_keyword_demographics_t *trending_keyword_demographics) {
    cJSON *item = cJSON_CreateObject();

    // trending_keyword_demographics->age_distribution
    if(trending_keyword_demographics->age_distribution) {
    cJSON *age_distribution_local_JSON = trends_age_distribution_convertToJSON(trending_keyword_demographics->age_distribution);
    if(age_distribution_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "age_distribution", age_distribution_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // trending_keyword_demographics->gender_distribution
    if(trending_keyword_demographics->gender_distribution) {
    cJSON *gender_distribution_local_JSON = trends_gender_distribution_convertToJSON(trending_keyword_demographics->gender_distribution);
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

trending_keyword_demographics_t *trending_keyword_demographics_parseFromJSON(cJSON *trending_keyword_demographicsJSON){

    trending_keyword_demographics_t *trending_keyword_demographics_local_var = NULL;

    // define the local variable for trending_keyword_demographics->age_distribution
    trends_age_distribution_t *age_distribution_local_nonprim = NULL;

    // define the local variable for trending_keyword_demographics->gender_distribution
    trends_gender_distribution_t *gender_distribution_local_nonprim = NULL;

    // trending_keyword_demographics->age_distribution
    cJSON *age_distribution = cJSON_GetObjectItemCaseSensitive(trending_keyword_demographicsJSON, "age_distribution");
    if (cJSON_IsNull(age_distribution)) {
        age_distribution = NULL;
    }
    if (age_distribution) { 
    age_distribution_local_nonprim = trends_age_distribution_parseFromJSON(age_distribution); //custom
    }

    // trending_keyword_demographics->gender_distribution
    cJSON *gender_distribution = cJSON_GetObjectItemCaseSensitive(trending_keyword_demographicsJSON, "gender_distribution");
    if (cJSON_IsNull(gender_distribution)) {
        gender_distribution = NULL;
    }
    if (gender_distribution) { 
    gender_distribution_local_nonprim = trends_gender_distribution_parseFromJSON(gender_distribution); //custom
    }



    trending_keyword_demographics_local_var = trending_keyword_demographics_create_internal (
        age_distribution ? age_distribution_local_nonprim : NULL,
        gender_distribution ? gender_distribution_local_nonprim : NULL
        );

    if (!trending_keyword_demographics_local_var) {
        goto end;
    }

    return trending_keyword_demographics_local_var;
end:
    if (age_distribution_local_nonprim) {
        trends_age_distribution_free(age_distribution_local_nonprim);
        age_distribution_local_nonprim = NULL;
    }
    if (gender_distribution_local_nonprim) {
        trends_gender_distribution_free(gender_distribution_local_nonprim);
        gender_distribution_local_nonprim = NULL;
    }
    return NULL;

}
