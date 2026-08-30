/*
 * board_with_update_privacy.h
 *
 * 
 */

#ifndef _board_with_update_privacy_H_
#define _board_with_update_privacy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_with_update_privacy_t board_with_update_privacy_t;

#include "board_media.h"
#include "board_owner.h"
#include "board_update_privacy.h"



typedef struct board_with_update_privacy_t {
    char *board_pins_modified_at; //date time
    int *collaborator_count; //numeric
    char *created_at; //date time
    char *description; // string
    int *follower_count; //numeric
    char *id; // string
    int *is_ads_only; //boolean
    struct board_media_t *media; //model
    char *name; // string
    struct board_owner_t *owner; //model
    int *pin_count; //numeric
    pinterest_rest_api_board_update_privacy__e privacy; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} board_with_update_privacy_t;

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
);

void board_with_update_privacy_free(board_with_update_privacy_t *board_with_update_privacy);

board_with_update_privacy_t *board_with_update_privacy_parseFromJSON(cJSON *board_with_update_privacyJSON);

cJSON *board_with_update_privacy_convertToJSON(board_with_update_privacy_t *board_with_update_privacy);

#endif /* _board_with_update_privacy_H_ */

