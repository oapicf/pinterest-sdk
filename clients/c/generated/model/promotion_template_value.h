/*
 * promotion_template_value.h
 *
 * 
 */

#ifndef _promotion_template_value_H_
#define _promotion_template_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_template_value_t promotion_template_value_t;

#include "currency.h"



typedef struct promotion_template_value_t {
    double amount; //numeric
    pinterest_rest_api_currency__e currency_code; //referenced enum
    char *custom_text; // string
    double percent; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} promotion_template_value_t;

__attribute__((deprecated)) promotion_template_value_t *promotion_template_value_create(
    double amount,
    pinterest_rest_api_currency__e currency_code,
    char *custom_text,
    double percent
);

void promotion_template_value_free(promotion_template_value_t *promotion_template_value);

promotion_template_value_t *promotion_template_value_parseFromJSON(cJSON *promotion_template_valueJSON);

cJSON *promotion_template_value_convertToJSON(promotion_template_value_t *promotion_template_value);

#endif /* _promotion_template_value_H_ */

