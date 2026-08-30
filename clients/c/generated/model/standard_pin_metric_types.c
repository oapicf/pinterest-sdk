#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "standard_pin_metric_types.h"


char* standard_pin_metric_types_standard_pin_metric_types_ToString(pinterest_rest_api_standard_pin_metric_types__e standard_pin_metric_types) {
    char *standard_pin_metric_typesArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "TOTAL_COMMENTS", "TOTAL_REACTIONS", "USER_FOLLOW", "PROFILE_VISIT" };
    return standard_pin_metric_typesArray[standard_pin_metric_types];
}

pinterest_rest_api_standard_pin_metric_types__e standard_pin_metric_types_standard_pin_metric_types_FromString(char* standard_pin_metric_types) {
    int stringToReturn = 0;
    char *standard_pin_metric_typesArray[] =  { "NULL", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", "SAVE_RATE", "TOTAL_COMMENTS", "TOTAL_REACTIONS", "USER_FOLLOW", "PROFILE_VISIT" };
    size_t sizeofArray = sizeof(standard_pin_metric_typesArray) / sizeof(standard_pin_metric_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(standard_pin_metric_types, standard_pin_metric_typesArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *standard_pin_metric_types_convertToJSON(pinterest_rest_api_standard_pin_metric_types__e standard_pin_metric_types) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "standard_pin_metric_types", standard_pin_metric_types_standard_pin_metric_types_ToString(standard_pin_metric_types)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_standard_pin_metric_types__e standard_pin_metric_types_parseFromJSON(cJSON *standard_pin_metric_typesJSON) {
    if(!cJSON_IsString(standard_pin_metric_typesJSON) || (standard_pin_metric_typesJSON->valuestring == NULL)) {
        return 0;
    }
    return standard_pin_metric_types_standard_pin_metric_types_FromString(standard_pin_metric_typesJSON->valuestring);
}
