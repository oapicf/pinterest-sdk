/*
 * trending_product_category.h
 *
 * Trending shopping product category
 */

#ifndef _trending_product_category_H_
#define _trending_product_category_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_product_category_t trending_product_category_t;

#include "product_categories_engagement_type.h"
#include "vertical_product_category.h"

// Enum  for trending_product_category

typedef enum  { pinterest_rest_api_trending_product_category__NULL = 0, pinterest_rest_api_trending_product_category__FASHION, pinterest_rest_api_trending_product_category__HOME_DECOR, pinterest_rest_api_trending_product_category__BEAUTY } pinterest_rest_api_trending_product_category__e;

char* trending_product_category_verticals_ToString(pinterest_rest_api_trending_product_category__e verticals);

pinterest_rest_api_trending_product_category__e trending_product_category_verticals_FromString(char* verticals);



typedef struct trending_product_category_t {
    product_categories_engagement_type_t *engagement_type; // custom
    int pct_change_mom; //numeric
    int percent_relative_volume; //numeric
    char *product_category; // string
    list_t *verticals; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} trending_product_category_t;

__attribute__((deprecated)) trending_product_category_t *trending_product_category_create(
    product_categories_engagement_type_t *engagement_type,
    int pct_change_mom,
    int percent_relative_volume,
    char *product_category,
    list_t *verticals
);

void trending_product_category_free(trending_product_category_t *trending_product_category);

trending_product_category_t *trending_product_category_parseFromJSON(cJSON *trending_product_categoryJSON);

cJSON *trending_product_category_convertToJSON(trending_product_category_t *trending_product_category);

#endif /* _trending_product_category_H_ */

