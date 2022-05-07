/*
 * action_type.h
 *
 * Ad group billable event type.
 */

#ifndef _action_type_H_
#define _action_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct action_type_t action_type_t;


// Enum  for action_type

typedef enum { pinterest_rest_api_action_type__NULL = 0, pinterest_rest_api_action_type__CLICKTHROUGH, pinterest_rest_api_action_type__IMPRESSION, pinterest_rest_api_action_type__VIDEO_V_50_MRC, pinterest_rest_api_action_type__BILLABLE_ENGAGEMENT } pinterest_rest_api_action_type__e;

char* action_type_action_type_ToString(pinterest_rest_api_action_type__e action_type);

pinterest_rest_api_action_type__e action_type_action_type_FromString(char* action_type);

//cJSON *action_type_action_type_convertToJSON(pinterest_rest_api_action_type__e action_type);

//pinterest_rest_api_action_type__e action_type_action_type_parseFromJSON(cJSON *action_typeJSON);

#endif /* _action_type_H_ */

