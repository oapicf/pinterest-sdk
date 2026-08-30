/*
 * promotion_application_level.h
 *
 * Specify if the promotion is applied at ad group or item level.
 */

#ifndef _promotion_application_level_H_
#define _promotion_application_level_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_application_level_t promotion_application_level_t;


// Enum  for promotion_application_level

typedef enum { pinterest_rest_api_promotion_application_level__NULL = 0, pinterest_rest_api_promotion_application_level__NONE, pinterest_rest_api_promotion_application_level__ITEM, pinterest_rest_api_promotion_application_level__AD_GROUP } pinterest_rest_api_promotion_application_level__e;

char* promotion_application_level_promotion_application_level_ToString(pinterest_rest_api_promotion_application_level__e promotion_application_level);

pinterest_rest_api_promotion_application_level__e promotion_application_level_promotion_application_level_FromString(char* promotion_application_level);

cJSON *promotion_application_level_convertToJSON(pinterest_rest_api_promotion_application_level__e promotion_application_level);

pinterest_rest_api_promotion_application_level__e promotion_application_level_parseFromJSON(cJSON *promotion_application_levelJSON);

#endif /* _promotion_application_level_H_ */

