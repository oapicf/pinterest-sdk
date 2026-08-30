#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "change_history_data_type.h"


char* change_history_data_type_change_history_data_type_ToString(pinterest_rest_api_change_history_data_type__e change_history_data_type) {
    char *change_history_data_typeArray[] =  { "NULL", "STRING", "NUMERIC", "MICROCURRENCY", "DATE", "BOOL", "GENDER_LIST", "AGE_BUCKET_LIST", "APPTYPE_LIST", "COUNTRY_LIST", "LOCALE_LIST" };
    return change_history_data_typeArray[change_history_data_type];
}

pinterest_rest_api_change_history_data_type__e change_history_data_type_change_history_data_type_FromString(char* change_history_data_type) {
    int stringToReturn = 0;
    char *change_history_data_typeArray[] =  { "NULL", "STRING", "NUMERIC", "MICROCURRENCY", "DATE", "BOOL", "GENDER_LIST", "AGE_BUCKET_LIST", "APPTYPE_LIST", "COUNTRY_LIST", "LOCALE_LIST" };
    size_t sizeofArray = sizeof(change_history_data_typeArray) / sizeof(change_history_data_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(change_history_data_type, change_history_data_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *change_history_data_type_convertToJSON(pinterest_rest_api_change_history_data_type__e change_history_data_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "change_history_data_type", change_history_data_type_change_history_data_type_ToString(change_history_data_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_change_history_data_type__e change_history_data_type_parseFromJSON(cJSON *change_history_data_typeJSON) {
    if(!cJSON_IsString(change_history_data_typeJSON) || (change_history_data_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return change_history_data_type_change_history_data_type_FromString(change_history_data_typeJSON->valuestring);
}
