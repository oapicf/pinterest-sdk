#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_update_privacy.h"


char* board_update_privacy_board_update_privacy_ToString(pinterest_rest_api_board_update_privacy__e board_update_privacy) {
    char *board_update_privacyArray[] =  { "NULL", "PUBLIC", "SECRET" };
    return board_update_privacyArray[board_update_privacy];
}

pinterest_rest_api_board_update_privacy__e board_update_privacy_board_update_privacy_FromString(char* board_update_privacy) {
    int stringToReturn = 0;
    char *board_update_privacyArray[] =  { "NULL", "PUBLIC", "SECRET" };
    size_t sizeofArray = sizeof(board_update_privacyArray) / sizeof(board_update_privacyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(board_update_privacy, board_update_privacyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *board_update_privacy_convertToJSON(pinterest_rest_api_board_update_privacy__e board_update_privacy) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "board_update_privacy", board_update_privacy_board_update_privacy_ToString(board_update_privacy)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_board_update_privacy__e board_update_privacy_parseFromJSON(cJSON *board_update_privacyJSON) {
    if(!cJSON_IsString(board_update_privacyJSON) || (board_update_privacyJSON->valuestring == NULL)) {
        return 0;
    }
    return board_update_privacy_board_update_privacy_FromString(board_update_privacyJSON->valuestring);
}
