#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_audience_sizing_reach_estimate.h"



targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_create(
    long estimate,
    long lower_bound,
    long upper_bound
    ) {
    targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_local_var = malloc(sizeof(targeting_template_audience_sizing_reach_estimate_t));
    if (!targeting_template_audience_sizing_reach_estimate_local_var) {
        return NULL;
    }
    targeting_template_audience_sizing_reach_estimate_local_var->estimate = estimate;
    targeting_template_audience_sizing_reach_estimate_local_var->lower_bound = lower_bound;
    targeting_template_audience_sizing_reach_estimate_local_var->upper_bound = upper_bound;

    return targeting_template_audience_sizing_reach_estimate_local_var;
}


void targeting_template_audience_sizing_reach_estimate_free(targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate) {
    if(NULL == targeting_template_audience_sizing_reach_estimate){
        return ;
    }
    listEntry_t *listEntry;
    free(targeting_template_audience_sizing_reach_estimate);
}

cJSON *targeting_template_audience_sizing_reach_estimate_convertToJSON(targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_audience_sizing_reach_estimate->estimate
    if(targeting_template_audience_sizing_reach_estimate->estimate) {
    if(cJSON_AddNumberToObject(item, "estimate", targeting_template_audience_sizing_reach_estimate->estimate) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template_audience_sizing_reach_estimate->lower_bound
    if(targeting_template_audience_sizing_reach_estimate->lower_bound) {
    if(cJSON_AddNumberToObject(item, "lower_bound", targeting_template_audience_sizing_reach_estimate->lower_bound) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template_audience_sizing_reach_estimate->upper_bound
    if(targeting_template_audience_sizing_reach_estimate->upper_bound) {
    if(cJSON_AddNumberToObject(item, "upper_bound", targeting_template_audience_sizing_reach_estimate->upper_bound) == NULL) {
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

targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_parseFromJSON(cJSON *targeting_template_audience_sizing_reach_estimateJSON){

    targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_local_var = NULL;

    // targeting_template_audience_sizing_reach_estimate->estimate
    cJSON *estimate = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizing_reach_estimateJSON, "estimate");
    if (estimate) { 
    if(!cJSON_IsNumber(estimate))
    {
    goto end; //Numeric
    }
    }

    // targeting_template_audience_sizing_reach_estimate->lower_bound
    cJSON *lower_bound = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizing_reach_estimateJSON, "lower_bound");
    if (lower_bound) { 
    if(!cJSON_IsNumber(lower_bound))
    {
    goto end; //Numeric
    }
    }

    // targeting_template_audience_sizing_reach_estimate->upper_bound
    cJSON *upper_bound = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizing_reach_estimateJSON, "upper_bound");
    if (upper_bound) { 
    if(!cJSON_IsNumber(upper_bound))
    {
    goto end; //Numeric
    }
    }


    targeting_template_audience_sizing_reach_estimate_local_var = targeting_template_audience_sizing_reach_estimate_create (
        estimate ? estimate->valuedouble : 0,
        lower_bound ? lower_bound->valuedouble : 0,
        upper_bound ? upper_bound->valuedouble : 0
        );

    return targeting_template_audience_sizing_reach_estimate_local_var;
end:
    return NULL;

}
