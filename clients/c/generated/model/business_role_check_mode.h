/*
 * business_role_check_mode.h
 *
 * Specifies if the partner is internal or external.
 */

#ifndef _business_role_check_mode_H_
#define _business_role_check_mode_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_role_check_mode_t business_role_check_mode_t;


// Enum  for business_role_check_mode

typedef enum { pinterest_rest_api_business_role_check_mode__NULL = 0, pinterest_rest_api_business_role_check_mode__INTERNAL, pinterest_rest_api_business_role_check_mode__EXTERNAL } pinterest_rest_api_business_role_check_mode__e;

char* business_role_check_mode_business_role_check_mode_ToString(pinterest_rest_api_business_role_check_mode__e business_role_check_mode);

pinterest_rest_api_business_role_check_mode__e business_role_check_mode_business_role_check_mode_FromString(char* business_role_check_mode);

//cJSON *business_role_check_mode_business_role_check_mode_convertToJSON(pinterest_rest_api_business_role_check_mode__e business_role_check_mode);

//pinterest_rest_api_business_role_check_mode__e business_role_check_mode_business_role_check_mode_parseFromJSON(cJSON *business_role_check_modeJSON);

#endif /* _business_role_check_mode_H_ */

