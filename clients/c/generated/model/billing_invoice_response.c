#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_invoice_response.h"


char* billing_invoice_response_document_type_ToString(pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e document_type) {
    char* document_typeArray[] =  { "NULL", "INVOICE", "CREDIT_MEMO" };
    return document_typeArray[document_type];
}

pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e billing_invoice_response_document_type_FromString(char* document_type){
    int stringToReturn = 0;
    char *document_typeArray[] =  { "NULL", "INVOICE", "CREDIT_MEMO" };
    size_t sizeofArray = sizeof(document_typeArray) / sizeof(document_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(document_type, document_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* billing_invoice_response_status_ToString(pinterest_rest_api_billing_invoice_response_STATUS_e status) {
    char* statusArray[] =  { "NULL", "OPEN", "CLOSED" };
    return statusArray[status];
}

pinterest_rest_api_billing_invoice_response_STATUS_e billing_invoice_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "OPEN", "CLOSED" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static billing_invoice_response_t *billing_invoice_response_create_internal(
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
    ) {
    billing_invoice_response_t *billing_invoice_response_local_var = malloc(sizeof(billing_invoice_response_t));
    if (!billing_invoice_response_local_var) {
        return NULL;
    }
    billing_invoice_response_local_var->ad_account_id = ad_account_id;
    billing_invoice_response_local_var->ad_account_name = ad_account_name;
    billing_invoice_response_local_var->amount_billed_micro_currency = amount_billed_micro_currency;
    billing_invoice_response_local_var->amount_discount_micro_currency = amount_discount_micro_currency;
    billing_invoice_response_local_var->amount_net_micro_currency = amount_net_micro_currency;
    billing_invoice_response_local_var->amount_tax_micro_currency = amount_tax_micro_currency;
    billing_invoice_response_local_var->bill_to_country = bill_to_country;
    billing_invoice_response_local_var->billing_period_end_date = billing_period_end_date;
    billing_invoice_response_local_var->billing_period_start_date = billing_period_start_date;
    billing_invoice_response_local_var->currency = currency;
    billing_invoice_response_local_var->document_type = document_type;
    billing_invoice_response_local_var->id = id;
    billing_invoice_response_local_var->invoice_due_date = invoice_due_date;
    billing_invoice_response_local_var->payment_terms = payment_terms;
    billing_invoice_response_local_var->status = status;

    billing_invoice_response_local_var->_library_owned = 1;
    return billing_invoice_response_local_var;
}

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
    ) {
    return billing_invoice_response_create_internal (
        ad_account_id,
        ad_account_name,
        amount_billed_micro_currency,
        amount_discount_micro_currency,
        amount_net_micro_currency,
        amount_tax_micro_currency,
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
}

void billing_invoice_response_free(billing_invoice_response_t *billing_invoice_response) {
    if(NULL == billing_invoice_response){
        return ;
    }
    if(billing_invoice_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "billing_invoice_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (billing_invoice_response->ad_account_id) {
        free(billing_invoice_response->ad_account_id);
        billing_invoice_response->ad_account_id = NULL;
    }
    if (billing_invoice_response->ad_account_name) {
        free(billing_invoice_response->ad_account_name);
        billing_invoice_response->ad_account_name = NULL;
    }
    if (billing_invoice_response->bill_to_country) {
        free(billing_invoice_response->bill_to_country);
        billing_invoice_response->bill_to_country = NULL;
    }
    if (billing_invoice_response->billing_period_end_date) {
        free(billing_invoice_response->billing_period_end_date);
        billing_invoice_response->billing_period_end_date = NULL;
    }
    if (billing_invoice_response->billing_period_start_date) {
        free(billing_invoice_response->billing_period_start_date);
        billing_invoice_response->billing_period_start_date = NULL;
    }
    if (billing_invoice_response->id) {
        free(billing_invoice_response->id);
        billing_invoice_response->id = NULL;
    }
    if (billing_invoice_response->invoice_due_date) {
        free(billing_invoice_response->invoice_due_date);
        billing_invoice_response->invoice_due_date = NULL;
    }
    if (billing_invoice_response->payment_terms) {
        free(billing_invoice_response->payment_terms);
        billing_invoice_response->payment_terms = NULL;
    }
    free(billing_invoice_response);
}

cJSON *billing_invoice_response_convertToJSON(billing_invoice_response_t *billing_invoice_response) {
    cJSON *item = cJSON_CreateObject();

    // billing_invoice_response->ad_account_id
    if(billing_invoice_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", billing_invoice_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice_response->ad_account_name
    if(billing_invoice_response->ad_account_name) {
    if(cJSON_AddStringToObject(item, "ad_account_name", billing_invoice_response->ad_account_name) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice_response->amount_billed_micro_currency
    if(billing_invoice_response->amount_billed_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_billed_micro_currency", billing_invoice_response->amount_billed_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice_response->amount_discount_micro_currency
    if(billing_invoice_response->amount_discount_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_discount_micro_currency", billing_invoice_response->amount_discount_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice_response->amount_net_micro_currency
    if(billing_invoice_response->amount_net_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_net_micro_currency", billing_invoice_response->amount_net_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice_response->amount_tax_micro_currency
    if(billing_invoice_response->amount_tax_micro_currency) {
    if(cJSON_AddNumberToObject(item, "amount_tax_micro_currency", billing_invoice_response->amount_tax_micro_currency) == NULL) {
    goto fail; //Numeric
    }
    }


    // billing_invoice_response->bill_to_country
    if(billing_invoice_response->bill_to_country) {
    if(cJSON_AddStringToObject(item, "bill_to_country", billing_invoice_response->bill_to_country) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice_response->billing_period_end_date
    if(billing_invoice_response->billing_period_end_date) {
    if(cJSON_AddStringToObject(item, "billing_period_end_date", billing_invoice_response->billing_period_end_date) == NULL) {
    goto fail; //Date
    }
    }


    // billing_invoice_response->billing_period_start_date
    if(billing_invoice_response->billing_period_start_date) {
    if(cJSON_AddStringToObject(item, "billing_period_start_date", billing_invoice_response->billing_period_start_date) == NULL) {
    goto fail; //Date
    }
    }


    // billing_invoice_response->currency
    if(billing_invoice_response->currency != pinterest_rest_api_currency__NULL) {
    cJSON *currency_local_JSON = currency_convertToJSON(billing_invoice_response->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // billing_invoice_response->document_type
    if(billing_invoice_response->document_type != pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "document_type", billing_invoice_response_document_type_ToString(billing_invoice_response->document_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // billing_invoice_response->id
    if(billing_invoice_response->id) {
    if(cJSON_AddStringToObject(item, "id", billing_invoice_response->id) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice_response->invoice_due_date
    if(billing_invoice_response->invoice_due_date) {
    if(cJSON_AddStringToObject(item, "invoice_due_date", billing_invoice_response->invoice_due_date) == NULL) {
    goto fail; //Date
    }
    }


    // billing_invoice_response->payment_terms
    if(billing_invoice_response->payment_terms) {
    if(cJSON_AddStringToObject(item, "payment_terms", billing_invoice_response->payment_terms) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice_response->status
    if(billing_invoice_response->status != pinterest_rest_api_billing_invoice_response_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", billing_invoice_response_status_ToString(billing_invoice_response->status)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

billing_invoice_response_t *billing_invoice_response_parseFromJSON(cJSON *billing_invoice_responseJSON){

    billing_invoice_response_t *billing_invoice_response_local_var = NULL;

    // define the local variable for billing_invoice_response->currency
    pinterest_rest_api_currency__e currency_local_nonprim = 0;

    // billing_invoice_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // billing_invoice_response->ad_account_name
    cJSON *ad_account_name = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "ad_account_name");
    if (cJSON_IsNull(ad_account_name)) {
        ad_account_name = NULL;
    }
    if (ad_account_name) { 
    if(!cJSON_IsString(ad_account_name) && !cJSON_IsNull(ad_account_name))
    {
    goto end; //String
    }
    }

    // billing_invoice_response->amount_billed_micro_currency
    cJSON *amount_billed_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "amount_billed_micro_currency");
    if (cJSON_IsNull(amount_billed_micro_currency)) {
        amount_billed_micro_currency = NULL;
    }
    if (amount_billed_micro_currency) { 
    if(!cJSON_IsNumber(amount_billed_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // billing_invoice_response->amount_discount_micro_currency
    cJSON *amount_discount_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "amount_discount_micro_currency");
    if (cJSON_IsNull(amount_discount_micro_currency)) {
        amount_discount_micro_currency = NULL;
    }
    if (amount_discount_micro_currency) { 
    if(!cJSON_IsNumber(amount_discount_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // billing_invoice_response->amount_net_micro_currency
    cJSON *amount_net_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "amount_net_micro_currency");
    if (cJSON_IsNull(amount_net_micro_currency)) {
        amount_net_micro_currency = NULL;
    }
    if (amount_net_micro_currency) { 
    if(!cJSON_IsNumber(amount_net_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // billing_invoice_response->amount_tax_micro_currency
    cJSON *amount_tax_micro_currency = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "amount_tax_micro_currency");
    if (cJSON_IsNull(amount_tax_micro_currency)) {
        amount_tax_micro_currency = NULL;
    }
    if (amount_tax_micro_currency) { 
    if(!cJSON_IsNumber(amount_tax_micro_currency))
    {
    goto end; //Numeric
    }
    }

    // billing_invoice_response->bill_to_country
    cJSON *bill_to_country = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "bill_to_country");
    if (cJSON_IsNull(bill_to_country)) {
        bill_to_country = NULL;
    }
    if (bill_to_country) { 
    if(!cJSON_IsString(bill_to_country) && !cJSON_IsNull(bill_to_country))
    {
    goto end; //String
    }
    }

    // billing_invoice_response->billing_period_end_date
    cJSON *billing_period_end_date = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "billing_period_end_date");
    if (cJSON_IsNull(billing_period_end_date)) {
        billing_period_end_date = NULL;
    }
    if (billing_period_end_date) { 
    if(!cJSON_IsString(billing_period_end_date))
    {
    goto end; //Date
    }
    }

    // billing_invoice_response->billing_period_start_date
    cJSON *billing_period_start_date = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "billing_period_start_date");
    if (cJSON_IsNull(billing_period_start_date)) {
        billing_period_start_date = NULL;
    }
    if (billing_period_start_date) { 
    if(!cJSON_IsString(billing_period_start_date))
    {
    goto end; //Date
    }
    }

    // billing_invoice_response->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    currency_local_nonprim = currency_parseFromJSON(currency); //custom
    }

    // billing_invoice_response->document_type
    cJSON *document_type = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "document_type");
    if (cJSON_IsNull(document_type)) {
        document_type = NULL;
    }
    pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e document_typeVariable;
    if (document_type) { 
    if(!cJSON_IsString(document_type))
    {
    goto end; //Enum
    }
    document_typeVariable = billing_invoice_response_document_type_FromString(document_type->valuestring);
    }

    // billing_invoice_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // billing_invoice_response->invoice_due_date
    cJSON *invoice_due_date = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "invoice_due_date");
    if (cJSON_IsNull(invoice_due_date)) {
        invoice_due_date = NULL;
    }
    if (invoice_due_date) { 
    if(!cJSON_IsString(invoice_due_date))
    {
    goto end; //Date
    }
    }

    // billing_invoice_response->payment_terms
    cJSON *payment_terms = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "payment_terms");
    if (cJSON_IsNull(payment_terms)) {
        payment_terms = NULL;
    }
    if (payment_terms) { 
    if(!cJSON_IsString(payment_terms) && !cJSON_IsNull(payment_terms))
    {
    goto end; //String
    }
    }

    // billing_invoice_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(billing_invoice_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    pinterest_rest_api_billing_invoice_response_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = billing_invoice_response_status_FromString(status->valuestring);
    }


    billing_invoice_response_local_var = billing_invoice_response_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        ad_account_name && !cJSON_IsNull(ad_account_name) ? strdup(ad_account_name->valuestring) : NULL,
        amount_billed_micro_currency ? amount_billed_micro_currency->valuedouble : 0,
        amount_discount_micro_currency ? amount_discount_micro_currency->valuedouble : 0,
        amount_net_micro_currency ? amount_net_micro_currency->valuedouble : 0,
        amount_tax_micro_currency ? amount_tax_micro_currency->valuedouble : 0,
        bill_to_country && !cJSON_IsNull(bill_to_country) ? strdup(bill_to_country->valuestring) : NULL,
        billing_period_end_date ? strdup(billing_period_end_date->valuestring) : NULL,
        billing_period_start_date ? strdup(billing_period_start_date->valuestring) : NULL,
        currency ? currency_local_nonprim : 0,
        document_type ? document_typeVariable : pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        invoice_due_date ? strdup(invoice_due_date->valuestring) : NULL,
        payment_terms && !cJSON_IsNull(payment_terms) ? strdup(payment_terms->valuestring) : NULL,
        status ? statusVariable : pinterest_rest_api_billing_invoice_response_STATUS_NULL
        );

    return billing_invoice_response_local_var;
end:
    if (currency_local_nonprim) {
        currency_local_nonprim = 0;
    }
    return NULL;

}
