/*
 * enhanced_match_status_type.h
 *
 * The enhanced match status of the tag
 */

#ifndef _enhanced_match_status_type_H_
#define _enhanced_match_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct enhanced_match_status_type_t enhanced_match_status_type_t;


// Enum  for enhanced_match_status_type

typedef enum { pinterest_rest_api_enhanced_match_status_type__NULL = 0, pinterest_rest_api_enhanced_match_status_type__UNKNOWN, pinterest_rest_api_enhanced_match_status_type__NOT_VALIDATED, pinterest_rest_api_enhanced_match_status_type__VALIDATING_IN_PROGRESS, pinterest_rest_api_enhanced_match_status_type__VALIDATION_COMPLETE, pinterest_rest_api_enhanced_match_status_type__null } pinterest_rest_api_enhanced_match_status_type__e;

char* enhanced_match_status_type_enhanced_match_status_type_ToString(pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type);

pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type_enhanced_match_status_type_FromString(char* enhanced_match_status_type);

//cJSON *enhanced_match_status_type_enhanced_match_status_type_convertToJSON(pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type);

//pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status_type_enhanced_match_status_type_parseFromJSON(cJSON *enhanced_match_status_typeJSON);

#endif /* _enhanced_match_status_type_H_ */

