/*
 * public_targeting_type.h
 *
 * Public ad targeting type with external names
 */

#ifndef _public_targeting_type_H_
#define _public_targeting_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct public_targeting_type_t public_targeting_type_t;


// Enum  for public_targeting_type

typedef enum { pinterest_rest_api_public_targeting_type__NULL = 0, pinterest_rest_api_public_targeting_type__APPTYPE, pinterest_rest_api_public_targeting_type__GENDER, pinterest_rest_api_public_targeting_type__LOCALE, pinterest_rest_api_public_targeting_type__AGE_BUCKET, pinterest_rest_api_public_targeting_type__LOCATION, pinterest_rest_api_public_targeting_type__GEO, pinterest_rest_api_public_targeting_type__INTEREST, pinterest_rest_api_public_targeting_type__KEYWORD, pinterest_rest_api_public_targeting_type__AUDIENCE_INCLUDE, pinterest_rest_api_public_targeting_type__AUDIENCE_EXCLUDE } pinterest_rest_api_public_targeting_type__e;

char* public_targeting_type_public_targeting_type_ToString(pinterest_rest_api_public_targeting_type__e public_targeting_type);

pinterest_rest_api_public_targeting_type__e public_targeting_type_public_targeting_type_FromString(char* public_targeting_type);

cJSON *public_targeting_type_convertToJSON(pinterest_rest_api_public_targeting_type__e public_targeting_type);

pinterest_rest_api_public_targeting_type__e public_targeting_type_parseFromJSON(cJSON *public_targeting_typeJSON);

#endif /* _public_targeting_type_H_ */

