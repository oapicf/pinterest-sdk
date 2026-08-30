/*
 * audience_insights.h
 *
 * Audience interests and demographics.
 */

#ifndef _audience_insights_H_
#define _audience_insights_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_insights_t audience_insights_t;

#include "audience_category.h"
#include "audience_demographics.h"
#include "audience_insight_type.h"



typedef struct audience_insights_t {
    list_t *categories; //nonprimitive container
    char *date; // string
    struct audience_demographics_t *demographics; //model
    int *size; //numeric
    int *size_is_upper_bound; //boolean
    pinterest_rest_api_audience_insight_type__e type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} audience_insights_t;

__attribute__((deprecated)) audience_insights_t *audience_insights_create(
    list_t *categories,
    char *date,
    audience_demographics_t *demographics,
    int *size,
    int *size_is_upper_bound,
    pinterest_rest_api_audience_insight_type__e type
);

void audience_insights_free(audience_insights_t *audience_insights);

audience_insights_t *audience_insights_parseFromJSON(cJSON *audience_insightsJSON);

cJSON *audience_insights_convertToJSON(audience_insights_t *audience_insights);

#endif /* _audience_insights_H_ */

