/*
 * country_filter.h
 *
 * 
 */

#ifndef _country_filter_H_
#define _country_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct country_filter_t country_filter_t;

#include "catalogs_product_group_multiple_countries_criteria.h"



typedef struct country_filter_t {
    catalogs_product_group_multiple_countries_criteria_t *country; //object

} country_filter_t;

country_filter_t *country_filter_create(
    catalogs_product_group_multiple_countries_criteria_t *country
);

void country_filter_free(country_filter_t *country_filter);

country_filter_t *country_filter_parseFromJSON(cJSON *country_filterJSON);

cJSON *country_filter_convertToJSON(country_filter_t *country_filter);

#endif /* _country_filter_H_ */

