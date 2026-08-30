/*
 * bid_options_placement_multipliers.h
 *
 * This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _bid_options_placement_multipliers_H_
#define _bid_options_placement_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_options_placement_multipliers_t bid_options_placement_multipliers_t;




typedef struct bid_options_placement_multipliers_t {
    double *browse; //numeric
    double *related_pins; //numeric
    double *search; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} bid_options_placement_multipliers_t;

__attribute__((deprecated)) bid_options_placement_multipliers_t *bid_options_placement_multipliers_create(
    double *browse,
    double *related_pins,
    double *search
);

void bid_options_placement_multipliers_free(bid_options_placement_multipliers_t *bid_options_placement_multipliers);

bid_options_placement_multipliers_t *bid_options_placement_multipliers_parseFromJSON(cJSON *bid_options_placement_multipliersJSON);

cJSON *bid_options_placement_multipliers_convertToJSON(bid_options_placement_multipliers_t *bid_options_placement_multipliers);

#endif /* _bid_options_placement_multipliers_H_ */

