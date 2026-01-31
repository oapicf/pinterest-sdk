#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_common.h"



static campaign_common_t *campaign_common_create_internal(
    char *ad_account_id,
    int daily_spend_cap,
    int end_time,
    int is_automated_campaign,
    int is_flexible_daily_budgets,
    int lifetime_spend_cap,
    char *name,
    char *order_line_id,
    int start_time,
    entity_status_t *status,
    tracking_urls_t *tracking_urls
    ) {
    campaign_common_t *campaign_common_local_var = malloc(sizeof(campaign_common_t));
    if (!campaign_common_local_var) {
        return NULL;
    }
    campaign_common_local_var->ad_account_id = ad_account_id;
    campaign_common_local_var->daily_spend_cap = daily_spend_cap;
    campaign_common_local_var->end_time = end_time;
    campaign_common_local_var->is_automated_campaign = is_automated_campaign;
    campaign_common_local_var->is_flexible_daily_budgets = is_flexible_daily_budgets;
    campaign_common_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_common_local_var->name = name;
    campaign_common_local_var->order_line_id = order_line_id;
    campaign_common_local_var->start_time = start_time;
    campaign_common_local_var->status = status;
    campaign_common_local_var->tracking_urls = tracking_urls;

    campaign_common_local_var->_library_owned = 1;
    return campaign_common_local_var;
}

__attribute__((deprecated)) campaign_common_t *campaign_common_create(
    char *ad_account_id,
    int daily_spend_cap,
    int end_time,
    int is_automated_campaign,
    int is_flexible_daily_budgets,
    int lifetime_spend_cap,
    char *name,
    char *order_line_id,
    int start_time,
    entity_status_t *status,
    tracking_urls_t *tracking_urls
    ) {
    return campaign_common_create_internal (
        ad_account_id,
        daily_spend_cap,
        end_time,
        is_automated_campaign,
        is_flexible_daily_budgets,
        lifetime_spend_cap,
        name,
        order_line_id,
        start_time,
        status,
        tracking_urls
        );
}

void campaign_common_free(campaign_common_t *campaign_common) {
    if(NULL == campaign_common){
        return ;
    }
    if(campaign_common->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_common_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_common->ad_account_id) {
        free(campaign_common->ad_account_id);
        campaign_common->ad_account_id = NULL;
    }
    if (campaign_common->name) {
        free(campaign_common->name);
        campaign_common->name = NULL;
    }
    if (campaign_common->order_line_id) {
        free(campaign_common->order_line_id);
        campaign_common->order_line_id = NULL;
    }
    if (campaign_common->status) {
        entity_status_free(campaign_common->status);
        campaign_common->status = NULL;
    }
    if (campaign_common->tracking_urls) {
        tracking_urls_free(campaign_common->tracking_urls);
        campaign_common->tracking_urls = NULL;
    }
    free(campaign_common);
}

cJSON *campaign_common_convertToJSON(campaign_common_t *campaign_common) {
    cJSON *item = cJSON_CreateObject();

    // campaign_common->ad_account_id
    if(campaign_common->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", campaign_common->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_common->daily_spend_cap
    if(campaign_common->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", campaign_common->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_common->end_time
    if(campaign_common->end_time) {
    if(cJSON_AddNumberToObject(item, "end_time", campaign_common->end_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_common->is_automated_campaign
    if(campaign_common->is_automated_campaign) {
    if(cJSON_AddBoolToObject(item, "is_automated_campaign", campaign_common->is_automated_campaign) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_common->is_flexible_daily_budgets
    if(campaign_common->is_flexible_daily_budgets) {
    if(cJSON_AddBoolToObject(item, "is_flexible_daily_budgets", campaign_common->is_flexible_daily_budgets) == NULL) {
    goto fail; //Bool
    }
    }


    // campaign_common->lifetime_spend_cap
    if(campaign_common->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", campaign_common->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_common->name
    if(campaign_common->name) {
    if(cJSON_AddStringToObject(item, "name", campaign_common->name) == NULL) {
    goto fail; //String
    }
    }


    // campaign_common->order_line_id
    if(campaign_common->order_line_id) {
    if(cJSON_AddStringToObject(item, "order_line_id", campaign_common->order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // campaign_common->start_time
    if(campaign_common->start_time) {
    if(cJSON_AddNumberToObject(item, "start_time", campaign_common->start_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_common->status
    if(campaign_common->status) {
    cJSON *status_local_JSON = entity_status_convertToJSON(campaign_common->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_common->tracking_urls
    if(campaign_common->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(campaign_common->tracking_urls);
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

campaign_common_t *campaign_common_parseFromJSON(cJSON *campaign_commonJSON){

    campaign_common_t *campaign_common_local_var = NULL;

    // define the local variable for campaign_common->status
    entity_status_t *status_local_nonprim = NULL;

    // define the local variable for campaign_common->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // campaign_common->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // campaign_common->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "daily_spend_cap");
    if (cJSON_IsNull(daily_spend_cap)) {
        daily_spend_cap = NULL;
    }
    if (daily_spend_cap) { 
    if(!cJSON_IsNumber(daily_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_common->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (end_time) { 
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_common->is_automated_campaign
    cJSON *is_automated_campaign = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "is_automated_campaign");
    if (cJSON_IsNull(is_automated_campaign)) {
        is_automated_campaign = NULL;
    }
    if (is_automated_campaign) { 
    if(!cJSON_IsBool(is_automated_campaign))
    {
    goto end; //Bool
    }
    }

    // campaign_common->is_flexible_daily_budgets
    cJSON *is_flexible_daily_budgets = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "is_flexible_daily_budgets");
    if (cJSON_IsNull(is_flexible_daily_budgets)) {
        is_flexible_daily_budgets = NULL;
    }
    if (is_flexible_daily_budgets) { 
    if(!cJSON_IsBool(is_flexible_daily_budgets))
    {
    goto end; //Bool
    }
    }

    // campaign_common->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "lifetime_spend_cap");
    if (cJSON_IsNull(lifetime_spend_cap)) {
        lifetime_spend_cap = NULL;
    }
    if (lifetime_spend_cap) { 
    if(!cJSON_IsNumber(lifetime_spend_cap))
    {
    goto end; //Numeric
    }
    }

    // campaign_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // campaign_common->order_line_id
    cJSON *order_line_id = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "order_line_id");
    if (cJSON_IsNull(order_line_id)) {
        order_line_id = NULL;
    }
    if (order_line_id) { 
    if(!cJSON_IsString(order_line_id) && !cJSON_IsNull(order_line_id))
    {
    goto end; //String
    }
    }

    // campaign_common->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (start_time) { 
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }
    }

    // campaign_common->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // campaign_common->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(campaign_commonJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }


    campaign_common_local_var = campaign_common_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        daily_spend_cap ? daily_spend_cap->valuedouble : 0,
        end_time ? end_time->valuedouble : 0,
        is_automated_campaign ? is_automated_campaign->valueint : 0,
        is_flexible_daily_budgets ? is_flexible_daily_budgets->valueint : 0,
        lifetime_spend_cap ? lifetime_spend_cap->valuedouble : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        order_line_id && !cJSON_IsNull(order_line_id) ? strdup(order_line_id->valuestring) : NULL,
        start_time ? start_time->valuedouble : 0,
        status ? status_local_nonprim : NULL,
        tracking_urls ? tracking_urls_local_nonprim : NULL
        );

    return campaign_common_local_var;
end:
    if (status_local_nonprim) {
        entity_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    return NULL;

}
