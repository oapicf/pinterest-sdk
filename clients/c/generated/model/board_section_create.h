/*
 * board_section_create.h
 *
 * Resource create operation model.
 */

#ifndef _board_section_create_H_
#define _board_section_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_section_create_t board_section_create_t;




typedef struct board_section_create_t {
    char *id; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} board_section_create_t;

__attribute__((deprecated)) board_section_create_t *board_section_create_create(
    char *id,
    char *name
);

void board_section_create_free(board_section_create_t *board_section_create);

board_section_create_t *board_section_create_parseFromJSON(cJSON *board_section_createJSON);

cJSON *board_section_create_convertToJSON(board_section_create_t *board_section_create);

#endif /* _board_section_create_H_ */

