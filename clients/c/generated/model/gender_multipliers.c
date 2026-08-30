#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_multipliers.h"



static gender_multipliers_t *gender_multipliers_create_internal(
    targeting_spec_gender_t *gender
    ) {
    gender_multipliers_t *gender_multipliers_local_var = malloc(sizeof(gender_multipliers_t));
    if (!gender_multipliers_local_var) {
        return NULL;
    }
    memset(gender_multipliers_local_var, 0, sizeof(gender_multipliers_t));
    gender_multipliers_local_var->_library_owned = 1;
    gender_multipliers_local_var->gender = gender;
    return gender_multipliers_local_var;
}

__attribute__((deprecated)) gender_multipliers_t *gender_multipliers_create(
    targeting_spec_gender_t *gender
    ) {
    gender_multipliers_t *result = gender_multipliers_create_internal (
        gender
        );
    if (!result) {
    }
    return result;
}

void gender_multipliers_free(gender_multipliers_t *gender_multipliers) {
    if(NULL == gender_multipliers){
        return ;
    }
    if(gender_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (gender_multipliers->gender) {
        targeting_spec_gender_free(gender_multipliers->gender);
        gender_multipliers->gender = NULL;
    }
    free(gender_multipliers);
}

cJSON *gender_multipliers_convertToJSON(gender_multipliers_t *gender_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // gender_multipliers->gender
    if(gender_multipliers->gender) {
    cJSON *gender_local_JSON = targeting_spec_gender_convertToJSON(gender_multipliers->gender);
    if(gender_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "GENDER", gender_local_JSON);
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

gender_multipliers_t *gender_multipliers_parseFromJSON(cJSON *gender_multipliersJSON){

    gender_multipliers_t *gender_multipliers_local_var = NULL;

    // define the local variable for gender_multipliers->gender
    targeting_spec_gender_t *gender_local_nonprim = NULL;

    // gender_multipliers->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(gender_multipliersJSON, "GENDER");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    gender_local_nonprim = targeting_spec_gender_parseFromJSON(gender); //custom
    }



    gender_multipliers_local_var = gender_multipliers_create_internal (
        gender ? gender_local_nonprim : NULL
        );

    if (!gender_multipliers_local_var) {
        goto end;
    }

    return gender_multipliers_local_var;
end:
    if (gender_local_nonprim) {
        targeting_spec_gender_free(gender_local_nonprim);
        gender_local_nonprim = NULL;
    }
    return NULL;

}
