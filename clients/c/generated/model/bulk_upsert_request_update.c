#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_request_update.h"



bulk_upsert_request_update_t *bulk_upsert_request_update_create(
    list_t *campaigns,
    list_t *ad_groups,
    list_t *ads,
    list_t *product_groups,
    list_t *keywords
    ) {
    bulk_upsert_request_update_t *bulk_upsert_request_update_local_var = malloc(sizeof(bulk_upsert_request_update_t));
    if (!bulk_upsert_request_update_local_var) {
        return NULL;
    }
    bulk_upsert_request_update_local_var->campaigns = campaigns;
    bulk_upsert_request_update_local_var->ad_groups = ad_groups;
    bulk_upsert_request_update_local_var->ads = ads;
    bulk_upsert_request_update_local_var->product_groups = product_groups;
    bulk_upsert_request_update_local_var->keywords = keywords;

    return bulk_upsert_request_update_local_var;
}


void bulk_upsert_request_update_free(bulk_upsert_request_update_t *bulk_upsert_request_update) {
    if(NULL == bulk_upsert_request_update){
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_request_update->campaigns) {
        list_ForEach(listEntry, bulk_upsert_request_update->campaigns) {
            campaign_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->campaigns);
        bulk_upsert_request_update->campaigns = NULL;
    }
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
    if (bulk_upsert_request_update->product_groups) {
        list_ForEach(listEntry, bulk_upsert_request_update->product_groups) {
            product_group_promotion_update_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->product_groups);
        bulk_upsert_request_update->product_groups = NULL;
    }
    if (bulk_upsert_request_update->keywords) {
        list_ForEach(listEntry, bulk_upsert_request_update->keywords) {
            keyword_update_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_update->keywords);
        bulk_upsert_request_update->keywords = NULL;
    }
    free(bulk_upsert_request_update);
}

cJSON *bulk_upsert_request_update_convertToJSON(bulk_upsert_request_update_t *bulk_upsert_request_update) {
    cJSON *item = cJSON_CreateObject();

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


    // bulk_upsert_request_update->keywords
    if(bulk_upsert_request_update->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (bulk_upsert_request_update->keywords) {
    list_ForEach(keywordsListEntry, bulk_upsert_request_update->keywords) {
    cJSON *itemLocal = keyword_update_convertToJSON(keywordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(keywords, itemLocal);
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

    // define the local list for bulk_upsert_request_update->campaigns
    list_t *campaignsList = NULL;

    // define the local list for bulk_upsert_request_update->ad_groups
    list_t *ad_groupsList = NULL;

    // define the local list for bulk_upsert_request_update->ads
    list_t *adsList = NULL;

    // define the local list for bulk_upsert_request_update->product_groups
    list_t *product_groupsList = NULL;

    // define the local list for bulk_upsert_request_update->keywords
    list_t *keywordsList = NULL;

    // bulk_upsert_request_update->campaigns
    cJSON *campaigns = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "campaigns");
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

    // bulk_upsert_request_update->ad_groups
    cJSON *ad_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "ad_groups");
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

    // bulk_upsert_request_update->product_groups
    cJSON *product_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "product_groups");
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

    // bulk_upsert_request_update->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_updateJSON, "keywords");
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
        keyword_update_t *keywordsItem = keyword_update_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }


    bulk_upsert_request_update_local_var = bulk_upsert_request_update_create (
        campaigns ? campaignsList : NULL,
        ad_groups ? ad_groupsList : NULL,
        ads ? adsList : NULL,
        product_groups ? product_groupsList : NULL,
        keywords ? keywordsList : NULL
        );

    return bulk_upsert_request_update_local_var;
end:
    if (campaignsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaignsList) {
            campaign_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaignsList);
        campaignsList = NULL;
    }
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
    if (product_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_groupsList) {
            product_group_promotion_update_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_groupsList);
        product_groupsList = NULL;
    }
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keyword_update_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
