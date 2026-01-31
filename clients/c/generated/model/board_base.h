/*
 * board_base.h
 *
 * 
 */

#ifndef _board_base_H_
#define _board_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_base_t board_base_t;

#include "board_media.h"
#include "board_owner.h"



typedef struct board_base_t {
    char *board_pins_modified_at; //date time
    int collaborator_count; //numeric
    char *created_at; //date time
    char *description; // string
    int follower_count; //numeric
    char *id; // string
    int is_ads_only; //boolean
    struct board_media_t *media; //model
    char *name; // string
    struct board_owner_t *owner; //model
    int pin_count; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} board_base_t;

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
);

void board_base_free(board_base_t *board_base);

board_base_t *board_base_parseFromJSON(cJSON *board_baseJSON);

cJSON *board_base_convertToJSON(board_base_t *board_base);

#endif /* _board_base_H_ */

