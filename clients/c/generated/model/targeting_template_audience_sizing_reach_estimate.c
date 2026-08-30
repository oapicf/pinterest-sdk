#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_audience_sizing_reach_estimate.h"



static targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_create_internal(
    long *estimate,
    long *lower_bound,
    long *upper_bound
    ) {
    targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_local_var = malloc(sizeof(targeting_template_audience_sizing_reach_estimate_t));
    if (!targeting_template_audience_sizing_reach_estimate_local_var) {
        return NULL;
    }
    memset(targeting_template_audience_sizing_reach_estimate_local_var, 0, sizeof(targeting_template_audience_sizing_reach_estimate_t));
    targeting_template_audience_sizing_reach_estimate_local_var->_library_owned = 1;
    targeting_template_audience_sizing_reach_estimate_local_var->estimate = estimate;
    targeting_template_audience_sizing_reach_estimate_local_var->lower_bound = lower_bound;
    targeting_template_audience_sizing_reach_estimate_local_var->upper_bound = upper_bound;
    return targeting_template_audience_sizing_reach_estimate_local_var;
}

__attribute__((deprecated)) targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_create(
    long *estimate,
    long *lower_bound,
    long *upper_bound
    ) {
    long *estimate_copy = NULL;
    if (estimate) {
        estimate_copy = malloc(sizeof(long));
        if (estimate_copy) *estimate_copy = *estimate;
    }
    long *lower_bound_copy = NULL;
    if (lower_bound) {
        lower_bound_copy = malloc(sizeof(long));
        if (lower_bound_copy) *lower_bound_copy = *lower_bound;
    }
    long *upper_bound_copy = NULL;
    if (upper_bound) {
        upper_bound_copy = malloc(sizeof(long));
        if (upper_bound_copy) *upper_bound_copy = *upper_bound;
    }
    targeting_template_audience_sizing_reach_estimate_t *result = targeting_template_audience_sizing_reach_estimate_create_internal (
        estimate_copy,
        lower_bound_copy,
        upper_bound_copy
        );
    if (!result) {
        free(estimate_copy);
        free(lower_bound_copy);
        free(upper_bound_copy);
    }
    return result;
}

void targeting_template_audience_sizing_reach_estimate_free(targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate) {
    if(NULL == targeting_template_audience_sizing_reach_estimate){
        return ;
    }
    if(targeting_template_audience_sizing_reach_estimate->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_template_audience_sizing_reach_estimate_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_audience_sizing_reach_estimate->estimate) {
        free(targeting_template_audience_sizing_reach_estimate->estimate);
        targeting_template_audience_sizing_reach_estimate->estimate = NULL;
    }
    if (targeting_template_audience_sizing_reach_estimate->lower_bound) {
        free(targeting_template_audience_sizing_reach_estimate->lower_bound);
        targeting_template_audience_sizing_reach_estimate->lower_bound = NULL;
    }
    if (targeting_template_audience_sizing_reach_estimate->upper_bound) {
        free(targeting_template_audience_sizing_reach_estimate->upper_bound);
        targeting_template_audience_sizing_reach_estimate->upper_bound = NULL;
    }
    free(targeting_template_audience_sizing_reach_estimate);
}

cJSON *targeting_template_audience_sizing_reach_estimate_convertToJSON(targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_audience_sizing_reach_estimate->estimate
    if(targeting_template_audience_sizing_reach_estimate->estimate) {
    if(cJSON_AddNumberToObject(item, "estimate", *targeting_template_audience_sizing_reach_estimate->estimate) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template_audience_sizing_reach_estimate->lower_bound
    if(targeting_template_audience_sizing_reach_estimate->lower_bound) {
    if(cJSON_AddNumberToObject(item, "lower_bound", *targeting_template_audience_sizing_reach_estimate->lower_bound) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_template_audience_sizing_reach_estimate->upper_bound
    if(targeting_template_audience_sizing_reach_estimate->upper_bound) {
    if(cJSON_AddNumberToObject(item, "upper_bound", *targeting_template_audience_sizing_reach_estimate->upper_bound) == NULL) {
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

    // define the local variable for targeting_template_audience_sizing_reach_estimate->estimate
    long *estimate_local_var = NULL;

    // define the local variable for targeting_template_audience_sizing_reach_estimate->lower_bound
    long *lower_bound_local_var = NULL;

    // define the local variable for targeting_template_audience_sizing_reach_estimate->upper_bound
    long *upper_bound_local_var = NULL;

    // targeting_template_audience_sizing_reach_estimate->estimate
    cJSON *estimate = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizing_reach_estimateJSON, "estimate");
    if (cJSON_IsNull(estimate)) {
        estimate = NULL;
    }
    if (estimate) { 
    if(!cJSON_IsNumber(estimate))
    {
    goto end; //Numeric
    }
    estimate_local_var = malloc(sizeof(long));
    if(!estimate_local_var)
    {
        goto end;
    }
    *estimate_local_var = estimate->valuedouble;
    }

    // targeting_template_audience_sizing_reach_estimate->lower_bound
    cJSON *lower_bound = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizing_reach_estimateJSON, "lower_bound");
    if (cJSON_IsNull(lower_bound)) {
        lower_bound = NULL;
    }
    if (lower_bound) { 
    if(!cJSON_IsNumber(lower_bound))
    {
    goto end; //Numeric
    }
    lower_bound_local_var = malloc(sizeof(long));
    if(!lower_bound_local_var)
    {
        goto end;
    }
    *lower_bound_local_var = lower_bound->valuedouble;
    }

    // targeting_template_audience_sizing_reach_estimate->upper_bound
    cJSON *upper_bound = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizing_reach_estimateJSON, "upper_bound");
    if (cJSON_IsNull(upper_bound)) {
        upper_bound = NULL;
    }
    if (upper_bound) { 
    if(!cJSON_IsNumber(upper_bound))
    {
    goto end; //Numeric
    }
    upper_bound_local_var = malloc(sizeof(long));
    if(!upper_bound_local_var)
    {
        goto end;
    }
    *upper_bound_local_var = upper_bound->valuedouble;
    }



    targeting_template_audience_sizing_reach_estimate_local_var = targeting_template_audience_sizing_reach_estimate_create_internal (
        estimate_local_var,
        lower_bound_local_var,
        upper_bound_local_var
        );

    if (!targeting_template_audience_sizing_reach_estimate_local_var) {
        goto end;
    }

    return targeting_template_audience_sizing_reach_estimate_local_var;
end:
    if (estimate_local_var) {
        free(estimate_local_var);
        estimate_local_var = NULL;
    }
    if (lower_bound_local_var) {
        free(lower_bound_local_var);
        lower_bound_local_var = NULL;
    }
    if (upper_bound_local_var) {
        free(upper_bound_local_var);
        upper_bound_local_var = NULL;
    }
    return NULL;

}
