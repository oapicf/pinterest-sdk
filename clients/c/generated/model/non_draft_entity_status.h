/*
 * non_draft_entity_status.h
 *
 * Entity status
 */

#ifndef _non_draft_entity_status_H_
#define _non_draft_entity_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct non_draft_entity_status_t non_draft_entity_status_t;


// Enum  for non_draft_entity_status

typedef enum { pinterest_rest_api_non_draft_entity_status__NULL = 0, pinterest_rest_api_non_draft_entity_status__ACTIVE, pinterest_rest_api_non_draft_entity_status__PAUSED, pinterest_rest_api_non_draft_entity_status__ARCHIVED } pinterest_rest_api_non_draft_entity_status__e;

char* non_draft_entity_status_non_draft_entity_status_ToString(pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status);

pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status_non_draft_entity_status_FromString(char* non_draft_entity_status);

cJSON *non_draft_entity_status_convertToJSON(pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status);

pinterest_rest_api_non_draft_entity_status__e non_draft_entity_status_parseFromJSON(cJSON *non_draft_entity_statusJSON);

#endif /* _non_draft_entity_status_H_ */

