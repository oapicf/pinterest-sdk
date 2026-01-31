#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_response.h"


char* ad_group_response_bid_strategy_type_ToString(pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_type) {
    char* bid_strategy_typeArray[] =  { "NULL", "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "" };
    return bid_strategy_typeArray[bid_strategy_type];
}

pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e ad_group_response_bid_strategy_type_FromString(char* bid_strategy_type){
    int stringToReturn = 0;
    char *bid_strategy_typeArray[] =  { "NULL", "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "" };
    size_t sizeofArray = sizeof(bid_strategy_typeArray) / sizeof(bid_strategy_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bid_strategy_type, bid_strategy_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_group_response_promotion_application_level_ToString(pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level) {
    char* promotion_application_levelArray[] =  { "NULL", "NONE", "ITEM", "AD_GROUP", "" };
    return promotion_application_levelArray[promotion_application_level];
}

pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e ad_group_response_promotion_application_level_FromString(char* promotion_application_level){
    int stringToReturn = 0;
    char *promotion_application_levelArray[] =  { "NULL", "NONE", "ITEM", "AD_GROUP", "" };
    size_t sizeofArray = sizeof(promotion_application_levelArray) / sizeof(promotion_application_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promotion_application_level, promotion_application_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_group_response_conversion_learning_mode_type_ToString(pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type) {
    char* conversion_learning_mode_typeArray[] =  { "NULL", "NOT_ACTIVE", "ACTIVE", "" };
    return conversion_learning_mode_typeArray[conversion_learning_mode_type];
}

pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e ad_group_response_conversion_learning_mode_type_FromString(char* conversion_learning_mode_type){
    int stringToReturn = 0;
    char *conversion_learning_mode_typeArray[] =  { "NULL", "NOT_ACTIVE", "ACTIVE", "" };
    size_t sizeofArray = sizeof(conversion_learning_mode_typeArray) / sizeof(conversion_learning_mode_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_learning_mode_type, conversion_learning_mode_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_group_response_t *ad_group_response_create_internal(
    int auto_targeting_enabled,
    int bid_in_micro_currency,
    pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int budget_in_micro_currency,
    budget_type_t *budget_type,
    char *campaign_id,
    int end_time,
    int is_creative_optimization,
    int lifetime_frequency_cap,
    char *name,
    optimization_goal_metadata_t *optimization_goal_metadata,
    pacing_delivery_type_t *pacing_delivery_type,
    placement_group_type_t *placement_group,
    pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level,
    char *promotion_id,
    int start_time,
    entity_status_t *status,
    targeting_spec_t *targeting_spec,
    list_t *targeting_template_ids,
    tracking_urls_t *tracking_urls,
    char *ad_account_id,
    double bid_multiplier,
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type,
    int created_time,
    any_type_t *dca_assets,
    char *feed_profile_id,
    char *id,
    ad_group_summary_status_t *summary_status,
    char *type,
    int updated_time
    ) {
    ad_group_response_t *ad_group_response_local_var = malloc(sizeof(ad_group_response_t));
    if (!ad_group_response_local_var) {
        return NULL;
    }
    ad_group_response_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_response_local_var->bid_in_micro_currency = bid_in_micro_currency;
    ad_group_response_local_var->bid_strategy_type = bid_strategy_type;
    ad_group_response_local_var->billable_event = billable_event;
    ad_group_response_local_var->budget_in_micro_currency = budget_in_micro_currency;
    ad_group_response_local_var->budget_type = budget_type;
    ad_group_response_local_var->campaign_id = campaign_id;
    ad_group_response_local_var->end_time = end_time;
    ad_group_response_local_var->is_creative_optimization = is_creative_optimization;
    ad_group_response_local_var->lifetime_frequency_cap = lifetime_frequency_cap;
    ad_group_response_local_var->name = name;
    ad_group_response_local_var->optimization_goal_metadata = optimization_goal_metadata;
    ad_group_response_local_var->pacing_delivery_type = pacing_delivery_type;
    ad_group_response_local_var->placement_group = placement_group;
    ad_group_response_local_var->promotion_application_level = promotion_application_level;
    ad_group_response_local_var->promotion_id = promotion_id;
    ad_group_response_local_var->start_time = start_time;
    ad_group_response_local_var->status = status;
    ad_group_response_local_var->targeting_spec = targeting_spec;
    ad_group_response_local_var->targeting_template_ids = targeting_template_ids;
    ad_group_response_local_var->tracking_urls = tracking_urls;
    ad_group_response_local_var->ad_account_id = ad_account_id;
    ad_group_response_local_var->bid_multiplier = bid_multiplier;
    ad_group_response_local_var->conversion_learning_mode_type = conversion_learning_mode_type;
    ad_group_response_local_var->created_time = created_time;
    ad_group_response_local_var->dca_assets = dca_assets;
    ad_group_response_local_var->feed_profile_id = feed_profile_id;
    ad_group_response_local_var->id = id;
    ad_group_response_local_var->summary_status = summary_status;
    ad_group_response_local_var->type = type;
    ad_group_response_local_var->updated_time = updated_time;

    ad_group_response_local_var->_library_owned = 1;
    return ad_group_response_local_var;
}

__attribute__((deprecated)) ad_group_response_t *ad_group_response_create(
    int auto_targeting_enabled,
    int bid_in_micro_currency,
    pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int budget_in_micro_currency,
    budget_type_t *budget_type,
    char *campaign_id,
    int end_time,
    int is_creative_optimization,
    int lifetime_frequency_cap,
    char *name,
    optimization_goal_metadata_t *optimization_goal_metadata,
    pacing_delivery_type_t *pacing_delivery_type,
    placement_group_type_t *placement_group,
    pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level,
    char *promotion_id,
    int start_time,
    entity_status_t *status,
    targeting_spec_t *targeting_spec,
    list_t *targeting_template_ids,
    tracking_urls_t *tracking_urls,
    char *ad_account_id,
    double bid_multiplier,
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type,
    int created_time,
    any_type_t *dca_assets,
    char *feed_profile_id,
    char *id,
    ad_group_summary_status_t *summary_status,
    char *type,
    int updated_time
    ) {
    return ad_group_response_create_internal (
        auto_targeting_enabled,
        bid_in_micro_currency,
        bid_strategy_type,
        billable_event,
        budget_in_micro_currency,
        budget_type,
        campaign_id,
        end_time,
        is_creative_optimization,
        lifetime_frequency_cap,
        name,
        optimization_goal_metadata,
        pacing_delivery_type,
        placement_group,
        promotion_application_level,
        promotion_id,
        start_time,
        status,
        targeting_spec,
        targeting_template_ids,
        tracking_urls,
        ad_account_id,
        bid_multiplier,
        conversion_learning_mode_type,
        created_time,
        dca_assets,
        feed_profile_id,
        id,
        summary_status,
        type,
        updated_time
        );
}

void ad_group_response_free(ad_group_response_t *ad_group_response) {
    if(NULL == ad_group_response){
        return ;
    }
    if(ad_group_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_response->budget_type) {
        budget_type_free(ad_group_response->budget_type);
        ad_group_response->budget_type = NULL;
    }
    if (ad_group_response->campaign_id) {
        free(ad_group_response->campaign_id);
        ad_group_response->campaign_id = NULL;
    }
    if (ad_group_response->name) {
        free(ad_group_response->name);
        ad_group_response->name = NULL;
    }
    if (ad_group_response->optimization_goal_metadata) {
        optimization_goal_metadata_free(ad_group_response->optimization_goal_metadata);
        ad_group_response->optimization_goal_metadata = NULL;
    }
    if (ad_group_response->pacing_delivery_type) {
        pacing_delivery_type_free(ad_group_response->pacing_delivery_type);
        ad_group_response->pacing_delivery_type = NULL;
    }
    if (ad_group_response->placement_group) {
        placement_group_type_free(ad_group_response->placement_group);
        ad_group_response->placement_group = NULL;
    }
    if (ad_group_response->promotion_id) {
        free(ad_group_response->promotion_id);
        ad_group_response->promotion_id = NULL;
    }
    if (ad_group_response->status) {
        entity_status_free(ad_group_response->status);
        ad_group_response->status = NULL;
    }
    if (ad_group_response->targeting_spec) {
        targeting_spec_free(ad_group_response->targeting_spec);
        ad_group_response->targeting_spec = NULL;
    }
    if (ad_group_response->targeting_template_ids) {
        list_ForEach(listEntry, ad_group_response->targeting_template_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_response->targeting_template_ids);
        ad_group_response->targeting_template_ids = NULL;
    }
    if (ad_group_response->tracking_urls) {
        tracking_urls_free(ad_group_response->tracking_urls);
        ad_group_response->tracking_urls = NULL;
    }
    if (ad_group_response->ad_account_id) {
        free(ad_group_response->ad_account_id);
        ad_group_response->ad_account_id = NULL;
    }
    if (ad_group_response->dca_assets) {
        _free(ad_group_response->dca_assets);
        ad_group_response->dca_assets = NULL;
    }
    if (ad_group_response->feed_profile_id) {
        free(ad_group_response->feed_profile_id);
        ad_group_response->feed_profile_id = NULL;
    }
    if (ad_group_response->id) {
        free(ad_group_response->id);
        ad_group_response->id = NULL;
    }
    if (ad_group_response->summary_status) {
        ad_group_summary_status_free(ad_group_response->summary_status);
        ad_group_response->summary_status = NULL;
    }
    if (ad_group_response->type) {
        free(ad_group_response->type);
        ad_group_response->type = NULL;
    }
    free(ad_group_response);
}

cJSON *ad_group_response_convertToJSON(ad_group_response_t *ad_group_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_response->auto_targeting_enabled
    if(ad_group_response->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", ad_group_response->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_response->bid_in_micro_currency
    if(ad_group_response->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", ad_group_response->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->bid_strategy_type
    if(ad_group_response->bid_strategy_type != pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "bid_strategy_type", ad_group_response_bid_strategy_type_ToString(ad_group_response->bid_strategy_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_group_response->billable_event
    if(ad_group_response->billable_event != pinterest_rest_api_action_type__NULL) {
    cJSON *billable_event_local_JSON = action_type_convertToJSON(ad_group_response->billable_event);
    if(billable_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "billable_event", billable_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->budget_in_micro_currency
    if(ad_group_response->budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "budget_in_micro_currency", ad_group_response->budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->budget_type
    if(ad_group_response->budget_type) {
    cJSON *budget_type_local_JSON = budget_type_convertToJSON(ad_group_response->budget_type);
    if(budget_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "budget_type", budget_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->campaign_id
    if(ad_group_response->campaign_id) {
    if(cJSON_AddStringToObject(item, "campaign_id", ad_group_response->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->end_time
    if(ad_group_response->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", ad_group_response->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->is_creative_optimization
    if(ad_group_response->is_creative_optimization) {
    if(cJSON_AddBoolToObject(item, "is_creative_optimization", ad_group_response->is_creative_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_response->lifetime_frequency_cap
    if(ad_group_response->lifetime_frequency_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency_cap", ad_group_response->lifetime_frequency_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->name
    if(ad_group_response->name) {
    if(cJSON_AddStringToObject(item, "name", ad_group_response->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->optimization_goal_metadata
    if(ad_group_response->optimization_goal_metadata) {
    cJSON *optimization_goal_metadata_local_JSON = optimization_goal_metadata_convertToJSON(ad_group_response->optimization_goal_metadata);
    if(optimization_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimization_goal_metadata", optimization_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_response->pacing_delivery_type
    if(ad_group_response->pacing_delivery_type) {
    cJSON *pacing_delivery_type_local_JSON = pacing_delivery_type_convertToJSON(ad_group_response->pacing_delivery_type);
    if(pacing_delivery_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "pacing_delivery_type", pacing_delivery_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->placement_group
    if(ad_group_response->placement_group) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(ad_group_response->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->promotion_application_level
    if(ad_group_response->promotion_application_level != pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_NULL) {
    if(cJSON_AddStringToObject(item, "promotion_application_level", ad_group_response_promotion_application_level_ToString(ad_group_response->promotion_application_level)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_group_response->promotion_id
    if(ad_group_response->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", ad_group_response->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->start_time
    if(ad_group_response->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", ad_group_response->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->status
    if(ad_group_response->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_group_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->targeting_spec
    if(ad_group_response->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_convertToJSON(ad_group_response->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_response->targeting_template_ids
    if(ad_group_response->targeting_template_ids) {
    cJSON *targeting_template_ids = cJSON_AddArrayToObject(item, "targeting_template_ids");
    if(targeting_template_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *targeting_template_idsListEntry;
    list_ForEach(targeting_template_idsListEntry, ad_group_response->targeting_template_ids) {
    if(cJSON_AddStringToObject(targeting_template_ids, "", targeting_template_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_response->tracking_urls
    if(ad_group_response->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(ad_group_response->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_response->ad_account_id
    if(ad_group_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_group_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->bid_multiplier
    if(ad_group_response->bid_multiplier) {
    if(cJSON_AddNumberToObject(item, "bid_multiplier", ad_group_response->bid_multiplier) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->conversion_learning_mode_type
    if(ad_group_response->conversion_learning_mode_type != pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_NULL) {
    if(cJSON_AddStringToObject(item, "conversion_learning_mode_type", ad_group_response_conversion_learning_mode_type_ToString(ad_group_response->conversion_learning_mode_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_group_response->created_time
    if(ad_group_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", ad_group_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_response->dca_assets
    if(ad_group_response->dca_assets) {
    cJSON *dca_assets_local_JSON = _convertToJSON(ad_group_response->dca_assets);
    if(dca_assets_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "dca_assets", dca_assets_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->feed_profile_id
    if(ad_group_response->feed_profile_id) {
    if(cJSON_AddStringToObject(item, "feed_profile_id", ad_group_response->feed_profile_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->id
    if(ad_group_response->id) {
    if(cJSON_AddStringToObject(item, "id", ad_group_response->id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->summary_status
    if(ad_group_response->summary_status) {
    cJSON *summary_status_local_JSON = ad_group_summary_status_convertToJSON(ad_group_response->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_response->type
    if(ad_group_response->type) {
    if(cJSON_AddStringToObject(item, "type", ad_group_response->type) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_response->updated_time
    if(ad_group_response->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", ad_group_response->updated_time) == NULL) {
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

ad_group_response_t *ad_group_response_parseFromJSON(cJSON *ad_group_responseJSON){

    ad_group_response_t *ad_group_response_local_var = NULL;

    // define the local variable for ad_group_response->billable_event
    pinterest_rest_api_action_type__e billable_event_local_nonprim = 0;

    // define the local variable for ad_group_response->budget_type
    budget_type_t *budget_type_local_nonprim = NULL;

    // define the local variable for ad_group_response->optimization_goal_metadata
    optimization_goal_metadata_t *optimization_goal_metadata_local_nonprim = NULL;

    // define the local variable for ad_group_response->pacing_delivery_type
    pacing_delivery_type_t *pacing_delivery_type_local_nonprim = NULL;

    // define the local variable for ad_group_response->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local variable for ad_group_response->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for ad_group_response->targeting_spec
    targeting_spec_t *targeting_spec_local_nonprim = NULL;

    // define the local list for ad_group_response->targeting_template_ids
    list_t *targeting_template_idsList = NULL;

    // define the local variable for ad_group_response->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for ad_group_response->dca_assets
    _t *dca_assets_local_nonprim = NULL;

    // define the local variable for ad_group_response->summary_status
    ad_group_summary_status_t *summary_status_local_nonprim = NULL;

    // ad_group_response->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "auto_targeting_enabled");
    if (cJSON_IsNull(auto_targeting_enabled)) {
        auto_targeting_enabled = NULL;
    }
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    }

    // ad_group_response->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "bid_in_micro_currency");
    if (cJSON_IsNull(bid_in_micro_currency)) {
        bid_in_micro_currency = NULL;
    }
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->bid_strategy_type
    cJSON *bid_strategy_type = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "bid_strategy_type");
    if (cJSON_IsNull(bid_strategy_type)) {
        bid_strategy_type = NULL;
    }
    pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_typeVariable;
    if (bid_strategy_type) { 
    if(!cJSON_IsString(bid_strategy_type))
    {
    goto end; //Enum
    }
    bid_strategy_typeVariable = ad_group_response_bid_strategy_type_FromString(bid_strategy_type->valuestring);
    }

    // ad_group_response->billable_event
    cJSON *billable_event = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "billable_event");
    if (cJSON_IsNull(billable_event)) {
        billable_event = NULL;
    }
    if (billable_event) { 
    billable_event_local_nonprim = action_type_parseFromJSON(billable_event); //custom
    }

    // ad_group_response->budget_in_micro_currency
    cJSON *budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "budget_in_micro_currency");
    if (cJSON_IsNull(budget_in_micro_currency)) {
        budget_in_micro_currency = NULL;
    }
    if (budget_in_micro_currency) { 
    if(!cJSON_IsNumber(budget_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->budget_type
    cJSON *budget_type = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "budget_type");
    if (cJSON_IsNull(budget_type)) {
        budget_type = NULL;
    }
    if (budget_type) { 
    budget_type_local_nonprim = budget_type_parseFromJSON(budget_type); //custom
    }

    // ad_group_response->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // ad_group_response->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->is_creative_optimization
    cJSON *is_creative_optimization = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "is_creative_optimization");
    if (cJSON_IsNull(is_creative_optimization)) {
        is_creative_optimization = NULL;
    }
    if (is_creative_optimization) { 
    if(!cJSON_IsBool(is_creative_optimization))
    {
    goto end; //Bool
    }
    }

    // ad_group_response->lifetime_frequency_cap
    cJSON *lifetime_frequency_cap = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "lifetime_frequency_cap");
    if (cJSON_IsNull(lifetime_frequency_cap)) {
        lifetime_frequency_cap = NULL;
    }
    if (lifetime_frequency_cap) { 
    if(!cJSON_IsNumber(lifetime_frequency_cap))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_group_response->optimization_goal_metadata
    cJSON *optimization_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "optimization_goal_metadata");
    if (cJSON_IsNull(optimization_goal_metadata)) {
        optimization_goal_metadata = NULL;
    }
    if (optimization_goal_metadata) { 
    optimization_goal_metadata_local_nonprim = optimization_goal_metadata_parseFromJSON(optimization_goal_metadata); //nonprimitive
    }

    // ad_group_response->pacing_delivery_type
    cJSON *pacing_delivery_type = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "pacing_delivery_type");
    if (cJSON_IsNull(pacing_delivery_type)) {
        pacing_delivery_type = NULL;
    }
    if (pacing_delivery_type) { 
    pacing_delivery_type_local_nonprim = pacing_delivery_type_parseFromJSON(pacing_delivery_type); //custom
    }

    // ad_group_response->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "placement_group");
    if (cJSON_IsNull(placement_group)) {
        placement_group = NULL;
    }
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_response->promotion_application_level
    cJSON *promotion_application_level = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "promotion_application_level");
    if (cJSON_IsNull(promotion_application_level)) {
        promotion_application_level = NULL;
    }
    pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_levelVariable;
    if (promotion_application_level) { 
    if(!cJSON_IsString(promotion_application_level))
    {
    goto end; //Enum
    }
    promotion_application_levelVariable = ad_group_response_promotion_application_level_FromString(promotion_application_level->valuestring);
    }

    // ad_group_response->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // ad_group_response->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_group_response->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "targeting_spec");
    if (cJSON_IsNull(targeting_spec)) {
        targeting_spec = NULL;
    }
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_parseFromJSON(targeting_spec); //nonprimitive
    }

    // ad_group_response->targeting_template_ids
    cJSON *targeting_template_ids = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "targeting_template_ids");
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

    // ad_group_response->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad_group_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_group_response->bid_multiplier
    cJSON *bid_multiplier = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "bid_multiplier");
    if (cJSON_IsNull(bid_multiplier)) {
        bid_multiplier = NULL;
    }
    if (bid_multiplier) { 
    if(!cJSON_IsNumber(bid_multiplier))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->conversion_learning_mode_type
    cJSON *conversion_learning_mode_type = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "conversion_learning_mode_type");
    if (cJSON_IsNull(conversion_learning_mode_type)) {
        conversion_learning_mode_type = NULL;
    }
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_typeVariable;
    if (conversion_learning_mode_type) { 
    if(!cJSON_IsString(conversion_learning_mode_type))
    {
    goto end; //Enum
    }
    conversion_learning_mode_typeVariable = ad_group_response_conversion_learning_mode_type_FromString(conversion_learning_mode_type->valuestring);
    }

    // ad_group_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // ad_group_response->dca_assets
    cJSON *dca_assets = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "dca_assets");
    if (cJSON_IsNull(dca_assets)) {
        dca_assets = NULL;
    }
    if (dca_assets) { 
    dca_assets_local_nonprim = _parseFromJSON(dca_assets); //custom
    }

    // ad_group_response->feed_profile_id
    cJSON *feed_profile_id = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "feed_profile_id");
    if (cJSON_IsNull(feed_profile_id)) {
        feed_profile_id = NULL;
    }
    if (feed_profile_id) { 
    if(!cJSON_IsString(feed_profile_id) && !cJSON_IsNull(feed_profile_id))
    {
    goto end; //String
    }
    }

    // ad_group_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ad_group_response->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "summary_status");
    if (cJSON_IsNull(summary_status)) {
        summary_status = NULL;
    }
    if (summary_status) { 
    summary_status_local_nonprim = ad_group_summary_status_parseFromJSON(summary_status); //custom
    }

    // ad_group_response->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // ad_group_response->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(ad_group_responseJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }


    ad_group_response_local_var = ad_group_response_create_internal (
        auto_targeting_enabled ? auto_targeting_enabled->valueint : 0,
        bid_in_micro_currency ? bid_in_micro_currency->valuedouble : 0,
        bid_strategy_type ? bid_strategy_typeVariable : pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_NULL,
        billable_event ? billable_event_local_nonprim : 0,
        budget_in_micro_currency ? budget_in_micro_currency->valuedouble : 0,
        budget_type ? budget_type_local_nonprim : NULL,
        campaign_id && !cJSON_IsNull(campaign_id) ? strdup(campaign_id->valuestring) : NULL,
        end_time ? end_time->valuedouble : 0,
        is_creative_optimization ? is_creative_optimization->valueint : 0,
        lifetime_frequency_cap ? lifetime_frequency_cap->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        optimization_goal_metadata ? optimization_goal_metadata_local_nonprim : NULL,
        pacing_delivery_type ? pacing_delivery_type_local_nonprim : NULL,
        placement_group ? placement_group_local_nonprim : NULL,
        promotion_application_level ? promotion_application_levelVariable : pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_NULL,
        promotion_id && !cJSON_IsNull(promotion_id) ? strdup(promotion_id->valuestring) : NULL,
        start_time ? start_time->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        targeting_spec ? targeting_spec_local_nonprim : NULL,
        targeting_template_ids ? targeting_template_idsList : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        bid_multiplier ? bid_multiplier->valuedouble : 0,
        conversion_learning_mode_type ? conversion_learning_mode_typeVariable : pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_NULL,
        created_time ? created_time->valuedouble : 0,
        dca_assets ? dca_assets_local_nonprim : NULL,
        feed_profile_id && !cJSON_IsNull(feed_profile_id) ? strdup(feed_profile_id->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        summary_status ? summary_status_local_nonprim : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        updated_time ? updated_time->valuedouble : 0
        );

    return ad_group_response_local_var;
end:
    if (billable_event_local_nonprim) {
        billable_event_local_nonprim = 0;
    }
    if (budget_type_local_nonprim) {
        budget_type_free(budget_type_local_nonprim);
        budget_type_local_nonprim = NULL;
    }
    if (optimization_goal_metadata_local_nonprim) {
        optimization_goal_metadata_free(optimization_goal_metadata_local_nonprim);
        optimization_goal_metadata_local_nonprim = NULL;
    }
    if (pacing_delivery_type_local_nonprim) {
        pacing_delivery_type_free(pacing_delivery_type_local_nonprim);
        pacing_delivery_type_local_nonprim = NULL;
    }
    if (placement_group_local_nonprim) {
        placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (targeting_spec_local_nonprim) {
        targeting_spec_free(targeting_spec_local_nonprim);
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
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (dca_assets_local_nonprim) {
        _free(dca_assets_local_nonprim);
        dca_assets_local_nonprim = NULL;
    }
    if (summary_status_local_nonprim) {
        ad_group_summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    return NULL;

}
