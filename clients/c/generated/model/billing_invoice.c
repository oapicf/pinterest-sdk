#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_invoice.h"



static billing_invoice_t *billing_invoice_create_internal(
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
    ) {
    billing_invoice_t *billing_invoice_local_var = malloc(sizeof(billing_invoice_t));
    if (!billing_invoice_local_var) {
        return NULL;
    }
    memset(billing_invoice_local_var, 0, sizeof(billing_invoice_t));
    billing_invoice_local_var->_library_owned = 1;
    billing_invoice_local_var->ad_account_id = ad_account_id;
    billing_invoice_local_var->ad_account_name = ad_account_name;
    billing_invoice_local_var->amount_billed_micro_currency = amount_billed_micro_currency;
    billing_invoice_local_var->amount_discount_micro_currency = amount_discount_micro_currency;
    billing_invoice_local_var->amount_net_micro_currency = amount_net_micro_currency;
    billing_invoice_local_var->amount_tax_micro_currency = amount_tax_micro_currency;
    billing_invoice_local_var->bill_to_country = bill_to_country;
    billing_invoice_local_var->billing_period_end_date = billing_period_end_date;
    billing_invoice_local_var->billing_period_start_date = billing_period_start_date;
    billing_invoice_local_var->currency = currency;
    billing_invoice_local_var->document_type = document_type;
    billing_invoice_local_var->id = id;
    billing_invoice_local_var->invoice_due_date = invoice_due_date;
    billing_invoice_local_var->payment_terms = payment_terms;
    billing_invoice_local_var->status = status;
    return billing_invoice_local_var;
}

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
    ) {
    int *amount_billed_micro_currency_copy = NULL;
    if (amount_billed_micro_currency) {
        amount_billed_micro_currency_copy = malloc(sizeof(int));
        if (amount_billed_micro_currency_copy) *amount_billed_micro_currency_copy = *amount_billed_micro_currency;
    }
    int *amount_discount_micro_currency_copy = NULL;
    if (amount_discount_micro_currency) {
        amount_discount_micro_currency_copy = malloc(sizeof(int));
        if (amount_discount_micro_currency_copy) *amount_discount_micro_currency_copy = *amount_discount_micro_currency;
    }
    int *amount_net_micro_currency_copy = NULL;
    if (amount_net_micro_currency) {
        amount_net_micro_currency_copy = malloc(sizeof(int));
        if (amount_net_micro_currency_copy) *amount_net_micro_currency_copy = *amount_net_micro_currency;
    }
    int *amount_tax_micro_currency_copy = NULL;
    if (amount_tax_micro_currency) {
        amount_tax_micro_currency_copy = malloc(sizeof(int));
        if (amount_tax_micro_currency_copy) *amount_tax_micro_currency_copy = *amount_tax_micro_currency;
    }
    billing_invoice_t *result = billing_invoice_create_internal (
        ad_account_id,
        ad_account_name,
        amount_billed_micro_currency_copy,
        amount_discount_micro_currency_copy,
        amount_net_micro_currency_copy,
        amount_tax_micro_currency_copy,
        bill_to_country,
        billing_period_end_date,
        billing_period_start_date,
        currency,
        document_type,
        id,
        invoice_due_date,
        payment_terms,
        status
        );
    if (!result) {
        free(amount_billed_micro_currency_copy);
        free(amount_discount_micro_currency_copy);
        free(amount_net_micro_currency_copy);
        free(amount_tax_micro_currency_copy);
    }
    return result;
}

void billing_invoice_free(billing_invoice_t *billing_invoice) {
    if(NULL == billing_invoice){
        return ;
    }
    if(billing_invoice->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "billing_invoice_free");
        return ;
    }
    listEntry_t *listEntry;
    if (billing_invoice->ad_account_id) {
        free(billing_invoice->ad_account_id);
        billing_invoice->ad_account_id = NULL;
    }
    if (billing_invoice->ad_account_name) {
        free(billing_invoice->ad_account_name);
        billing_invoice->ad_account_name = NULL;
    }
    if (billing_invoice->amount_billed_micro_currency) {
        free(billing_invoice->amount_billed_micro_currency);
        billing_invoice->amount_billed_micro_currency = NULL;
    }
    if (billing_invoice->amount_discount_micro_currency) {
        free(billing_invoice->amount_discount_micro_currency);
        billing_invoice->amount_discount_micro_currency = NULL;
    }
    if (billing_invoice->amount_net_micro_currency) {
        free(billing_invoice->amount_net_micro_currency);
        billing_invoice->amount_net_micro_currency = NULL;
    }
    if (billing_invoice->amount_tax_micro_currency) {
        free(billing_invoice->amount_tax_micro_currency);
        billing_invoice->amount_tax_micro_currency = NULL;
    }
    if (billing_invoice->bill_to_country) {
        free(billing_invoice->bill_to_country);
        billing_invoice->bill_to_country = NULL;
    }
    if (billing_invoice->billing_period_end_date) {
        free(billing_invoice->billing_period_end_date);
        billing_invoice->billing_period_end_date = NULL;
    }
    if (billing_invoice->billing_period_start_date) {
        free(billing_invoice->billing_period_start_date);
        billing_invoice->billing_period_start_date = NULL;
    }
    if (billing_invoice->document_type) {
        billing_invoice_document_type_free(billing_invoice->document_type);
        billing_invoice->document_type = NULL;
    }
    if (billing_invoice->id) {
        free(billing_invoice->id);
        billing_invoice->id = NULL;
    }
    if (billing_invoice->invoice_due_date) {
        free(billing_invoice->invoice_due_date);
        billing_invoice->invoice_due_date = NULL;
    }
    if (billing_invoice->payment_terms) {
        free(billing_invoice->payment_terms);
        billing_invoice->payment_terms = NULL;
    }
    if (billing_invoice->status) {
        billing_invoice_status_free(billing_invoice->status);
        billing_invoice->status = NULL;
    }
    free(billing_invoice);
}

cJSON *billing_invoice_convertToJSON(billing_invoice_t *billing_invoice) {
    cJSON *item = cJSON_CreateObject();

    // billing_invoice->ad_account_id
    if(billing_invoice->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", billing_invoice->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice->ad_account_name
    if(billing_invoice->ad_account_name) {
    if(cJSON_AddStringToObject(item, "ad_account_name", billing_invoice->ad_account_name) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice->amount_billed_micro_currency
    if(billing_invoice->amount_billed_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_billed_micro_currency", *billing_invoice->amount_billed_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice->amount_discount_micro_currency
    if(billing_invoice->amount_discount_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_discount_micro_currency", *billing_invoice->amount_discount_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice->amount_net_micro_currency
    if(billing_invoice->amount_net_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_net_micro_currency", *billing_invoice->amount_net_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice->amount_tax_micro_currency
    if(billing_invoice->amount_tax_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_tax_micro_currency", *billing_invoice->amount_tax_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice->bill_to_country
    if(billing_invoice->bill_to_country) {
    if(cJSON_AddStringToObject(item, "bill_to_country", billing_invoice->bill_to_country) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice->billing_period_end_date
    if(billing_invoice->billing_period_end_date) {
    if(cJSON_AddStringToObject(item, "billing_period_end_date", billing_invoice->billing_period_end_date) == NULL) {
    goto fail; //Date
    }
    }


    // billing_invoice->billing_period_start_date
    if(billing_invoice->billing_period_start_date) {
    if(cJSON_AddStringToObject(item, "billing_period_start_date", billing_invoice->billing_period_start_date) == NULL) {
    goto fail; //Date
    }
    }


    // billing_invoice->currency
    if(billing_invoice->currency != pinterest_rest_api_currency__NULL) {
    cJSON *currency_local_JSON = currency_convertToJSON(billing_invoice->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // billing_invoice->document_type
    if(billing_invoice->document_type) {
    cJSON *document_type_local_JSON = billing_invoice_document_type_convertToJSON(billing_invoice->document_type);
    if(document_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "document_type", document_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // billing_invoice->id
    if(billing_invoice->id) {
    if(cJSON_AddStringToObject(item, "id", billing_invoice->id) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice->invoice_due_date
    if(billing_invoice->invoice_due_date) {
    if(cJSON_AddStringToObject(item, "invoice_due_date", billing_invoice->invoice_due_date) == NULL) {
    goto fail; //Date
    }
    }


    // billing_invoice->payment_terms
    if(billing_invoice->payment_terms) {
    if(cJSON_AddStringToObject(item, "payment_terms", billing_invoice->payment_terms) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice->status
    if(billing_invoice->status) {
    cJSON *status_local_JSON = billing_invoice_status_convertToJSON(billing_invoice->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

billing_invoice_t *billing_invoice_parseFromJSON(cJSON *billing_invoiceJSON){

    billing_invoice_t *billing_invoice_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    char *ad_account_name_local_str = NULL;

    // define the local variable for billing_invoice->amount_billed_micro_currency
    int *amount_billed_micro_currency_local_var = NULL;

    // define the local variable for billing_invoice->amount_discount_micro_currency
    int *amount_discount_micro_currency_local_var = NULL;

    // define the local variable for billing_invoice->amount_net_micro_currency
    int *amount_net_micro_currency_local_var = NULL;

    // define the local variable for billing_invoice->amount_tax_micro_currency
    int *amount_tax_micro_currency_local_var = NULL;

    char *bill_to_country_local_str = NULL;

    char *billing_period_end_date_local_str = NULL;

    char *billing_period_start_date_local_str = NULL;

    // define the local variable for billing_invoice->currency
    pinterest_rest_api_currency__e currency_local_nonprim = 0;

    // define the local variable for billing_invoice->document_type
    billing_invoice_document_type_t *document_type_local_nonprim = NULL;

    char *id_local_str = NULL;

    char *invoice_due_date_local_str = NULL;

    char *payment_terms_local_str = NULL;

    // define the local variable for billing_invoice->status
    billing_invoice_status_t *status_local_nonprim = NULL;

    // billing_invoice->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // billing_invoice->ad_account_name
    cJSON *ad_account_name = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "ad_account_name");
    if (cJSON_IsNull(ad_account_name)) {
        ad_account_name = NULL;
    }
    if (ad_account_name) { 
    if(!cJSON_IsString(ad_account_name) && !cJSON_IsNull(ad_account_name))
    {
    goto end; //String
    }
    }

    // billing_invoice->amount_billed_micro_currency
    cJSON *amount_billed_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "amount_billed_micro_currency");
    if (cJSON_IsNull(amount_billed_micro_currency)) {
        amount_billed_micro_currency = NULL;
    }
    if (amount_billed_micro_currency) { 
    if(!cJSON_IsNumber(amount_billed_micro_currency))
    {
    goto end; //Numeric
    }
    amount_billed_micro_currency_local_var = malloc(sizeof(int));
    if(!amount_billed_micro_currency_local_var)
    {
        goto end;
    }
    *amount_billed_micro_currency_local_var = amount_billed_micro_currency->valuedouble;
    }

    // billing_invoice->amount_discount_micro_currency
    cJSON *amount_discount_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "amount_discount_micro_currency");
    if (cJSON_IsNull(amount_discount_micro_currency)) {
        amount_discount_micro_currency = NULL;
    }
    if (amount_discount_micro_currency) { 
    if(!cJSON_IsNumber(amount_discount_micro_currency))
    {
    goto end; //Numeric
    }
    amount_discount_micro_currency_local_var = malloc(sizeof(int));
    if(!amount_discount_micro_currency_local_var)
    {
        goto end;
    }
    *amount_discount_micro_currency_local_var = amount_discount_micro_currency->valuedouble;
    }

    // billing_invoice->amount_net_micro_currency
    cJSON *amount_net_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "amount_net_micro_currency");
    if (cJSON_IsNull(amount_net_micro_currency)) {
        amount_net_micro_currency = NULL;
    }
    if (amount_net_micro_currency) { 
    if(!cJSON_IsNumber(amount_net_micro_currency))
    {
    goto end; //Numeric
    }
    amount_net_micro_currency_local_var = malloc(sizeof(int));
    if(!amount_net_micro_currency_local_var)
    {
        goto end;
    }
    *amount_net_micro_currency_local_var = amount_net_micro_currency->valuedouble;
    }

    // billing_invoice->amount_tax_micro_currency
    cJSON *amount_tax_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "amount_tax_micro_currency");
    if (cJSON_IsNull(amount_tax_micro_currency)) {
        amount_tax_micro_currency = NULL;
    }
    if (amount_tax_micro_currency) { 
    if(!cJSON_IsNumber(amount_tax_micro_currency))
    {
    goto end; //Numeric
    }
    amount_tax_micro_currency_local_var = malloc(sizeof(int));
    if(!amount_tax_micro_currency_local_var)
    {
        goto end;
    }
    *amount_tax_micro_currency_local_var = amount_tax_micro_currency->valuedouble;
    }

    // billing_invoice->bill_to_country
    cJSON *bill_to_country = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "bill_to_country");
    if (cJSON_IsNull(bill_to_country)) {
        bill_to_country = NULL;
    }
    if (bill_to_country) { 
    if(!cJSON_IsString(bill_to_country) && !cJSON_IsNull(bill_to_country))
    {
    goto end; //String
    }
    }

    // billing_invoice->billing_period_end_date
    cJSON *billing_period_end_date = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "billing_period_end_date");
    if (cJSON_IsNull(billing_period_end_date)) {
        billing_period_end_date = NULL;
    }
    if (billing_period_end_date) { 
    if(!cJSON_IsString(billing_period_end_date))
    {
    goto end; //Date
    }
    }

    // billing_invoice->billing_period_start_date
    cJSON *billing_period_start_date = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "billing_period_start_date");
    if (cJSON_IsNull(billing_period_start_date)) {
        billing_period_start_date = NULL;
    }
    if (billing_period_start_date) { 
    if(!cJSON_IsString(billing_period_start_date))
    {
    goto end; //Date
    }
    }

    // billing_invoice->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // billing_invoice->document_type
    cJSON *document_type = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "document_type");
    if (cJSON_IsNull(document_type)) {
        document_type = NULL;
    }
    if (document_type) { 
    document_type_local_nonprim = billing_invoice_document_type_parseFromJSON(document_type); //custom
    }

    // billing_invoice->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // billing_invoice->invoice_due_date
    cJSON *invoice_due_date = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "invoice_due_date");
    if (cJSON_IsNull(invoice_due_date)) {
        invoice_due_date = NULL;
    }
    if (invoice_due_date) { 
    if(!cJSON_IsString(invoice_due_date))
    {
    goto end; //Date
    }
    }

    // billing_invoice->payment_terms
    cJSON *payment_terms = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "payment_terms");
    if (cJSON_IsNull(payment_terms)) {
        payment_terms = NULL;
    }
    if (payment_terms) { 
    if(!cJSON_IsString(payment_terms) && !cJSON_IsNull(payment_terms))
    {
    goto end; //String
    }
    }

    // billing_invoice->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(billing_invoiceJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = billing_invoice_status_parseFromJSON(status); //custom
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (ad_account_name && !cJSON_IsNull(ad_account_name)) ad_account_name_local_str = strdup(ad_account_name->valuestring);
    if (bill_to_country && !cJSON_IsNull(bill_to_country)) bill_to_country_local_str = strdup(bill_to_country->valuestring);
    if (billing_period_end_date) billing_period_end_date_local_str = strdup(billing_period_end_date->valuestring);
    if (billing_period_start_date) billing_period_start_date_local_str = strdup(billing_period_start_date->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (invoice_due_date) invoice_due_date_local_str = strdup(invoice_due_date->valuestring);
    if (payment_terms && !cJSON_IsNull(payment_terms)) payment_terms_local_str = strdup(payment_terms->valuestring);

    billing_invoice_local_var = billing_invoice_create_internal (
        ad_account_id_local_str,
        ad_account_name_local_str,
        amount_billed_micro_currency_local_var,
        amount_discount_micro_currency_local_var,
        amount_net_micro_currency_local_var,
        amount_tax_micro_currency_local_var,
        bill_to_country_local_str,
        billing_period_end_date_local_str,
        billing_period_start_date_local_str,
        currency ? currency_local_nonprim : 0,
        document_type ? document_type_local_nonprim : NULL,
        id_local_str,
        invoice_due_date_local_str,
        payment_terms_local_str,
        status ? status_local_nonprim : NULL
        );

    if (!billing_invoice_local_var) {
        goto end;
    }

    return billing_invoice_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (ad_account_name_local_str) {
        free(ad_account_name_local_str);
        ad_account_name_local_str = NULL;
    }
    if (amount_billed_micro_currency_local_var) {
        free(amount_billed_micro_currency_local_var);
        amount_billed_micro_currency_local_var = NULL;
    }
    if (amount_discount_micro_currency_local_var) {
        free(amount_discount_micro_currency_local_var);
        amount_discount_micro_currency_local_var = NULL;
    }
    if (amount_net_micro_currency_local_var) {
        free(amount_net_micro_currency_local_var);
        amount_net_micro_currency_local_var = NULL;
    }
    if (amount_tax_micro_currency_local_var) {
        free(amount_tax_micro_currency_local_var);
        amount_tax_micro_currency_local_var = NULL;
    }
    if (bill_to_country_local_str) {
        free(bill_to_country_local_str);
        bill_to_country_local_str = NULL;
    }
    if (billing_period_end_date_local_str) {
        free(billing_period_end_date_local_str);
        billing_period_end_date_local_str = NULL;
    }
    if (billing_period_start_date_local_str) {
        free(billing_period_start_date_local_str);
        billing_period_start_date_local_str = NULL;
    }
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    if (document_type_local_nonprim) {
        billing_invoice_document_type_free(document_type_local_nonprim);
        document_type_local_nonprim = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (invoice_due_date_local_str) {
        free(invoice_due_date_local_str);
        invoice_due_date_local_str = NULL;
    }
    if (payment_terms_local_str) {
        free(payment_terms_local_str);
        payment_terms_local_str = NULL;
    }
    if (status_local_nonprim) {
        billing_invoice_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
