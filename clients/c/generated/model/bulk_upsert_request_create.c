#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_upsert_request_create.h"



bulk_upsert_request_create_t *bulk_upsert_request_create_create(
    list_t *campaigns,
    list_t *ad_groups,
    list_t *ads,
    list_t *product_groups,
    list_t *keywords
    ) {
    bulk_upsert_request_create_t *bulk_upsert_request_create_local_var = malloc(sizeof(bulk_upsert_request_create_t));
    if (!bulk_upsert_request_create_local_var) {
        return NULL;
    }
    bulk_upsert_request_create_local_var->campaigns = campaigns;
    bulk_upsert_request_create_local_var->ad_groups = ad_groups;
    bulk_upsert_request_create_local_var->ads = ads;
    bulk_upsert_request_create_local_var->product_groups = product_groups;
    bulk_upsert_request_create_local_var->keywords = keywords;

    return bulk_upsert_request_create_local_var;
}


void bulk_upsert_request_create_free(bulk_upsert_request_create_t *bulk_upsert_request_create) {
    if(NULL == bulk_upsert_request_create){
        return ;
    }
    listEntry_t *listEntry;
    if (bulk_upsert_request_create->campaigns) {
        list_ForEach(listEntry, bulk_upsert_request_create->campaigns) {
            campaign_create_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_create->campaigns);
        bulk_upsert_request_create->campaigns = NULL;
    }
    if (bulk_upsert_request_create->ad_groups) {
        list_ForEach(listEntry, bulk_upsert_request_create->ad_groups) {
            ad_group_create_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_create->ad_groups);
        bulk_upsert_request_create->ad_groups = NULL;
    }
    if (bulk_upsert_request_create->ads) {
        list_ForEach(listEntry, bulk_upsert_request_create->ads) {
            ad_create_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_create->ads);
        bulk_upsert_request_create->ads = NULL;
    }
    if (bulk_upsert_request_create->product_groups) {
        list_ForEach(listEntry, bulk_upsert_request_create->product_groups) {
            product_group_promotion_create_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_create->product_groups);
        bulk_upsert_request_create->product_groups = NULL;
    }
    if (bulk_upsert_request_create->keywords) {
        list_ForEach(listEntry, bulk_upsert_request_create->keywords) {
            keywords_request_free(listEntry->data);
        }
        list_freeList(bulk_upsert_request_create->keywords);
        bulk_upsert_request_create->keywords = NULL;
    }
    free(bulk_upsert_request_create);
}

cJSON *bulk_upsert_request_create_convertToJSON(bulk_upsert_request_create_t *bulk_upsert_request_create) {
    cJSON *item = cJSON_CreateObject();

    // bulk_upsert_request_create->campaigns
    if(bulk_upsert_request_create->campaigns) {
    cJSON *campaigns = cJSON_AddArrayToObject(item, "campaigns");
    if(campaigns == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *campaignsListEntry;
    if (bulk_upsert_request_create->campaigns) {
    list_ForEach(campaignsListEntry, bulk_upsert_request_create->campaigns) {
    cJSON *itemLocal = campaign_create_request_convertToJSON(campaignsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(campaigns, itemLocal);
    }
    }
    }


    // bulk_upsert_request_create->ad_groups
    if(bulk_upsert_request_create->ad_groups) {
    cJSON *ad_groups = cJSON_AddArrayToObject(item, "ad_groups");
    if(ad_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ad_groupsListEntry;
    if (bulk_upsert_request_create->ad_groups) {
    list_ForEach(ad_groupsListEntry, bulk_upsert_request_create->ad_groups) {
    cJSON *itemLocal = ad_group_create_request_convertToJSON(ad_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ad_groups, itemLocal);
    }
    }
    }


    // bulk_upsert_request_create->ads
    if(bulk_upsert_request_create->ads) {
    cJSON *ads = cJSON_AddArrayToObject(item, "ads");
    if(ads == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *adsListEntry;
    if (bulk_upsert_request_create->ads) {
    list_ForEach(adsListEntry, bulk_upsert_request_create->ads) {
    cJSON *itemLocal = ad_create_request_convertToJSON(adsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ads, itemLocal);
    }
    }
    }


    // bulk_upsert_request_create->product_groups
    if(bulk_upsert_request_create->product_groups) {
    cJSON *product_groups = cJSON_AddArrayToObject(item, "product_groups");
    if(product_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *product_groupsListEntry;
    if (bulk_upsert_request_create->product_groups) {
    list_ForEach(product_groupsListEntry, bulk_upsert_request_create->product_groups) {
    cJSON *itemLocal = product_group_promotion_create_request_convertToJSON(product_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(product_groups, itemLocal);
    }
    }
    }


    // bulk_upsert_request_create->keywords
    if(bulk_upsert_request_create->keywords) {
    cJSON *keywords = cJSON_AddArrayToObject(item, "keywords");
    if(keywords == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *keywordsListEntry;
    if (bulk_upsert_request_create->keywords) {
    list_ForEach(keywordsListEntry, bulk_upsert_request_create->keywords) {
    cJSON *itemLocal = keywords_request_convertToJSON(keywordsListEntry->data);
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

bulk_upsert_request_create_t *bulk_upsert_request_create_parseFromJSON(cJSON *bulk_upsert_request_createJSON){

    bulk_upsert_request_create_t *bulk_upsert_request_create_local_var = NULL;

    // define the local list for bulk_upsert_request_create->campaigns
    list_t *campaignsList = NULL;

    // define the local list for bulk_upsert_request_create->ad_groups
    list_t *ad_groupsList = NULL;

    // define the local list for bulk_upsert_request_create->ads
    list_t *adsList = NULL;

    // define the local list for bulk_upsert_request_create->product_groups
    list_t *product_groupsList = NULL;

    // define the local list for bulk_upsert_request_create->keywords
    list_t *keywordsList = NULL;

    // bulk_upsert_request_create->campaigns
    cJSON *campaigns = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_createJSON, "campaigns");
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
        campaign_create_request_t *campaignsItem = campaign_create_request_parseFromJSON(campaigns_local_nonprimitive);

        list_addElement(campaignsList, campaignsItem);
    }
    }

    // bulk_upsert_request_create->ad_groups
    cJSON *ad_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_createJSON, "ad_groups");
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
        ad_group_create_request_t *ad_groupsItem = ad_group_create_request_parseFromJSON(ad_groups_local_nonprimitive);

        list_addElement(ad_groupsList, ad_groupsItem);
    }
    }

    // bulk_upsert_request_create->ads
    cJSON *ads = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_createJSON, "ads");
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
        ad_create_request_t *adsItem = ad_create_request_parseFromJSON(ads_local_nonprimitive);

        list_addElement(adsList, adsItem);
    }
    }

    // bulk_upsert_request_create->product_groups
    cJSON *product_groups = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_createJSON, "product_groups");
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
        product_group_promotion_create_request_t *product_groupsItem = product_group_promotion_create_request_parseFromJSON(product_groups_local_nonprimitive);

        list_addElement(product_groupsList, product_groupsItem);
    }
    }

    // bulk_upsert_request_create->keywords
    cJSON *keywords = cJSON_GetObjectItemCaseSensitive(bulk_upsert_request_createJSON, "keywords");
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
        keywords_request_t *keywordsItem = keywords_request_parseFromJSON(keywords_local_nonprimitive);

        list_addElement(keywordsList, keywordsItem);
    }
    }


    bulk_upsert_request_create_local_var = bulk_upsert_request_create_create (
        campaigns ? campaignsList : NULL,
        ad_groups ? ad_groupsList : NULL,
        ads ? adsList : NULL,
        product_groups ? product_groupsList : NULL,
        keywords ? keywordsList : NULL
        );

    return bulk_upsert_request_create_local_var;
end:
    if (campaignsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaignsList) {
            campaign_create_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaignsList);
        campaignsList = NULL;
    }
    if (ad_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_groupsList) {
            ad_group_create_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_groupsList);
        ad_groupsList = NULL;
    }
    if (adsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, adsList) {
            ad_create_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(adsList);
        adsList = NULL;
    }
    if (product_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_groupsList) {
            product_group_promotion_create_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_groupsList);
        product_groupsList = NULL;
    }
    if (keywordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, keywordsList) {
            keywords_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(keywordsList);
        keywordsList = NULL;
    }
    return NULL;

}
