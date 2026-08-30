/*
 * targeting_template_status.h
 *
 * Indicate targeting template is active or Deleted
 */

#ifndef _targeting_template_status_H_
#define _targeting_template_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_status_t targeting_template_status_t;


// Enum  for targeting_template_status

typedef enum { pinterest_rest_api_targeting_template_status__NULL = 0, pinterest_rest_api_targeting_template_status__ACTIVE, pinterest_rest_api_targeting_template_status__DELETED } pinterest_rest_api_targeting_template_status__e;

char* targeting_template_status_targeting_template_status_ToString(pinterest_rest_api_targeting_template_status__e targeting_template_status);

pinterest_rest_api_targeting_template_status__e targeting_template_status_targeting_template_status_FromString(char* targeting_template_status);

cJSON *targeting_template_status_convertToJSON(pinterest_rest_api_targeting_template_status__e targeting_template_status);

pinterest_rest_api_targeting_template_status__e targeting_template_status_parseFromJSON(cJSON *targeting_template_statusJSON);

#endif /* _targeting_template_status_H_ */

