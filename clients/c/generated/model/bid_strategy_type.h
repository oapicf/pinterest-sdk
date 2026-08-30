/*
 * bid_strategy_type.h
 *
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 */

#ifndef _bid_strategy_type_H_
#define _bid_strategy_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_strategy_type_t bid_strategy_type_t;


// Enum  for bid_strategy_type

typedef enum { pinterest_rest_api_bid_strategy_type__NULL = 0, pinterest_rest_api_bid_strategy_type__AUTOMATIC_BID, pinterest_rest_api_bid_strategy_type__MAX_BID, pinterest_rest_api_bid_strategy_type__TARGET_AVG } pinterest_rest_api_bid_strategy_type__e;

char* bid_strategy_type_bid_strategy_type_ToString(pinterest_rest_api_bid_strategy_type__e bid_strategy_type);

pinterest_rest_api_bid_strategy_type__e bid_strategy_type_bid_strategy_type_FromString(char* bid_strategy_type);

cJSON *bid_strategy_type_convertToJSON(pinterest_rest_api_bid_strategy_type__e bid_strategy_type);

pinterest_rest_api_bid_strategy_type__e bid_strategy_type_parseFromJSON(cJSON *bid_strategy_typeJSON);

#endif /* _bid_strategy_type_H_ */

