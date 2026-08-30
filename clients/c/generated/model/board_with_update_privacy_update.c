#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_with_update_privacy_update.h"



static board_with_update_privacy_update_t *board_with_update_privacy_update_create_internal(
    char *description,
    char *name,
    pinterest_rest_api_board_update_privacy__e privacy
    ) {
    board_with_update_privacy_update_t *board_with_update_privacy_update_local_var = malloc(sizeof(board_with_update_privacy_update_t));
    if (!board_with_update_privacy_update_local_var) {
        return NULL;
    }
    memset(board_with_update_privacy_update_local_var, 0, sizeof(board_with_update_privacy_update_t));
    board_with_update_privacy_update_local_var->_library_owned = 1;
    board_with_update_privacy_update_local_var->description = description;
    board_with_update_privacy_update_local_var->name = name;
    board_with_update_privacy_update_local_var->privacy = privacy;
    return board_with_update_privacy_update_local_var;
}

__attribute__((deprecated)) board_with_update_privacy_update_t *board_with_update_privacy_update_create(
    char *description,
    char *name,
    pinterest_rest_api_board_update_privacy__e privacy
    ) {
    board_with_update_privacy_update_t *result = board_with_update_privacy_update_create_internal (
        description,
        name,
        privacy
        );
    if (!result) {
    }
    return result;
}

void board_with_update_privacy_update_free(board_with_update_privacy_update_t *board_with_update_privacy_update) {
    if(NULL == board_with_update_privacy_update){
        return ;
    }
    if(board_with_update_privacy_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_with_update_privacy_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_with_update_privacy_update->description) {
        free(board_with_update_privacy_update->description);
        board_with_update_privacy_update->description = NULL;
    }
    if (board_with_update_privacy_update->name) {
        free(board_with_update_privacy_update->name);
        board_with_update_privacy_update->name = NULL;
    }
    free(board_with_update_privacy_update);
}

cJSON *board_with_update_privacy_update_convertToJSON(board_with_update_privacy_update_t *board_with_update_privacy_update) {
    cJSON *item = cJSON_CreateObject();

    // board_with_update_privacy_update->description
    if(board_with_update_privacy_update->description) {
    if(cJSON_AddStringToObject(item, "description", board_with_update_privacy_update->description) == NULL) {
    goto fail; //String
    }
    }


    // board_with_update_privacy_update->name
    if(board_with_update_privacy_update->name) {
    if(cJSON_AddStringToObject(item, "name", board_with_update_privacy_update->name) == NULL) {
    goto fail; //String
    }
    }


    // board_with_update_privacy_update->privacy
    if(board_with_update_privacy_update->privacy != pinterest_rest_api_board_update_privacy__NULL) {
    cJSON *privacy_local_JSON = board_update_privacy_convertToJSON(board_with_update_privacy_update->privacy);
    if(privacy_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "privacy", privacy_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

board_with_update_privacy_update_t *board_with_update_privacy_update_parseFromJSON(cJSON *board_with_update_privacy_updateJSON){

    board_with_update_privacy_update_t *board_with_update_privacy_update_local_var = NULL;

    char *description_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for board_with_update_privacy_update->privacy
    pinterest_rest_api_board_update_privacy__e privacy_local_nonprim = 0;

    // board_with_update_privacy_update->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(board_with_update_privacy_updateJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board_with_update_privacy_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_with_update_privacy_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // board_with_update_privacy_update->privacy
    cJSON *privacy = cJSON_GetObjectItemCaseSensitive(board_with_update_privacy_updateJSON, "privacy");
    if (cJSON_IsNull(privacy)) {
        privacy = NULL;
    }
    if (privacy) { 
    privacy_local_nonprim = board_update_privacy_parseFromJSON(privacy); //custom
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    board_with_update_privacy_update_local_var = board_with_update_privacy_update_create_internal (
        description_local_str,
        name_local_str,
        privacy ? privacy_local_nonprim : 0
        );

    if (!board_with_update_privacy_update_local_var) {
        goto end;
    }

    return board_with_update_privacy_update_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (privacy_local_nonprim) {
        privacy_local_nonprim = 0;
    }
    return NULL;

}
