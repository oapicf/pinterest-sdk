#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "multi_pins_analytics_metric_types_item.h"


char* multi_pins_analytics_metric_types_item_multi_pins_analytics_metric_types_item_ToString(pinterest_rest_api_multi_pins_analytics_metric_types_item__e multi_pins_analytics_metric_types_item) {
    char *multi_pins_analytics_metric_types_itemArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "TOTAL_COMMENTS", "TOTAL_REACTIONS", "USER_FOLLOW", "PROFILE_VISIT", "VIDEO_MRC_VIEW", "VIDEO_10S_VIEW", "QUARTILE_95_PERCENT_VIEW", "VIDEO_V50_WATCH_TIME", "VIDEO_START", "VIDEO_AVG_WATCH_TIME" };
    return multi_pins_analytics_metric_types_itemArray[multi_pins_analytics_metric_types_item];
}

pinterest_rest_api_multi_pins_analytics_metric_types_item__e multi_pins_analytics_metric_types_item_multi_pins_analytics_metric_types_item_FromString(char* multi_pins_analytics_metric_types_item) {
    int stringToReturn = 0;
    char *multi_pins_analytics_metric_types_itemArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "TOTAL_COMMENTS", "TOTAL_REACTIONS", "USER_FOLLOW", "PROFILE_VISIT", "VIDEO_MRC_VIEW", "VIDEO_10S_VIEW", "QUARTILE_95_PERCENT_VIEW", "VIDEO_V50_WATCH_TIME", "VIDEO_START", "VIDEO_AVG_WATCH_TIME" };
    size_t sizeofArray = sizeof(multi_pins_analytics_metric_types_itemArray) / sizeof(multi_pins_analytics_metric_types_itemArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(multi_pins_analytics_metric_types_item, multi_pins_analytics_metric_types_itemArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *multi_pins_analytics_metric_types_item_convertToJSON(pinterest_rest_api_multi_pins_analytics_metric_types_item__e multi_pins_analytics_metric_types_item) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "multi_pins_analytics_metric_types_item", multi_pins_analytics_metric_types_item_multi_pins_analytics_metric_types_item_ToString(multi_pins_analytics_metric_types_item)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_multi_pins_analytics_metric_types_item__e multi_pins_analytics_metric_types_item_parseFromJSON(cJSON *multi_pins_analytics_metric_types_itemJSON) {
    if(!cJSON_IsString(multi_pins_analytics_metric_types_itemJSON) || (multi_pins_analytics_metric_types_itemJSON->valuestring == NULL)) {
        return 0;
    }
    return multi_pins_analytics_metric_types_item_multi_pins_analytics_metric_types_item_FromString(multi_pins_analytics_metric_types_itemJSON->valuestring);
}
