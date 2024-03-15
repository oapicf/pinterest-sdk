/*
 * entity_status.h
 *
 * Entity status
 */

#ifndef _entity_status_H_
#define _entity_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct entity_status_t entity_status_t;


// Enum  for entity_status

typedef enum { pinterest_rest_api_entity_status__NULL = 0, pinterest_rest_api_entity_status__ACTIVE, pinterest_rest_api_entity_status__PAUSED, pinterest_rest_api_entity_status__ARCHIVED, pinterest_rest_api_entity_status__DRAFT, pinterest_rest_api_entity_status__DELETED_DRAFT } pinterest_rest_api_entity_status__e;

char* entity_status_entity_status_ToString(pinterest_rest_api_entity_status__e entity_status);

pinterest_rest_api_entity_status__e entity_status_entity_status_FromString(char* entity_status);

//cJSON *entity_status_entity_status_convertToJSON(pinterest_rest_api_entity_status__e entity_status);

//pinterest_rest_api_entity_status__e entity_status_entity_status_parseFromJSON(cJSON *entity_statusJSON);

#endif /* _entity_status_H_ */

