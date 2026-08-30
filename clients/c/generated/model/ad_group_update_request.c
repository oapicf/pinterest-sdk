#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_update_request.h"


char* ad_group_update_request_promotion_application_level_ToString(pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level) {
    char* promotion_application_levelArray[] =  { "NULL", "NONE", "ITEM", "AD_GROUP", "" };
    return promotion_application_levelArray[promotion_application_level];
}

pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_e ad_group_update_request_promotion_application_level_FromString(char* promotion_application_level){
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

static ad_group_update_request_t *ad_group_update_request_create_internal(
    double *bid_multiplier,
    char *id,
    list_t *targeting_spec_operations,
    int *auto_targeting_enabled,
    int *bid_in_micro_currency,
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int *budget_in_micro_currency,
    pinterest_rest_api_budget_type__e budget_type,
    char *campaign_id,
    int *end_time,
    int *is_creative_optimization,
    int *lifetime_frequency_cap,
    char *name,
    object_t *optimization_goal_metadata,
    pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type,
    placement_group_type_t *placement_group,
    pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level,
    char *promotion_id,
    list_t *promotion_ids,
    int *start_time,
    entity_status_t *status,
    targeting_spec_t *targeting_spec,
    list_t *targeting_template_ids,
    object_t *tracking_urls
    ) {
    ad_group_update_request_t *ad_group_update_request_local_var = malloc(sizeof(ad_group_update_request_t));
    if (!ad_group_update_request_local_var) {
        return NULL;
    }
    memset(ad_group_update_request_local_var, 0, sizeof(ad_group_update_request_t));
    ad_group_update_request_local_var->_library_owned = 1;
    ad_group_update_request_local_var->bid_multiplier = bid_multiplier;
    ad_group_update_request_local_var->id = id;
    ad_group_update_request_local_var->targeting_spec_operations = targeting_spec_operations;
    ad_group_update_request_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_update_request_local_var->bid_in_micro_currency = bid_in_micro_currency;
    ad_group_update_request_local_var->bid_strategy_type = bid_strategy_type;
    ad_group_update_request_local_var->billable_event = billable_event;
    ad_group_update_request_local_var->budget_in_micro_currency = budget_in_micro_currency;
    ad_group_update_request_local_var->budget_type = budget_type;
    ad_group_update_request_local_var->campaign_id = campaign_id;
    ad_group_update_request_local_var->end_time = end_time;
    ad_group_update_request_local_var->is_creative_optimization = is_creative_optimization;
    ad_group_update_request_local_var->lifetime_frequency_cap = lifetime_frequency_cap;
    ad_group_update_request_local_var->name = name;
    ad_group_update_request_local_var->optimization_goal_metadata = optimization_goal_metadata;
    ad_group_update_request_local_var->pacing_delivery_type = pacing_delivery_type;
    ad_group_update_request_local_var->placement_group = placement_group;
    ad_group_update_request_local_var->promotion_application_level = promotion_application_level;
    ad_group_update_request_local_var->promotion_id = promotion_id;
    ad_group_update_request_local_var->promotion_ids = promotion_ids;
    ad_group_update_request_local_var->start_time = start_time;
    ad_group_update_request_local_var->status = status;
    ad_group_update_request_local_var->targeting_spec = targeting_spec;
    ad_group_update_request_local_var->targeting_template_ids = targeting_template_ids;
    ad_group_update_request_local_var->tracking_urls = tracking_urls;
    return ad_group_update_request_local_var;
}

__attribute__((deprecated)) ad_group_update_request_t *ad_group_update_request_create(
    double *bid_multiplier,
    char *id,
    list_t *targeting_spec_operations,
    int *auto_targeting_enabled,
    int *bid_in_micro_currency,
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int *budget_in_micro_currency,
    pinterest_rest_api_budget_type__e budget_type,
    char *campaign_id,
    int *end_time,
    int *is_creative_optimization,
    int *lifetime_frequency_cap,
    char *name,
    object_t *optimization_goal_metadata,
    pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type,
    placement_group_type_t *placement_group,
    pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level,
    char *promotion_id,
    list_t *promotion_ids,
    int *start_time,
    entity_status_t *status,
    targeting_spec_t *targeting_spec,
    list_t *targeting_template_ids,
    object_t *tracking_urls
    ) {
    double *bid_multiplier_copy = NULL;
    if (bid_multiplier) {
        bid_multiplier_copy = malloc(sizeof(double));
        if (bid_multiplier_copy) *bid_multiplier_copy = *bid_multiplier;
    }
    int *auto_targeting_enabled_copy = NULL;
    if (auto_targeting_enabled) {
        auto_targeting_enabled_copy = malloc(sizeof(int));
        if (auto_targeting_enabled_copy) *auto_targeting_enabled_copy = *auto_targeting_enabled;
    }
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
    int *lifetime_frequency_cap_copy = NULL;
    if (lifetime_frequency_cap) {
        lifetime_frequency_cap_copy = malloc(sizeof(int));
        if (lifetime_frequency_cap_copy) *lifetime_frequency_cap_copy = *lifetime_frequency_cap;
    }
    int *start_time_copy = NULL;
    if (start_time) {
        start_time_copy = malloc(sizeof(int));
        if (start_time_copy) *start_time_copy = *start_time;
    }
    ad_group_update_request_t *result = ad_group_update_request_create_internal (
        bid_multiplier_copy,
        id,
        targeting_spec_operations,
        auto_targeting_enabled_copy,
        bid_in_micro_currency_copy,
        bid_strategy_type,
        billable_event,
        budget_in_micro_currency_copy,
        budget_type,
        campaign_id,
        end_time_copy,
        is_creative_optimization_copy,
        lifetime_frequency_cap_copy,
        name,
        optimization_goal_metadata,
        pacing_delivery_type,
        placement_group,
        promotion_application_level,
        promotion_id,
        promotion_ids,
        start_time_copy,
        status,
        targeting_spec,
        targeting_template_ids,
        tracking_urls
        );
    if (!result) {
        free(bid_multiplier_copy);
        free(auto_targeting_enabled_copy);
        free(bid_in_micro_currency_copy);
        free(budget_in_micro_currency_copy);
        free(end_time_copy);
        free(is_creative_optimization_copy);
        free(lifetime_frequency_cap_copy);
        free(start_time_copy);
    }
    return result;
}

void ad_group_update_request_free(ad_group_update_request_t *ad_group_update_request) {
    if(NULL == ad_group_update_request){
        return ;
    }
    if(ad_group_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_update_request->bid_multiplier) {
        free(ad_group_update_request->bid_multiplier);
        ad_group_update_request->bid_multiplier = NULL;
    }
    if (ad_group_update_request->id) {
        free(ad_group_update_request->id);
        ad_group_update_request->id = NULL;
    }
    if (ad_group_update_request->targeting_spec_operations) {
        list_ForEach(listEntry, ad_group_update_request->targeting_spec_operations) {
            targeting_spec_operations_free(listEntry->data);
        }
        list_freeList(ad_group_update_request->targeting_spec_operations);
        ad_group_update_request->targeting_spec_operations = NULL;
    }
    if (ad_group_update_request->auto_targeting_enabled) {
        free(ad_group_update_request->auto_targeting_enabled);
        ad_group_update_request->auto_targeting_enabled = NULL;
    }
    if (ad_group_update_request->bid_in_micro_currency) {
        free(ad_group_update_request->bid_in_micro_currency);
        ad_group_update_request->bid_in_micro_currency = NULL;
    }
    if (ad_group_update_request->budget_in_micro_currency) {
        free(ad_group_update_request->budget_in_micro_currency);
        ad_group_update_request->budget_in_micro_currency = NULL;
    }
    if (ad_group_update_request->campaign_id) {
        free(ad_group_update_request->campaign_id);
        ad_group_update_request->campaign_id = NULL;
    }
    if (ad_group_update_request->end_time) {
        free(ad_group_update_request->end_time);
        ad_group_update_request->end_time = NULL;
    }
    if (ad_group_update_request->is_creative_optimization) {
        free(ad_group_update_request->is_creative_optimization);
        ad_group_update_request->is_creative_optimization = NULL;
    }
    if (ad_group_update_request->lifetime_frequency_cap) {
        free(ad_group_update_request->lifetime_frequency_cap);
        ad_group_update_request->lifetime_frequency_cap = NULL;
    }
    if (ad_group_update_request->name) {
        free(ad_group_update_request->name);
        ad_group_update_request->name = NULL;
    }
    if (ad_group_update_request->optimization_goal_metadata) {
        object_free(ad_group_update_request->optimization_goal_metadata);
        ad_group_update_request->optimization_goal_metadata = NULL;
    }
    if (ad_group_update_request->placement_group) {
        placement_group_type_free(ad_group_update_request->placement_group);
        ad_group_update_request->placement_group = NULL;
    }
    if (ad_group_update_request->promotion_id) {
        free(ad_group_update_request->promotion_id);
        ad_group_update_request->promotion_id = NULL;
    }
    if (ad_group_update_request->promotion_ids) {
        list_ForEach(listEntry, ad_group_update_request->promotion_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_update_request->promotion_ids);
        ad_group_update_request->promotion_ids = NULL;
    }
    if (ad_group_update_request->start_time) {
        free(ad_group_update_request->start_time);
        ad_group_update_request->start_time = NULL;
    }
    if (ad_group_update_request->status) {
        entity_status_free(ad_group_update_request->status);
        ad_group_update_request->status = NULL;
    }
    if (ad_group_update_request->targeting_spec) {
        targeting_spec_free(ad_group_update_request->targeting_spec);
        ad_group_update_request->targeting_spec = NULL;
    }
    if (ad_group_update_request->targeting_template_ids) {
        list_ForEach(listEntry, ad_group_update_request->targeting_template_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_update_request->targeting_template_ids);
        ad_group_update_request->targeting_template_ids = NULL;
    }
    if (ad_group_update_request->tracking_urls) {
        object_free(ad_group_update_request->tracking_urls);
        ad_group_update_request->tracking_urls = NULL;
    }
    free(ad_group_update_request);
}

cJSON *ad_group_update_request_convertToJSON(ad_group_update_request_t *ad_group_update_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_update_request->bid_multiplier
    if(ad_group_update_request->bid_multiplier) {
    if(cJSON_AddNumberToObject(item, "bid_multiplier", *ad_group_update_request->bid_multiplier) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request->id
    if (!ad_group_update_request->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_group_update_request->id) == NULL) {
    goto fail; //String
    }


    // ad_group_update_request->targeting_spec_operations
    if(ad_group_update_request->targeting_spec_operations) {
    cJSON *targeting_spec_operations = cJSON_AddArrayToObject(item, "targeting_spec_operations");
    if(targeting_spec_operations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *targeting_spec_operationsListEntry;
    if (ad_group_update_request->targeting_spec_operations) {
    list_ForEach(targeting_spec_operationsListEntry, ad_group_update_request->targeting_spec_operations) {
    cJSON *itemLocal = targeting_spec_operations_convertToJSON(targeting_spec_operationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(targeting_spec_operations, itemLocal);
    }
    }
    }


    // ad_group_update_request->auto_targeting_enabled
    if(ad_group_update_request->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", *ad_group_update_request->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_update_request->bid_in_micro_currency
    if(ad_group_update_request->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", *ad_group_update_request->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request->bid_strategy_type
    if(ad_group_update_request->bid_strategy_type != pinterest_rest_api_bid_strategy_type__NULL) {
    cJSON *bid_strategy_type_local_JSON = bid_strategy_type_convertToJSON(ad_group_update_request->bid_strategy_type);
    if(bid_strategy_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "bid_strategy_type", bid_strategy_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_update_request->billable_event
    if(ad_group_update_request->billable_event != pinterest_rest_api_action_type__NULL) {
    cJSON *billable_event_local_JSON = action_type_convertToJSON(ad_group_update_request->billable_event);
    if(billable_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "billable_event", billable_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_update_request->budget_in_micro_currency
    if(ad_group_update_request->budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "budget_in_micro_currency", *ad_group_update_request->budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request->budget_type
    if(ad_group_update_request->budget_type != pinterest_rest_api_budget_type__NULL) {
    cJSON *budget_type_local_JSON = budget_type_convertToJSON(ad_group_update_request->budget_type);
    if(budget_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "budget_type", budget_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_update_request->campaign_id
    if(ad_group_update_request->campaign_id) {
    if(cJSON_AddStringToObject(item, "campaign_id", ad_group_update_request->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_update_request->end_time
    if(ad_group_update_request->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", *ad_group_update_request->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request->is_creative_optimization
    if(ad_group_update_request->is_creative_optimization) {
    if(cJSON_AddBoolToObject(item, "is_creative_optimization", *ad_group_update_request->is_creative_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_update_request->lifetime_frequency_cap
    if(ad_group_update_request->lifetime_frequency_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency_cap", *ad_group_update_request->lifetime_frequency_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request->name
    if(ad_group_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", ad_group_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_update_request->optimization_goal_metadata
    if(ad_group_update_request->optimization_goal_metadata) {
    cJSON *optimization_goal_metadata_object = object_convertToJSON(ad_group_update_request->optimization_goal_metadata);
    if(optimization_goal_metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimization_goal_metadata", optimization_goal_metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_update_request->pacing_delivery_type
    if(ad_group_update_request->pacing_delivery_type != pinterest_rest_api_pacing_delivery_type__NULL) {
    cJSON *pacing_delivery_type_local_JSON = pacing_delivery_type_convertToJSON(ad_group_update_request->pacing_delivery_type);
    if(pacing_delivery_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "pacing_delivery_type", pacing_delivery_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_update_request->placement_group
    if(ad_group_update_request->placement_group) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(ad_group_update_request->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_update_request->promotion_application_level
    if(ad_group_update_request->promotion_application_level != pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_NULL) {
    if(cJSON_AddStringToObject(item, "promotion_application_level", ad_group_update_request_promotion_application_level_ToString(ad_group_update_request->promotion_application_level)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_group_update_request->promotion_id
    if(ad_group_update_request->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", ad_group_update_request->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_update_request->promotion_ids
    if(ad_group_update_request->promotion_ids) {
    cJSON *promotion_ids = cJSON_AddArrayToObject(item, "promotion_ids");
    if(promotion_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *promotion_idsListEntry;
    list_ForEach(promotion_idsListEntry, ad_group_update_request->promotion_ids) {
    if(cJSON_AddStringToObject(promotion_ids, "", promotion_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_update_request->start_time
    if(ad_group_update_request->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", *ad_group_update_request->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request->status
    if(ad_group_update_request->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_group_update_request->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_update_request->targeting_spec
    if(ad_group_update_request->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_convertToJSON(ad_group_update_request->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_update_request->targeting_template_ids
    if(ad_group_update_request->targeting_template_ids) {
    cJSON *targeting_template_ids = cJSON_AddArrayToObject(item, "targeting_template_ids");
    if(targeting_template_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *targeting_template_idsListEntry;
    list_ForEach(targeting_template_idsListEntry, ad_group_update_request->targeting_template_ids) {
    if(cJSON_AddStringToObject(targeting_template_ids, "", targeting_template_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_group_update_request->tracking_urls
    if(ad_group_update_request->tracking_urls) {
    cJSON *tracking_urls_object = object_convertToJSON(ad_group_update_request->tracking_urls);
    if(tracking_urls_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_object);
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

ad_group_update_request_t *ad_group_update_request_parseFromJSON(cJSON *ad_group_update_requestJSON){

    ad_group_update_request_t *ad_group_update_request_local_var = NULL;

    // define the local variable for ad_group_update_request->bid_multiplier
    double *bid_multiplier_local_var = NULL;

    char *id_local_str = NULL;

    // define the local list for ad_group_update_request->targeting_spec_operations
    list_t *targeting_spec_operationsList = NULL;

    // define the local variable for ad_group_update_request->auto_targeting_enabled
    int *auto_targeting_enabled_local_var = NULL;

    // define the local variable for ad_group_update_request->bid_in_micro_currency
    int *bid_in_micro_currency_local_var = NULL;

    // define the local variable for ad_group_update_request->bid_strategy_type
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type_local_nonprim = 0;

    // define the local variable for ad_group_update_request->billable_event
    pinterest_rest_api_action_type__e billable_event_local_nonprim = 0;

    // define the local variable for ad_group_update_request->budget_in_micro_currency
    int *budget_in_micro_currency_local_var = NULL;

    // define the local variable for ad_group_update_request->budget_type
    pinterest_rest_api_budget_type__e budget_type_local_nonprim = 0;

    char *campaign_id_local_str = NULL;

    // define the local variable for ad_group_update_request->end_time
    int *end_time_local_var = NULL;

    // define the local variable for ad_group_update_request->is_creative_optimization
    int *is_creative_optimization_local_var = NULL;

    // define the local variable for ad_group_update_request->lifetime_frequency_cap
    int *lifetime_frequency_cap_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for ad_group_update_request->pacing_delivery_type
    pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type_local_nonprim = 0;

    // define the local variable for ad_group_update_request->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    char *promotion_id_local_str = NULL;

    // define the local list for ad_group_update_request->promotion_ids
    list_t *promotion_idsList = NULL;

    // define the local variable for ad_group_update_request->start_time
    int *start_time_local_var = NULL;

    // define the local variable for ad_group_update_request->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for ad_group_update_request->targeting_spec
    targeting_spec_t *targeting_spec_local_nonprim = NULL;

    // define the local list for ad_group_update_request->targeting_template_ids
    list_t *targeting_template_idsList = NULL;

    // ad_group_update_request->bid_multiplier
    cJSON *bid_multiplier = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "bid_multiplier");
    if (cJSON_IsNull(bid_multiplier)) {
        bid_multiplier = NULL;
    }
    if (bid_multiplier) { 
    if(!cJSON_IsNumber(bid_multiplier))
    {
    goto end; //Numeric
    }
    bid_multiplier_local_var = malloc(sizeof(double));
    if(!bid_multiplier_local_var)
    {
        goto end;
    }
    *bid_multiplier_local_var = bid_multiplier->valuedouble;
    }

    // ad_group_update_request->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "id");
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

    // ad_group_update_request->targeting_spec_operations
    cJSON *targeting_spec_operations = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "targeting_spec_operations");
    if (cJSON_IsNull(targeting_spec_operations)) {
        targeting_spec_operations = NULL;
    }
    if (targeting_spec_operations) { 
    cJSON *targeting_spec_operations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(targeting_spec_operations)){
        goto end; //nonprimitive container
    }

    targeting_spec_operationsList = list_createList();

    cJSON_ArrayForEach(targeting_spec_operations_local_nonprimitive,targeting_spec_operations )
    {
        if(!cJSON_IsObject(targeting_spec_operations_local_nonprimitive)){
            goto end;
        }
        targeting_spec_operations_t *targeting_spec_operationsItem = targeting_spec_operations_parseFromJSON(targeting_spec_operations_local_nonprimitive);

        list_addElement(targeting_spec_operationsList, targeting_spec_operationsItem);
    }
    }

    // ad_group_update_request->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "auto_targeting_enabled");
    if (cJSON_IsNull(auto_targeting_enabled)) {
        auto_targeting_enabled = NULL;
    }
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    auto_targeting_enabled_local_var = malloc(sizeof(int));
    if(!auto_targeting_enabled_local_var)
    {
        goto end;
    }
    *auto_targeting_enabled_local_var = auto_targeting_enabled->valueint;
    }

    // ad_group_update_request->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "bid_in_micro_currency");
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

    // ad_group_update_request->bid_strategy_type
    cJSON *bid_strategy_type = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "bid_strategy_type");
    if (cJSON_IsNull(bid_strategy_type)) {
        bid_strategy_type = NULL;
    }
    if (bid_strategy_type) { 
    bid_strategy_type_local_nonprim = bid_strategy_type_parseFromJSON(bid_strategy_type); //custom
    }

    // ad_group_update_request->billable_event
    cJSON *billable_event = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "billable_event");
    if (cJSON_IsNull(billable_event)) {
        billable_event = NULL;
    }
    if (billable_event) { 
    billable_event_local_nonprim = action_type_parseFromJSON(billable_event); //custom
    }

    // ad_group_update_request->budget_in_micro_currency
    cJSON *budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "budget_in_micro_currency");
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

    // ad_group_update_request->budget_type
    cJSON *budget_type = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "budget_type");
    if (cJSON_IsNull(budget_type)) {
        budget_type = NULL;
    }
    if (budget_type) { 
    budget_type_local_nonprim = budget_type_parseFromJSON(budget_type); //custom
    }

    // ad_group_update_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // ad_group_update_request->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "end_time");
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

    // ad_group_update_request->is_creative_optimization
    cJSON *is_creative_optimization = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "is_creative_optimization");
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

    // ad_group_update_request->lifetime_frequency_cap
    cJSON *lifetime_frequency_cap = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "lifetime_frequency_cap");
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

    // ad_group_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_group_update_request->optimization_goal_metadata
    cJSON *optimization_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "optimization_goal_metadata");
    if (cJSON_IsNull(optimization_goal_metadata)) {
        optimization_goal_metadata = NULL;
    }
    object_t *optimization_goal_metadata_local_object = NULL;
    if (optimization_goal_metadata) { 
    optimization_goal_metadata_local_object = object_parseFromJSON(optimization_goal_metadata); //object
    }

    // ad_group_update_request->pacing_delivery_type
    cJSON *pacing_delivery_type = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "pacing_delivery_type");
    if (cJSON_IsNull(pacing_delivery_type)) {
        pacing_delivery_type = NULL;
    }
    if (pacing_delivery_type) { 
    pacing_delivery_type_local_nonprim = pacing_delivery_type_parseFromJSON(pacing_delivery_type); //custom
    }

    // ad_group_update_request->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "placement_group");
    if (cJSON_IsNull(placement_group)) {
        placement_group = NULL;
    }
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_update_request->promotion_application_level
    cJSON *promotion_application_level = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "promotion_application_level");
    if (cJSON_IsNull(promotion_application_level)) {
        promotion_application_level = NULL;
    }
    pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_levelVariable;
    if (promotion_application_level) { 
    if(!cJSON_IsString(promotion_application_level))
    {
    goto end; //Enum
    }
    promotion_application_levelVariable = ad_group_update_request_promotion_application_level_FromString(promotion_application_level->valuestring);
    }

    // ad_group_update_request->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // ad_group_update_request->promotion_ids
    cJSON *promotion_ids = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "promotion_ids");
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

    // ad_group_update_request->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "start_time");
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

    // ad_group_update_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_group_update_request->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "targeting_spec");
    if (cJSON_IsNull(targeting_spec)) {
        targeting_spec = NULL;
    }
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_parseFromJSON(targeting_spec); //nonprimitive
    }

    // ad_group_update_request->targeting_template_ids
    cJSON *targeting_template_ids = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "targeting_template_ids");
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

    // ad_group_update_request->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_group_update_requestJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    object_t *tracking_urls_local_object = NULL;
    if (tracking_urls) { 
    tracking_urls_local_object = object_parseFromJSON(tracking_urls); //object
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (campaign_id && !cJSON_IsNull(campaign_id)) campaign_id_local_str = strdup(campaign_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (promotion_id && !cJSON_IsNull(promotion_id)) promotion_id_local_str = strdup(promotion_id->valuestring);

    ad_group_update_request_local_var = ad_group_update_request_create_internal (
        bid_multiplier_local_var,
        id_local_str,
        targeting_spec_operations ? targeting_spec_operationsList : NULL,
        auto_targeting_enabled_local_var,
        bid_in_micro_currency_local_var,
        bid_strategy_type ? bid_strategy_type_local_nonprim : 0,
        billable_event ? billable_event_local_nonprim : 0,
        budget_in_micro_currency_local_var,
        budget_type ? budget_type_local_nonprim : 0,
        campaign_id_local_str,
        end_time_local_var,
        is_creative_optimization_local_var,
        lifetime_frequency_cap_local_var,
        name_local_str,
        optimization_goal_metadata ? optimization_goal_metadata_local_object : NULL,
        pacing_delivery_type ? pacing_delivery_type_local_nonprim : 0,
        placement_group ? placement_group_local_nonprim : NULL,
        promotion_application_level ? promotion_application_levelVariable : pinterest_rest_api_ad_group_update_request_PROMOTIONAPPLICATIONLEVEL_NULL,
        promotion_id_local_str,
        promotion_ids ? promotion_idsList : NULL,
        start_time_local_var,
        status ? status_local_nonprim : NULL,
        targeting_spec ? targeting_spec_local_nonprim : NULL,
        targeting_template_ids ? targeting_template_idsList : NULL,
        tracking_urls ? tracking_urls_local_object : NULL
        );

    if (!ad_group_update_request_local_var) {
        goto end;
    }

    return ad_group_update_request_local_var;
end:
    if (bid_multiplier_local_var) {
        free(bid_multiplier_local_var);
        bid_multiplier_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (targeting_spec_operationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_spec_operationsList) {
            targeting_spec_operations_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_spec_operationsList);
        targeting_spec_operationsList = NULL;
    }
    if (auto_targeting_enabled_local_var) {
        free(auto_targeting_enabled_local_var);
        auto_targeting_enabled_local_var = NULL;
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
    if (budget_type_local_nonprim) {
        budget_type_local_nonprim = 0;
    }
    if (campaign_id_local_str) {
        free(campaign_id_local_str);
        campaign_id_local_str = NULL;
    }
    if (end_time_local_var) {
        free(end_time_local_var);
        end_time_local_var = NULL;
    }
    if (is_creative_optimization_local_var) {
        free(is_creative_optimization_local_var);
        is_creative_optimization_local_var = NULL;
    }
    if (lifetime_frequency_cap_local_var) {
        free(lifetime_frequency_cap_local_var);
        lifetime_frequency_cap_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (pacing_delivery_type_local_nonprim) {
        pacing_delivery_type_local_nonprim = 0;
    }
    if (placement_group_local_nonprim) {
        placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
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
    return NULL;

}
