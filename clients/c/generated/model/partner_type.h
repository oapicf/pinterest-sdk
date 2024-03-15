/*
 * partner_type.h
 *
 * 
 */

#ifndef _partner_type_H_
#define _partner_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct partner_type_t partner_type_t;


// Enum  for partner_type

typedef enum { pinterest_rest_api_partner_type__NULL = 0, pinterest_rest_api_partner_type__INTERNAL, pinterest_rest_api_partner_type__EXTERNAL } pinterest_rest_api_partner_type__e;

char* partner_type_partner_type_ToString(pinterest_rest_api_partner_type__e partner_type);

pinterest_rest_api_partner_type__e partner_type_partner_type_FromString(char* partner_type);

//cJSON *partner_type_partner_type_convertToJSON(pinterest_rest_api_partner_type__e partner_type);

//pinterest_rest_api_partner_type__e partner_type_partner_type_parseFromJSON(cJSON *partner_typeJSON);

#endif /* _partner_type_H_ */

