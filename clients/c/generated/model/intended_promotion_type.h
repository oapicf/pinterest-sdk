/*
 * intended_promotion_type.h
 *
 * Specifies the intended promotion type for the campaign.  Note: This field is immutable unless the campaign is in draft status.  **STANDARD_AD** - For ads derived from Pins. - Supported for all objective types except for current CATALOG\\_SALES and WEB\\_CONVERSION, which are being deprecated. - For simplified objective types.  **CATALOG** - For creating product group promotions. - Supported for CONSIDERATION and SALES objective types. - For simplified objective types.  **LEGACY** - Intended only for maintaining backward compatibility. - Must be used for CATALOG\\_SALES and WEB\\_CONVERSION. - Supported for CATALOG\\_SALES and WEB\\_CONVERSION objective types.  **If you do not provide this parameter, the default is:** - LEGACY for CATALOG\\_SALES and WEB\\_CONVERSION - STANDARD_AD for other objective types
 */

#ifndef _intended_promotion_type_H_
#define _intended_promotion_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct intended_promotion_type_t intended_promotion_type_t;


// Enum  for intended_promotion_type

typedef enum { pinterest_rest_api_intended_promotion_type__NULL = 0, pinterest_rest_api_intended_promotion_type__LEGACY, pinterest_rest_api_intended_promotion_type__STANDARD_AD, pinterest_rest_api_intended_promotion_type__CATALOG } pinterest_rest_api_intended_promotion_type__e;

char* intended_promotion_type_intended_promotion_type_ToString(pinterest_rest_api_intended_promotion_type__e intended_promotion_type);

pinterest_rest_api_intended_promotion_type__e intended_promotion_type_intended_promotion_type_FromString(char* intended_promotion_type);

cJSON *intended_promotion_type_convertToJSON(pinterest_rest_api_intended_promotion_type__e intended_promotion_type);

pinterest_rest_api_intended_promotion_type__e intended_promotion_type_parseFromJSON(cJSON *intended_promotion_typeJSON);

#endif /* _intended_promotion_type_H_ */

