#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_section.h"



static board_section_t *board_section_create_internal(
    char *id,
    char *name
    ) {
    board_section_t *board_section_local_var = malloc(sizeof(board_section_t));
    if (!board_section_local_var) {
        return NULL;
    }
    board_section_local_var->id = id;
    board_section_local_var->name = name;

    board_section_local_var->_library_owned = 1;
    return board_section_local_var;
}

__attribute__((deprecated)) board_section_t *board_section_create(
    char *id,
    char *name
    ) {
    return board_section_create_internal (
        id,
        name
        );
}

void board_section_free(board_section_t *board_section) {
    if(NULL == board_section){
        return ;
    }
    if(board_section->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_section_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_section->id) {
        free(board_section->id);
        board_section->id = NULL;
    }
    if (board_section->name) {
        free(board_section->name);
        board_section->name = NULL;
    }
    free(board_section);
}

cJSON *board_section_convertToJSON(board_section_t *board_section) {
    cJSON *item = cJSON_CreateObject();

    // board_section->id
    if(board_section->id) {
    if(cJSON_AddStringToObject(item, "id", board_section->id) == NULL) {
    goto fail; //String
    }
    }


    // board_section->name
    if (!board_section->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board_section->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

board_section_t *board_section_parseFromJSON(cJSON *board_sectionJSON){

    board_section_t *board_section_local_var = NULL;

    // board_section->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(board_sectionJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // board_section->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_sectionJSON, "name");
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


    board_section_local_var = board_section_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        strdup(name->valuestring)
        );

    return board_section_local_var;
end:
    return NULL;

}
