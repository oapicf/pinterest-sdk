/*
 * audience_sharing_type.h
 *
 * Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
 */

#ifndef _audience_sharing_type_H_
#define _audience_sharing_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_sharing_type_t audience_sharing_type_t;


// Enum  for audience_sharing_type

typedef enum { pinterest_rest_api_audience_sharing_type__NULL = 0, pinterest_rest_api_audience_sharing_type__CUSTOM, pinterest_rest_api_audience_sharing_type__SYNDICATED } pinterest_rest_api_audience_sharing_type__e;

char* audience_sharing_type_audience_sharing_type_ToString(pinterest_rest_api_audience_sharing_type__e audience_sharing_type);

pinterest_rest_api_audience_sharing_type__e audience_sharing_type_audience_sharing_type_FromString(char* audience_sharing_type);

//cJSON *audience_sharing_type_audience_sharing_type_convertToJSON(pinterest_rest_api_audience_sharing_type__e audience_sharing_type);

//pinterest_rest_api_audience_sharing_type__e audience_sharing_type_audience_sharing_type_parseFromJSON(cJSON *audience_sharing_typeJSON);

#endif /* _audience_sharing_type_H_ */

