/*
 * billing_invoice_sort_field.h
 *
 * Field by which to sort billing invoices.
 */

#ifndef _billing_invoice_sort_field_H_
#define _billing_invoice_sort_field_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_invoice_sort_field_t billing_invoice_sort_field_t;


// Enum  for billing_invoice_sort_field

typedef enum { pinterest_rest_api_billing_invoice_sort_field__NULL = 0, pinterest_rest_api_billing_invoice_sort_field__DUE_DATE, pinterest_rest_api_billing_invoice_sort_field__BILLING_PERIOD, pinterest_rest_api_billing_invoice_sort_field__DOCUMENT_TYPE, pinterest_rest_api_billing_invoice_sort_field__TOTAL_AMOUNT, pinterest_rest_api_billing_invoice_sort_field__INVOICE_NUMBER } pinterest_rest_api_billing_invoice_sort_field__e;

char* billing_invoice_sort_field_billing_invoice_sort_field_ToString(pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field);

pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field_billing_invoice_sort_field_FromString(char* billing_invoice_sort_field);

cJSON *billing_invoice_sort_field_convertToJSON(pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field);

pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field_parseFromJSON(cJSON *billing_invoice_sort_fieldJSON);

#endif /* _billing_invoice_sort_field_H_ */

