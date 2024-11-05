/*
 * creative_assets_id_filter.h
 *
 * 
 */

#ifndef _creative_assets_id_filter_H_
#define _creative_assets_id_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct creative_assets_id_filter_t creative_assets_id_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct creative_assets_id_filter_t {
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id; //object

} creative_assets_id_filter_t;

creative_assets_id_filter_t *creative_assets_id_filter_create(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id
);

void creative_assets_id_filter_free(creative_assets_id_filter_t *creative_assets_id_filter);

creative_assets_id_filter_t *creative_assets_id_filter_parseFromJSON(cJSON *creative_assets_id_filterJSON);

cJSON *creative_assets_id_filter_convertToJSON(creative_assets_id_filter_t *creative_assets_id_filter);

#endif /* _creative_assets_id_filter_H_ */

