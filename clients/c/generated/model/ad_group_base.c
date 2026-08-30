#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_base.h"



static ad_group_base_t *ad_group_base_create_internal(
    char *ad_account_id,
    int *bid_in_micro_currency,
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int *budget_in_micro_currency,
    char *campaign_id,
    conversion_learning_mode_type_t *conversion_learning_mode_type,
    int *created_time,
    char *customer_segment_id,
    any_type_t *dca_assets,
    int *end_time,
    adgroup_tracking_features_t *ext_features,
    char *feed_profile_id,
    char *id,
    int *is_creative_optimization,
    int *is_local_inventory,
    int *lifetime_frequency_cap,
    double *local_inventory_radius_in_miles,
    char *name,
    nullable_optimization_goal_metadata_t *optimization_goal_metadata,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    placement_group_type_t *placement_group,
    placement_traffic_type_t *placement_traffic_type,
    promotion_application_level_t *promotion_application_level,
    char *promotion_id,
    list_t *promotion_ids,
    int *start_time,
    entity_status_t *status,
    summary_status_t *summary_status,
    targeting_spec_optimal_t *targeting_spec,
    list_t *targeting_template_ids,
    ad_group_tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time
    ) {
    ad_group_base_t *ad_group_base_local_var = malloc(sizeof(ad_group_base_t));
    if (!ad_group_base_local_var) {
        return NULL;
    }
    memset(ad_group_base_local_var, 0, sizeof(ad_group_base_t));
    ad_group_base_local_var->_library_owned = 1;
    ad_group_base_local_var->ad_account_id = ad_account_id;
    ad_group_base_local_var->bid_in_micro_currency = bid_in_micro_currency;
    ad_group_base_local_var->bid_strategy_type = bid_strategy_type;
    ad_group_base_local_var->billable_event = billable_event;
    ad_group_base_local_var->budget_in_micro_currency = budget_in_micro_currency;
    ad_group_base_local_var->campaign_id = campaign_id;
    ad_group_base_local_var->conversion_learning_mode_type = conversion_learning_mode_type;
    ad_group_base_local_var->created_time = created_time;
    ad_group_base_local_var->customer_segment_id = customer_segment_id;
    ad_group_base_local_var->dca_assets = dca_assets;
    ad_group_base_local_var->end_time = end_time;
    ad_group_base_local_var->ext_features = ext_features;
    ad_group_base_local_var->feed_profile_id = feed_profile_id;
    ad_group_base_local_var->id = id;
    ad_group_base_local_var->is_creative_optimization = is_creative_optimization;
    ad_group_base_local_var->is_local_inventory = is_local_inventory;
    ad_group_base_local_var->lifetime_frequency_cap = lifetime_frequency_cap;
    ad_group_base_local_var->local_inventory_radius_in_miles = local_inventory_radius_in_miles;
    ad_group_base_local_var->name = name;
    ad_group_base_local_var->optimization_goal_metadata = optimization_goal_metadata;
    ad_group_base_local_var->performance_plus_campaign_settings = performance_plus_campaign_settings;
    ad_group_base_local_var->placement_group = placement_group;
    ad_group_base_local_var->placement_traffic_type = placement_traffic_type;
    ad_group_base_local_var->promotion_application_level = promotion_application_level;
    ad_group_base_local_var->promotion_id = promotion_id;
    ad_group_base_local_var->promotion_ids = promotion_ids;
    ad_group_base_local_var->start_time = start_time;
    ad_group_base_local_var->status = status;
    ad_group_base_local_var->summary_status = summary_status;
    ad_group_base_local_var->targeting_spec = targeting_spec;
    ad_group_base_local_var->targeting_template_ids = targeting_template_ids;
    ad_group_base_local_var->tracking_urls = tracking_urls;
    ad_group_base_local_var->type = type;
    ad_group_base_local_var->updated_time = updated_time;
    return ad_group_base_local_var;
}

__attribute__((deprecated)) ad_group_base_t *ad_group_base_create(
    char *ad_account_id,
    int *bid_in_micro_currency,
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int *budget_in_micro_currency,
    char *campaign_id,
    conversion_learning_mode_type_t *conversion_learning_mode_type,
    int *created_time,
    char *customer_segment_id,
    any_type_t *dca_assets,
    int *end_time,
    adgroup_tracking_features_t *ext_features,
    char *feed_profile_id,
    char *id,
    int *is_creative_optimization,
    int *is_local_inventory,
    int *lifetime_frequency_cap,
    double *local_inventory_radius_in_miles,
    char *name,
    nullable_optimization_goal_metadata_t *optimization_goal_metadata,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    placement_group_type_t *placement_group,
    placement_traffic_type_t *placement_traffic_type,
    promotion_application_level_t *promotion_application_level,
    char *promotion_id,
    list_t *promotion_ids,
    int *start_time,
    entity_status_t *status,
    summary_status_t *summary_status,
    targeting_spec_optimal_t *targeting_spec,
    list_t *targeting_template_ids,
    ad_group_tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time
    ) {
    int *bid_in_micro_currency_copy = NULL;
    if (bid_in_micro_currency) {
        bid_in_micro_currency_copy = malloc(sizeof(int));
        if (bid_in_micro_currency_copy) *bid_in_micro_currency_copy = *bid_in_micro_currency;
    }
    int *budget_in_micro_currency_copy = NULL;
    if (budget_in_micro_currency) {
        budget_in_micro_currency_copy = malloc(sizeof(int));
        if (budget_in_micro_currency_copy) *budget_in_micro_currency_copy = *budget_in_micro_currency;
    }
    int *created_time_copy = NULL;
    if (created_time) {
        created_time_copy = malloc(sizeof(int));
        if (created_time_copy) *created_time_copy = *created_time;
    }
    int *end_time_copy = NULL;
    if (end_time) {
        end_time_copy = malloc(sizeof(int));
        if (end_time_copy) *end_time_copy = *end_time;
    }
    int *is_creative_optimization_copy = NULL;
    if (is_creative_optimization) {
        is_creative_optimization_copy = malloc(sizeof(int));
        if (is_creative_optimization_copy) *is_creative_optimization_copy = *is_creative_optimization;
    }
    int *is_local_inventory_copy = NULL;
    if (is_local_inventory) {
        is_local_inventory_copy = malloc(sizeof(int));
        if (is_local_inventory_copy) *is_local_inventory_copy = *is_local_inventory;
    }
    int *lifetime_frequency_cap_copy = NULL;
    if (lifetime_frequency_cap) {
        lifetime_frequency_cap_copy = malloc(sizeof(int));
        if (lifetime_frequency_cap_copy) *lifetime_frequency_cap_copy = *lifetime_frequency_cap;
    }
    double *local_inventory_radius_in_miles_copy = NULL;
    if (local_inventory_radius_in_miles) {
        local_inventory_radius_in_miles_copy = malloc(sizeof(double));
        if (local_inventory_radius_in_miles_copy) *local_inventory_radius_in_miles_copy = *local_inventory_radius_in_miles;
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
    ad_group_base_t *result = ad_group_base_create_internal (
        ad_account_id,
        bid_in_micro_currency_copy,
        bid_strategy_type,
        billable_event,
        budget_in_micro_currency_copy,
        campaign_id,
        conversion_learning_mode_type,
        created_time_copy,
        customer_segment_id,
        dca_assets,
        end_time_copy,
        ext_features,
        feed_profile_id,
        id,
        is_creative_optimization_copy,
        is_local_inventory_copy,
        lifetime_frequency_cap_copy,
        local_inventory_radius_in_miles_copy,
        name,
        optimization_goal_metadata,
        performance_plus_campaign_settings,
        placement_group,
        placement_traffic_type,
        promotion_application_level,
        promotion_id,
        promotion_ids,
        start_time_copy,
        status,
        summary_status,
        targeting_spec,
        targeting_template_ids,
        tracking_urls,
        type,
        updated_time_copy
        );
    if (!result) {
        free(bid_in_micro_currency_copy);
        free(budget_in_micro_currency_copy);
        free(created_time_copy);
        free(end_time_copy);
        free(is_creative_optimization_copy);
        free(is_local_inventory_copy);
        free(lifetime_frequency_cap_copy);
        free(local_inventory_radius_in_miles_copy);
        free(start_time_copy);
        free(updated_time_copy);
    }
    return result;
}

void ad_group_base_free(ad_group_base_t *ad_group_base) {
    if(NULL == ad_group_base){
        return ;
    }
    if(ad_group_base->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_base_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_base->ad_account_id) {
        free(ad_group_base->ad_account_id);
        ad_group_base->ad_account_id = NULL;
    }
    if (ad_group_base->bid_in_micro_currency) {
        free(ad_group_base->bid_in_micro_currency);
        ad_group_base->bid_in_micro_currency = NULL;
    }
    if (ad_group_base->budget_in_micro_currency) {
        free(ad_group_base->budget_in_micro_currency);
        ad_group_base->budget_in_micro_currency = NULL;
    }
    if (ad_group_base->campaign_id) {
        free(ad_group_base->campaign_id);
        ad_group_base->campaign_id = NULL;
    }
    if (ad_group_base->conversion_learning_mode_type) {
        conversion_learning_mode_type_free(ad_group_base->conversion_learning_mode_type);
        ad_group_base->conversion_learning_mode_type = NULL;
    }
    if (ad_group_base->created_time) {
        free(ad_group_base->created_time);
        ad_group_base->created_time = NULL;
    }
    if (ad_group_base->customer_segment_id) {
        free(ad_group_base->customer_segment_id);
        ad_group_base->customer_segment_id = NULL;
    }
    if (ad_group_base->dca_assets) {
        _free(ad_group_base->dca_assets);
        ad_group_base->dca_assets = NULL;
    }
    if (ad_group_base->end_time) {
        free(ad_group_base->end_time);
        ad_group_base->end_time = NULL;
    }
    if (ad_group_base->ext_features) {
        adgroup_tracking_features_free(ad_group_base->ext_features);
        ad_group_base->ext_features = NULL;
    }
    if (ad_group_base->feed_profile_id) {
        free(ad_group_base->feed_profile_id);
        ad_group_base->feed_profile_id = NULL;
    }
    if (ad_group_base->id) {
        free(ad_group_base->id);
        ad_group_base->id = NULL;
    }
    if (ad_group_base->is_creative_optimization) {
        free(ad_group_base->is_creative_optimization);
        ad_group_base->is_creative_optimization = NULL;
    }
    if (ad_group_base->is_local_inventory) {
        free(ad_group_base->is_local_inventory);
        ad_group_base->is_local_inventory = NULL;
    }
    if (ad_group_base->lifetime_frequency_cap) {
        free(ad_group_base->lifetime_frequency_cap);
        ad_group_base->lifetime_frequency_cap = NULL;
    }
    if (ad_group_base->local_inventory_radius_in_miles) {
        free(ad_group_base->local_inventory_radius_in_miles);
        ad_group_base->local_inventory_radius_in_miles = NULL;
    }
    if (ad_group_base->name) {
        free(ad_group_base->name);
        ad_group_base->name = NULL;
    }
    if (ad_group_base->optimization_goal_metadata) {
        nullable_optimization_goal_metadata_free(ad_group_base->optimization_goal_metadata);
        ad_group_base->optimization_goal_metadata = NULL;
    }
    if (ad_group_base->performance_plus_campaign_settings) {
        performance_plus_campaign_settings_free(ad_group_base->performance_plus_campaign_settings);
        ad_group_base->performance_plus_campaign_settings = NULL;
    }
    if (ad_group_base->placement_group) {
        placement_group_type_free(ad_group_base->placement_group);
        ad_group_base->placement_group = NULL;
    }
    if (ad_group_base->placement_traffic_type) {
        placement_traffic_type_free(ad_group_base->placement_traffic_type);
        ad_group_base->placement_traffic_type = NULL;
    }
    if (ad_group_base->promotion_application_level) {
        promotion_application_level_free(ad_group_base->promotion_application_level);
        ad_group_base->promotion_application_level = NULL;
    }
    if (ad_group_base->promotion_id) {
        free(ad_group_base->promotion_id);
        ad_group_base->promotion_id = NULL;
    }
    if (ad_group_base->promotion_ids) {
        list_ForEach(listEntry, ad_group_base->promotion_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_base->promotion_ids);
        ad_group_base->promotion_ids = NULL;
    }
    if (ad_group_base->start_time) {
        free(ad_group_base->start_time);
        ad_group_base->start_time = NULL;
    }
    if (ad_group_base->status) {
        entity_status_free(ad_group_base->status);
        ad_group_base->status = NULL;
    }
    if (ad_group_base->summary_status) {
        summary_status_free(ad_group_base->summary_status);
        ad_group_base->summary_status = NULL;
    }
    if (ad_group_base->targeting_spec) {
        targeting_spec_optimal_free(ad_group_base->targeting_spec);
        ad_group_base->targeting_spec = NULL;
    }
    if (ad_group_base->targeting_template_ids) {
        list_ForEach(listEntry, ad_group_base->targeting_template_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_base->targeting_template_ids);
        ad_group_base->targeting_template_ids = NULL;
    }
    if (ad_group_base->tracking_urls) {
        ad_group_tracking_urls_free(ad_group_base->tracking_urls);
        ad_group_base->tracking_urls = NULL;
    }
    if (ad_group_base->type) {
        free(ad_group_base->type);
        ad_group_base->type = NULL;
    }
    if (ad_group_base->updated_time) {
        free(ad_group_base->updated_time);
        ad_group_base->updated_time = NULL;
    }
    free(ad_group_base);
}

cJSON *ad_group_base_convertToJSON(ad_group_base_t *ad_group_base) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_base->ad_account_id
    if(ad_group_base->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_group_base->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_base->bid_in_micro_currency
    if(ad_group_base->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", *ad_group_base->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_base->bid_strategy_type
    if(ad_group_base->bid_strategy_type != pinterest_rest_api_bid_strategy_type__NULL) {
    cJSON *bid_strategy_type_local_JSON = bid_strategy_type_convertToJSON(ad_group_base->bid_strategy_type);
    if(bid_strategy_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "bid_strategy_type", bid_strategy_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_base->billable_event
    if (pinterest_rest_api_action_type__NULL == ad_group_base->billable_event) {
        goto fail;
    }
    cJSON *billable_event_local_JSON = action_type_convertToJSON(ad_group_base->billable_event);
    if(billable_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "billable_event", billable_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_group_base->budget_in_micro_currency
    if(ad_group_base->budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "budget_in_micro_currency", *ad_group_base->budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_base->campaign_id
    if (!ad_group_base->campaign_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "campaign_id", ad_group_base->campaign_id) == NULL) {
    goto fail; //String
    }


    // ad_group_base->conversion_learning_mode_type
    if (!ad_group_base->conversion_learning_mode_type) {
        goto fail;
    }
    cJSON *conversion_learning_mode_type_local_JSON = conversion_learning_mode_type_convertToJSON(ad_group_base->conversion_learning_mode_type);
    if(conversion_learning_mode_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "conversion_learning_mode_type", conversion_learning_mode_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_group_base->created_time
    if (!ad_group_base->created_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_time", *ad_group_base->created_time) == NULL) {
    goto fail; //Numeric
    }


    // ad_group_base->customer_segment_id
    if(ad_group_base->customer_segment_id) {
    if(cJSON_AddStringToObject(item, "customer_segment_id", ad_group_base->customer_segment_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_base->dca_assets
    if(ad_group_base->dca_assets) {
    cJSON *dca_assets_local_JSON = _convertToJSON(ad_group_base->dca_assets);
    if(dca_assets_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "dca_assets", dca_assets_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_base->end_time
    if(ad_group_base->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", *ad_group_base->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_base->ext_features
    if(ad_group_base->ext_features) {
    cJSON *ext_features_local_JSON = adgroup_tracking_features_convertToJSON(ad_group_base->ext_features);
    if(ext_features_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ext_features", ext_features_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_base->feed_profile_id
    if(ad_group_base->feed_profile_id) {
    if(cJSON_AddStringToObject(item, "feed_profile_id", ad_group_base->feed_profile_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_base->id
    if (!ad_group_base->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_group_base->id) == NULL) {
    goto fail; //String
    }


    // ad_group_base->is_creative_optimization
    if(ad_group_base->is_creative_optimization) {
    if(cJSON_AddBoolToObject(item, "is_creative_optimization", *ad_group_base->is_creative_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_base->is_local_inventory
    if(ad_group_base->is_local_inventory) {
    if(cJSON_AddBoolToObject(item, "is_local_inventory", *ad_group_base->is_local_inventory) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_base->lifetime_frequency_cap
    if(ad_group_base->lifetime_frequency_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency_cap", *ad_group_base->lifetime_frequency_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_base->local_inventory_radius_in_miles
    if(ad_group_base->local_inventory_radius_in_miles) {
    if(cJSON_AddNumberToObject(item, "local_inventory_radius_in_miles", *ad_group_base->local_inventory_radius_in_miles) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_base->name
    if (!ad_group_base->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ad_group_base->name) == NULL) {
    goto fail; //String
    }


    // ad_group_base->optimization_goal_metadata
    if(ad_group_base->optimization_goal_metadata) {
    cJSON *optimization_goal_metadata_local_JSON = nullable_optimization_goal_metadata_convertToJSON(ad_group_base->optimization_goal_metadata);
    if(optimization_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimization_goal_metadata", optimization_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_base->performance_plus_campaign_settings
    if(ad_group_base->performance_plus_campaign_settings) {
    cJSON *performance_plus_campaign_settings_local_JSON = performance_plus_campaign_settings_convertToJSON(ad_group_base->performance_plus_campaign_settings);
    if(performance_plus_campaign_settings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "performance_plus_campaign_settings", performance_plus_campaign_settings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_base->placement_group
    if(ad_group_base->placement_group) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(ad_group_base->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_base->placement_traffic_type
    if(ad_group_base->placement_traffic_type) {
    cJSON *placement_traffic_type_local_JSON = placement_traffic_type_convertToJSON(ad_group_base->placement_traffic_type);
    if(placement_traffic_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_traffic_type", placement_traffic_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_base->promotion_application_level
    if(ad_group_base->promotion_application_level) {
    cJSON *promotion_application_level_local_JSON = promotion_application_level_convertToJSON(ad_group_base->promotion_application_level);
    if(promotion_application_level_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "promotion_application_level", promotion_application_level_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_base->promotion_id
    if(ad_group_base->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", ad_group_base->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_base->promotion_ids
    if(ad_group_base->promotion_ids) {
    cJSON *promotion_ids = cJSON_AddArrayToObject(item, "promotion_ids");
    if(promotion_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *promotion_idsListEntry;
    list_ForEach(promotion_idsListEntry, ad_group_base->promotion_ids) {
    if(cJSON_AddStringToObject(promotion_ids, "", promotion_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_base->start_time
    if(ad_group_base->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", *ad_group_base->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_base->status
    if(ad_group_base->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_group_base->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_base->summary_status
    if (!ad_group_base->summary_status) {
        goto fail;
    }
    cJSON *summary_status_local_JSON = summary_status_convertToJSON(ad_group_base->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_group_base->targeting_spec
    if(ad_group_base->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_optimal_convertToJSON(ad_group_base->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_base->targeting_template_ids
    if(ad_group_base->targeting_template_ids) {
    cJSON *targeting_template_ids = cJSON_AddArrayToObject(item, "targeting_template_ids");
    if(targeting_template_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *targeting_template_idsListEntry;
    list_ForEach(targeting_template_idsListEntry, ad_group_base->targeting_template_ids) {
    if(cJSON_AddStringToObject(targeting_template_ids, "", targeting_template_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_base->tracking_urls
    if(ad_group_base->tracking_urls) {
    cJSON *tracking_urls_local_JSON = ad_group_tracking_urls_convertToJSON(ad_group_base->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_base->type
    if (!ad_group_base->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", ad_group_base->type) == NULL) {
    goto fail; //String
    }


    // ad_group_base->updated_time
    if (!ad_group_base->updated_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "updated_time", *ad_group_base->updated_time) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_group_base_t *ad_group_base_parseFromJSON(cJSON *ad_group_baseJSON){

    ad_group_base_t *ad_group_base_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for ad_group_base->bid_in_micro_currency
    int *bid_in_micro_currency_local_var = NULL;

    // define the local variable for ad_group_base->bid_strategy_type
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type_local_nonprim = 0;

    // define the local variable for ad_group_base->billable_event
    pinterest_rest_api_action_type__e billable_event_local_nonprim = 0;

    // define the local variable for ad_group_base->budget_in_micro_currency
    int *budget_in_micro_currency_local_var = NULL;

    char *campaign_id_local_str = NULL;

    // define the local variable for ad_group_base->conversion_learning_mode_type
    conversion_learning_mode_type_t *conversion_learning_mode_type_local_nonprim = NULL;

    // define the local variable for ad_group_base->created_time
    int *created_time_local_var = NULL;

    char *customer_segment_id_local_str = NULL;

    // define the local variable for ad_group_base->dca_assets
    _t *dca_assets_local_nonprim = NULL;

    // define the local variable for ad_group_base->end_time
    int *end_time_local_var = NULL;

    // define the local variable for ad_group_base->ext_features
    adgroup_tracking_features_t *ext_features_local_nonprim = NULL;

    char *feed_profile_id_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for ad_group_base->is_creative_optimization
    int *is_creative_optimization_local_var = NULL;

    // define the local variable for ad_group_base->is_local_inventory
    int *is_local_inventory_local_var = NULL;

    // define the local variable for ad_group_base->lifetime_frequency_cap
    int *lifetime_frequency_cap_local_var = NULL;

    // define the local variable for ad_group_base->local_inventory_radius_in_miles
    double *local_inventory_radius_in_miles_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for ad_group_base->optimization_goal_metadata
    nullable_optimization_goal_metadata_t *optimization_goal_metadata_local_nonprim = NULL;

    // define the local variable for ad_group_base->performance_plus_campaign_settings
    performance_plus_campaign_settings_t *performance_plus_campaign_settings_local_nonprim = NULL;

    // define the local variable for ad_group_base->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local variable for ad_group_base->placement_traffic_type
    placement_traffic_type_t *placement_traffic_type_local_nonprim = NULL;

    // define the local variable for ad_group_base->promotion_application_level
    promotion_application_level_t *promotion_application_level_local_nonprim = NULL;

    char *promotion_id_local_str = NULL;

    // define the local list for ad_group_base->promotion_ids
    list_t *promotion_idsList = NULL;

    // define the local variable for ad_group_base->start_time
    int *start_time_local_var = NULL;

    // define the local variable for ad_group_base->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for ad_group_base->summary_status
    summary_status_t *summary_status_local_nonprim = NULL;

    // define the local variable for ad_group_base->targeting_spec
    targeting_spec_optimal_t *targeting_spec_local_nonprim = NULL;

    // define the local list for ad_group_base->targeting_template_ids
    list_t *targeting_template_idsList = NULL;

    // define the local variable for ad_group_base->tracking_urls
    ad_group_tracking_urls_t *tracking_urls_local_nonprim = NULL;

    char *type_local_str = NULL;

    // define the local variable for ad_group_base->updated_time
    int *updated_time_local_var = NULL;

    // ad_group_base->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_group_base->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "bid_in_micro_currency");
    if (cJSON_IsNull(bid_in_micro_currency)) {
        bid_in_micro_currency = NULL;
    }
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    bid_in_micro_currency_local_var = malloc(sizeof(int));
    if(!bid_in_micro_currency_local_var)
    {
        goto end;
    }
    *bid_in_micro_currency_local_var = bid_in_micro_currency->valuedouble;
    }

    // ad_group_base->bid_strategy_type
    cJSON *bid_strategy_type = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "bid_strategy_type");
    if (cJSON_IsNull(bid_strategy_type)) {
        bid_strategy_type = NULL;
    }
    if (bid_strategy_type) { 
    bid_strategy_type_local_nonprim = bid_strategy_type_parseFromJSON(bid_strategy_type); //custom
    }

    // ad_group_base->billable_event
    cJSON *billable_event = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "billable_event");
    if (cJSON_IsNull(billable_event)) {
        billable_event = NULL;
    }
    if (!billable_event) {
        goto end;
    }

    
    billable_event_local_nonprim = action_type_parseFromJSON(billable_event); //custom

    // ad_group_base->budget_in_micro_currency
    cJSON *budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "budget_in_micro_currency");
    if (cJSON_IsNull(budget_in_micro_currency)) {
        budget_in_micro_currency = NULL;
    }
    if (budget_in_micro_currency) { 
    if(!cJSON_IsNumber(budget_in_micro_currency))
    {
    goto end; //Numeric
    }
    budget_in_micro_currency_local_var = malloc(sizeof(int));
    if(!budget_in_micro_currency_local_var)
    {
        goto end;
    }
    *budget_in_micro_currency_local_var = budget_in_micro_currency->valuedouble;
    }

    // ad_group_base->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsString(campaign_id))
    {
    goto end; //String
    }

    // ad_group_base->conversion_learning_mode_type
    cJSON *conversion_learning_mode_type = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "conversion_learning_mode_type");
    if (cJSON_IsNull(conversion_learning_mode_type)) {
        conversion_learning_mode_type = NULL;
    }
    if (!conversion_learning_mode_type) {
        goto end;
    }

    
    conversion_learning_mode_type_local_nonprim = conversion_learning_mode_type_parseFromJSON(conversion_learning_mode_type); //custom

    // ad_group_base->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (!created_time) {
        goto end;
    }

    
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

    // ad_group_base->customer_segment_id
    cJSON *customer_segment_id = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "customer_segment_id");
    if (cJSON_IsNull(customer_segment_id)) {
        customer_segment_id = NULL;
    }
    if (customer_segment_id) { 
    if(!cJSON_IsString(customer_segment_id) && !cJSON_IsNull(customer_segment_id))
    {
    goto end; //String
    }
    }

    // ad_group_base->dca_assets
    cJSON *dca_assets = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "dca_assets");
    if (cJSON_IsNull(dca_assets)) {
        dca_assets = NULL;
    }
    if (dca_assets) { 
    dca_assets_local_nonprim = _parseFromJSON(dca_assets); //custom
    }

    // ad_group_base->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "end_time");
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

    // ad_group_base->ext_features
    cJSON *ext_features = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "ext_features");
    if (cJSON_IsNull(ext_features)) {
        ext_features = NULL;
    }
    if (ext_features) { 
    ext_features_local_nonprim = adgroup_tracking_features_parseFromJSON(ext_features); //nonprimitive
    }

    // ad_group_base->feed_profile_id
    cJSON *feed_profile_id = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "feed_profile_id");
    if (cJSON_IsNull(feed_profile_id)) {
        feed_profile_id = NULL;
    }
    if (feed_profile_id) { 
    if(!cJSON_IsString(feed_profile_id) && !cJSON_IsNull(feed_profile_id))
    {
    goto end; //String
    }
    }

    // ad_group_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "id");
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

    // ad_group_base->is_creative_optimization
    cJSON *is_creative_optimization = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "is_creative_optimization");
    if (cJSON_IsNull(is_creative_optimization)) {
        is_creative_optimization = NULL;
    }
    if (is_creative_optimization) { 
    if(!cJSON_IsBool(is_creative_optimization))
    {
    goto end; //Bool
    }
    is_creative_optimization_local_var = malloc(sizeof(int));
    if(!is_creative_optimization_local_var)
    {
        goto end;
    }
    *is_creative_optimization_local_var = is_creative_optimization->valueint;
    }

    // ad_group_base->is_local_inventory
    cJSON *is_local_inventory = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "is_local_inventory");
    if (cJSON_IsNull(is_local_inventory)) {
        is_local_inventory = NULL;
    }
    if (is_local_inventory) { 
    if(!cJSON_IsBool(is_local_inventory))
    {
    goto end; //Bool
    }
    is_local_inventory_local_var = malloc(sizeof(int));
    if(!is_local_inventory_local_var)
    {
        goto end;
    }
    *is_local_inventory_local_var = is_local_inventory->valueint;
    }

    // ad_group_base->lifetime_frequency_cap
    cJSON *lifetime_frequency_cap = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "lifetime_frequency_cap");
    if (cJSON_IsNull(lifetime_frequency_cap)) {
        lifetime_frequency_cap = NULL;
    }
    if (lifetime_frequency_cap) { 
    if(!cJSON_IsNumber(lifetime_frequency_cap))
    {
    goto end; //Numeric
    }
    lifetime_frequency_cap_local_var = malloc(sizeof(int));
    if(!lifetime_frequency_cap_local_var)
    {
        goto end;
    }
    *lifetime_frequency_cap_local_var = lifetime_frequency_cap->valuedouble;
    }

    // ad_group_base->local_inventory_radius_in_miles
    cJSON *local_inventory_radius_in_miles = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "local_inventory_radius_in_miles");
    if (cJSON_IsNull(local_inventory_radius_in_miles)) {
        local_inventory_radius_in_miles = NULL;
    }
    if (local_inventory_radius_in_miles) { 
    if(!cJSON_IsNumber(local_inventory_radius_in_miles))
    {
    goto end; //Numeric
    }
    local_inventory_radius_in_miles_local_var = malloc(sizeof(double));
    if(!local_inventory_radius_in_miles_local_var)
    {
        goto end;
    }
    *local_inventory_radius_in_miles_local_var = local_inventory_radius_in_miles->valuedouble;
    }

    // ad_group_base->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // ad_group_base->optimization_goal_metadata
    cJSON *optimization_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "optimization_goal_metadata");
    if (cJSON_IsNull(optimization_goal_metadata)) {
        optimization_goal_metadata = NULL;
    }
    if (optimization_goal_metadata) { 
    optimization_goal_metadata_local_nonprim = nullable_optimization_goal_metadata_parseFromJSON(optimization_goal_metadata); //nonprimitive
    }

    // ad_group_base->performance_plus_campaign_settings
    cJSON *performance_plus_campaign_settings = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "performance_plus_campaign_settings");
    if (cJSON_IsNull(performance_plus_campaign_settings)) {
        performance_plus_campaign_settings = NULL;
    }
    if (performance_plus_campaign_settings) { 
    performance_plus_campaign_settings_local_nonprim = performance_plus_campaign_settings_parseFromJSON(performance_plus_campaign_settings); //nonprimitive
    }

    // ad_group_base->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "placement_group");
    if (cJSON_IsNull(placement_group)) {
        placement_group = NULL;
    }
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_base->placement_traffic_type
    cJSON *placement_traffic_type = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "placement_traffic_type");
    if (cJSON_IsNull(placement_traffic_type)) {
        placement_traffic_type = NULL;
    }
    if (placement_traffic_type) { 
    placement_traffic_type_local_nonprim = placement_traffic_type_parseFromJSON(placement_traffic_type); //custom
    }

    // ad_group_base->promotion_application_level
    cJSON *promotion_application_level = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "promotion_application_level");
    if (cJSON_IsNull(promotion_application_level)) {
        promotion_application_level = NULL;
    }
    if (promotion_application_level) { 
    promotion_application_level_local_nonprim = promotion_application_level_parseFromJSON(promotion_application_level); //custom
    }

    // ad_group_base->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // ad_group_base->promotion_ids
    cJSON *promotion_ids = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "promotion_ids");
    if (cJSON_IsNull(promotion_ids)) {
        promotion_ids = NULL;
    }
    if (promotion_ids) { 
    cJSON *promotion_ids_local = NULL;
    if(!cJSON_IsArray(promotion_ids)) {
        goto end;//primitive container
    }
    promotion_idsList = list_createList();

    cJSON_ArrayForEach(promotion_ids_local, promotion_ids)
    {
        if(!cJSON_IsString(promotion_ids_local))
        {
            goto end;
        }
        list_addElement(promotion_idsList , strdup(promotion_ids_local->valuestring));
    }
    }

    // ad_group_base->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "start_time");
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

    // ad_group_base->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_group_base->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "summary_status");
    if (cJSON_IsNull(summary_status)) {
        summary_status = NULL;
    }
    if (!summary_status) {
        goto end;
    }

    
    summary_status_local_nonprim = summary_status_parseFromJSON(summary_status); //custom

    // ad_group_base->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "targeting_spec");
    if (cJSON_IsNull(targeting_spec)) {
        targeting_spec = NULL;
    }
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_optimal_parseFromJSON(targeting_spec); //nonprimitive
    }

    // ad_group_base->targeting_template_ids
    cJSON *targeting_template_ids = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "targeting_template_ids");
    if (cJSON_IsNull(targeting_template_ids)) {
        targeting_template_ids = NULL;
    }
    if (targeting_template_ids) { 
    cJSON *targeting_template_ids_local = NULL;
    if(!cJSON_IsArray(targeting_template_ids)) {
        goto end;//primitive container
    }
    targeting_template_idsList = list_createList();

    cJSON_ArrayForEach(targeting_template_ids_local, targeting_template_ids)
    {
        if(!cJSON_IsString(targeting_template_ids_local))
        {
            goto end;
        }
        list_addElement(targeting_template_idsList , strdup(targeting_template_ids_local->valuestring));
    }
    }

    // ad_group_base->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = ad_group_tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad_group_base->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // ad_group_base->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(ad_group_baseJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (!updated_time) {
        goto end;
    }

    
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


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (campaign_id && !cJSON_IsNull(campaign_id)) campaign_id_local_str = strdup(campaign_id->valuestring);
    if (customer_segment_id && !cJSON_IsNull(customer_segment_id)) customer_segment_id_local_str = strdup(customer_segment_id->valuestring);
    if (feed_profile_id && !cJSON_IsNull(feed_profile_id)) feed_profile_id_local_str = strdup(feed_profile_id->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (promotion_id && !cJSON_IsNull(promotion_id)) promotion_id_local_str = strdup(promotion_id->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    ad_group_base_local_var = ad_group_base_create_internal (
        ad_account_id_local_str,
        bid_in_micro_currency_local_var,
        bid_strategy_type ? bid_strategy_type_local_nonprim : 0,
        billable_event_local_nonprim,
        budget_in_micro_currency_local_var,
        campaign_id_local_str,
        conversion_learning_mode_type_local_nonprim,
        created_time_local_var,
        customer_segment_id_local_str,
        dca_assets ? dca_assets_local_nonprim : NULL,
        end_time_local_var,
        ext_features ? ext_features_local_nonprim : NULL,
        feed_profile_id_local_str,
        id_local_str,
        is_creative_optimization_local_var,
        is_local_inventory_local_var,
        lifetime_frequency_cap_local_var,
        local_inventory_radius_in_miles_local_var,
        name_local_str,
        optimization_goal_metadata ? optimization_goal_metadata_local_nonprim : NULL,
        performance_plus_campaign_settings ? performance_plus_campaign_settings_local_nonprim : NULL,
        placement_group ? placement_group_local_nonprim : NULL,
        placement_traffic_type ? placement_traffic_type_local_nonprim : NULL,
        promotion_application_level ? promotion_application_level_local_nonprim : NULL,
        promotion_id_local_str,
        promotion_ids ? promotion_idsList : NULL,
        start_time_local_var,
        status ? status_local_nonprim : NULL,
        summary_status_local_nonprim,
        targeting_spec ? targeting_spec_local_nonprim : NULL,
        targeting_template_ids ? targeting_template_idsList : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        type_local_str,
        updated_time_local_var
        );

    if (!ad_group_base_local_var) {
        goto end;
    }

    return ad_group_base_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (bid_in_micro_currency_local_var) {
        free(bid_in_micro_currency_local_var);
        bid_in_micro_currency_local_var = NULL;
    }
    if (bid_strategy_type_local_nonprim) {
        bid_strategy_type_local_nonprim = 0;
    }
    if (billable_event_local_nonprim) {
        billable_event_local_nonprim = 0;
    }
    if (budget_in_micro_currency_local_var) {
        free(budget_in_micro_currency_local_var);
        budget_in_micro_currency_local_var = NULL;
    }
    if (campaign_id_local_str) {
        free(campaign_id_local_str);
        campaign_id_local_str = NULL;
    }
    if (conversion_learning_mode_type_local_nonprim) {
        conversion_learning_mode_type_free(conversion_learning_mode_type_local_nonprim);
        conversion_learning_mode_type_local_nonprim = NULL;
    }
    if (created_time_local_var) {
        free(created_time_local_var);
        created_time_local_var = NULL;
    }
    if (customer_segment_id_local_str) {
        free(customer_segment_id_local_str);
        customer_segment_id_local_str = NULL;
    }
    if (dca_assets_local_nonprim) {
        _free(dca_assets_local_nonprim);
        dca_assets_local_nonprim = NULL;
    }
    if (end_time_local_var) {
        free(end_time_local_var);
        end_time_local_var = NULL;
    }
    if (ext_features_local_nonprim) {
        adgroup_tracking_features_free(ext_features_local_nonprim);
        ext_features_local_nonprim = NULL;
    }
    if (feed_profile_id_local_str) {
        free(feed_profile_id_local_str);
        feed_profile_id_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (is_creative_optimization_local_var) {
        free(is_creative_optimization_local_var);
        is_creative_optimization_local_var = NULL;
    }
    if (is_local_inventory_local_var) {
        free(is_local_inventory_local_var);
        is_local_inventory_local_var = NULL;
    }
    if (lifetime_frequency_cap_local_var) {
        free(lifetime_frequency_cap_local_var);
        lifetime_frequency_cap_local_var = NULL;
    }
    if (local_inventory_radius_in_miles_local_var) {
        free(local_inventory_radius_in_miles_local_var);
        local_inventory_radius_in_miles_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (optimization_goal_metadata_local_nonprim) {
        nullable_optimization_goal_metadata_free(optimization_goal_metadata_local_nonprim);
        optimization_goal_metadata_local_nonprim = NULL;
    }
    if (performance_plus_campaign_settings_local_nonprim) {
        performance_plus_campaign_settings_free(performance_plus_campaign_settings_local_nonprim);
        performance_plus_campaign_settings_local_nonprim = NULL;
    }
    if (placement_group_local_nonprim) {
        placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
    }
    if (placement_traffic_type_local_nonprim) {
        placement_traffic_type_free(placement_traffic_type_local_nonprim);
        placement_traffic_type_local_nonprim = NULL;
    }
    if (promotion_application_level_local_nonprim) {
        promotion_application_level_free(promotion_application_level_local_nonprim);
        promotion_application_level_local_nonprim = NULL;
    }
    if (promotion_id_local_str) {
        free(promotion_id_local_str);
        promotion_id_local_str = NULL;
    }
    if (promotion_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, promotion_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(promotion_idsList);
        promotion_idsList = NULL;
    }
    if (start_time_local_var) {
        free(start_time_local_var);
        start_time_local_var = NULL;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (summary_status_local_nonprim) {
        summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    if (targeting_spec_local_nonprim) {
        targeting_spec_optimal_free(targeting_spec_local_nonprim);
        targeting_spec_local_nonprim = NULL;
    }
    if (targeting_template_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_template_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_template_idsList);
        targeting_template_idsList = NULL;
    }
    if (tracking_urls_local_nonprim) {
        ad_group_tracking_urls_free(tracking_urls_local_nonprim);
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
