/*
 * summary_pin.h
 *
 * Summarized pin information
 */

#ifndef _summary_pin_H_
#define _summary_pin_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct summary_pin_t summary_pin_t;

#include "summary_pin_media.h"



typedef struct summary_pin_t {
    struct summary_pin_media_t *media; //model
    char *alt_text; // string
    char *link; // string
    char *title; // string
    char *description; // string

} summary_pin_t;

summary_pin_t *summary_pin_create(
    summary_pin_media_t *media,
    char *alt_text,
    char *link,
    char *title,
    char *description
);

void summary_pin_free(summary_pin_t *summary_pin);

summary_pin_t *summary_pin_parseFromJSON(cJSON *summary_pinJSON);

cJSON *summary_pin_convertToJSON(summary_pin_t *summary_pin);

#endif /* _summary_pin_H_ */

