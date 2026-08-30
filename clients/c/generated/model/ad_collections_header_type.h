/*
 * ad_collections_header_type.h
 *
 * Collections ad header type for ads
 */

#ifndef _ad_collections_header_type_H_
#define _ad_collections_header_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_collections_header_type_t ad_collections_header_type_t;


// Enum  for ad_collections_header_type

typedef enum { pinterest_rest_api_ad_collections_header_type__NULL = 0, pinterest_rest_api_ad_collections_header_type__SHOP_THIS_COLLECTION, pinterest_rest_api_ad_collections_header_type__EXPLORE_THIS_COLLECTION, pinterest_rest_api_ad_collections_header_type__NO_HEADER } pinterest_rest_api_ad_collections_header_type__e;

char* ad_collections_header_type_ad_collections_header_type_ToString(pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type);

pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type_ad_collections_header_type_FromString(char* ad_collections_header_type);

cJSON *ad_collections_header_type_convertToJSON(pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type);

pinterest_rest_api_ad_collections_header_type__e ad_collections_header_type_parseFromJSON(cJSON *ad_collections_header_typeJSON);

#endif /* _ad_collections_header_type_H_ */

