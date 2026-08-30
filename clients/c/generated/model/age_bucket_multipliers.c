#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "age_bucket_multipliers.h"



static age_bucket_multipliers_t *age_bucket_multipliers_create_internal(
    targeting_spec_age_bucket_t *age_bucket
    ) {
    age_bucket_multipliers_t *age_bucket_multipliers_local_var = malloc(sizeof(age_bucket_multipliers_t));
    if (!age_bucket_multipliers_local_var) {
        return NULL;
    }
    memset(age_bucket_multipliers_local_var, 0, sizeof(age_bucket_multipliers_t));
    age_bucket_multipliers_local_var->_library_owned = 1;
    age_bucket_multipliers_local_var->age_bucket = age_bucket;
    return age_bucket_multipliers_local_var;
}

__attribute__((deprecated)) age_bucket_multipliers_t *age_bucket_multipliers_create(
    targeting_spec_age_bucket_t *age_bucket
    ) {
    age_bucket_multipliers_t *result = age_bucket_multipliers_create_internal (
        age_bucket
        );
    if (!result) {
    }
    return result;
}

void age_bucket_multipliers_free(age_bucket_multipliers_t *age_bucket_multipliers) {
    if(NULL == age_bucket_multipliers){
        return ;
    }
    if(age_bucket_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "age_bucket_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (age_bucket_multipliers->age_bucket) {
        targeting_spec_age_bucket_free(age_bucket_multipliers->age_bucket);
        age_bucket_multipliers->age_bucket = NULL;
    }
    free(age_bucket_multipliers);
}

cJSON *age_bucket_multipliers_convertToJSON(age_bucket_multipliers_t *age_bucket_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // age_bucket_multipliers->age_bucket
    if(age_bucket_multipliers->age_bucket) {
    cJSON *age_bucket_local_JSON = targeting_spec_age_bucket_convertToJSON(age_bucket_multipliers->age_bucket);
    if(age_bucket_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "AGE_BUCKET", age_bucket_local_JSON);
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

age_bucket_multipliers_t *age_bucket_multipliers_parseFromJSON(cJSON *age_bucket_multipliersJSON){

    age_bucket_multipliers_t *age_bucket_multipliers_local_var = NULL;

    // define the local variable for age_bucket_multipliers->age_bucket
    targeting_spec_age_bucket_t *age_bucket_local_nonprim = NULL;

    // age_bucket_multipliers->age_bucket
    cJSON *age_bucket = cJSON_GetObjectItemCaseSensitive(age_bucket_multipliersJSON, "AGE_BUCKET");
    if (cJSON_IsNull(age_bucket)) {
        age_bucket = NULL;
    }
    if (age_bucket) { 
    age_bucket_local_nonprim = targeting_spec_age_bucket_parseFromJSON(age_bucket); //custom
    }



    age_bucket_multipliers_local_var = age_bucket_multipliers_create_internal (
        age_bucket ? age_bucket_local_nonprim : NULL
        );

    if (!age_bucket_multipliers_local_var) {
        goto end;
    }

    return age_bucket_multipliers_local_var;
end:
    if (age_bucket_local_nonprim) {
        targeting_spec_age_bucket_free(age_bucket_local_nonprim);
        age_bucket_local_nonprim = NULL;
    }
    return NULL;

}
