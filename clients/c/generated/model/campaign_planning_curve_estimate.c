#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_curve_estimate.h"



static campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_create_internal(
    campaign_planning_estimation_type_t *estimation_type,
    list_t *points
    ) {
    campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_local_var = malloc(sizeof(campaign_planning_curve_estimate_t));
    if (!campaign_planning_curve_estimate_local_var) {
        return NULL;
    }
    memset(campaign_planning_curve_estimate_local_var, 0, sizeof(campaign_planning_curve_estimate_t));
    campaign_planning_curve_estimate_local_var->_library_owned = 1;
    campaign_planning_curve_estimate_local_var->estimation_type = estimation_type;
    campaign_planning_curve_estimate_local_var->points = points;
    return campaign_planning_curve_estimate_local_var;
}

__attribute__((deprecated)) campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_create(
    campaign_planning_estimation_type_t *estimation_type,
    list_t *points
    ) {
    campaign_planning_curve_estimate_t *result = campaign_planning_curve_estimate_create_internal (
        estimation_type,
        points
        );
    if (!result) {
    }
    return result;
}

void campaign_planning_curve_estimate_free(campaign_planning_curve_estimate_t *campaign_planning_curve_estimate) {
    if(NULL == campaign_planning_curve_estimate){
        return ;
    }
    if(campaign_planning_curve_estimate->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_curve_estimate_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_curve_estimate->estimation_type) {
        campaign_planning_estimation_type_free(campaign_planning_curve_estimate->estimation_type);
        campaign_planning_curve_estimate->estimation_type = NULL;
    }
    if (campaign_planning_curve_estimate->points) {
        list_ForEach(listEntry, campaign_planning_curve_estimate->points) {
            campaign_planning_point_estimate_free(listEntry->data);
        }
        list_freeList(campaign_planning_curve_estimate->points);
        campaign_planning_curve_estimate->points = NULL;
    }
    free(campaign_planning_curve_estimate);
}

cJSON *campaign_planning_curve_estimate_convertToJSON(campaign_planning_curve_estimate_t *campaign_planning_curve_estimate) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_curve_estimate->estimation_type
    if(campaign_planning_curve_estimate->estimation_type) {
    cJSON *estimation_type_local_JSON = campaign_planning_estimation_type_convertToJSON(campaign_planning_curve_estimate->estimation_type);
    if(estimation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "estimation_type", estimation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_planning_curve_estimate->points
    if(campaign_planning_curve_estimate->points) {
    cJSON *points = cJSON_AddArrayToObject(item, "points");
    if(points == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pointsListEntry;
    if (campaign_planning_curve_estimate->points) {
    list_ForEach(pointsListEntry, campaign_planning_curve_estimate->points) {
    cJSON *itemLocal = campaign_planning_point_estimate_convertToJSON(pointsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(points, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_parseFromJSON(cJSON *campaign_planning_curve_estimateJSON){

    campaign_planning_curve_estimate_t *campaign_planning_curve_estimate_local_var = NULL;

    // define the local variable for campaign_planning_curve_estimate->estimation_type
    campaign_planning_estimation_type_t *estimation_type_local_nonprim = NULL;

    // define the local list for campaign_planning_curve_estimate->points
    list_t *pointsList = NULL;

    // campaign_planning_curve_estimate->estimation_type
    cJSON *estimation_type = cJSON_GetObjectItemCaseSensitive(campaign_planning_curve_estimateJSON, "estimation_type");
    if (cJSON_IsNull(estimation_type)) {
        estimation_type = NULL;
    }
    if (estimation_type) { 
    estimation_type_local_nonprim = campaign_planning_estimation_type_parseFromJSON(estimation_type); //custom
    }

    // campaign_planning_curve_estimate->points
    cJSON *points = cJSON_GetObjectItemCaseSensitive(campaign_planning_curve_estimateJSON, "points");
    if (cJSON_IsNull(points)) {
        points = NULL;
    }
    if (points) { 
    cJSON *points_local_nonprimitive = NULL;
    if(!cJSON_IsArray(points)){
        goto end; //nonprimitive container
    }

    pointsList = list_createList();

    cJSON_ArrayForEach(points_local_nonprimitive,points )
    {
        if(!cJSON_IsObject(points_local_nonprimitive)){
            goto end;
        }
        campaign_planning_point_estimate_t *pointsItem = campaign_planning_point_estimate_parseFromJSON(points_local_nonprimitive);

        list_addElement(pointsList, pointsItem);
    }
    }



    campaign_planning_curve_estimate_local_var = campaign_planning_curve_estimate_create_internal (
        estimation_type ? estimation_type_local_nonprim : NULL,
        points ? pointsList : NULL
        );

    if (!campaign_planning_curve_estimate_local_var) {
        goto end;
    }

    return campaign_planning_curve_estimate_local_var;
end:
    if (estimation_type_local_nonprim) {
        campaign_planning_estimation_type_free(estimation_type_local_nonprim);
        estimation_type_local_nonprim = NULL;
    }
    if (pointsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pointsList) {
            campaign_planning_point_estimate_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pointsList);
        pointsList = NULL;
    }
    return NULL;

}
