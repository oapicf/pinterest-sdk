/*
 * conversion_tag_type.h
 *
 * conversion tag type
 */

#ifndef _conversion_tag_type_H_
#define _conversion_tag_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_type_t conversion_tag_type_t;


// Enum  for conversion_tag_type

typedef enum { pinterest_rest_api_conversion_tag_type__NULL = 0, pinterest_rest_api_conversion_tag_type__PAGE_LOAD, pinterest_rest_api_conversion_tag_type__UNKNOWN, pinterest_rest_api_conversion_tag_type__INITIALIZED, pinterest_rest_api_conversion_tag_type__PAGE_VISIT, pinterest_rest_api_conversion_tag_type__SIGNUP, pinterest_rest_api_conversion_tag_type__CHECKOUT, pinterest_rest_api_conversion_tag_type__CUSTOM, pinterest_rest_api_conversion_tag_type__VIEW_CATEGORY, pinterest_rest_api_conversion_tag_type__SEARCH, pinterest_rest_api_conversion_tag_type__ADD_TO_CART, pinterest_rest_api_conversion_tag_type__WATCH_VIDEO, pinterest_rest_api_conversion_tag_type__LEAD, pinterest_rest_api_conversion_tag_type__APP_INSTALL, pinterest_rest_api_conversion_tag_type__WEB_SESSION, pinterest_rest_api_conversion_tag_type__EXTERNAL_MEASUREMENT } pinterest_rest_api_conversion_tag_type__e;

char* conversion_tag_type_conversion_tag_type_ToString(pinterest_rest_api_conversion_tag_type__e conversion_tag_type);

pinterest_rest_api_conversion_tag_type__e conversion_tag_type_conversion_tag_type_FromString(char* conversion_tag_type);

//cJSON *conversion_tag_type_conversion_tag_type_convertToJSON(pinterest_rest_api_conversion_tag_type__e conversion_tag_type);

//pinterest_rest_api_conversion_tag_type__e conversion_tag_type_conversion_tag_type_parseFromJSON(cJSON *conversion_tag_typeJSON);

#endif /* _conversion_tag_type_H_ */

