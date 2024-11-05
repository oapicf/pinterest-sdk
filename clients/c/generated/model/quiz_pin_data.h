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

// Enum TIEBREAKERTYPE for quiz_pin_data

typedef enum  { pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_NULL = 0, pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_RANDOM, pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_CUSTOM } pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e;

char* quiz_pin_data_tie_breaker_type_ToString(pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e tie_breaker_type);

pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e quiz_pin_data_tie_breaker_type_FromString(char* tie_breaker_type);



typedef struct quiz_pin_data_t {
    list_t *questions; //nonprimitive container
    list_t *results; //nonprimitive container
    pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e tie_breaker_type; //enum
    struct quiz_pin_result_t *tie_breaker_custom_result; //model

} quiz_pin_data_t;

quiz_pin_data_t *quiz_pin_data_create(
    list_t *questions,
    list_t *results,
    pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e tie_breaker_type,
    quiz_pin_result_t *tie_breaker_custom_result
);

void quiz_pin_data_free(quiz_pin_data_t *quiz_pin_data);

quiz_pin_data_t *quiz_pin_data_parseFromJSON(cJSON *quiz_pin_dataJSON);

cJSON *quiz_pin_data_convertToJSON(quiz_pin_data_t *quiz_pin_data);

#endif /* _quiz_pin_data_H_ */

