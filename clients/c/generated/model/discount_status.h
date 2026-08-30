/*
 * discount_status.h
 *
 * Discount status based on the current time and start and end time of discount
 */

#ifndef _discount_status_H_
#define _discount_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct discount_status_t discount_status_t;


// Enum  for discount_status

typedef enum { pinterest_rest_api_discount_status__NULL = 0, pinterest_rest_api_discount_status__OTHER, pinterest_rest_api_discount_status__ACTIVE, pinterest_rest_api_discount_status__PAUSED, pinterest_rest_api_discount_status__SCHEDULED, pinterest_rest_api_discount_status__EXPIRED } pinterest_rest_api_discount_status__e;

char* discount_status_discount_status_ToString(pinterest_rest_api_discount_status__e discount_status);

pinterest_rest_api_discount_status__e discount_status_discount_status_FromString(char* discount_status);

cJSON *discount_status_convertToJSON(pinterest_rest_api_discount_status__e discount_status);

pinterest_rest_api_discount_status__e discount_status_parseFromJSON(cJSON *discount_statusJSON);

#endif /* _discount_status_H_ */

