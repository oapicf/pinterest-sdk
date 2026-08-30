/*
 * pinner_list_type.h
 *
 * Audience type
 */

#ifndef _pinner_list_type_H_
#define _pinner_list_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinner_list_type_t pinner_list_type_t;


// Enum  for pinner_list_type

typedef enum { pinterest_rest_api_pinner_list_type__NULL = 0, pinterest_rest_api_pinner_list_type__CUSTOMER_LIST, pinterest_rest_api_pinner_list_type__VISITOR, pinterest_rest_api_pinner_list_type__ENGAGEMENT, pinterest_rest_api_pinner_list_type__LOOKALIKE, pinterest_rest_api_pinner_list_type__ACTALIKE, pinterest_rest_api_pinner_list_type__PERSONA } pinterest_rest_api_pinner_list_type__e;

char* pinner_list_type_pinner_list_type_ToString(pinterest_rest_api_pinner_list_type__e pinner_list_type);

pinterest_rest_api_pinner_list_type__e pinner_list_type_pinner_list_type_FromString(char* pinner_list_type);

cJSON *pinner_list_type_convertToJSON(pinterest_rest_api_pinner_list_type__e pinner_list_type);

pinterest_rest_api_pinner_list_type__e pinner_list_type_parseFromJSON(cJSON *pinner_list_typeJSON);

#endif /* _pinner_list_type_H_ */

