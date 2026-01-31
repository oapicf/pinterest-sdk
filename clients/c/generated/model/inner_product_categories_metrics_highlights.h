/*
 * inner_product_categories_metrics_highlights.h
 *
 * 
 */

#ifndef _inner_product_categories_metrics_highlights_H_
#define _inner_product_categories_metrics_highlights_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct inner_product_categories_metrics_highlights_t inner_product_categories_metrics_highlights_t;




typedef struct inner_product_categories_metrics_highlights_t {
    double pct_change_mom; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} inner_product_categories_metrics_highlights_t;

__attribute__((deprecated)) inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_create(
    double pct_change_mom
);

void inner_product_categories_metrics_highlights_free(inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights);

inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights_parseFromJSON(cJSON *inner_product_categories_metrics_highlightsJSON);

cJSON *inner_product_categories_metrics_highlights_convertToJSON(inner_product_categories_metrics_highlights_t *inner_product_categories_metrics_highlights);

#endif /* _inner_product_categories_metrics_highlights_H_ */

