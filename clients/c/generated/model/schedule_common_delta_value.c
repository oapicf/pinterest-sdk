#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_common_delta_value.h"



static schedule_common_delta_value_t *schedule_common_delta_value_create_internal(
    schedule_age_bucket_multipliers_t *age_bucket_multipliers,
    schedule_app_type_multipliers_t *app_type_multipliers,
    schedule_audience_multipliers_t *audience_multipliers,
    schedule_bid_options_gender_multipliers_t *gender_multipliers,
    schedule_bid_options_placement_multipliers_t *placement_multipliers
    ) {
    schedule_common_delta_value_t *schedule_common_delta_value_local_var = malloc(sizeof(schedule_common_delta_value_t));
    if (!schedule_common_delta_value_local_var) {
        return NULL;
    }
    memset(schedule_common_delta_value_local_var, 0, sizeof(schedule_common_delta_value_t));
    schedule_common_delta_value_local_var->_library_owned = 1;
    schedule_common_delta_value_local_var->age_bucket_multipliers = age_bucket_multipliers;
    schedule_common_delta_value_local_var->app_type_multipliers = app_type_multipliers;
    schedule_common_delta_value_local_var->audience_multipliers = audience_multipliers;
    schedule_common_delta_value_local_var->gender_multipliers = gender_multipliers;
    schedule_common_delta_value_local_var->placement_multipliers = placement_multipliers;
    return schedule_common_delta_value_local_var;
}

__attribute__((deprecated)) schedule_common_delta_value_t *schedule_common_delta_value_create(
    schedule_age_bucket_multipliers_t *age_bucket_multipliers,
    schedule_app_type_multipliers_t *app_type_multipliers,
    schedule_audience_multipliers_t *audience_multipliers,
    schedule_bid_options_gender_multipliers_t *gender_multipliers,
    schedule_bid_options_placement_multipliers_t *placement_multipliers
    ) {
    schedule_common_delta_value_t *result = schedule_common_delta_value_create_internal (
        age_bucket_multipliers,
        app_type_multipliers,
        audience_multipliers,
        gender_multipliers,
        placement_multipliers
        );
    if (!result) {
    }
    return result;
}

void schedule_common_delta_value_free(schedule_common_delta_value_t *schedule_common_delta_value) {
    if(NULL == schedule_common_delta_value){
        return ;
    }
    if(schedule_common_delta_value->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_common_delta_value_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_common_delta_value->age_bucket_multipliers) {
        schedule_age_bucket_multipliers_free(schedule_common_delta_value->age_bucket_multipliers);
        schedule_common_delta_value->age_bucket_multipliers = NULL;
    }
    if (schedule_common_delta_value->app_type_multipliers) {
        schedule_app_type_multipliers_free(schedule_common_delta_value->app_type_multipliers);
        schedule_common_delta_value->app_type_multipliers = NULL;
    }
    if (schedule_common_delta_value->audience_multipliers) {
        schedule_audience_multipliers_free(schedule_common_delta_value->audience_multipliers);
        schedule_common_delta_value->audience_multipliers = NULL;
    }
    if (schedule_common_delta_value->gender_multipliers) {
        schedule_bid_options_gender_multipliers_free(schedule_common_delta_value->gender_multipliers);
        schedule_common_delta_value->gender_multipliers = NULL;
    }
    if (schedule_common_delta_value->placement_multipliers) {
        schedule_bid_options_placement_multipliers_free(schedule_common_delta_value->placement_multipliers);
        schedule_common_delta_value->placement_multipliers = NULL;
    }
    free(schedule_common_delta_value);
}

cJSON *schedule_common_delta_value_convertToJSON(schedule_common_delta_value_t *schedule_common_delta_value) {
    cJSON *item = cJSON_CreateObject();

    // schedule_common_delta_value->age_bucket_multipliers
    if(schedule_common_delta_value->age_bucket_multipliers) {
    cJSON *age_bucket_multipliers_local_JSON = schedule_age_bucket_multipliers_convertToJSON(schedule_common_delta_value->age_bucket_multipliers);
    if(age_bucket_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "age_bucket_multipliers", age_bucket_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_common_delta_value->app_type_multipliers
    if(schedule_common_delta_value->app_type_multipliers) {
    cJSON *app_type_multipliers_local_JSON = schedule_app_type_multipliers_convertToJSON(schedule_common_delta_value->app_type_multipliers);
    if(app_type_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "app_type_multipliers", app_type_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_common_delta_value->audience_multipliers
    if(schedule_common_delta_value->audience_multipliers) {
    cJSON *audience_multipliers_local_JSON = schedule_audience_multipliers_convertToJSON(schedule_common_delta_value->audience_multipliers);
    if(audience_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_multipliers", audience_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_common_delta_value->gender_multipliers
    if(schedule_common_delta_value->gender_multipliers) {
    cJSON *gender_multipliers_local_JSON = schedule_bid_options_gender_multipliers_convertToJSON(schedule_common_delta_value->gender_multipliers);
    if(gender_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "gender_multipliers", gender_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // schedule_common_delta_value->placement_multipliers
    if(schedule_common_delta_value->placement_multipliers) {
    cJSON *placement_multipliers_local_JSON = schedule_bid_options_placement_multipliers_convertToJSON(schedule_common_delta_value->placement_multipliers);
    if(placement_multipliers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "placement_multipliers", placement_multipliers_local_JSON);
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

schedule_common_delta_value_t *schedule_common_delta_value_parseFromJSON(cJSON *schedule_common_delta_valueJSON){

    schedule_common_delta_value_t *schedule_common_delta_value_local_var = NULL;

    // define the local variable for schedule_common_delta_value->age_bucket_multipliers
    schedule_age_bucket_multipliers_t *age_bucket_multipliers_local_nonprim = NULL;

    // define the local variable for schedule_common_delta_value->app_type_multipliers
    schedule_app_type_multipliers_t *app_type_multipliers_local_nonprim = NULL;

    // define the local variable for schedule_common_delta_value->audience_multipliers
    schedule_audience_multipliers_t *audience_multipliers_local_nonprim = NULL;

    // define the local variable for schedule_common_delta_value->gender_multipliers
    schedule_bid_options_gender_multipliers_t *gender_multipliers_local_nonprim = NULL;

    // define the local variable for schedule_common_delta_value->placement_multipliers
    schedule_bid_options_placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // schedule_common_delta_value->age_bucket_multipliers
    cJSON *age_bucket_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_common_delta_valueJSON, "age_bucket_multipliers");
    if (cJSON_IsNull(age_bucket_multipliers)) {
        age_bucket_multipliers = NULL;
    }
    if (age_bucket_multipliers) { 
    age_bucket_multipliers_local_nonprim = schedule_age_bucket_multipliers_parseFromJSON(age_bucket_multipliers); //custom
    }

    // schedule_common_delta_value->app_type_multipliers
    cJSON *app_type_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_common_delta_valueJSON, "app_type_multipliers");
    if (cJSON_IsNull(app_type_multipliers)) {
        app_type_multipliers = NULL;
    }
    if (app_type_multipliers) { 
    app_type_multipliers_local_nonprim = schedule_app_type_multipliers_parseFromJSON(app_type_multipliers); //custom
    }

    // schedule_common_delta_value->audience_multipliers
    cJSON *audience_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_common_delta_valueJSON, "audience_multipliers");
    if (cJSON_IsNull(audience_multipliers)) {
        audience_multipliers = NULL;
    }
    if (audience_multipliers) { 
    audience_multipliers_local_nonprim = schedule_audience_multipliers_parseFromJSON(audience_multipliers); //custom
    }

    // schedule_common_delta_value->gender_multipliers
    cJSON *gender_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_common_delta_valueJSON, "gender_multipliers");
    if (cJSON_IsNull(gender_multipliers)) {
        gender_multipliers = NULL;
    }
    if (gender_multipliers) { 
    gender_multipliers_local_nonprim = schedule_bid_options_gender_multipliers_parseFromJSON(gender_multipliers); //custom
    }

    // schedule_common_delta_value->placement_multipliers
    cJSON *placement_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_common_delta_valueJSON, "placement_multipliers");
    if (cJSON_IsNull(placement_multipliers)) {
        placement_multipliers = NULL;
    }
    if (placement_multipliers) { 
    placement_multipliers_local_nonprim = schedule_bid_options_placement_multipliers_parseFromJSON(placement_multipliers); //nonprimitive
    }



    schedule_common_delta_value_local_var = schedule_common_delta_value_create_internal (
        age_bucket_multipliers ? age_bucket_multipliers_local_nonprim : NULL,
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        audience_multipliers ? audience_multipliers_local_nonprim : NULL,
        gender_multipliers ? gender_multipliers_local_nonprim : NULL,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL
        );

    if (!schedule_common_delta_value_local_var) {
        goto end;
    }

    return schedule_common_delta_value_local_var;
end:
    if (age_bucket_multipliers_local_nonprim) {
        schedule_age_bucket_multipliers_free(age_bucket_multipliers_local_nonprim);
        age_bucket_multipliers_local_nonprim = NULL;
    }
    if (app_type_multipliers_local_nonprim) {
        schedule_app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (audience_multipliers_local_nonprim) {
        schedule_audience_multipliers_free(audience_multipliers_local_nonprim);
        audience_multipliers_local_nonprim = NULL;
    }
    if (gender_multipliers_local_nonprim) {
        schedule_bid_options_gender_multipliers_free(gender_multipliers_local_nonprim);
        gender_multipliers_local_nonprim = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        schedule_bid_options_placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    return NULL;

}
