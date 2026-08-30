/*
 * billing_invoice.h
 *
 * A billing invoice in the advertiser account.
 */

#ifndef _billing_invoice_H_
#define _billing_invoice_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_invoice_t billing_invoice_t;

#include "billing_invoice_document_type.h"
#include "billing_invoice_status.h"
#include "currency.h"



typedef struct billing_invoice_t {
    char *ad_account_id; // string
    char *ad_account_name; // string
    int *amount_billed_micro_currency; //numeric
    int *amount_discount_micro_currency; //numeric
    int *amount_net_micro_currency; //numeric
    int *amount_tax_micro_currency; //numeric
    char *bill_to_country; // string
    char *billing_period_end_date; //date
    char *billing_period_start_date; //date
    pinterest_rest_api_currency__e currency; //referenced enum
    billing_invoice_document_type_t *document_type; // custom
    char *id; // string
    char *invoice_due_date; //date
    char *payment_terms; // string
    billing_invoice_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} billing_invoice_t;

__attribute__((deprecated)) billing_invoice_t *billing_invoice_create(
    char *ad_account_id,
    char *ad_account_name,
    int *amount_billed_micro_currency,
    int *amount_discount_micro_currency,
    int *amount_net_micro_currency,
    int *amount_tax_micro_currency,
    char *bill_to_country,
    char *billing_period_end_date,
    char *billing_period_start_date,
    pinterest_rest_api_currency__e currency,
    billing_invoice_document_type_t *document_type,
    char *id,
    char *invoice_due_date,
    char *payment_terms,
    billing_invoice_status_t *status
);

void billing_invoice_free(billing_invoice_t *billing_invoice);

billing_invoice_t *billing_invoice_parseFromJSON(cJSON *billing_invoiceJSON);

cJSON *billing_invoice_convertToJSON(billing_invoice_t *billing_invoice);

#endif /* _billing_invoice_H_ */

