/*
 * gender_multipliers.h
 *
 * This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _gender_multipliers_H_
#define _gender_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_multipliers_t gender_multipliers_t;

#include "targeting_spec_gender.h"



typedef struct gender_multipliers_t {
    targeting_spec_gender_t *gender; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} gender_multipliers_t;

__attribute__((deprecated)) gender_multipliers_t *gender_multipliers_create(
    targeting_spec_gender_t *gender
);

void gender_multipliers_free(gender_multipliers_t *gender_multipliers);

gender_multipliers_t *gender_multipliers_parseFromJSON(cJSON *gender_multipliersJSON);

cJSON *gender_multipliers_convertToJSON(gender_multipliers_t *gender_multipliers);

#endif /* _gender_multipliers_H_ */

