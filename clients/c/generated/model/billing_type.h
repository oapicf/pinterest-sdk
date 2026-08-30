/*
 * billing_type.h
 *
 * Advertisers billing type
 */

#ifndef _billing_type_H_
#define _billing_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_type_t billing_type_t;


// Enum  for billing_type

typedef enum { pinterest_rest_api_billing_type__NULL = 0, pinterest_rest_api_billing_type__CREDIT_CARD, pinterest_rest_api_billing_type__INVOICE, pinterest_rest_api_billing_type__INTERNAL, pinterest_rest_api_billing_type__RECURRING, pinterest_rest_api_billing_type__PREPAID } pinterest_rest_api_billing_type__e;

char* billing_type_billing_type_ToString(pinterest_rest_api_billing_type__e billing_type);

pinterest_rest_api_billing_type__e billing_type_billing_type_FromString(char* billing_type);

cJSON *billing_type_convertToJSON(pinterest_rest_api_billing_type__e billing_type);

pinterest_rest_api_billing_type__e billing_type_parseFromJSON(cJSON *billing_typeJSON);

#endif /* _billing_type_H_ */

