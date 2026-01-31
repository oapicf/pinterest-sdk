/*
 * vertical_product_category.h
 *
 * List of verticals for product categories.
 */

#ifndef _vertical_product_category_H_
#define _vertical_product_category_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vertical_product_category_t vertical_product_category_t;


// Enum  for vertical_product_category

typedef enum { pinterest_rest_api_vertical_product_category__NULL = 0, pinterest_rest_api_vertical_product_category__FASHION, pinterest_rest_api_vertical_product_category__HOME_DECOR, pinterest_rest_api_vertical_product_category__BEAUTY } pinterest_rest_api_vertical_product_category__e;

char* vertical_product_category_vertical_product_category_ToString(pinterest_rest_api_vertical_product_category__e vertical_product_category);

pinterest_rest_api_vertical_product_category__e vertical_product_category_vertical_product_category_FromString(char* vertical_product_category);

cJSON *vertical_product_category_convertToJSON(pinterest_rest_api_vertical_product_category__e vertical_product_category);

pinterest_rest_api_vertical_product_category__e vertical_product_category_parseFromJSON(cJSON *vertical_product_categoryJSON);

#endif /* _vertical_product_category_H_ */

