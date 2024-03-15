#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_report_time_type.h"


char* conversion_report_time_type_conversion_report_time_type_ToString(pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type) {
    char *conversion_report_time_typeArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    return conversion_report_time_typeArray[conversion_report_time_type];
}

pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type_conversion_report_time_type_FromString(char* conversion_report_time_type) {
    int stringToReturn = 0;
    char *conversion_report_time_typeArray[] =  { "NULL", "TIME_OF_AD_ACTION", "TIME_OF_CONVERSION" };
    size_t sizeofArray = sizeof(conversion_report_time_typeArray) / sizeof(conversion_report_time_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_report_time_type, conversion_report_time_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_report_time_type_conversion_report_time_type_convertToJSON(pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_time_type", conversion_report_time_type_conversion_report_time_type_ToString(conversion_report_time_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type_conversion_report_time_type_parseFromJSON(cJSON *conversion_report_time_typeJSON) {
    pinterest_rest_api_conversion_report_time_type__e *conversion_report_time_type = NULL;
    pinterest_rest_api_conversion_report_time_type__e conversion_report_time_typeVariable;
    cJSON *conversion_report_time_typeVar = cJSON_GetObjectItemCaseSensitive(conversion_report_time_typeJSON, "conversion_report_time_type");
    if(!cJSON_IsString(conversion_report_time_typeVar) || (conversion_report_time_typeVar->valuestring == NULL)){
        goto end;
    }
    conversion_report_time_typeVariable = conversion_report_time_type_conversion_report_time_type_FromString(conversion_report_time_typeVar->valuestring);
    return conversion_report_time_typeVariable;
end:
    return 0;
}
