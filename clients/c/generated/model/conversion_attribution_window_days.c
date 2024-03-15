#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_attribution_window_days.h"


char* conversion_attribution_window_days_conversion_attribution_window_days_ToString(pinterest_rest_api_conversion_attribution_window_days__e conversion_attribution_window_days) {
    char *conversion_attribution_window_daysArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    return conversion_attribution_window_daysArray[conversion_attribution_window_days];
}

pinterest_rest_api_conversion_attribution_window_days__e conversion_attribution_window_days_conversion_attribution_window_days_FromString(char* conversion_attribution_window_days) {
    int stringToReturn = 0;
    char *conversion_attribution_window_daysArray[] =  { "NULL", "0", "1", "7", "14", "30", "60" };
    size_t sizeofArray = sizeof(conversion_attribution_window_daysArray) / sizeof(conversion_attribution_window_daysArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_attribution_window_days, conversion_attribution_window_daysArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_attribution_window_days_conversion_attribution_window_days_convertToJSON(pinterest_rest_api_conversion_attribution_window_days__e conversion_attribution_window_days) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddNumberToObject(item, "conversion_attribution_window_days", conversion_attribution_window_days) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_attribution_window_days__e conversion_attribution_window_days_conversion_attribution_window_days_parseFromJSON(cJSON *conversion_attribution_window_daysJSON) {
    pinterest_rest_api_conversion_attribution_window_days__e *conversion_attribution_window_days = NULL;
    cJSON *conversion_attribution_window_daysVar = cJSON_GetObjectItemCaseSensitive(conversion_attribution_window_daysJSON, "conversion_attribution_window_days");
    if(!cJSON_IsNumber(conversion_attribution_window_daysVar))
    {
        goto end;
    }
    return conversion_attribution_window_daysVariable;
end:
    return 0;
}
