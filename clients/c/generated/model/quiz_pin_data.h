/*
 * quiz_pin_data.h
 *
 * This field includes all quiz data including questions, options, and results.
 */

#ifndef _quiz_pin_data_H_
#define _quiz_pin_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quiz_pin_data_t quiz_pin_data_t;

#include "quiz_pin_question.h"
#include "quiz_pin_result.h"



typedef struct quiz_pin_data_t {
    list_t *questions; //nonprimitive container
    list_t *results; //nonprimitive container

} quiz_pin_data_t;

quiz_pin_data_t *quiz_pin_data_create(
    list_t *questions,
    list_t *results
);

void quiz_pin_data_free(quiz_pin_data_t *quiz_pin_data);

quiz_pin_data_t *quiz_pin_data_parseFromJSON(cJSON *quiz_pin_dataJSON);

cJSON *quiz_pin_data_convertToJSON(quiz_pin_data_t *quiz_pin_data);

#endif /* _quiz_pin_data_H_ */

