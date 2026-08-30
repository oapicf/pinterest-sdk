#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pins_save_request_create.h"



static pins_save_request_create_t *pins_save_request_create_create_internal(
    char *board_id,
    char *board_section_id
    ) {
    pins_save_request_create_t *pins_save_request_create_local_var = malloc(sizeof(pins_save_request_create_t));
    if (!pins_save_request_create_local_var) {
        return NULL;
    }
    memset(pins_save_request_create_local_var, 0, sizeof(pins_save_request_create_t));
    pins_save_request_create_local_var->_library_owned = 1;
    pins_save_request_create_local_var->board_id = board_id;
    pins_save_request_create_local_var->board_section_id = board_section_id;
    return pins_save_request_create_local_var;
}

__attribute__((deprecated)) pins_save_request_create_t *pins_save_request_create_create(
    char *board_id,
    char *board_section_id
    ) {
    pins_save_request_create_t *result = pins_save_request_create_create_internal (
        board_id,
        board_section_id
        );
    if (!result) {
    }
    return result;
}

void pins_save_request_create_free(pins_save_request_create_t *pins_save_request_create) {
    if(NULL == pins_save_request_create){
        return ;
    }
    if(pins_save_request_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pins_save_request_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pins_save_request_create->board_id) {
        free(pins_save_request_create->board_id);
        pins_save_request_create->board_id = NULL;
    }
    if (pins_save_request_create->board_section_id) {
        free(pins_save_request_create->board_section_id);
        pins_save_request_create->board_section_id = NULL;
    }
    free(pins_save_request_create);
}

cJSON *pins_save_request_create_convertToJSON(pins_save_request_create_t *pins_save_request_create) {
    cJSON *item = cJSON_CreateObject();

    // pins_save_request_create->board_id
    if(pins_save_request_create->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pins_save_request_create->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pins_save_request_create->board_section_id
    if(pins_save_request_create->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pins_save_request_create->board_section_id) == NULL) {
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

pins_save_request_create_t *pins_save_request_create_parseFromJSON(cJSON *pins_save_request_createJSON){

    pins_save_request_create_t *pins_save_request_create_local_var = NULL;

    char *board_id_local_str = NULL;

    char *board_section_id_local_str = NULL;

    // pins_save_request_create->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pins_save_request_createJSON, "board_id");
    if (cJSON_IsNull(board_id)) {
        board_id = NULL;
    }
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pins_save_request_create->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pins_save_request_createJSON, "board_section_id");
    if (cJSON_IsNull(board_section_id)) {
        board_section_id = NULL;
    }
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }


    if (board_id && !cJSON_IsNull(board_id)) board_id_local_str = strdup(board_id->valuestring);
    if (board_section_id && !cJSON_IsNull(board_section_id)) board_section_id_local_str = strdup(board_section_id->valuestring);

    pins_save_request_create_local_var = pins_save_request_create_create_internal (
        board_id_local_str,
        board_section_id_local_str
        );

    if (!pins_save_request_create_local_var) {
        goto end;
    }

    return pins_save_request_create_local_var;
end:
    if (board_id_local_str) {
        free(board_id_local_str);
        board_id_local_str = NULL;
    }
    if (board_section_id_local_str) {
        free(board_section_id_local_str);
        board_section_id_local_str = NULL;
    }
    return NULL;

}
