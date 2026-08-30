#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_create_request_all_of1.h"



static campaign_create_request_all_of1_t *campaign_create_request_all_of1_create_internal(
    campaign_bid_options_create_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    pinterest_rest_api_objective_type__e objective_type,
    entity_status_t *status
    ) {
    campaign_create_request_all_of1_t *campaign_create_request_all_of1_local_var = malloc(sizeof(campaign_create_request_all_of1_t));
    if (!campaign_create_request_all_of1_local_var) {
        return NULL;
    }
    memset(campaign_create_request_all_of1_local_var, 0, sizeof(campaign_create_request_all_of1_t));
    campaign_create_request_all_of1_local_var->_library_owned = 1;
    campaign_create_request_all_of1_local_var->bid_options = bid_options;
    campaign_create_request_all_of1_local_var->intended_promotion_type = intended_promotion_type;
    campaign_create_request_all_of1_local_var->is_automated_campaign = is_automated_campaign;
    campaign_create_request_all_of1_local_var->is_campaign_budget_optimization = is_campaign_budget_optimization;
    campaign_create_request_all_of1_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_create_request_all_of1_local_var->is_ltv_optimized = is_ltv_optimized;
    campaign_create_request_all_of1_local_var->is_performance_plus = is_performance_plus;
    campaign_create_request_all_of1_local_var->is_top_of_search = is_top_of_search;
    campaign_create_request_all_of1_local_var->objective_type = objective_type;
    campaign_create_request_all_of1_local_var->status = status;
    return campaign_create_request_all_of1_local_var;
}

__attribute__((deprecated)) campaign_create_request_all_of1_t *campaign_create_request_all_of1_create(
    campaign_bid_options_create_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    pinterest_rest_api_objective_type__e objective_type,
    entity_status_t *status
    ) {
    int *is_automated_campaign_copy = NULL;
    if (is_automated_campaign) {
        is_automated_campaign_copy = malloc(sizeof(int));
        if (is_automated_campaign_copy) *is_automated_campaign_copy = *is_automated_campaign;
    }
    int *is_campaign_budget_optimization_copy = NULL;
    if (is_campaign_budget_optimization) {
        is_campaign_budget_optimization_copy = malloc(sizeof(int));
        if (is_campaign_budget_optimization_copy) *is_campaign_budget_optimization_copy = *is_campaign_budget_optimization;
    }
    int *is_flexible_daily_budgets_copy = NULL;
    if (is_flexible_daily_budgets) {
        is_flexible_daily_budgets_copy = malloc(sizeof(int));
        if (is_flexible_daily_budgets_copy) *is_flexible_daily_budgets_copy = *is_flexible_daily_budgets;
    }
    int *is_ltv_optimized_copy = NULL;
    if (is_ltv_optimized) {
        is_ltv_optimized_copy = malloc(sizeof(int));
        if (is_ltv_optimized_copy) *is_ltv_optimized_copy = *is_ltv_optimized;
    }
    int *is_performance_plus_copy = NULL;
    if (is_performance_plus) {
        is_performance_plus_copy = malloc(sizeof(int));
        if (is_performance_plus_copy) *is_performance_plus_copy = *is_performance_plus;
    }
    int *is_top_of_search_copy = NULL;
    if (is_top_of_search) {
        is_top_of_search_copy = malloc(sizeof(int));
        if (is_top_of_search_copy) *is_top_of_search_copy = *is_top_of_search;
    }
    campaign_create_request_all_of1_t *result = campaign_create_request_all_of1_create_internal (
        bid_options,
        intended_promotion_type,
        is_automated_campaign_copy,
        is_campaign_budget_optimization_copy,
        is_flexible_daily_budgets_copy,
        is_ltv_optimized_copy,
        is_performance_plus_copy,
        is_top_of_search_copy,
        objective_type,
        status
        );
    if (!result) {
        free(is_automated_campaign_copy);
        free(is_campaign_budget_optimization_copy);
        free(is_flexible_daily_budgets_copy);
        free(is_ltv_optimized_copy);
        free(is_performance_plus_copy);
        free(is_top_of_search_copy);
    }
    return result;
}

void campaign_create_request_all_of1_free(campaign_create_request_all_of1_t *campaign_create_request_all_of1) {
    if(NULL == campaign_create_request_all_of1){
        return ;
    }
    if(campaign_create_request_all_of1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_create_request_all_of1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_create_request_all_of1->bid_options) {
        campaign_bid_options_create_free(campaign_create_request_all_of1->bid_options);
        campaign_create_request_all_of1->bid_options = NULL;
    }
    if (campaign_create_request_all_of1->is_automated_campaign) {
        free(campaign_create_request_all_of1->is_automated_campaign);
        campaign_create_request_all_of1->is_automated_campaign = NULL;
    }
    if (campaign_create_request_all_of1->is_campaign_budget_optimization) {
        free(campaign_create_request_all_of1->is_campaign_budget_optimization);
        campaign_create_request_all_of1->is_campaign_budget_optimization = NULL;
    }
    if (campaign_create_request_all_of1->is_flexible_daily_budgets) {
        free(campaign_create_request_all_of1->is_flexible_daily_budgets);
        campaign_create_request_all_of1->is_flexible_daily_budgets = NULL;
    }
    if (campaign_create_request_all_of1->is_ltv_optimized) {
        free(campaign_create_request_all_of1->is_ltv_optimized);
        campaign_create_request_all_of1->is_ltv_optimized = NULL;
    }
    if (campaign_create_request_all_of1->is_performance_plus) {
        free(campaign_create_request_all_of1->is_performance_plus);
        campaign_create_request_all_of1->is_performance_plus = NULL;
    }
    if (campaign_create_request_all_of1->is_top_of_search) {
        free(campaign_create_request_all_of1->is_top_of_search);
        campaign_create_request_all_of1->is_top_of_search = NULL;
    }
    if (campaign_create_request_all_of1->status) {
        entity_status_free(campaign_create_request_all_of1->status);
        campaign_create_request_all_of1->status = NULL;
    }
    free(campaign_create_request_all_of1);
}

cJSON *campaign_create_request_all_of1_convertToJSON(campaign_create_request_all_of1_t *campaign_create_request_all_of1) {
    cJSON *item = cJSON_CreateObject();

    // campaign_create_request_all_of1->bid_options
    if(campaign_create_request_all_of1->bid_options) {
    cJSON *bid_options_local_JSON = campaign_bid_options_create_convertToJSON(campaign_create_request_all_of1->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_create_request_all_of1->intended_promotion_type
    if(campaign_create_request_all_of1->intended_promotion_type != pinterest_rest_api_intended_promotion_type__NULL) {
    cJSON *intended_promotion_type_local_JSON = intended_promotion_type_convertToJSON(campaign_create_request_all_of1->intended_promotion_type);
    if(intended_promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "intended_promotion_type", intended_promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_create_request_all_of1->is_automated_campaign
    if(campaign_create_request_all_of1->is_automated_campaign) {
    if(cJSON_AddBoolToObject(item, "is_automated_campaign", *campaign_create_request_all_of1->is_automated_campaign) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request_all_of1->is_campaign_budget_optimization
    if(campaign_create_request_all_of1->is_campaign_budget_optimization) {
    if(cJSON_AddBoolToObject(item, "is_campaign_budget_optimization", *campaign_create_request_all_of1->is_campaign_budget_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request_all_of1->is_flexible_daily_budgets
    if(campaign_create_request_all_of1->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", *campaign_create_request_all_of1->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request_all_of1->is_ltv_optimized
    if(campaign_create_request_all_of1->is_ltv_optimized) {
    if(cJSON_AddBoolToObject(item, "is_ltv_optimized", *campaign_create_request_all_of1->is_ltv_optimized) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request_all_of1->is_performance_plus
    if(campaign_create_request_all_of1->is_performance_plus) {
    if(cJSON_AddBoolToObject(item, "is_performance_plus", *campaign_create_request_all_of1->is_performance_plus) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request_all_of1->is_top_of_search
    if(campaign_create_request_all_of1->is_top_of_search) {
    if(cJSON_AddBoolToObject(item, "is_top_of_search", *campaign_create_request_all_of1->is_top_of_search) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request_all_of1->objective_type
    if (pinterest_rest_api_objective_type__NULL == campaign_create_request_all_of1->objective_type) {
        goto fail;
    }
    cJSON *objective_type_local_JSON = objective_type_convertToJSON(campaign_create_request_all_of1->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // campaign_create_request_all_of1->status
    if(campaign_create_request_all_of1->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(campaign_create_request_all_of1->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
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

campaign_create_request_all_of1_t *campaign_create_request_all_of1_parseFromJSON(cJSON *campaign_create_request_all_of1JSON){

    campaign_create_request_all_of1_t *campaign_create_request_all_of1_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->bid_options
    campaign_bid_options_create_t *bid_options_local_nonprim = NULL;

    // define the local variable for campaign_create_request_all_of1->intended_promotion_type
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type_local_nonprim = 0;

    // define the local variable for campaign_create_request_all_of1->is_automated_campaign
    int *is_automated_campaign_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->is_campaign_budget_optimization
    int *is_campaign_budget_optimization_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->is_flexible_daily_budgets
    int *is_flexible_daily_budgets_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->is_ltv_optimized
    int *is_ltv_optimized_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->is_performance_plus
    int *is_performance_plus_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->is_top_of_search
    int *is_top_of_search_local_var = NULL;

    // define the local variable for campaign_create_request_all_of1->objective_type
    pinterest_rest_api_objective_type__e objective_type_local_nonprim = 0;

    // define the local variable for campaign_create_request_all_of1->status
    entity_status_t *status_local_nonprim = NULL;

    // campaign_create_request_all_of1->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "bid_options");
    if (cJSON_IsNull(bid_options)) {
        bid_options = NULL;
    }
    if (bid_options) { 
    bid_options_local_nonprim = campaign_bid_options_create_parseFromJSON(bid_options); //nonprimitive
    }

    // campaign_create_request_all_of1->intended_promotion_type
    cJSON *intended_promotion_type = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "intended_promotion_type");
    if (cJSON_IsNull(intended_promotion_type)) {
        intended_promotion_type = NULL;
    }
    if (intended_promotion_type) { 
    intended_promotion_type_local_nonprim = intended_promotion_type_parseFromJSON(intended_promotion_type); //custom
    }

    // campaign_create_request_all_of1->is_automated_campaign
    cJSON *is_automated_campaign = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "is_automated_campaign");
    if (cJSON_IsNull(is_automated_campaign)) {
        is_automated_campaign = NULL;
    }
    if (is_automated_campaign) { 
    if(!cJSON_IsBool(is_automated_campaign))
    {
    goto end; //Bool
    }
    is_automated_campaign_local_var = malloc(sizeof(int));
    if(!is_automated_campaign_local_var)
    {
        goto end;
    }
    *is_automated_campaign_local_var = is_automated_campaign->valueint;
    }

    // campaign_create_request_all_of1->is_campaign_budget_optimization
    cJSON *is_campaign_budget_optimization = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "is_campaign_budget_optimization");
    if (cJSON_IsNull(is_campaign_budget_optimization)) {
        is_campaign_budget_optimization = NULL;
    }
    if (is_campaign_budget_optimization) { 
    if(!cJSON_IsBool(is_campaign_budget_optimization))
    {
    goto end; //Bool
    }
    is_campaign_budget_optimization_local_var = malloc(sizeof(int));
    if(!is_campaign_budget_optimization_local_var)
    {
        goto end;
    }
    *is_campaign_budget_optimization_local_var = is_campaign_budget_optimization->valueint;
    }

    // campaign_create_request_all_of1->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "is_flexible_daily_budgets");
    if (cJSON_IsNull(is_flexible_daily_budgets)) {
        is_flexible_daily_budgets = NULL;
    }
    if (is_flexible_daily_budgets) { 
    if(!cJSON_IsBool(is_flexible_daily_budgets))
    {
    goto end; //Bool
    }
    is_flexible_daily_budgets_local_var = malloc(sizeof(int));
    if(!is_flexible_daily_budgets_local_var)
    {
        goto end;
    }
    *is_flexible_daily_budgets_local_var = is_flexible_daily_budgets->valueint;
    }

    // campaign_create_request_all_of1->is_ltv_optimized
    cJSON *is_ltv_optimized = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "is_ltv_optimized");
    if (cJSON_IsNull(is_ltv_optimized)) {
        is_ltv_optimized = NULL;
    }
    if (is_ltv_optimized) { 
    if(!cJSON_IsBool(is_ltv_optimized))
    {
    goto end; //Bool
    }
    is_ltv_optimized_local_var = malloc(sizeof(int));
    if(!is_ltv_optimized_local_var)
    {
        goto end;
    }
    *is_ltv_optimized_local_var = is_ltv_optimized->valueint;
    }

    // campaign_create_request_all_of1->is_performance_plus
    cJSON *is_performance_plus = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "is_performance_plus");
    if (cJSON_IsNull(is_performance_plus)) {
        is_performance_plus = NULL;
    }
    if (is_performance_plus) { 
    if(!cJSON_IsBool(is_performance_plus))
    {
    goto end; //Bool
    }
    is_performance_plus_local_var = malloc(sizeof(int));
    if(!is_performance_plus_local_var)
    {
        goto end;
    }
    *is_performance_plus_local_var = is_performance_plus->valueint;
    }

    // campaign_create_request_all_of1->is_top_of_search
    cJSON *is_top_of_search = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "is_top_of_search");
    if (cJSON_IsNull(is_top_of_search)) {
        is_top_of_search = NULL;
    }
    if (is_top_of_search) { 
    if(!cJSON_IsBool(is_top_of_search))
    {
    goto end; //Bool
    }
    is_top_of_search_local_var = malloc(sizeof(int));
    if(!is_top_of_search_local_var)
    {
        goto end;
    }
    *is_top_of_search_local_var = is_top_of_search->valueint;
    }

    // campaign_create_request_all_of1->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (!objective_type) {
        goto end;
    }

    
    objective_type_local_nonprim = objective_type_parseFromJSON(objective_type); //custom

    // campaign_create_request_all_of1->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_create_request_all_of1JSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }



    campaign_create_request_all_of1_local_var = campaign_create_request_all_of1_create_internal (
        bid_options ? bid_options_local_nonprim : NULL,
        intended_promotion_type ? intended_promotion_type_local_nonprim : 0,
        is_automated_campaign_local_var,
        is_campaign_budget_optimization_local_var,
        is_flexible_daily_budgets_local_var,
        is_ltv_optimized_local_var,
        is_performance_plus_local_var,
        is_top_of_search_local_var,
        objective_type_local_nonprim,
        status ? status_local_nonprim : NULL
        );

    if (!campaign_create_request_all_of1_local_var) {
        goto end;
    }

    return campaign_create_request_all_of1_local_var;
end:
    if (bid_options_local_nonprim) {
        campaign_bid_options_create_free(bid_options_local_nonprim);
        bid_options_local_nonprim = NULL;
    }
    if (intended_promotion_type_local_nonprim) {
        intended_promotion_type_local_nonprim = 0;
    }
    if (is_automated_campaign_local_var) {
        free(is_automated_campaign_local_var);
        is_automated_campaign_local_var = NULL;
    }
    if (is_campaign_budget_optimization_local_var) {
        free(is_campaign_budget_optimization_local_var);
        is_campaign_budget_optimization_local_var = NULL;
    }
    if (is_flexible_daily_budgets_local_var) {
        free(is_flexible_daily_budgets_local_var);
        is_flexible_daily_budgets_local_var = NULL;
    }
    if (is_ltv_optimized_local_var) {
        free(is_ltv_optimized_local_var);
        is_ltv_optimized_local_var = NULL;
    }
    if (is_performance_plus_local_var) {
        free(is_performance_plus_local_var);
        is_performance_plus_local_var = NULL;
    }
    if (is_top_of_search_local_var) {
        free(is_top_of_search_local_var);
        is_top_of_search_local_var = NULL;
    }
    if (objective_type_local_nonprim) {
        objective_type_local_nonprim = 0;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
