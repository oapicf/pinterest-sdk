#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_owner.h"



board_owner_t *board_owner_create(
    char *username
    ) {
    board_owner_t *board_owner_local_var = malloc(sizeof(board_owner_t));
    if (!board_owner_local_var) {
        return NULL;
    }
    board_owner_local_var->username = username;

    return board_owner_local_var;
}


void board_owner_free(board_owner_t *board_owner) {
    if(NULL == board_owner){
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
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }


    board_owner_local_var = board_owner_create (
        username && !cJSON_IsNull(username) ? strdup(username->valuestring) : NULL
        );

    return board_owner_local_var;
end:
    return NULL;

}
