/*
 * user_account_type.h
 *
 * 
 */

#ifndef _user_account_type_H_
#define _user_account_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_account_type_t user_account_type_t;


// Enum  for user_account_type

typedef enum { pinterest_rest_api_user_account_type__NULL = 0, pinterest_rest_api_user_account_type__PINNER, pinterest_rest_api_user_account_type__BUSINESS } pinterest_rest_api_user_account_type__e;

char* user_account_type_user_account_type_ToString(pinterest_rest_api_user_account_type__e user_account_type);

pinterest_rest_api_user_account_type__e user_account_type_user_account_type_FromString(char* user_account_type);

cJSON *user_account_type_convertToJSON(pinterest_rest_api_user_account_type__e user_account_type);

pinterest_rest_api_user_account_type__e user_account_type_parseFromJSON(cJSON *user_account_typeJSON);

#endif /* _user_account_type_H_ */

