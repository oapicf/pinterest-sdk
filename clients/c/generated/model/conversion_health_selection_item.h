/*
 * conversion_health_selection_item.h
 *
 * User selection of conversion health criteria for a single feature
 */

#ifndef _conversion_health_selection_item_H_
#define _conversion_health_selection_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_health_selection_item_t conversion_health_selection_item_t;

#include "any_type.h"
#include "object.h"



typedef struct conversion_health_selection_item_t {
    object_t *conversion_type; //object
    object_t *criteria; //object
    object_t *ingestion_source; //object
    any_type_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_health_selection_item_t;

__attribute__((deprecated)) conversion_health_selection_item_t *conversion_health_selection_item_create(
    object_t *conversion_type,
    object_t *criteria,
    object_t *ingestion_source,
    any_type_t *status
);

void conversion_health_selection_item_free(conversion_health_selection_item_t *conversion_health_selection_item);

conversion_health_selection_item_t *conversion_health_selection_item_parseFromJSON(cJSON *conversion_health_selection_itemJSON);

cJSON *conversion_health_selection_item_convertToJSON(conversion_health_selection_item_t *conversion_health_selection_item);

#endif /* _conversion_health_selection_item_H_ */

