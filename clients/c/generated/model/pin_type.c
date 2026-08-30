#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_type.h"


char* pin_type_pin_type_ToString(pinterest_rest_api_pin_type__e pin_type) {
    char *pin_typeArray[] =  { "NULL", "PRIVATE" };
    return pin_typeArray[pin_type];
}

pinterest_rest_api_pin_type__e pin_type_pin_type_FromString(char* pin_type) {
    int stringToReturn = 0;
    char *pin_typeArray[] =  { "NULL", "PRIVATE" };
    size_t sizeofArray = sizeof(pin_typeArray) / sizeof(pin_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(pin_type, pin_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *pin_type_convertToJSON(pinterest_rest_api_pin_type__e pin_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_type", pin_type_pin_type_ToString(pin_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_pin_type__e pin_type_parseFromJSON(cJSON *pin_typeJSON) {
    if(!cJSON_IsString(pin_typeJSON) || (pin_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return pin_type_pin_type_FromString(pin_typeJSON->valuestring);
}
