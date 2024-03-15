/*
 * audience_type.h
 *
 * Audience type
 */

#ifndef _audience_type_H_
#define _audience_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_type_t audience_type_t;


// Enum  for audience_type

typedef enum { pinterest_rest_api_audience_type__NULL = 0, pinterest_rest_api_audience_type__CUSTOMER_LIST, pinterest_rest_api_audience_type__VISITOR, pinterest_rest_api_audience_type__ENGAGEMENT, pinterest_rest_api_audience_type__ACTALIKE, pinterest_rest_api_audience_type__PERSONA } pinterest_rest_api_audience_type__e;

char* audience_type_audience_type_ToString(pinterest_rest_api_audience_type__e audience_type);

pinterest_rest_api_audience_type__e audience_type_audience_type_FromString(char* audience_type);

//cJSON *audience_type_audience_type_convertToJSON(pinterest_rest_api_audience_type__e audience_type);

//pinterest_rest_api_audience_type__e audience_type_audience_type_parseFromJSON(cJSON *audience_typeJSON);

#endif /* _audience_type_H_ */

