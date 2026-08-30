#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_bid_options_gender_multipliers.h"



static schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers_create_internal(
    pinterest_rest_api_targeting_spec_gender__e gender
    ) {
    schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers_local_var = malloc(sizeof(schedule_bid_options_gender_multipliers_t));
    if (!schedule_bid_options_gender_multipliers_local_var) {
        return NULL;
    }
    memset(schedule_bid_options_gender_multipliers_local_var, 0, sizeof(schedule_bid_options_gender_multipliers_t));
    schedule_bid_options_gender_multipliers_local_var->_library_owned = 1;
    schedule_bid_options_gender_multipliers_local_var->gender = gender;
    return schedule_bid_options_gender_multipliers_local_var;
}

__attribute__((deprecated)) schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers_create(
    pinterest_rest_api_targeting_spec_gender__e gender
    ) {
    schedule_bid_options_gender_multipliers_t *result = schedule_bid_options_gender_multipliers_create_internal (
        gender
        );
    if (!result) {
    }
    return result;
}

void schedule_bid_options_gender_multipliers_free(schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers) {
    if(NULL == schedule_bid_options_gender_multipliers){
        return ;
    }
    if(schedule_bid_options_gender_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_bid_options_gender_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    free(schedule_bid_options_gender_multipliers);
}

cJSON *schedule_bid_options_gender_multipliers_convertToJSON(schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // schedule_bid_options_gender_multipliers->gender
    if(schedule_bid_options_gender_multipliers->gender != pinterest_rest_api_targeting_spec_gender__NULL) {
    cJSON *gender_local_JSON = targeting_spec_gender_convertToJSON(schedule_bid_options_gender_multipliers->gender);
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

schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers_parseFromJSON(cJSON *schedule_bid_options_gender_multipliersJSON){

    schedule_bid_options_gender_multipliers_t *schedule_bid_options_gender_multipliers_local_var = NULL;

    // define the local variable for schedule_bid_options_gender_multipliers->gender
    pinterest_rest_api_targeting_spec_gender__e gender_local_nonprim = 0;

    // schedule_bid_options_gender_multipliers->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(schedule_bid_options_gender_multipliersJSON, "GENDER");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    gender_local_nonprim = targeting_spec_gender_parseFromJSON(gender); //custom
    }



    schedule_bid_options_gender_multipliers_local_var = schedule_bid_options_gender_multipliers_create_internal (
        gender ? gender_local_nonprim : 0
        );

    if (!schedule_bid_options_gender_multipliers_local_var) {
        goto end;
    }

    return schedule_bid_options_gender_multipliers_local_var;
end:
    if (gender_local_nonprim) {
        gender_local_nonprim = 0;
    }
    return NULL;

}
