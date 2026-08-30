/*
 * msot_event_name.h
 *
 * Type of user conversion event.
 */

#ifndef _msot_event_name_H_
#define _msot_event_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct msot_event_name_t msot_event_name_t;


// Enum  for msot_event_name

typedef enum { pinterest_rest_api_msot_event_name__NULL = 0, pinterest_rest_api_msot_event_name__add_to_cart, pinterest_rest_api_msot_event_name__checkout, pinterest_rest_api_msot_event_name__lead, pinterest_rest_api_msot_event_name__signup } pinterest_rest_api_msot_event_name__e;

char* msot_event_name_msot_event_name_ToString(pinterest_rest_api_msot_event_name__e msot_event_name);

pinterest_rest_api_msot_event_name__e msot_event_name_msot_event_name_FromString(char* msot_event_name);

cJSON *msot_event_name_convertToJSON(pinterest_rest_api_msot_event_name__e msot_event_name);

pinterest_rest_api_msot_event_name__e msot_event_name_parseFromJSON(cJSON *msot_event_nameJSON);

#endif /* _msot_event_name_H_ */

