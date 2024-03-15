/*
 * summary_pin_media.h
 *
 * 
 */

#ifndef _summary_pin_media_H_
#define _summary_pin_media_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct summary_pin_media_t summary_pin_media_t;

#include "pin_media.h"



typedef struct summary_pin_media_t {
    char *media_type; // string

} summary_pin_media_t;

summary_pin_media_t *summary_pin_media_create(
    char *media_type
);

void summary_pin_media_free(summary_pin_media_t *summary_pin_media);

summary_pin_media_t *summary_pin_media_parseFromJSON(cJSON *summary_pin_mediaJSON);

cJSON *summary_pin_media_convertToJSON(summary_pin_media_t *summary_pin_media);

#endif /* _summary_pin_media_H_ */

