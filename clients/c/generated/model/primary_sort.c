#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "primary_sort.h"


char* primary_sort_primary_sort_ToString(pinterest_rest_api_primary_sort__e primary_sort) {
    char *primary_sortArray[] =  { "NULL", "BY_ID", "BY_DATE" };
    return primary_sortArray[primary_sort];
}

pinterest_rest_api_primary_sort__e primary_sort_primary_sort_FromString(char* primary_sort) {
    int stringToReturn = 0;
    char *primary_sortArray[] =  { "NULL", "BY_ID", "BY_DATE" };
    size_t sizeofArray = sizeof(primary_sortArray) / sizeof(primary_sortArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(primary_sort, primary_sortArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *primary_sort_convertToJSON(pinterest_rest_api_primary_sort__e primary_sort) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "primary_sort", primary_sort_primary_sort_ToString(primary_sort)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_primary_sort__e primary_sort_parseFromJSON(cJSON *primary_sortJSON) {
    if(!cJSON_IsString(primary_sortJSON) || (primary_sortJSON->valuestring == NULL)) {
        return 0;
    }
    return primary_sort_primary_sort_FromString(primary_sortJSON->valuestring);
}
