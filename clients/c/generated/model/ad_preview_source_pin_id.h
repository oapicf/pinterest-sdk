/*
 * ad_preview_source_pin_id.h
 *
 * Ad preview source from an existing Pin.
 */

#ifndef _ad_preview_source_pin_id_H_
#define _ad_preview_source_pin_id_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_source_pin_id_t ad_preview_source_pin_id_t;

#include "ad_pin_preview_creative_type.h"



typedef struct ad_preview_source_pin_id_t {
    ad_pin_preview_creative_type_t *creative_type; // custom
    char *pin_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_preview_source_pin_id_t;

__attribute__((deprecated)) ad_preview_source_pin_id_t *ad_preview_source_pin_id_create(
    ad_pin_preview_creative_type_t *creative_type,
    char *pin_id
);

void ad_preview_source_pin_id_free(ad_preview_source_pin_id_t *ad_preview_source_pin_id);

ad_preview_source_pin_id_t *ad_preview_source_pin_id_parseFromJSON(cJSON *ad_preview_source_pin_idJSON);

cJSON *ad_preview_source_pin_id_convertToJSON(ad_preview_source_pin_id_t *ad_preview_source_pin_id);

#endif /* _ad_preview_source_pin_id_H_ */

