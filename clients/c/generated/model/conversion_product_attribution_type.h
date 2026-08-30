/*
 * conversion_product_attribution_type.h
 *
 * Conversion product attribution level
 */

#ifndef _conversion_product_attribution_type_H_
#define _conversion_product_attribution_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_product_attribution_type_t conversion_product_attribution_type_t;


// Enum  for conversion_product_attribution_type

typedef enum { pinterest_rest_api_conversion_product_attribution_type__NULL = 0, pinterest_rest_api_conversion_product_attribution_type___DEFAULT, pinterest_rest_api_conversion_product_attribution_type__BRAND_ATTRIBUTION } pinterest_rest_api_conversion_product_attribution_type__e;

char* conversion_product_attribution_type_conversion_product_attribution_type_ToString(pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type);

pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type_conversion_product_attribution_type_FromString(char* conversion_product_attribution_type);

cJSON *conversion_product_attribution_type_convertToJSON(pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type);

pinterest_rest_api_conversion_product_attribution_type__e conversion_product_attribution_type_parseFromJSON(cJSON *conversion_product_attribution_typeJSON);

#endif /* _conversion_product_attribution_type_H_ */

