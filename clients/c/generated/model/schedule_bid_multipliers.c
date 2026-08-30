#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_bid_multipliers.h"



static schedule_bid_multipliers_t *schedule_bid_multipliers_create_internal(
    bid_options_age_bucket_multipliers_t *age_bucket_multipliers,
    bid_options_app_type_multipliers_t *app_type_multipliers,
    list_t *audience_multipliers,
    bid_options_gender_multipliers_t *gender_multipliers,
    bid_options_placement_multipliers_t *placement_multipliers
    ) {
    schedule_bid_multipliers_t *schedule_bid_multipliers_local_var = malloc(sizeof(schedule_bid_multipliers_t));
    if (!schedule_bid_multipliers_local_var) {
        return NULL;
    }
    memset(schedule_bid_multipliers_local_var, 0, sizeof(schedule_bid_multipliers_t));
    schedule_bid_multipliers_local_var->_library_owned = 1;
    schedule_bid_multipliers_local_var->age_bucket_multipliers = age_bucket_multipliers;
    schedule_bid_multipliers_local_var->app_type_multipliers = app_type_multipliers;
    schedule_bid_multipliers_local_var->audience_multipliers = audience_multipliers;
    schedule_bid_multipliers_local_var->gender_multipliers = gender_multipliers;
    schedule_bid_multipliers_local_var->placement_multipliers = placement_multipliers;
    return schedule_bid_multipliers_local_var;
}

__attribute__((deprecated)) schedule_bid_multipliers_t *schedule_bid_multipliers_create(
    bid_options_age_bucket_multipliers_t *age_bucket_multipliers,
    bid_options_app_type_multipliers_t *app_type_multipliers,
    list_t *audience_multipliers,
    bid_options_gender_multipliers_t *gender_multipliers,
    bid_options_placement_multipliers_t *placement_multipliers
    ) {
    schedule_bid_multipliers_t *result = schedule_bid_multipliers_create_internal (
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

void schedule_bid_multipliers_free(schedule_bid_multipliers_t *schedule_bid_multipliers) {
    if(NULL == schedule_bid_multipliers){
        return ;
    }
    if(schedule_bid_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_bid_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_bid_multipliers->age_bucket_multipliers) {
        bid_options_age_bucket_multipliers_free(schedule_bid_multipliers->age_bucket_multipliers);
        schedule_bid_multipliers->age_bucket_multipliers = NULL;
    }
    if (schedule_bid_multipliers->app_type_multipliers) {
        bid_options_app_type_multipliers_free(schedule_bid_multipliers->app_type_multipliers);
        schedule_bid_multipliers->app_type_multipliers = NULL;
    }
    if (schedule_bid_multipliers->audience_multipliers) {
        list_ForEach(listEntry, schedule_bid_multipliers->audience_multipliers) {
            bid_options_audience_multipliers_free(listEntry->data);
        }
        list_freeList(schedule_bid_multipliers->audience_multipliers);
        schedule_bid_multipliers->audience_multipliers = NULL;
    }
    if (schedule_bid_multipliers->gender_multipliers) {
        bid_options_gender_multipliers_free(schedule_bid_multipliers->gender_multipliers);
        schedule_bid_multipliers->gender_multipliers = NULL;
    }
    if (schedule_bid_multipliers->placement_multipliers) {
        bid_options_placement_multipliers_free(schedule_bid_multipliers->placement_multipliers);
        schedule_bid_multipliers->placement_multipliers = NULL;
    }
    free(schedule_bid_multipliers);
}

cJSON *schedule_bid_multipliers_convertToJSON(schedule_bid_multipliers_t *schedule_bid_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // schedule_bid_multipliers->age_bucket_multipliers
    if(schedule_bid_multipliers->age_bucket_multipliers) {
    cJSON *age_bucket_multipliers_local_JSON = bid_options_age_bucket_multipliers_convertToJSON(schedule_bid_multipliers->age_bucket_multipliers);
    if(age_bucket_multipliers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "age_bucket_multipliers", age_bucket_multipliers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // schedule_bid_multipliers->app_type_multipliers
    if(schedule_bid_multipliers->app_type_multipliers) {
    cJSON *app_type_multipliers_local_JSON = bid_options_app_type_multipliers_convertToJSON(schedule_bid_multipliers->app_type_multipliers);
    if(app_type_multipliers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "app_type_multipliers", app_type_multipliers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // schedule_bid_multipliers->audience_multipliers
    if(schedule_bid_multipliers->audience_multipliers) {
    cJSON *audience_multipliers = cJSON_AddArrayToObject(item, "audience_multipliers");
    if(audience_multipliers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *audience_multipliersListEntry;
    if (schedule_bid_multipliers->audience_multipliers) {
    list_ForEach(audience_multipliersListEntry, schedule_bid_multipliers->audience_multipliers) {
    cJSON *itemLocal = bid_options_audience_multipliers_convertToJSON(audience_multipliersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(audience_multipliers, itemLocal);
    }
    }
    }


    // schedule_bid_multipliers->gender_multipliers
    if(schedule_bid_multipliers->gender_multipliers) {
    cJSON *gender_multipliers_local_JSON = bid_options_gender_multipliers_convertToJSON(schedule_bid_multipliers->gender_multipliers);
    if(gender_multipliers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gender_multipliers", gender_multipliers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // schedule_bid_multipliers->placement_multipliers
    if(schedule_bid_multipliers->placement_multipliers) {
    cJSON *placement_multipliers_local_JSON = bid_options_placement_multipliers_convertToJSON(schedule_bid_multipliers->placement_multipliers);
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

schedule_bid_multipliers_t *schedule_bid_multipliers_parseFromJSON(cJSON *schedule_bid_multipliersJSON){

    schedule_bid_multipliers_t *schedule_bid_multipliers_local_var = NULL;

    // define the local variable for schedule_bid_multipliers->age_bucket_multipliers
    bid_options_age_bucket_multipliers_t *age_bucket_multipliers_local_nonprim = NULL;

    // define the local variable for schedule_bid_multipliers->app_type_multipliers
    bid_options_app_type_multipliers_t *app_type_multipliers_local_nonprim = NULL;

    // define the local list for schedule_bid_multipliers->audience_multipliers
    list_t *audience_multipliersList = NULL;

    // define the local variable for schedule_bid_multipliers->gender_multipliers
    bid_options_gender_multipliers_t *gender_multipliers_local_nonprim = NULL;

    // define the local variable for schedule_bid_multipliers->placement_multipliers
    bid_options_placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // schedule_bid_multipliers->age_bucket_multipliers
    cJSON *age_bucket_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_bid_multipliersJSON, "age_bucket_multipliers");
    if (cJSON_IsNull(age_bucket_multipliers)) {
        age_bucket_multipliers = NULL;
    }
    if (age_bucket_multipliers) { 
    age_bucket_multipliers_local_nonprim = bid_options_age_bucket_multipliers_parseFromJSON(age_bucket_multipliers); //nonprimitive
    }

    // schedule_bid_multipliers->app_type_multipliers
    cJSON *app_type_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_bid_multipliersJSON, "app_type_multipliers");
    if (cJSON_IsNull(app_type_multipliers)) {
        app_type_multipliers = NULL;
    }
    if (app_type_multipliers) { 
    app_type_multipliers_local_nonprim = bid_options_app_type_multipliers_parseFromJSON(app_type_multipliers); //nonprimitive
    }

    // schedule_bid_multipliers->audience_multipliers
    cJSON *audience_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_bid_multipliersJSON, "audience_multipliers");
    if (cJSON_IsNull(audience_multipliers)) {
        audience_multipliers = NULL;
    }
    if (audience_multipliers) { 
    cJSON *audience_multipliers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(audience_multipliers)){
        goto end; //nonprimitive container
    }

    audience_multipliersList = list_createList();

    cJSON_ArrayForEach(audience_multipliers_local_nonprimitive,audience_multipliers )
    {
        if(!cJSON_IsObject(audience_multipliers_local_nonprimitive)){
            goto end;
        }
        bid_options_audience_multipliers_t *audience_multipliersItem = bid_options_audience_multipliers_parseFromJSON(audience_multipliers_local_nonprimitive);

        list_addElement(audience_multipliersList, audience_multipliersItem);
    }
    }

    // schedule_bid_multipliers->gender_multipliers
    cJSON *gender_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_bid_multipliersJSON, "gender_multipliers");
    if (cJSON_IsNull(gender_multipliers)) {
        gender_multipliers = NULL;
    }
    if (gender_multipliers) { 
    gender_multipliers_local_nonprim = bid_options_gender_multipliers_parseFromJSON(gender_multipliers); //nonprimitive
    }

    // schedule_bid_multipliers->placement_multipliers
    cJSON *placement_multipliers = cJSON_GetObjectItemCaseSensitive(schedule_bid_multipliersJSON, "placement_multipliers");
    if (cJSON_IsNull(placement_multipliers)) {
        placement_multipliers = NULL;
    }
    if (placement_multipliers) { 
    placement_multipliers_local_nonprim = bid_options_placement_multipliers_parseFromJSON(placement_multipliers); //nonprimitive
    }



    schedule_bid_multipliers_local_var = schedule_bid_multipliers_create_internal (
        age_bucket_multipliers ? age_bucket_multipliers_local_nonprim : NULL,
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        audience_multipliers ? audience_multipliersList : NULL,
        gender_multipliers ? gender_multipliers_local_nonprim : NULL,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL
        );

    if (!schedule_bid_multipliers_local_var) {
        goto end;
    }

    return schedule_bid_multipliers_local_var;
end:
    if (age_bucket_multipliers_local_nonprim) {
        bid_options_age_bucket_multipliers_free(age_bucket_multipliers_local_nonprim);
        age_bucket_multipliers_local_nonprim = NULL;
    }
    if (app_type_multipliers_local_nonprim) {
        bid_options_app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (audience_multipliersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, audience_multipliersList) {
            bid_options_audience_multipliers_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(audience_multipliersList);
        audience_multipliersList = NULL;
    }
    if (gender_multipliers_local_nonprim) {
        bid_options_gender_multipliers_free(gender_multipliers_local_nonprim);
        gender_multipliers_local_nonprim = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        bid_options_placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    return NULL;

}
