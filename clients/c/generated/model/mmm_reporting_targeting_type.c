#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "mmm_reporting_targeting_type.h"


char* mmm_reporting_targeting_type_mmm_reporting_targeting_type_ToString(pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type) {
    char *mmm_reporting_targeting_typeArray[] =  { "NULL", "APPTYPE", "COUNTRY", "CREATIVE_TYPE", "GENDER", "LOCATION" };
    return mmm_reporting_targeting_typeArray[mmm_reporting_targeting_type];
}

pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type_mmm_reporting_targeting_type_FromString(char* mmm_reporting_targeting_type) {
    int stringToReturn = 0;
    char *mmm_reporting_targeting_typeArray[] =  { "NULL", "APPTYPE", "COUNTRY", "CREATIVE_TYPE", "GENDER", "LOCATION" };
    size_t sizeofArray = sizeof(mmm_reporting_targeting_typeArray) / sizeof(mmm_reporting_targeting_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(mmm_reporting_targeting_type, mmm_reporting_targeting_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *mmm_reporting_targeting_type_mmm_reporting_targeting_type_convertToJSON(pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "mmm_reporting_targeting_type", mmm_reporting_targeting_type_mmm_reporting_targeting_type_ToString(mmm_reporting_targeting_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_type_mmm_reporting_targeting_type_parseFromJSON(cJSON *mmm_reporting_targeting_typeJSON) {
    pinterest_rest_api_mmm_reporting_targeting_type__e *mmm_reporting_targeting_type = NULL;
    pinterest_rest_api_mmm_reporting_targeting_type__e mmm_reporting_targeting_typeVariable;
    cJSON *mmm_reporting_targeting_typeVar = cJSON_GetObjectItemCaseSensitive(mmm_reporting_targeting_typeJSON, "mmm_reporting_targeting_type");
    if(!cJSON_IsString(mmm_reporting_targeting_typeVar) || (mmm_reporting_targeting_typeVar->valuestring == NULL)){
        goto end;
    }
    mmm_reporting_targeting_typeVariable = mmm_reporting_targeting_type_mmm_reporting_targeting_type_FromString(mmm_reporting_targeting_typeVar->valuestring);
    return mmm_reporting_targeting_typeVariable;
end:
    return 0;
}
