/*
 * quiz_pin_question.h
 *
 * A specific quiz inquiry.
 */

#ifndef _quiz_pin_question_H_
#define _quiz_pin_question_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quiz_pin_question_t quiz_pin_question_t;

#include "quiz_pin_option.h"



typedef struct quiz_pin_question_t {
    double question_id; //numeric
    char *question_text; // string
    list_t *options; //nonprimitive container

} quiz_pin_question_t;

quiz_pin_question_t *quiz_pin_question_create(
    double question_id,
    char *question_text,
    list_t *options
);

void quiz_pin_question_free(quiz_pin_question_t *quiz_pin_question);

quiz_pin_question_t *quiz_pin_question_parseFromJSON(cJSON *quiz_pin_questionJSON);

cJSON *quiz_pin_question_convertToJSON(quiz_pin_question_t *quiz_pin_question);

#endif /* _quiz_pin_question_H_ */

