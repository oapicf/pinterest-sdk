/*
 * targeting_spec_gender.h
 *
 * 
 */

#ifndef _targeting_spec_gender_H_
#define _targeting_spec_gender_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_gender_t targeting_spec_gender_t;


// Enum  for targeting_spec_gender

typedef enum { pinterest_rest_api_targeting_spec_gender__NULL = 0, pinterest_rest_api_targeting_spec_gender__unknown, pinterest_rest_api_targeting_spec_gender__male, pinterest_rest_api_targeting_spec_gender__female } pinterest_rest_api_targeting_spec_gender__e;

char* targeting_spec_gender_targeting_spec_gender_ToString(pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender);

pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender_targeting_spec_gender_FromString(char* targeting_spec_gender);

cJSON *targeting_spec_gender_convertToJSON(pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender);

pinterest_rest_api_targeting_spec_gender__e targeting_spec_gender_parseFromJSON(cJSON *targeting_spec_genderJSON);

#endif /* _targeting_spec_gender_H_ */

