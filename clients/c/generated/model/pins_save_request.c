#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pins_save_request.h"



pins_save_request_t *pins_save_request_create(
    char *board_id,
    char *board_section_id
    ) {
    pins_save_request_t *pins_save_request_local_var = malloc(sizeof(pins_save_request_t));
    if (!pins_save_request_local_var) {
        return NULL;
    }
    pins_save_request_local_var->board_id = board_id;
    pins_save_request_local_var->board_section_id = board_section_id;

    return pins_save_request_local_var;
}


void pins_save_request_free(pins_save_request_t *pins_save_request) {
    if(NULL == pins_save_request){
        return ;
    }
    listEntry_t *listEntry;
    if (pins_save_request->board_id) {
        free(pins_save_request->board_id);
        pins_save_request->board_id = NULL;
    }
    if (pins_save_request->board_section_id) {
        free(pins_save_request->board_section_id);
        pins_save_request->board_section_id = NULL;
    }
    free(pins_save_request);
}

cJSON *pins_save_request_convertToJSON(pins_save_request_t *pins_save_request) {
    cJSON *item = cJSON_CreateObject();

    // pins_save_request->board_id
    if(pins_save_request->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pins_save_request->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pins_save_request->board_section_id
    if(pins_save_request->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pins_save_request->board_section_id) == NULL) {
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

pins_save_request_t *pins_save_request_parseFromJSON(cJSON *pins_save_requestJSON){

    pins_save_request_t *pins_save_request_local_var = NULL;

    // pins_save_request->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pins_save_requestJSON, "board_id");
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pins_save_request->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pins_save_requestJSON, "board_section_id");
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }


    pins_save_request_local_var = pins_save_request_create (
        board_id && !cJSON_IsNull(board_id) ? strdup(board_id->valuestring) : NULL,
        board_section_id && !cJSON_IsNull(board_section_id) ? strdup(board_section_id->valuestring) : NULL
        );

    return pins_save_request_local_var;
end:
    return NULL;

}
