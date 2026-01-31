/*
 * interests_enum.h
 *
 * 
 */

#ifndef _interests_enum_H_
#define _interests_enum_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct interests_enum_t interests_enum_t;


// Enum  for interests_enum

typedef enum { pinterest_rest_api_interests_enum__NULL = 0, pinterest_rest_api_interests_enum__ALL, pinterest_rest_api_interests_enum__ANIMALS, pinterest_rest_api_interests_enum__ARCHITECTURE, pinterest_rest_api_interests_enum__ART, pinterest_rest_api_interests_enum__BEAUTY, pinterest_rest_api_interests_enum__DIY_AND_CRAFTS, pinterest_rest_api_interests_enum__EDUCATION, pinterest_rest_api_interests_enum__EVENT_PLANNING, pinterest_rest_api_interests_enum__FASHION, pinterest_rest_api_interests_enum__FOOD_AND_DRINKS, pinterest_rest_api_interests_enum__GARDENING, pinterest_rest_api_interests_enum__HEALTH, pinterest_rest_api_interests_enum__HOME_DECOR, pinterest_rest_api_interests_enum__PARENTING, pinterest_rest_api_interests_enum__TRAVEL, pinterest_rest_api_interests_enum__WEDDING } pinterest_rest_api_interests_enum__e;

char* interests_enum_interests_enum_ToString(pinterest_rest_api_interests_enum__e interests_enum);

pinterest_rest_api_interests_enum__e interests_enum_interests_enum_FromString(char* interests_enum);

cJSON *interests_enum_convertToJSON(pinterest_rest_api_interests_enum__e interests_enum);

pinterest_rest_api_interests_enum__e interests_enum_parseFromJSON(cJSON *interests_enumJSON);

#endif /* _interests_enum_H_ */

