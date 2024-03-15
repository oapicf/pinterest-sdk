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
    int lookback_window; //numeric
    list_t *tag_types; //primitive container
    int exclusion_window; //numeric

} targeting_spec_shopping_retargeting_t;

targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_create(
    int lookback_window,
    list_t *tag_types,
    int exclusion_window
);

void targeting_spec_shopping_retargeting_free(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting);

targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_parseFromJSON(cJSON *targeting_spec_shopping_retargetingJSON);

cJSON *targeting_spec_shopping_retargeting_convertToJSON(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting);

#endif /* _targeting_spec_shopping_retargeting_H_ */

