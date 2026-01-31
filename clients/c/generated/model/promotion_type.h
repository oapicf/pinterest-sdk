/*
 * promotion_type.h
 *
 * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
 */

#ifndef _promotion_type_H_
#define _promotion_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_type_t promotion_type_t;


// Enum  for promotion_type

typedef enum { pinterest_rest_api_promotion_type__NULL = 0, pinterest_rest_api_promotion_type__VARIABLE, pinterest_rest_api_promotion_type__SITEWIDE, pinterest_rest_api_promotion_type__CHECKOUT, pinterest_rest_api_promotion_type__SAVE_X_ON_Y, pinterest_rest_api_promotion_type__BUY_X_GET_Y, pinterest_rest_api_promotion_type__SPEND_X_SAVE_Y, pinterest_rest_api_promotion_type__FREE_SHIPPING, pinterest_rest_api_promotion_type__FREE_SHIPPING_MINIMUM, pinterest_rest_api_promotion_type__FREE_SHIPPING_WITH_DISCOUNT, pinterest_rest_api_promotion_type__SITEWIDE_IN_STORES, pinterest_rest_api_promotion_type__EXTRA_PERCENT_OFF, pinterest_rest_api_promotion_type__GIFT_WITH_PURCHASE, pinterest_rest_api_promotion_type__GIFT_WITH_PURCHASE_MINIMUM, pinterest_rest_api_promotion_type__FIXED, pinterest_rest_api_promotion_type__PERCENT_OFF_CLEARANCE, pinterest_rest_api_promotion_type__X_OFF_Y, pinterest_rest_api_promotion_type__GIFT_WITH_FIRST_PURCHASE, pinterest_rest_api_promotion_type__BUY_X_GET_ONE_FREE, pinterest_rest_api_promotion_type__CASH_BACK, pinterest_rest_api_promotion_type__POINTS_ON_ALL_PURCHASES, pinterest_rest_api_promotion_type__BONUS, pinterest_rest_api_promotion_type__POINTS_WITH_PURCHASE, pinterest_rest_api_promotion_type__CUSTOM } pinterest_rest_api_promotion_type__e;

char* promotion_type_promotion_type_ToString(pinterest_rest_api_promotion_type__e promotion_type);

pinterest_rest_api_promotion_type__e promotion_type_promotion_type_FromString(char* promotion_type);

cJSON *promotion_type_convertToJSON(pinterest_rest_api_promotion_type__e promotion_type);

pinterest_rest_api_promotion_type__e promotion_type_parseFromJSON(cJSON *promotion_typeJSON);

#endif /* _promotion_type_H_ */

