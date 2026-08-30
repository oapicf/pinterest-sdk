/*
 * report_type.h
 *
 * 
 */

#ifndef _report_type_H_
#define _report_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct report_type_t report_type_t;


// Enum  for report_type

typedef enum { pinterest_rest_api_report_type__NULL = 0, pinterest_rest_api_report_type__SYNC, pinterest_rest_api_report_type__ASYNC } pinterest_rest_api_report_type__e;

char* report_type_report_type_ToString(pinterest_rest_api_report_type__e report_type);

pinterest_rest_api_report_type__e report_type_report_type_FromString(char* report_type);

cJSON *report_type_convertToJSON(pinterest_rest_api_report_type__e report_type);

pinterest_rest_api_report_type__e report_type_parseFromJSON(cJSON *report_typeJSON);

#endif /* _report_type_H_ */

