/*
 * item_availability.h
 *
 * Availability of the item
 */

#ifndef _item_availability_H_
#define _item_availability_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_availability_t item_availability_t;


// Enum  for item_availability

typedef enum { pinterest_rest_api_item_availability__NULL = 0, pinterest_rest_api_item_availability__in stock, pinterest_rest_api_item_availability__out of stock, pinterest_rest_api_item_availability__preorder } pinterest_rest_api_item_availability__e;

char* item_availability_item_availability_ToString(pinterest_rest_api_item_availability__e item_availability);

pinterest_rest_api_item_availability__e item_availability_item_availability_FromString(char* item_availability);

cJSON *item_availability_convertToJSON(pinterest_rest_api_item_availability__e item_availability);

pinterest_rest_api_item_availability__e item_availability_parseFromJSON(cJSON *item_availabilityJSON);

#endif /* _item_availability_H_ */

