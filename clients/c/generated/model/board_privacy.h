/*
 * board_privacy.h
 *
 * 
 */

#ifndef _board_privacy_H_
#define _board_privacy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_privacy_t board_privacy_t;


// Enum  for board_privacy

typedef enum { pinterest_rest_api_board_privacy__NULL = 0, pinterest_rest_api_board_privacy___PUBLIC, pinterest_rest_api_board_privacy___PROTECTED, pinterest_rest_api_board_privacy__SECRET } pinterest_rest_api_board_privacy__e;

char* board_privacy_board_privacy_ToString(pinterest_rest_api_board_privacy__e board_privacy);

pinterest_rest_api_board_privacy__e board_privacy_board_privacy_FromString(char* board_privacy);

cJSON *board_privacy_convertToJSON(pinterest_rest_api_board_privacy__e board_privacy);

pinterest_rest_api_board_privacy__e board_privacy_parseFromJSON(cJSON *board_privacyJSON);

#endif /* _board_privacy_H_ */

