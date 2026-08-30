#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_options_gender_multipliers.h"



static bid_options_gender_multipliers_t *bid_options_gender_multipliers_create_internal(
    double *female,
    double *male
    ) {
    bid_options_gender_multipliers_t *bid_options_gender_multipliers_local_var = malloc(sizeof(bid_options_gender_multipliers_t));
    if (!bid_options_gender_multipliers_local_var) {
        return NULL;
    }
    memset(bid_options_gender_multipliers_local_var, 0, sizeof(bid_options_gender_multipliers_t));
    bid_options_gender_multipliers_local_var->_library_owned = 1;
    bid_options_gender_multipliers_local_var->female = female;
    bid_options_gender_multipliers_local_var->male = male;
    return bid_options_gender_multipliers_local_var;
}

__attribute__((deprecated)) bid_options_gender_multipliers_t *bid_options_gender_multipliers_create(
    double *female,
    double *male
    ) {
    double *female_copy = NULL;
    if (female) {
        female_copy = malloc(sizeof(double));
        if (female_copy) *female_copy = *female;
    }
    double *male_copy = NULL;
    if (male) {
        male_copy = malloc(sizeof(double));
        if (male_copy) *male_copy = *male;
    }
    bid_options_gender_multipliers_t *result = bid_options_gender_multipliers_create_internal (
        female_copy,
        male_copy
        );
    if (!result) {
        free(female_copy);
        free(male_copy);
    }
    return result;
}

void bid_options_gender_multipliers_free(bid_options_gender_multipliers_t *bid_options_gender_multipliers) {
    if(NULL == bid_options_gender_multipliers){
        return ;
    }
    if(bid_options_gender_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_options_gender_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_options_gender_multipliers->female) {
        free(bid_options_gender_multipliers->female);
        bid_options_gender_multipliers->female = NULL;
    }
    if (bid_options_gender_multipliers->male) {
        free(bid_options_gender_multipliers->male);
        bid_options_gender_multipliers->male = NULL;
    }
    free(bid_options_gender_multipliers);
}

cJSON *bid_options_gender_multipliers_convertToJSON(bid_options_gender_multipliers_t *bid_options_gender_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // bid_options_gender_multipliers->female
    if(bid_options_gender_multipliers->female) {
    if(cJSON_AddNumberToObject(item, "female", *bid_options_gender_multipliers->female) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_gender_multipliers->male
    if(bid_options_gender_multipliers->male) {
    if(cJSON_AddNumberToObject(item, "male", *bid_options_gender_multipliers->male) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bid_options_gender_multipliers_t *bid_options_gender_multipliers_parseFromJSON(cJSON *bid_options_gender_multipliersJSON){

    bid_options_gender_multipliers_t *bid_options_gender_multipliers_local_var = NULL;

    // define the local variable for bid_options_gender_multipliers->female
    double *female_local_var = NULL;

    // define the local variable for bid_options_gender_multipliers->male
    double *male_local_var = NULL;

    // bid_options_gender_multipliers->female
    cJSON *female = cJSON_GetObjectItemCaseSensitive(bid_options_gender_multipliersJSON, "female");
    if (cJSON_IsNull(female)) {
        female = NULL;
    }
    if (female) { 
    if(!cJSON_IsNumber(female))
    {
    goto end; //Numeric
    }
    female_local_var = malloc(sizeof(double));
    if(!female_local_var)
    {
        goto end;
    }
    *female_local_var = female->valuedouble;
    }

    // bid_options_gender_multipliers->male
    cJSON *male = cJSON_GetObjectItemCaseSensitive(bid_options_gender_multipliersJSON, "male");
    if (cJSON_IsNull(male)) {
        male = NULL;
    }
    if (male) { 
    if(!cJSON_IsNumber(male))
    {
    goto end; //Numeric
    }
    male_local_var = malloc(sizeof(double));
    if(!male_local_var)
    {
        goto end;
    }
    *male_local_var = male->valuedouble;
    }



    bid_options_gender_multipliers_local_var = bid_options_gender_multipliers_create_internal (
        female_local_var,
        male_local_var
        );

    if (!bid_options_gender_multipliers_local_var) {
        goto end;
    }

    return bid_options_gender_multipliers_local_var;
end:
    if (female_local_var) {
        free(female_local_var);
        female_local_var = NULL;
    }
    if (male_local_var) {
        free(male_local_var);
        male_local_var = NULL;
    }
    return NULL;

}
