/*
 * user_list_operation_type.h
 *
 * User list operation type (add or remove)
 */

#ifndef _user_list_operation_type_H_
#define _user_list_operation_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_list_operation_type_t user_list_operation_type_t;


// Enum  for user_list_operation_type

typedef enum { pinterest_rest_api_user_list_operation_type__NULL = 0, pinterest_rest_api_user_list_operation_type__ADD, pinterest_rest_api_user_list_operation_type___REMOVE } pinterest_rest_api_user_list_operation_type__e;

char* user_list_operation_type_user_list_operation_type_ToString(pinterest_rest_api_user_list_operation_type__e user_list_operation_type);

pinterest_rest_api_user_list_operation_type__e user_list_operation_type_user_list_operation_type_FromString(char* user_list_operation_type);

//cJSON *user_list_operation_type_user_list_operation_type_convertToJSON(pinterest_rest_api_user_list_operation_type__e user_list_operation_type);

//pinterest_rest_api_user_list_operation_type__e user_list_operation_type_user_list_operation_type_parseFromJSON(cJSON *user_list_operation_typeJSON);

#endif /* _user_list_operation_type_H_ */

