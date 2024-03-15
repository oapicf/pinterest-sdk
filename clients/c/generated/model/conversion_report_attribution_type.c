#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_report_attribution_type.h"


char* conversion_report_attribution_type_conversion_report_attribution_type_ToString(pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type) {
    char *conversion_report_attribution_typeArray[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    return conversion_report_attribution_typeArray[conversion_report_attribution_type];
}

pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type_conversion_report_attribution_type_FromString(char* conversion_report_attribution_type) {
    int stringToReturn = 0;
    char *conversion_report_attribution_typeArray[] =  { "NULL", "INDIVIDUAL", "HOUSEHOLD" };
    size_t sizeofArray = sizeof(conversion_report_attribution_typeArray) / sizeof(conversion_report_attribution_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(conversion_report_attribution_type, conversion_report_attribution_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *conversion_report_attribution_type_conversion_report_attribution_type_convertToJSON(pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "conversion_report_attribution_type", conversion_report_attribution_type_conversion_report_attribution_type_ToString(conversion_report_attribution_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type_conversion_report_attribution_type_parseFromJSON(cJSON *conversion_report_attribution_typeJSON) {
    pinterest_rest_api_conversion_report_attribution_type__e *conversion_report_attribution_type = NULL;
    pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_typeVariable;
    cJSON *conversion_report_attribution_typeVar = cJSON_GetObjectItemCaseSensitive(conversion_report_attribution_typeJSON, "conversion_report_attribution_type");
    if(!cJSON_IsString(conversion_report_attribution_typeVar) || (conversion_report_attribution_typeVar->valuestring == NULL)){
        goto end;
    }
    conversion_report_attribution_typeVariable = conversion_report_attribution_type_conversion_report_attribution_type_FromString(conversion_report_attribution_typeVar->valuestring);
    return conversion_report_attribution_typeVariable;
end:
    return 0;
}
