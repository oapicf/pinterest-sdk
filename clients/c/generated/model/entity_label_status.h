/*
 * entity_label_status.h
 *
 * 
 */

#ifndef _entity_label_status_H_
#define _entity_label_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct entity_label_status_t entity_label_status_t;


// Enum  for entity_label_status

typedef enum { pinterest_rest_api_entity_label_status__NULL = 0, pinterest_rest_api_entity_label_status__ACTIVE, pinterest_rest_api_entity_label_status__ARCHIVED, pinterest_rest_api_entity_label_status__NULL } pinterest_rest_api_entity_label_status__e;

char* entity_label_status_entity_label_status_ToString(pinterest_rest_api_entity_label_status__e entity_label_status);

pinterest_rest_api_entity_label_status__e entity_label_status_entity_label_status_FromString(char* entity_label_status);

cJSON *entity_label_status_convertToJSON(pinterest_rest_api_entity_label_status__e entity_label_status);

pinterest_rest_api_entity_label_status__e entity_label_status_parseFromJSON(cJSON *entity_label_statusJSON);

#endif /* _entity_label_status_H_ */

