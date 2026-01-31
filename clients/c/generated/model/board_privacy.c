#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_privacy.h"


char* board_privacy_board_privacy_ToString(pinterest_rest_api_board_privacy__e board_privacy) {
    char *board_privacyArray[] =  { "NULL", "PUBLIC", "PROTECTED", "SECRET" };
    return board_privacyArray[board_privacy];
}

pinterest_rest_api_board_privacy__e board_privacy_board_privacy_FromString(char* board_privacy) {
    int stringToReturn = 0;
    char *board_privacyArray[] =  { "NULL", "PUBLIC", "PROTECTED", "SECRET" };
    size_t sizeofArray = sizeof(board_privacyArray) / sizeof(board_privacyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(board_privacy, board_privacyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *board_privacy_convertToJSON(pinterest_rest_api_board_privacy__e board_privacy) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "board_privacy", board_privacy_board_privacy_ToString(board_privacy)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_board_privacy__e board_privacy_parseFromJSON(cJSON *board_privacyJSON) {
    if(!cJSON_IsString(board_privacyJSON) || (board_privacyJSON->valuestring == NULL)) {
        return 0;
    }
    return board_privacy_board_privacy_FromString(board_privacyJSON->valuestring);
}
