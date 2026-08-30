#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_account_type.h"


char* user_account_type_user_account_type_ToString(pinterest_rest_api_user_account_type__e user_account_type) {
    char *user_account_typeArray[] =  { "NULL", "PINNER", "BUSINESS" };
    return user_account_typeArray[user_account_type];
}

pinterest_rest_api_user_account_type__e user_account_type_user_account_type_FromString(char* user_account_type) {
    int stringToReturn = 0;
    char *user_account_typeArray[] =  { "NULL", "PINNER", "BUSINESS" };
    size_t sizeofArray = sizeof(user_account_typeArray) / sizeof(user_account_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(user_account_type, user_account_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *user_account_type_convertToJSON(pinterest_rest_api_user_account_type__e user_account_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "user_account_type", user_account_type_user_account_type_ToString(user_account_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_user_account_type__e user_account_type_parseFromJSON(cJSON *user_account_typeJSON) {
    if(!cJSON_IsString(user_account_typeJSON) || (user_account_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return user_account_type_user_account_type_FromString(user_account_typeJSON->valuestring);
}
