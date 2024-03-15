#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_create_request.h"


char* campaign_create_request_objective_type_ToString(pinterest_rest_api_campaign_create_request__e objective_type) {
    char* objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS" };
    return objective_typeArray[objective_type];
}

pinterest_rest_api_campaign_create_request__e campaign_create_request_objective_type_FromString(char* objective_type){
    int stringToReturn = 0;
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS" };
    size_t sizeofArray = sizeof(objective_typeArray) / sizeof(objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(objective_type, objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

campaign_create_request_t *campaign_create_request_create(
    char *ad_account_id,
    char *name,
    entity_status_t *status,
    int lifetime_spend_cap,
    int daily_spend_cap,
    char *order_line_id,
    ad_common_tracking_urls_t *tracking_urls,
    int start_time,
    int end_time,
    campaign_summary_status_t *summary_status,
    int is_flexible_daily_budgets,
    int default_ad_group_budget_in_micro_currency,
    int is_automated_campaign,
    objective_type_t *objective_type
    ) {
    campaign_create_request_t *campaign_create_request_local_var = malloc(sizeof(campaign_create_request_t));
    if (!campaign_create_request_local_var) {
        return NULL;
    }
    campaign_create_request_local_var->ad_account_id = ad_account_id;
    campaign_create_request_local_var->name = name;
    campaign_create_request_local_var->status = status;
    campaign_create_request_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_create_request_local_var->daily_spend_cap = daily_spend_cap;
    campaign_create_request_local_var->order_line_id = order_line_id;
    campaign_create_request_local_var->tracking_urls = tracking_urls;
    campaign_create_request_local_var->start_time = start_time;
    campaign_create_request_local_var->end_time = end_time;
    campaign_create_request_local_var->summary_status = summary_status;
    campaign_create_request_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_create_request_local_var->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
    campaign_create_request_local_var->is_automated_campaign = is_automated_campaign;
    campaign_create_request_local_var->objective_type = objective_type;

    return campaign_create_request_local_var;
}


void campaign_create_request_free(campaign_create_request_t *campaign_create_request) {
    if(NULL == campaign_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_create_request->ad_account_id) {
        free(campaign_create_request->ad_account_id);
        campaign_create_request->ad_account_id = NULL;
    }
    if (campaign_create_request->name) {
        free(campaign_create_request->name);
        campaign_create_request->name = NULL;
    }
    if (campaign_create_request->status) {
        entity_status_free(campaign_create_request->status);
        campaign_create_request->status = NULL;
    }
    if (campaign_create_request->order_line_id) {
        free(campaign_create_request->order_line_id);
        campaign_create_request->order_line_id = NULL;
    }
    if (campaign_create_request->tracking_urls) {
        ad_common_tracking_urls_free(campaign_create_request->tracking_urls);
        campaign_create_request->tracking_urls = NULL;
    }
    if (campaign_create_request->summary_status) {
        campaign_summary_status_free(campaign_create_request->summary_status);
        campaign_create_request->summary_status = NULL;
    }
    if (campaign_create_request->objective_type) {
        objective_type_free(campaign_create_request->objective_type);
        campaign_create_request->objective_type = NULL;
    }
    free(campaign_create_request);
}

cJSON *campaign_create_request_convertToJSON(campaign_create_request_t *campaign_create_request) {
    cJSON *item = cJSON_CreateObject();

    // campaign_create_request->ad_account_id
    if (!campaign_create_request->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_create_request->ad_account_id) == NULL) {
    goto fail; //String
    }


    // campaign_create_request->name
    if (!campaign_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", campaign_create_request->name) == NULL) {
    goto fail; //String
    }


    // campaign_create_request->status
    if(campaign_create_request->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(campaign_create_request->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_create_request->lifetime_spend_cap
    if(campaign_create_request->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", campaign_create_request->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_request->daily_spend_cap
    if(campaign_create_request->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", campaign_create_request->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_request->order_line_id
    if(campaign_create_request->order_line_id) {
    if(cJSON_AddStringToObject(item, "order_line_id", campaign_create_request->order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_create_request->tracking_urls
    if(campaign_create_request->tracking_urls) {
    cJSON *tracking_urls_local_JSON = ad_common_tracking_urls_convertToJSON(campaign_create_request->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_create_request->start_time
    if(campaign_create_request->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", campaign_create_request->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_request->end_time
    if(campaign_create_request->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", campaign_create_request->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_request->summary_status
    if(campaign_create_request->summary_status) {
    cJSON *summary_status_local_JSON = campaign_summary_status_convertToJSON(campaign_create_request->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_create_request->is_flexible_daily_budgets
    if(campaign_create_request->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", campaign_create_request->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request->default_ad_group_budget_in_micro_currency
    if(campaign_create_request->default_ad_group_budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "default_ad_group_budget_in_micro_currency", campaign_create_request->default_ad_group_budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_request->is_automated_campaign
    if(campaign_create_request->is_automated_campaign) {
    if(cJSON_AddBoolToObject(item, "is_automated_campaign", campaign_create_request->is_automated_campaign) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_request->objective_type
    if (pinterest_rest_api_campaign_create_request__NULL == campaign_create_request->objective_type) {
        goto fail;
    }
    cJSON *objective_type_local_JSON = objective_type_convertToJSON(campaign_create_request->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_create_request_t *campaign_create_request_parseFromJSON(cJSON *campaign_create_requestJSON){

    campaign_create_request_t *campaign_create_request_local_var = NULL;

    // define the local variable for campaign_create_request->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for campaign_create_request->tracking_urls
    ad_common_tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for campaign_create_request->summary_status
    campaign_summary_status_t *summary_status_local_nonprim = NULL;

    // define the local variable for campaign_create_request->objective_type
    objective_type_t *objective_type_local_nonprim = NULL;

    // campaign_create_request->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "ad_account_id");
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // campaign_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // campaign_create_request->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // campaign_create_request->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "lifetime_spend_cap");
    if (lifetime_spend_cap) { 
    if(!cJSON_IsNumber(lifetime_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_request->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "daily_spend_cap");
    if (daily_spend_cap) { 
    if(!cJSON_IsNumber(daily_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_request->order_line_id
    cJSON *order_line_id = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "order_line_id");
    if (order_line_id) { 
    if(!cJSON_IsString(order_line_id) && !cJSON_IsNull(order_line_id))
    {
    goto end; //String
    }
    }

    // campaign_create_request->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "tracking_urls");
    if (tracking_urls) { 
    tracking_urls_local_nonprim = ad_common_tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // campaign_create_request->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_request->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "end_time");
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_request->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "summary_status");
    if (summary_status) { 
    summary_status_local_nonprim = campaign_summary_status_parseFromJSON(summary_status); //custom
    }

    // campaign_create_request->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "is_flexible_daily_budgets");
    if (is_flexible_daily_budgets) { 
    if(!cJSON_IsBool(is_flexible_daily_budgets))
    {
    goto end; //Bool
    }
    }

    // campaign_create_request->default_ad_group_budget_in_micro_currency
    cJSON *default_ad_group_budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "default_ad_group_budget_in_micro_currency");
    if (default_ad_group_budget_in_micro_currency) { 
    if(!cJSON_IsNumber(default_ad_group_budget_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_request->is_automated_campaign
    cJSON *is_automated_campaign = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "is_automated_campaign");
    if (is_automated_campaign) { 
    if(!cJSON_IsBool(is_automated_campaign))
    {
    goto end; //Bool
    }
    }

    // campaign_create_request->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_create_requestJSON, "objective_type");
    if (!objective_type) {
        goto end;
    }

    
    objective_type_local_nonprim = objective_type_parseFromJSON(objective_type); //custom


    campaign_create_request_local_var = campaign_create_request_create (
        strdup(ad_account_id->valuestring),
        strdup(name->valuestring),
        status ? status_local_nonprim : NULL,
        lifetime_spend_cap ? lifetime_spend_cap->valuedouble : 0,
        daily_spend_cap ? daily_spend_cap->valuedouble : 0,
        order_line_id && !cJSON_IsNull(order_line_id) ? strdup(order_line_id->valuestring) : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        start_time ? start_time->valuedouble : 0,
        end_time ? end_time->valuedouble : 0,
        summary_status ? summary_status_local_nonprim : NULL,
        is_flexible_daily_budgets ? is_flexible_daily_budgets->valueint : 0,
        default_ad_group_budget_in_micro_currency ? default_ad_group_budget_in_micro_currency->valuedouble : 0,
        is_automated_campaign ? is_automated_campaign->valueint : 0,
        objective_type_local_nonprim
        );

    return campaign_create_request_local_var;
end:
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        ad_common_tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (summary_status_local_nonprim) {
        campaign_summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    if (objective_type_local_nonprim) {
        objective_type_free(objective_type_local_nonprim);
        objective_type_local_nonprim = NULL;
    }
    return NULL;

}
