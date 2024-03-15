/*
 * quiz_pin_result.h
 *
 * The result, and link out, based on the user’s choice.
 */

#ifndef _quiz_pin_result_H_
#define _quiz_pin_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quiz_pin_result_t quiz_pin_result_t;




typedef struct quiz_pin_result_t {
    char *organic_pin_id; // string
    char *android_deep_link; // string
    char *ios_deep_link; // string
    char *destination_url; // string
    double result_id; //numeric

} quiz_pin_result_t;

quiz_pin_result_t *quiz_pin_result_create(
    char *organic_pin_id,
    char *android_deep_link,
    char *ios_deep_link,
    char *destination_url,
    double result_id
);

void quiz_pin_result_free(quiz_pin_result_t *quiz_pin_result);

quiz_pin_result_t *quiz_pin_result_parseFromJSON(cJSON *quiz_pin_resultJSON);

cJSON *quiz_pin_result_convertToJSON(quiz_pin_result_t *quiz_pin_result);

#endif /* _quiz_pin_result_H_ */

