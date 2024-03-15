/*
 * audience_demographic_value.h
 *
 * Demographic detail for a single audience demographic
 */

#ifndef _audience_demographic_value_H_
#define _audience_demographic_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_demographic_value_t audience_demographic_value_t;




typedef struct audience_demographic_value_t {
    char *key; // string
    char *name; // string
    double ratio; //numeric

} audience_demographic_value_t;

audience_demographic_value_t *audience_demographic_value_create(
    char *key,
    char *name,
    double ratio
);

void audience_demographic_value_free(audience_demographic_value_t *audience_demographic_value);

audience_demographic_value_t *audience_demographic_value_parseFromJSON(cJSON *audience_demographic_valueJSON);

cJSON *audience_demographic_value_convertToJSON(audience_demographic_value_t *audience_demographic_value);

#endif /* _audience_demographic_value_H_ */

