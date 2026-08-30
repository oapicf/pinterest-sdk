#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attribution_match_type.h"


char* attribution_match_type_attribution_match_type_ToString(pinterest_rest_api_attribution_match_type__e attribution_match_type) {
    char *attribution_match_typeArray[] =  { "NULL", "P", "D", "NA" };
    return attribution_match_typeArray[attribution_match_type];
}

pinterest_rest_api_attribution_match_type__e attribution_match_type_attribution_match_type_FromString(char* attribution_match_type) {
    int stringToReturn = 0;
    char *attribution_match_typeArray[] =  { "NULL", "P", "D", "NA" };
    size_t sizeofArray = sizeof(attribution_match_typeArray) / sizeof(attribution_match_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(attribution_match_type, attribution_match_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *attribution_match_type_convertToJSON(pinterest_rest_api_attribution_match_type__e attribution_match_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "attribution_match_type", attribution_match_type_attribution_match_type_ToString(attribution_match_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_attribution_match_type__e attribution_match_type_parseFromJSON(cJSON *attribution_match_typeJSON) {
    if(!cJSON_IsString(attribution_match_typeJSON) || (attribution_match_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return attribution_match_type_attribution_match_type_FromString(attribution_match_typeJSON->valuestring);
}
