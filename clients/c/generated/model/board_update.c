#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_update.h"


char* board_update_privacy_ToString(pinterest_rest_api_board_update_PRIVACY_e privacy) {
    char* privacyArray[] =  { "NULL", "PUBLIC", "SECRET" };
    return privacyArray[privacy];
}

pinterest_rest_api_board_update_PRIVACY_e board_update_privacy_FromString(char* privacy){
    int stringToReturn = 0;
    char *privacyArray[] =  { "NULL", "PUBLIC", "SECRET" };
    size_t sizeofArray = sizeof(privacyArray) / sizeof(privacyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(privacy, privacyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static board_update_t *board_update_create_internal(
    char *name,
    char *description,
    pinterest_rest_api_board_update_PRIVACY_e privacy
    ) {
    board_update_t *board_update_local_var = malloc(sizeof(board_update_t));
    if (!board_update_local_var) {
        return NULL;
    }
    board_update_local_var->name = name;
    board_update_local_var->description = description;
    board_update_local_var->privacy = privacy;

    board_update_local_var->_library_owned = 1;
    return board_update_local_var;
}

__attribute__((deprecated)) board_update_t *board_update_create(
    char *name,
    char *description,
    pinterest_rest_api_board_update_PRIVACY_e privacy
    ) {
    return board_update_create_internal (
        name,
        description,
        privacy
        );
}

void board_update_free(board_update_t *board_update) {
    if(NULL == board_update){
        return ;
    }
    if(board_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_update->name) {
        free(board_update->name);
        board_update->name = NULL;
    }
    if (board_update->description) {
        free(board_update->description);
        board_update->description = NULL;
    }
    free(board_update);
}

cJSON *board_update_convertToJSON(board_update_t *board_update) {
    cJSON *item = cJSON_CreateObject();

    // board_update->name
    if(board_update->name) {
    if(cJSON_AddStringToObject(item, "name", board_update->name) == NULL) {
    goto fail; //String
    }
    }


    // board_update->description
    if(board_update->description) {
    if(cJSON_AddStringToObject(item, "description", board_update->description) == NULL) {
    goto fail; //String
    }
    }


    // board_update->privacy
    if(board_update->privacy != pinterest_rest_api_board_update_PRIVACY_NULL) {
    if(cJSON_AddStringToObject(item, "privacy", board_update_privacy_ToString(board_update->privacy)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

board_update_t *board_update_parseFromJSON(cJSON *board_updateJSON){

    board_update_t *board_update_local_var = NULL;

    // board_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // board_update->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(board_updateJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board_update->privacy
    cJSON *privacy = cJSON_GetObjectItemCaseSensitive(board_updateJSON, "privacy");
    if (cJSON_IsNull(privacy)) {
        privacy = NULL;
    }
    pinterest_rest_api_board_update_PRIVACY_e privacyVariable;
    if (privacy) { 
    if(!cJSON_IsString(privacy))
    {
    goto end; //Enum
    }
    privacyVariable = board_update_privacy_FromString(privacy->valuestring);
    }


    board_update_local_var = board_update_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        privacy ? privacyVariable : pinterest_rest_api_board_update_PRIVACY_NULL
        );

    return board_update_local_var;
end:
    return NULL;

}
