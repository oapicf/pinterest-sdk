/*
 * bid_options_app_type_multipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _bid_options_app_type_multipliers_H_
#define _bid_options_app_type_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bid_options_app_type_multipliers_t bid_options_app_type_multipliers_t;




typedef struct bid_options_app_type_multipliers_t {
    double *android_mobile; //numeric
    double *android_tablet; //numeric
    double *ipad; //numeric
    double *iphone; //numeric
    double *web; //numeric
    double *web_mobile; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} bid_options_app_type_multipliers_t;

__attribute__((deprecated)) bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_create(
    double *android_mobile,
    double *android_tablet,
    double *ipad,
    double *iphone,
    double *web,
    double *web_mobile
);

void bid_options_app_type_multipliers_free(bid_options_app_type_multipliers_t *bid_options_app_type_multipliers);

bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_parseFromJSON(cJSON *bid_options_app_type_multipliersJSON);

cJSON *bid_options_app_type_multipliers_convertToJSON(bid_options_app_type_multipliers_t *bid_options_app_type_multipliers);

#endif /* _bid_options_app_type_multipliers_H_ */

