#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metrics_reporting_template_type.h"


char* metrics_reporting_template_type_metrics_reporting_template_type_ToString(pinterest_rest_api_metrics_reporting_template_type__e metrics_reporting_template_type) {
    char *metrics_reporting_template_typeArray[] =  { "NULL", "UNSPECIFIED", "BULK", "OVERVIEW", "TABLE", "MMM", "BRAND_CATEGORY" };
    return metrics_reporting_template_typeArray[metrics_reporting_template_type];
}

pinterest_rest_api_metrics_reporting_template_type__e metrics_reporting_template_type_metrics_reporting_template_type_FromString(char* metrics_reporting_template_type) {
    int stringToReturn = 0;
    char *metrics_reporting_template_typeArray[] =  { "NULL", "UNSPECIFIED", "BULK", "OVERVIEW", "TABLE", "MMM", "BRAND_CATEGORY" };
    size_t sizeofArray = sizeof(metrics_reporting_template_typeArray) / sizeof(metrics_reporting_template_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(metrics_reporting_template_type, metrics_reporting_template_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *metrics_reporting_template_type_convertToJSON(pinterest_rest_api_metrics_reporting_template_type__e metrics_reporting_template_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "metrics_reporting_template_type", metrics_reporting_template_type_metrics_reporting_template_type_ToString(metrics_reporting_template_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_metrics_reporting_template_type__e metrics_reporting_template_type_parseFromJSON(cJSON *metrics_reporting_template_typeJSON) {
    if(!cJSON_IsString(metrics_reporting_template_typeJSON) || (metrics_reporting_template_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return metrics_reporting_template_type_metrics_reporting_template_type_FromString(metrics_reporting_template_typeJSON->valuestring);
}
