/*
 * audience_ownership_type.h
 *
 * Filter audiences by ownership type.
 */

#ifndef _audience_ownership_type_H_
#define _audience_ownership_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_ownership_type_t audience_ownership_type_t;


// Enum  for audience_ownership_type

typedef enum { pinterest_rest_api_audience_ownership_type__NULL = 0, pinterest_rest_api_audience_ownership_type__OWNED, pinterest_rest_api_audience_ownership_type__RECEIVED } pinterest_rest_api_audience_ownership_type__e;

char* audience_ownership_type_audience_ownership_type_ToString(pinterest_rest_api_audience_ownership_type__e audience_ownership_type);

pinterest_rest_api_audience_ownership_type__e audience_ownership_type_audience_ownership_type_FromString(char* audience_ownership_type);

cJSON *audience_ownership_type_convertToJSON(pinterest_rest_api_audience_ownership_type__e audience_ownership_type);

pinterest_rest_api_audience_ownership_type__e audience_ownership_type_parseFromJSON(cJSON *audience_ownership_typeJSON);

#endif /* _audience_ownership_type_H_ */

