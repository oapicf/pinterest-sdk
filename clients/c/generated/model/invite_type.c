#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_type.h"


char* invite_type_invite_type_ToString(pinterest_rest_api_invite_type__e invite_type) {
    char *invite_typeArray[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    return invite_typeArray[invite_type];
}

pinterest_rest_api_invite_type__e invite_type_invite_type_FromString(char* invite_type) {
    int stringToReturn = 0;
    char *invite_typeArray[] =  { "NULL", "MEMBER_INVITE", "PARTNER_INVITE", "PARTNER_REQUEST" };
    size_t sizeofArray = sizeof(invite_typeArray) / sizeof(invite_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(invite_type, invite_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *invite_type_invite_type_convertToJSON(pinterest_rest_api_invite_type__e invite_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "invite_type", invite_type_invite_type_ToString(invite_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_invite_type__e invite_type_invite_type_parseFromJSON(cJSON *invite_typeJSON) {
    pinterest_rest_api_invite_type__e *invite_type = NULL;
    pinterest_rest_api_invite_type__e invite_typeVariable;
    cJSON *invite_typeVar = cJSON_GetObjectItemCaseSensitive(invite_typeJSON, "invite_type");
    if(!cJSON_IsString(invite_typeVar) || (invite_typeVar->valuestring == NULL)){
        goto end;
    }
    invite_typeVariable = invite_type_invite_type_FromString(invite_typeVar->valuestring);
    return invite_typeVariable;
end:
    return 0;
}
