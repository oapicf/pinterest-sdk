#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trend_type.h"


char* trend_type_trend_type_ToString(pinterest_rest_api_trend_type__e trend_type) {
    char *trend_typeArray[] =  { "NULL", "growing", "monthly", "yearly", "seasonal" };
    return trend_typeArray[trend_type];
}

pinterest_rest_api_trend_type__e trend_type_trend_type_FromString(char* trend_type) {
    int stringToReturn = 0;
    char *trend_typeArray[] =  { "NULL", "growing", "monthly", "yearly", "seasonal" };
    size_t sizeofArray = sizeof(trend_typeArray) / sizeof(trend_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(trend_type, trend_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *trend_type_trend_type_convertToJSON(pinterest_rest_api_trend_type__e trend_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "trend_type", trend_type_trend_type_ToString(trend_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_trend_type__e trend_type_trend_type_parseFromJSON(cJSON *trend_typeJSON) {
    pinterest_rest_api_trend_type__e *trend_type = NULL;
    pinterest_rest_api_trend_type__e trend_typeVariable;
    cJSON *trend_typeVar = cJSON_GetObjectItemCaseSensitive(trend_typeJSON, "trend_type");
    if(!cJSON_IsString(trend_typeVar) || (trend_typeVar->valuestring == NULL)){
        goto end;
    }
    trend_typeVariable = trend_type_trend_type_FromString(trend_typeVar->valuestring);
    return trend_typeVariable;
end:
    return 0;
}
