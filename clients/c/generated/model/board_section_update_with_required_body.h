/*
 * board_section_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _board_section_update_with_required_body_H_
#define _board_section_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_section_update_with_required_body_t board_section_update_with_required_body_t;




typedef struct board_section_update_with_required_body_t {
    char *id; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} board_section_update_with_required_body_t;

__attribute__((deprecated)) board_section_update_with_required_body_t *board_section_update_with_required_body_create(
    char *id,
    char *name
);

void board_section_update_with_required_body_free(board_section_update_with_required_body_t *board_section_update_with_required_body);

board_section_update_with_required_body_t *board_section_update_with_required_body_parseFromJSON(cJSON *board_section_update_with_required_bodyJSON);

cJSON *board_section_update_with_required_body_convertToJSON(board_section_update_with_required_body_t *board_section_update_with_required_body);

#endif /* _board_section_update_with_required_body_H_ */

