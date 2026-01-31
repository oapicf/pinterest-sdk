#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_keyword_demographics_gender_distribution.h"


char* trending_keyword_demographics_gender_distribution_gender_distribution_ToString(pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_e gender_distribution) {
    char* gender_distributionArray[] =  { "NULL", "male", "female", "unspecified" };
    return gender_distributionArray[gender_distribution];
}

pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_e trending_keyword_demographics_gender_distribution_gender_distribution_FromString(char* gender_distribution){
    int stringToReturn = 0;
    char *gender_distributionArray[] =  { "NULL", "male", "female", "unspecified" };
    size_t sizeofArray = sizeof(gender_distributionArray) / sizeof(gender_distributionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(gender_distribution, gender_distributionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution_create_internal(
    pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_e gender_distribution
    ) {
    trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution_local_var = malloc(sizeof(trending_keyword_demographics_gender_distribution_t));
    if (!trending_keyword_demographics_gender_distribution_local_var) {
        return NULL;
    }
    trending_keyword_demographics_gender_distribution_local_var->gender_distribution = gender_distribution;

    trending_keyword_demographics_gender_distribution_local_var->_library_owned = 1;
    return trending_keyword_demographics_gender_distribution_local_var;
}

__attribute__((deprecated)) trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution_create(
    pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_e gender_distribution
    ) {
    return trending_keyword_demographics_gender_distribution_create_internal (
        gender_distribution
        );
}

void trending_keyword_demographics_gender_distribution_free(trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution) {
    if(NULL == trending_keyword_demographics_gender_distribution){
        return ;
    }
    if(trending_keyword_demographics_gender_distribution->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_keyword_demographics_gender_distribution_free");
        return ;
    }
    listEntry_t *listEntry;
    free(trending_keyword_demographics_gender_distribution);
}

cJSON *trending_keyword_demographics_gender_distribution_convertToJSON(trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution) {
    cJSON *item = cJSON_CreateObject();

    // trending_keyword_demographics_gender_distribution->gender_distribution
    if(trending_keyword_demographics_gender_distribution->gender_distribution != pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_NULL) {
    if(cJSON_AddStringToObject(item, "gender_distribution", trending_keyword_demographics_gender_distribution_gender_distribution_ToString(trending_keyword_demographics_gender_distribution->gender_distribution)) == NULL)
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

trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution_parseFromJSON(cJSON *trending_keyword_demographics_gender_distributionJSON){

    trending_keyword_demographics_gender_distribution_t *trending_keyword_demographics_gender_distribution_local_var = NULL;

    // trending_keyword_demographics_gender_distribution->gender_distribution
    cJSON *gender_distribution = cJSON_GetObjectItemCaseSensitive(trending_keyword_demographics_gender_distributionJSON, "gender_distribution");
    if (cJSON_IsNull(gender_distribution)) {
        gender_distribution = NULL;
    }
    pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_e gender_distributionVariable;
    if (gender_distribution) { 
    if(!cJSON_IsString(gender_distribution))
    {
    goto end; //Enum
    }
    gender_distributionVariable = trending_keyword_demographics_gender_distribution_gender_distribution_FromString(gender_distribution->valuestring);
    }


    trending_keyword_demographics_gender_distribution_local_var = trending_keyword_demographics_gender_distribution_create_internal (
        gender_distribution ? gender_distributionVariable : pinterest_rest_api_trending_keyword_demographics_gender_distribution_GENDERDISTRIBUTION_NULL
        );

    return trending_keyword_demographics_gender_distribution_local_var;
end:
    return NULL;

}
