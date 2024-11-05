/*
 * advanced_auction_operation.h
 *
 * 
 */

#ifndef _advanced_auction_operation_H_
#define _advanced_auction_operation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_operation_t advanced_auction_operation_t;


// Enum  for advanced_auction_operation

typedef enum { pinterest_rest_api_advanced_auction_operation__NULL = 0, pinterest_rest_api_advanced_auction_operation__UPSERT, pinterest_rest_api_advanced_auction_operation___DELETE } pinterest_rest_api_advanced_auction_operation__e;

char* advanced_auction_operation_advanced_auction_operation_ToString(pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation);

pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation_advanced_auction_operation_FromString(char* advanced_auction_operation);

//cJSON *advanced_auction_operation_advanced_auction_operation_convertToJSON(pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation);

//pinterest_rest_api_advanced_auction_operation__e advanced_auction_operation_advanced_auction_operation_parseFromJSON(cJSON *advanced_auction_operationJSON);

#endif /* _advanced_auction_operation_H_ */

