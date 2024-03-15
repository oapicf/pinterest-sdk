/*
 * audience_insight_type.h
 *
 * 
 */

#ifndef _audience_insight_type_H_
#define _audience_insight_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_insight_type_t audience_insight_type_t;


// Enum  for audience_insight_type

typedef enum { pinterest_rest_api_audience_insight_type__NULL = 0, pinterest_rest_api_audience_insight_type__YOUR_TOTAL_AUDIENCE, pinterest_rest_api_audience_insight_type__YOUR_ENGAGED_AUDIENCE, pinterest_rest_api_audience_insight_type__PINTEREST_TOTAL_AUDIENCE } pinterest_rest_api_audience_insight_type__e;

char* audience_insight_type_audience_insight_type_ToString(pinterest_rest_api_audience_insight_type__e audience_insight_type);

pinterest_rest_api_audience_insight_type__e audience_insight_type_audience_insight_type_FromString(char* audience_insight_type);

//cJSON *audience_insight_type_audience_insight_type_convertToJSON(pinterest_rest_api_audience_insight_type__e audience_insight_type);

//pinterest_rest_api_audience_insight_type__e audience_insight_type_audience_insight_type_parseFromJSON(cJSON *audience_insight_typeJSON);

#endif /* _audience_insight_type_H_ */

