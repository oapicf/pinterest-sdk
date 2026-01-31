#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board.h"



static board_t *board_create_internal(
    char *board_pins_modified_at,
    int collaborator_count,
    char *created_at,
    char *description,
    int follower_count,
    char *id,
    int is_ads_only,
    board_media_t *media,
    char *name,
    board_owner_t *owner,
    int pin_count,
    board_privacy_t *privacy
    ) {
    board_t *board_local_var = malloc(sizeof(board_t));
    if (!board_local_var) {
        return NULL;
    }
    board_local_var->board_pins_modified_at = board_pins_modified_at;
    board_local_var->collaborator_count = collaborator_count;
    board_local_var->created_at = created_at;
    board_local_var->description = description;
    board_local_var->follower_count = follower_count;
    board_local_var->id = id;
    board_local_var->is_ads_only = is_ads_only;
    board_local_var->media = media;
    board_local_var->name = name;
    board_local_var->owner = owner;
    board_local_var->pin_count = pin_count;
    board_local_var->privacy = privacy;

    board_local_var->_library_owned = 1;
    return board_local_var;
}

__attribute__((deprecated)) board_t *board_create(
    char *board_pins_modified_at,
    int collaborator_count,
    char *created_at,
    char *description,
    int follower_count,
    char *id,
    int is_ads_only,
    board_media_t *media,
    char *name,
    board_owner_t *owner,
    int pin_count,
    board_privacy_t *privacy
    ) {
    return board_create_internal (
        board_pins_modified_at,
        collaborator_count,
        created_at,
        description,
        follower_count,
        id,
        is_ads_only,
        media,
        name,
        owner,
        pin_count,
        privacy
        );
}

void board_free(board_t *board) {
    if(NULL == board){
        return ;
    }
    if(board->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board->board_pins_modified_at) {
        free(board->board_pins_modified_at);
        board->board_pins_modified_at = NULL;
    }
    if (board->created_at) {
        free(board->created_at);
        board->created_at = NULL;
    }
    if (board->description) {
        free(board->description);
        board->description = NULL;
    }
    if (board->id) {
        free(board->id);
        board->id = NULL;
    }
    if (board->media) {
        board_media_free(board->media);
        board->media = NULL;
    }
    if (board->name) {
        free(board->name);
        board->name = NULL;
    }
    if (board->owner) {
        board_owner_free(board->owner);
        board->owner = NULL;
    }
    if (board->privacy) {
        board_privacy_free(board->privacy);
        board->privacy = NULL;
    }
    free(board);
}

cJSON *board_convertToJSON(board_t *board) {
    cJSON *item = cJSON_CreateObject();

    // board->board_pins_modified_at
    if(board->board_pins_modified_at) {
    if(cJSON_AddStringToObject(item, "board_pins_modified_at", board->board_pins_modified_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board->collaborator_count
    if(board->collaborator_count) {
    if(cJSON_AddNumberToObject(item, "collaborator_count", board->collaborator_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board->created_at
    if(board->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", board->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board->description
    if(board->description) {
    if(cJSON_AddStringToObject(item, "description", board->description) == NULL) {
    goto fail; //String
    }
    }


    // board->follower_count
    if(board->follower_count) {
    if(cJSON_AddNumberToObject(item, "follower_count", board->follower_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board->id
    if (!board->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", board->id) == NULL) {
    goto fail; //String
    }


    // board->is_ads_only
    if(board->is_ads_only) {
    if(cJSON_AddBoolToObject(item, "is_ads_only", board->is_ads_only) == NULL) {
    goto fail; //Bool
    }
    }


    // board->media
    if(board->media) {
    cJSON *media_local_JSON = board_media_convertToJSON(board->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // board->name
    if (!board->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board->name) == NULL) {
    goto fail; //String
    }


    // board->owner
    if(board->owner) {
    cJSON *owner_local_JSON = board_owner_convertToJSON(board->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // board->pin_count
    if(board->pin_count) {
    if(cJSON_AddNumberToObject(item, "pin_count", board->pin_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board->privacy
    if(board->privacy) {
    cJSON *privacy_local_JSON = board_privacy_convertToJSON(board->privacy);
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

board_t *board_parseFromJSON(cJSON *boardJSON){

    board_t *board_local_var = NULL;

    // define the local variable for board->media
    board_media_t *media_local_nonprim = NULL;

    // define the local variable for board->owner
    board_owner_t *owner_local_nonprim = NULL;

    // define the local variable for board->privacy
    board_privacy_t *privacy_local_nonprim = NULL;

    // board->board_pins_modified_at
    cJSON *board_pins_modified_at = cJSON_GetObjectItemCaseSensitive(boardJSON, "board_pins_modified_at");
    if (cJSON_IsNull(board_pins_modified_at)) {
        board_pins_modified_at = NULL;
    }
    if (board_pins_modified_at) { 
    if(!cJSON_IsString(board_pins_modified_at) && !cJSON_IsNull(board_pins_modified_at))
    {
    goto end; //DateTime
    }
    }

    // board->collaborator_count
    cJSON *collaborator_count = cJSON_GetObjectItemCaseSensitive(boardJSON, "collaborator_count");
    if (cJSON_IsNull(collaborator_count)) {
        collaborator_count = NULL;
    }
    if (collaborator_count) { 
    if(!cJSON_IsNumber(collaborator_count))
    {
    goto end; //Numeric
    }
    }

    // board->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(boardJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // board->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(boardJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board->follower_count
    cJSON *follower_count = cJSON_GetObjectItemCaseSensitive(boardJSON, "follower_count");
    if (cJSON_IsNull(follower_count)) {
        follower_count = NULL;
    }
    if (follower_count) { 
    if(!cJSON_IsNumber(follower_count))
    {
    goto end; //Numeric
    }
    }

    // board->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(boardJSON, "id");
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

    // board->is_ads_only
    cJSON *is_ads_only = cJSON_GetObjectItemCaseSensitive(boardJSON, "is_ads_only");
    if (cJSON_IsNull(is_ads_only)) {
        is_ads_only = NULL;
    }
    if (is_ads_only) { 
    if(!cJSON_IsBool(is_ads_only))
    {
    goto end; //Bool
    }
    }

    // board->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(boardJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = board_media_parseFromJSON(media); //nonprimitive
    }

    // board->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(boardJSON, "name");
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

    // board->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(boardJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (owner) { 
    owner_local_nonprim = board_owner_parseFromJSON(owner); //nonprimitive
    }

    // board->pin_count
    cJSON *pin_count = cJSON_GetObjectItemCaseSensitive(boardJSON, "pin_count");
    if (cJSON_IsNull(pin_count)) {
        pin_count = NULL;
    }
    if (pin_count) { 
    if(!cJSON_IsNumber(pin_count))
    {
    goto end; //Numeric
    }
    }

    // board->privacy
    cJSON *privacy = cJSON_GetObjectItemCaseSensitive(boardJSON, "privacy");
    if (cJSON_IsNull(privacy)) {
        privacy = NULL;
    }
    if (privacy) { 
    privacy_local_nonprim = board_privacy_parseFromJSON(privacy); //custom
    }


    board_local_var = board_create_internal (
        board_pins_modified_at && !cJSON_IsNull(board_pins_modified_at) ? strdup(board_pins_modified_at->valuestring) : NULL,
        collaborator_count ? collaborator_count->valuedouble : 0,
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        follower_count ? follower_count->valuedouble : 0,
        strdup(id->valuestring),
        is_ads_only ? is_ads_only->valueint : 0,
        media ? media_local_nonprim : NULL,
        strdup(name->valuestring),
        owner ? owner_local_nonprim : NULL,
        pin_count ? pin_count->valuedouble : 0,
        privacy ? privacy_local_nonprim : NULL
        );

    return board_local_var;
end:
    if (media_local_nonprim) {
        board_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (owner_local_nonprim) {
        board_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    if (privacy_local_nonprim) {
        board_privacy_free(privacy_local_nonprim);
        privacy_local_nonprim = NULL;
    }
    return NULL;

}
