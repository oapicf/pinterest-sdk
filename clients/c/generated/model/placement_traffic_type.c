#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "placement_traffic_type.h"


char* placement_traffic_type_placement_traffic_type_ToString(pinterest_rest_api_placement_traffic_type__e placement_traffic_type) {
    char *placement_traffic_typeArray[] =  { "NULL", "ALL", "TWO_COLUMN_FEED", "FULLSCREEN_FEED", "" };
    return placement_traffic_typeArray[placement_traffic_type];
}

pinterest_rest_api_placement_traffic_type__e placement_traffic_type_placement_traffic_type_FromString(char* placement_traffic_type) {
    int stringToReturn = 0;
    char *placement_traffic_typeArray[] =  { "NULL", "ALL", "TWO_COLUMN_FEED", "FULLSCREEN_FEED", "" };
    size_t sizeofArray = sizeof(placement_traffic_typeArray) / sizeof(placement_traffic_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_traffic_type, placement_traffic_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *placement_traffic_type_convertToJSON(pinterest_rest_api_placement_traffic_type__e placement_traffic_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "placement_traffic_type", placement_traffic_type_placement_traffic_type_ToString(placement_traffic_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_placement_traffic_type__e placement_traffic_type_parseFromJSON(cJSON *placement_traffic_typeJSON) {
    if(!cJSON_IsString(placement_traffic_typeJSON) || (placement_traffic_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return placement_traffic_type_placement_traffic_type_FromString(placement_traffic_typeJSON->valuestring);
}
