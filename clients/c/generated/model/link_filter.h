/*
 * link_filter.h
 *
 * 
 */

#ifndef _link_filter_H_
#define _link_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct link_filter_t link_filter_t;

#include "catalogs_product_group_filter_operator_type_criteria.h"



typedef struct link_filter_t {
    struct catalogs_product_group_filter_operator_type_criteria_t *link; //model

    int _library_owned; // Is the library responsible for freeing this object?
} link_filter_t;

__attribute__((deprecated)) link_filter_t *link_filter_create(
    catalogs_product_group_filter_operator_type_criteria_t *link
);

void link_filter_free(link_filter_t *link_filter);

link_filter_t *link_filter_parseFromJSON(cJSON *link_filterJSON);

cJSON *link_filter_convertToJSON(link_filter_t *link_filter);

#endif /* _link_filter_H_ */

