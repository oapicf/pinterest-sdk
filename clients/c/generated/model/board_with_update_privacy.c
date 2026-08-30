#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board_with_update_privacy.h"



static board_with_update_privacy_t *board_with_update_privacy_create_internal(
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
    int *pin_count,
    pinterest_rest_api_board_update_privacy__e privacy
    ) {
    board_with_update_privacy_t *board_with_update_privacy_local_var = malloc(sizeof(board_with_update_privacy_t));
    if (!board_with_update_privacy_local_var) {
        return NULL;
    }
    memset(board_with_update_privacy_local_var, 0, sizeof(board_with_update_privacy_t));
    board_with_update_privacy_local_var->_library_owned = 1;
    board_with_update_privacy_local_var->board_pins_modified_at = board_pins_modified_at;
    board_with_update_privacy_local_var->collaborator_count = collaborator_count;
    board_with_update_privacy_local_var->created_at = created_at;
    board_with_update_privacy_local_var->description = description;
    board_with_update_privacy_local_var->follower_count = follower_count;
    board_with_update_privacy_local_var->id = id;
    board_with_update_privacy_local_var->is_ads_only = is_ads_only;
    board_with_update_privacy_local_var->media = media;
    board_with_update_privacy_local_var->name = name;
    board_with_update_privacy_local_var->owner = owner;
    board_with_update_privacy_local_var->pin_count = pin_count;
    board_with_update_privacy_local_var->privacy = privacy;
    return board_with_update_privacy_local_var;
}

__attribute__((deprecated)) board_with_update_privacy_t *board_with_update_privacy_create(
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
    int *pin_count,
    pinterest_rest_api_board_update_privacy__e privacy
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
    board_with_update_privacy_t *result = board_with_update_privacy_create_internal (
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
        pin_count_copy,
        privacy
        );
    if (!result) {
        free(collaborator_count_copy);
        free(follower_count_copy);
        free(is_ads_only_copy);
        free(pin_count_copy);
    }
    return result;
}

void board_with_update_privacy_free(board_with_update_privacy_t *board_with_update_privacy) {
    if(NULL == board_with_update_privacy){
        return ;
    }
    if(board_with_update_privacy->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "board_with_update_privacy_free");
        return ;
    }
    listEntry_t *listEntry;
    if (board_with_update_privacy->board_pins_modified_at) {
        free(board_with_update_privacy->board_pins_modified_at);
        board_with_update_privacy->board_pins_modified_at = NULL;
    }
    if (board_with_update_privacy->collaborator_count) {
        free(board_with_update_privacy->collaborator_count);
        board_with_update_privacy->collaborator_count = NULL;
    }
    if (board_with_update_privacy->created_at) {
        free(board_with_update_privacy->created_at);
        board_with_update_privacy->created_at = NULL;
    }
    if (board_with_update_privacy->description) {
        free(board_with_update_privacy->description);
        board_with_update_privacy->description = NULL;
    }
    if (board_with_update_privacy->follower_count) {
        free(board_with_update_privacy->follower_count);
        board_with_update_privacy->follower_count = NULL;
    }
    if (board_with_update_privacy->id) {
        free(board_with_update_privacy->id);
        board_with_update_privacy->id = NULL;
    }
    if (board_with_update_privacy->is_ads_only) {
        free(board_with_update_privacy->is_ads_only);
        board_with_update_privacy->is_ads_only = NULL;
    }
    if (board_with_update_privacy->media) {
        board_media_free(board_with_update_privacy->media);
        board_with_update_privacy->media = NULL;
    }
    if (board_with_update_privacy->name) {
        free(board_with_update_privacy->name);
        board_with_update_privacy->name = NULL;
    }
    if (board_with_update_privacy->owner) {
        board_owner_free(board_with_update_privacy->owner);
        board_with_update_privacy->owner = NULL;
    }
    if (board_with_update_privacy->pin_count) {
        free(board_with_update_privacy->pin_count);
        board_with_update_privacy->pin_count = NULL;
    }
    free(board_with_update_privacy);
}

cJSON *board_with_update_privacy_convertToJSON(board_with_update_privacy_t *board_with_update_privacy) {
    cJSON *item = cJSON_CreateObject();

    // board_with_update_privacy->board_pins_modified_at
    if(board_with_update_privacy->board_pins_modified_at) {
    if(cJSON_AddStringToObject(item, "board_pins_modified_at", board_with_update_privacy->board_pins_modified_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board_with_update_privacy->collaborator_count
    if(board_with_update_privacy->collaborator_count) {
    if(cJSON_AddNumberToObject(item, "collaborator_count", *board_with_update_privacy->collaborator_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board_with_update_privacy->created_at
    if(board_with_update_privacy->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", board_with_update_privacy->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board_with_update_privacy->description
    if(board_with_update_privacy->description) {
    if(cJSON_AddStringToObject(item, "description", board_with_update_privacy->description) == NULL) {
    goto fail; //String
    }
    }


    // board_with_update_privacy->follower_count
    if(board_with_update_privacy->follower_count) {
    if(cJSON_AddNumberToObject(item, "follower_count", *board_with_update_privacy->follower_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board_with_update_privacy->id
    if (!board_with_update_privacy->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", board_with_update_privacy->id) == NULL) {
    goto fail; //String
    }


    // board_with_update_privacy->is_ads_only
    if(board_with_update_privacy->is_ads_only) {
    if(cJSON_AddBoolToObject(item, "is_ads_only", *board_with_update_privacy->is_ads_only) == NULL) {
    goto fail; //Bool
    }
    }


    // board_with_update_privacy->media
    if(board_with_update_privacy->media) {
    cJSON *media_local_JSON = board_media_convertToJSON(board_with_update_privacy->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // board_with_update_privacy->name
    if (!board_with_update_privacy->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board_with_update_privacy->name) == NULL) {
    goto fail; //String
    }


    // board_with_update_privacy->owner
    if(board_with_update_privacy->owner) {
    cJSON *owner_local_JSON = board_owner_convertToJSON(board_with_update_privacy->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // board_with_update_privacy->pin_count
    if(board_with_update_privacy->pin_count) {
    if(cJSON_AddNumberToObject(item, "pin_count", *board_with_update_privacy->pin_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board_with_update_privacy->privacy
    if(board_with_update_privacy->privacy != pinterest_rest_api_board_update_privacy__NULL) {
    cJSON *privacy_local_JSON = board_update_privacy_convertToJSON(board_with_update_privacy->privacy);
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

board_with_update_privacy_t *board_with_update_privacy_parseFromJSON(cJSON *board_with_update_privacyJSON){

    board_with_update_privacy_t *board_with_update_privacy_local_var = NULL;

    char *board_pins_modified_at_local_str = NULL;

    // define the local variable for board_with_update_privacy->collaborator_count
    int *collaborator_count_local_var = NULL;

    char *created_at_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for board_with_update_privacy->follower_count
    int *follower_count_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for board_with_update_privacy->is_ads_only
    int *is_ads_only_local_var = NULL;

    // define the local variable for board_with_update_privacy->media
    board_media_t *media_local_nonprim = NULL;

    char *name_local_str = NULL;

    // define the local variable for board_with_update_privacy->owner
    board_owner_t *owner_local_nonprim = NULL;

    // define the local variable for board_with_update_privacy->pin_count
    int *pin_count_local_var = NULL;

    // define the local variable for board_with_update_privacy->privacy
    pinterest_rest_api_board_update_privacy__e privacy_local_nonprim = 0;

    // board_with_update_privacy->board_pins_modified_at
    cJSON *board_pins_modified_at = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "board_pins_modified_at");
    if (cJSON_IsNull(board_pins_modified_at)) {
        board_pins_modified_at = NULL;
    }
    if (board_pins_modified_at) { 
    if(!cJSON_IsString(board_pins_modified_at) && !cJSON_IsNull(board_pins_modified_at))
    {
    goto end; //DateTime
    }
    }

    // board_with_update_privacy->collaborator_count
    cJSON *collaborator_count = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "collaborator_count");
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

    // board_with_update_privacy->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // board_with_update_privacy->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board_with_update_privacy->follower_count
    cJSON *follower_count = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "follower_count");
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

    // board_with_update_privacy->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "id");
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

    // board_with_update_privacy->is_ads_only
    cJSON *is_ads_only = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "is_ads_only");
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

    // board_with_update_privacy->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = board_media_parseFromJSON(media); //nonprimitive
    }

    // board_with_update_privacy->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "name");
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

    // board_with_update_privacy->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (owner) { 
    owner_local_nonprim = board_owner_parseFromJSON(owner); //nonprimitive
    }

    // board_with_update_privacy->pin_count
    cJSON *pin_count = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "pin_count");
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

    // board_with_update_privacy->privacy
    cJSON *privacy = cJSON_GetObjectItemCaseSensitive(board_with_update_privacyJSON, "privacy");
    if (cJSON_IsNull(privacy)) {
        privacy = NULL;
    }
    if (privacy) { 
    privacy_local_nonprim = board_update_privacy_parseFromJSON(privacy); //custom
    }


    if (board_pins_modified_at && !cJSON_IsNull(board_pins_modified_at)) board_pins_modified_at_local_str = strdup(board_pins_modified_at->valuestring);
    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    board_with_update_privacy_local_var = board_with_update_privacy_create_internal (
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
        pin_count_local_var,
        privacy ? privacy_local_nonprim : 0
        );

    if (!board_with_update_privacy_local_var) {
        goto end;
    }

    return board_with_update_privacy_local_var;
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
    if (privacy_local_nonprim) {
        privacy_local_nonprim = 0;
    }
    return NULL;

}
