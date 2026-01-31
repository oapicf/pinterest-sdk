/*
 * product_categories_metrics_highlights.h
 *
 * Key performance metrics highlights for this product category
 */

#ifndef _product_categories_metrics_highlights_H_
#define _product_categories_metrics_highlights_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_categories_metrics_highlights_t product_categories_metrics_highlights_t;

#include "inner_product_categories_metrics_highlights.h"



typedef struct product_categories_metrics_highlights_t {
    struct inner_product_categories_metrics_highlights_t *engagement; //model
    struct inner_product_categories_metrics_highlights_t *outbound_clicks; //model
    struct inner_product_categories_metrics_highlights_t *pin_saves; //model

    int _library_owned; // Is the library responsible for freeing this object?
} product_categories_metrics_highlights_t;

__attribute__((deprecated)) product_categories_metrics_highlights_t *product_categories_metrics_highlights_create(
    inner_product_categories_metrics_highlights_t *engagement,
    inner_product_categories_metrics_highlights_t *outbound_clicks,
    inner_product_categories_metrics_highlights_t *pin_saves
);

void product_categories_metrics_highlights_free(product_categories_metrics_highlights_t *product_categories_metrics_highlights);

product_categories_metrics_highlights_t *product_categories_metrics_highlights_parseFromJSON(cJSON *product_categories_metrics_highlightsJSON);

cJSON *product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights_t *product_categories_metrics_highlights);

#endif /* _product_categories_metrics_highlights_H_ */

