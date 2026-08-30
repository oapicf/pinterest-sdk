/*
 * attribution_action_type.h
 *
 * Type of an attributed action.
 */

#ifndef _attribution_action_type_H_
#define _attribution_action_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attribution_action_type_t attribution_action_type_t;


// Enum  for attribution_action_type

typedef enum { pinterest_rest_api_attribution_action_type__NULL = 0, pinterest_rest_api_attribution_action_type__view, pinterest_rest_api_attribution_action_type__click } pinterest_rest_api_attribution_action_type__e;

char* attribution_action_type_attribution_action_type_ToString(pinterest_rest_api_attribution_action_type__e attribution_action_type);

pinterest_rest_api_attribution_action_type__e attribution_action_type_attribution_action_type_FromString(char* attribution_action_type);

cJSON *attribution_action_type_convertToJSON(pinterest_rest_api_attribution_action_type__e attribution_action_type);

pinterest_rest_api_attribution_action_type__e attribution_action_type_parseFromJSON(cJSON *attribution_action_typeJSON);

#endif /* _attribution_action_type_H_ */

