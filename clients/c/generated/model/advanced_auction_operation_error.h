/*
 * advanced_auction_operation_error.h
 *
 * Error which occurred when applying a bid options operation to a specific item.
 */

#ifndef _advanced_auction_operation_error_H_
#define _advanced_auction_operation_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_operation_error_t advanced_auction_operation_error_t;




typedef struct advanced_auction_operation_error_t {
    int code; //numeric
    char *message; // string

} advanced_auction_operation_error_t;

advanced_auction_operation_error_t *advanced_auction_operation_error_create(
    int code,
    char *message
);

void advanced_auction_operation_error_free(advanced_auction_operation_error_t *advanced_auction_operation_error);

advanced_auction_operation_error_t *advanced_auction_operation_error_parseFromJSON(cJSON *advanced_auction_operation_errorJSON);

cJSON *advanced_auction_operation_error_convertToJSON(advanced_auction_operation_error_t *advanced_auction_operation_error);

#endif /* _advanced_auction_operation_error_H_ */

