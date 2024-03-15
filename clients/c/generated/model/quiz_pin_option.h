/*
 * quiz_pin_option.h
 *
 *  This field contains multiple options to a quiz question.
 */

#ifndef _quiz_pin_option_H_
#define _quiz_pin_option_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quiz_pin_option_t quiz_pin_option_t;




typedef struct quiz_pin_option_t {
    double id; //numeric
    char *text; // string

} quiz_pin_option_t;

quiz_pin_option_t *quiz_pin_option_create(
    double id,
    char *text
);

void quiz_pin_option_free(quiz_pin_option_t *quiz_pin_option);

quiz_pin_option_t *quiz_pin_option_parseFromJSON(cJSON *quiz_pin_optionJSON);

cJSON *quiz_pin_option_convertToJSON(quiz_pin_option_t *quiz_pin_option);

#endif /* _quiz_pin_option_H_ */

