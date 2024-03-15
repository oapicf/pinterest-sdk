/*
 * board_owner.h
 *
 * 
 */

#ifndef _board_owner_H_
#define _board_owner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_owner_t board_owner_t;




typedef struct board_owner_t {
    char *username; // string

} board_owner_t;

board_owner_t *board_owner_create(
    char *username
);

void board_owner_free(board_owner_t *board_owner);

board_owner_t *board_owner_parseFromJSON(cJSON *board_ownerJSON);

cJSON *board_owner_convertToJSON(board_owner_t *board_owner);

#endif /* _board_owner_H_ */

