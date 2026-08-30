/*
 * billing_invoice_document_type.h
 *
 * The type of a billing invoice document.
 */

#ifndef _billing_invoice_document_type_H_
#define _billing_invoice_document_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_invoice_document_type_t billing_invoice_document_type_t;


// Enum  for billing_invoice_document_type

typedef enum { pinterest_rest_api_billing_invoice_document_type__NULL = 0, pinterest_rest_api_billing_invoice_document_type__INVOICE, pinterest_rest_api_billing_invoice_document_type__CREDIT_MEMO } pinterest_rest_api_billing_invoice_document_type__e;

char* billing_invoice_document_type_billing_invoice_document_type_ToString(pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type);

pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type_billing_invoice_document_type_FromString(char* billing_invoice_document_type);

cJSON *billing_invoice_document_type_convertToJSON(pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type);

pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type_parseFromJSON(cJSON *billing_invoice_document_typeJSON);

#endif /* _billing_invoice_document_type_H_ */

