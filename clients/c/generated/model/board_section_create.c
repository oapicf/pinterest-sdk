#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_section_create.h"



static board_section_create_t *board_section_create_create_internal(
    char *id,
    char *name
    ) {
    board_section_create_t *board_section_create_local_var = malloc(sizeof(board_section_create_t));
    if (!board_section_create_local_var) {
        return NULL;
    }
    memset(board_section_create_local_var, 0, sizeof(board_section_create_t));
    board_section_create_local_var->_library_owned = 1;
    board_section_create_local_var->id = id;
    board_section_create_local_var->name = name;
    return board_section_create_local_var;
}

__attribute__((deprecated)) board_section_create_t *board_section_create_create(
    char *id,
    char *name
    ) {
    board_section_create_t *result = board_section_create_create_internal (
        id,
        name
        );
    if (!result) {
    }
    return result;
}

void board_section_create_free(board_section_create_t *board_section_create) {
    if(NULL == board_section_create){
        return ;
    }
    if(board_section_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_section_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_section_create->id) {
        free(board_section_create->id);
        board_section_create->id = NULL;
    }
    if (board_section_create->name) {
        free(board_section_create->name);
        board_section_create->name = NULL;
    }
    free(board_section_create);
}

cJSON *board_section_create_convertToJSON(board_section_create_t *board_section_create) {
    cJSON *item = cJSON_CreateObject();

    // board_section_create->id
    if(board_section_create->id) {
    if(cJSON_AddStringToObject(item, "id", board_section_create->id) == NULL) {
    goto fail; //String
    }
    }


    // board_section_create->name
    if (!board_section_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board_section_create->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

board_section_create_t *board_section_create_parseFromJSON(cJSON *board_section_createJSON){

    board_section_create_t *board_section_create_local_var = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    // board_section_create->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(board_section_createJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // board_section_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_section_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    board_section_create_local_var = board_section_create_create_internal (
        id_local_str,
        name_local_str
        );

    if (!board_section_create_local_var) {
        goto end;
    }

    return board_section_create_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
