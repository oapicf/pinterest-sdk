/*
 * board.h
 *
 * Board
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

// Enum PRIVACY for board

typedef enum  { pinterest_rest_api_board_PRIVACY_NULL = 0, pinterest_rest_api_board_PRIVACY__PUBLIC, pinterest_rest_api_board_PRIVACY__PROTECTED, pinterest_rest_api_board_PRIVACY_SECRET } pinterest_rest_api_board_PRIVACY_e;

char* board_privacy_ToString(pinterest_rest_api_board_PRIVACY_e privacy);

pinterest_rest_api_board_PRIVACY_e board_privacy_FromString(char* privacy);



typedef struct board_t {
    char *id; // string
    char *created_at; //date time
    char *board_pins_modified_at; //date time
    char *name; // string
    char *description; // string
    int collaborator_count; //numeric
    int pin_count; //numeric
    int follower_count; //numeric
    struct board_media_t *media; //model
    struct board_owner_t *owner; //model
    pinterest_rest_api_board_PRIVACY_e privacy; //enum

} board_t;

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
);

void board_free(board_t *board);

board_t *board_parseFromJSON(cJSON *boardJSON);

cJSON *board_convertToJSON(board_t *board);

#endif /* _board_H_ */

