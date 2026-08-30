#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_batch_response_data.h"



static campaign_batch_response_data_t *campaign_batch_response_data_create_internal(
    char *ad_account_id,
    campaign_bid_options_t *bid_options,
    int *created_time,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_carting,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    int *lifetime_spend_cap,
    char *name,
    pinterest_rest_api_campaign_objective_type__e objective_type,
    char *order_line_id,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    int *start_time,
    nullable_entity_status_t *status,
    summary_status_t *summary_status,
    tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time
    ) {
    campaign_batch_response_data_t *campaign_batch_response_data_local_var = malloc(sizeof(campaign_batch_response_data_t));
    if (!campaign_batch_response_data_local_var) {
        return NULL;
    }
    memset(campaign_batch_response_data_local_var, 0, sizeof(campaign_batch_response_data_t));
    campaign_batch_response_data_local_var->_library_owned = 1;
    campaign_batch_response_data_local_var->ad_account_id = ad_account_id;
    campaign_batch_response_data_local_var->bid_options = bid_options;
    campaign_batch_response_data_local_var->created_time = created_time;
    campaign_batch_response_data_local_var->daily_spend_cap = daily_spend_cap;
    campaign_batch_response_data_local_var->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
    campaign_batch_response_data_local_var->end_time = end_time;
    campaign_batch_response_data_local_var->id = id;
    campaign_batch_response_data_local_var->intended_promotion_type = intended_promotion_type;
    campaign_batch_response_data_local_var->is_automated_campaign = is_automated_campaign;
    campaign_batch_response_data_local_var->is_campaign_budget_optimization = is_campaign_budget_optimization;
    campaign_batch_response_data_local_var->is_carting = is_carting;
    campaign_batch_response_data_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_batch_response_data_local_var->is_ltv_optimized = is_ltv_optimized;
    campaign_batch_response_data_local_var->is_performance_plus = is_performance_plus;
    campaign_batch_response_data_local_var->is_top_of_search = is_top_of_search;
    campaign_batch_response_data_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_batch_response_data_local_var->name = name;
    campaign_batch_response_data_local_var->objective_type = objective_type;
    campaign_batch_response_data_local_var->order_line_id = order_line_id;
    campaign_batch_response_data_local_var->performance_plus_campaign_settings = performance_plus_campaign_settings;
    campaign_batch_response_data_local_var->start_time = start_time;
    campaign_batch_response_data_local_var->status = status;
    campaign_batch_response_data_local_var->summary_status = summary_status;
    campaign_batch_response_data_local_var->tracking_urls = tracking_urls;
    campaign_batch_response_data_local_var->type = type;
    campaign_batch_response_data_local_var->updated_time = updated_time;
    return campaign_batch_response_data_local_var;
}

__attribute__((deprecated)) campaign_batch_response_data_t *campaign_batch_response_data_create(
    char *ad_account_id,
    campaign_bid_options_t *bid_options,
    int *created_time,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_carting,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    int *lifetime_spend_cap,
    char *name,
    pinterest_rest_api_campaign_objective_type__e objective_type,
    char *order_line_id,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    int *start_time,
    nullable_entity_status_t *status,
    summary_status_t *summary_status,
    tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time
    ) {
    int *created_time_copy = NULL;
    if (created_time) {
        created_time_copy = malloc(sizeof(int));
        if (created_time_copy) *created_time_copy = *created_time;
    }
    int *daily_spend_cap_copy = NULL;
    if (daily_spend_cap) {
        daily_spend_cap_copy = malloc(sizeof(int));
        if (daily_spend_cap_copy) *daily_spend_cap_copy = *daily_spend_cap;
    }
    int *default_ad_group_budget_in_micro_currency_copy = NULL;
    if (default_ad_group_budget_in_micro_currency) {
        default_ad_group_budget_in_micro_currency_copy = malloc(sizeof(int));
        if (default_ad_group_budget_in_micro_currency_copy) *default_ad_group_budget_in_micro_currency_copy = *default_ad_group_budget_in_micro_currency;
    }
    int *end_time_copy = NULL;
    if (end_time) {
        end_time_copy = malloc(sizeof(int));
        if (end_time_copy) *end_time_copy = *end_time;
    }
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
    int *is_carting_copy = NULL;
    if (is_carting) {
        is_carting_copy = malloc(sizeof(int));
        if (is_carting_copy) *is_carting_copy = *is_carting;
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
    int *lifetime_spend_cap_copy = NULL;
    if (lifetime_spend_cap) {
        lifetime_spend_cap_copy = malloc(sizeof(int));
        if (lifetime_spend_cap_copy) *lifetime_spend_cap_copy = *lifetime_spend_cap;
    }
    int *start_time_copy = NULL;
    if (start_time) {
        start_time_copy = malloc(sizeof(int));
        if (start_time_copy) *start_time_copy = *start_time;
    }
    int *updated_time_copy = NULL;
    if (updated_time) {
        updated_time_copy = malloc(sizeof(int));
        if (updated_time_copy) *updated_time_copy = *updated_time;
    }
    campaign_batch_response_data_t *result = campaign_batch_response_data_create_internal (
        ad_account_id,
        bid_options,
        created_time_copy,
        daily_spend_cap_copy,
        default_ad_group_budget_in_micro_currency_copy,
        end_time_copy,
        id,
        intended_promotion_type,
        is_automated_campaign_copy,
        is_campaign_budget_optimization_copy,
        is_carting_copy,
        is_flexible_daily_budgets_copy,
        is_ltv_optimized_copy,
        is_performance_plus_copy,
        is_top_of_search_copy,
        lifetime_spend_cap_copy,
        name,
        objective_type,
        order_line_id,
        performance_plus_campaign_settings,
        start_time_copy,
        status,
        summary_status,
        tracking_urls,
        type,
        updated_time_copy
        );
    if (!result) {
        free(created_time_copy);
        free(daily_spend_cap_copy);
        free(default_ad_group_budget_in_micro_currency_copy);
        free(end_time_copy);
        free(is_automated_campaign_copy);
        free(is_campaign_budget_optimization_copy);
        free(is_carting_copy);
        free(is_flexible_daily_budgets_copy);
        free(is_ltv_optimized_copy);
        free(is_performance_plus_copy);
        free(is_top_of_search_copy);
        free(lifetime_spend_cap_copy);
        free(start_time_copy);
        free(updated_time_copy);
    }
    return result;
}

void campaign_batch_response_data_free(campaign_batch_response_data_t *campaign_batch_response_data) {
    if(NULL == campaign_batch_response_data){
        return ;
    }
    if(campaign_batch_response_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_batch_response_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_batch_response_data->ad_account_id) {
        free(campaign_batch_response_data->ad_account_id);
        campaign_batch_response_data->ad_account_id = NULL;
    }
    if (campaign_batch_response_data->bid_options) {
        campaign_bid_options_free(campaign_batch_response_data->bid_options);
        campaign_batch_response_data->bid_options = NULL;
    }
    if (campaign_batch_response_data->created_time) {
        free(campaign_batch_response_data->created_time);
        campaign_batch_response_data->created_time = NULL;
    }
    if (campaign_batch_response_data->daily_spend_cap) {
        free(campaign_batch_response_data->daily_spend_cap);
        campaign_batch_response_data->daily_spend_cap = NULL;
    }
    if (campaign_batch_response_data->default_ad_group_budget_in_micro_currency) {
        free(campaign_batch_response_data->default_ad_group_budget_in_micro_currency);
        campaign_batch_response_data->default_ad_group_budget_in_micro_currency = NULL;
    }
    if (campaign_batch_response_data->end_time) {
        free(campaign_batch_response_data->end_time);
        campaign_batch_response_data->end_time = NULL;
    }
    if (campaign_batch_response_data->id) {
        free(campaign_batch_response_data->id);
        campaign_batch_response_data->id = NULL;
    }
    if (campaign_batch_response_data->is_automated_campaign) {
        free(campaign_batch_response_data->is_automated_campaign);
        campaign_batch_response_data->is_automated_campaign = NULL;
    }
    if (campaign_batch_response_data->is_campaign_budget_optimization) {
        free(campaign_batch_response_data->is_campaign_budget_optimization);
        campaign_batch_response_data->is_campaign_budget_optimization = NULL;
    }
    if (campaign_batch_response_data->is_carting) {
        free(campaign_batch_response_data->is_carting);
        campaign_batch_response_data->is_carting = NULL;
    }
    if (campaign_batch_response_data->is_flexible_daily_budgets) {
        free(campaign_batch_response_data->is_flexible_daily_budgets);
        campaign_batch_response_data->is_flexible_daily_budgets = NULL;
    }
    if (campaign_batch_response_data->is_ltv_optimized) {
        free(campaign_batch_response_data->is_ltv_optimized);
        campaign_batch_response_data->is_ltv_optimized = NULL;
    }
    if (campaign_batch_response_data->is_performance_plus) {
        free(campaign_batch_response_data->is_performance_plus);
        campaign_batch_response_data->is_performance_plus = NULL;
    }
    if (campaign_batch_response_data->is_top_of_search) {
        free(campaign_batch_response_data->is_top_of_search);
        campaign_batch_response_data->is_top_of_search = NULL;
    }
    if (campaign_batch_response_data->lifetime_spend_cap) {
        free(campaign_batch_response_data->lifetime_spend_cap);
        campaign_batch_response_data->lifetime_spend_cap = NULL;
    }
    if (campaign_batch_response_data->name) {
        free(campaign_batch_response_data->name);
        campaign_batch_response_data->name = NULL;
    }
    if (campaign_batch_response_data->order_line_id) {
        free(campaign_batch_response_data->order_line_id);
        campaign_batch_response_data->order_line_id = NULL;
    }
    if (campaign_batch_response_data->performance_plus_campaign_settings) {
        performance_plus_campaign_settings_free(campaign_batch_response_data->performance_plus_campaign_settings);
        campaign_batch_response_data->performance_plus_campaign_settings = NULL;
    }
    if (campaign_batch_response_data->start_time) {
        free(campaign_batch_response_data->start_time);
        campaign_batch_response_data->start_time = NULL;
    }
    if (campaign_batch_response_data->status) {
        nullable_entity_status_free(campaign_batch_response_data->status);
        campaign_batch_response_data->status = NULL;
    }
    if (campaign_batch_response_data->summary_status) {
        summary_status_free(campaign_batch_response_data->summary_status);
        campaign_batch_response_data->summary_status = NULL;
    }
    if (campaign_batch_response_data->tracking_urls) {
        tracking_urls_free(campaign_batch_response_data->tracking_urls);
        campaign_batch_response_data->tracking_urls = NULL;
    }
    if (campaign_batch_response_data->type) {
        free(campaign_batch_response_data->type);
        campaign_batch_response_data->type = NULL;
    }
    if (campaign_batch_response_data->updated_time) {
        free(campaign_batch_response_data->updated_time);
        campaign_batch_response_data->updated_time = NULL;
    }
    free(campaign_batch_response_data);
}

cJSON *campaign_batch_response_data_convertToJSON(campaign_batch_response_data_t *campaign_batch_response_data) {
    cJSON *item = cJSON_CreateObject();

    // campaign_batch_response_data->ad_account_id
    if(campaign_batch_response_data->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_batch_response_data->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_response_data->bid_options
    if(campaign_batch_response_data->bid_options) {
    cJSON *bid_options_local_JSON = campaign_bid_options_convertToJSON(campaign_batch_response_data->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_batch_response_data->created_time
    if(campaign_batch_response_data->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", *campaign_batch_response_data->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_response_data->daily_spend_cap
    if(campaign_batch_response_data->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", *campaign_batch_response_data->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_response_data->default_ad_group_budget_in_micro_currency
    if(campaign_batch_response_data->default_ad_group_budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "default_ad_group_budget_in_micro_currency", *campaign_batch_response_data->default_ad_group_budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_response_data->end_time
    if(campaign_batch_response_data->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", *campaign_batch_response_data->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_response_data->id
    if(campaign_batch_response_data->id) {
    if(cJSON_AddStringToObject(item, "id", campaign_batch_response_data->id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_response_data->intended_promotion_type
    if(campaign_batch_response_data->intended_promotion_type != pinterest_rest_api_intended_promotion_type__NULL) {
    cJSON *intended_promotion_type_local_JSON = intended_promotion_type_convertToJSON(campaign_batch_response_data->intended_promotion_type);
    if(intended_promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "intended_promotion_type", intended_promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_response_data->is_automated_campaign
    if(campaign_batch_response_data->is_automated_campaign) {
    if(cJSON_AddBoolToObject(item, "is_automated_campaign", *campaign_batch_response_data->is_automated_campaign) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->is_campaign_budget_optimization
    if(campaign_batch_response_data->is_campaign_budget_optimization) {
    if(cJSON_AddBoolToObject(item, "is_campaign_budget_optimization", *campaign_batch_response_data->is_campaign_budget_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->is_carting
    if(campaign_batch_response_data->is_carting) {
    if(cJSON_AddBoolToObject(item, "is_carting", *campaign_batch_response_data->is_carting) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->is_flexible_daily_budgets
    if(campaign_batch_response_data->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", *campaign_batch_response_data->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->is_ltv_optimized
    if(campaign_batch_response_data->is_ltv_optimized) {
    if(cJSON_AddBoolToObject(item, "is_ltv_optimized", *campaign_batch_response_data->is_ltv_optimized) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->is_performance_plus
    if(campaign_batch_response_data->is_performance_plus) {
    if(cJSON_AddBoolToObject(item, "is_performance_plus", *campaign_batch_response_data->is_performance_plus) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->is_top_of_search
    if(campaign_batch_response_data->is_top_of_search) {
    if(cJSON_AddBoolToObject(item, "is_top_of_search", *campaign_batch_response_data->is_top_of_search) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_response_data->lifetime_spend_cap
    if(campaign_batch_response_data->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", *campaign_batch_response_data->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_response_data->name
    if(campaign_batch_response_data->name) {
    if(cJSON_AddStringToObject(item, "name", campaign_batch_response_data->name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_response_data->objective_type
    if(campaign_batch_response_data->objective_type != pinterest_rest_api_campaign_objective_type__NULL) {
    cJSON *objective_type_local_JSON = campaign_objective_type_convertToJSON(campaign_batch_response_data->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_response_data->order_line_id
    if(campaign_batch_response_data->order_line_id) {
    if(cJSON_AddStringToObject(item, "order_line_id", campaign_batch_response_data->order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_response_data->performance_plus_campaign_settings
    if(campaign_batch_response_data->performance_plus_campaign_settings) {
    cJSON *performance_plus_campaign_settings_local_JSON = performance_plus_campaign_settings_convertToJSON(campaign_batch_response_data->performance_plus_campaign_settings);
    if(performance_plus_campaign_settings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "performance_plus_campaign_settings", performance_plus_campaign_settings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_batch_response_data->start_time
    if(campaign_batch_response_data->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", *campaign_batch_response_data->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_response_data->status
    if(campaign_batch_response_data->status) {
    cJSON *status_local_JSON = nullable_entity_status_convertToJSON(campaign_batch_response_data->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_response_data->summary_status
    if(campaign_batch_response_data->summary_status) {
    cJSON *summary_status_local_JSON = summary_status_convertToJSON(campaign_batch_response_data->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_response_data->tracking_urls
    if(campaign_batch_response_data->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(campaign_batch_response_data->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_batch_response_data->type
    if(campaign_batch_response_data->type) {
    if(cJSON_AddStringToObject(item, "type", campaign_batch_response_data->type) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_response_data->updated_time
    if(campaign_batch_response_data->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", *campaign_batch_response_data->updated_time) == NULL) {
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

campaign_batch_response_data_t *campaign_batch_response_data_parseFromJSON(cJSON *campaign_batch_response_dataJSON){

    campaign_batch_response_data_t *campaign_batch_response_data_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for campaign_batch_response_data->bid_options
    campaign_bid_options_t *bid_options_local_nonprim = NULL;

    // define the local variable for campaign_batch_response_data->created_time
    int *created_time_local_var = NULL;

    // define the local variable for campaign_batch_response_data->daily_spend_cap
    int *daily_spend_cap_local_var = NULL;

    // define the local variable for campaign_batch_response_data->default_ad_group_budget_in_micro_currency
    int *default_ad_group_budget_in_micro_currency_local_var = NULL;

    // define the local variable for campaign_batch_response_data->end_time
    int *end_time_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for campaign_batch_response_data->intended_promotion_type
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type_local_nonprim = 0;

    // define the local variable for campaign_batch_response_data->is_automated_campaign
    int *is_automated_campaign_local_var = NULL;

    // define the local variable for campaign_batch_response_data->is_campaign_budget_optimization
    int *is_campaign_budget_optimization_local_var = NULL;

    // define the local variable for campaign_batch_response_data->is_carting
    int *is_carting_local_var = NULL;

    // define the local variable for campaign_batch_response_data->is_flexible_daily_budgets
    int *is_flexible_daily_budgets_local_var = NULL;

    // define the local variable for campaign_batch_response_data->is_ltv_optimized
    int *is_ltv_optimized_local_var = NULL;

    // define the local variable for campaign_batch_response_data->is_performance_plus
    int *is_performance_plus_local_var = NULL;

    // define the local variable for campaign_batch_response_data->is_top_of_search
    int *is_top_of_search_local_var = NULL;

    // define the local variable for campaign_batch_response_data->lifetime_spend_cap
    int *lifetime_spend_cap_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for campaign_batch_response_data->objective_type
    pinterest_rest_api_campaign_objective_type__e objective_type_local_nonprim = 0;

    char *order_line_id_local_str = NULL;

    // define the local variable for campaign_batch_response_data->performance_plus_campaign_settings
    performance_plus_campaign_settings_t *performance_plus_campaign_settings_local_nonprim = NULL;

    // define the local variable for campaign_batch_response_data->start_time
    int *start_time_local_var = NULL;

    // define the local variable for campaign_batch_response_data->status
    nullable_entity_status_t *status_local_nonprim = NULL;

    // define the local variable for campaign_batch_response_data->summary_status
    summary_status_t *summary_status_local_nonprim = NULL;

    // define the local variable for campaign_batch_response_data->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    char *type_local_str = NULL;

    // define the local variable for campaign_batch_response_data->updated_time
    int *updated_time_local_var = NULL;

    // campaign_batch_response_data->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // campaign_batch_response_data->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "bid_options");
    if (cJSON_IsNull(bid_options)) {
        bid_options = NULL;
    }
    if (bid_options) { 
    bid_options_local_nonprim = campaign_bid_options_parseFromJSON(bid_options); //nonprimitive
    }

    // campaign_batch_response_data->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    created_time_local_var = malloc(sizeof(int));
    if(!created_time_local_var)
    {
        goto end;
    }
    *created_time_local_var = created_time->valuedouble;
    }

    // campaign_batch_response_data->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "daily_spend_cap");
    if (cJSON_IsNull(daily_spend_cap)) {
        daily_spend_cap = NULL;
    }
    if (daily_spend_cap) { 
    if(!cJSON_IsNumber(daily_spend_cap))
    {
    goto end; //Numeric
    }
    daily_spend_cap_local_var = malloc(sizeof(int));
    if(!daily_spend_cap_local_var)
    {
        goto end;
    }
    *daily_spend_cap_local_var = daily_spend_cap->valuedouble;
    }

    // campaign_batch_response_data->default_ad_group_budget_in_micro_currency
    cJSON *default_ad_group_budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "default_ad_group_budget_in_micro_currency");
    if (cJSON_IsNull(default_ad_group_budget_in_micro_currency)) {
        default_ad_group_budget_in_micro_currency = NULL;
    }
    if (default_ad_group_budget_in_micro_currency) { 
    if(!cJSON_IsNumber(default_ad_group_budget_in_micro_currency))
    {
    goto end; //Numeric
    }
    default_ad_group_budget_in_micro_currency_local_var = malloc(sizeof(int));
    if(!default_ad_group_budget_in_micro_currency_local_var)
    {
        goto end;
    }
    *default_ad_group_budget_in_micro_currency_local_var = default_ad_group_budget_in_micro_currency->valuedouble;
    }

    // campaign_batch_response_data->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    end_time_local_var = malloc(sizeof(int));
    if(!end_time_local_var)
    {
        goto end;
    }
    *end_time_local_var = end_time->valuedouble;
    }

    // campaign_batch_response_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // campaign_batch_response_data->intended_promotion_type
    cJSON *intended_promotion_type = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "intended_promotion_type");
    if (cJSON_IsNull(intended_promotion_type)) {
        intended_promotion_type = NULL;
    }
    if (intended_promotion_type) { 
    intended_promotion_type_local_nonprim = intended_promotion_type_parseFromJSON(intended_promotion_type); //custom
    }

    // campaign_batch_response_data->is_automated_campaign
    cJSON *is_automated_campaign = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_automated_campaign");
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

    // campaign_batch_response_data->is_campaign_budget_optimization
    cJSON *is_campaign_budget_optimization = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_campaign_budget_optimization");
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

    // campaign_batch_response_data->is_carting
    cJSON *is_carting = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_carting");
    if (cJSON_IsNull(is_carting)) {
        is_carting = NULL;
    }
    if (is_carting) { 
    if(!cJSON_IsBool(is_carting))
    {
    goto end; //Bool
    }
    is_carting_local_var = malloc(sizeof(int));
    if(!is_carting_local_var)
    {
        goto end;
    }
    *is_carting_local_var = is_carting->valueint;
    }

    // campaign_batch_response_data->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_flexible_daily_budgets");
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

    // campaign_batch_response_data->is_ltv_optimized
    cJSON *is_ltv_optimized = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_ltv_optimized");
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

    // campaign_batch_response_data->is_performance_plus
    cJSON *is_performance_plus = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_performance_plus");
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

    // campaign_batch_response_data->is_top_of_search
    cJSON *is_top_of_search = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "is_top_of_search");
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

    // campaign_batch_response_data->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "lifetime_spend_cap");
    if (cJSON_IsNull(lifetime_spend_cap)) {
        lifetime_spend_cap = NULL;
    }
    if (lifetime_spend_cap) { 
    if(!cJSON_IsNumber(lifetime_spend_cap))
    {
    goto end; //Numeric
    }
    lifetime_spend_cap_local_var = malloc(sizeof(int));
    if(!lifetime_spend_cap_local_var)
    {
        goto end;
    }
    *lifetime_spend_cap_local_var = lifetime_spend_cap->valuedouble;
    }

    // campaign_batch_response_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // campaign_batch_response_data->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    objective_type_local_nonprim = campaign_objective_type_parseFromJSON(objective_type); //custom
    }

    // campaign_batch_response_data->order_line_id
    cJSON *order_line_id = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "order_line_id");
    if (cJSON_IsNull(order_line_id)) {
        order_line_id = NULL;
    }
    if (order_line_id) { 
    if(!cJSON_IsString(order_line_id) && !cJSON_IsNull(order_line_id))
    {
    goto end; //String
    }
    }

    // campaign_batch_response_data->performance_plus_campaign_settings
    cJSON *performance_plus_campaign_settings = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "performance_plus_campaign_settings");
    if (cJSON_IsNull(performance_plus_campaign_settings)) {
        performance_plus_campaign_settings = NULL;
    }
    if (performance_plus_campaign_settings) { 
    performance_plus_campaign_settings_local_nonprim = performance_plus_campaign_settings_parseFromJSON(performance_plus_campaign_settings); //nonprimitive
    }

    // campaign_batch_response_data->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    start_time_local_var = malloc(sizeof(int));
    if(!start_time_local_var)
    {
        goto end;
    }
    *start_time_local_var = start_time->valuedouble;
    }

    // campaign_batch_response_data->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = nullable_entity_status_parseFromJSON(status); //custom
    }

    // campaign_batch_response_data->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "summary_status");
    if (cJSON_IsNull(summary_status)) {
        summary_status = NULL;
    }
    if (summary_status) { 
    summary_status_local_nonprim = summary_status_parseFromJSON(summary_status); //custom
    }

    // campaign_batch_response_data->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // campaign_batch_response_data->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // campaign_batch_response_data->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(campaign_batch_response_dataJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    updated_time_local_var = malloc(sizeof(int));
    if(!updated_time_local_var)
    {
        goto end;
    }
    *updated_time_local_var = updated_time->valuedouble;
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (order_line_id && !cJSON_IsNull(order_line_id)) order_line_id_local_str = strdup(order_line_id->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    campaign_batch_response_data_local_var = campaign_batch_response_data_create_internal (
        ad_account_id_local_str,
        bid_options ? bid_options_local_nonprim : NULL,
        created_time_local_var,
        daily_spend_cap_local_var,
        default_ad_group_budget_in_micro_currency_local_var,
        end_time_local_var,
        id_local_str,
        intended_promotion_type ? intended_promotion_type_local_nonprim : 0,
        is_automated_campaign_local_var,
        is_campaign_budget_optimization_local_var,
        is_carting_local_var,
        is_flexible_daily_budgets_local_var,
        is_ltv_optimized_local_var,
        is_performance_plus_local_var,
        is_top_of_search_local_var,
        lifetime_spend_cap_local_var,
        name_local_str,
        objective_type ? objective_type_local_nonprim : 0,
        order_line_id_local_str,
        performance_plus_campaign_settings ? performance_plus_campaign_settings_local_nonprim : NULL,
        start_time_local_var,
        status ? status_local_nonprim : NULL,
        summary_status ? summary_status_local_nonprim : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        type_local_str,
        updated_time_local_var
        );

    if (!campaign_batch_response_data_local_var) {
        goto end;
    }

    return campaign_batch_response_data_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (bid_options_local_nonprim) {
        campaign_bid_options_free(bid_options_local_nonprim);
        bid_options_local_nonprim = NULL;
    }
    if (created_time_local_var) {
        free(created_time_local_var);
        created_time_local_var = NULL;
    }
    if (daily_spend_cap_local_var) {
        free(daily_spend_cap_local_var);
        daily_spend_cap_local_var = NULL;
    }
    if (default_ad_group_budget_in_micro_currency_local_var) {
        free(default_ad_group_budget_in_micro_currency_local_var);
        default_ad_group_budget_in_micro_currency_local_var = NULL;
    }
    if (end_time_local_var) {
        free(end_time_local_var);
        end_time_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
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
    if (is_carting_local_var) {
        free(is_carting_local_var);
        is_carting_local_var = NULL;
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
    if (lifetime_spend_cap_local_var) {
        free(lifetime_spend_cap_local_var);
        lifetime_spend_cap_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (objective_type_local_nonprim) {
        objective_type_local_nonprim = 0;
    }
    if (order_line_id_local_str) {
        free(order_line_id_local_str);
        order_line_id_local_str = NULL;
    }
    if (performance_plus_campaign_settings_local_nonprim) {
        performance_plus_campaign_settings_free(performance_plus_campaign_settings_local_nonprim);
        performance_plus_campaign_settings_local_nonprim = NULL;
    }
    if (start_time_local_var) {
        free(start_time_local_var);
        start_time_local_var = NULL;
    }
    if (status_local_nonprim) {
        nullable_entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (summary_status_local_nonprim) {
        summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (updated_time_local_var) {
        free(updated_time_local_var);
        updated_time_local_var = NULL;
    }
    return NULL;

}
