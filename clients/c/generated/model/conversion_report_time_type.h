/*
 * conversion_report_time_type.h
 *
 * Conversion report time type
 */

#ifndef _conversion_report_time_type_H_
#define _conversion_report_time_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_report_time_type_t conversion_report_time_type_t;


// Enum  for conversion_report_time_type

typedef enum { pinterest_rest_api_conversion_report_time_type__NULL = 0, pinterest_rest_api_conversion_report_time_type__TIME_OF_AD_ACTION, pinterest_rest_api_conversion_report_time_type__TIME_OF_CONVERSION } pinterest_rest_api_conversion_report_time_type__e;

char* conversion_report_time_type_conversion_report_time_type_ToString(pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type);

pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type_conversion_report_time_type_FromString(char* conversion_report_time_type);

//cJSON *conversion_report_time_type_conversion_report_time_type_convertToJSON(pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type);

//pinterest_rest_api_conversion_report_time_type__e conversion_report_time_type_conversion_report_time_type_parseFromJSON(cJSON *conversion_report_time_typeJSON);

#endif /* _conversion_report_time_type_H_ */

