#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "msot_event_name.h"


char* msot_event_name_msot_event_name_ToString(pinterest_rest_api_msot_event_name__e msot_event_name) {
    char *msot_event_nameArray[] =  { "NULL", "add_to_cart", "checkout", "lead", "signup" };
    return msot_event_nameArray[msot_event_name];
}

pinterest_rest_api_msot_event_name__e msot_event_name_msot_event_name_FromString(char* msot_event_name) {
    int stringToReturn = 0;
    char *msot_event_nameArray[] =  { "NULL", "add_to_cart", "checkout", "lead", "signup" };
    size_t sizeofArray = sizeof(msot_event_nameArray) / sizeof(msot_event_nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(msot_event_name, msot_event_nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *msot_event_name_convertToJSON(pinterest_rest_api_msot_event_name__e msot_event_name) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "msot_event_name", msot_event_name_msot_event_name_ToString(msot_event_name)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_msot_event_name__e msot_event_name_parseFromJSON(cJSON *msot_event_nameJSON) {
    if(!cJSON_IsString(msot_event_nameJSON) || (msot_event_nameJSON->valuestring == NULL)) {
        return 0;
    }
    return msot_event_name_msot_event_name_FromString(msot_event_nameJSON->valuestring);
}
