#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_member_assets_summary.h"



business_member_assets_summary_t *business_member_assets_summary_create(
    list_t *ad_accounts,
    list_t *profiles
    ) {
    business_member_assets_summary_t *business_member_assets_summary_local_var = malloc(sizeof(business_member_assets_summary_t));
    if (!business_member_assets_summary_local_var) {
        return NULL;
    }
    business_member_assets_summary_local_var->ad_accounts = ad_accounts;
    business_member_assets_summary_local_var->profiles = profiles;

    return business_member_assets_summary_local_var;
}


void business_member_assets_summary_free(business_member_assets_summary_t *business_member_assets_summary) {
    if(NULL == business_member_assets_summary){
        return ;
    }
    listEntry_t *listEntry;
    if (business_member_assets_summary->ad_accounts) {
        list_ForEach(listEntry, business_member_assets_summary->ad_accounts) {
            business_member_assets_summary_ad_accounts_inner_free(listEntry->data);
        }
        list_freeList(business_member_assets_summary->ad_accounts);
        business_member_assets_summary->ad_accounts = NULL;
    }
    if (business_member_assets_summary->profiles) {
        list_ForEach(listEntry, business_member_assets_summary->profiles) {
            business_member_assets_summary_profiles_inner_free(listEntry->data);
        }
        list_freeList(business_member_assets_summary->profiles);
        business_member_assets_summary->profiles = NULL;
    }
    free(business_member_assets_summary);
}

cJSON *business_member_assets_summary_convertToJSON(business_member_assets_summary_t *business_member_assets_summary) {
    cJSON *item = cJSON_CreateObject();

    // business_member_assets_summary->ad_accounts
    if(business_member_assets_summary->ad_accounts) {
    cJSON *ad_accounts = cJSON_AddArrayToObject(item, "ad_accounts");
    if(ad_accounts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ad_accountsListEntry;
    if (business_member_assets_summary->ad_accounts) {
    list_ForEach(ad_accountsListEntry, business_member_assets_summary->ad_accounts) {
    cJSON *itemLocal = business_member_assets_summary_ad_accounts_inner_convertToJSON(ad_accountsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ad_accounts, itemLocal);
    }
    }
    }


    // business_member_assets_summary->profiles
    if(business_member_assets_summary->profiles) {
    cJSON *profiles = cJSON_AddArrayToObject(item, "profiles");
    if(profiles == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *profilesListEntry;
    if (business_member_assets_summary->profiles) {
    list_ForEach(profilesListEntry, business_member_assets_summary->profiles) {
    cJSON *itemLocal = business_member_assets_summary_profiles_inner_convertToJSON(profilesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(profiles, itemLocal);
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

business_member_assets_summary_t *business_member_assets_summary_parseFromJSON(cJSON *business_member_assets_summaryJSON){

    business_member_assets_summary_t *business_member_assets_summary_local_var = NULL;

    // define the local list for business_member_assets_summary->ad_accounts
    list_t *ad_accountsList = NULL;

    // define the local list for business_member_assets_summary->profiles
    list_t *profilesList = NULL;

    // business_member_assets_summary->ad_accounts
    cJSON *ad_accounts = cJSON_GetObjectItemCaseSensitive(business_member_assets_summaryJSON, "ad_accounts");
    if (ad_accounts) { 
    cJSON *ad_accounts_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ad_accounts)){
        goto end; //nonprimitive container
    }

    ad_accountsList = list_createList();

    cJSON_ArrayForEach(ad_accounts_local_nonprimitive,ad_accounts )
    {
        if(!cJSON_IsObject(ad_accounts_local_nonprimitive)){
            goto end;
        }
        business_member_assets_summary_ad_accounts_inner_t *ad_accountsItem = business_member_assets_summary_ad_accounts_inner_parseFromJSON(ad_accounts_local_nonprimitive);

        list_addElement(ad_accountsList, ad_accountsItem);
    }
    }

    // business_member_assets_summary->profiles
    cJSON *profiles = cJSON_GetObjectItemCaseSensitive(business_member_assets_summaryJSON, "profiles");
    if (profiles) { 
    cJSON *profiles_local_nonprimitive = NULL;
    if(!cJSON_IsArray(profiles)){
        goto end; //nonprimitive container
    }

    profilesList = list_createList();

    cJSON_ArrayForEach(profiles_local_nonprimitive,profiles )
    {
        if(!cJSON_IsObject(profiles_local_nonprimitive)){
            goto end;
        }
        business_member_assets_summary_profiles_inner_t *profilesItem = business_member_assets_summary_profiles_inner_parseFromJSON(profiles_local_nonprimitive);

        list_addElement(profilesList, profilesItem);
    }
    }


    business_member_assets_summary_local_var = business_member_assets_summary_create (
        ad_accounts ? ad_accountsList : NULL,
        profiles ? profilesList : NULL
        );

    return business_member_assets_summary_local_var;
end:
    if (ad_accountsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_accountsList) {
            business_member_assets_summary_ad_accounts_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_accountsList);
        ad_accountsList = NULL;
    }
    if (profilesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, profilesList) {
            business_member_assets_summary_profiles_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(profilesList);
        profilesList = NULL;
    }
    return NULL;

}
