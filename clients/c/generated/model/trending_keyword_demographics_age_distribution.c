#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keyword_demographics_age_distribution.h"


char* trending_keyword_demographics_age_distribution_age_distribution_ToString(pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_e age_distribution) {
    char* age_distributionArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return age_distributionArray[age_distribution];
}

pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_e trending_keyword_demographics_age_distribution_age_distribution_FromString(char* age_distribution){
    int stringToReturn = 0;
    char *age_distributionArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(age_distributionArray) / sizeof(age_distributionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(age_distribution, age_distributionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution_create_internal(
    pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_e age_distribution
    ) {
    trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution_local_var = malloc(sizeof(trending_keyword_demographics_age_distribution_t));
    if (!trending_keyword_demographics_age_distribution_local_var) {
        return NULL;
    }
    trending_keyword_demographics_age_distribution_local_var->age_distribution = age_distribution;

    trending_keyword_demographics_age_distribution_local_var->_library_owned = 1;
    return trending_keyword_demographics_age_distribution_local_var;
}

__attribute__((deprecated)) trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution_create(
    pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_e age_distribution
    ) {
    return trending_keyword_demographics_age_distribution_create_internal (
        age_distribution
        );
}

void trending_keyword_demographics_age_distribution_free(trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution) {
    if(NULL == trending_keyword_demographics_age_distribution){
        return ;
    }
    if(trending_keyword_demographics_age_distribution->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_keyword_demographics_age_distribution_free");
        return ;
    }
    listEntry_t *listEntry;
    free(trending_keyword_demographics_age_distribution);
}

cJSON *trending_keyword_demographics_age_distribution_convertToJSON(trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution) {
    cJSON *item = cJSON_CreateObject();

    // trending_keyword_demographics_age_distribution->age_distribution
    if(trending_keyword_demographics_age_distribution->age_distribution != pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_NULL) {
    if(cJSON_AddStringToObject(item, "age_distribution", trending_keyword_demographics_age_distribution_age_distribution_ToString(trending_keyword_demographics_age_distribution->age_distribution)) == NULL)
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

trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution_parseFromJSON(cJSON *trending_keyword_demographics_age_distributionJSON){

    trending_keyword_demographics_age_distribution_t *trending_keyword_demographics_age_distribution_local_var = NULL;

    // trending_keyword_demographics_age_distribution->age_distribution
    cJSON *age_distribution = cJSON_GetObjectItemCaseSensitive(trending_keyword_demographics_age_distributionJSON, "age_distribution");
    if (cJSON_IsNull(age_distribution)) {
        age_distribution = NULL;
    }
    pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_e age_distributionVariable;
    if (age_distribution) { 
    if(!cJSON_IsString(age_distribution))
    {
    goto end; //Enum
    }
    age_distributionVariable = trending_keyword_demographics_age_distribution_age_distribution_FromString(age_distribution->valuestring);
    }


    trending_keyword_demographics_age_distribution_local_var = trending_keyword_demographics_age_distribution_create_internal (
        age_distribution ? age_distributionVariable : pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_NULL
        );

    return trending_keyword_demographics_age_distribution_local_var;
end:
    return NULL;

}
