/*
 * title_keywords_filter.h
 *
 * 
 */

#ifndef _title_keywords_filter_H_
#define _title_keywords_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct title_keywords_filter_t title_keywords_filter_t;

#include "catalogs_product_group_multiple_string_criteria.h"



typedef struct title_keywords_filter_t {
    catalogs_product_group_multiple_string_criteria_t *title_keywords; //object

    int _library_owned; // Is the library responsible for freeing this object?
} title_keywords_filter_t;

__attribute__((deprecated)) title_keywords_filter_t *title_keywords_filter_create(
    catalogs_product_group_multiple_string_criteria_t *title_keywords
);

void title_keywords_filter_free(title_keywords_filter_t *title_keywords_filter);

title_keywords_filter_t *title_keywords_filter_parseFromJSON(cJSON *title_keywords_filterJSON);

cJSON *title_keywords_filter_convertToJSON(title_keywords_filter_t *title_keywords_filter);

#endif /* _title_keywords_filter_H_ */

