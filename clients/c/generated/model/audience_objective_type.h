/*
 * audience_objective_type.h
 *
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */

#ifndef _audience_objective_type_H_
#define _audience_objective_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_objective_type_t audience_objective_type_t;


// Enum  for audience_objective_type

typedef enum { pinterest_rest_api_audience_objective_type__NULL = 0, pinterest_rest_api_audience_objective_type__AWARENESS, pinterest_rest_api_audience_objective_type__CONSIDERATION, pinterest_rest_api_audience_objective_type__WEB_CONVERSION, pinterest_rest_api_audience_objective_type__CATALOG_SALES, pinterest_rest_api_audience_objective_type__VIDEO_COMPLETION, pinterest_rest_api_audience_objective_type__SALES } pinterest_rest_api_audience_objective_type__e;

char* audience_objective_type_audience_objective_type_ToString(pinterest_rest_api_audience_objective_type__e audience_objective_type);

pinterest_rest_api_audience_objective_type__e audience_objective_type_audience_objective_type_FromString(char* audience_objective_type);

cJSON *audience_objective_type_convertToJSON(pinterest_rest_api_audience_objective_type__e audience_objective_type);

pinterest_rest_api_audience_objective_type__e audience_objective_type_parseFromJSON(cJSON *audience_objective_typeJSON);

#endif /* _audience_objective_type_H_ */

