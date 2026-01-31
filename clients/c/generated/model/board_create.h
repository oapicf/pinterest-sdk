/*
 * board_create.h
 *
 * Resource create operation model.
 */

#ifndef _board_create_H_
#define _board_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_create_t board_create_t;

#include "board_privacy.h"



typedef struct board_create_t {
    char *description; // string
    int is_ads_only; //boolean
    char *name; // string
    board_privacy_t *privacy; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} board_create_t;

__attribute__((deprecated)) board_create_t *board_create_create(
    char *description,
    int is_ads_only,
    char *name,
    board_privacy_t *privacy
);

void board_create_free(board_create_t *board_create);

board_create_t *board_create_parseFromJSON(cJSON *board_createJSON);

cJSON *board_create_convertToJSON(board_create_t *board_create);

#endif /* _board_create_H_ */

