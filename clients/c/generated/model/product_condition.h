/*
 * product_condition.h
 *
 * 
 */

#ifndef _product_condition_H_
#define _product_condition_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_condition_t product_condition_t;


// Enum  for product_condition

typedef enum { pinterest_rest_api_product_condition__NULL = 0, pinterest_rest_api_product_condition___NEW, pinterest_rest_api_product_condition__USED, pinterest_rest_api_product_condition__REFURBISHED } pinterest_rest_api_product_condition__e;

char* product_condition_product_condition_ToString(pinterest_rest_api_product_condition__e product_condition);

pinterest_rest_api_product_condition__e product_condition_product_condition_FromString(char* product_condition);

cJSON *product_condition_convertToJSON(pinterest_rest_api_product_condition__e product_condition);

pinterest_rest_api_product_condition__e product_condition_parseFromJSON(cJSON *product_conditionJSON);

#endif /* _product_condition_H_ */

