/*
 * frequency_multipliers.h
 *
 * This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _frequency_multipliers_H_
#define _frequency_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct frequency_multipliers_t frequency_multipliers_t;




typedef struct frequency_multipliers_t {
    char *impression_count; // string

    int _library_owned; // Is the library responsible for freeing this object?
} frequency_multipliers_t;

__attribute__((deprecated)) frequency_multipliers_t *frequency_multipliers_create(
    char *impression_count
);

void frequency_multipliers_free(frequency_multipliers_t *frequency_multipliers);

frequency_multipliers_t *frequency_multipliers_parseFromJSON(cJSON *frequency_multipliersJSON);

cJSON *frequency_multipliers_convertToJSON(frequency_multipliers_t *frequency_multipliers);

#endif /* _frequency_multipliers_H_ */

