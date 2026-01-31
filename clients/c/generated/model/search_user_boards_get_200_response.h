/*
 * search_user_boards_get_200_response.h
 *
 * 
 */

#ifndef _search_user_boards_get_200_response_H_
#define _search_user_boards_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct search_user_boards_get_200_response_t search_user_boards_get_200_response_t;

#include "board.h"



typedef struct search_user_boards_get_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} search_user_boards_get_200_response_t;

__attribute__((deprecated)) search_user_boards_get_200_response_t *search_user_boards_get_200_response_create(
    char *bookmark,
    list_t *items
);

void search_user_boards_get_200_response_free(search_user_boards_get_200_response_t *search_user_boards_get_200_response);

search_user_boards_get_200_response_t *search_user_boards_get_200_response_parseFromJSON(cJSON *search_user_boards_get_200_responseJSON);

cJSON *search_user_boards_get_200_response_convertToJSON(search_user_boards_get_200_response_t *search_user_boards_get_200_response);

#endif /* _search_user_boards_get_200_response_H_ */

