#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "placement_type.h"


char* placement_type_placement_type_ToString(pinterest_rest_api_placement_type__e placement_type) {
    char *placement_typeArray[] =  { "NULL", "SEARCH", "BROWSE", "RELATED_PINS" };
    return placement_typeArray[placement_type];
}

pinterest_rest_api_placement_type__e placement_type_placement_type_FromString(char* placement_type) {
    int stringToReturn = 0;
    char *placement_typeArray[] =  { "NULL", "SEARCH", "BROWSE", "RELATED_PINS" };
    size_t sizeofArray = sizeof(placement_typeArray) / sizeof(placement_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_type, placement_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *placement_type_convertToJSON(pinterest_rest_api_placement_type__e placement_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "placement_type", placement_type_placement_type_ToString(placement_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_placement_type__e placement_type_parseFromJSON(cJSON *placement_typeJSON) {
    if(!cJSON_IsString(placement_typeJSON) || (placement_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return placement_type_placement_type_FromString(placement_typeJSON->valuestring);
}
