#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "disclosure_type.h"


char* disclosure_type_disclosure_type_ToString(pinterest_rest_api_disclosure_type__e disclosure_type) {
    char *disclosure_typeArray[] =  { "NULL", "NO_DISCLOSURE", "PRESCRIBING_INFORMATION", "PRESCRIBING_INFORMATION_BOX_WARNING", "IMPORTANT_SAFETY_INFO", "MED_GUIDE", "PATIENT_INFORMATION", "" };
    return disclosure_typeArray[disclosure_type];
}

pinterest_rest_api_disclosure_type__e disclosure_type_disclosure_type_FromString(char* disclosure_type) {
    int stringToReturn = 0;
    char *disclosure_typeArray[] =  { "NULL", "NO_DISCLOSURE", "PRESCRIBING_INFORMATION", "PRESCRIBING_INFORMATION_BOX_WARNING", "IMPORTANT_SAFETY_INFO", "MED_GUIDE", "PATIENT_INFORMATION", "" };
    size_t sizeofArray = sizeof(disclosure_typeArray) / sizeof(disclosure_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(disclosure_type, disclosure_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *disclosure_type_convertToJSON(pinterest_rest_api_disclosure_type__e disclosure_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "disclosure_type", disclosure_type_disclosure_type_ToString(disclosure_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_disclosure_type__e disclosure_type_parseFromJSON(cJSON *disclosure_typeJSON) {
    if(!cJSON_IsString(disclosure_typeJSON) || (disclosure_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return disclosure_type_disclosure_type_FromString(disclosure_typeJSON->valuestring);
}
