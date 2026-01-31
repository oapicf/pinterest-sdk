/*
 * overall_status_options.h
 *
 * Overall status of event quality score.
 */

#ifndef _overall_status_options_H_
#define _overall_status_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct overall_status_options_t overall_status_options_t;


// Enum  for overall_status_options

typedef enum { pinterest_rest_api_overall_status_options__NULL = 0, pinterest_rest_api_overall_status_options__NEEDS_IMPROVEMENT, pinterest_rest_api_overall_status_options__FAIR, pinterest_rest_api_overall_status_options__GOOD } pinterest_rest_api_overall_status_options__e;

char* overall_status_options_overall_status_options_ToString(pinterest_rest_api_overall_status_options__e overall_status_options);

pinterest_rest_api_overall_status_options__e overall_status_options_overall_status_options_FromString(char* overall_status_options);

cJSON *overall_status_options_convertToJSON(pinterest_rest_api_overall_status_options__e overall_status_options);

pinterest_rest_api_overall_status_options__e overall_status_options_parseFromJSON(cJSON *overall_status_optionsJSON);

#endif /* _overall_status_options_H_ */

