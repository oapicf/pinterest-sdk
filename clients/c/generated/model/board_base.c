#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_base.h"



static board_base_t *board_base_create_internal(
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
    int pin_count
    ) {
    board_base_t *board_base_local_var = malloc(sizeof(board_base_t));
    if (!board_base_local_var) {
        return NULL;
    }
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

    board_base_local_var->_library_owned = 1;
    return board_base_local_var;
}

__attribute__((deprecated)) board_base_t *board_base_create(
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
    int pin_count
    ) {
    return board_base_create_internal (
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
        pin_count
        );
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
    if (board_base->created_at) {
        free(board_base->created_at);
        board_base->created_at = NULL;
    }
    if (board_base->description) {
        free(board_base->description);
        board_base->description = NULL;
    }
    if (board_base->id) {
        free(board_base->id);
        board_base->id = NULL;
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
    if(cJSON_AddNumberToObject(item, "collaborator_count", board_base->collaborator_count) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "follower_count", board_base->follower_count) == NULL) {
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
    if(cJSON_AddBoolToObject(item, "is_ads_only", board_base->is_ads_only) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "pin_count", board_base->pin_count) == NULL) {
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

    // define the local variable for board_base->media
    board_media_t *media_local_nonprim = NULL;

    // define the local variable for board_base->owner
    board_owner_t *owner_local_nonprim = NULL;

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
    }


    board_base_local_var = board_base_create_internal (
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
        pin_count ? pin_count->valuedouble : 0
        );

    return board_base_local_var;
end:
    if (media_local_nonprim) {
        board_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (owner_local_nonprim) {
        board_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    return NULL;

}
