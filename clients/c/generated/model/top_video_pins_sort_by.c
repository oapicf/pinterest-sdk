#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "top_video_pins_sort_by.h"


char* top_video_pins_sort_by_top_video_pins_sort_by_ToString(pinterest_rest_api_top_video_pins_sort_by__e top_video_pins_sort_by) {
    char *top_video_pins_sort_byArray[] =  { "NULL", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START" };
    return top_video_pins_sort_byArray[top_video_pins_sort_by];
}

pinterest_rest_api_top_video_pins_sort_by__e top_video_pins_sort_by_top_video_pins_sort_by_FromString(char* top_video_pins_sort_by) {
    int stringToReturn = 0;
    char *top_video_pins_sort_byArray[] =  { "NULL", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START" };
    size_t sizeofArray = sizeof(top_video_pins_sort_byArray) / sizeof(top_video_pins_sort_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(top_video_pins_sort_by, top_video_pins_sort_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *top_video_pins_sort_by_convertToJSON(pinterest_rest_api_top_video_pins_sort_by__e top_video_pins_sort_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "top_video_pins_sort_by", top_video_pins_sort_by_top_video_pins_sort_by_ToString(top_video_pins_sort_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_top_video_pins_sort_by__e top_video_pins_sort_by_parseFromJSON(cJSON *top_video_pins_sort_byJSON) {
    if(!cJSON_IsString(top_video_pins_sort_byJSON) || (top_video_pins_sort_byJSON->valuestring == NULL)) {
        return 0;
    }
    return top_video_pins_sort_by_top_video_pins_sort_by_FromString(top_video_pins_sort_byJSON->valuestring);
}
