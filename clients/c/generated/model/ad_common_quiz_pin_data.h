/*
 * ad_common_quiz_pin_data.h
 *
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 */

#ifndef _ad_common_quiz_pin_data_H_
#define _ad_common_quiz_pin_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_common_quiz_pin_data_t ad_common_quiz_pin_data_t;

#include "quiz_pin_question.h"
#include "quiz_pin_result.h"



typedef struct ad_common_quiz_pin_data_t {
    list_t *questions; //nonprimitive container
    list_t *results; //nonprimitive container

} ad_common_quiz_pin_data_t;

ad_common_quiz_pin_data_t *ad_common_quiz_pin_data_create(
    list_t *questions,
    list_t *results
);

void ad_common_quiz_pin_data_free(ad_common_quiz_pin_data_t *ad_common_quiz_pin_data);

ad_common_quiz_pin_data_t *ad_common_quiz_pin_data_parseFromJSON(cJSON *ad_common_quiz_pin_dataJSON);

cJSON *ad_common_quiz_pin_data_convertToJSON(ad_common_quiz_pin_data_t *ad_common_quiz_pin_data);

#endif /* _ad_common_quiz_pin_data_H_ */

