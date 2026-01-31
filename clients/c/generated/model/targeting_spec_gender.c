#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_gender.h"


char* targeting_spec_gender_targeting_spec_gender_ToString(pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender) {
    char *targeting_spec_genderArray[] =  { "NULL", "unknown", "male", "female" };
    return targeting_spec_genderArray[targeting_spec_gender];
}

pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender_targeting_spec_gender_FromString(char* targeting_spec_gender) {
    int stringToReturn = 0;
    char *targeting_spec_genderArray[] =  { "NULL", "unknown", "male", "female" };
    size_t sizeofArray = sizeof(targeting_spec_genderArray) / sizeof(targeting_spec_genderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_spec_gender, targeting_spec_genderArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *targeting_spec_gender_convertToJSON(pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "targeting_spec_gender", targeting_spec_gender_targeting_spec_gender_ToString(targeting_spec_gender)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender_parseFromJSON(cJSON *targeting_spec_genderJSON) {
    if(!cJSON_IsString(targeting_spec_genderJSON) || (targeting_spec_genderJSON->valuestring == NULL)) {
        return 0;
    }
    return targeting_spec_gender_targeting_spec_gender_FromString(targeting_spec_genderJSON->valuestring);
}
