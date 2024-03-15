#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_list_type.h"


char* user_list_type_user_list_type_ToString(pinterest_rest_api_user_list_type__e user_list_type) {
    char *user_list_typeArray[] =  { "NULL", "EMAIL", "IDFA", "MAID", "LR_ID", "DLX_ID", "HASHED_PINNER_ID" };
    return user_list_typeArray[user_list_type];
}

pinterest_rest_api_user_list_type__e user_list_type_user_list_type_FromString(char* user_list_type) {
    int stringToReturn = 0;
    char *user_list_typeArray[] =  { "NULL", "EMAIL", "IDFA", "MAID", "LR_ID", "DLX_ID", "HASHED_PINNER_ID" };
    size_t sizeofArray = sizeof(user_list_typeArray) / sizeof(user_list_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(user_list_type, user_list_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *user_list_type_user_list_type_convertToJSON(pinterest_rest_api_user_list_type__e user_list_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "user_list_type", user_list_type_user_list_type_ToString(user_list_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_user_list_type__e user_list_type_user_list_type_parseFromJSON(cJSON *user_list_typeJSON) {
    pinterest_rest_api_user_list_type__e *user_list_type = NULL;
    pinterest_rest_api_user_list_type__e user_list_typeVariable;
    cJSON *user_list_typeVar = cJSON_GetObjectItemCaseSensitive(user_list_typeJSON, "user_list_type");
    if(!cJSON_IsString(user_list_typeVar) || (user_list_typeVar->valuestring == NULL)){
        goto end;
    }
    user_list_typeVariable = user_list_type_user_list_type_FromString(user_list_typeVar->valuestring);
    return user_list_typeVariable;
end:
    return 0;
}
