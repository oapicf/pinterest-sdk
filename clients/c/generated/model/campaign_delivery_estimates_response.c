#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_delivery_estimates_response.h"



static campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_create_internal(
    list_t *curves,
    campaign_delivery_estimates_derived_metrics_t *derived_metrics,
    int *max_potential_spend
    ) {
    campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_local_var = malloc(sizeof(campaign_delivery_estimates_response_t));
    if (!campaign_delivery_estimates_response_local_var) {
        return NULL;
    }
    memset(campaign_delivery_estimates_response_local_var, 0, sizeof(campaign_delivery_estimates_response_t));
    campaign_delivery_estimates_response_local_var->_library_owned = 1;
    campaign_delivery_estimates_response_local_var->curves = curves;
    campaign_delivery_estimates_response_local_var->derived_metrics = derived_metrics;
    campaign_delivery_estimates_response_local_var->max_potential_spend = max_potential_spend;
    return campaign_delivery_estimates_response_local_var;
}

__attribute__((deprecated)) campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_create(
    list_t *curves,
    campaign_delivery_estimates_derived_metrics_t *derived_metrics,
    int *max_potential_spend
    ) {
    int *max_potential_spend_copy = NULL;
    if (max_potential_spend) {
        max_potential_spend_copy = malloc(sizeof(int));
        if (max_potential_spend_copy) *max_potential_spend_copy = *max_potential_spend;
    }
    campaign_delivery_estimates_response_t *result = campaign_delivery_estimates_response_create_internal (
        curves,
        derived_metrics,
        max_potential_spend_copy
        );
    if (!result) {
        free(max_potential_spend_copy);
    }
    return result;
}

void campaign_delivery_estimates_response_free(campaign_delivery_estimates_response_t *campaign_delivery_estimates_response) {
    if(NULL == campaign_delivery_estimates_response){
        return ;
    }
    if(campaign_delivery_estimates_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_delivery_estimates_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_delivery_estimates_response->curves) {
        list_ForEach(listEntry, campaign_delivery_estimates_response->curves) {
            campaign_planning_curve_estimate_free(listEntry->data);
        }
        list_freeList(campaign_delivery_estimates_response->curves);
        campaign_delivery_estimates_response->curves = NULL;
    }
    if (campaign_delivery_estimates_response->derived_metrics) {
        campaign_delivery_estimates_derived_metrics_free(campaign_delivery_estimates_response->derived_metrics);
        campaign_delivery_estimates_response->derived_metrics = NULL;
    }
    if (campaign_delivery_estimates_response->max_potential_spend) {
        free(campaign_delivery_estimates_response->max_potential_spend);
        campaign_delivery_estimates_response->max_potential_spend = NULL;
    }
    free(campaign_delivery_estimates_response);
}

cJSON *campaign_delivery_estimates_response_convertToJSON(campaign_delivery_estimates_response_t *campaign_delivery_estimates_response) {
    cJSON *item = cJSON_CreateObject();

    // campaign_delivery_estimates_response->curves
    if(campaign_delivery_estimates_response->curves) {
    cJSON *curves = cJSON_AddArrayToObject(item, "curves");
    if(curves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *curvesListEntry;
    if (campaign_delivery_estimates_response->curves) {
    list_ForEach(curvesListEntry, campaign_delivery_estimates_response->curves) {
    cJSON *itemLocal = campaign_planning_curve_estimate_convertToJSON(curvesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(curves, itemLocal);
    }
    }
    }


    // campaign_delivery_estimates_response->derived_metrics
    if(campaign_delivery_estimates_response->derived_metrics) {
    cJSON *derived_metrics_local_JSON = campaign_delivery_estimates_derived_metrics_convertToJSON(campaign_delivery_estimates_response->derived_metrics);
    if(derived_metrics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "derived_metrics", derived_metrics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_delivery_estimates_response->max_potential_spend
    if(campaign_delivery_estimates_response->max_potential_spend) {
    if(cJSON_AddNumberToObject(item, "max_potential_spend", *campaign_delivery_estimates_response->max_potential_spend) == NULL) {
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

campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_parseFromJSON(cJSON *campaign_delivery_estimates_responseJSON){

    campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_local_var = NULL;

    // define the local list for campaign_delivery_estimates_response->curves
    list_t *curvesList = NULL;

    // define the local variable for campaign_delivery_estimates_response->derived_metrics
    campaign_delivery_estimates_derived_metrics_t *derived_metrics_local_nonprim = NULL;

    // define the local variable for campaign_delivery_estimates_response->max_potential_spend
    int *max_potential_spend_local_var = NULL;

    // campaign_delivery_estimates_response->curves
    cJSON *curves = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_responseJSON, "curves");
    if (cJSON_IsNull(curves)) {
        curves = NULL;
    }
    if (curves) { 
    cJSON *curves_local_nonprimitive = NULL;
    if(!cJSON_IsArray(curves)){
        goto end; //nonprimitive container
    }

    curvesList = list_createList();

    cJSON_ArrayForEach(curves_local_nonprimitive,curves )
    {
        if(!cJSON_IsObject(curves_local_nonprimitive)){
            goto end;
        }
        campaign_planning_curve_estimate_t *curvesItem = campaign_planning_curve_estimate_parseFromJSON(curves_local_nonprimitive);

        list_addElement(curvesList, curvesItem);
    }
    }

    // campaign_delivery_estimates_response->derived_metrics
    cJSON *derived_metrics = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_responseJSON, "derived_metrics");
    if (cJSON_IsNull(derived_metrics)) {
        derived_metrics = NULL;
    }
    if (derived_metrics) { 
    derived_metrics_local_nonprim = campaign_delivery_estimates_derived_metrics_parseFromJSON(derived_metrics); //nonprimitive
    }

    // campaign_delivery_estimates_response->max_potential_spend
    cJSON *max_potential_spend = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_responseJSON, "max_potential_spend");
    if (cJSON_IsNull(max_potential_spend)) {
        max_potential_spend = NULL;
    }
    if (max_potential_spend) { 
    if(!cJSON_IsNumber(max_potential_spend))
    {
    goto end; //Numeric
    }
    max_potential_spend_local_var = malloc(sizeof(int));
    if(!max_potential_spend_local_var)
    {
        goto end;
    }
    *max_potential_spend_local_var = max_potential_spend->valuedouble;
    }



    campaign_delivery_estimates_response_local_var = campaign_delivery_estimates_response_create_internal (
        curves ? curvesList : NULL,
        derived_metrics ? derived_metrics_local_nonprim : NULL,
        max_potential_spend_local_var
        );

    if (!campaign_delivery_estimates_response_local_var) {
        goto end;
    }

    return campaign_delivery_estimates_response_local_var;
end:
    if (curvesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, curvesList) {
            campaign_planning_curve_estimate_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(curvesList);
        curvesList = NULL;
    }
    if (derived_metrics_local_nonprim) {
        campaign_delivery_estimates_derived_metrics_free(derived_metrics_local_nonprim);
        derived_metrics_local_nonprim = NULL;
    }
    if (max_potential_spend_local_var) {
        free(max_potential_spend_local_var);
        max_potential_spend_local_var = NULL;
    }
    return NULL;

}
