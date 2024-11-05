/*
 * update_mask_bid_option_field.h
 *
 * bid option field to apply operation updates to
 */

#ifndef _update_mask_bid_option_field_H_
#define _update_mask_bid_option_field_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_mask_bid_option_field_t update_mask_bid_option_field_t;


// Enum  for update_mask_bid_option_field

typedef enum { pinterest_rest_api_update_mask_bid_option_field__NULL = 0, pinterest_rest_api_update_mask_bid_option_field__BID, pinterest_rest_api_update_mask_bid_option_field__APP_TYPE_BID_MULTIPLIER_SET, pinterest_rest_api_update_mask_bid_option_field__PLACEMENT_BID_MULTIPLIER_SET } pinterest_rest_api_update_mask_bid_option_field__e;

char* update_mask_bid_option_field_update_mask_bid_option_field_ToString(pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field);

pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field_update_mask_bid_option_field_FromString(char* update_mask_bid_option_field);

//cJSON *update_mask_bid_option_field_update_mask_bid_option_field_convertToJSON(pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field);

//pinterest_rest_api_update_mask_bid_option_field__e update_mask_bid_option_field_update_mask_bid_option_field_parseFromJSON(cJSON *update_mask_bid_option_fieldJSON);

#endif /* _update_mask_bid_option_field_H_ */

