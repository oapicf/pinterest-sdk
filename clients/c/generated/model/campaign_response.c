#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_response.h"



static campaign_response_t *campaign_response_create_internal(
    char *id,
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
    pinterest_rest_api_objective_type__e objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_campaign_budget_optimization,
    pinterest_rest_api_campaign_summary_status__e summary_status
    ) {
    campaign_response_t *campaign_response_local_var = malloc(sizeof(campaign_response_t));
    if (!campaign_response_local_var) {
        return NULL;
    }
    campaign_response_local_var->id = id;
    campaign_response_local_var->ad_account_id = ad_account_id;
    campaign_response_local_var->name = name;
    campaign_response_local_var->status = status;
    campaign_response_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_response_local_var->daily_spend_cap = daily_spend_cap;
    campaign_response_local_var->order_line_id = order_line_id;
    campaign_response_local_var->tracking_urls = tracking_urls;
    campaign_response_local_var->start_time = start_time;
    campaign_response_local_var->end_time = end_time;
    campaign_response_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_response_local_var->objective_type = objective_type;
    campaign_response_local_var->created_time = created_time;
    campaign_response_local_var->updated_time = updated_time;
    campaign_response_local_var->type = type;
    campaign_response_local_var->is_campaign_budget_optimization = is_campaign_budget_optimization;
    campaign_response_local_var->summary_status = summary_status;

    campaign_response_local_var->_library_owned = 1;
    return campaign_response_local_var;
}

__attribute__((deprecated)) campaign_response_t *campaign_response_create(
    char *id,
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
    pinterest_rest_api_objective_type__e objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_campaign_budget_optimization,
    pinterest_rest_api_campaign_summary_status__e summary_status
    ) {
    return campaign_response_create_internal (
        id,
        ad_account_id,
        name,
        status,
        lifetime_spend_cap,
        daily_spend_cap,
        order_line_id,
        tracking_urls,
        start_time,
        end_time,
        is_flexible_daily_budgets,
        objective_type,
        created_time,
        updated_time,
        type,
        is_campaign_budget_optimization,
        summary_status
        );
}

void campaign_response_free(campaign_response_t *campaign_response) {
    if(NULL == campaign_response){
        return ;
    }
    if(campaign_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_response->id) {
        free(campaign_response->id);
        campaign_response->id = NULL;
    }
    if (campaign_response->ad_account_id) {
        free(campaign_response->ad_account_id);
        campaign_response->ad_account_id = NULL;
    }
    if (campaign_response->name) {
        free(campaign_response->name);
        campaign_response->name = NULL;
    }
    if (campaign_response->status) {
        entity_status_free(campaign_response->status);
        campaign_response->status = NULL;
    }
    if (campaign_response->order_line_id) {
        free(campaign_response->order_line_id);
        campaign_response->order_line_id = NULL;
    }
    if (campaign_response->tracking_urls) {
        tracking_urls_free(campaign_response->tracking_urls);
        campaign_response->tracking_urls = NULL;
    }
    if (campaign_response->type) {
        free(campaign_response->type);
        campaign_response->type = NULL;
    }
    free(campaign_response);
}

cJSON *campaign_response_convertToJSON(campaign_response_t *campaign_response) {
    cJSON *item = cJSON_CreateObject();

    // campaign_response->id
    if(campaign_response->id) {
    if(cJSON_AddStringToObject(item, "id", campaign_response->id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_response->ad_account_id
    if(campaign_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_response->name
    if(campaign_response->name) {
    if(cJSON_AddStringToObject(item, "name", campaign_response->name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_response->status
    if(campaign_response->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(campaign_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_response->lifetime_spend_cap
    if(campaign_response->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", campaign_response->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_response->daily_spend_cap
    if(campaign_response->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", campaign_response->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_response->order_line_id
    if(campaign_response->order_line_id) {
    if(cJSON_AddStringToObject(item, "order_line_id", campaign_response->order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_response->tracking_urls
    if(campaign_response->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(campaign_response->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // campaign_response->start_time
    if(campaign_response->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", campaign_response->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_response->end_time
    if(campaign_response->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", campaign_response->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_response->is_flexible_daily_budgets
    if(campaign_response->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", campaign_response->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_response->objective_type
    if(campaign_response->objective_type != pinterest_rest_api_objective_type__NULL) {
    cJSON *objective_type_local_JSON = objective_type_convertToJSON(campaign_response->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_response->created_time
    if(campaign_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", campaign_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_response->updated_time
    if(campaign_response->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", campaign_response->updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_response->type
    if(campaign_response->type) {
    if(cJSON_AddStringToObject(item, "type", campaign_response->type) == NULL) {
    goto fail; //String
    }
    }


    // campaign_response->is_campaign_budget_optimization
    if(campaign_response->is_campaign_budget_optimization) {
    if(cJSON_AddBoolToObject(item, "is_campaign_budget_optimization", campaign_response->is_campaign_budget_optimization) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_response->summary_status
    if(campaign_response->summary_status != pinterest_rest_api_campaign_summary_status__NULL) {
    cJSON *summary_status_local_JSON = campaign_summary_status_convertToJSON(campaign_response->summary_status);
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

campaign_response_t *campaign_response_parseFromJSON(cJSON *campaign_responseJSON){

    campaign_response_t *campaign_response_local_var = NULL;

    // define the local variable for campaign_response->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for campaign_response->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local variable for campaign_response->objective_type
    pinterest_rest_api_objective_type__e objective_type_local_nonprim = 0;

    // define the local variable for campaign_response->summary_status
    pinterest_rest_api_campaign_summary_status__e summary_status_local_nonprim = 0;

    // campaign_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // campaign_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // campaign_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // campaign_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // campaign_response->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "lifetime_spend_cap");
    if (cJSON_IsNull(lifetime_spend_cap)) {
        lifetime_spend_cap = NULL;
    }
    if (lifetime_spend_cap) { 
    if(!cJSON_IsNumber(lifetime_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_response->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "daily_spend_cap");
    if (cJSON_IsNull(daily_spend_cap)) {
        daily_spend_cap = NULL;
    }
    if (daily_spend_cap) { 
    if(!cJSON_IsNumber(daily_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_response->order_line_id
    cJSON *order_line_id = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "order_line_id");
    if (cJSON_IsNull(order_line_id)) {
        order_line_id = NULL;
    }
    if (order_line_id) { 
    if(!cJSON_IsString(order_line_id) && !cJSON_IsNull(order_line_id))
    {
    goto end; //String
    }
    }

    // campaign_response->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // campaign_response->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_response->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_response->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "is_flexible_daily_budgets");
    if (cJSON_IsNull(is_flexible_daily_budgets)) {
        is_flexible_daily_budgets = NULL;
    }
    if (is_flexible_daily_budgets) { 
    if(!cJSON_IsBool(is_flexible_daily_budgets))
    {
    goto end; //Bool
    }
    }

    // campaign_response->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    objective_type_local_nonprim = objective_type_parseFromJSON(objective_type); //custom
    }

    // campaign_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_response->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_response->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // campaign_response->is_campaign_budget_optimization
    cJSON *is_campaign_budget_optimization = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "is_campaign_budget_optimization");
    if (cJSON_IsNull(is_campaign_budget_optimization)) {
        is_campaign_budget_optimization = NULL;
    }
    if (is_campaign_budget_optimization) { 
    if(!cJSON_IsBool(is_campaign_budget_optimization))
    {
    goto end; //Bool
    }
    }

    // campaign_response->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(campaign_responseJSON, "summary_status");
    if (cJSON_IsNull(summary_status)) {
        summary_status = NULL;
    }
    if (summary_status) { 
    summary_status_local_nonprim = campaign_summary_status_parseFromJSON(summary_status); //custom
    }


    campaign_response_local_var = campaign_response_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
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
        objective_type ? objective_type_local_nonprim : 0,
        created_time ? created_time->valuedouble : 0,
        updated_time ? updated_time->valuedouble : 0,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        is_campaign_budget_optimization ? is_campaign_budget_optimization->valueint : 0,
        summary_status ? summary_status_local_nonprim : 0
        );

    return campaign_response_local_var;
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
        objective_type_local_nonprim = 0;
    }
    if (summary_status_local_nonprim) {
        summary_status_local_nonprim = 0;
    }
    return NULL;

}
