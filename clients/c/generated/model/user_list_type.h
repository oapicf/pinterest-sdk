/*
 * user_list_type.h
 *
 * User list type
 */

#ifndef _user_list_type_H_
#define _user_list_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_list_type_t user_list_type_t;


// Enum  for user_list_type

typedef enum { pinterest_rest_api_user_list_type__NULL = 0, pinterest_rest_api_user_list_type__EMAIL, pinterest_rest_api_user_list_type__IDFA, pinterest_rest_api_user_list_type__MAID, pinterest_rest_api_user_list_type__LR_ID, pinterest_rest_api_user_list_type__DLX_ID, pinterest_rest_api_user_list_type__HASHED_PINNER_ID } pinterest_rest_api_user_list_type__e;

char* user_list_type_user_list_type_ToString(pinterest_rest_api_user_list_type__e user_list_type);

pinterest_rest_api_user_list_type__e user_list_type_user_list_type_FromString(char* user_list_type);

//cJSON *user_list_type_user_list_type_convertToJSON(pinterest_rest_api_user_list_type__e user_list_type);

//pinterest_rest_api_user_list_type__e user_list_type_user_list_type_parseFromJSON(cJSON *user_list_typeJSON);

#endif /* _user_list_type_H_ */

