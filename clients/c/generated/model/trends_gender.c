#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trends_gender.h"


char* trends_gender_trends_gender_ToString(pinterest_rest_api_trends_gender__e trends_gender) {
    char *trends_genderArray[] =  { "NULL", "male", "female", "unspecified" };
    return trends_genderArray[trends_gender];
}

pinterest_rest_api_trends_gender__e trends_gender_trends_gender_FromString(char* trends_gender) {
    int stringToReturn = 0;
    char *trends_genderArray[] =  { "NULL", "male", "female", "unspecified" };
    size_t sizeofArray = sizeof(trends_genderArray) / sizeof(trends_genderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(trends_gender, trends_genderArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *trends_gender_convertToJSON(pinterest_rest_api_trends_gender__e trends_gender) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "trends_gender", trends_gender_trends_gender_ToString(trends_gender)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_trends_gender__e trends_gender_parseFromJSON(cJSON *trends_genderJSON) {
    if(!cJSON_IsString(trends_genderJSON) || (trends_genderJSON->valuestring == NULL)) {
        return 0;
    }
    return trends_gender_trends_gender_FromString(trends_genderJSON->valuestring);
}
