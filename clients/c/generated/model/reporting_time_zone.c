#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "reporting_time_zone.h"


char* reporting_time_zone_reporting_time_zone_ToString(pinterest_rest_api_reporting_time_zone__e reporting_time_zone) {
    char *reporting_time_zoneArray[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    return reporting_time_zoneArray[reporting_time_zone];
}

pinterest_rest_api_reporting_time_zone__e reporting_time_zone_reporting_time_zone_FromString(char* reporting_time_zone) {
    int stringToReturn = 0;
    char *reporting_time_zoneArray[] =  { "NULL", "PINTEREST_TIME_ZONE", "AD_ACCOUNT_TIME_ZONE" };
    size_t sizeofArray = sizeof(reporting_time_zoneArray) / sizeof(reporting_time_zoneArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reporting_time_zone, reporting_time_zoneArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *reporting_time_zone_convertToJSON(pinterest_rest_api_reporting_time_zone__e reporting_time_zone) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "reporting_time_zone", reporting_time_zone_reporting_time_zone_ToString(reporting_time_zone)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_reporting_time_zone__e reporting_time_zone_parseFromJSON(cJSON *reporting_time_zoneJSON) {
    if(!cJSON_IsString(reporting_time_zoneJSON) || (reporting_time_zoneJSON->valuestring == NULL)) {
        return 0;
    }
    return reporting_time_zone_reporting_time_zone_FromString(reporting_time_zoneJSON->valuestring);
}
