/*
 * nullable_label_status.h
 *
 * The new status you want to give the label, either &#x60;ACTIVE&#x60; (in use) or no longer in use (&#x60;ARCHIVED&#x60;).
 */

#ifndef _nullable_label_status_H_
#define _nullable_label_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nullable_label_status_t nullable_label_status_t;


// Enum  for nullable_label_status

typedef enum { pinterest_rest_api_nullable_label_status__NULL = 0, pinterest_rest_api_nullable_label_status__ACTIVE, pinterest_rest_api_nullable_label_status__ARCHIVED } pinterest_rest_api_nullable_label_status__e;

char* nullable_label_status_nullable_label_status_ToString(pinterest_rest_api_nullable_label_status__e nullable_label_status);

pinterest_rest_api_nullable_label_status__e nullable_label_status_nullable_label_status_FromString(char* nullable_label_status);

cJSON *nullable_label_status_convertToJSON(pinterest_rest_api_nullable_label_status__e nullable_label_status);

pinterest_rest_api_nullable_label_status__e nullable_label_status_parseFromJSON(cJSON *nullable_label_statusJSON);

#endif /* _nullable_label_status_H_ */

