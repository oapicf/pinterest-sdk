/*
 * audience_insights_response.h
 *
 * Audience interests and demographics.
 */

#ifndef _audience_insights_response_H_
#define _audience_insights_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_insights_response_t audience_insights_response_t;

#include "audience_category.h"
#include "audience_demographics.h"
#include "audience_insight_type.h"



typedef struct audience_insights_response_t {
    list_t *categories; //nonprimitive container
    struct audience_demographics_t *demographics; //model
    pinterest_rest_api_audience_insight_type__e type; //referenced enum
    char *date; // string
    int size; //numeric
    int size_is_upper_bound; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} audience_insights_response_t;

__attribute__((deprecated)) audience_insights_response_t *audience_insights_response_create(
    list_t *categories,
    audience_demographics_t *demographics,
    pinterest_rest_api_audience_insight_type__e type,
    char *date,
    int size,
    int size_is_upper_bound
);

void audience_insights_response_free(audience_insights_response_t *audience_insights_response);

audience_insights_response_t *audience_insights_response_parseFromJSON(cJSON *audience_insights_responseJSON);

cJSON *audience_insights_response_convertToJSON(audience_insights_response_t *audience_insights_response);

#endif /* _audience_insights_response_H_ */

