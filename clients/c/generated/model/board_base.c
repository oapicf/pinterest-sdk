#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_base.h"



static board_base_t *board_base_create_internal(
    char *board_pins_modified_at,
    int *collaborator_count,
    char *created_at,
    char *description,
    int *follower_count,
    char *id,
    int *is_ads_only,
    board_media_t *media,
    char *name,
    board_owner_t *owner,
    int *pin_count
    ) {
    board_base_t *board_base_local_var = malloc(sizeof(board_base_t));
    if (!board_base_local_var) {
        return NULL;
    }
    memset(board_base_local_var, 0, sizeof(board_base_t));
    board_base_local_var->_library_owned = 1;
    board_base_local_var->board_pins_modified_at = board_pins_modified_at;
    board_base_local_var->collaborator_count = collaborator_count;
    board_base_local_var->created_at = created_at;
    board_base_local_var->description = description;
    board_base_local_var->follower_count = follower_count;
    board_base_local_var->id = id;
    board_base_local_var->is_ads_only = is_ads_only;
    board_base_local_var->media = media;
    board_base_local_var->name = name;
    board_base_local_var->owner = owner;
    board_base_local_var->pin_count = pin_count;
    return board_base_local_var;
}

__attribute__((deprecated)) board_base_t *board_base_create(
    char *board_pins_modified_at,
    int *collaborator_count,
    char *created_at,
    char *description,
    int *follower_count,
    char *id,
    int *is_ads_only,
    board_media_t *media,
    char *name,
    board_owner_t *owner,
    int *pin_count
    ) {
    int *collaborator_count_copy = NULL;
    if (collaborator_count) {
        collaborator_count_copy = malloc(sizeof(int));
        if (collaborator_count_copy) *collaborator_count_copy = *collaborator_count;
    }
    int *follower_count_copy = NULL;
    if (follower_count) {
        follower_count_copy = malloc(sizeof(int));
        if (follower_count_copy) *follower_count_copy = *follower_count;
    }
    int *is_ads_only_copy = NULL;
    if (is_ads_only) {
        is_ads_only_copy = malloc(sizeof(int));
        if (is_ads_only_copy) *is_ads_only_copy = *is_ads_only;
    }
    int *pin_count_copy = NULL;
    if (pin_count) {
        pin_count_copy = malloc(sizeof(int));
        if (pin_count_copy) *pin_count_copy = *pin_count;
    }
    board_base_t *result = board_base_create_internal (
        board_pins_modified_at,
        collaborator_count_copy,
        created_at,
        description,
        follower_count_copy,
        id,
        is_ads_only_copy,
        media,
        name,
        owner,
        pin_count_copy
        );
    if (!result) {
        free(collaborator_count_copy);
        free(follower_count_copy);
        free(is_ads_only_copy);
        free(pin_count_copy);
    }
    return result;
}

void board_base_free(board_base_t *board_base) {
    if(NULL == board_base){
        return ;
    }
    if(board_base->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_base_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_base->board_pins_modified_at) {
        free(board_base->board_pins_modified_at);
        board_base->board_pins_modified_at = NULL;
    }
    if (board_base->collaborator_count) {
        free(board_base->collaborator_count);
        board_base->collaborator_count = NULL;
    }
    if (board_base->created_at) {
        free(board_base->created_at);
        board_base->created_at = NULL;
    }
    if (board_base->description) {
        free(board_base->description);
        board_base->description = NULL;
    }
    if (board_base->follower_count) {
        free(board_base->follower_count);
        board_base->follower_count = NULL;
    }
    if (board_base->id) {
        free(board_base->id);
        board_base->id = NULL;
    }
    if (board_base->is_ads_only) {
        free(board_base->is_ads_only);
        board_base->is_ads_only = NULL;
    }
    if (board_base->media) {
        board_media_free(board_base->media);
        board_base->media = NULL;
    }
    if (board_base->name) {
        free(board_base->name);
        board_base->name = NULL;
    }
    if (board_base->owner) {
        board_owner_free(board_base->owner);
        board_base->owner = NULL;
    }
    if (board_base->pin_count) {
        free(board_base->pin_count);
        board_base->pin_count = NULL;
    }
    free(board_base);
}

cJSON *board_base_convertToJSON(board_base_t *board_base) {
    cJSON *item = cJSON_CreateObject();

    // board_base->board_pins_modified_at
    if(board_base->board_pins_modified_at) {
    if(cJSON_AddStringToObject(item, "board_pins_modified_at", board_base->board_pins_modified_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board_base->collaborator_count
    if(board_base->collaborator_count) {
    if(cJSON_AddNumberToObject(item, "collaborator_count", *board_base->collaborator_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board_base->created_at
    if(board_base->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", board_base->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board_base->description
    if(board_base->description) {
    if(cJSON_AddStringToObject(item, "description", board_base->description) == NULL) {
    goto fail; //String
    }
    }


    // board_base->follower_count
    if(board_base->follower_count) {
    if(cJSON_AddNumberToObject(item, "follower_count", *board_base->follower_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board_base->id
    if (!board_base->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", board_base->id) == NULL) {
    goto fail; //String
    }


    // board_base->is_ads_only
    if(board_base->is_ads_only) {
    if(cJSON_AddBoolToObject(item, "is_ads_only", *board_base->is_ads_only) == NULL) {
    goto fail; //Bool
    }
    }


    // board_base->media
    if(board_base->media) {
    cJSON *media_local_JSON = board_media_convertToJSON(board_base->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // board_base->name
    if (!board_base->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board_base->name) == NULL) {
    goto fail; //String
    }


    // board_base->owner
    if(board_base->owner) {
    cJSON *owner_local_JSON = board_owner_convertToJSON(board_base->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // board_base->pin_count
    if(board_base->pin_count) {
    if(cJSON_AddNumberToObject(item, "pin_count", *board_base->pin_count) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

board_base_t *board_base_parseFromJSON(cJSON *board_baseJSON){

    board_base_t *board_base_local_var = NULL;

    char *board_pins_modified_at_local_str = NULL;

    // define the local variable for board_base->collaborator_count
    int *collaborator_count_local_var = NULL;

    char *created_at_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for board_base->follower_count
    int *follower_count_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for board_base->is_ads_only
    int *is_ads_only_local_var = NULL;

    // define the local variable for board_base->media
    board_media_t *media_local_nonprim = NULL;

    char *name_local_str = NULL;

    // define the local variable for board_base->owner
    board_owner_t *owner_local_nonprim = NULL;

    // define the local variable for board_base->pin_count
    int *pin_count_local_var = NULL;

    // board_base->board_pins_modified_at
    cJSON *board_pins_modified_at = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "board_pins_modified_at");
    if (cJSON_IsNull(board_pins_modified_at)) {
        board_pins_modified_at = NULL;
    }
    if (board_pins_modified_at) { 
    if(!cJSON_IsString(board_pins_modified_at) && !cJSON_IsNull(board_pins_modified_at))
    {
    goto end; //DateTime
    }
    }

    // board_base->collaborator_count
    cJSON *collaborator_count = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "collaborator_count");
    if (cJSON_IsNull(collaborator_count)) {
        collaborator_count = NULL;
    }
    if (collaborator_count) { 
    if(!cJSON_IsNumber(collaborator_count))
    {
    goto end; //Numeric
    }
    collaborator_count_local_var = malloc(sizeof(int));
    if(!collaborator_count_local_var)
    {
        goto end;
    }
    *collaborator_count_local_var = collaborator_count->valuedouble;
    }

    // board_base->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // board_base->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board_base->follower_count
    cJSON *follower_count = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "follower_count");
    if (cJSON_IsNull(follower_count)) {
        follower_count = NULL;
    }
    if (follower_count) { 
    if(!cJSON_IsNumber(follower_count))
    {
    goto end; //Numeric
    }
    follower_count_local_var = malloc(sizeof(int));
    if(!follower_count_local_var)
    {
        goto end;
    }
    *follower_count_local_var = follower_count->valuedouble;
    }

    // board_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // board_base->is_ads_only
    cJSON *is_ads_only = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "is_ads_only");
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

    // board_base->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = board_media_parseFromJSON(media); //nonprimitive
    }

    // board_base->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "name");
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

    // board_base->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (owner) { 
    owner_local_nonprim = board_owner_parseFromJSON(owner); //nonprimitive
    }

    // board_base->pin_count
    cJSON *pin_count = cJSON_GetObjectItemCaseSensitive(board_baseJSON, "pin_count");
    if (cJSON_IsNull(pin_count)) {
        pin_count = NULL;
    }
    if (pin_count) { 
    if(!cJSON_IsNumber(pin_count))
    {
    goto end; //Numeric
    }
    pin_count_local_var = malloc(sizeof(int));
    if(!pin_count_local_var)
    {
        goto end;
    }
    *pin_count_local_var = pin_count->valuedouble;
    }


    if (board_pins_modified_at && !cJSON_IsNull(board_pins_modified_at)) board_pins_modified_at_local_str = strdup(board_pins_modified_at->valuestring);
    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    board_base_local_var = board_base_create_internal (
        board_pins_modified_at_local_str,
        collaborator_count_local_var,
        created_at_local_str,
        description_local_str,
        follower_count_local_var,
        id_local_str,
        is_ads_only_local_var,
        media ? media_local_nonprim : NULL,
        name_local_str,
        owner ? owner_local_nonprim : NULL,
        pin_count_local_var
        );

    if (!board_base_local_var) {
        goto end;
    }

    return board_base_local_var;
end:
    if (board_pins_modified_at_local_str) {
        free(board_pins_modified_at_local_str);
        board_pins_modified_at_local_str = NULL;
    }
    if (collaborator_count_local_var) {
        free(collaborator_count_local_var);
        collaborator_count_local_var = NULL;
    }
    if (created_at_local_str) {
        free(created_at_local_str);
        created_at_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (follower_count_local_var) {
        free(follower_count_local_var);
        follower_count_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (is_ads_only_local_var) {
        free(is_ads_only_local_var);
        is_ads_only_local_var = NULL;
    }
    if (media_local_nonprim) {
        board_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (owner_local_nonprim) {
        board_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    if (pin_count_local_var) {
        free(pin_count_local_var);
        pin_count_local_var = NULL;
    }
    return NULL;

}
