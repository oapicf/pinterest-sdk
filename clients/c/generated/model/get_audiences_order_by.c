#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_audiences_order_by.h"


char* get_audiences_order_by_get_audiences_order_by_ToString(pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by) {
    char *get_audiences_order_byArray[] =  { "NULL", "NONE", "ID", "SIZE", "CREATION_DATE", "UPDATED_TIME", "NAME", "STATUS", "TYPE" };
    return get_audiences_order_byArray[get_audiences_order_by];
}

pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by_get_audiences_order_by_FromString(char* get_audiences_order_by) {
    int stringToReturn = 0;
    char *get_audiences_order_byArray[] =  { "NULL", "NONE", "ID", "SIZE", "CREATION_DATE", "UPDATED_TIME", "NAME", "STATUS", "TYPE" };
    size_t sizeofArray = sizeof(get_audiences_order_byArray) / sizeof(get_audiences_order_byArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(get_audiences_order_by, get_audiences_order_byArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *get_audiences_order_by_get_audiences_order_by_convertToJSON(pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "get_audiences_order_by", get_audiences_order_by_get_audiences_order_by_ToString(get_audiences_order_by)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_get_audiences_order_by__e get_audiences_order_by_get_audiences_order_by_parseFromJSON(cJSON *get_audiences_order_byJSON) {
    pinterest_rest_api_get_audiences_order_by__e *get_audiences_order_by = NULL;
    pinterest_rest_api_get_audiences_order_by__e get_audiences_order_byVariable;
    cJSON *get_audiences_order_byVar = cJSON_GetObjectItemCaseSensitive(get_audiences_order_byJSON, "get_audiences_order_by");
    if(!cJSON_IsString(get_audiences_order_byVar) || (get_audiences_order_byVar->valuestring == NULL)){
        goto end;
    }
    get_audiences_order_byVariable = get_audiences_order_by_get_audiences_order_by_FromString(get_audiences_order_byVar->valuestring);
    return get_audiences_order_byVariable;
end:
    return 0;
}
