#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_bid_options_update.h"


char* campaign_bid_options_update_update_mask_ToString(pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_e update_mask) {
    char *update_maskArray[] =  { "NULL", "AUDIENCE", "APP_TYPE", "PLACEMENT", "GENDER", "AGE_BUCKET" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_e campaign_bid_options_update_update_mask_FromString(char* update_mask) {
    int stringToReturn = 0;
    char *update_maskArray[] =  { "NULL", "AUDIENCE", "APP_TYPE", "PLACEMENT", "GENDER", "AGE_BUCKET" };
    size_t sizeofArray = sizeof(update_maskArray) / sizeof(update_maskArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(update_mask, update_maskArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static campaign_bid_options_update_t *campaign_bid_options_update_create_internal(
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    placement_multipliers_t *placement_multipliers,
    list_t *update_mask
    ) {
    campaign_bid_options_update_t *campaign_bid_options_update_local_var = malloc(sizeof(campaign_bid_options_update_t));
    if (!campaign_bid_options_update_local_var) {
        return NULL;
    }
    campaign_bid_options_update_local_var->app_type_multipliers = app_type_multipliers;
    campaign_bid_options_update_local_var->audience_multipliers = audience_multipliers;
    campaign_bid_options_update_local_var->placement_multipliers = placement_multipliers;
    campaign_bid_options_update_local_var->update_mask = update_mask;

    campaign_bid_options_update_local_var->_library_owned = 1;
    return campaign_bid_options_update_local_var;
}

__attribute__((deprecated)) campaign_bid_options_update_t *campaign_bid_options_update_create(
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    placement_multipliers_t *placement_multipliers,
    list_t *update_mask
    ) {
    return campaign_bid_options_update_create_internal (
        app_type_multipliers,
        audience_multipliers,
        placement_multipliers,
        update_mask
        );
}

void campaign_bid_options_update_free(campaign_bid_options_update_t *campaign_bid_options_update) {
    if(NULL == campaign_bid_options_update){
        return ;
    }
    if(campaign_bid_options_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "campaign_bid_options_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (campaign_bid_options_update->app_type_multipliers) {
        app_type_multipliers_free(campaign_bid_options_update->app_type_multipliers);
        campaign_bid_options_update->app_type_multipliers = NULL;
    }
    if (campaign_bid_options_update->audience_multipliers) {
        campaign_audience_multipliers_free(campaign_bid_options_update->audience_multipliers);
        campaign_bid_options_update->audience_multipliers = NULL;
    }
    if (campaign_bid_options_update->placement_multipliers) {
        placement_multipliers_free(campaign_bid_options_update->placement_multipliers);
        campaign_bid_options_update->placement_multipliers = NULL;
    }
    if (campaign_bid_options_update->update_mask) {
        list_ForEach(listEntry, campaign_bid_options_update->update_mask) {
            free(listEntry->data);
        }
        list_freeList(campaign_bid_options_update->update_mask);
        campaign_bid_options_update->update_mask = NULL;
    }
    free(campaign_bid_options_update);
}

cJSON *campaign_bid_options_update_convertToJSON(campaign_bid_options_update_t *campaign_bid_options_update) {
    cJSON *item = cJSON_CreateObject();

    // campaign_bid_options_update->app_type_multipliers
    if(campaign_bid_options_update->app_type_multipliers) {
    cJSON *app_type_multipliers_local_JSON = app_type_multipliers_convertToJSON(campaign_bid_options_update->app_type_multipliers);
    if(app_type_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "app_type_multipliers", app_type_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options_update->audience_multipliers
    if(campaign_bid_options_update->audience_multipliers) {
    cJSON *audience_multipliers_local_JSON = campaign_audience_multipliers_convertToJSON(campaign_bid_options_update->audience_multipliers);
    if(audience_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_multipliers", audience_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options_update->placement_multipliers
    if(campaign_bid_options_update->placement_multipliers) {
    cJSON *placement_multipliers_local_JSON = placement_multipliers_convertToJSON(campaign_bid_options_update->placement_multipliers);
    if(placement_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "placement_multipliers", placement_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options_update->update_mask
    if (pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_NULL == campaign_bid_options_update->update_mask) {
        goto fail;
    }
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *update_maskListEntry;
    list_ForEach(update_maskListEntry, campaign_bid_options_update->update_mask) {
    if(cJSON_AddStringToObject(update_mask, "", update_maskListEntry->data) == NULL)
    {
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

campaign_bid_options_update_t *campaign_bid_options_update_parseFromJSON(cJSON *campaign_bid_options_updateJSON){

    campaign_bid_options_update_t *campaign_bid_options_update_local_var = NULL;

    // define the local variable for campaign_bid_options_update->app_type_multipliers
    app_type_multipliers_t *app_type_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->audience_multipliers
    campaign_audience_multipliers_t *audience_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->placement_multipliers
    placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // define the local list for campaign_bid_options_update->update_mask
    list_t *update_maskList = NULL;

    // campaign_bid_options_update->app_type_multipliers
    cJSON *app_type_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "app_type_multipliers");
    if (cJSON_IsNull(app_type_multipliers)) {
        app_type_multipliers = NULL;
    }
    if (app_type_multipliers) { 
    app_type_multipliers_local_nonprim = app_type_multipliers_parseFromJSON(app_type_multipliers); //custom
    }

    // campaign_bid_options_update->audience_multipliers
    cJSON *audience_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "audience_multipliers");
    if (cJSON_IsNull(audience_multipliers)) {
        audience_multipliers = NULL;
    }
    if (audience_multipliers) { 
    audience_multipliers_local_nonprim = campaign_audience_multipliers_parseFromJSON(audience_multipliers); //custom
    }

    // campaign_bid_options_update->placement_multipliers
    cJSON *placement_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "placement_multipliers");
    if (cJSON_IsNull(placement_multipliers)) {
        placement_multipliers = NULL;
    }
    if (placement_multipliers) { 
    placement_multipliers_local_nonprim = placement_multipliers_parseFromJSON(placement_multipliers); //custom
    }

    // campaign_bid_options_update->update_mask
    cJSON *update_mask = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "update_mask");
    if (cJSON_IsNull(update_mask)) {
        update_mask = NULL;
    }
    if (!update_mask) {
        goto end;
    }

    
    cJSON *update_mask_local = NULL;
    if(!cJSON_IsArray(update_mask)) {
        goto end;//primitive container
    }
    update_maskList = list_createList();

    cJSON_ArrayForEach(update_mask_local, update_mask)
    {
        if(!cJSON_IsString(update_mask_local))
        {
            goto end;
        }
        list_addElement(update_maskList , strdup(update_mask_local->valuestring));
    }


    campaign_bid_options_update_local_var = campaign_bid_options_update_create_internal (
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        audience_multipliers ? audience_multipliers_local_nonprim : NULL,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL,
        update_maskList
        );

    return campaign_bid_options_update_local_var;
end:
    if (app_type_multipliers_local_nonprim) {
        app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (audience_multipliers_local_nonprim) {
        campaign_audience_multipliers_free(audience_multipliers_local_nonprim);
        audience_multipliers_local_nonprim = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    if (update_maskList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, update_maskList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(update_maskList);
        update_maskList = NULL;
    }
    return NULL;

}
