/*
 * ineligible_product_tag_reason.h
 *
 * Reason why a product pin is ineligible for tagging.
 */

#ifndef _ineligible_product_tag_reason_H_
#define _ineligible_product_tag_reason_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ineligible_product_tag_reason_t ineligible_product_tag_reason_t;


// Enum  for ineligible_product_tag_reason

typedef enum { pinterest_rest_api_ineligible_product_tag_reason__NULL = 0, pinterest_rest_api_ineligible_product_tag_reason__PIN_MISSING, pinterest_rest_api_ineligible_product_tag_reason__PIN_IS_PRIVATE, pinterest_rest_api_ineligible_product_tag_reason__PRODUCT_METADATA_MISSING, pinterest_rest_api_ineligible_product_tag_reason__PIN_NOT_FROM_VERIFIED_DOMAIN, pinterest_rest_api_ineligible_product_tag_reason__PIN_NOT_FROM_SAME_USER_AS_HERO_PIN } pinterest_rest_api_ineligible_product_tag_reason__e;

char* ineligible_product_tag_reason_ineligible_product_tag_reason_ToString(pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason);

pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason_ineligible_product_tag_reason_FromString(char* ineligible_product_tag_reason);

cJSON *ineligible_product_tag_reason_convertToJSON(pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason);

pinterest_rest_api_ineligible_product_tag_reason__e ineligible_product_tag_reason_parseFromJSON(cJSON *ineligible_product_tag_reasonJSON);

#endif /* _ineligible_product_tag_reason_H_ */

