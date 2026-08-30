#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "frequency_goal_metadata_timerange.h"


char* frequency_goal_metadata_timerange_frequency_goal_metadata_timerange_ToString(pinterest_rest_api_frequency_goal_metadata_timerange__e frequency_goal_metadata_timerange) {
    char *frequency_goal_metadata_timerangeArray[] =  { "NULL", "THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR" };
    return frequency_goal_metadata_timerangeArray[frequency_goal_metadata_timerange];
}

pinterest_rest_api_frequency_goal_metadata_timerange__e frequency_goal_metadata_timerange_frequency_goal_metadata_timerange_FromString(char* frequency_goal_metadata_timerange) {
    int stringToReturn = 0;
    char *frequency_goal_metadata_timerangeArray[] =  { "NULL", "THIRTY_DAY", "DAY", "SEVEN_DAY", "TWENTY_MINUTE", "TEN_MINUTE", "TWENTY_FOUR_HOUR" };
    size_t sizeofArray = sizeof(frequency_goal_metadata_timerangeArray) / sizeof(frequency_goal_metadata_timerangeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(frequency_goal_metadata_timerange, frequency_goal_metadata_timerangeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *frequency_goal_metadata_timerange_convertToJSON(pinterest_rest_api_frequency_goal_metadata_timerange__e frequency_goal_metadata_timerange) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "frequency_goal_metadata_timerange", frequency_goal_metadata_timerange_frequency_goal_metadata_timerange_ToString(frequency_goal_metadata_timerange)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_frequency_goal_metadata_timerange__e frequency_goal_metadata_timerange_parseFromJSON(cJSON *frequency_goal_metadata_timerangeJSON) {
    if(!cJSON_IsString(frequency_goal_metadata_timerangeJSON) || (frequency_goal_metadata_timerangeJSON->valuestring == NULL)) {
        return 0;
    }
    return frequency_goal_metadata_timerange_frequency_goal_metadata_timerange_FromString(frequency_goal_metadata_timerangeJSON->valuestring);
}
