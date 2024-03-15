/*
 * board_update.h
 *
 * Board fields for updates
 */

#ifndef _board_update_H_
#define _board_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_update_t board_update_t;


// Enum PRIVACY for board_update

typedef enum  { pinterest_rest_api_board_update_PRIVACY_NULL = 0, pinterest_rest_api_board_update_PRIVACY__PUBLIC, pinterest_rest_api_board_update_PRIVACY_SECRET } pinterest_rest_api_board_update_PRIVACY_e;

char* board_update_privacy_ToString(pinterest_rest_api_board_update_PRIVACY_e privacy);

pinterest_rest_api_board_update_PRIVACY_e board_update_privacy_FromString(char* privacy);



typedef struct board_update_t {
    char *name; // string
    char *description; // string
    pinterest_rest_api_board_update_PRIVACY_e privacy; //enum

} board_update_t;

board_update_t *board_update_create(
    char *name,
    char *description,
    pinterest_rest_api_board_update_PRIVACY_e privacy
);

void board_update_free(board_update_t *board_update);

board_update_t *board_update_parseFromJSON(cJSON *board_updateJSON);

cJSON *board_update_convertToJSON(board_update_t *board_update);

#endif /* _board_update_H_ */

