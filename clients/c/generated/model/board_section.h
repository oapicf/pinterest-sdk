/*
 * board_section.h
 *
 * Sections help organize pins within a board.
 */

#ifndef _board_section_H_
#define _board_section_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_section_t board_section_t;




typedef struct board_section_t {
    char *id; // string
    char *name; // string

} board_section_t;

board_section_t *board_section_create(
    char *id,
    char *name
);

void board_section_free(board_section_t *board_section);

board_section_t *board_section_parseFromJSON(cJSON *board_sectionJSON);

cJSON *board_section_convertToJSON(board_section_t *board_section);

#endif /* _board_section_H_ */

