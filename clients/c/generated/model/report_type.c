#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "report_type.h"


char* report_type_report_type_ToString(pinterest_rest_api_report_type__e report_type) {
    char *report_typeArray[] =  { "NULL", "SYNC", "ASYNC" };
    return report_typeArray[report_type];
}

pinterest_rest_api_report_type__e report_type_report_type_FromString(char* report_type) {
    int stringToReturn = 0;
    char *report_typeArray[] =  { "NULL", "SYNC", "ASYNC" };
    size_t sizeofArray = sizeof(report_typeArray) / sizeof(report_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_type, report_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *report_type_convertToJSON(pinterest_rest_api_report_type__e report_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "report_type", report_type_report_type_ToString(report_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_report_type__e report_type_parseFromJSON(cJSON *report_typeJSON) {
    if(!cJSON_IsString(report_typeJSON) || (report_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return report_type_report_type_FromString(report_typeJSON->valuestring);
}
