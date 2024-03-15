/*
 * conversion_report_attribution_type.h
 *
 * Attribution type. Refers to the Pinterest Tag endpoints
 */

#ifndef _conversion_report_attribution_type_H_
#define _conversion_report_attribution_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_report_attribution_type_t conversion_report_attribution_type_t;


// Enum  for conversion_report_attribution_type

typedef enum { pinterest_rest_api_conversion_report_attribution_type__NULL = 0, pinterest_rest_api_conversion_report_attribution_type__INDIVIDUAL, pinterest_rest_api_conversion_report_attribution_type__HOUSEHOLD } pinterest_rest_api_conversion_report_attribution_type__e;

char* conversion_report_attribution_type_conversion_report_attribution_type_ToString(pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type);

pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type_conversion_report_attribution_type_FromString(char* conversion_report_attribution_type);

//cJSON *conversion_report_attribution_type_conversion_report_attribution_type_convertToJSON(pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type);

//pinterest_rest_api_conversion_report_attribution_type__e conversion_report_attribution_type_conversion_report_attribution_type_parseFromJSON(cJSON *conversion_report_attribution_typeJSON);

#endif /* _conversion_report_attribution_type_H_ */

