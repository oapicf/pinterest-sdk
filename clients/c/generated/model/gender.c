#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender.h"


char* gender_gender_ToString(pinterest_rest_api_gender__e gender) {
    char *genderArray[] =  { "NULL", "FEMALE", "MALE", "UNISEX" };
    return genderArray[gender];
}

pinterest_rest_api_gender__e gender_gender_FromString(char* gender) {
    int stringToReturn = 0;
    char *genderArray[] =  { "NULL", "FEMALE", "MALE", "UNISEX" };
    size_t sizeofArray = sizeof(genderArray) / sizeof(genderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(gender, genderArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *gender_gender_convertToJSON(pinterest_rest_api_gender__e gender) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "gender", gender_gender_ToString(gender)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_gender__e gender_gender_parseFromJSON(cJSON *genderJSON) {
    pinterest_rest_api_gender__e *gender = NULL;
    pinterest_rest_api_gender__e genderVariable;
    cJSON *genderVar = cJSON_GetObjectItemCaseSensitive(genderJSON, "gender");
    if(!cJSON_IsString(genderVar) || (genderVar->valuestring == NULL)){
        goto end;
    }
    genderVariable = gender_gender_FromString(genderVar->valuestring);
    return genderVariable;
end:
    return 0;
}
