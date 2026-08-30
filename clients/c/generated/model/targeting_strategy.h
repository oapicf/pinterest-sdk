/*
 * targeting_strategy.h
 *
 * 
 */

#ifndef _targeting_strategy_H_
#define _targeting_strategy_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_strategy_t targeting_strategy_t;


// Enum  for targeting_strategy

typedef enum { pinterest_rest_api_targeting_strategy__NULL = 0, pinterest_rest_api_targeting_strategy__CHOOSE_YOUR_OWN, pinterest_rest_api_targeting_strategy__FIND_NEW_CUSTOMERS, pinterest_rest_api_targeting_strategy__RECONNECT_WITH_USERS } pinterest_rest_api_targeting_strategy__e;

char* targeting_strategy_targeting_strategy_ToString(pinterest_rest_api_targeting_strategy__e targeting_strategy);

pinterest_rest_api_targeting_strategy__e targeting_strategy_targeting_strategy_FromString(char* targeting_strategy);

cJSON *targeting_strategy_convertToJSON(pinterest_rest_api_targeting_strategy__e targeting_strategy);

pinterest_rest_api_targeting_strategy__e targeting_strategy_parseFromJSON(cJSON *targeting_strategyJSON);

#endif /* _targeting_strategy_H_ */

