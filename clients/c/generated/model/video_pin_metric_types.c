#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "video_pin_metric_types.h"


char* video_pin_metric_types_video_pin_metric_types_ToString(pinterest_rest_api_video_pin_metric_types__e video_pin_metric_types) {
    char *video_pin_metric_typesArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "VIDEO_MRC_VIEW", "VIDEO_10S_VIEW", "QUARTILE_95_PERCENT_VIEW", "VIDEO_V50_WATCH_TIME", "VIDEO_START", "VIDEO_AVG_WATCH_TIME", "TOTAL_COMMENTS", "TOTAL_REACTIONS" };
    return video_pin_metric_typesArray[video_pin_metric_types];
}

pinterest_rest_api_video_pin_metric_types__e video_pin_metric_types_video_pin_metric_types_FromString(char* video_pin_metric_types) {
    int stringToReturn = 0;
    char *video_pin_metric_typesArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "VIDEO_MRC_VIEW", "VIDEO_10S_VIEW", "QUARTILE_95_PERCENT_VIEW", "VIDEO_V50_WATCH_TIME", "VIDEO_START", "VIDEO_AVG_WATCH_TIME", "TOTAL_COMMENTS", "TOTAL_REACTIONS" };
    size_t sizeofArray = sizeof(video_pin_metric_typesArray) / sizeof(video_pin_metric_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(video_pin_metric_types, video_pin_metric_typesArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *video_pin_metric_types_convertToJSON(pinterest_rest_api_video_pin_metric_types__e video_pin_metric_types) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "video_pin_metric_types", video_pin_metric_types_video_pin_metric_types_ToString(video_pin_metric_types)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_video_pin_metric_types__e video_pin_metric_types_parseFromJSON(cJSON *video_pin_metric_typesJSON) {
    if(!cJSON_IsString(video_pin_metric_typesJSON) || (video_pin_metric_typesJSON->valuestring == NULL)) {
        return 0;
    }
    return video_pin_metric_types_video_pin_metric_types_FromString(video_pin_metric_typesJSON->valuestring);
}
