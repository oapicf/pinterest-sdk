/*
 * targeting_spec_shopping_retargeting.h
 *
 * 
 */

#ifndef _targeting_spec_shopping_retargeting_H_
#define _targeting_spec_shopping_retargeting_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_shopping_retargeting_t targeting_spec_shopping_retargeting_t;




typedef struct targeting_spec_shopping_retargeting_t {
    int *exclusion_window; //numeric
    int *lookback_window; //numeric
    list_t *tag_types; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_shopping_retargeting_t;

__attribute__((deprecated)) targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_create(
    int *exclusion_window,
    int *lookback_window,
    list_t *tag_types
);

void targeting_spec_shopping_retargeting_free(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting);

targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_parseFromJSON(cJSON *targeting_spec_shopping_retargetingJSON);

cJSON *targeting_spec_shopping_retargeting_convertToJSON(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting);

#endif /* _targeting_spec_shopping_retargeting_H_ */

