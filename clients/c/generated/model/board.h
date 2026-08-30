/*
 * board.h
 *
 * 
 */

#ifndef _board_H_
#define _board_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_t board_t;

#include "board_media.h"
#include "board_owner.h"
#include "board_privacy.h"



typedef struct board_t {
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
    board_privacy_t *privacy; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} board_t;

__attribute__((deprecated)) board_t *board_create(
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
    board_privacy_t *privacy
);

void board_free(board_t *board);

board_t *board_parseFromJSON(cJSON *boardJSON);

cJSON *board_convertToJSON(board_t *board);

#endif /* _board_H_ */

