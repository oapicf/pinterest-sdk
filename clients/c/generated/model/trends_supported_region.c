#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_supported_region.h"


char* trends_supported_region_trends_supported_region_ToString(pinterest_rest_api_trends_supported_region__e trends_supported_region) {
    char *trends_supported_regionArray[] =  { "NULL", "US", "CA", "DE", "FR", "ES", "IT", "DE+AT+CH", "GB+IE", "IT+ES+PT+GR+MT", "PL+RO+HU+SK+CZ", "SE+DK+FI+NO", "NL+BE+LU", "AR", "BR", "CO", "MX", "MX+AR+CO+CL", "AU+NZ" };
    return trends_supported_regionArray[trends_supported_region];
}

pinterest_rest_api_trends_supported_region__e trends_supported_region_trends_supported_region_FromString(char* trends_supported_region) {
    int stringToReturn = 0;
    char *trends_supported_regionArray[] =  { "NULL", "US", "CA", "DE", "FR", "ES", "IT", "DE+AT+CH", "GB+IE", "IT+ES+PT+GR+MT", "PL+RO+HU+SK+CZ", "SE+DK+FI+NO", "NL+BE+LU", "AR", "BR", "CO", "MX", "MX+AR+CO+CL", "AU+NZ" };
    size_t sizeofArray = sizeof(trends_supported_regionArray) / sizeof(trends_supported_regionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(trends_supported_region, trends_supported_regionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *trends_supported_region_convertToJSON(pinterest_rest_api_trends_supported_region__e trends_supported_region) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "trends_supported_region", trends_supported_region_trends_supported_region_ToString(trends_supported_region)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_trends_supported_region__e trends_supported_region_parseFromJSON(cJSON *trends_supported_regionJSON) {
    if(!cJSON_IsString(trends_supported_regionJSON) || (trends_supported_regionJSON->valuestring == NULL)) {
        return 0;
    }
    return trends_supported_region_trends_supported_region_FromString(trends_supported_regionJSON->valuestring);
}
