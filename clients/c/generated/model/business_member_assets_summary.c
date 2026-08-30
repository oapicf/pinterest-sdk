#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "business_member_assets_summary.h"



static business_member_assets_summary_t *business_member_assets_summary_create_internal(
    list_t *ad_accounts,
    list_t *profiles
    ) {
    business_member_assets_summary_t *business_member_assets_summary_local_var = malloc(sizeof(business_member_assets_summary_t));
    if (!business_member_assets_summary_local_var) {
        return NULL;
    }
    memset(business_member_assets_summary_local_var, 0, sizeof(business_member_assets_summary_t));
    business_member_assets_summary_local_var->_library_owned = 1;
    business_member_assets_summary_local_var->ad_accounts = ad_accounts;
    business_member_assets_summary_local_var->profiles = profiles;
    return business_member_assets_summary_local_var;
}

__attribute__((deprecated)) business_member_assets_summary_t *business_member_assets_summary_create(
    list_t *ad_accounts,
    list_t *profiles
    ) {
    business_member_assets_summary_t *result = business_member_assets_summary_create_internal (
        ad_accounts,
        profiles
        );
    if (!result) {
    }
    return result;
}

void business_member_assets_summary_free(business_member_assets_summary_t *business_member_assets_summary) {
    if(NULL == business_member_assets_summary){
        return ;
    }
    if(business_member_assets_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "business_member_assets_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (business_member_assets_summary->ad_accounts) {
        list_ForEach(listEntry, business_member_assets_summary->ad_accounts) {
            asset_id_with_permissions_free(listEntry->data);
        }
        list_freeList(business_member_assets_summary->ad_accounts);
        business_member_assets_summary->ad_accounts = NULL;
    }
    if (business_member_assets_summary->profiles) {
        list_ForEach(listEntry, business_member_assets_summary->profiles) {
            asset_id_with_permissions_free(listEntry->data);
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
    cJSON *itemLocal = asset_id_with_permissions_convertToJSON(ad_accountsListEntry->data);
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
    cJSON *itemLocal = asset_id_with_permissions_convertToJSON(profilesListEntry->data);
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
    if (cJSON_IsNull(ad_accounts)) {
        ad_accounts = NULL;
    }
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
        asset_id_with_permissions_t *ad_accountsItem = asset_id_with_permissions_parseFromJSON(ad_accounts_local_nonprimitive);

        list_addElement(ad_accountsList, ad_accountsItem);
    }
    }

    // business_member_assets_summary->profiles
    cJSON *profiles = cJSON_GetObjectItemCaseSensitive(business_member_assets_summaryJSON, "profiles");
    if (cJSON_IsNull(profiles)) {
        profiles = NULL;
    }
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
        asset_id_with_permissions_t *profilesItem = asset_id_with_permissions_parseFromJSON(profiles_local_nonprimitive);

        list_addElement(profilesList, profilesItem);
    }
    }



    business_member_assets_summary_local_var = business_member_assets_summary_create_internal (
        ad_accounts ? ad_accountsList : NULL,
        profiles ? profilesList : NULL
        );

    if (!business_member_assets_summary_local_var) {
        goto end;
    }

    return business_member_assets_summary_local_var;
end:
    if (ad_accountsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_accountsList) {
            asset_id_with_permissions_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_accountsList);
        ad_accountsList = NULL;
    }
    if (profilesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, profilesList) {
            asset_id_with_permissions_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(profilesList);
        profilesList = NULL;
    }
    return NULL;

}
