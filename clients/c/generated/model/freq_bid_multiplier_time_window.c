#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "freq_bid_multiplier_time_window.h"


char* freq_bid_multiplier_time_window_freq_bid_multiplier_time_window_ToString(pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window) {
    char *freq_bid_multiplier_time_windowArray[] =  { "NULL", "WEEK", "MONTH", "" };
    return freq_bid_multiplier_time_windowArray[freq_bid_multiplier_time_window];
}

pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window_freq_bid_multiplier_time_window_FromString(char* freq_bid_multiplier_time_window) {
    int stringToReturn = 0;
    char *freq_bid_multiplier_time_windowArray[] =  { "NULL", "WEEK", "MONTH", "" };
    size_t sizeofArray = sizeof(freq_bid_multiplier_time_windowArray) / sizeof(freq_bid_multiplier_time_windowArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(freq_bid_multiplier_time_window, freq_bid_multiplier_time_windowArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *freq_bid_multiplier_time_window_convertToJSON(pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "freq_bid_multiplier_time_window", freq_bid_multiplier_time_window_freq_bid_multiplier_time_window_ToString(freq_bid_multiplier_time_window)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_freq_bid_multiplier_time_window__e freq_bid_multiplier_time_window_parseFromJSON(cJSON *freq_bid_multiplier_time_windowJSON) {
    if(!cJSON_IsString(freq_bid_multiplier_time_windowJSON) || (freq_bid_multiplier_time_windowJSON->valuestring == NULL)) {
        return 0;
    }
    return freq_bid_multiplier_time_window_freq_bid_multiplier_time_window_FromString(freq_bid_multiplier_time_windowJSON->valuestring);
}
