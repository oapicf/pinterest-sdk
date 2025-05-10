#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_owner.h"



static board_owner_t *board_owner_create_internal(
    char *username
    ) {
    board_owner_t *board_owner_local_var = malloc(sizeof(board_owner_t));
    if (!board_owner_local_var) {
        return NULL;
    }
    board_owner_local_var->username = username;

    board_owner_local_var->_library_owned = 1;
    return board_owner_local_var;
}

__attribute__((deprecated)) board_owner_t *board_owner_create(
    char *username
    ) {
    return board_owner_create_internal (
        username
        );
}

void board_owner_free(board_owner_t *board_owner) {
    if(NULL == board_owner){
        return ;
    }
    if(board_owner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_owner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_owner->username) {
        free(board_owner->username);
        board_owner->username = NULL;
    }
    free(board_owner);
}

cJSON *board_owner_convertToJSON(board_owner_t *board_owner) {
    cJSON *item = cJSON_CreateObject();

    // board_owner->username
    if(board_owner->username) {
    if(cJSON_AddStringToObject(item, "username", board_owner->username) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

board_owner_t *board_owner_parseFromJSON(cJSON *board_ownerJSON){

    board_owner_t *board_owner_local_var = NULL;

    // board_owner->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(board_ownerJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    board_owner_local_var = board_owner_create_internal (
        username && !cJSON_IsNull(username) ? strdup(username->valuestring) : NULL
        );

    return board_owner_local_var;
end:
    return NULL;

}
