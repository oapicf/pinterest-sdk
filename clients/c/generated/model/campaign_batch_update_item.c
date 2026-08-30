#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_batch_update_item.h"



static campaign_batch_update_item_t *campaign_batch_update_item_create_internal(
    char *ad_account_id,
    char *app_id,
    mobile_app_platform_t *app_platform,
    campaign_bid_options_update_t *bid_options,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    int *lifetime_spend_cap,
    char *name,
    pinterest_rest_api_conversion_objective_type__e objective_type,
    char *order_line_id,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    int *start_time,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls
    ) {
    campaign_batch_update_item_t *campaign_batch_update_item_local_var = malloc(sizeof(campaign_batch_update_item_t));
    if (!campaign_batch_update_item_local_var) {
        return NULL;
    }
    memset(campaign_batch_update_item_local_var, 0, sizeof(campaign_batch_update_item_t));
    campaign_batch_update_item_local_var->_library_owned = 1;
    campaign_batch_update_item_local_var->ad_account_id = ad_account_id;
    campaign_batch_update_item_local_var->app_id = app_id;
    campaign_batch_update_item_local_var->app_platform = app_platform;
    campaign_batch_update_item_local_var->bid_options = bid_options;
    campaign_batch_update_item_local_var->daily_spend_cap = daily_spend_cap;
    campaign_batch_update_item_local_var->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
    campaign_batch_update_item_local_var->end_time = end_time;
    campaign_batch_update_item_local_var->id = id;
    campaign_batch_update_item_local_var->intended_promotion_type = intended_promotion_type;
    campaign_batch_update_item_local_var->is_automated_campaign = is_automated_campaign;
    campaign_batch_update_item_local_var->is_campaign_budget_optimization = is_campaign_budget_optimization;
    campaign_batch_update_item_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_batch_update_item_local_var->is_ltv_optimized = is_ltv_optimized;
    campaign_batch_update_item_local_var->is_performance_plus = is_performance_plus;
    campaign_batch_update_item_local_var->is_top_of_search = is_top_of_search;
    campaign_batch_update_item_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_batch_update_item_local_var->name = name;
    campaign_batch_update_item_local_var->objective_type = objective_type;
    campaign_batch_update_item_local_var->order_line_id = order_line_id;
    campaign_batch_update_item_local_var->performance_plus_campaign_settings = performance_plus_campaign_settings;
    campaign_batch_update_item_local_var->start_time = start_time;
    campaign_batch_update_item_local_var->status = status;
    campaign_batch_update_item_local_var->tracking_urls = tracking_urls;
    return campaign_batch_update_item_local_var;
}

__attribute__((deprecated)) campaign_batch_update_item_t *campaign_batch_update_item_create(
    char *ad_account_id,
    char *app_id,
    mobile_app_platform_t *app_platform,
    campaign_bid_options_update_t *bid_options,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    int *lifetime_spend_cap,
    char *name,
    pinterest_rest_api_conversion_objective_type__e objective_type,
    char *order_line_id,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    int *start_time,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls
    ) {
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
    campaign_batch_update_item_t *result = campaign_batch_update_item_create_internal (
        ad_account_id,
        app_id,
        app_platform,
        bid_options,
        daily_spend_cap_copy,
        default_ad_group_budget_in_micro_currency_copy,
        end_time_copy,
        id,
        intended_promotion_type,
        is_automated_campaign_copy,
        is_campaign_budget_optimization_copy,
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
        tracking_urls
        );
    if (!result) {
        free(daily_spend_cap_copy);
        free(default_ad_group_budget_in_micro_currency_copy);
        free(end_time_copy);
        free(is_automated_campaign_copy);
        free(is_campaign_budget_optimization_copy);
        free(is_flexible_daily_budgets_copy);
        free(is_ltv_optimized_copy);
        free(is_performance_plus_copy);
        free(is_top_of_search_copy);
        free(lifetime_spend_cap_copy);
        free(start_time_copy);
    }
    return result;
}

void campaign_batch_update_item_free(campaign_batch_update_item_t *campaign_batch_update_item) {
    if(NULL == campaign_batch_update_item){
        return ;
    }
    if(campaign_batch_update_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_batch_update_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_batch_update_item->ad_account_id) {
        free(campaign_batch_update_item->ad_account_id);
        campaign_batch_update_item->ad_account_id = NULL;
    }
    if (campaign_batch_update_item->app_id) {
        free(campaign_batch_update_item->app_id);
        campaign_batch_update_item->app_id = NULL;
    }
    if (campaign_batch_update_item->app_platform) {
        mobile_app_platform_free(campaign_batch_update_item->app_platform);
        campaign_batch_update_item->app_platform = NULL;
    }
    if (campaign_batch_update_item->bid_options) {
        campaign_bid_options_update_free(campaign_batch_update_item->bid_options);
        campaign_batch_update_item->bid_options = NULL;
    }
    if (campaign_batch_update_item->daily_spend_cap) {
        free(campaign_batch_update_item->daily_spend_cap);
        campaign_batch_update_item->daily_spend_cap = NULL;
    }
    if (campaign_batch_update_item->default_ad_group_budget_in_micro_currency) {
        free(campaign_batch_update_item->default_ad_group_budget_in_micro_currency);
        campaign_batch_update_item->default_ad_group_budget_in_micro_currency = NULL;
    }
    if (campaign_batch_update_item->end_time) {
        free(campaign_batch_update_item->end_time);
        campaign_batch_update_item->end_time = NULL;
    }
    if (campaign_batch_update_item->id) {
        free(campaign_batch_update_item->id);
        campaign_batch_update_item->id = NULL;
    }
    if (campaign_batch_update_item->is_automated_campaign) {
        free(campaign_batch_update_item->is_automated_campaign);
        campaign_batch_update_item->is_automated_campaign = NULL;
    }
    if (campaign_batch_update_item->is_campaign_budget_optimization) {
        free(campaign_batch_update_item->is_campaign_budget_optimization);
        campaign_batch_update_item->is_campaign_budget_optimization = NULL;
    }
    if (campaign_batch_update_item->is_flexible_daily_budgets) {
        free(campaign_batch_update_item->is_flexible_daily_budgets);
        campaign_batch_update_item->is_flexible_daily_budgets = NULL;
    }
    if (campaign_batch_update_item->is_ltv_optimized) {
        free(campaign_batch_update_item->is_ltv_optimized);
        campaign_batch_update_item->is_ltv_optimized = NULL;
    }
    if (campaign_batch_update_item->is_performance_plus) {
        free(campaign_batch_update_item->is_performance_plus);
        campaign_batch_update_item->is_performance_plus = NULL;
    }
    if (campaign_batch_update_item->is_top_of_search) {
        free(campaign_batch_update_item->is_top_of_search);
        campaign_batch_update_item->is_top_of_search = NULL;
    }
    if (campaign_batch_update_item->lifetime_spend_cap) {
        free(campaign_batch_update_item->lifetime_spend_cap);
        campaign_batch_update_item->lifetime_spend_cap = NULL;
    }
    if (campaign_batch_update_item->name) {
        free(campaign_batch_update_item->name);
        campaign_batch_update_item->name = NULL;
    }
    if (campaign_batch_update_item->order_line_id) {
        free(campaign_batch_update_item->order_line_id);
        campaign_batch_update_item->order_line_id = NULL;
    }
    if (campaign_batch_update_item->performance_plus_campaign_settings) {
        performance_plus_campaign_settings_free(campaign_batch_update_item->performance_plus_campaign_settings);
        campaign_batch_update_item->performance_plus_campaign_settings = NULL;
    }
    if (campaign_batch_update_item->start_time) {
        free(campaign_batch_update_item->start_time);
        campaign_batch_update_item->start_time = NULL;
    }
    if (campaign_batch_update_item->tracking_urls) {
        tracking_urls_free(campaign_batch_update_item->tracking_urls);
        campaign_batch_update_item->tracking_urls = NULL;
    }
    free(campaign_batch_update_item);
}

cJSON *campaign_batch_update_item_convertToJSON(campaign_batch_update_item_t *campaign_batch_update_item) {
    cJSON *item = cJSON_CreateObject();

    // campaign_batch_update_item->ad_account_id
    if(campaign_batch_update_item->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_batch_update_item->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_update_item->app_id
    if(campaign_batch_update_item->app_id) {
    if(cJSON_AddStringToObject(item, "app_id", campaign_batch_update_item->app_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_update_item->app_platform
    if(campaign_batch_update_item->app_platform) {
    cJSON *app_platform_local_JSON = mobile_app_platform_convertToJSON(campaign_batch_update_item->app_platform);
    if(app_platform_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "app_platform", app_platform_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_update_item->bid_options
    if(campaign_batch_update_item->bid_options) {
    cJSON *bid_options_local_JSON = campaign_bid_options_update_convertToJSON(campaign_batch_update_item->bid_options);
    if(bid_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bid_options", bid_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_batch_update_item->daily_spend_cap
    if(campaign_batch_update_item->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", *campaign_batch_update_item->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_update_item->default_ad_group_budget_in_micro_currency
    if(campaign_batch_update_item->default_ad_group_budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "default_ad_group_budget_in_micro_currency", *campaign_batch_update_item->default_ad_group_budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_update_item->end_time
    if(campaign_batch_update_item->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", *campaign_batch_update_item->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_update_item->id
    if (!campaign_batch_update_item->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", campaign_batch_update_item->id) == NULL) {
    goto fail; //String
    }


    // campaign_batch_update_item->intended_promotion_type
    if(campaign_batch_update_item->intended_promotion_type != pinterest_rest_api_intended_promotion_type__NULL) {
    cJSON *intended_promotion_type_local_JSON = intended_promotion_type_convertToJSON(campaign_batch_update_item->intended_promotion_type);
    if(intended_promotion_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "intended_promotion_type", intended_promotion_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_update_item->is_automated_campaign
    if(campaign_batch_update_item->is_automated_campaign) {
    if(cJSON_AddBoolToObject(item, "is_automated_campaign", *campaign_batch_update_item->is_automated_campaign) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_update_item->is_campaign_budget_optimization
    if(campaign_batch_update_item->is_campaign_budget_optimization) {
    if(cJSON_AddBoolToObject(item, "is_campaign_budget_optimization", *campaign_batch_update_item->is_campaign_budget_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_update_item->is_flexible_daily_budgets
    if(campaign_batch_update_item->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", *campaign_batch_update_item->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_update_item->is_ltv_optimized
    if(campaign_batch_update_item->is_ltv_optimized) {
    if(cJSON_AddBoolToObject(item, "is_ltv_optimized", *campaign_batch_update_item->is_ltv_optimized) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_update_item->is_performance_plus
    if(campaign_batch_update_item->is_performance_plus) {
    if(cJSON_AddBoolToObject(item, "is_performance_plus", *campaign_batch_update_item->is_performance_plus) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_update_item->is_top_of_search
    if(campaign_batch_update_item->is_top_of_search) {
    if(cJSON_AddBoolToObject(item, "is_top_of_search", *campaign_batch_update_item->is_top_of_search) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_batch_update_item->lifetime_spend_cap
    if(campaign_batch_update_item->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", *campaign_batch_update_item->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_update_item->name
    if(campaign_batch_update_item->name) {
    if(cJSON_AddStringToObject(item, "name", campaign_batch_update_item->name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_update_item->objective_type
    if(campaign_batch_update_item->objective_type != pinterest_rest_api_conversion_objective_type__NULL) {
    cJSON *objective_type_local_JSON = conversion_objective_type_convertToJSON(campaign_batch_update_item->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_update_item->order_line_id
    if(campaign_batch_update_item->order_line_id) {
    if(cJSON_AddStringToObject(item, "order_line_id", campaign_batch_update_item->order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_batch_update_item->performance_plus_campaign_settings
    if(campaign_batch_update_item->performance_plus_campaign_settings) {
    cJSON *performance_plus_campaign_settings_local_JSON = performance_plus_campaign_settings_convertToJSON(campaign_batch_update_item->performance_plus_campaign_settings);
    if(performance_plus_campaign_settings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "performance_plus_campaign_settings", performance_plus_campaign_settings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_batch_update_item->start_time
    if(campaign_batch_update_item->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", *campaign_batch_update_item->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_batch_update_item->status
    if(campaign_batch_update_item->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(campaign_batch_update_item->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_batch_update_item->tracking_urls
    if(campaign_batch_update_item->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(campaign_batch_update_item->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
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

campaign_batch_update_item_t *campaign_batch_update_item_parseFromJSON(cJSON *campaign_batch_update_itemJSON){

    campaign_batch_update_item_t *campaign_batch_update_item_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    char *app_id_local_str = NULL;

    // define the local variable for campaign_batch_update_item->app_platform
    mobile_app_platform_t *app_platform_local_nonprim = NULL;

    // define the local variable for campaign_batch_update_item->bid_options
    campaign_bid_options_update_t *bid_options_local_nonprim = NULL;

    // define the local variable for campaign_batch_update_item->daily_spend_cap
    int *daily_spend_cap_local_var = NULL;

    // define the local variable for campaign_batch_update_item->default_ad_group_budget_in_micro_currency
    int *default_ad_group_budget_in_micro_currency_local_var = NULL;

    // define the local variable for campaign_batch_update_item->end_time
    int *end_time_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for campaign_batch_update_item->intended_promotion_type
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type_local_nonprim = 0;

    // define the local variable for campaign_batch_update_item->is_automated_campaign
    int *is_automated_campaign_local_var = NULL;

    // define the local variable for campaign_batch_update_item->is_campaign_budget_optimization
    int *is_campaign_budget_optimization_local_var = NULL;

    // define the local variable for campaign_batch_update_item->is_flexible_daily_budgets
    int *is_flexible_daily_budgets_local_var = NULL;

    // define the local variable for campaign_batch_update_item->is_ltv_optimized
    int *is_ltv_optimized_local_var = NULL;

    // define the local variable for campaign_batch_update_item->is_performance_plus
    int *is_performance_plus_local_var = NULL;

    // define the local variable for campaign_batch_update_item->is_top_of_search
    int *is_top_of_search_local_var = NULL;

    // define the local variable for campaign_batch_update_item->lifetime_spend_cap
    int *lifetime_spend_cap_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for campaign_batch_update_item->objective_type
    pinterest_rest_api_conversion_objective_type__e objective_type_local_nonprim = 0;

    char *order_line_id_local_str = NULL;

    // define the local variable for campaign_batch_update_item->performance_plus_campaign_settings
    performance_plus_campaign_settings_t *performance_plus_campaign_settings_local_nonprim = NULL;

    // define the local variable for campaign_batch_update_item->start_time
    int *start_time_local_var = NULL;

    // define the local variable for campaign_batch_update_item->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // define the local variable for campaign_batch_update_item->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // campaign_batch_update_item->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // campaign_batch_update_item->app_id
    cJSON *app_id = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "app_id");
    if (cJSON_IsNull(app_id)) {
        app_id = NULL;
    }
    if (app_id) { 
    if(!cJSON_IsString(app_id) && !cJSON_IsNull(app_id))
    {
    goto end; //String
    }
    }

    // campaign_batch_update_item->app_platform
    cJSON *app_platform = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "app_platform");
    if (cJSON_IsNull(app_platform)) {
        app_platform = NULL;
    }
    if (app_platform) { 
    app_platform_local_nonprim = mobile_app_platform_parseFromJSON(app_platform); //custom
    }

    // campaign_batch_update_item->bid_options
    cJSON *bid_options = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "bid_options");
    if (cJSON_IsNull(bid_options)) {
        bid_options = NULL;
    }
    if (bid_options) { 
    bid_options_local_nonprim = campaign_bid_options_update_parseFromJSON(bid_options); //nonprimitive
    }

    // campaign_batch_update_item->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "daily_spend_cap");
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

    // campaign_batch_update_item->default_ad_group_budget_in_micro_currency
    cJSON *default_ad_group_budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "default_ad_group_budget_in_micro_currency");
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

    // campaign_batch_update_item->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "end_time");
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

    // campaign_batch_update_item->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // campaign_batch_update_item->intended_promotion_type
    cJSON *intended_promotion_type = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "intended_promotion_type");
    if (cJSON_IsNull(intended_promotion_type)) {
        intended_promotion_type = NULL;
    }
    if (intended_promotion_type) { 
    intended_promotion_type_local_nonprim = intended_promotion_type_parseFromJSON(intended_promotion_type); //custom
    }

    // campaign_batch_update_item->is_automated_campaign
    cJSON *is_automated_campaign = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "is_automated_campaign");
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

    // campaign_batch_update_item->is_campaign_budget_optimization
    cJSON *is_campaign_budget_optimization = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "is_campaign_budget_optimization");
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

    // campaign_batch_update_item->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "is_flexible_daily_budgets");
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

    // campaign_batch_update_item->is_ltv_optimized
    cJSON *is_ltv_optimized = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "is_ltv_optimized");
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

    // campaign_batch_update_item->is_performance_plus
    cJSON *is_performance_plus = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "is_performance_plus");
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

    // campaign_batch_update_item->is_top_of_search
    cJSON *is_top_of_search = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "is_top_of_search");
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

    // campaign_batch_update_item->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "lifetime_spend_cap");
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

    // campaign_batch_update_item->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // campaign_batch_update_item->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    objective_type_local_nonprim = conversion_objective_type_parseFromJSON(objective_type); //custom
    }

    // campaign_batch_update_item->order_line_id
    cJSON *order_line_id = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "order_line_id");
    if (cJSON_IsNull(order_line_id)) {
        order_line_id = NULL;
    }
    if (order_line_id) { 
    if(!cJSON_IsString(order_line_id) && !cJSON_IsNull(order_line_id))
    {
    goto end; //String
    }
    }

    // campaign_batch_update_item->performance_plus_campaign_settings
    cJSON *performance_plus_campaign_settings = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "performance_plus_campaign_settings");
    if (cJSON_IsNull(performance_plus_campaign_settings)) {
        performance_plus_campaign_settings = NULL;
    }
    if (performance_plus_campaign_settings) { 
    performance_plus_campaign_settings_local_nonprim = performance_plus_campaign_settings_parseFromJSON(performance_plus_campaign_settings); //nonprimitive
    }

    // campaign_batch_update_item->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "start_time");
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

    // campaign_batch_update_item->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // campaign_batch_update_item->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(campaign_batch_update_itemJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (app_id && !cJSON_IsNull(app_id)) app_id_local_str = strdup(app_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (order_line_id && !cJSON_IsNull(order_line_id)) order_line_id_local_str = strdup(order_line_id->valuestring);

    campaign_batch_update_item_local_var = campaign_batch_update_item_create_internal (
        ad_account_id_local_str,
        app_id_local_str,
        app_platform ? app_platform_local_nonprim : NULL,
        bid_options ? bid_options_local_nonprim : NULL,
        daily_spend_cap_local_var,
        default_ad_group_budget_in_micro_currency_local_var,
        end_time_local_var,
        id_local_str,
        intended_promotion_type ? intended_promotion_type_local_nonprim : 0,
        is_automated_campaign_local_var,
        is_campaign_budget_optimization_local_var,
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
        status ? status_local_nonprim : 0,
        tracking_urls ? tracking_urls_local_nonprim : NULL
        );

    if (!campaign_batch_update_item_local_var) {
        goto end;
    }

    return campaign_batch_update_item_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (app_id_local_str) {
        free(app_id_local_str);
        app_id_local_str = NULL;
    }
    if (app_platform_local_nonprim) {
        mobile_app_platform_free(app_platform_local_nonprim);
        app_platform_local_nonprim = NULL;
    }
    if (bid_options_local_nonprim) {
        campaign_bid_options_update_free(bid_options_local_nonprim);
        bid_options_local_nonprim = NULL;
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
        status_local_nonprim = 0;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    return NULL;

}
