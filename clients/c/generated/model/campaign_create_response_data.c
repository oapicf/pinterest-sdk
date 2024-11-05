#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_create_response_data.h"


char* campaign_create_response_data_objective_type_ToString(pinterest_rest_api_campaign_create_response_data__e objective_type) {
    char* objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS", "VIDEO_COMPLETION" };
    return objective_typeArray[objective_type];
}

pinterest_rest_api_campaign_create_response_data__e campaign_create_response_data_objective_type_FromString(char* objective_type){
    int stringToReturn = 0;
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS", "VIDEO_COMPLETION" };
    size_t sizeofArray = sizeof(objective_typeArray) / sizeof(objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(objective_type, objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* campaign_create_response_data_summary_status_ToString(pinterest_rest_api_campaign_create_response_data__e summary_status) {
    char* summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    return summary_statusArray[summary_status];
}

pinterest_rest_api_campaign_create_response_data__e campaign_create_response_data_summary_status_FromString(char* summary_status){
    int stringToReturn = 0;
    char *summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "NOT_STARTED", "COMPLETED", "ADVERTISER_DISABLED", "ARCHIVED", "DRAFT", "DELETED_DRAFT" };
    size_t sizeofArray = sizeof(summary_statusArray) / sizeof(summary_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(summary_status, summary_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

campaign_create_response_data_t *campaign_create_response_data_create(
    char *ad_account_id,
    char *name,
    entity_status_t *status,
    int lifetime_spend_cap,
    int daily_spend_cap,
    char *order_line_id,
    tracking_urls_t *tracking_urls,
    int start_time,
    int end_time,
    int is_flexible_daily_budgets,
    int default_ad_group_budget_in_micro_currency,
    int is_automated_campaign,
    char *id,
    objective_type_t *objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_campaign_budget_optimization,
    campaign_summary_status_t *summary_status
    ) {
    campaign_create_response_data_t *campaign_create_response_data_local_var = malloc(sizeof(campaign_create_response_data_t));
    if (!campaign_create_response_data_local_var) {
        return NULL;
    }
    campaign_create_response_data_local_var->ad_account_id = ad_account_id;
    campaign_create_response_data_local_var->name = name;
    campaign_create_response_data_local_var->status = status;
    campaign_create_response_data_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_create_response_data_local_var->daily_spend_cap = daily_spend_cap;
    campaign_create_response_data_local_var->order_line_id = order_line_id;
    campaign_create_response_data_local_var->tracking_urls = tracking_urls;
    campaign_create_response_data_local_var->start_time = start_time;
    campaign_create_response_data_local_var->end_time = end_time;
    campaign_create_response_data_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_create_response_data_local_var->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
    campaign_create_response_data_local_var->is_automated_campaign = is_automated_campaign;
    campaign_create_response_data_local_var->id = id;
    campaign_create_response_data_local_var->objective_type = objective_type;
    campaign_create_response_data_local_var->created_time = created_time;
    campaign_create_response_data_local_var->updated_time = updated_time;
    campaign_create_response_data_local_var->type = type;
    campaign_create_response_data_local_var->is_campaign_budget_optimization = is_campaign_budget_optimization;
    campaign_create_response_data_local_var->summary_status = summary_status;

    return campaign_create_response_data_local_var;
}


void campaign_create_response_data_free(campaign_create_response_data_t *campaign_create_response_data) {
    if(NULL == campaign_create_response_data){
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_create_response_data->ad_account_id) {
        free(campaign_create_response_data->ad_account_id);
        campaign_create_response_data->ad_account_id = NULL;
    }
    if (campaign_create_response_data->name) {
        free(campaign_create_response_data->name);
        campaign_create_response_data->name = NULL;
    }
    if (campaign_create_response_data->status) {
        entity_status_free(campaign_create_response_data->status);
        campaign_create_response_data->status = NULL;
    }
    if (campaign_create_response_data->order_line_id) {
        free(campaign_create_response_data->order_line_id);
        campaign_create_response_data->order_line_id = NULL;
    }
    if (campaign_create_response_data->tracking_urls) {
        tracking_urls_free(campaign_create_response_data->tracking_urls);
        campaign_create_response_data->tracking_urls = NULL;
    }
    if (campaign_create_response_data->id) {
        free(campaign_create_response_data->id);
        campaign_create_response_data->id = NULL;
    }
    if (campaign_create_response_data->objective_type) {
        objective_type_free(campaign_create_response_data->objective_type);
        campaign_create_response_data->objective_type = NULL;
    }
    if (campaign_create_response_data->type) {
        free(campaign_create_response_data->type);
        campaign_create_response_data->type = NULL;
    }
    if (campaign_create_response_data->summary_status) {
        campaign_summary_status_free(campaign_create_response_data->summary_status);
        campaign_create_response_data->summary_status = NULL;
    }
    free(campaign_create_response_data);
}

cJSON *campaign_create_response_data_convertToJSON(campaign_create_response_data_t *campaign_create_response_data) {
    cJSON *item = cJSON_CreateObject();

    // campaign_create_response_data->ad_account_id
    if(campaign_create_response_data->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_create_response_data->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_create_response_data->name
    if(campaign_create_response_data->name) {
    if(cJSON_AddStringToObject(item, "name", campaign_create_response_data->name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_create_response_data->status
    if(campaign_create_response_data->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(campaign_create_response_data->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_create_response_data->lifetime_spend_cap
    if(campaign_create_response_data->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", campaign_create_response_data->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->daily_spend_cap
    if(campaign_create_response_data->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", campaign_create_response_data->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->order_line_id
    if(campaign_create_response_data->order_line_id) {
    if(cJSON_AddStringToObject(item, "order_line_id", campaign_create_response_data->order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_create_response_data->tracking_urls
    if(campaign_create_response_data->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(campaign_create_response_data->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_create_response_data->start_time
    if(campaign_create_response_data->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", campaign_create_response_data->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->end_time
    if(campaign_create_response_data->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", campaign_create_response_data->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->is_flexible_daily_budgets
    if(campaign_create_response_data->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", campaign_create_response_data->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_response_data->default_ad_group_budget_in_micro_currency
    if(campaign_create_response_data->default_ad_group_budget_in_micro_currency) {
    if(cJSON_AddNumberToObject(item, "default_ad_group_budget_in_micro_currency", campaign_create_response_data->default_ad_group_budget_in_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->is_automated_campaign
    if(campaign_create_response_data->is_automated_campaign) {
    if(cJSON_AddBoolToObject(item, "is_automated_campaign", campaign_create_response_data->is_automated_campaign) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_response_data->id
    if(campaign_create_response_data->id) {
    if(cJSON_AddStringToObject(item, "id", campaign_create_response_data->id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_create_response_data->objective_type
    if(campaign_create_response_data->objective_type != pinterest_rest_api_campaign_create_response_data__NULL) {
    cJSON *objective_type_local_JSON = objective_type_convertToJSON(campaign_create_response_data->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_create_response_data->created_time
    if(campaign_create_response_data->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", campaign_create_response_data->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->updated_time
    if(campaign_create_response_data->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", campaign_create_response_data->updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_create_response_data->type
    if(campaign_create_response_data->type) {
    if(cJSON_AddStringToObject(item, "type", campaign_create_response_data->type) == NULL) {
    goto fail; //String
    }
    }


    // campaign_create_response_data->is_campaign_budget_optimization
    if(campaign_create_response_data->is_campaign_budget_optimization) {
    if(cJSON_AddBoolToObject(item, "is_campaign_budget_optimization", campaign_create_response_data->is_campaign_budget_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_create_response_data->summary_status
    if(campaign_create_response_data->summary_status != pinterest_rest_api_campaign_create_response_data__NULL) {
    cJSON *summary_status_local_JSON = campaign_summary_status_convertToJSON(campaign_create_response_data->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
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

campaign_create_response_data_t *campaign_create_response_data_parseFromJSON(cJSON *campaign_create_response_dataJSON){

    campaign_create_response_data_t *campaign_create_response_data_local_var = NULL;

    // define the local variable for campaign_create_response_data->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for campaign_create_response_data->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for campaign_create_response_data->objective_type
    objective_type_t *objective_type_local_nonprim = NULL;

    // define the local variable for campaign_create_response_data->summary_status
    campaign_summary_status_t *summary_status_local_nonprim = NULL;

    // campaign_create_response_data->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // campaign_create_response_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // campaign_create_response_data->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "status");
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // campaign_create_response_data->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "lifetime_spend_cap");
    if (lifetime_spend_cap) { 
    if(!cJSON_IsNumber(lifetime_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "daily_spend_cap");
    if (daily_spend_cap) { 
    if(!cJSON_IsNumber(daily_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->order_line_id
    cJSON *order_line_id = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "order_line_id");
    if (order_line_id) { 
    if(!cJSON_IsString(order_line_id) && !cJSON_IsNull(order_line_id))
    {
    goto end; //String
    }
    }

    // campaign_create_response_data->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "tracking_urls");
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // campaign_create_response_data->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "end_time");
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "is_flexible_daily_budgets");
    if (is_flexible_daily_budgets) { 
    if(!cJSON_IsBool(is_flexible_daily_budgets))
    {
    goto end; //Bool
    }
    }

    // campaign_create_response_data->default_ad_group_budget_in_micro_currency
    cJSON *default_ad_group_budget_in_micro_currency = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "default_ad_group_budget_in_micro_currency");
    if (default_ad_group_budget_in_micro_currency) { 
    if(!cJSON_IsNumber(default_ad_group_budget_in_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->is_automated_campaign
    cJSON *is_automated_campaign = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "is_automated_campaign");
    if (is_automated_campaign) { 
    if(!cJSON_IsBool(is_automated_campaign))
    {
    goto end; //Bool
    }
    }

    // campaign_create_response_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // campaign_create_response_data->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "objective_type");
    if (objective_type) { 
    objective_type_local_nonprim = objective_type_parseFromJSON(objective_type); //custom
    }

    // campaign_create_response_data->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "created_time");
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "updated_time");
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_create_response_data->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // campaign_create_response_data->is_campaign_budget_optimization
    cJSON *is_campaign_budget_optimization = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "is_campaign_budget_optimization");
    if (is_campaign_budget_optimization) { 
    if(!cJSON_IsBool(is_campaign_budget_optimization))
    {
    goto end; //Bool
    }
    }

    // campaign_create_response_data->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(campaign_create_response_dataJSON, "summary_status");
    if (summary_status) { 
    summary_status_local_nonprim = campaign_summary_status_parseFromJSON(summary_status); //custom
    }


    campaign_create_response_data_local_var = campaign_create_response_data_create (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        lifetime_spend_cap ? lifetime_spend_cap->valuedouble : 0,
        daily_spend_cap ? daily_spend_cap->valuedouble : 0,
        order_line_id && !cJSON_IsNull(order_line_id) ? strdup(order_line_id->valuestring) : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        start_time ? start_time->valuedouble : 0,
        end_time ? end_time->valuedouble : 0,
        is_flexible_daily_budgets ? is_flexible_daily_budgets->valueint : 0,
        default_ad_group_budget_in_micro_currency ? default_ad_group_budget_in_micro_currency->valuedouble : 0,
        is_automated_campaign ? is_automated_campaign->valueint : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        objective_type ? objective_type_local_nonprim : NULL,
        created_time ? created_time->valuedouble : 0,
        updated_time ? updated_time->valuedouble : 0,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        is_campaign_budget_optimization ? is_campaign_budget_optimization->valueint : 0,
        summary_status ? summary_status_local_nonprim : NULL
        );

    return campaign_create_response_data_local_var;
end:
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (objective_type_local_nonprim) {
        objective_type_free(objective_type_local_nonprim);
        objective_type_local_nonprim = NULL;
    }
    if (summary_status_local_nonprim) {
        campaign_summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    return NULL;

}
