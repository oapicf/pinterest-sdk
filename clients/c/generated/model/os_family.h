/*
 * os_family.h
 *
 * Operating system family.
 */

#ifndef _os_family_H_
#define _os_family_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct os_family_t os_family_t;


// Enum  for os_family

typedef enum { pinterest_rest_api_os_family__NULL = 0, pinterest_rest_api_os_family__ios, pinterest_rest_api_os_family__android, pinterest_rest_api_os_family__macos, pinterest_rest_api_os_family__windows, pinterest_rest_api_os_family___linux, pinterest_rest_api_os_family__bsd, pinterest_rest_api_os_family__other } pinterest_rest_api_os_family__e;

char* os_family_os_family_ToString(pinterest_rest_api_os_family__e os_family);

pinterest_rest_api_os_family__e os_family_os_family_FromString(char* os_family);

cJSON *os_family_convertToJSON(pinterest_rest_api_os_family__e os_family);

pinterest_rest_api_os_family__e os_family_parseFromJSON(cJSON *os_familyJSON);

#endif /* _os_family_H_ */

