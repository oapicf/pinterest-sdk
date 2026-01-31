/*
 * product_category_region.h
 *
 * 
 */

#ifndef _product_category_region_H_
#define _product_category_region_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_category_region_t product_category_region_t;


// Enum  for product_category_region

typedef enum { pinterest_rest_api_product_category_region__NULL = 0, pinterest_rest_api_product_category_region__US, pinterest_rest_api_product_category_region__GB+IE, pinterest_rest_api_product_category_region__CA } pinterest_rest_api_product_category_region__e;

char* product_category_region_product_category_region_ToString(pinterest_rest_api_product_category_region__e product_category_region);

pinterest_rest_api_product_category_region__e product_category_region_product_category_region_FromString(char* product_category_region);

cJSON *product_category_region_convertToJSON(pinterest_rest_api_product_category_region__e product_category_region);

pinterest_rest_api_product_category_region__e product_category_region_parseFromJSON(cJSON *product_category_regionJSON);

#endif /* _product_category_region_H_ */

