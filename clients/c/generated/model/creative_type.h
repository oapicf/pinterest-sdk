/*
 * creative_type.h
 *
 * Ad creative type enum. For update, only draft ads may update creative type. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */

#ifndef _creative_type_H_
#define _creative_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct creative_type_t creative_type_t;


// Enum  for creative_type

typedef enum { pinterest_rest_api_creative_type__NULL = 0, pinterest_rest_api_creative_type__REGULAR, pinterest_rest_api_creative_type__VIDEO, pinterest_rest_api_creative_type__SHOPPING, pinterest_rest_api_creative_type__CAROUSEL, pinterest_rest_api_creative_type__MAX_VIDEO, pinterest_rest_api_creative_type__SHOP_THE_PIN, pinterest_rest_api_creative_type__COLLECTION, pinterest_rest_api_creative_type__IDEA, pinterest_rest_api_creative_type__SHOWCASE, pinterest_rest_api_creative_type__QUIZ } pinterest_rest_api_creative_type__e;

char* creative_type_creative_type_ToString(pinterest_rest_api_creative_type__e creative_type);

pinterest_rest_api_creative_type__e creative_type_creative_type_FromString(char* creative_type);

//cJSON *creative_type_creative_type_convertToJSON(pinterest_rest_api_creative_type__e creative_type);

//pinterest_rest_api_creative_type__e creative_type_creative_type_parseFromJSON(cJSON *creative_typeJSON);

#endif /* _creative_type_H_ */

