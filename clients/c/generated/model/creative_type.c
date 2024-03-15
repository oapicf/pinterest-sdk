#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "creative_type.h"


char* creative_type_creative_type_ToString(pinterest_rest_api_creative_type__e creative_type) {
    char *creative_typeArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ" };
    return creative_typeArray[creative_type];
}

pinterest_rest_api_creative_type__e creative_type_creative_type_FromString(char* creative_type) {
    int stringToReturn = 0;
    char *creative_typeArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ" };
    size_t sizeofArray = sizeof(creative_typeArray) / sizeof(creative_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(creative_type, creative_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *creative_type_creative_type_convertToJSON(pinterest_rest_api_creative_type__e creative_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "creative_type", creative_type_creative_type_ToString(creative_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_creative_type__e creative_type_creative_type_parseFromJSON(cJSON *creative_typeJSON) {
    pinterest_rest_api_creative_type__e *creative_type = NULL;
    pinterest_rest_api_creative_type__e creative_typeVariable;
    cJSON *creative_typeVar = cJSON_GetObjectItemCaseSensitive(creative_typeJSON, "creative_type");
    if(!cJSON_IsString(creative_typeVar) || (creative_typeVar->valuestring == NULL)){
        goto end;
    }
    creative_typeVariable = creative_type_creative_type_FromString(creative_typeVar->valuestring);
    return creative_typeVariable;
end:
    return 0;
}
