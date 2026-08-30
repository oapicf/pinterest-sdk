#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "performance_plus_campaign_settings.h"



static performance_plus_campaign_settings_t *performance_plus_campaign_settings_create_internal(
    int *boost_prospecting_ad_group_bid,
    list_t *pinner_list_exclusions
    ) {
    performance_plus_campaign_settings_t *performance_plus_campaign_settings_local_var = malloc(sizeof(performance_plus_campaign_settings_t));
    if (!performance_plus_campaign_settings_local_var) {
        return NULL;
    }
    memset(performance_plus_campaign_settings_local_var, 0, sizeof(performance_plus_campaign_settings_t));
    performance_plus_campaign_settings_local_var->_library_owned = 1;
    performance_plus_campaign_settings_local_var->boost_prospecting_ad_group_bid = boost_prospecting_ad_group_bid;
    performance_plus_campaign_settings_local_var->pinner_list_exclusions = pinner_list_exclusions;
    return performance_plus_campaign_settings_local_var;
}

__attribute__((deprecated)) performance_plus_campaign_settings_t *performance_plus_campaign_settings_create(
    int *boost_prospecting_ad_group_bid,
    list_t *pinner_list_exclusions
    ) {
    int *boost_prospecting_ad_group_bid_copy = NULL;
    if (boost_prospecting_ad_group_bid) {
        boost_prospecting_ad_group_bid_copy = malloc(sizeof(int));
        if (boost_prospecting_ad_group_bid_copy) *boost_prospecting_ad_group_bid_copy = *boost_prospecting_ad_group_bid;
    }
    performance_plus_campaign_settings_t *result = performance_plus_campaign_settings_create_internal (
        boost_prospecting_ad_group_bid_copy,
        pinner_list_exclusions
        );
    if (!result) {
        free(boost_prospecting_ad_group_bid_copy);
    }
    return result;
}

void performance_plus_campaign_settings_free(performance_plus_campaign_settings_t *performance_plus_campaign_settings) {
    if(NULL == performance_plus_campaign_settings){
        return ;
    }
    if(performance_plus_campaign_settings->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "performance_plus_campaign_settings_free");
        return ;
    }
    listEntry_t *listEntry;
    if (performance_plus_campaign_settings->boost_prospecting_ad_group_bid) {
        free(performance_plus_campaign_settings->boost_prospecting_ad_group_bid);
        performance_plus_campaign_settings->boost_prospecting_ad_group_bid = NULL;
    }
    if (performance_plus_campaign_settings->pinner_list_exclusions) {
        list_ForEach(listEntry, performance_plus_campaign_settings->pinner_list_exclusions) {
            free(listEntry->data);
        }
        list_freeList(performance_plus_campaign_settings->pinner_list_exclusions);
        performance_plus_campaign_settings->pinner_list_exclusions = NULL;
    }
    free(performance_plus_campaign_settings);
}

cJSON *performance_plus_campaign_settings_convertToJSON(performance_plus_campaign_settings_t *performance_plus_campaign_settings) {
    cJSON *item = cJSON_CreateObject();

    // performance_plus_campaign_settings->boost_prospecting_ad_group_bid
    if(performance_plus_campaign_settings->boost_prospecting_ad_group_bid) {
    if(cJSON_AddBoolToObject(item, "boost_prospecting_ad_group_bid", *performance_plus_campaign_settings->boost_prospecting_ad_group_bid) == NULL) {
    goto fail; //Bool
    }
    }


    // performance_plus_campaign_settings->pinner_list_exclusions
    if(performance_plus_campaign_settings->pinner_list_exclusions) {
    cJSON *pinner_list_exclusions = cJSON_AddArrayToObject(item, "pinner_list_exclusions");
    if(pinner_list_exclusions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *pinner_list_exclusionsListEntry;
    list_ForEach(pinner_list_exclusionsListEntry, performance_plus_campaign_settings->pinner_list_exclusions) {
    if(cJSON_AddStringToObject(pinner_list_exclusions, "", pinner_list_exclusionsListEntry->data) == NULL)
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

performance_plus_campaign_settings_t *performance_plus_campaign_settings_parseFromJSON(cJSON *performance_plus_campaign_settingsJSON){

    performance_plus_campaign_settings_t *performance_plus_campaign_settings_local_var = NULL;

    // define the local variable for performance_plus_campaign_settings->boost_prospecting_ad_group_bid
    int *boost_prospecting_ad_group_bid_local_var = NULL;

    // define the local list for performance_plus_campaign_settings->pinner_list_exclusions
    list_t *pinner_list_exclusionsList = NULL;

    // performance_plus_campaign_settings->boost_prospecting_ad_group_bid
    cJSON *boost_prospecting_ad_group_bid = cJSON_GetObjectItemCaseSensitive(performance_plus_campaign_settingsJSON, "boost_prospecting_ad_group_bid");
    if (cJSON_IsNull(boost_prospecting_ad_group_bid)) {
        boost_prospecting_ad_group_bid = NULL;
    }
    if (boost_prospecting_ad_group_bid) { 
    if(!cJSON_IsBool(boost_prospecting_ad_group_bid))
    {
    goto end; //Bool
    }
    boost_prospecting_ad_group_bid_local_var = malloc(sizeof(int));
    if(!boost_prospecting_ad_group_bid_local_var)
    {
        goto end;
    }
    *boost_prospecting_ad_group_bid_local_var = boost_prospecting_ad_group_bid->valueint;
    }

    // performance_plus_campaign_settings->pinner_list_exclusions
    cJSON *pinner_list_exclusions = cJSON_GetObjectItemCaseSensitive(performance_plus_campaign_settingsJSON, "pinner_list_exclusions");
    if (cJSON_IsNull(pinner_list_exclusions)) {
        pinner_list_exclusions = NULL;
    }
    if (pinner_list_exclusions) { 
    cJSON *pinner_list_exclusions_local = NULL;
    if(!cJSON_IsArray(pinner_list_exclusions)) {
        goto end;//primitive container
    }
    pinner_list_exclusionsList = list_createList();

    cJSON_ArrayForEach(pinner_list_exclusions_local, pinner_list_exclusions)
    {
        if(!cJSON_IsString(pinner_list_exclusions_local))
        {
            goto end;
        }
        list_addElement(pinner_list_exclusionsList , strdup(pinner_list_exclusions_local->valuestring));
    }
    }



    performance_plus_campaign_settings_local_var = performance_plus_campaign_settings_create_internal (
        boost_prospecting_ad_group_bid_local_var,
        pinner_list_exclusions ? pinner_list_exclusionsList : NULL
        );

    if (!performance_plus_campaign_settings_local_var) {
        goto end;
    }

    return performance_plus_campaign_settings_local_var;
end:
    if (boost_prospecting_ad_group_bid_local_var) {
        free(boost_prospecting_ad_group_bid_local_var);
        boost_prospecting_ad_group_bid_local_var = NULL;
    }
    if (pinner_list_exclusionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pinner_list_exclusionsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pinner_list_exclusionsList);
        pinner_list_exclusionsList = NULL;
    }
    return NULL;

}
