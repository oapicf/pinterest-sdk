#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_planning_point_estimate.h"



static campaign_planning_point_estimate_t *campaign_planning_point_estimate_create_internal(
    int *budget,
    double *double_y,
    int *max_y,
    int *min_y,
    int *y
    ) {
    campaign_planning_point_estimate_t *campaign_planning_point_estimate_local_var = malloc(sizeof(campaign_planning_point_estimate_t));
    if (!campaign_planning_point_estimate_local_var) {
        return NULL;
    }
    memset(campaign_planning_point_estimate_local_var, 0, sizeof(campaign_planning_point_estimate_t));
    campaign_planning_point_estimate_local_var->_library_owned = 1;
    campaign_planning_point_estimate_local_var->budget = budget;
    campaign_planning_point_estimate_local_var->double_y = double_y;
    campaign_planning_point_estimate_local_var->max_y = max_y;
    campaign_planning_point_estimate_local_var->min_y = min_y;
    campaign_planning_point_estimate_local_var->y = y;
    return campaign_planning_point_estimate_local_var;
}

__attribute__((deprecated)) campaign_planning_point_estimate_t *campaign_planning_point_estimate_create(
    int *budget,
    double *double_y,
    int *max_y,
    int *min_y,
    int *y
    ) {
    int *budget_copy = NULL;
    if (budget) {
        budget_copy = malloc(sizeof(int));
        if (budget_copy) *budget_copy = *budget;
    }
    double *double_y_copy = NULL;
    if (double_y) {
        double_y_copy = malloc(sizeof(double));
        if (double_y_copy) *double_y_copy = *double_y;
    }
    int *max_y_copy = NULL;
    if (max_y) {
        max_y_copy = malloc(sizeof(int));
        if (max_y_copy) *max_y_copy = *max_y;
    }
    int *min_y_copy = NULL;
    if (min_y) {
        min_y_copy = malloc(sizeof(int));
        if (min_y_copy) *min_y_copy = *min_y;
    }
    int *y_copy = NULL;
    if (y) {
        y_copy = malloc(sizeof(int));
        if (y_copy) *y_copy = *y;
    }
    campaign_planning_point_estimate_t *result = campaign_planning_point_estimate_create_internal (
        budget_copy,
        double_y_copy,
        max_y_copy,
        min_y_copy,
        y_copy
        );
    if (!result) {
        free(budget_copy);
        free(double_y_copy);
        free(max_y_copy);
        free(min_y_copy);
        free(y_copy);
    }
    return result;
}

void campaign_planning_point_estimate_free(campaign_planning_point_estimate_t *campaign_planning_point_estimate) {
    if(NULL == campaign_planning_point_estimate){
        return ;
    }
    if(campaign_planning_point_estimate->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_planning_point_estimate_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_planning_point_estimate->budget) {
        free(campaign_planning_point_estimate->budget);
        campaign_planning_point_estimate->budget = NULL;
    }
    if (campaign_planning_point_estimate->double_y) {
        free(campaign_planning_point_estimate->double_y);
        campaign_planning_point_estimate->double_y = NULL;
    }
    if (campaign_planning_point_estimate->max_y) {
        free(campaign_planning_point_estimate->max_y);
        campaign_planning_point_estimate->max_y = NULL;
    }
    if (campaign_planning_point_estimate->min_y) {
        free(campaign_planning_point_estimate->min_y);
        campaign_planning_point_estimate->min_y = NULL;
    }
    if (campaign_planning_point_estimate->y) {
        free(campaign_planning_point_estimate->y);
        campaign_planning_point_estimate->y = NULL;
    }
    free(campaign_planning_point_estimate);
}

cJSON *campaign_planning_point_estimate_convertToJSON(campaign_planning_point_estimate_t *campaign_planning_point_estimate) {
    cJSON *item = cJSON_CreateObject();

    // campaign_planning_point_estimate->budget
    if (!campaign_planning_point_estimate->budget) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "budget", *campaign_planning_point_estimate->budget) == NULL) {
    goto fail; //Numeric
    }


    // campaign_planning_point_estimate->double_y
    if (!campaign_planning_point_estimate->double_y) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "double_y", *campaign_planning_point_estimate->double_y) == NULL) {
    goto fail; //Numeric
    }


    // campaign_planning_point_estimate->max_y
    if (!campaign_planning_point_estimate->max_y) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_y", *campaign_planning_point_estimate->max_y) == NULL) {
    goto fail; //Numeric
    }


    // campaign_planning_point_estimate->min_y
    if (!campaign_planning_point_estimate->min_y) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_y", *campaign_planning_point_estimate->min_y) == NULL) {
    goto fail; //Numeric
    }


    // campaign_planning_point_estimate->y
    if (!campaign_planning_point_estimate->y) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "y", *campaign_planning_point_estimate->y) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_planning_point_estimate_t *campaign_planning_point_estimate_parseFromJSON(cJSON *campaign_planning_point_estimateJSON){

    campaign_planning_point_estimate_t *campaign_planning_point_estimate_local_var = NULL;

    // define the local variable for campaign_planning_point_estimate->budget
    int *budget_local_var = NULL;

    // define the local variable for campaign_planning_point_estimate->double_y
    double *double_y_local_var = NULL;

    // define the local variable for campaign_planning_point_estimate->max_y
    int *max_y_local_var = NULL;

    // define the local variable for campaign_planning_point_estimate->min_y
    int *min_y_local_var = NULL;

    // define the local variable for campaign_planning_point_estimate->y
    int *y_local_var = NULL;

    // campaign_planning_point_estimate->budget
    cJSON *budget = cJSON_GetObjectItemCaseSensitive(campaign_planning_point_estimateJSON, "budget");
    if (cJSON_IsNull(budget)) {
        budget = NULL;
    }
    if (!budget) {
        goto end;
    }

    
    if(!cJSON_IsNumber(budget))
    {
    goto end; //Numeric
    }
    budget_local_var = malloc(sizeof(int));
    if(!budget_local_var)
    {
        goto end;
    }
    *budget_local_var = budget->valuedouble;

    // campaign_planning_point_estimate->double_y
    cJSON *double_y = cJSON_GetObjectItemCaseSensitive(campaign_planning_point_estimateJSON, "double_y");
    if (cJSON_IsNull(double_y)) {
        double_y = NULL;
    }
    if (!double_y) {
        goto end;
    }

    
    if(!cJSON_IsNumber(double_y))
    {
    goto end; //Numeric
    }
    double_y_local_var = malloc(sizeof(double));
    if(!double_y_local_var)
    {
        goto end;
    }
    *double_y_local_var = double_y->valuedouble;

    // campaign_planning_point_estimate->max_y
    cJSON *max_y = cJSON_GetObjectItemCaseSensitive(campaign_planning_point_estimateJSON, "max_y");
    if (cJSON_IsNull(max_y)) {
        max_y = NULL;
    }
    if (!max_y) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_y))
    {
    goto end; //Numeric
    }
    max_y_local_var = malloc(sizeof(int));
    if(!max_y_local_var)
    {
        goto end;
    }
    *max_y_local_var = max_y->valuedouble;

    // campaign_planning_point_estimate->min_y
    cJSON *min_y = cJSON_GetObjectItemCaseSensitive(campaign_planning_point_estimateJSON, "min_y");
    if (cJSON_IsNull(min_y)) {
        min_y = NULL;
    }
    if (!min_y) {
        goto end;
    }

    
    if(!cJSON_IsNumber(min_y))
    {
    goto end; //Numeric
    }
    min_y_local_var = malloc(sizeof(int));
    if(!min_y_local_var)
    {
        goto end;
    }
    *min_y_local_var = min_y->valuedouble;

    // campaign_planning_point_estimate->y
    cJSON *y = cJSON_GetObjectItemCaseSensitive(campaign_planning_point_estimateJSON, "y");
    if (cJSON_IsNull(y)) {
        y = NULL;
    }
    if (!y) {
        goto end;
    }

    
    if(!cJSON_IsNumber(y))
    {
    goto end; //Numeric
    }
    y_local_var = malloc(sizeof(int));
    if(!y_local_var)
    {
        goto end;
    }
    *y_local_var = y->valuedouble;



    campaign_planning_point_estimate_local_var = campaign_planning_point_estimate_create_internal (
        budget_local_var,
        double_y_local_var,
        max_y_local_var,
        min_y_local_var,
        y_local_var
        );

    if (!campaign_planning_point_estimate_local_var) {
        goto end;
    }

    return campaign_planning_point_estimate_local_var;
end:
    if (budget_local_var) {
        free(budget_local_var);
        budget_local_var = NULL;
    }
    if (double_y_local_var) {
        free(double_y_local_var);
        double_y_local_var = NULL;
    }
    if (max_y_local_var) {
        free(max_y_local_var);
        max_y_local_var = NULL;
    }
    if (min_y_local_var) {
        free(min_y_local_var);
        min_y_local_var = NULL;
    }
    if (y_local_var) {
        free(y_local_var);
        y_local_var = NULL;
    }
    return NULL;

}
