#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_budget_recommendation_point.h"



static campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_create_internal(
    campaign_planning_estimation_type_t *estimation_type,
    campaign_planning_point_estimate_t *point_estimate
    ) {
    campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_local_var = malloc(sizeof(campaign_planning_budget_recommendation_point_t));
    if (!campaign_planning_budget_recommendation_point_local_var) {
        return NULL;
    }
    memset(campaign_planning_budget_recommendation_point_local_var, 0, sizeof(campaign_planning_budget_recommendation_point_t));
    campaign_planning_budget_recommendation_point_local_var->_library_owned = 1;
    campaign_planning_budget_recommendation_point_local_var->estimation_type = estimation_type;
    campaign_planning_budget_recommendation_point_local_var->point_estimate = point_estimate;
    return campaign_planning_budget_recommendation_point_local_var;
}

__attribute__((deprecated)) campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_create(
    campaign_planning_estimation_type_t *estimation_type,
    campaign_planning_point_estimate_t *point_estimate
    ) {
    campaign_planning_budget_recommendation_point_t *result = campaign_planning_budget_recommendation_point_create_internal (
        estimation_type,
        point_estimate
        );
    if (!result) {
    }
    return result;
}

void campaign_planning_budget_recommendation_point_free(campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point) {
    if(NULL == campaign_planning_budget_recommendation_point){
        return ;
    }
    if(campaign_planning_budget_recommendation_point->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_budget_recommendation_point_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_budget_recommendation_point->estimation_type) {
        campaign_planning_estimation_type_free(campaign_planning_budget_recommendation_point->estimation_type);
        campaign_planning_budget_recommendation_point->estimation_type = NULL;
    }
    if (campaign_planning_budget_recommendation_point->point_estimate) {
        campaign_planning_point_estimate_free(campaign_planning_budget_recommendation_point->point_estimate);
        campaign_planning_budget_recommendation_point->point_estimate = NULL;
    }
    free(campaign_planning_budget_recommendation_point);
}

cJSON *campaign_planning_budget_recommendation_point_convertToJSON(campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_budget_recommendation_point->estimation_type
    if(campaign_planning_budget_recommendation_point->estimation_type) {
    cJSON *estimation_type_local_JSON = campaign_planning_estimation_type_convertToJSON(campaign_planning_budget_recommendation_point->estimation_type);
    if(estimation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "estimation_type", estimation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_planning_budget_recommendation_point->point_estimate
    if(campaign_planning_budget_recommendation_point->point_estimate) {
    cJSON *point_estimate_local_JSON = campaign_planning_point_estimate_convertToJSON(campaign_planning_budget_recommendation_point->point_estimate);
    if(point_estimate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "point_estimate", point_estimate_local_JSON);
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

campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_parseFromJSON(cJSON *campaign_planning_budget_recommendation_pointJSON){

    campaign_planning_budget_recommendation_point_t *campaign_planning_budget_recommendation_point_local_var = NULL;

    // define the local variable for campaign_planning_budget_recommendation_point->estimation_type
    campaign_planning_estimation_type_t *estimation_type_local_nonprim = NULL;

    // define the local variable for campaign_planning_budget_recommendation_point->point_estimate
    campaign_planning_point_estimate_t *point_estimate_local_nonprim = NULL;

    // campaign_planning_budget_recommendation_point->estimation_type
    cJSON *estimation_type = cJSON_GetObjectItemCaseSensitive(campaign_planning_budget_recommendation_pointJSON, "estimation_type");
    if (cJSON_IsNull(estimation_type)) {
        estimation_type = NULL;
    }
    if (estimation_type) { 
    estimation_type_local_nonprim = campaign_planning_estimation_type_parseFromJSON(estimation_type); //custom
    }

    // campaign_planning_budget_recommendation_point->point_estimate
    cJSON *point_estimate = cJSON_GetObjectItemCaseSensitive(campaign_planning_budget_recommendation_pointJSON, "point_estimate");
    if (cJSON_IsNull(point_estimate)) {
        point_estimate = NULL;
    }
    if (point_estimate) { 
    point_estimate_local_nonprim = campaign_planning_point_estimate_parseFromJSON(point_estimate); //nonprimitive
    }



    campaign_planning_budget_recommendation_point_local_var = campaign_planning_budget_recommendation_point_create_internal (
        estimation_type ? estimation_type_local_nonprim : NULL,
        point_estimate ? point_estimate_local_nonprim : NULL
        );

    if (!campaign_planning_budget_recommendation_point_local_var) {
        goto end;
    }

    return campaign_planning_budget_recommendation_point_local_var;
end:
    if (estimation_type_local_nonprim) {
        campaign_planning_estimation_type_free(estimation_type_local_nonprim);
        estimation_type_local_nonprim = NULL;
    }
    if (point_estimate_local_nonprim) {
        campaign_planning_point_estimate_free(point_estimate_local_nonprim);
        point_estimate_local_nonprim = NULL;
    }
    return NULL;

}
