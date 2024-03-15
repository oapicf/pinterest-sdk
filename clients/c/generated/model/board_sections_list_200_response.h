/*
 * board_sections_list_200_response.h
 *
 * 
 */

#ifndef _board_sections_list_200_response_H_
#define _board_sections_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_sections_list_200_response_t board_sections_list_200_response_t;

#include "board_section.h"



typedef struct board_sections_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} board_sections_list_200_response_t;

board_sections_list_200_response_t *board_sections_list_200_response_create(
    list_t *items,
    char *bookmark
);

void board_sections_list_200_response_free(board_sections_list_200_response_t *board_sections_list_200_response);

board_sections_list_200_response_t *board_sections_list_200_response_parseFromJSON(cJSON *board_sections_list_200_responseJSON);

cJSON *board_sections_list_200_response_convertToJSON(board_sections_list_200_response_t *board_sections_list_200_response);

#endif /* _board_sections_list_200_response_H_ */

