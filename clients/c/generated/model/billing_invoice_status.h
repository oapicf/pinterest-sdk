/*
 * billing_invoice_status.h
 *
 * The status of a billing invoice.
 */

#ifndef _billing_invoice_status_H_
#define _billing_invoice_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_invoice_status_t billing_invoice_status_t;


// Enum  for billing_invoice_status

typedef enum { pinterest_rest_api_billing_invoice_status__NULL = 0, pinterest_rest_api_billing_invoice_status__OPEN, pinterest_rest_api_billing_invoice_status__CLOSED } pinterest_rest_api_billing_invoice_status__e;

char* billing_invoice_status_billing_invoice_status_ToString(pinterest_rest_api_billing_invoice_status__e billing_invoice_status);

pinterest_rest_api_billing_invoice_status__e billing_invoice_status_billing_invoice_status_FromString(char* billing_invoice_status);

cJSON *billing_invoice_status_convertToJSON(pinterest_rest_api_billing_invoice_status__e billing_invoice_status);

pinterest_rest_api_billing_invoice_status__e billing_invoice_status_parseFromJSON(cJSON *billing_invoice_statusJSON);

#endif /* _billing_invoice_status_H_ */

