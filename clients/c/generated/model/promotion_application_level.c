#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotion_application_level.h"


char* promotion_application_level_promotion_application_level_ToString(pinterest_rest_api_promotion_application_level__e promotion_application_level) {
    char *promotion_application_levelArray[] =  { "NULL", "NONE", "ITEM", "AD_GROUP", "" };
    return promotion_application_levelArray[promotion_application_level];
}

pinterest_rest_api_promotion_application_level__e promotion_application_level_promotion_application_level_FromString(char* promotion_application_level) {
    int stringToReturn = 0;
    char *promotion_application_levelArray[] =  { "NULL", "NONE", "ITEM", "AD_GROUP", "" };
    size_t sizeofArray = sizeof(promotion_application_levelArray) / sizeof(promotion_application_levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(promotion_application_level, promotion_application_levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *promotion_application_level_convertToJSON(pinterest_rest_api_promotion_application_level__e promotion_application_level) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "promotion_application_level", promotion_application_level_promotion_application_level_ToString(promotion_application_level)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_promotion_application_level__e promotion_application_level_parseFromJSON(cJSON *promotion_application_levelJSON) {
    if(!cJSON_IsString(promotion_application_levelJSON) || (promotion_application_levelJSON->valuestring == NULL)) {
        return 0;
    }
    return promotion_application_level_promotion_application_level_FromString(promotion_application_levelJSON->valuestring);
}
