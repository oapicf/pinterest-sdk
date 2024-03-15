/*
 * boards_user_follows_list_200_response.h
 *
 * 
 */

#ifndef _boards_user_follows_list_200_response_H_
#define _boards_user_follows_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct boards_user_follows_list_200_response_t boards_user_follows_list_200_response_t;

#include "board.h"



typedef struct boards_user_follows_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} boards_user_follows_list_200_response_t;

boards_user_follows_list_200_response_t *boards_user_follows_list_200_response_create(
    list_t *items,
    char *bookmark
);

void boards_user_follows_list_200_response_free(boards_user_follows_list_200_response_t *boards_user_follows_list_200_response);

boards_user_follows_list_200_response_t *boards_user_follows_list_200_response_parseFromJSON(cJSON *boards_user_follows_list_200_responseJSON);

cJSON *boards_user_follows_list_200_response_convertToJSON(boards_user_follows_list_200_response_t *boards_user_follows_list_200_response);

#endif /* _boards_user_follows_list_200_response_H_ */

