#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_product_report_level.h"


char* conversion_product_report_level_conversion_product_report_level_ToString(pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level) {
    char *conversion_product_report_levelArray[] =  { "NULL", "ADVERTISER", "CAMPAIGN", "AD_GROUP" };
    return conversion_product_report_levelArray[conversion_product_report_level];
}

pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level_conversion_product_report_level_FromString(char* conversion_product_report_level) {
    int stringToReturn = 0;
    char *conversion_product_report_levelArray[] =  { "NULL", "ADVERTISER", "CAMPAIGN", "AD_GROUP" };
    size_t sizeofArray = sizeof(conversion_product_report_levelArray) / sizeof(conversion_product_report_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_product_report_level, conversion_product_report_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_product_report_level_convertToJSON(pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_product_report_level", conversion_product_report_level_conversion_product_report_level_ToString(conversion_product_report_level)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_product_report_level__e conversion_product_report_level_parseFromJSON(cJSON *conversion_product_report_levelJSON) {
    if(!cJSON_IsString(conversion_product_report_levelJSON) || (conversion_product_report_levelJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_product_report_level_conversion_product_report_level_FromString(conversion_product_report_levelJSON->valuestring);
}
