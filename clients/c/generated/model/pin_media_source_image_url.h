/*
 * pin_media_source_image_url.h
 *
 * Image URL-based media source
 */

#ifndef _pin_media_source_image_url_H_
#define _pin_media_source_image_url_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_image_url_t pin_media_source_image_url_t;


// Enum SOURCETYPE for pin_media_source_image_url

typedef enum  { pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_image_url } pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e;

char* pin_media_source_image_url_source_type_ToString(pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e pin_media_source_image_url_source_type_FromString(char* source_type);



typedef struct pin_media_source_image_url_t {
    pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type; //enum
    char *url; // string
    int is_standard; //boolean

} pin_media_source_image_url_t;

pin_media_source_image_url_t *pin_media_source_image_url_create(
    pinterest_rest_api_pin_media_source_image_url_SOURCETYPE_e source_type,
    char *url,
    int is_standard
);

void pin_media_source_image_url_free(pin_media_source_image_url_t *pin_media_source_image_url);

pin_media_source_image_url_t *pin_media_source_image_url_parseFromJSON(cJSON *pin_media_source_image_urlJSON);

cJSON *pin_media_source_image_url_convertToJSON(pin_media_source_image_url_t *pin_media_source_image_url);

#endif /* _pin_media_source_image_url_H_ */

