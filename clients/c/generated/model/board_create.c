#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_create.h"



static board_create_t *board_create_create_internal(
    char *description,
    int *is_ads_only,
    char *name,
    board_privacy_t *privacy
    ) {
    board_create_t *board_create_local_var = malloc(sizeof(board_create_t));
    if (!board_create_local_var) {
        return NULL;
    }
    memset(board_create_local_var, 0, sizeof(board_create_t));
    board_create_local_var->_library_owned = 1;
    board_create_local_var->description = description;
    board_create_local_var->is_ads_only = is_ads_only;
    board_create_local_var->name = name;
    board_create_local_var->privacy = privacy;
    return board_create_local_var;
}

__attribute__((deprecated)) board_create_t *board_create_create(
    char *description,
    int *is_ads_only,
    char *name,
    board_privacy_t *privacy
    ) {
    int *is_ads_only_copy = NULL;
    if (is_ads_only) {
        is_ads_only_copy = malloc(sizeof(int));
        if (is_ads_only_copy) *is_ads_only_copy = *is_ads_only;
    }
    board_create_t *result = board_create_create_internal (
        description,
        is_ads_only_copy,
        name,
        privacy
        );
    if (!result) {
        free(is_ads_only_copy);
    }
    return result;
}

void board_create_free(board_create_t *board_create) {
    if(NULL == board_create){
        return ;
    }
    if(board_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_create->description) {
        free(board_create->description);
        board_create->description = NULL;
    }
    if (board_create->is_ads_only) {
        free(board_create->is_ads_only);
        board_create->is_ads_only = NULL;
    }
    if (board_create->name) {
        free(board_create->name);
        board_create->name = NULL;
    }
    if (board_create->privacy) {
        board_privacy_free(board_create->privacy);
        board_create->privacy = NULL;
    }
    free(board_create);
}

cJSON *board_create_convertToJSON(board_create_t *board_create) {
    cJSON *item = cJSON_CreateObject();

    // board_create->description
    if(board_create->description) {
    if(cJSON_AddStringToObject(item, "description", board_create->description) == NULL) {
    goto fail; //String
    }
    }


    // board_create->is_ads_only
    if(board_create->is_ads_only) {
    if(cJSON_AddBoolToObject(item, "is_ads_only", *board_create->is_ads_only) == NULL) {
    goto fail; //Bool
    }
    }


    // board_create->name
    if (!board_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board_create->name) == NULL) {
    goto fail; //String
    }


    // board_create->privacy
    if(board_create->privacy) {
    cJSON *privacy_local_JSON = board_privacy_convertToJSON(board_create->privacy);
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

board_create_t *board_create_parseFromJSON(cJSON *board_createJSON){

    board_create_t *board_create_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for board_create->is_ads_only
    int *is_ads_only_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for board_create->privacy
    board_privacy_t *privacy_local_nonprim = NULL;

    // board_create->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(board_createJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board_create->is_ads_only
    cJSON *is_ads_only = cJSON_GetObjectItemCaseSensitive(board_createJSON, "is_ads_only");
    if (cJSON_IsNull(is_ads_only)) {
        is_ads_only = NULL;
    }
    if (is_ads_only) { 
    if(!cJSON_IsBool(is_ads_only))
    {
    goto end; //Bool
    }
    is_ads_only_local_var = malloc(sizeof(int));
    if(!is_ads_only_local_var)
    {
        goto end;
    }
    *is_ads_only_local_var = is_ads_only->valueint;
    }

    // board_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_createJSON, "name");
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

    // board_create->privacy
    cJSON *privacy = cJSON_GetObjectItemCaseSensitive(board_createJSON, "privacy");
    if (cJSON_IsNull(privacy)) {
        privacy = NULL;
    }
    if (privacy) { 
    privacy_local_nonprim = board_privacy_parseFromJSON(privacy); //custom
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    board_create_local_var = board_create_create_internal (
        description_local_str,
        is_ads_only_local_var,
        name_local_str,
        privacy ? privacy_local_nonprim : NULL
        );

    if (!board_create_local_var) {
        goto end;
    }

    return board_create_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (is_ads_only_local_var) {
        free(is_ads_only_local_var);
        is_ads_only_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (privacy_local_nonprim) {
        board_privacy_free(privacy_local_nonprim);
        privacy_local_nonprim = NULL;
    }
    return NULL;

}
