#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_product_report_granularity.h"


char* conversion_product_report_granularity_conversion_product_report_granularity_ToString(pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity) {
    char *conversion_product_report_granularityArray[] =  { "NULL", "TOTAL", "WEEK", "MONTH" };
    return conversion_product_report_granularityArray[conversion_product_report_granularity];
}

pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity_conversion_product_report_granularity_FromString(char* conversion_product_report_granularity) {
    int stringToReturn = 0;
    char *conversion_product_report_granularityArray[] =  { "NULL", "TOTAL", "WEEK", "MONTH" };
    size_t sizeofArray = sizeof(conversion_product_report_granularityArray) / sizeof(conversion_product_report_granularityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_product_report_granularity, conversion_product_report_granularityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_product_report_granularity_convertToJSON(pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_product_report_granularity", conversion_product_report_granularity_conversion_product_report_granularity_ToString(conversion_product_report_granularity)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_product_report_granularity__e conversion_product_report_granularity_parseFromJSON(cJSON *conversion_product_report_granularityJSON) {
    if(!cJSON_IsString(conversion_product_report_granularityJSON) || (conversion_product_report_granularityJSON->valuestring == NULL)) {
        return 0;
    }
    return conversion_product_report_granularity_conversion_product_report_granularity_FromString(conversion_product_report_granularityJSON->valuestring);
}
