/*
 * audience_share_type.h
 *
 * 
 */

#ifndef _audience_share_type_H_
#define _audience_share_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_share_type_t audience_share_type_t;


// Enum  for audience_share_type

typedef enum { pinterest_rest_api_audience_share_type__NULL = 0, pinterest_rest_api_audience_share_type__SHARED, pinterest_rest_api_audience_share_type__RECEIVED } pinterest_rest_api_audience_share_type__e;

char* audience_share_type_audience_share_type_ToString(pinterest_rest_api_audience_share_type__e audience_share_type);

pinterest_rest_api_audience_share_type__e audience_share_type_audience_share_type_FromString(char* audience_share_type);

//cJSON *audience_share_type_audience_share_type_convertToJSON(pinterest_rest_api_audience_share_type__e audience_share_type);

//pinterest_rest_api_audience_share_type__e audience_share_type_audience_share_type_parseFromJSON(cJSON *audience_share_typeJSON);

#endif /* _audience_share_type_H_ */

