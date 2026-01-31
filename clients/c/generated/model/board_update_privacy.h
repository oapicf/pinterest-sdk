/*
 * board_update_privacy.h
 *
 * 
 */

#ifndef _board_update_privacy_H_
#define _board_update_privacy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_update_privacy_t board_update_privacy_t;


// Enum  for board_update_privacy

typedef enum { pinterest_rest_api_board_update_privacy__NULL = 0, pinterest_rest_api_board_update_privacy___PUBLIC, pinterest_rest_api_board_update_privacy__SECRET } pinterest_rest_api_board_update_privacy__e;

char* board_update_privacy_board_update_privacy_ToString(pinterest_rest_api_board_update_privacy__e board_update_privacy);

pinterest_rest_api_board_update_privacy__e board_update_privacy_board_update_privacy_FromString(char* board_update_privacy);

cJSON *board_update_privacy_convertToJSON(pinterest_rest_api_board_update_privacy__e board_update_privacy);

pinterest_rest_api_board_update_privacy__e board_update_privacy_parseFromJSON(cJSON *board_update_privacyJSON);

#endif /* _board_update_privacy_H_ */

