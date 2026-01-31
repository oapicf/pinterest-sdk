/*
 * featured_trend.h
 *
 * Featured trending topics for a specific interest and market
 */

#ifndef _featured_trend_H_
#define _featured_trend_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct featured_trend_t featured_trend_t;

#include "interests_enum.h"
#include "product_category_region.h"
#include "trending_topic.h"



typedef struct featured_trend_t {
    interests_enum_t *interest; // custom
    product_category_region_t *market; // custom
    list_t *trends; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} featured_trend_t;

__attribute__((deprecated)) featured_trend_t *featured_trend_create(
    interests_enum_t *interest,
    product_category_region_t *market,
    list_t *trends
);

void featured_trend_free(featured_trend_t *featured_trend);

featured_trend_t *featured_trend_parseFromJSON(cJSON *featured_trendJSON);

cJSON *featured_trend_convertToJSON(featured_trend_t *featured_trend);

#endif /* _featured_trend_H_ */

