/*
 * ad_pin_id.h
 *
 * 
 */

#ifndef _ad_pin_id_H_
#define _ad_pin_id_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_pin_id_t ad_pin_id_t;




typedef struct ad_pin_id_t {
    char *pin_id; // string

} ad_pin_id_t;

ad_pin_id_t *ad_pin_id_create(
    char *pin_id
);

void ad_pin_id_free(ad_pin_id_t *ad_pin_id);

ad_pin_id_t *ad_pin_id_parseFromJSON(cJSON *ad_pin_idJSON);

cJSON *ad_pin_id_convertToJSON(ad_pin_id_t *ad_pin_id);

#endif /* _ad_pin_id_H_ */

