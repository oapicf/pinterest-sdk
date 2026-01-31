/*
 * board_with_update_privacy_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _board_with_update_privacy_update_H_
#define _board_with_update_privacy_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_with_update_privacy_update_t board_with_update_privacy_update_t;

#include "board_update_privacy.h"



typedef struct board_with_update_privacy_update_t {
    char *description; // string
    char *name; // string
    pinterest_rest_api_board_update_privacy__e privacy; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} board_with_update_privacy_update_t;

__attribute__((deprecated)) board_with_update_privacy_update_t *board_with_update_privacy_update_create(
    char *description,
    char *name,
    pinterest_rest_api_board_update_privacy__e privacy
);

void board_with_update_privacy_update_free(board_with_update_privacy_update_t *board_with_update_privacy_update);

board_with_update_privacy_update_t *board_with_update_privacy_update_parseFromJSON(cJSON *board_with_update_privacy_updateJSON);

cJSON *board_with_update_privacy_update_convertToJSON(board_with_update_privacy_update_t *board_with_update_privacy_update);

#endif /* _board_with_update_privacy_update_H_ */

