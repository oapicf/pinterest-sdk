#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_assets_summary.h"



invite_assets_summary_t *invite_assets_summary_create(
    list_t *ad_accounts,
    list_t *profiles
    ) {
    invite_assets_summary_t *invite_assets_summary_local_var = malloc(sizeof(invite_assets_summary_t));
    if (!invite_assets_summary_local_var) {
        return NULL;
    }
    invite_assets_summary_local_var->ad_accounts = ad_accounts;
    invite_assets_summary_local_var->profiles = profiles;

    return invite_assets_summary_local_var;
}


void invite_assets_summary_free(invite_assets_summary_t *invite_assets_summary) {
    if(NULL == invite_assets_summary){
        return ;
    }
    listEntry_t *listEntry;
    if (invite_assets_summary->ad_accounts) {
        list_ForEach(listEntry, invite_assets_summary->ad_accounts) {
            invite_assets_summary_ad_accounts_inner_free(listEntry->data);
        }
        list_freeList(invite_assets_summary->ad_accounts);
        invite_assets_summary->ad_accounts = NULL;
    }
    if (invite_assets_summary->profiles) {
        list_ForEach(listEntry, invite_assets_summary->profiles) {
            invite_assets_summary_profiles_inner_free(listEntry->data);
        }
        list_freeList(invite_assets_summary->profiles);
        invite_assets_summary->profiles = NULL;
    }
    free(invite_assets_summary);
}

cJSON *invite_assets_summary_convertToJSON(invite_assets_summary_t *invite_assets_summary) {
    cJSON *item = cJSON_CreateObject();

    // invite_assets_summary->ad_accounts
    if(invite_assets_summary->ad_accounts) {
    cJSON *ad_accounts = cJSON_AddArrayToObject(item, "ad_accounts");
    if(ad_accounts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *ad_accountsListEntry;
    if (invite_assets_summary->ad_accounts) {
    list_ForEach(ad_accountsListEntry, invite_assets_summary->ad_accounts) {
    cJSON *itemLocal = invite_assets_summary_ad_accounts_inner_convertToJSON(ad_accountsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ad_accounts, itemLocal);
    }
    }
    }


    // invite_assets_summary->profiles
    if(invite_assets_summary->profiles) {
    cJSON *profiles = cJSON_AddArrayToObject(item, "profiles");
    if(profiles == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *profilesListEntry;
    if (invite_assets_summary->profiles) {
    list_ForEach(profilesListEntry, invite_assets_summary->profiles) {
    cJSON *itemLocal = invite_assets_summary_profiles_inner_convertToJSON(profilesListEntry->data);
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

invite_assets_summary_t *invite_assets_summary_parseFromJSON(cJSON *invite_assets_summaryJSON){

    invite_assets_summary_t *invite_assets_summary_local_var = NULL;

    // define the local list for invite_assets_summary->ad_accounts
    list_t *ad_accountsList = NULL;

    // define the local list for invite_assets_summary->profiles
    list_t *profilesList = NULL;

    // invite_assets_summary->ad_accounts
    cJSON *ad_accounts = cJSON_GetObjectItemCaseSensitive(invite_assets_summaryJSON, "ad_accounts");
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
        invite_assets_summary_ad_accounts_inner_t *ad_accountsItem = invite_assets_summary_ad_accounts_inner_parseFromJSON(ad_accounts_local_nonprimitive);

        list_addElement(ad_accountsList, ad_accountsItem);
    }
    }

    // invite_assets_summary->profiles
    cJSON *profiles = cJSON_GetObjectItemCaseSensitive(invite_assets_summaryJSON, "profiles");
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
        invite_assets_summary_profiles_inner_t *profilesItem = invite_assets_summary_profiles_inner_parseFromJSON(profiles_local_nonprimitive);

        list_addElement(profilesList, profilesItem);
    }
    }


    invite_assets_summary_local_var = invite_assets_summary_create (
        ad_accounts ? ad_accountsList : NULL,
        profiles ? profilesList : NULL
        );

    return invite_assets_summary_local_var;
end:
    if (ad_accountsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_accountsList) {
            invite_assets_summary_ad_accounts_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_accountsList);
        ad_accountsList = NULL;
    }
    if (profilesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, profilesList) {
            invite_assets_summary_profiles_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(profilesList);
        profilesList = NULL;
    }
    return NULL;

}
