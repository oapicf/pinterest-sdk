#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_privacy_filter.h"


char* board_privacy_filter_board_privacy_filter_ToString(pinterest_rest_api_board_privacy_filter__e board_privacy_filter) {
    char *board_privacy_filterArray[] =  { "NULL", "ALL", "PUBLIC", "PROTECTED", "SECRET", "PUBLIC_AND_SECRET" };
    return board_privacy_filterArray[board_privacy_filter];
}

pinterest_rest_api_board_privacy_filter__e board_privacy_filter_board_privacy_filter_FromString(char* board_privacy_filter) {
    int stringToReturn = 0;
    char *board_privacy_filterArray[] =  { "NULL", "ALL", "PUBLIC", "PROTECTED", "SECRET", "PUBLIC_AND_SECRET" };
    size_t sizeofArray = sizeof(board_privacy_filterArray) / sizeof(board_privacy_filterArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(board_privacy_filter, board_privacy_filterArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *board_privacy_filter_convertToJSON(pinterest_rest_api_board_privacy_filter__e board_privacy_filter) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "board_privacy_filter", board_privacy_filter_board_privacy_filter_ToString(board_privacy_filter)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_board_privacy_filter__e board_privacy_filter_parseFromJSON(cJSON *board_privacy_filterJSON) {
    if(!cJSON_IsString(board_privacy_filterJSON) || (board_privacy_filterJSON->valuestring == NULL)) {
        return 0;
    }
    return board_privacy_filter_board_privacy_filter_FromString(board_privacy_filterJSON->valuestring);
}
