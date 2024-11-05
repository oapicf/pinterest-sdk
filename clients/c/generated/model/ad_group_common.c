#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_common.h"


char* ad_group_common_billable_event_ToString(pinterest_rest_api_ad_group_common__e billable_event) {
    char* billable_eventArray[] =  { "NULL", "CLICKTHROUGH", "IMPRESSION", "VIDEO_V_50_MRC" };
    return billable_eventArray[billable_event];
}

pinterest_rest_api_ad_group_common__e ad_group_common_billable_event_FromString(char* billable_event){
    int stringToReturn = 0;
    char *billable_eventArray[] =  { "NULL", "CLICKTHROUGH", "IMPRESSION", "VIDEO_V_50_MRC" };
    size_t sizeofArray = sizeof(billable_eventArray) / sizeof(billable_eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billable_event, billable_eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* ad_group_common_bid_strategy_type_ToString(pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_e bid_strategy_type) {
    char* bid_strategy_typeArray[] =  { "NULL", "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "" };
    return bid_strategy_typeArray[bid_strategy_type];
}

pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_e ad_group_common_bid_strategy_type_FromString(char* bid_strategy_type){
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

ad_group_common_t *ad_group_common_create(
    char *name,
    entity_status_t *status,
    int budget_in_micro_currency,
    int bid_in_micro_currency,
    optimization_goal_metadata_t *optimization_goal_metadata,
    budget_type_t *budget_type,
    int start_time,
    int end_time,
    targeting_spec_t *targeting_spec,
    int lifetime_frequency_cap,
    tracking_urls_t *tracking_urls,
    int auto_targeting_enabled,
    placement_group_type_t *placement_group,
    pacing_delivery_type_t *pacing_delivery_type,
    char *campaign_id,
    action_type_t *billable_event,
    pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_e bid_strategy_type,
    list_t *targeting_template_ids
    ) {
    ad_group_common_t *ad_group_common_local_var = malloc(sizeof(ad_group_common_t));
    if (!ad_group_common_local_var) {
        return NULL;
    }
    ad_group_common_local_var->name = name;
    ad_group_common_local_var->status = status;
    ad_group_common_local_var->budget_in_micro_currency = budget_in_micro_currency;
    ad_group_common_local_var->bid_in_micro_currency = bid_in_micro_currency;
    ad_group_common_local_var->optimization_goal_metadata = optimization_goal_metadata;
    ad_group_common_local_var->budget_type = budget_type;
    ad_group_common_local_var->start_time = start_time;
    ad_group_common_local_var->end_time = end_time;
    ad_group_common_local_var->targeting_spec = targeting_spec;
    ad_group_common_local_var->lifetime_frequency_cap = lifetime_frequency_cap;
    ad_group_common_local_var->tracking_urls = tracking_urls;
    ad_group_common_local_var->auto_targeting_enabled = auto_targeting_enabled;
    ad_group_common_local_var->placement_group = placement_group;
    ad_group_common_local_var->pacing_delivery_type = pacing_delivery_type;
    ad_group_common_local_var->campaign_id = campaign_id;
    ad_group_common_local_var->billable_event = billable_event;
    ad_group_common_local_var->bid_strategy_type = bid_strategy_type;
    ad_group_common_local_var->targeting_template_ids = targeting_template_ids;

    return ad_group_common_local_var;
}


void ad_group_common_free(ad_group_common_t *ad_group_common) {
    if(NULL == ad_group_common){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_common->name) {
        free(ad_group_common->name);
        ad_group_common->name = NULL;
    }
    if (ad_group_common->status) {
        entity_status_free(ad_group_common->status);
        ad_group_common->status = NULL;
    }
    if (ad_group_common->optimization_goal_metadata) {
        optimization_goal_metadata_free(ad_group_common->optimization_goal_metadata);
        ad_group_common->optimization_goal_metadata = NULL;
    }
    if (ad_group_common->budget_type) {
        budget_type_free(ad_group_common->budget_type);
        ad_group_common->budget_type = NULL;
    }
    if (ad_group_common->targeting_spec) {
        targeting_spec_free(ad_group_common->targeting_spec);
        ad_group_common->targeting_spec = NULL;
    }
    if (ad_group_common->tracking_urls) {
        tracking_urls_free(ad_group_common->tracking_urls);
        ad_group_common->tracking_urls = NULL;
    }
    if (ad_group_common->placement_group) {
        placement_group_type_free(ad_group_common->placement_group);
        ad_group_common->placement_group = NULL;
    }
    if (ad_group_common->pacing_delivery_type) {
        pacing_delivery_type_free(ad_group_common->pacing_delivery_type);
        ad_group_common->pacing_delivery_type = NULL;
    }
    if (ad_group_common->campaign_id) {
        free(ad_group_common->campaign_id);
        ad_group_common->campaign_id = NULL;
    }
    if (ad_group_common->billable_event) {
        action_type_free(ad_group_common->billable_event);
        ad_group_common->billable_event = NULL;
    }
    if (ad_group_common->targeting_template_ids) {
        list_ForEach(listEntry, ad_group_common->targeting_template_ids) {
            free(listEntry->data);
        }
        list_freeList(ad_group_common->targeting_template_ids);
        ad_group_common->targeting_template_ids = NULL;
    }
    free(ad_group_common);
}

cJSON *ad_group_common_convertToJSON(ad_group_common_t *ad_group_common) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_common->name
    if(ad_group_common->name) {
    if(cJSON_AddStringToObject(item, "name", ad_group_common->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_common->status
    if(ad_group_common->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_group_common->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_common->budget_in_micro_currency
    if(ad_group_common->budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "budget_in_micro_currency", ad_group_common->budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_common->bid_in_micro_currency
    if(ad_group_common->bid_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "bid_in_micro_currency", ad_group_common->bid_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_common->optimization_goal_metadata
    if(ad_group_common->optimization_goal_metadata) {
    cJSON *optimization_goal_metadata_local_JSON = optimization_goal_metadata_convertToJSON(ad_group_common->optimization_goal_metadata);
    if(optimization_goal_metadata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "optimization_goal_metadata", optimization_goal_metadata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_common->budget_type
    if(ad_group_common->budget_type) {
    cJSON *budget_type_local_JSON = budget_type_convertToJSON(ad_group_common->budget_type);
    if(budget_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "budget_type", budget_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_common->start_time
    if(ad_group_common->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", ad_group_common->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_common->end_time
    if(ad_group_common->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", ad_group_common->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_common->targeting_spec
    if(ad_group_common->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_convertToJSON(ad_group_common->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_common->lifetime_frequency_cap
    if(ad_group_common->lifetime_frequency_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_frequency_cap", ad_group_common->lifetime_frequency_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_common->tracking_urls
    if(ad_group_common->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(ad_group_common->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_group_common->auto_targeting_enabled
    if(ad_group_common->auto_targeting_enabled) {
    if(cJSON_AddBoolToObject(item, "auto_targeting_enabled", ad_group_common->auto_targeting_enabled) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_group_common->placement_group
    if(ad_group_common->placement_group) {
    cJSON *placement_group_local_JSON = placement_group_type_convertToJSON(ad_group_common->placement_group);
    if(placement_group_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_group", placement_group_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_common->pacing_delivery_type
    if(ad_group_common->pacing_delivery_type) {
    cJSON *pacing_delivery_type_local_JSON = pacing_delivery_type_convertToJSON(ad_group_common->pacing_delivery_type);
    if(pacing_delivery_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "pacing_delivery_type", pacing_delivery_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_common->campaign_id
    if(ad_group_common->campaign_id) {
    if(cJSON_AddStringToObject(item, "campaign_id", ad_group_common->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_group_common->billable_event
    if(ad_group_common->billable_event != pinterest_rest_api_ad_group_common__NULL) {
    cJSON *billable_event_local_JSON = action_type_convertToJSON(ad_group_common->billable_event);
    if(billable_event_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "billable_event", billable_event_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_group_common->bid_strategy_type
    if(ad_group_common->bid_strategy_type != pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "bid_strategy_type", bid_strategy_typead_group_common_ToString(ad_group_common->bid_strategy_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_group_common->targeting_template_ids
    if(ad_group_common->targeting_template_ids) {
    cJSON *targeting_template_ids = cJSON_AddArrayToObject(item, "targeting_template_ids");
    if(targeting_template_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *targeting_template_idsListEntry;
    list_ForEach(targeting_template_idsListEntry, ad_group_common->targeting_template_ids) {
    if(cJSON_AddStringToObject(targeting_template_ids, "", (char*)targeting_template_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_group_common_t *ad_group_common_parseFromJSON(cJSON *ad_group_commonJSON){

    ad_group_common_t *ad_group_common_local_var = NULL;

    // define the local variable for ad_group_common->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for ad_group_common->optimization_goal_metadata
    optimization_goal_metadata_t *optimization_goal_metadata_local_nonprim = NULL;

    // define the local variable for ad_group_common->budget_type
    budget_type_t *budget_type_local_nonprim = NULL;

    // define the local variable for ad_group_common->targeting_spec
    targeting_spec_t *targeting_spec_local_nonprim = NULL;

    // define the local variable for ad_group_common->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for ad_group_common->placement_group
    placement_group_type_t *placement_group_local_nonprim = NULL;

    // define the local variable for ad_group_common->pacing_delivery_type
    pacing_delivery_type_t *pacing_delivery_type_local_nonprim = NULL;

    // define the local variable for ad_group_common->billable_event
    action_type_t *billable_event_local_nonprim = NULL;

    // define the local list for ad_group_common->targeting_template_ids
    list_t *targeting_template_idsList = NULL;

    // ad_group_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_group_common->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_group_common->budget_in_micro_currency
    cJSON *budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "budget_in_micro_currency");
    if (budget_in_micro_currency) { 
    if(!cJSON_IsNumber(budget_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // ad_group_common->bid_in_micro_currency
    cJSON *bid_in_micro_currency = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "bid_in_micro_currency");
    if (bid_in_micro_currency) { 
    if(!cJSON_IsNumber(bid_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // ad_group_common->optimization_goal_metadata
    cJSON *optimization_goal_metadata = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "optimization_goal_metadata");
    if (optimization_goal_metadata) { 
    optimization_goal_metadata_local_nonprim = optimization_goal_metadata_parseFromJSON(optimization_goal_metadata); //nonprimitive
    }

    // ad_group_common->budget_type
    cJSON *budget_type = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "budget_type");
    if (budget_type) { 
    budget_type_local_nonprim = budget_type_parseFromJSON(budget_type); //custom
    }

    // ad_group_common->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // ad_group_common->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "end_time");
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // ad_group_common->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "targeting_spec");
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_parseFromJSON(targeting_spec); //nonprimitive
    }

    // ad_group_common->lifetime_frequency_cap
    cJSON *lifetime_frequency_cap = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "lifetime_frequency_cap");
    if (lifetime_frequency_cap) { 
    if(!cJSON_IsNumber(lifetime_frequency_cap))
    {
    goto end; //Numeric
    }
    }

    // ad_group_common->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "tracking_urls");
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad_group_common->auto_targeting_enabled
    cJSON *auto_targeting_enabled = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "auto_targeting_enabled");
    if (auto_targeting_enabled) { 
    if(!cJSON_IsBool(auto_targeting_enabled))
    {
    goto end; //Bool
    }
    }

    // ad_group_common->placement_group
    cJSON *placement_group = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "placement_group");
    if (placement_group) { 
    placement_group_local_nonprim = placement_group_type_parseFromJSON(placement_group); //custom
    }

    // ad_group_common->pacing_delivery_type
    cJSON *pacing_delivery_type = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "pacing_delivery_type");
    if (pacing_delivery_type) { 
    pacing_delivery_type_local_nonprim = pacing_delivery_type_parseFromJSON(pacing_delivery_type); //custom
    }

    // ad_group_common->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "campaign_id");
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // ad_group_common->billable_event
    cJSON *billable_event = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "billable_event");
    if (billable_event) { 
    billable_event_local_nonprim = action_type_parseFromJSON(billable_event); //custom
    }

    // ad_group_common->bid_strategy_type
    cJSON *bid_strategy_type = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "bid_strategy_type");
    pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_e bid_strategy_typeVariable;
    if (bid_strategy_type) { 
    if(!cJSON_IsString(bid_strategy_type))
    {
    goto end; //Enum
    }
    bid_strategy_typeVariable = ad_group_common_bid_strategy_type_FromString(bid_strategy_type->valuestring);
    }

    // ad_group_common->targeting_template_ids
    cJSON *targeting_template_ids = cJSON_GetObjectItemCaseSensitive(ad_group_commonJSON, "targeting_template_ids");
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


    ad_group_common_local_var = ad_group_common_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        budget_in_micro_currency ? budget_in_micro_currency->valuedouble : 0,
        bid_in_micro_currency ? bid_in_micro_currency->valuedouble : 0,
        optimization_goal_metadata ? optimization_goal_metadata_local_nonprim : NULL,
        budget_type ? budget_type_local_nonprim : NULL,
        start_time ? start_time->valuedouble : 0,
        end_time ? end_time->valuedouble : 0,
        targeting_spec ? targeting_spec_local_nonprim : NULL,
        lifetime_frequency_cap ? lifetime_frequency_cap->valuedouble : 0,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        auto_targeting_enabled ? auto_targeting_enabled->valueint : 0,
        placement_group ? placement_group_local_nonprim : NULL,
        pacing_delivery_type ? pacing_delivery_type_local_nonprim : NULL,
        campaign_id && !cJSON_IsNull(campaign_id) ? strdup(campaign_id->valuestring) : NULL,
        billable_event ? billable_event_local_nonprim : NULL,
        bid_strategy_type ? bid_strategy_typeVariable : pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_NULL,
        targeting_template_ids ? targeting_template_idsList : NULL
        );

    return ad_group_common_local_var;
end:
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (optimization_goal_metadata_local_nonprim) {
        optimization_goal_metadata_free(optimization_goal_metadata_local_nonprim);
        optimization_goal_metadata_local_nonprim = NULL;
    }
    if (budget_type_local_nonprim) {
        budget_type_free(budget_type_local_nonprim);
        budget_type_local_nonprim = NULL;
    }
    if (targeting_spec_local_nonprim) {
        targeting_spec_free(targeting_spec_local_nonprim);
        targeting_spec_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (placement_group_local_nonprim) {
        placement_group_type_free(placement_group_local_nonprim);
        placement_group_local_nonprim = NULL;
    }
    if (pacing_delivery_type_local_nonprim) {
        pacing_delivery_type_free(pacing_delivery_type_local_nonprim);
        pacing_delivery_type_local_nonprim = NULL;
    }
    if (billable_event_local_nonprim) {
        action_type_free(billable_event_local_nonprim);
        billable_event_local_nonprim = NULL;
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
