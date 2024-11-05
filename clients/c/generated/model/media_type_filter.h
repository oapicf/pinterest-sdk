/*
 * media_type_filter.h
 *
 * 
 */

#ifndef _media_type_filter_H_
#define _media_type_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_type_filter_t media_type_filter_t;

#include "catalogs_product_group_multiple_media_types_criteria.h"



typedef struct media_type_filter_t {
    catalogs_product_group_multiple_media_types_criteria_t *media_type; //object

} media_type_filter_t;

media_type_filter_t *media_type_filter_create(
    catalogs_product_group_multiple_media_types_criteria_t *media_type
);

void media_type_filter_free(media_type_filter_t *media_type_filter);

media_type_filter_t *media_type_filter_parseFromJSON(cJSON *media_type_filterJSON);

cJSON *media_type_filter_convertToJSON(media_type_filter_t *media_type_filter);

#endif /* _media_type_filter_H_ */

