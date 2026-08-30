#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_experiment_budget_recommendation.h"



static campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_create_internal(
    int *budget_recommendation,
    int *lifetime_days_recommendation,
    list_t *point_estimations,
    char *version_id
    ) {
    campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_local_var = malloc(sizeof(campaign_planning_experiment_budget_recommendation_t));
    if (!campaign_planning_experiment_budget_recommendation_local_var) {
        return NULL;
    }
    memset(campaign_planning_experiment_budget_recommendation_local_var, 0, sizeof(campaign_planning_experiment_budget_recommendation_t));
    campaign_planning_experiment_budget_recommendation_local_var->_library_owned = 1;
    campaign_planning_experiment_budget_recommendation_local_var->budget_recommendation = budget_recommendation;
    campaign_planning_experiment_budget_recommendation_local_var->lifetime_days_recommendation = lifetime_days_recommendation;
    campaign_planning_experiment_budget_recommendation_local_var->point_estimations = point_estimations;
    campaign_planning_experiment_budget_recommendation_local_var->version_id = version_id;
    return campaign_planning_experiment_budget_recommendation_local_var;
}

__attribute__((deprecated)) campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_create(
    int *budget_recommendation,
    int *lifetime_days_recommendation,
    list_t *point_estimations,
    char *version_id
    ) {
    int *budget_recommendation_copy = NULL;
    if (budget_recommendation) {
        budget_recommendation_copy = malloc(sizeof(int));
        if (budget_recommendation_copy) *budget_recommendation_copy = *budget_recommendation;
    }
    int *lifetime_days_recommendation_copy = NULL;
    if (lifetime_days_recommendation) {
        lifetime_days_recommendation_copy = malloc(sizeof(int));
        if (lifetime_days_recommendation_copy) *lifetime_days_recommendation_copy = *lifetime_days_recommendation;
    }
    campaign_planning_experiment_budget_recommendation_t *result = campaign_planning_experiment_budget_recommendation_create_internal (
        budget_recommendation_copy,
        lifetime_days_recommendation_copy,
        point_estimations,
        version_id
        );
    if (!result) {
        free(budget_recommendation_copy);
        free(lifetime_days_recommendation_copy);
    }
    return result;
}

void campaign_planning_experiment_budget_recommendation_free(campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation) {
    if(NULL == campaign_planning_experiment_budget_recommendation){
        return ;
    }
    if(campaign_planning_experiment_budget_recommendation->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_experiment_budget_recommendation_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_experiment_budget_recommendation->budget_recommendation) {
        free(campaign_planning_experiment_budget_recommendation->budget_recommendation);
        campaign_planning_experiment_budget_recommendation->budget_recommendation = NULL;
    }
    if (campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation) {
        free(campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation);
        campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation = NULL;
    }
    if (campaign_planning_experiment_budget_recommendation->point_estimations) {
        list_ForEach(listEntry, campaign_planning_experiment_budget_recommendation->point_estimations) {
            campaign_planning_budget_recommendation_point_free(listEntry->data);
        }
        list_freeList(campaign_planning_experiment_budget_recommendation->point_estimations);
        campaign_planning_experiment_budget_recommendation->point_estimations = NULL;
    }
    if (campaign_planning_experiment_budget_recommendation->version_id) {
        free(campaign_planning_experiment_budget_recommendation->version_id);
        campaign_planning_experiment_budget_recommendation->version_id = NULL;
    }
    free(campaign_planning_experiment_budget_recommendation);
}

cJSON *campaign_planning_experiment_budget_recommendation_convertToJSON(campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_experiment_budget_recommendation->budget_recommendation
    if(campaign_planning_experiment_budget_recommendation->budget_recommendation) {
    if(cJSON_AddNumberToObject(item, "budget_recommendation", *campaign_planning_experiment_budget_recommendation->budget_recommendation) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation
    if(campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation) {
    if(cJSON_AddNumberToObject(item, "lifetime_days_recommendation", *campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_planning_experiment_budget_recommendation->point_estimations
    if(campaign_planning_experiment_budget_recommendation->point_estimations) {
    cJSON *point_estimations = cJSON_AddArrayToObject(item, "point_estimations");
    if(point_estimations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *point_estimationsListEntry;
    if (campaign_planning_experiment_budget_recommendation->point_estimations) {
    list_ForEach(point_estimationsListEntry, campaign_planning_experiment_budget_recommendation->point_estimations) {
    cJSON *itemLocal = campaign_planning_budget_recommendation_point_convertToJSON(point_estimationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(point_estimations, itemLocal);
    }
    }
    }


    // campaign_planning_experiment_budget_recommendation->version_id
    if(campaign_planning_experiment_budget_recommendation->version_id) {
    if(cJSON_AddStringToObject(item, "version_id", campaign_planning_experiment_budget_recommendation->version_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_parseFromJSON(cJSON *campaign_planning_experiment_budget_recommendationJSON){

    campaign_planning_experiment_budget_recommendation_t *campaign_planning_experiment_budget_recommendation_local_var = NULL;

    // define the local variable for campaign_planning_experiment_budget_recommendation->budget_recommendation
    int *budget_recommendation_local_var = NULL;

    // define the local variable for campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation
    int *lifetime_days_recommendation_local_var = NULL;

    // define the local list for campaign_planning_experiment_budget_recommendation->point_estimations
    list_t *point_estimationsList = NULL;

    char *version_id_local_str = NULL;

    // campaign_planning_experiment_budget_recommendation->budget_recommendation
    cJSON *budget_recommendation = cJSON_GetObjectItemCaseSensitive(campaign_planning_experiment_budget_recommendationJSON, "budget_recommendation");
    if (cJSON_IsNull(budget_recommendation)) {
        budget_recommendation = NULL;
    }
    if (budget_recommendation) { 
    if(!cJSON_IsNumber(budget_recommendation))
    {
    goto end; //Numeric
    }
    budget_recommendation_local_var = malloc(sizeof(int));
    if(!budget_recommendation_local_var)
    {
        goto end;
    }
    *budget_recommendation_local_var = budget_recommendation->valuedouble;
    }

    // campaign_planning_experiment_budget_recommendation->lifetime_days_recommendation
    cJSON *lifetime_days_recommendation = cJSON_GetObjectItemCaseSensitive(campaign_planning_experiment_budget_recommendationJSON, "lifetime_days_recommendation");
    if (cJSON_IsNull(lifetime_days_recommendation)) {
        lifetime_days_recommendation = NULL;
    }
    if (lifetime_days_recommendation) { 
    if(!cJSON_IsNumber(lifetime_days_recommendation))
    {
    goto end; //Numeric
    }
    lifetime_days_recommendation_local_var = malloc(sizeof(int));
    if(!lifetime_days_recommendation_local_var)
    {
        goto end;
    }
    *lifetime_days_recommendation_local_var = lifetime_days_recommendation->valuedouble;
    }

    // campaign_planning_experiment_budget_recommendation->point_estimations
    cJSON *point_estimations = cJSON_GetObjectItemCaseSensitive(campaign_planning_experiment_budget_recommendationJSON, "point_estimations");
    if (cJSON_IsNull(point_estimations)) {
        point_estimations = NULL;
    }
    if (point_estimations) { 
    cJSON *point_estimations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(point_estimations)){
        goto end; //nonprimitive container
    }

    point_estimationsList = list_createList();

    cJSON_ArrayForEach(point_estimations_local_nonprimitive,point_estimations )
    {
        if(!cJSON_IsObject(point_estimations_local_nonprimitive)){
            goto end;
        }
        campaign_planning_budget_recommendation_point_t *point_estimationsItem = campaign_planning_budget_recommendation_point_parseFromJSON(point_estimations_local_nonprimitive);

        list_addElement(point_estimationsList, point_estimationsItem);
    }
    }

    // campaign_planning_experiment_budget_recommendation->version_id
    cJSON *version_id = cJSON_GetObjectItemCaseSensitive(campaign_planning_experiment_budget_recommendationJSON, "version_id");
    if (cJSON_IsNull(version_id)) {
        version_id = NULL;
    }
    if (version_id) { 
    if(!cJSON_IsString(version_id) && !cJSON_IsNull(version_id))
    {
    goto end; //String
    }
    }


    if (version_id && !cJSON_IsNull(version_id)) version_id_local_str = strdup(version_id->valuestring);

    campaign_planning_experiment_budget_recommendation_local_var = campaign_planning_experiment_budget_recommendation_create_internal (
        budget_recommendation_local_var,
        lifetime_days_recommendation_local_var,
        point_estimations ? point_estimationsList : NULL,
        version_id_local_str
        );

    if (!campaign_planning_experiment_budget_recommendation_local_var) {
        goto end;
    }

    return campaign_planning_experiment_budget_recommendation_local_var;
end:
    if (budget_recommendation_local_var) {
        free(budget_recommendation_local_var);
        budget_recommendation_local_var = NULL;
    }
    if (lifetime_days_recommendation_local_var) {
        free(lifetime_days_recommendation_local_var);
        lifetime_days_recommendation_local_var = NULL;
    }
    if (point_estimationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, point_estimationsList) {
            campaign_planning_budget_recommendation_point_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(point_estimationsList);
        point_estimationsList = NULL;
    }
    if (version_id_local_str) {
        free(version_id_local_str);
        version_id_local_str = NULL;
    }
    return NULL;

}
