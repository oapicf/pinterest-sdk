#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ai_disclosure_item.h"


char* ai_disclosure_item_ai_disclosure_item_ToString(pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item) {
    char *ai_disclosure_itemArray[] =  { "NULL", "AI_MODIFIED", "SYNTHETIC_PERFORMER" };
    return ai_disclosure_itemArray[ai_disclosure_item];
}

pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item_ai_disclosure_item_FromString(char* ai_disclosure_item) {
    int stringToReturn = 0;
    char *ai_disclosure_itemArray[] =  { "NULL", "AI_MODIFIED", "SYNTHETIC_PERFORMER" };
    size_t sizeofArray = sizeof(ai_disclosure_itemArray) / sizeof(ai_disclosure_itemArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ai_disclosure_item, ai_disclosure_itemArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *ai_disclosure_item_convertToJSON(pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "ai_disclosure_item", ai_disclosure_item_ai_disclosure_item_ToString(ai_disclosure_item)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_ai_disclosure_item__e ai_disclosure_item_parseFromJSON(cJSON *ai_disclosure_itemJSON) {
    if(!cJSON_IsString(ai_disclosure_itemJSON) || (ai_disclosure_itemJSON->valuestring == NULL)) {
        return 0;
    }
    return ai_disclosure_item_ai_disclosure_item_FromString(ai_disclosure_itemJSON->valuestring);
}
