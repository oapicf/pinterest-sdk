/*
 * board_privacy_filter.h
 *
 * 
 */

#ifndef _board_privacy_filter_H_
#define _board_privacy_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct board_privacy_filter_t board_privacy_filter_t;


// Enum  for board_privacy_filter

typedef enum { pinterest_rest_api_board_privacy_filter__NULL = 0, pinterest_rest_api_board_privacy_filter__ALL, pinterest_rest_api_board_privacy_filter___PUBLIC, pinterest_rest_api_board_privacy_filter___PROTECTED, pinterest_rest_api_board_privacy_filter__SECRET, pinterest_rest_api_board_privacy_filter__PUBLIC_AND_SECRET } pinterest_rest_api_board_privacy_filter__e;

char* board_privacy_filter_board_privacy_filter_ToString(pinterest_rest_api_board_privacy_filter__e board_privacy_filter);

pinterest_rest_api_board_privacy_filter__e board_privacy_filter_board_privacy_filter_FromString(char* board_privacy_filter);

cJSON *board_privacy_filter_convertToJSON(pinterest_rest_api_board_privacy_filter__e board_privacy_filter);

pinterest_rest_api_board_privacy_filter__e board_privacy_filter_parseFromJSON(cJSON *board_privacy_filterJSON);

#endif /* _board_privacy_filter_H_ */

