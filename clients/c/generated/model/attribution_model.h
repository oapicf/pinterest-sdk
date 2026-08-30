/*
 * attribution_model.h
 *
 * Attribution model used to attribute the conversion event.
 */

#ifndef _attribution_model_H_
#define _attribution_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attribution_model_t attribution_model_t;


// Enum  for attribution_model

typedef enum { pinterest_rest_api_attribution_model__NULL = 0, pinterest_rest_api_attribution_model__first_touch, pinterest_rest_api_attribution_model__last_touch, pinterest_rest_api_attribution_model__multi_touch, pinterest_rest_api_attribution_model__mmm } pinterest_rest_api_attribution_model__e;

char* attribution_model_attribution_model_ToString(pinterest_rest_api_attribution_model__e attribution_model);

pinterest_rest_api_attribution_model__e attribution_model_attribution_model_FromString(char* attribution_model);

cJSON *attribution_model_convertToJSON(pinterest_rest_api_attribution_model__e attribution_model);

pinterest_rest_api_attribution_model__e attribution_model_parseFromJSON(cJSON *attribution_modelJSON);

#endif /* _attribution_model_H_ */

