/*
 * product_availability_type.h
 *
 * Default availability for products in a feed.
 */

#ifndef _product_availability_type_H_
#define _product_availability_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_availability_type_t product_availability_type_t;


// Enum  for product_availability_type

typedef enum { pinterest_rest_api_product_availability_type__NULL = 0, pinterest_rest_api_product_availability_type__IN_STOCK, pinterest_rest_api_product_availability_type__OUT_OF_STOCK, pinterest_rest_api_product_availability_type__PREORDER } pinterest_rest_api_product_availability_type__e;

char* product_availability_type_product_availability_type_ToString(pinterest_rest_api_product_availability_type__e product_availability_type);

pinterest_rest_api_product_availability_type__e product_availability_type_product_availability_type_FromString(char* product_availability_type);

//cJSON *product_availability_type_product_availability_type_convertToJSON(pinterest_rest_api_product_availability_type__e product_availability_type);

//pinterest_rest_api_product_availability_type__e product_availability_type_product_availability_type_parseFromJSON(cJSON *product_availability_typeJSON);

#endif /* _product_availability_type_H_ */

