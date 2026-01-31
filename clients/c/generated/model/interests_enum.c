#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "interests_enum.h"


char* interests_enum_interests_enum_ToString(pinterest_rest_api_interests_enum__e interests_enum) {
    char *interests_enumArray[] =  { "NULL", "ALL", "ANIMALS", "ARCHITECTURE", "ART", "BEAUTY", "DIY_AND_CRAFTS", "EDUCATION", "EVENT_PLANNING", "FASHION", "FOOD_AND_DRINKS", "GARDENING", "HEALTH", "HOME_DECOR", "PARENTING", "TRAVEL", "WEDDING" };
    return interests_enumArray[interests_enum];
}

pinterest_rest_api_interests_enum__e interests_enum_interests_enum_FromString(char* interests_enum) {
    int stringToReturn = 0;
    char *interests_enumArray[] =  { "NULL", "ALL", "ANIMALS", "ARCHITECTURE", "ART", "BEAUTY", "DIY_AND_CRAFTS", "EDUCATION", "EVENT_PLANNING", "FASHION", "FOOD_AND_DRINKS", "GARDENING", "HEALTH", "HOME_DECOR", "PARENTING", "TRAVEL", "WEDDING" };
    size_t sizeofArray = sizeof(interests_enumArray) / sizeof(interests_enumArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(interests_enum, interests_enumArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *interests_enum_convertToJSON(pinterest_rest_api_interests_enum__e interests_enum) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "interests_enum", interests_enum_interests_enum_ToString(interests_enum)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_interests_enum__e interests_enum_parseFromJSON(cJSON *interests_enumJSON) {
    if(!cJSON_IsString(interests_enumJSON) || (interests_enumJSON->valuestring == NULL)) {
        return 0;
    }
    return interests_enum_interests_enum_FromString(interests_enumJSON->valuestring);
}
