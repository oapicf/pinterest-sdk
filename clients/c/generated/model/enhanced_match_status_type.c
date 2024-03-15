#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "enhanced_match_status_type.h"


char* enhanced_match_status_type_enhanced_match_status_type_ToString(pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type) {
    char *enhanced_match_status_typeArray[] =  { "NULL", "UNKNOWN", "NOT_VALIDATED", "VALIDATING_IN_PROGRESS", "VALIDATION_COMPLETE", "" };
    return enhanced_match_status_typeArray[enhanced_match_status_type];
}

pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type_enhanced_match_status_type_FromString(char* enhanced_match_status_type) {
    int stringToReturn = 0;
    char *enhanced_match_status_typeArray[] =  { "NULL", "UNKNOWN", "NOT_VALIDATED", "VALIDATING_IN_PROGRESS", "VALIDATION_COMPLETE", "" };
    size_t sizeofArray = sizeof(enhanced_match_status_typeArray) / sizeof(enhanced_match_status_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(enhanced_match_status_type, enhanced_match_status_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *enhanced_match_status_type_enhanced_match_status_type_convertToJSON(pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "enhanced_match_status_type", enhanced_match_status_type_enhanced_match_status_type_ToString(enhanced_match_status_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type_enhanced_match_status_type_parseFromJSON(cJSON *enhanced_match_status_typeJSON) {
    pinterest_rest_api_enhanced_match_status_type__e *enhanced_match_status_type = NULL;
    pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_typeVariable;
    cJSON *enhanced_match_status_typeVar = cJSON_GetObjectItemCaseSensitive(enhanced_match_status_typeJSON, "enhanced_match_status_type");
    if(!cJSON_IsString(enhanced_match_status_typeVar) || (enhanced_match_status_typeVar->valuestring == NULL)){
        goto end;
    }
    enhanced_match_status_typeVariable = enhanced_match_status_type_enhanced_match_status_type_FromString(enhanced_match_status_typeVar->valuestring);
    return enhanced_match_status_typeVariable;
end:
    return 0;
}
