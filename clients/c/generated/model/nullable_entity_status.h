/*
 * nullable_entity_status.h
 *
 * Entity status
 */

#ifndef _nullable_entity_status_H_
#define _nullable_entity_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nullable_entity_status_t nullable_entity_status_t;


// Enum  for nullable_entity_status

typedef enum { pinterest_rest_api_nullable_entity_status__NULL = 0, pinterest_rest_api_nullable_entity_status__ACTIVE, pinterest_rest_api_nullable_entity_status__PAUSED, pinterest_rest_api_nullable_entity_status__ARCHIVED, pinterest_rest_api_nullable_entity_status__DRAFT, pinterest_rest_api_nullable_entity_status__DELETED_DRAFT } pinterest_rest_api_nullable_entity_status__e;

char* nullable_entity_status_nullable_entity_status_ToString(pinterest_rest_api_nullable_entity_status__e nullable_entity_status);

pinterest_rest_api_nullable_entity_status__e nullable_entity_status_nullable_entity_status_FromString(char* nullable_entity_status);

cJSON *nullable_entity_status_convertToJSON(pinterest_rest_api_nullable_entity_status__e nullable_entity_status);

pinterest_rest_api_nullable_entity_status__e nullable_entity_status_parseFromJSON(cJSON *nullable_entity_statusJSON);

#endif /* _nullable_entity_status_H_ */

