/*
 * pin_media.h
 *
 * Pin media objects.
 */

#ifndef _pin_media_H_
#define _pin_media_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_t pin_media_t;




typedef struct pin_media_t {
    char *media_type; // string

} pin_media_t;

pin_media_t *pin_media_create(
    char *media_type
);

void pin_media_free(pin_media_t *pin_media);

pin_media_t *pin_media_parseFromJSON(cJSON *pin_mediaJSON);

cJSON *pin_media_convertToJSON(pin_media_t *pin_media);

#endif /* _pin_media_H_ */

