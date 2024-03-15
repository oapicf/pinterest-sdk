/*
 * bulk_entity_type.h
 *
 * Refers ads entity type
 */

#ifndef _bulk_entity_type_H_
#define _bulk_entity_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_entity_type_t bulk_entity_type_t;


// Enum  for bulk_entity_type

typedef enum { pinterest_rest_api_bulk_entity_type__NULL = 0, pinterest_rest_api_bulk_entity_type__CAMPAIGN, pinterest_rest_api_bulk_entity_type__AD_GROUP, pinterest_rest_api_bulk_entity_type__PRODUCT_GROUP, pinterest_rest_api_bulk_entity_type__AD, pinterest_rest_api_bulk_entity_type__KEYWORD } pinterest_rest_api_bulk_entity_type__e;

char* bulk_entity_type_bulk_entity_type_ToString(pinterest_rest_api_bulk_entity_type__e bulk_entity_type);

pinterest_rest_api_bulk_entity_type__e bulk_entity_type_bulk_entity_type_FromString(char* bulk_entity_type);

//cJSON *bulk_entity_type_bulk_entity_type_convertToJSON(pinterest_rest_api_bulk_entity_type__e bulk_entity_type);

//pinterest_rest_api_bulk_entity_type__e bulk_entity_type_bulk_entity_type_parseFromJSON(cJSON *bulk_entity_typeJSON);

#endif /* _bulk_entity_type_H_ */

