#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_bid_options_update.h"


char* campaign_bid_options_update_update_mask_ToString(pinterest_rest_api_campaign_bid_options_update__e update_mask) {
    char *update_maskArray[] =  { "NULL", "AUDIENCE", "APP_TYPE", "PLACEMENT", "GENDER", "AGE_BUCKET", "FREQUENCY" };
    return update_maskArray[update_mask - 1];
}

pinterest_rest_api_campaign_bid_options_update__e campaign_bid_options_update_update_mask_FromString(char* update_mask) {
    int stringToReturn = 0;
    char *update_maskArray[] =  { "NULL", "AUDIENCE", "APP_TYPE", "PLACEMENT", "GENDER", "AGE_BUCKET", "FREQUENCY" };
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
    age_bucket_multipliers_t *age_bucket_multipliers,
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window,
    frequency_multipliers_t *frequency_multipliers,
    gender_multipliers_t *gender_multipliers,
    placement_multipliers_t *placement_multipliers,
    list_t *update_mask
    ) {
    campaign_bid_options_update_t *campaign_bid_options_update_local_var = malloc(sizeof(campaign_bid_options_update_t));
    if (!campaign_bid_options_update_local_var) {
        return NULL;
    }
    memset(campaign_bid_options_update_local_var, 0, sizeof(campaign_bid_options_update_t));
    campaign_bid_options_update_local_var->_library_owned = 1;
    campaign_bid_options_update_local_var->age_bucket_multipliers = age_bucket_multipliers;
    campaign_bid_options_update_local_var->app_type_multipliers = app_type_multipliers;
    campaign_bid_options_update_local_var->audience_multipliers = audience_multipliers;
    campaign_bid_options_update_local_var->freq_bid_multiplier_time_window = freq_bid_multiplier_time_window;
    campaign_bid_options_update_local_var->frequency_multipliers = frequency_multipliers;
    campaign_bid_options_update_local_var->gender_multipliers = gender_multipliers;
    campaign_bid_options_update_local_var->placement_multipliers = placement_multipliers;
    campaign_bid_options_update_local_var->update_mask = update_mask;
    return campaign_bid_options_update_local_var;
}

__attribute__((deprecated)) campaign_bid_options_update_t *campaign_bid_options_update_create(
    age_bucket_multipliers_t *age_bucket_multipliers,
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window,
    frequency_multipliers_t *frequency_multipliers,
    gender_multipliers_t *gender_multipliers,
    placement_multipliers_t *placement_multipliers,
    list_t *update_mask
    ) {
    campaign_bid_options_update_t *result = campaign_bid_options_update_create_internal (
        age_bucket_multipliers,
        app_type_multipliers,
        audience_multipliers,
        freq_bid_multiplier_time_window,
        frequency_multipliers,
        gender_multipliers,
        placement_multipliers,
        update_mask
        );
    if (!result) {
    }
    return result;
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
    if (campaign_bid_options_update->age_bucket_multipliers) {
        age_bucket_multipliers_free(campaign_bid_options_update->age_bucket_multipliers);
        campaign_bid_options_update->age_bucket_multipliers = NULL;
    }
    if (campaign_bid_options_update->app_type_multipliers) {
        app_type_multipliers_free(campaign_bid_options_update->app_type_multipliers);
        campaign_bid_options_update->app_type_multipliers = NULL;
    }
    if (campaign_bid_options_update->audience_multipliers) {
        campaign_audience_multipliers_free(campaign_bid_options_update->audience_multipliers);
        campaign_bid_options_update->audience_multipliers = NULL;
    }
    if (campaign_bid_options_update->freq_bid_multiplier_time_window) {
        freq_bid_multiplier_time_window_free(campaign_bid_options_update->freq_bid_multiplier_time_window);
        campaign_bid_options_update->freq_bid_multiplier_time_window = NULL;
    }
    if (campaign_bid_options_update->frequency_multipliers) {
        frequency_multipliers_free(campaign_bid_options_update->frequency_multipliers);
        campaign_bid_options_update->frequency_multipliers = NULL;
    }
    if (campaign_bid_options_update->gender_multipliers) {
        gender_multipliers_free(campaign_bid_options_update->gender_multipliers);
        campaign_bid_options_update->gender_multipliers = NULL;
    }
    if (campaign_bid_options_update->placement_multipliers) {
        placement_multipliers_free(campaign_bid_options_update->placement_multipliers);
        campaign_bid_options_update->placement_multipliers = NULL;
    }
    if (campaign_bid_options_update->update_mask) {
        list_ForEach(listEntry, campaign_bid_options_update->update_mask) {
            campaign_bid_options_update_mask_items_free(listEntry->data);
        }
        list_freeList(campaign_bid_options_update->update_mask);
        campaign_bid_options_update->update_mask = NULL;
    }
    free(campaign_bid_options_update);
}

cJSON *campaign_bid_options_update_convertToJSON(campaign_bid_options_update_t *campaign_bid_options_update) {
    cJSON *item = cJSON_CreateObject();

    // campaign_bid_options_update->age_bucket_multipliers
    if(campaign_bid_options_update->age_bucket_multipliers) {
    cJSON *age_bucket_multipliers_local_JSON = age_bucket_multipliers_convertToJSON(campaign_bid_options_update->age_bucket_multipliers);
    if(age_bucket_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "age_bucket_multipliers", age_bucket_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


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


    // campaign_bid_options_update->freq_bid_multiplier_time_window
    if(campaign_bid_options_update->freq_bid_multiplier_time_window) {
    cJSON *freq_bid_multiplier_time_window_local_JSON = freq_bid_multiplier_time_window_convertToJSON(campaign_bid_options_update->freq_bid_multiplier_time_window);
    if(freq_bid_multiplier_time_window_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "freq_bid_multiplier_time_window", freq_bid_multiplier_time_window_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options_update->frequency_multipliers
    if(campaign_bid_options_update->frequency_multipliers) {
    cJSON *frequency_multipliers_local_JSON = frequency_multipliers_convertToJSON(campaign_bid_options_update->frequency_multipliers);
    if(frequency_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "frequency_multipliers", frequency_multipliers_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // campaign_bid_options_update->gender_multipliers
    if(campaign_bid_options_update->gender_multipliers) {
    cJSON *gender_multipliers_local_JSON = gender_multipliers_convertToJSON(campaign_bid_options_update->gender_multipliers);
    if(gender_multipliers_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "gender_multipliers", gender_multipliers_local_JSON);
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
    if (pinterest_rest_api_list_UPDATEMASK_NULL == campaign_bid_options_update->update_mask) {
        goto fail;
    }
    cJSON *update_mask = cJSON_AddArrayToObject(item, "update_mask");
    if(update_mask == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *update_maskListEntry;
    if (campaign_bid_options_update->update_mask) {
    list_ForEach(update_maskListEntry, campaign_bid_options_update->update_mask) {
    cJSON *itemLocal = campaign_bid_options_update_mask_items_convertToJSON((pinterest_rest_api_campaign_bid_options_update__e)update_maskListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(update_mask, itemLocal);
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

    // define the local variable for campaign_bid_options_update->age_bucket_multipliers
    age_bucket_multipliers_t *age_bucket_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->app_type_multipliers
    app_type_multipliers_t *app_type_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->audience_multipliers
    campaign_audience_multipliers_t *audience_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->freq_bid_multiplier_time_window
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->frequency_multipliers
    frequency_multipliers_t *frequency_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->gender_multipliers
    gender_multipliers_t *gender_multipliers_local_nonprim = NULL;

    // define the local variable for campaign_bid_options_update->placement_multipliers
    placement_multipliers_t *placement_multipliers_local_nonprim = NULL;

    // define the local list for campaign_bid_options_update->update_mask
    list_t *update_maskList = NULL;

    // campaign_bid_options_update->age_bucket_multipliers
    cJSON *age_bucket_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "age_bucket_multipliers");
    if (cJSON_IsNull(age_bucket_multipliers)) {
        age_bucket_multipliers = NULL;
    }
    if (age_bucket_multipliers) { 
    age_bucket_multipliers_local_nonprim = age_bucket_multipliers_parseFromJSON(age_bucket_multipliers); //custom
    }

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

    // campaign_bid_options_update->freq_bid_multiplier_time_window
    cJSON *freq_bid_multiplier_time_window = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "freq_bid_multiplier_time_window");
    if (cJSON_IsNull(freq_bid_multiplier_time_window)) {
        freq_bid_multiplier_time_window = NULL;
    }
    if (freq_bid_multiplier_time_window) { 
    freq_bid_multiplier_time_window_local_nonprim = freq_bid_multiplier_time_window_parseFromJSON(freq_bid_multiplier_time_window); //custom
    }

    // campaign_bid_options_update->frequency_multipliers
    cJSON *frequency_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "frequency_multipliers");
    if (cJSON_IsNull(frequency_multipliers)) {
        frequency_multipliers = NULL;
    }
    if (frequency_multipliers) { 
    frequency_multipliers_local_nonprim = frequency_multipliers_parseFromJSON(frequency_multipliers); //custom
    }

    // campaign_bid_options_update->gender_multipliers
    cJSON *gender_multipliers = cJSON_GetObjectItemCaseSensitive(campaign_bid_options_updateJSON, "gender_multipliers");
    if (cJSON_IsNull(gender_multipliers)) {
        gender_multipliers = NULL;
    }
    if (gender_multipliers) { 
    gender_multipliers_local_nonprim = gender_multipliers_parseFromJSON(gender_multipliers); //custom
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

    
    cJSON *update_mask_local_nonprimitive = NULL;
    if(!cJSON_IsArray(update_mask)){
        goto end; //nonprimitive container
    }

    update_maskList = list_createList();

    cJSON_ArrayForEach(update_mask_local_nonprimitive,update_mask )
    {
        if(!cJSON_IsObject(update_mask_local_nonprimitive)){
            goto end;
        }
        campaign_bid_options_update_campaign_bid_options_update_mask_items_e update_maskItem = campaign_bid_options_update_mask_items_parseFromJSON(update_mask_local_nonprimitive);

        list_addElement(update_maskList, (void *)update_maskItem);
    }



    campaign_bid_options_update_local_var = campaign_bid_options_update_create_internal (
        age_bucket_multipliers ? age_bucket_multipliers_local_nonprim : NULL,
        app_type_multipliers ? app_type_multipliers_local_nonprim : NULL,
        audience_multipliers ? audience_multipliers_local_nonprim : NULL,
        freq_bid_multiplier_time_window ? freq_bid_multiplier_time_window_local_nonprim : NULL,
        frequency_multipliers ? frequency_multipliers_local_nonprim : NULL,
        gender_multipliers ? gender_multipliers_local_nonprim : NULL,
        placement_multipliers ? placement_multipliers_local_nonprim : NULL,
        update_maskList
        );

    if (!campaign_bid_options_update_local_var) {
        goto end;
    }

    return campaign_bid_options_update_local_var;
end:
    if (age_bucket_multipliers_local_nonprim) {
        age_bucket_multipliers_free(age_bucket_multipliers_local_nonprim);
        age_bucket_multipliers_local_nonprim = NULL;
    }
    if (app_type_multipliers_local_nonprim) {
        app_type_multipliers_free(app_type_multipliers_local_nonprim);
        app_type_multipliers_local_nonprim = NULL;
    }
    if (audience_multipliers_local_nonprim) {
        campaign_audience_multipliers_free(audience_multipliers_local_nonprim);
        audience_multipliers_local_nonprim = NULL;
    }
    if (freq_bid_multiplier_time_window_local_nonprim) {
        freq_bid_multiplier_time_window_free(freq_bid_multiplier_time_window_local_nonprim);
        freq_bid_multiplier_time_window_local_nonprim = NULL;
    }
    if (frequency_multipliers_local_nonprim) {
        frequency_multipliers_free(frequency_multipliers_local_nonprim);
        frequency_multipliers_local_nonprim = NULL;
    }
    if (gender_multipliers_local_nonprim) {
        gender_multipliers_free(gender_multipliers_local_nonprim);
        gender_multipliers_local_nonprim = NULL;
    }
    if (placement_multipliers_local_nonprim) {
        placement_multipliers_free(placement_multipliers_local_nonprim);
        placement_multipliers_local_nonprim = NULL;
    }
    if (update_maskList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, update_maskList) {
            campaign_bid_options_update_mask_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(update_maskList);
        update_maskList = NULL;
    }
    return NULL;

}
