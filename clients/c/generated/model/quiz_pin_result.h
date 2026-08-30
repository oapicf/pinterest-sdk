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
    char *android_deep_link; // string
    char *destination_url; // string
    char *ios_deep_link; // string
    char *organic_pin_id; // string
    double *result_id; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} quiz_pin_result_t;

__attribute__((deprecated)) quiz_pin_result_t *quiz_pin_result_create(
    char *android_deep_link,
    char *destination_url,
    char *ios_deep_link,
    char *organic_pin_id,
    double *result_id
);

void quiz_pin_result_free(quiz_pin_result_t *quiz_pin_result);

quiz_pin_result_t *quiz_pin_result_parseFromJSON(cJSON *quiz_pin_resultJSON);

cJSON *quiz_pin_result_convertToJSON(quiz_pin_result_t *quiz_pin_result);

#endif /* _quiz_pin_result_H_ */

