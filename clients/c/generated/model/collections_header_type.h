/*
 * collections_header_type.h
 *
 * Collections ad header type
 */

#ifndef _collections_header_type_H_
#define _collections_header_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct collections_header_type_t collections_header_type_t;


// Enum  for collections_header_type

typedef enum { pinterest_rest_api_collections_header_type__NULL = 0, pinterest_rest_api_collections_header_type__SHOP_THIS_COLLECTION, pinterest_rest_api_collections_header_type__EXPLORE_THIS_COLLECTION, pinterest_rest_api_collections_header_type__NO_HEADER, pinterest_rest_api_collections_header_type__ON_SALE, pinterest_rest_api_collections_header_type__GET_DEAL } pinterest_rest_api_collections_header_type__e;

char* collections_header_type_collections_header_type_ToString(pinterest_rest_api_collections_header_type__e collections_header_type);

pinterest_rest_api_collections_header_type__e collections_header_type_collections_header_type_FromString(char* collections_header_type);

cJSON *collections_header_type_convertToJSON(pinterest_rest_api_collections_header_type__e collections_header_type);

pinterest_rest_api_collections_header_type__e collections_header_type_parseFromJSON(cJSON *collections_header_typeJSON);

#endif /* _collections_header_type_H_ */

