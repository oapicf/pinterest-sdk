/*
 * ad_preview_create_from_pin.h
 *
 * 
 */

#ifndef _ad_preview_create_from_pin_H_
#define _ad_preview_create_from_pin_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_create_from_pin_t ad_preview_create_from_pin_t;




typedef struct ad_preview_create_from_pin_t {
    char *pin_id; // string

} ad_preview_create_from_pin_t;

ad_preview_create_from_pin_t *ad_preview_create_from_pin_create(
    char *pin_id
);

void ad_preview_create_from_pin_free(ad_preview_create_from_pin_t *ad_preview_create_from_pin);

ad_preview_create_from_pin_t *ad_preview_create_from_pin_parseFromJSON(cJSON *ad_preview_create_from_pinJSON);

cJSON *ad_preview_create_from_pin_convertToJSON(ad_preview_create_from_pin_t *ad_preview_create_from_pin);

#endif /* _ad_preview_create_from_pin_H_ */

