/*
 * pin_media_source_pin_url.h
 *
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */

#ifndef _pin_media_source_pin_url_H_
#define _pin_media_source_pin_url_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_pin_url_t pin_media_source_pin_url_t;


// Enum SOURCETYPE for pin_media_source_pin_url

typedef enum  { pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_pin_url } pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e;

char* pin_media_source_pin_url_source_type_ToString(pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e pin_media_source_pin_url_source_type_FromString(char* source_type);



typedef struct pin_media_source_pin_url_t {
    pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_type; //enum
    int is_affiliate_link; //boolean

} pin_media_source_pin_url_t;

pin_media_source_pin_url_t *pin_media_source_pin_url_create(
    pinterest_rest_api_pin_media_source_pin_url_SOURCETYPE_e source_type,
    int is_affiliate_link
);

void pin_media_source_pin_url_free(pin_media_source_pin_url_t *pin_media_source_pin_url);

pin_media_source_pin_url_t *pin_media_source_pin_url_parseFromJSON(cJSON *pin_media_source_pin_urlJSON);

cJSON *pin_media_source_pin_url_convertToJSON(pin_media_source_pin_url_t *pin_media_source_pin_url);

#endif /* _pin_media_source_pin_url_H_ */

