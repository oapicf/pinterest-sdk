/*
 * label_status.h
 *
 * The new status you want to give the label, either &#x60;ACTIVE&#x60; (in use) or no longer in use (&#x60;ARCHIVED&#x60;).
 */

#ifndef _label_status_H_
#define _label_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_status_t label_status_t;


// Enum  for label_status

typedef enum { pinterest_rest_api_label_status__NULL = 0, pinterest_rest_api_label_status__ACTIVE, pinterest_rest_api_label_status__ARCHIVED } pinterest_rest_api_label_status__e;

char* label_status_label_status_ToString(pinterest_rest_api_label_status__e label_status);

pinterest_rest_api_label_status__e label_status_label_status_FromString(char* label_status);

cJSON *label_status_convertToJSON(pinterest_rest_api_label_status__e label_status);

pinterest_rest_api_label_status__e label_status_parseFromJSON(cJSON *label_statusJSON);

#endif /* _label_status_H_ */

