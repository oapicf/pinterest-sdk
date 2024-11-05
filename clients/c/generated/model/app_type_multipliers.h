/*
 * app_type_multipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _app_type_multipliers_H_
#define _app_type_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct app_type_multipliers_t app_type_multipliers_t;

#include "targeting_spec_app_type.h"

// Enum  for app_type_multipliers

typedef enum  { pinterest_rest_api_app_type_multipliers__NULL = 0, pinterest_rest_api_app_type_multipliers__android_mobile, pinterest_rest_api_app_type_multipliers__android_tablet, pinterest_rest_api_app_type_multipliers__ipad, pinterest_rest_api_app_type_multipliers__iphone, pinterest_rest_api_app_type_multipliers__web, pinterest_rest_api_app_type_multipliers__web_mobile } pinterest_rest_api_app_type_multipliers__e;

char* app_type_multipliers_app_type_ToString(pinterest_rest_api_app_type_multipliers__e app_type);

pinterest_rest_api_app_type_multipliers__e app_type_multipliers_app_type_FromString(char* app_type);



typedef struct app_type_multipliers_t {
    targeting_spec_app_type_t *app_type; // custom

} app_type_multipliers_t;

app_type_multipliers_t *app_type_multipliers_create(
    targeting_spec_app_type_t *app_type
);

void app_type_multipliers_free(app_type_multipliers_t *app_type_multipliers);

app_type_multipliers_t *app_type_multipliers_parseFromJSON(cJSON *app_type_multipliersJSON);

cJSON *app_type_multipliers_convertToJSON(app_type_multipliers_t *app_type_multipliers);

#endif /* _app_type_multipliers_H_ */

