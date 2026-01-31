/*
 * billing_invoice_response.h
 *
 * 
 */

#ifndef _billing_invoice_response_H_
#define _billing_invoice_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_invoice_response_t billing_invoice_response_t;

#include "currency.h"

// Enum DOCUMENTTYPE for billing_invoice_response

typedef enum  { pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_NULL = 0, pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_INVOICE, pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_CREDIT_MEMO } pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e;

char* billing_invoice_response_document_type_ToString(pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e document_type);

pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e billing_invoice_response_document_type_FromString(char* document_type);

// Enum STATUS for billing_invoice_response

typedef enum  { pinterest_rest_api_billing_invoice_response_STATUS_NULL = 0, pinterest_rest_api_billing_invoice_response_STATUS_OPEN, pinterest_rest_api_billing_invoice_response_STATUS_CLOSED } pinterest_rest_api_billing_invoice_response_STATUS_e;

char* billing_invoice_response_status_ToString(pinterest_rest_api_billing_invoice_response_STATUS_e status);

pinterest_rest_api_billing_invoice_response_STATUS_e billing_invoice_response_status_FromString(char* status);



typedef struct billing_invoice_response_t {
    char *ad_account_id; // string
    char *ad_account_name; // string
    int amount_billed_micro_currency; //numeric
    int amount_discount_micro_currency; //numeric
    int amount_net_micro_currency; //numeric
    int amount_tax_micro_currency; //numeric
    char *bill_to_country; // string
    char *billing_period_end_date; //date
    char *billing_period_start_date; //date
    pinterest_rest_api_currency__e currency; //referenced enum
    pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e document_type; //enum
    char *id; // string
    char *invoice_due_date; //date
    char *payment_terms; // string
    pinterest_rest_api_billing_invoice_response_STATUS_e status; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} billing_invoice_response_t;

__attribute__((deprecated)) billing_invoice_response_t *billing_invoice_response_create(
    char *ad_account_id,
    char *ad_account_name,
    int amount_billed_micro_currency,
    int amount_discount_micro_currency,
    int amount_net_micro_currency,
    int amount_tax_micro_currency,
    char *bill_to_country,
    char *billing_period_end_date,
    char *billing_period_start_date,
    pinterest_rest_api_currency__e currency,
    pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e document_type,
    char *id,
    char *invoice_due_date,
    char *payment_terms,
    pinterest_rest_api_billing_invoice_response_STATUS_e status
);

void billing_invoice_response_free(billing_invoice_response_t *billing_invoice_response);

billing_invoice_response_t *billing_invoice_response_parseFromJSON(cJSON *billing_invoice_responseJSON);

cJSON *billing_invoice_response_convertToJSON(billing_invoice_response_t *billing_invoice_response);

#endif /* _billing_invoice_response_H_ */

