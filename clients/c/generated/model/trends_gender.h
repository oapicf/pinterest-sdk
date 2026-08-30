/*
 * trends_gender.h
 *
 * Gender category for trends demographic distribution.
 */

#ifndef _trends_gender_H_
#define _trends_gender_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_gender_t trends_gender_t;


// Enum  for trends_gender

typedef enum { pinterest_rest_api_trends_gender__NULL = 0, pinterest_rest_api_trends_gender__male, pinterest_rest_api_trends_gender__female, pinterest_rest_api_trends_gender__unspecified } pinterest_rest_api_trends_gender__e;

char* trends_gender_trends_gender_ToString(pinterest_rest_api_trends_gender__e trends_gender);

pinterest_rest_api_trends_gender__e trends_gender_trends_gender_FromString(char* trends_gender);

cJSON *trends_gender_convertToJSON(pinterest_rest_api_trends_gender__e trends_gender);

pinterest_rest_api_trends_gender__e trends_gender_parseFromJSON(cJSON *trends_genderJSON);

#endif /* _trends_gender_H_ */

