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

// Enum  for audience_insights_response

typedef enum  { pinterest_rest_api_audience_insights_response__NULL = 0, pinterest_rest_api_audience_insights_response__YOUR_TOTAL_AUDIENCE, pinterest_rest_api_audience_insights_response__YOUR_ENGAGED_AUDIENCE, pinterest_rest_api_audience_insights_response__PINTEREST_TOTAL_AUDIENCE } pinterest_rest_api_audience_insights_response__e;

char* audience_insights_response_type_ToString(pinterest_rest_api_audience_insights_response__e type);

pinterest_rest_api_audience_insights_response__e audience_insights_response_type_FromString(char* type);



typedef struct audience_insights_response_t {
    list_t *categories; //nonprimitive container
    struct audience_demographics_t *demographics; //model
    audience_insight_type_t *type; // custom
    char *date; // string
    int size; //numeric
    int size_is_upper_bound; //boolean

} audience_insights_response_t;

audience_insights_response_t *audience_insights_response_create(
    list_t *categories,
    audience_demographics_t *demographics,
    audience_insight_type_t *type,
    char *date,
    int size,
    int size_is_upper_bound
);

void audience_insights_response_free(audience_insights_response_t *audience_insights_response);

audience_insights_response_t *audience_insights_response_parseFromJSON(cJSON *audience_insights_responseJSON);

cJSON *audience_insights_response_convertToJSON(audience_insights_response_t *audience_insights_response);

#endif /* _audience_insights_response_H_ */

