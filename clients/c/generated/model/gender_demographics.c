#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_demographics.h"



static gender_demographics_t *gender_demographics_create_internal(
    double female,
    double male,
    double unspecified
    ) {
    gender_demographics_t *gender_demographics_local_var = malloc(sizeof(gender_demographics_t));
    if (!gender_demographics_local_var) {
        return NULL;
    }
    gender_demographics_local_var->female = female;
    gender_demographics_local_var->male = male;
    gender_demographics_local_var->unspecified = unspecified;

    gender_demographics_local_var->_library_owned = 1;
    return gender_demographics_local_var;
}

__attribute__((deprecated)) gender_demographics_t *gender_demographics_create(
    double female,
    double male,
    double unspecified
    ) {
    return gender_demographics_create_internal (
        female,
        male,
        unspecified
        );
}

void gender_demographics_free(gender_demographics_t *gender_demographics) {
    if(NULL == gender_demographics){
        return ;
    }
    if(gender_demographics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_demographics_free");
        return ;
    }
    listEntry_t *listEntry;
    free(gender_demographics);
}

cJSON *gender_demographics_convertToJSON(gender_demographics_t *gender_demographics) {
    cJSON *item = cJSON_CreateObject();

    // gender_demographics->female
    if (!gender_demographics->female) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "female", gender_demographics->female) == NULL) {
    goto fail; //Numeric
    }


    // gender_demographics->male
    if (!gender_demographics->male) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "male", gender_demographics->male) == NULL) {
    goto fail; //Numeric
    }


    // gender_demographics->unspecified
    if (!gender_demographics->unspecified) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "unspecified", gender_demographics->unspecified) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

gender_demographics_t *gender_demographics_parseFromJSON(cJSON *gender_demographicsJSON){

    gender_demographics_t *gender_demographics_local_var = NULL;

    // gender_demographics->female
    cJSON *female = cJSON_GetObjectItemCaseSensitive(gender_demographicsJSON, "female");
    if (cJSON_IsNull(female)) {
        female = NULL;
    }
    if (!female) {
        goto end;
    }

    
    if(!cJSON_IsNumber(female))
    {
    goto end; //Numeric
    }

    // gender_demographics->male
    cJSON *male = cJSON_GetObjectItemCaseSensitive(gender_demographicsJSON, "male");
    if (cJSON_IsNull(male)) {
        male = NULL;
    }
    if (!male) {
        goto end;
    }

    
    if(!cJSON_IsNumber(male))
    {
    goto end; //Numeric
    }

    // gender_demographics->unspecified
    cJSON *unspecified = cJSON_GetObjectItemCaseSensitive(gender_demographicsJSON, "unspecified");
    if (cJSON_IsNull(unspecified)) {
        unspecified = NULL;
    }
    if (!unspecified) {
        goto end;
    }

    
    if(!cJSON_IsNumber(unspecified))
    {
    goto end; //Numeric
    }


    gender_demographics_local_var = gender_demographics_create_internal (
        female->valuedouble,
        male->valuedouble,
        unspecified->valuedouble
        );

    return gender_demographics_local_var;
end:
    return NULL;

}
