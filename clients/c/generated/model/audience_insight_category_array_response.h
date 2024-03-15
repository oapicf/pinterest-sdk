/*
 * audience_insight_category_array_response.h
 *
 * 
 */

#ifndef _audience_insight_category_array_response_H_
#define _audience_insight_category_array_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_insight_category_array_response_t audience_insight_category_array_response_t;

#include "audience_insight_category_common.h"



typedef struct audience_insight_category_array_response_t {
    list_t *items; //nonprimitive container

} audience_insight_category_array_response_t;

audience_insight_category_array_response_t *audience_insight_category_array_response_create(
    list_t *items
);

void audience_insight_category_array_response_free(audience_insight_category_array_response_t *audience_insight_category_array_response);

audience_insight_category_array_response_t *audience_insight_category_array_response_parseFromJSON(cJSON *audience_insight_category_array_responseJSON);

cJSON *audience_insight_category_array_response_convertToJSON(audience_insight_category_array_response_t *audience_insight_category_array_response);

#endif /* _audience_insight_category_array_response_H_ */

