/*
 * network_type.h
 *
 * Type of network connection.
 */

#ifndef _network_type_H_
#define _network_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct network_type_t network_type_t;


// Enum  for network_type

typedef enum { pinterest_rest_api_network_type__NULL = 0, pinterest_rest_api_network_type__wifi, pinterest_rest_api_network_type__cellular_2g, pinterest_rest_api_network_type__cellular_3g, pinterest_rest_api_network_type__cellular_4g, pinterest_rest_api_network_type__cellular_5g, pinterest_rest_api_network_type__cellular_6g, pinterest_rest_api_network_type__ethernet, pinterest_rest_api_network_type__unknown } pinterest_rest_api_network_type__e;

char* network_type_network_type_ToString(pinterest_rest_api_network_type__e network_type);

pinterest_rest_api_network_type__e network_type_network_type_FromString(char* network_type);

cJSON *network_type_convertToJSON(pinterest_rest_api_network_type__e network_type);

pinterest_rest_api_network_type__e network_type_parseFromJSON(cJSON *network_typeJSON);

#endif /* _network_type_H_ */

