/*
 * audience_demographics.h
 *
 * Audience demographics
 */

#ifndef _audience_demographics_H_
#define _audience_demographics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_demographics_t audience_demographics_t;

#include "audience_demographic_value.h"



typedef struct audience_demographics_t {
    list_t *ages; //nonprimitive container
    list_t *genders; //nonprimitive container
    list_t *devices; //nonprimitive container
    list_t *metros; //nonprimitive container
    list_t *countries; //nonprimitive container

} audience_demographics_t;

audience_demographics_t *audience_demographics_create(
    list_t *ages,
    list_t *genders,
    list_t *devices,
    list_t *metros,
    list_t *countries
);

void audience_demographics_free(audience_demographics_t *audience_demographics);

audience_demographics_t *audience_demographics_parseFromJSON(cJSON *audience_demographicsJSON);

cJSON *audience_demographics_convertToJSON(audience_demographics_t *audience_demographics);

#endif /* _audience_demographics_H_ */

