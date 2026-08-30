#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_request_update.h"



static bulk_upsert_request_update_t *bulk_upsert_request_update_create_internal(
    list_t *ad_groups,
    list_t *ads,
    list_t *campaigns,
    list_t *catalog_product_groups,
    list_t *keywords,
    list_t *labels,
    list_t *product_groups,
    list_t *schedules
    ) {
    bulk_upsert_request_update_t *bulk_upsert_request_update_local_var = malloc(sizeof(bulk_upsert_request_update_t));
    if (!bulk_upsert_request_update_local_var) {
        return NULL;
    }
    memset(bulk_upsert_request_update_local_var, 0, sizeof(bulk_upsert_request_update_t));
    bulk_upsert_request_update_local_var->_library_owned = 1;
    bulk_upsert_request_update_local_var->ad_groups = ad_groups;
    bulk_upsert_request_update_local_var->ads = ads;
    bulk_upsert_request_update_local_var->campaigns = campaigns;
    bulk_upsert_request_update_local_var->catalog_product_groups = catalog_product_groups;
    bulk_upsert_request_update_local_var->keywords = keywords;
    bulk_upsert_request_update_local_var->labels = labels;
    bulk_upsert_request_update_local_var->product_groups = product_groups;
    bulk_upsert_request_update_local_var->schedules = schedules;
    return bulk_upsert_request_update_local_var;
}

__attribute__((deprecated)) bulk_upsert_request_update_t *bulk_upsert_request_update_create(
    list_t *ad_groups,
    list_t *ads,
    list_t *campaigns,
    list_t *catalog_product_groups,
    list_t *keywords,
    list_t *labels,
    list_t *product_groups,
    list_t *schedules
    ) {
    bulk_upsert_request_update_t *result = bulk_upsert_request_update_create_internal (
        ad_groups,
        ads,
        campaigns,
        catalog_product_groups,
        keywords,
        labels,
        product_groups,
        schedules
        );
    if (!result) {
    }
    return result;
}

void bulk_upsert_request_update_free(bulk_upsert_request_update_t *bulk_upsert_request_update) {
    if(NULL == bulk_upsert_request_update){
        return ;
    }
    if(bulk_upsert_request_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bulk_upsert_request_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_request_update->ad_groups) {
        list_ForEach(listEntry, bulk_upsert_request_update->ad_groups) {
            ad_group_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->ad_groups);
        bulk_upsert_request_update->ad_groups = NULL;
    }
    if (bulk_upsert_request_update->ads) {
        list_ForEach(listEntry, bulk_upsert_request_update->ads) {
            ad_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->ads);
        bulk_upsert_request_update->ads = NULL;
    }
    if (bulk_upsert_request_update->campaigns) {
        list_ForEach(listEntry, bulk_upsert_request_update->campaigns) {
            campaign_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->campaigns);
        bulk_upsert_request_update->campaigns = NULL;
    }
    if (bulk_upsert_request_update->catalog_product_groups) {
        list_ForEach(listEntry, bulk_upsert_request_update->catalog_product_groups) {
            bulk_upsert_request_update_catalog_product_groups_items_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->catalog_product_groups);
        bulk_upsert_request_update->catalog_product_groups = NULL;
    }
    if (bulk_upsert_request_update->keywords) {
        list_ForEach(listEntry, bulk_upsert_request_update->keywords) {
            keyword_update_generated_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->keywords);
        bulk_upsert_request_update->keywords = NULL;
    }
    if (bulk_upsert_request_update->labels) {
        list_ForEach(listEntry, bulk_upsert_request_update->labels) {
            label_bulk_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->labels);
        bulk_upsert_request_update->labels = NULL;
    }
    if (bulk_upsert_request_update->product_groups) {
        list_ForEach(listEntry, bulk_upsert_request_update->product_groups) {
            product_group_promotion_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->product_groups);
        bulk_upsert_request_update->product_groups = NULL;
    }
    if (bulk_upsert_request_update->schedules) {
        list_ForEach(listEntry, bulk_upsert_request_update->schedules) {
            schedule_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->schedules);
        bulk_upsert_request_update->schedules = NULL;
    }
    free(bulk_upsert_request_update);
}

cJSON *bulk_upsert_request_update_convertToJSON(bulk_upsert_request_update_t *bulk_upsert_request_update) {
    cJSON *item = cJSON_CreateObject();

    // bulk_upsert_request_update->ad_groups
    if(bulk_upsert_request_update->ad_groups) {
    cJSON *ad_groups = cJSON_AddArrayToObject(item, "ad_groups");
    if(ad_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ad_groupsListEntry;
    if (bulk_upsert_request_update->ad_groups) {
    list_ForEach(ad_groupsListEntry, bulk_upsert_request_update->ad_groups) {
    cJSON *itemLocal = ad_group_update_request_convertToJSON(ad_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ad_groups, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->ads
    if(bulk_upsert_request_update->ads) {
    cJSON *ads = cJSON_AddArrayToObject(item, "ads");
    if(ads == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *adsListEntry;
    if (bulk_upsert_request_update->ads) {
    list_ForEach(adsListEntry, bulk_upsert_request_update->ads) {
    cJSON *itemLocal = ad_update_request_convertToJSON(adsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ads, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->campaigns
    if(bulk_upsert_request_update->campaigns) {
    cJSON *campaigns = cJSON_AddArrayToObject(item, "campaigns");
    if(campaigns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaignsListEntry;
    if (bulk_upsert_request_update->campaigns) {
    list_ForEach(campaignsListEntry, bulk_upsert_request_update->campaigns) {
    cJSON *itemLocal = campaign_update_request_convertToJSON(campaignsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaigns, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->catalog_product_groups
    if(bulk_upsert_request_update->catalog_product_groups) {
    cJSON *catalog_product_groups = cJSON_AddArrayToObject(item, "catalog_product_groups");
    if(catalog_product_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *catalog_product_groupsListEntry;
    if (bulk_upsert_request_update->catalog_product_groups) {
    list_ForEach(catalog_product_groupsListEntry, bulk_upsert_request_update->catalog_product_groups) {
    cJSON *itemLocal = bulk_upsert_request_update_catalog_product_groups_items_convertToJSON(catalog_product_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(catalog_product_groups, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->keywords
    if(bulk_upsert_request_update->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (bulk_upsert_request_update->keywords) {
    list_ForEach(keywordsListEntry, bulk_upsert_request_update->keywords) {
    cJSON *itemLocal = keyword_update_generated_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->labels
    if(bulk_upsert_request_update->labels) {
    cJSON *labels = cJSON_AddArrayToObject(item, "labels");
    if(labels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *labelsListEntry;
    if (bulk_upsert_request_update->labels) {
    list_ForEach(labelsListEntry, bulk_upsert_request_update->labels) {
    cJSON *itemLocal = label_bulk_update_request_convertToJSON(labelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(labels, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->product_groups
    if(bulk_upsert_request_update->product_groups) {
    cJSON *product_groups = cJSON_AddArrayToObject(item, "product_groups");
    if(product_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *product_groupsListEntry;
    if (bulk_upsert_request_update->product_groups) {
    list_ForEach(product_groupsListEntry, bulk_upsert_request_update->product_groups) {
    cJSON *itemLocal = product_group_promotion_update_request_convertToJSON(product_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(product_groups, itemLocal);
    }
    }
    }


    // bulk_upsert_request_update->schedules
    if(bulk_upsert_request_update->schedules) {
    cJSON *schedules = cJSON_AddArrayToObject(item, "schedules");
    if(schedules == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *schedulesListEntry;
    if (bulk_upsert_request_update->schedules) {
    list_ForEach(schedulesListEntry, bulk_upsert_request_update->schedules) {
    cJSON *itemLocal = schedule_update_request_convertToJSON(schedulesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(schedules, itemLocal);
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

bulk_upsert_request_update_t *bulk_upsert_request_update_parseFromJSON(cJSON *bulk_upsert_request_updateJSON){

    bulk_upsert_request_update_t *bulk_upsert_request_update_local_var = NULL;

    // define the local list for bulk_upsert_request_update->ad_groups
    list_t *ad_groupsList = NULL;

    // define the local list for bulk_upsert_request_update->ads
    list_t *adsList = NULL;

    // define the local list for bulk_upsert_request_update->campaigns
    list_t *campaignsList = NULL;

    // define the local list for bulk_upsert_request_update->catalog_product_groups
    list_t *catalog_product_groupsList = NULL;

    // define the local list for bulk_upsert_request_update->keywords
    list_t *keywordsList = NULL;

    // define the local list for bulk_upsert_request_update->labels
    list_t *labelsList = NULL;

    // define the local list for bulk_upsert_request_update->product_groups
    list_t *product_groupsList = NULL;

    // define the local list for bulk_upsert_request_update->schedules
    list_t *schedulesList = NULL;

    // bulk_upsert_request_update->ad_groups
    cJSON *ad_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "ad_groups");
    if (cJSON_IsNull(ad_groups)) {
        ad_groups = NULL;
    }
    if (ad_groups) { 
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
        ad_group_update_request_t *ad_groupsItem = ad_group_update_request_parseFromJSON(ad_groups_local_nonprimitive);

        list_addElement(ad_groupsList, ad_groupsItem);
    }
    }

    // bulk_upsert_request_update->ads
    cJSON *ads = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "ads");
    if (cJSON_IsNull(ads)) {
        ads = NULL;
    }
    if (ads) { 
    cJSON *ads_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ads)){
        goto end; //nonprimitive container
    }

    adsList = list_createList();

    cJSON_ArrayForEach(ads_local_nonprimitive,ads )
    {
        if(!cJSON_IsObject(ads_local_nonprimitive)){
            goto end;
        }
        ad_update_request_t *adsItem = ad_update_request_parseFromJSON(ads_local_nonprimitive);

        list_addElement(adsList, adsItem);
    }
    }

    // bulk_upsert_request_update->campaigns
    cJSON *campaigns = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "campaigns");
    if (cJSON_IsNull(campaigns)) {
        campaigns = NULL;
    }
    if (campaigns) { 
    cJSON *campaigns_local_nonprimitive = NULL;
    if(!cJSON_IsArray(campaigns)){
        goto end; //nonprimitive container
    }

    campaignsList = list_createList();

    cJSON_ArrayForEach(campaigns_local_nonprimitive,campaigns )
    {
        if(!cJSON_IsObject(campaigns_local_nonprimitive)){
            goto end;
        }
        campaign_update_request_t *campaignsItem = campaign_update_request_parseFromJSON(campaigns_local_nonprimitive);

        list_addElement(campaignsList, campaignsItem);
    }
    }

    // bulk_upsert_request_update->catalog_product_groups
    cJSON *catalog_product_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "catalog_product_groups");
    if (cJSON_IsNull(catalog_product_groups)) {
        catalog_product_groups = NULL;
    }
    if (catalog_product_groups) { 
    cJSON *catalog_product_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(catalog_product_groups)){
        goto end; //nonprimitive container
    }

    catalog_product_groupsList = list_createList();

    cJSON_ArrayForEach(catalog_product_groups_local_nonprimitive,catalog_product_groups )
    {
        if(!cJSON_IsObject(catalog_product_groups_local_nonprimitive)){
            goto end;
        }
        bulk_upsert_request_update_catalog_product_groups_items_t *catalog_product_groupsItem = bulk_upsert_request_update_catalog_product_groups_items_parseFromJSON(catalog_product_groups_local_nonprimitive);

        list_addElement(catalog_product_groupsList, catalog_product_groupsItem);
    }
    }

    // bulk_upsert_request_update->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "keywords");
    if (cJSON_IsNull(keywords)) {
        keywords = NULL;
    }
    if (keywords) { 
    cJSON *keywords_local_nonprimitive = NULL;
    if(!cJSON_IsArray(keywords)){
        goto end; //nonprimitive container
    }

    keywordsList = list_createList();

    cJSON_ArrayForEach(keywords_local_nonprimitive,keywords )
    {
        if(!cJSON_IsObject(keywords_local_nonprimitive)){
            goto end;
        }
        keyword_update_generated_t *keywordsItem = keyword_update_generated_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }

    // bulk_upsert_request_update->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "labels");
    if (cJSON_IsNull(labels)) {
        labels = NULL;
    }
    if (labels) { 
    cJSON *labels_local_nonprimitive = NULL;
    if(!cJSON_IsArray(labels)){
        goto end; //nonprimitive container
    }

    labelsList = list_createList();

    cJSON_ArrayForEach(labels_local_nonprimitive,labels )
    {
        if(!cJSON_IsObject(labels_local_nonprimitive)){
            goto end;
        }
        label_bulk_update_request_t *labelsItem = label_bulk_update_request_parseFromJSON(labels_local_nonprimitive);

        list_addElement(labelsList, labelsItem);
    }
    }

    // bulk_upsert_request_update->product_groups
    cJSON *product_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "product_groups");
    if (cJSON_IsNull(product_groups)) {
        product_groups = NULL;
    }
    if (product_groups) { 
    cJSON *product_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(product_groups)){
        goto end; //nonprimitive container
    }

    product_groupsList = list_createList();

    cJSON_ArrayForEach(product_groups_local_nonprimitive,product_groups )
    {
        if(!cJSON_IsObject(product_groups_local_nonprimitive)){
            goto end;
        }
        product_group_promotion_update_request_t *product_groupsItem = product_group_promotion_update_request_parseFromJSON(product_groups_local_nonprimitive);

        list_addElement(product_groupsList, product_groupsItem);
    }
    }

    // bulk_upsert_request_update->schedules
    cJSON *schedules = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "schedules");
    if (cJSON_IsNull(schedules)) {
        schedules = NULL;
    }
    if (schedules) { 
    cJSON *schedules_local_nonprimitive = NULL;
    if(!cJSON_IsArray(schedules)){
        goto end; //nonprimitive container
    }

    schedulesList = list_createList();

    cJSON_ArrayForEach(schedules_local_nonprimitive,schedules )
    {
        if(!cJSON_IsObject(schedules_local_nonprimitive)){
            goto end;
        }
        schedule_update_request_t *schedulesItem = schedule_update_request_parseFromJSON(schedules_local_nonprimitive);

        list_addElement(schedulesList, schedulesItem);
    }
    }



    bulk_upsert_request_update_local_var = bulk_upsert_request_update_create_internal (
        ad_groups ? ad_groupsList : NULL,
        ads ? adsList : NULL,
        campaigns ? campaignsList : NULL,
        catalog_product_groups ? catalog_product_groupsList : NULL,
        keywords ? keywordsList : NULL,
        labels ? labelsList : NULL,
        product_groups ? product_groupsList : NULL,
        schedules ? schedulesList : NULL
        );

    if (!bulk_upsert_request_update_local_var) {
        goto end;
    }

    return bulk_upsert_request_update_local_var;
end:
    if (ad_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_groupsList) {
            ad_group_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_groupsList);
        ad_groupsList = NULL;
    }
    if (adsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, adsList) {
            ad_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(adsList);
        adsList = NULL;
    }
    if (campaignsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaignsList) {
            campaign_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaignsList);
        campaignsList = NULL;
    }
    if (catalog_product_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, catalog_product_groupsList) {
            bulk_upsert_request_update_catalog_product_groups_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(catalog_product_groupsList);
        catalog_product_groupsList = NULL;
    }
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keyword_update_generated_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    if (labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, labelsList) {
            label_bulk_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(labelsList);
        labelsList = NULL;
    }
    if (product_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_groupsList) {
            product_group_promotion_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_groupsList);
        product_groupsList = NULL;
    }
    if (schedulesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, schedulesList) {
            schedule_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(schedulesList);
        schedulesList = NULL;
    }
    return NULL;

}
