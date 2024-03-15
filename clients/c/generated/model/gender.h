/*
 * gender.h
 *
 * 
 */

#ifndef _gender_H_
#define _gender_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_t gender_t;


// Enum  for gender

typedef enum { pinterest_rest_api_gender__NULL = 0, pinterest_rest_api_gender__FEMALE, pinterest_rest_api_gender__MALE, pinterest_rest_api_gender__UNISEX } pinterest_rest_api_gender__e;

char* gender_gender_ToString(pinterest_rest_api_gender__e gender);

pinterest_rest_api_gender__e gender_gender_FromString(char* gender);

//cJSON *gender_gender_convertToJSON(pinterest_rest_api_gender__e gender);

//pinterest_rest_api_gender__e gender_gender_parseFromJSON(cJSON *genderJSON);

#endif /* _gender_H_ */

