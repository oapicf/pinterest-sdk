/*
 * change_history_data_type.h
 *
 * 
 */

#ifndef _change_history_data_type_H_
#define _change_history_data_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct change_history_data_type_t change_history_data_type_t;


// Enum  for change_history_data_type

typedef enum { pinterest_rest_api_change_history_data_type__NULL = 0, pinterest_rest_api_change_history_data_type__STRING, pinterest_rest_api_change_history_data_type__NUMERIC, pinterest_rest_api_change_history_data_type__MICROCURRENCY, pinterest_rest_api_change_history_data_type__DATE, pinterest_rest_api_change_history_data_type___BOOL, pinterest_rest_api_change_history_data_type__GENDER_LIST, pinterest_rest_api_change_history_data_type__AGE_BUCKET_LIST, pinterest_rest_api_change_history_data_type__APPTYPE_LIST, pinterest_rest_api_change_history_data_type__COUNTRY_LIST, pinterest_rest_api_change_history_data_type__LOCALE_LIST } pinterest_rest_api_change_history_data_type__e;

char* change_history_data_type_change_history_data_type_ToString(pinterest_rest_api_change_history_data_type__e change_history_data_type);

pinterest_rest_api_change_history_data_type__e change_history_data_type_change_history_data_type_FromString(char* change_history_data_type);

cJSON *change_history_data_type_convertToJSON(pinterest_rest_api_change_history_data_type__e change_history_data_type);

pinterest_rest_api_change_history_data_type__e change_history_data_type_parseFromJSON(cJSON *change_history_data_typeJSON);

#endif /* _change_history_data_type_H_ */

