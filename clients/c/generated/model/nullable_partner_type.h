/*
 * nullable_partner_type.h
 *
 * 
 */

#ifndef _nullable_partner_type_H_
#define _nullable_partner_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nullable_partner_type_t nullable_partner_type_t;


// Enum  for nullable_partner_type

typedef enum { pinterest_rest_api_nullable_partner_type__NULL = 0, pinterest_rest_api_nullable_partner_type__INTERNAL, pinterest_rest_api_nullable_partner_type__EXTERNAL } pinterest_rest_api_nullable_partner_type__e;

char* nullable_partner_type_nullable_partner_type_ToString(pinterest_rest_api_nullable_partner_type__e nullable_partner_type);

pinterest_rest_api_nullable_partner_type__e nullable_partner_type_nullable_partner_type_FromString(char* nullable_partner_type);

cJSON *nullable_partner_type_convertToJSON(pinterest_rest_api_nullable_partner_type__e nullable_partner_type);

pinterest_rest_api_nullable_partner_type__e nullable_partner_type_parseFromJSON(cJSON *nullable_partner_typeJSON);

#endif /* _nullable_partner_type_H_ */

