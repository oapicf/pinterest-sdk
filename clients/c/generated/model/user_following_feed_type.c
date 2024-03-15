#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_following_feed_type.h"


char* user_following_feed_type_user_following_feed_type_ToString(pinterest_rest_api_user_following_feed_type__e user_following_feed_type) {
    char *user_following_feed_typeArray[] =  { "NULL", "ALL", "RANKED", "CREATOR_ONLY", "RANKED_CREATOR_ONLY" };
    return user_following_feed_typeArray[user_following_feed_type];
}

pinterest_rest_api_user_following_feed_type__e user_following_feed_type_user_following_feed_type_FromString(char* user_following_feed_type) {
    int stringToReturn = 0;
    char *user_following_feed_typeArray[] =  { "NULL", "ALL", "RANKED", "CREATOR_ONLY", "RANKED_CREATOR_ONLY" };
    size_t sizeofArray = sizeof(user_following_feed_typeArray) / sizeof(user_following_feed_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(user_following_feed_type, user_following_feed_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *user_following_feed_type_user_following_feed_type_convertToJSON(pinterest_rest_api_user_following_feed_type__e user_following_feed_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "user_following_feed_type", user_following_feed_type_user_following_feed_type_ToString(user_following_feed_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_user_following_feed_type__e user_following_feed_type_user_following_feed_type_parseFromJSON(cJSON *user_following_feed_typeJSON) {
    pinterest_rest_api_user_following_feed_type__e *user_following_feed_type = NULL;
    pinterest_rest_api_user_following_feed_type__e user_following_feed_typeVariable;
    cJSON *user_following_feed_typeVar = cJSON_GetObjectItemCaseSensitive(user_following_feed_typeJSON, "user_following_feed_type");
    if(!cJSON_IsString(user_following_feed_typeVar) || (user_following_feed_typeVar->valuestring == NULL)){
        goto end;
    }
    user_following_feed_typeVariable = user_following_feed_type_user_following_feed_type_FromString(user_following_feed_typeVar->valuestring);
    return user_following_feed_typeVariable;
end:
    return 0;
}
