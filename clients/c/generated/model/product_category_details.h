/*
 * product_category_details.h
 *
 * Product category details
 */

#ifndef _product_category_details_H_
#define _product_category_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_category_details_t product_category_details_t;

#include "product_categories_demographic.h"
#include "product_categories_metrics_highlights.h"
#include "product_category_enum.h"



typedef struct product_category_details_t {
    struct product_categories_demographic_t *demographics; //model
    int *has_prediction; //boolean
    struct product_categories_metrics_highlights_t *metrics_highlights; //model
    list_t* predicted_time_series; //map
    pinterest_rest_api_product_category_enum__e product_category; //referenced enum
    list_t *related_searches; //primitive container
    list_t* time_series; //map

    int _library_owned; // Is the library responsible for freeing this object?
} product_category_details_t;

__attribute__((deprecated)) product_category_details_t *product_category_details_create(
    product_categories_demographic_t *demographics,
    int *has_prediction,
    product_categories_metrics_highlights_t *metrics_highlights,
    list_t* predicted_time_series,
    pinterest_rest_api_product_category_enum__e product_category,
    list_t *related_searches,
    list_t* time_series
);

void product_category_details_free(product_category_details_t *product_category_details);

product_category_details_t *product_category_details_parseFromJSON(cJSON *product_category_detailsJSON);

cJSON *product_category_details_convertToJSON(product_category_details_t *product_category_details);

#endif /* _product_category_details_H_ */

