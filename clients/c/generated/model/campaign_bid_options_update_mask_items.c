#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "campaign_bid_options_update_mask_items.h"


char* campaign_bid_options_update_mask_items_campaign_bid_options_update_mask_items_ToString(pinterest_rest_api_campaign_bid_options_update_mask_items__e campaign_bid_options_update_mask_items) {
    char *campaign_bid_options_update_mask_itemsArray[] =  { "NULL", "AUDIENCE", "APP_TYPE", "PLACEMENT", "GENDER", "AGE_BUCKET", "FREQUENCY" };
    return campaign_bid_options_update_mask_itemsArray[campaign_bid_options_update_mask_items];
}

pinterest_rest_api_campaign_bid_options_update_mask_items__e campaign_bid_options_update_mask_items_campaign_bid_options_update_mask_items_FromString(char* campaign_bid_options_update_mask_items) {
    int stringToReturn = 0;
    char *campaign_bid_options_update_mask_itemsArray[] =  { "NULL", "AUDIENCE", "APP_TYPE", "PLACEMENT", "GENDER", "AGE_BUCKET", "FREQUENCY" };
    size_t sizeofArray = sizeof(campaign_bid_options_update_mask_itemsArray) / sizeof(campaign_bid_options_update_mask_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(campaign_bid_options_update_mask_items, campaign_bid_options_update_mask_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *campaign_bid_options_update_mask_items_convertToJSON(pinterest_rest_api_campaign_bid_options_update_mask_items__e campaign_bid_options_update_mask_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "campaign_bid_options_update_mask_items", campaign_bid_options_update_mask_items_campaign_bid_options_update_mask_items_ToString(campaign_bid_options_update_mask_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_campaign_bid_options_update_mask_items__e campaign_bid_options_update_mask_items_parseFromJSON(cJSON *campaign_bid_options_update_mask_itemsJSON) {
    if(!cJSON_IsString(campaign_bid_options_update_mask_itemsJSON) || (campaign_bid_options_update_mask_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return campaign_bid_options_update_mask_items_campaign_bid_options_update_mask_items_FromString(campaign_bid_options_update_mask_itemsJSON->valuestring);
}
