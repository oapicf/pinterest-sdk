/*
 * product_availability.h
 *
 * Product availability.
 */

#ifndef _product_availability_H_
#define _product_availability_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_availability_t product_availability_t;


// Enum  for product_availability

typedef enum { pinterest_rest_api_product_availability__NULL = 0, pinterest_rest_api_product_availability__IN_STOCK, pinterest_rest_api_product_availability__OUT_OF_STOCK, pinterest_rest_api_product_availability__PREORDER } pinterest_rest_api_product_availability__e;

char* product_availability_product_availability_ToString(pinterest_rest_api_product_availability__e product_availability);

pinterest_rest_api_product_availability__e product_availability_product_availability_FromString(char* product_availability);

cJSON *product_availability_convertToJSON(pinterest_rest_api_product_availability__e product_availability);

pinterest_rest_api_product_availability__e product_availability_parseFromJSON(cJSON *product_availabilityJSON);

#endif /* _product_availability_H_ */

