#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "board.h"


char* board_privacy_ToString(pinterest_rest_api_board_PRIVACY_e privacy) {
    char* privacyArray[] =  { "NULL", "PUBLIC", "PROTECTED", "SECRET" };
    return privacyArray[privacy];
}

pinterest_rest_api_board_PRIVACY_e board_privacy_FromString(char* privacy){
    int stringToReturn = 0;
    char *privacyArray[] =  { "NULL", "PUBLIC", "PROTECTED", "SECRET" };
    size_t sizeofArray = sizeof(privacyArray) / sizeof(privacyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(privacy, privacyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

board_t *board_create(
    char *id,
    char *created_at,
    char *board_pins_modified_at,
    char *name,
    char *description,
    int collaborator_count,
    int pin_count,
    int follower_count,
    board_media_t *media,
    board_owner_t *owner,
    pinterest_rest_api_board_PRIVACY_e privacy
    ) {
    board_t *board_local_var = malloc(sizeof(board_t));
    if (!board_local_var) {
        return NULL;
    }
    board_local_var->id = id;
    board_local_var->created_at = created_at;
    board_local_var->board_pins_modified_at = board_pins_modified_at;
    board_local_var->name = name;
    board_local_var->description = description;
    board_local_var->collaborator_count = collaborator_count;
    board_local_var->pin_count = pin_count;
    board_local_var->follower_count = follower_count;
    board_local_var->media = media;
    board_local_var->owner = owner;
    board_local_var->privacy = privacy;

    return board_local_var;
}


void board_free(board_t *board) {
    if(NULL == board){
        return ;
    }
    listEntry_t *listEntry;
    if (board->id) {
        free(board->id);
        board->id = NULL;
    }
    if (board->created_at) {
        free(board->created_at);
        board->created_at = NULL;
    }
    if (board->board_pins_modified_at) {
        free(board->board_pins_modified_at);
        board->board_pins_modified_at = NULL;
    }
    if (board->name) {
        free(board->name);
        board->name = NULL;
    }
    if (board->description) {
        free(board->description);
        board->description = NULL;
    }
    if (board->media) {
        board_media_free(board->media);
        board->media = NULL;
    }
    if (board->owner) {
        board_owner_free(board->owner);
        board->owner = NULL;
    }
    free(board);
}

cJSON *board_convertToJSON(board_t *board) {
    cJSON *item = cJSON_CreateObject();

    // board->id
    if(board->id) {
    if(cJSON_AddStringToObject(item, "id", board->id) == NULL) {
    goto fail; //String
    }
    }


    // board->created_at
    if(board->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", board->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board->board_pins_modified_at
    if(board->board_pins_modified_at) {
    if(cJSON_AddStringToObject(item, "board_pins_modified_at", board->board_pins_modified_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // board->name
    if (!board->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", board->name) == NULL) {
    goto fail; //String
    }


    // board->description
    if(board->description) {
    if(cJSON_AddStringToObject(item, "description", board->description) == NULL) {
    goto fail; //String
    }
    }


    // board->collaborator_count
    if(board->collaborator_count) {
    if(cJSON_AddNumberToObject(item, "collaborator_count", board->collaborator_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board->pin_count
    if(board->pin_count) {
    if(cJSON_AddNumberToObject(item, "pin_count", board->pin_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // board->follower_count
    if(board->follower_count) {
    if(cJSON_AddNumberToObject(item, "follower_count", board->follower_count) == NULL) {
    goto fail; //Numeric
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


    // board->privacy
    if(board->privacy != pinterest_rest_api_board_PRIVACY_NULL) {
    if(cJSON_AddStringToObject(item, "privacy", privacyboard_ToString(board->privacy)) == NULL)
    {
    goto fail; //Enum
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

    // board->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(boardJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // board->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(boardJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // board->board_pins_modified_at
    cJSON *board_pins_modified_at = cJSON_GetObjectItemCaseSensitive(boardJSON, "board_pins_modified_at");
    if (board_pins_modified_at) { 
    if(!cJSON_IsString(board_pins_modified_at) && !cJSON_IsNull(board_pins_modified_at))
    {
    goto end; //DateTime
    }
    }

    // board->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(boardJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // board->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(boardJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // board->collaborator_count
    cJSON *collaborator_count = cJSON_GetObjectItemCaseSensitive(boardJSON, "collaborator_count");
    if (collaborator_count) { 
    if(!cJSON_IsNumber(collaborator_count))
    {
    goto end; //Numeric
    }
    }

    // board->pin_count
    cJSON *pin_count = cJSON_GetObjectItemCaseSensitive(boardJSON, "pin_count");
    if (pin_count) { 
    if(!cJSON_IsNumber(pin_count))
    {
    goto end; //Numeric
    }
    }

    // board->follower_count
    cJSON *follower_count = cJSON_GetObjectItemCaseSensitive(boardJSON, "follower_count");
    if (follower_count) { 
    if(!cJSON_IsNumber(follower_count))
    {
    goto end; //Numeric
    }
    }

    // board->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(boardJSON, "media");
    if (media) { 
    media_local_nonprim = board_media_parseFromJSON(media); //nonprimitive
    }

    // board->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(boardJSON, "owner");
    if (owner) { 
    owner_local_nonprim = board_owner_parseFromJSON(owner); //nonprimitive
    }

    // board->privacy
    cJSON *privacy = cJSON_GetObjectItemCaseSensitive(boardJSON, "privacy");
    pinterest_rest_api_board_PRIVACY_e privacyVariable;
    if (privacy) { 
    if(!cJSON_IsString(privacy))
    {
    goto end; //Enum
    }
    privacyVariable = board_privacy_FromString(privacy->valuestring);
    }


    board_local_var = board_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        board_pins_modified_at && !cJSON_IsNull(board_pins_modified_at) ? strdup(board_pins_modified_at->valuestring) : NULL,
        strdup(name->valuestring),
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        collaborator_count ? collaborator_count->valuedouble : 0,
        pin_count ? pin_count->valuedouble : 0,
        follower_count ? follower_count->valuedouble : 0,
        media ? media_local_nonprim : NULL,
        owner ? owner_local_nonprim : NULL,
        privacy ? privacyVariable : pinterest_rest_api_board_PRIVACY_NULL
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
    return NULL;

}
