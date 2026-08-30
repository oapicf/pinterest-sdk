#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_delivery_estimates_campaign.h"



static campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_create_internal(
    list_t *ad_groups,
    budget_duration_type_t *budget_duration_type,
    int *daily_spend_cap,
    char *end_date,
    int *lifetime_spend_cap,
    pinterest_rest_api_delivery_estimate_objective_type__e objective_type,
    char *start_date
    ) {
    campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_local_var = malloc(sizeof(campaign_delivery_estimates_campaign_t));
    if (!campaign_delivery_estimates_campaign_local_var) {
        return NULL;
    }
    memset(campaign_delivery_estimates_campaign_local_var, 0, sizeof(campaign_delivery_estimates_campaign_t));
    campaign_delivery_estimates_campaign_local_var->_library_owned = 1;
    campaign_delivery_estimates_campaign_local_var->ad_groups = ad_groups;
    campaign_delivery_estimates_campaign_local_var->budget_duration_type = budget_duration_type;
    campaign_delivery_estimates_campaign_local_var->daily_spend_cap = daily_spend_cap;
    campaign_delivery_estimates_campaign_local_var->end_date = end_date;
    campaign_delivery_estimates_campaign_local_var->lifetime_spend_cap = lifetime_spend_cap;
    campaign_delivery_estimates_campaign_local_var->objective_type = objective_type;
    campaign_delivery_estimates_campaign_local_var->start_date = start_date;
    return campaign_delivery_estimates_campaign_local_var;
}

__attribute__((deprecated)) campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_create(
    list_t *ad_groups,
    budget_duration_type_t *budget_duration_type,
    int *daily_spend_cap,
    char *end_date,
    int *lifetime_spend_cap,
    pinterest_rest_api_delivery_estimate_objective_type__e objective_type,
    char *start_date
    ) {
    int *daily_spend_cap_copy = NULL;
    if (daily_spend_cap) {
        daily_spend_cap_copy = malloc(sizeof(int));
        if (daily_spend_cap_copy) *daily_spend_cap_copy = *daily_spend_cap;
    }
    int *lifetime_spend_cap_copy = NULL;
    if (lifetime_spend_cap) {
        lifetime_spend_cap_copy = malloc(sizeof(int));
        if (lifetime_spend_cap_copy) *lifetime_spend_cap_copy = *lifetime_spend_cap;
    }
    campaign_delivery_estimates_campaign_t *result = campaign_delivery_estimates_campaign_create_internal (
        ad_groups,
        budget_duration_type,
        daily_spend_cap_copy,
        end_date,
        lifetime_spend_cap_copy,
        objective_type,
        start_date
        );
    if (!result) {
        free(daily_spend_cap_copy);
        free(lifetime_spend_cap_copy);
    }
    return result;
}

void campaign_delivery_estimates_campaign_free(campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign) {
    if(NULL == campaign_delivery_estimates_campaign){
        return ;
    }
    if(campaign_delivery_estimates_campaign->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_delivery_estimates_campaign_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_delivery_estimates_campaign->ad_groups) {
        list_ForEach(listEntry, campaign_delivery_estimates_campaign->ad_groups) {
            ad_group_delivery_estimates_free(listEntry->data);
        }
        list_freeList(campaign_delivery_estimates_campaign->ad_groups);
        campaign_delivery_estimates_campaign->ad_groups = NULL;
    }
    if (campaign_delivery_estimates_campaign->budget_duration_type) {
        budget_duration_type_free(campaign_delivery_estimates_campaign->budget_duration_type);
        campaign_delivery_estimates_campaign->budget_duration_type = NULL;
    }
    if (campaign_delivery_estimates_campaign->daily_spend_cap) {
        free(campaign_delivery_estimates_campaign->daily_spend_cap);
        campaign_delivery_estimates_campaign->daily_spend_cap = NULL;
    }
    if (campaign_delivery_estimates_campaign->end_date) {
        free(campaign_delivery_estimates_campaign->end_date);
        campaign_delivery_estimates_campaign->end_date = NULL;
    }
    if (campaign_delivery_estimates_campaign->lifetime_spend_cap) {
        free(campaign_delivery_estimates_campaign->lifetime_spend_cap);
        campaign_delivery_estimates_campaign->lifetime_spend_cap = NULL;
    }
    if (campaign_delivery_estimates_campaign->start_date) {
        free(campaign_delivery_estimates_campaign->start_date);
        campaign_delivery_estimates_campaign->start_date = NULL;
    }
    free(campaign_delivery_estimates_campaign);
}

cJSON *campaign_delivery_estimates_campaign_convertToJSON(campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign) {
    cJSON *item = cJSON_CreateObject();

    // campaign_delivery_estimates_campaign->ad_groups
    if (!campaign_delivery_estimates_campaign->ad_groups) {
        goto fail;
    }
    cJSON *ad_groups = cJSON_AddArrayToObject(item, "ad_groups");
    if(ad_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ad_groupsListEntry;
    if (campaign_delivery_estimates_campaign->ad_groups) {
    list_ForEach(ad_groupsListEntry, campaign_delivery_estimates_campaign->ad_groups) {
    cJSON *itemLocal = ad_group_delivery_estimates_convertToJSON(ad_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ad_groups, itemLocal);
    }
    }


    // campaign_delivery_estimates_campaign->budget_duration_type
    if (!campaign_delivery_estimates_campaign->budget_duration_type) {
        goto fail;
    }
    cJSON *budget_duration_type_local_JSON = budget_duration_type_convertToJSON(campaign_delivery_estimates_campaign->budget_duration_type);
    if(budget_duration_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "budget_duration_type", budget_duration_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // campaign_delivery_estimates_campaign->daily_spend_cap
    if(campaign_delivery_estimates_campaign->daily_spend_cap) {
    if(cJSON_AddNumberToObject(item, "daily_spend_cap", *campaign_delivery_estimates_campaign->daily_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_campaign->end_date
    if(campaign_delivery_estimates_campaign->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", campaign_delivery_estimates_campaign->end_date) == NULL) {
    goto fail; //String
    }
    }


    // campaign_delivery_estimates_campaign->lifetime_spend_cap
    if(campaign_delivery_estimates_campaign->lifetime_spend_cap) {
    if(cJSON_AddNumberToObject(item, "lifetime_spend_cap", *campaign_delivery_estimates_campaign->lifetime_spend_cap) == NULL) {
    goto fail; //Numeric
    }
    }


    // campaign_delivery_estimates_campaign->objective_type
    if (pinterest_rest_api_delivery_estimate_objective_type__NULL == campaign_delivery_estimates_campaign->objective_type) {
        goto fail;
    }
    cJSON *objective_type_local_JSON = delivery_estimate_objective_type_convertToJSON(campaign_delivery_estimates_campaign->objective_type);
    if(objective_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "objective_type", objective_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // campaign_delivery_estimates_campaign->start_date
    if (!campaign_delivery_estimates_campaign->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", campaign_delivery_estimates_campaign->start_date) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_parseFromJSON(cJSON *campaign_delivery_estimates_campaignJSON){

    campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_local_var = NULL;

    // define the local list for campaign_delivery_estimates_campaign->ad_groups
    list_t *ad_groupsList = NULL;

    // define the local variable for campaign_delivery_estimates_campaign->budget_duration_type
    budget_duration_type_t *budget_duration_type_local_nonprim = NULL;

    // define the local variable for campaign_delivery_estimates_campaign->daily_spend_cap
    int *daily_spend_cap_local_var = NULL;

    char *end_date_local_str = NULL;

    // define the local variable for campaign_delivery_estimates_campaign->lifetime_spend_cap
    int *lifetime_spend_cap_local_var = NULL;

    // define the local variable for campaign_delivery_estimates_campaign->objective_type
    pinterest_rest_api_delivery_estimate_objective_type__e objective_type_local_nonprim = 0;

    char *start_date_local_str = NULL;

    // campaign_delivery_estimates_campaign->ad_groups
    cJSON *ad_groups = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "ad_groups");
    if (cJSON_IsNull(ad_groups)) {
        ad_groups = NULL;
    }
    if (!ad_groups) {
        goto end;
    }

    
    cJSON *ad_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ad_groups)){
        goto end; //nonprimitive container
    }

    ad_groupsList = list_createList();

    cJSON_ArrayForEach(ad_groups_local_nonprimitive,ad_groups )
    {
        if(!cJSON_IsObject(ad_groups_local_nonprimitive)){
            goto end;
        }
        ad_group_delivery_estimates_t *ad_groupsItem = ad_group_delivery_estimates_parseFromJSON(ad_groups_local_nonprimitive);

        list_addElement(ad_groupsList, ad_groupsItem);
    }

    // campaign_delivery_estimates_campaign->budget_duration_type
    cJSON *budget_duration_type = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "budget_duration_type");
    if (cJSON_IsNull(budget_duration_type)) {
        budget_duration_type = NULL;
    }
    if (!budget_duration_type) {
        goto end;
    }

    
    budget_duration_type_local_nonprim = budget_duration_type_parseFromJSON(budget_duration_type); //custom

    // campaign_delivery_estimates_campaign->daily_spend_cap
    cJSON *daily_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "daily_spend_cap");
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

    // campaign_delivery_estimates_campaign->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (end_date) { 
    if(!cJSON_IsString(end_date) && !cJSON_IsNull(end_date))
    {
    goto end; //String
    }
    }

    // campaign_delivery_estimates_campaign->lifetime_spend_cap
    cJSON *lifetime_spend_cap = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "lifetime_spend_cap");
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

    // campaign_delivery_estimates_campaign->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (!objective_type) {
        goto end;
    }

    
    objective_type_local_nonprim = delivery_estimate_objective_type_parseFromJSON(objective_type); //custom

    // campaign_delivery_estimates_campaign->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(campaign_delivery_estimates_campaignJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }


    if (end_date && !cJSON_IsNull(end_date)) end_date_local_str = strdup(end_date->valuestring);
    if (start_date && !cJSON_IsNull(start_date)) start_date_local_str = strdup(start_date->valuestring);

    campaign_delivery_estimates_campaign_local_var = campaign_delivery_estimates_campaign_create_internal (
        ad_groupsList,
        budget_duration_type_local_nonprim,
        daily_spend_cap_local_var,
        end_date_local_str,
        lifetime_spend_cap_local_var,
        objective_type_local_nonprim,
        start_date_local_str
        );

    if (!campaign_delivery_estimates_campaign_local_var) {
        goto end;
    }

    return campaign_delivery_estimates_campaign_local_var;
end:
    if (ad_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_groupsList) {
            ad_group_delivery_estimates_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_groupsList);
        ad_groupsList = NULL;
    }
    if (budget_duration_type_local_nonprim) {
        budget_duration_type_free(budget_duration_type_local_nonprim);
        budget_duration_type_local_nonprim = NULL;
    }
    if (daily_spend_cap_local_var) {
        free(daily_spend_cap_local_var);
        daily_spend_cap_local_var = NULL;
    }
    if (end_date_local_str) {
        free(end_date_local_str);
        end_date_local_str = NULL;
    }
    if (lifetime_spend_cap_local_var) {
        free(lifetime_spend_cap_local_var);
        lifetime_spend_cap_local_var = NULL;
    }
    if (objective_type_local_nonprim) {
        objective_type_local_nonprim = 0;
    }
    if (start_date_local_str) {
        free(start_date_local_str);
        start_date_local_str = NULL;
    }
    return NULL;

}
