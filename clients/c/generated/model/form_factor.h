/*
 * form_factor.h
 *
 * Device form factor
 */

#ifndef _form_factor_H_
#define _form_factor_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct form_factor_t form_factor_t;


// Enum  for form_factor

typedef enum { pinterest_rest_api_form_factor__NULL = 0, pinterest_rest_api_form_factor__desktop, pinterest_rest_api_form_factor__laptop, pinterest_rest_api_form_factor__cellphone, pinterest_rest_api_form_factor__tablet, pinterest_rest_api_form_factor__smartwatch, pinterest_rest_api_form_factor__tv, pinterest_rest_api_form_factor__vr, pinterest_rest_api_form_factor__console, pinterest_rest_api_form_factor__other } pinterest_rest_api_form_factor__e;

char* form_factor_form_factor_ToString(pinterest_rest_api_form_factor__e form_factor);

pinterest_rest_api_form_factor__e form_factor_form_factor_FromString(char* form_factor);

cJSON *form_factor_convertToJSON(pinterest_rest_api_form_factor__e form_factor);

pinterest_rest_api_form_factor__e form_factor_parseFromJSON(cJSON *form_factorJSON);

#endif /* _form_factor_H_ */

