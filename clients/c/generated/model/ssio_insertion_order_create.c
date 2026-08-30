#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_insertion_order_create.h"



static ssio_insertion_order_create_t *ssio_insertion_order_create_create_internal(
    char *accepted_terms_id,
    int *accepted_terms_time,
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billto_billing_address_id,
    char *billto_business_address_id,
    char *billto_company_id,
    double *budget_amount,
    pinterest_rest_api_currency__e currency_info,
    char *end_date,
    double *estimated_monthly_spend,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    ssio_order_line_type_t *order_line_type,
    char *order_name,
    char *pmp_id,
    char *po_number,
    char *start_date,
    char *user_email
    ) {
    ssio_insertion_order_create_t *ssio_insertion_order_create_local_var = malloc(sizeof(ssio_insertion_order_create_t));
    if (!ssio_insertion_order_create_local_var) {
        return NULL;
    }
    memset(ssio_insertion_order_create_local_var, 0, sizeof(ssio_insertion_order_create_t));
    ssio_insertion_order_create_local_var->_library_owned = 1;
    ssio_insertion_order_create_local_var->accepted_terms_id = accepted_terms_id;
    ssio_insertion_order_create_local_var->accepted_terms_time = accepted_terms_time;
    ssio_insertion_order_create_local_var->agency_link = agency_link;
    ssio_insertion_order_create_local_var->billing_contact_email = billing_contact_email;
    ssio_insertion_order_create_local_var->billing_contact_firstname = billing_contact_firstname;
    ssio_insertion_order_create_local_var->billing_contact_lastname = billing_contact_lastname;
    ssio_insertion_order_create_local_var->billto_billing_address_id = billto_billing_address_id;
    ssio_insertion_order_create_local_var->billto_business_address_id = billto_business_address_id;
    ssio_insertion_order_create_local_var->billto_company_id = billto_company_id;
    ssio_insertion_order_create_local_var->budget_amount = budget_amount;
    ssio_insertion_order_create_local_var->currency_info = currency_info;
    ssio_insertion_order_create_local_var->end_date = end_date;
    ssio_insertion_order_create_local_var->estimated_monthly_spend = estimated_monthly_spend;
    ssio_insertion_order_create_local_var->media_contact_email = media_contact_email;
    ssio_insertion_order_create_local_var->media_contact_firstname = media_contact_firstname;
    ssio_insertion_order_create_local_var->media_contact_lastname = media_contact_lastname;
    ssio_insertion_order_create_local_var->order_line_type = order_line_type;
    ssio_insertion_order_create_local_var->order_name = order_name;
    ssio_insertion_order_create_local_var->pmp_id = pmp_id;
    ssio_insertion_order_create_local_var->po_number = po_number;
    ssio_insertion_order_create_local_var->start_date = start_date;
    ssio_insertion_order_create_local_var->user_email = user_email;
    return ssio_insertion_order_create_local_var;
}

__attribute__((deprecated)) ssio_insertion_order_create_t *ssio_insertion_order_create_create(
    char *accepted_terms_id,
    int *accepted_terms_time,
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billto_billing_address_id,
    char *billto_business_address_id,
    char *billto_company_id,
    double *budget_amount,
    pinterest_rest_api_currency__e currency_info,
    char *end_date,
    double *estimated_monthly_spend,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    ssio_order_line_type_t *order_line_type,
    char *order_name,
    char *pmp_id,
    char *po_number,
    char *start_date,
    char *user_email
    ) {
    int *accepted_terms_time_copy = NULL;
    if (accepted_terms_time) {
        accepted_terms_time_copy = malloc(sizeof(int));
        if (accepted_terms_time_copy) *accepted_terms_time_copy = *accepted_terms_time;
    }
    double *budget_amount_copy = NULL;
    if (budget_amount) {
        budget_amount_copy = malloc(sizeof(double));
        if (budget_amount_copy) *budget_amount_copy = *budget_amount;
    }
    double *estimated_monthly_spend_copy = NULL;
    if (estimated_monthly_spend) {
        estimated_monthly_spend_copy = malloc(sizeof(double));
        if (estimated_monthly_spend_copy) *estimated_monthly_spend_copy = *estimated_monthly_spend;
    }
    ssio_insertion_order_create_t *result = ssio_insertion_order_create_create_internal (
        accepted_terms_id,
        accepted_terms_time_copy,
        agency_link,
        billing_contact_email,
        billing_contact_firstname,
        billing_contact_lastname,
        billto_billing_address_id,
        billto_business_address_id,
        billto_company_id,
        budget_amount_copy,
        currency_info,
        end_date,
        estimated_monthly_spend_copy,
        media_contact_email,
        media_contact_firstname,
        media_contact_lastname,
        order_line_type,
        order_name,
        pmp_id,
        po_number,
        start_date,
        user_email
        );
    if (!result) {
        free(accepted_terms_time_copy);
        free(budget_amount_copy);
        free(estimated_monthly_spend_copy);
    }
    return result;
}

void ssio_insertion_order_create_free(ssio_insertion_order_create_t *ssio_insertion_order_create) {
    if(NULL == ssio_insertion_order_create){
        return ;
    }
    if(ssio_insertion_order_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_insertion_order_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_insertion_order_create->accepted_terms_id) {
        free(ssio_insertion_order_create->accepted_terms_id);
        ssio_insertion_order_create->accepted_terms_id = NULL;
    }
    if (ssio_insertion_order_create->accepted_terms_time) {
        free(ssio_insertion_order_create->accepted_terms_time);
        ssio_insertion_order_create->accepted_terms_time = NULL;
    }
    if (ssio_insertion_order_create->agency_link) {
        free(ssio_insertion_order_create->agency_link);
        ssio_insertion_order_create->agency_link = NULL;
    }
    if (ssio_insertion_order_create->billing_contact_email) {
        free(ssio_insertion_order_create->billing_contact_email);
        ssio_insertion_order_create->billing_contact_email = NULL;
    }
    if (ssio_insertion_order_create->billing_contact_firstname) {
        free(ssio_insertion_order_create->billing_contact_firstname);
        ssio_insertion_order_create->billing_contact_firstname = NULL;
    }
    if (ssio_insertion_order_create->billing_contact_lastname) {
        free(ssio_insertion_order_create->billing_contact_lastname);
        ssio_insertion_order_create->billing_contact_lastname = NULL;
    }
    if (ssio_insertion_order_create->billto_billing_address_id) {
        free(ssio_insertion_order_create->billto_billing_address_id);
        ssio_insertion_order_create->billto_billing_address_id = NULL;
    }
    if (ssio_insertion_order_create->billto_business_address_id) {
        free(ssio_insertion_order_create->billto_business_address_id);
        ssio_insertion_order_create->billto_business_address_id = NULL;
    }
    if (ssio_insertion_order_create->billto_company_id) {
        free(ssio_insertion_order_create->billto_company_id);
        ssio_insertion_order_create->billto_company_id = NULL;
    }
    if (ssio_insertion_order_create->budget_amount) {
        free(ssio_insertion_order_create->budget_amount);
        ssio_insertion_order_create->budget_amount = NULL;
    }
    if (ssio_insertion_order_create->end_date) {
        free(ssio_insertion_order_create->end_date);
        ssio_insertion_order_create->end_date = NULL;
    }
    if (ssio_insertion_order_create->estimated_monthly_spend) {
        free(ssio_insertion_order_create->estimated_monthly_spend);
        ssio_insertion_order_create->estimated_monthly_spend = NULL;
    }
    if (ssio_insertion_order_create->media_contact_email) {
        free(ssio_insertion_order_create->media_contact_email);
        ssio_insertion_order_create->media_contact_email = NULL;
    }
    if (ssio_insertion_order_create->media_contact_firstname) {
        free(ssio_insertion_order_create->media_contact_firstname);
        ssio_insertion_order_create->media_contact_firstname = NULL;
    }
    if (ssio_insertion_order_create->media_contact_lastname) {
        free(ssio_insertion_order_create->media_contact_lastname);
        ssio_insertion_order_create->media_contact_lastname = NULL;
    }
    if (ssio_insertion_order_create->order_line_type) {
        ssio_order_line_type_free(ssio_insertion_order_create->order_line_type);
        ssio_insertion_order_create->order_line_type = NULL;
    }
    if (ssio_insertion_order_create->order_name) {
        free(ssio_insertion_order_create->order_name);
        ssio_insertion_order_create->order_name = NULL;
    }
    if (ssio_insertion_order_create->pmp_id) {
        free(ssio_insertion_order_create->pmp_id);
        ssio_insertion_order_create->pmp_id = NULL;
    }
    if (ssio_insertion_order_create->po_number) {
        free(ssio_insertion_order_create->po_number);
        ssio_insertion_order_create->po_number = NULL;
    }
    if (ssio_insertion_order_create->start_date) {
        free(ssio_insertion_order_create->start_date);
        ssio_insertion_order_create->start_date = NULL;
    }
    if (ssio_insertion_order_create->user_email) {
        free(ssio_insertion_order_create->user_email);
        ssio_insertion_order_create->user_email = NULL;
    }
    free(ssio_insertion_order_create);
}

cJSON *ssio_insertion_order_create_convertToJSON(ssio_insertion_order_create_t *ssio_insertion_order_create) {
    cJSON *item = cJSON_CreateObject();

    // ssio_insertion_order_create->accepted_terms_id
    if (!ssio_insertion_order_create->accepted_terms_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "accepted_terms_id", ssio_insertion_order_create->accepted_terms_id) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->accepted_terms_time
    if(ssio_insertion_order_create->accepted_terms_time) {
    if(cJSON_AddNumberToObject(item, "accepted_terms_time", *ssio_insertion_order_create->accepted_terms_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_insertion_order_create->agency_link
    if(ssio_insertion_order_create->agency_link) {
    if(cJSON_AddStringToObject(item, "agency_link", ssio_insertion_order_create->agency_link) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_create->billing_contact_email
    if (!ssio_insertion_order_create->billing_contact_email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billing_contact_email", ssio_insertion_order_create->billing_contact_email) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->billing_contact_firstname
    if (!ssio_insertion_order_create->billing_contact_firstname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billing_contact_firstname", ssio_insertion_order_create->billing_contact_firstname) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->billing_contact_lastname
    if (!ssio_insertion_order_create->billing_contact_lastname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billing_contact_lastname", ssio_insertion_order_create->billing_contact_lastname) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->billto_billing_address_id
    if (!ssio_insertion_order_create->billto_billing_address_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billto_billing_address_id", ssio_insertion_order_create->billto_billing_address_id) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->billto_business_address_id
    if (!ssio_insertion_order_create->billto_business_address_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billto_business_address_id", ssio_insertion_order_create->billto_business_address_id) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->billto_company_id
    if (!ssio_insertion_order_create->billto_company_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billto_company_id", ssio_insertion_order_create->billto_company_id) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->budget_amount
    if(ssio_insertion_order_create->budget_amount) {
    if(cJSON_AddNumberToObject(item, "budget_amount", *ssio_insertion_order_create->budget_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_insertion_order_create->currency_info
    if (pinterest_rest_api_currency__NULL == ssio_insertion_order_create->currency_info) {
        goto fail;
    }
    cJSON *currency_info_local_JSON = currency_convertToJSON(ssio_insertion_order_create->currency_info);
    if(currency_info_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency_info", currency_info_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ssio_insertion_order_create->end_date
    if(ssio_insertion_order_create->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", ssio_insertion_order_create->end_date) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_create->estimated_monthly_spend
    if(ssio_insertion_order_create->estimated_monthly_spend) {
    if(cJSON_AddNumberToObject(item, "estimated_monthly_spend", *ssio_insertion_order_create->estimated_monthly_spend) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_insertion_order_create->media_contact_email
    if (!ssio_insertion_order_create->media_contact_email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_contact_email", ssio_insertion_order_create->media_contact_email) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->media_contact_firstname
    if (!ssio_insertion_order_create->media_contact_firstname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_contact_firstname", ssio_insertion_order_create->media_contact_firstname) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->media_contact_lastname
    if (!ssio_insertion_order_create->media_contact_lastname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_contact_lastname", ssio_insertion_order_create->media_contact_lastname) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->order_line_type
    if (!ssio_insertion_order_create->order_line_type) {
        goto fail;
    }
    cJSON *order_line_type_local_JSON = ssio_order_line_type_convertToJSON(ssio_insertion_order_create->order_line_type);
    if(order_line_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "order_line_type", order_line_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ssio_insertion_order_create->order_name
    if (!ssio_insertion_order_create->order_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "order_name", ssio_insertion_order_create->order_name) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->pmp_id
    if (!ssio_insertion_order_create->pmp_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pmp_id", ssio_insertion_order_create->pmp_id) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->po_number
    if (!ssio_insertion_order_create->po_number) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "po_number", ssio_insertion_order_create->po_number) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->start_date
    if (!ssio_insertion_order_create->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", ssio_insertion_order_create->start_date) == NULL) {
    goto fail; //String
    }


    // ssio_insertion_order_create->user_email
    if(ssio_insertion_order_create->user_email) {
    if(cJSON_AddStringToObject(item, "user_email", ssio_insertion_order_create->user_email) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ssio_insertion_order_create_t *ssio_insertion_order_create_parseFromJSON(cJSON *ssio_insertion_order_createJSON){

    ssio_insertion_order_create_t *ssio_insertion_order_create_local_var = NULL;

    char *accepted_terms_id_local_str = NULL;

    // define the local variable for ssio_insertion_order_create->accepted_terms_time
    int *accepted_terms_time_local_var = NULL;

    char *agency_link_local_str = NULL;

    char *billing_contact_email_local_str = NULL;

    char *billing_contact_firstname_local_str = NULL;

    char *billing_contact_lastname_local_str = NULL;

    char *billto_billing_address_id_local_str = NULL;

    char *billto_business_address_id_local_str = NULL;

    char *billto_company_id_local_str = NULL;

    // define the local variable for ssio_insertion_order_create->budget_amount
    double *budget_amount_local_var = NULL;

    // define the local variable for ssio_insertion_order_create->currency_info
    pinterest_rest_api_currency__e currency_info_local_nonprim = 0;

    char *end_date_local_str = NULL;

    // define the local variable for ssio_insertion_order_create->estimated_monthly_spend
    double *estimated_monthly_spend_local_var = NULL;

    char *media_contact_email_local_str = NULL;

    char *media_contact_firstname_local_str = NULL;

    char *media_contact_lastname_local_str = NULL;

    // define the local variable for ssio_insertion_order_create->order_line_type
    ssio_order_line_type_t *order_line_type_local_nonprim = NULL;

    char *order_name_local_str = NULL;

    char *pmp_id_local_str = NULL;

    char *po_number_local_str = NULL;

    char *start_date_local_str = NULL;

    char *user_email_local_str = NULL;

    // ssio_insertion_order_create->accepted_terms_id
    cJSON *accepted_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "accepted_terms_id");
    if (cJSON_IsNull(accepted_terms_id)) {
        accepted_terms_id = NULL;
    }
    if (!accepted_terms_id) {
        goto end;
    }

    
    if(!cJSON_IsString(accepted_terms_id))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->accepted_terms_time
    cJSON *accepted_terms_time = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "accepted_terms_time");
    if (cJSON_IsNull(accepted_terms_time)) {
        accepted_terms_time = NULL;
    }
    if (accepted_terms_time) { 
    if(!cJSON_IsNumber(accepted_terms_time))
    {
    goto end; //Numeric
    }
    accepted_terms_time_local_var = malloc(sizeof(int));
    if(!accepted_terms_time_local_var)
    {
        goto end;
    }
    *accepted_terms_time_local_var = accepted_terms_time->valuedouble;
    }

    // ssio_insertion_order_create->agency_link
    cJSON *agency_link = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "agency_link");
    if (cJSON_IsNull(agency_link)) {
        agency_link = NULL;
    }
    if (agency_link) { 
    if(!cJSON_IsString(agency_link) && !cJSON_IsNull(agency_link))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_create->billing_contact_email
    cJSON *billing_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "billing_contact_email");
    if (cJSON_IsNull(billing_contact_email)) {
        billing_contact_email = NULL;
    }
    if (!billing_contact_email) {
        goto end;
    }

    
    if(!cJSON_IsString(billing_contact_email))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->billing_contact_firstname
    cJSON *billing_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "billing_contact_firstname");
    if (cJSON_IsNull(billing_contact_firstname)) {
        billing_contact_firstname = NULL;
    }
    if (!billing_contact_firstname) {
        goto end;
    }

    
    if(!cJSON_IsString(billing_contact_firstname))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->billing_contact_lastname
    cJSON *billing_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "billing_contact_lastname");
    if (cJSON_IsNull(billing_contact_lastname)) {
        billing_contact_lastname = NULL;
    }
    if (!billing_contact_lastname) {
        goto end;
    }

    
    if(!cJSON_IsString(billing_contact_lastname))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->billto_billing_address_id
    cJSON *billto_billing_address_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "billto_billing_address_id");
    if (cJSON_IsNull(billto_billing_address_id)) {
        billto_billing_address_id = NULL;
    }
    if (!billto_billing_address_id) {
        goto end;
    }

    
    if(!cJSON_IsString(billto_billing_address_id))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->billto_business_address_id
    cJSON *billto_business_address_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "billto_business_address_id");
    if (cJSON_IsNull(billto_business_address_id)) {
        billto_business_address_id = NULL;
    }
    if (!billto_business_address_id) {
        goto end;
    }

    
    if(!cJSON_IsString(billto_business_address_id))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->billto_company_id
    cJSON *billto_company_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "billto_company_id");
    if (cJSON_IsNull(billto_company_id)) {
        billto_company_id = NULL;
    }
    if (!billto_company_id) {
        goto end;
    }

    
    if(!cJSON_IsString(billto_company_id))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->budget_amount
    cJSON *budget_amount = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "budget_amount");
    if (cJSON_IsNull(budget_amount)) {
        budget_amount = NULL;
    }
    if (budget_amount) { 
    if(!cJSON_IsNumber(budget_amount))
    {
    goto end; //Numeric
    }
    budget_amount_local_var = malloc(sizeof(double));
    if(!budget_amount_local_var)
    {
        goto end;
    }
    *budget_amount_local_var = budget_amount->valuedouble;
    }

    // ssio_insertion_order_create->currency_info
    cJSON *currency_info = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "currency_info");
    if (cJSON_IsNull(currency_info)) {
        currency_info = NULL;
    }
    if (!currency_info) {
        goto end;
    }

    
    currency_info_local_nonprim = currency_parseFromJSON(currency_info); //custom

    // ssio_insertion_order_create->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (end_date) { 
    if(!cJSON_IsString(end_date) && !cJSON_IsNull(end_date))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_create->estimated_monthly_spend
    cJSON *estimated_monthly_spend = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "estimated_monthly_spend");
    if (cJSON_IsNull(estimated_monthly_spend)) {
        estimated_monthly_spend = NULL;
    }
    if (estimated_monthly_spend) { 
    if(!cJSON_IsNumber(estimated_monthly_spend))
    {
    goto end; //Numeric
    }
    estimated_monthly_spend_local_var = malloc(sizeof(double));
    if(!estimated_monthly_spend_local_var)
    {
        goto end;
    }
    *estimated_monthly_spend_local_var = estimated_monthly_spend->valuedouble;
    }

    // ssio_insertion_order_create->media_contact_email
    cJSON *media_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "media_contact_email");
    if (cJSON_IsNull(media_contact_email)) {
        media_contact_email = NULL;
    }
    if (!media_contact_email) {
        goto end;
    }

    
    if(!cJSON_IsString(media_contact_email))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->media_contact_firstname
    cJSON *media_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "media_contact_firstname");
    if (cJSON_IsNull(media_contact_firstname)) {
        media_contact_firstname = NULL;
    }
    if (!media_contact_firstname) {
        goto end;
    }

    
    if(!cJSON_IsString(media_contact_firstname))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->media_contact_lastname
    cJSON *media_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "media_contact_lastname");
    if (cJSON_IsNull(media_contact_lastname)) {
        media_contact_lastname = NULL;
    }
    if (!media_contact_lastname) {
        goto end;
    }

    
    if(!cJSON_IsString(media_contact_lastname))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->order_line_type
    cJSON *order_line_type = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "order_line_type");
    if (cJSON_IsNull(order_line_type)) {
        order_line_type = NULL;
    }
    if (!order_line_type) {
        goto end;
    }

    
    order_line_type_local_nonprim = ssio_order_line_type_parseFromJSON(order_line_type); //custom

    // ssio_insertion_order_create->order_name
    cJSON *order_name = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "order_name");
    if (cJSON_IsNull(order_name)) {
        order_name = NULL;
    }
    if (!order_name) {
        goto end;
    }

    
    if(!cJSON_IsString(order_name))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->pmp_id
    cJSON *pmp_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "pmp_id");
    if (cJSON_IsNull(pmp_id)) {
        pmp_id = NULL;
    }
    if (!pmp_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pmp_id))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->po_number
    cJSON *po_number = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "po_number");
    if (cJSON_IsNull(po_number)) {
        po_number = NULL;
    }
    if (!po_number) {
        goto end;
    }

    
    if(!cJSON_IsString(po_number))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }

    // ssio_insertion_order_create->user_email
    cJSON *user_email = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_createJSON, "user_email");
    if (cJSON_IsNull(user_email)) {
        user_email = NULL;
    }
    if (user_email) { 
    if(!cJSON_IsString(user_email) && !cJSON_IsNull(user_email))
    {
    goto end; //String
    }
    }


    if (accepted_terms_id && !cJSON_IsNull(accepted_terms_id)) accepted_terms_id_local_str = strdup(accepted_terms_id->valuestring);
    if (agency_link && !cJSON_IsNull(agency_link)) agency_link_local_str = strdup(agency_link->valuestring);
    if (billing_contact_email && !cJSON_IsNull(billing_contact_email)) billing_contact_email_local_str = strdup(billing_contact_email->valuestring);
    if (billing_contact_firstname && !cJSON_IsNull(billing_contact_firstname)) billing_contact_firstname_local_str = strdup(billing_contact_firstname->valuestring);
    if (billing_contact_lastname && !cJSON_IsNull(billing_contact_lastname)) billing_contact_lastname_local_str = strdup(billing_contact_lastname->valuestring);
    if (billto_billing_address_id && !cJSON_IsNull(billto_billing_address_id)) billto_billing_address_id_local_str = strdup(billto_billing_address_id->valuestring);
    if (billto_business_address_id && !cJSON_IsNull(billto_business_address_id)) billto_business_address_id_local_str = strdup(billto_business_address_id->valuestring);
    if (billto_company_id && !cJSON_IsNull(billto_company_id)) billto_company_id_local_str = strdup(billto_company_id->valuestring);
    if (end_date && !cJSON_IsNull(end_date)) end_date_local_str = strdup(end_date->valuestring);
    if (media_contact_email && !cJSON_IsNull(media_contact_email)) media_contact_email_local_str = strdup(media_contact_email->valuestring);
    if (media_contact_firstname && !cJSON_IsNull(media_contact_firstname)) media_contact_firstname_local_str = strdup(media_contact_firstname->valuestring);
    if (media_contact_lastname && !cJSON_IsNull(media_contact_lastname)) media_contact_lastname_local_str = strdup(media_contact_lastname->valuestring);
    if (order_name && !cJSON_IsNull(order_name)) order_name_local_str = strdup(order_name->valuestring);
    if (pmp_id && !cJSON_IsNull(pmp_id)) pmp_id_local_str = strdup(pmp_id->valuestring);
    if (po_number && !cJSON_IsNull(po_number)) po_number_local_str = strdup(po_number->valuestring);
    if (start_date && !cJSON_IsNull(start_date)) start_date_local_str = strdup(start_date->valuestring);
    if (user_email && !cJSON_IsNull(user_email)) user_email_local_str = strdup(user_email->valuestring);

    ssio_insertion_order_create_local_var = ssio_insertion_order_create_create_internal (
        accepted_terms_id_local_str,
        accepted_terms_time_local_var,
        agency_link_local_str,
        billing_contact_email_local_str,
        billing_contact_firstname_local_str,
        billing_contact_lastname_local_str,
        billto_billing_address_id_local_str,
        billto_business_address_id_local_str,
        billto_company_id_local_str,
        budget_amount_local_var,
        currency_info_local_nonprim,
        end_date_local_str,
        estimated_monthly_spend_local_var,
        media_contact_email_local_str,
        media_contact_firstname_local_str,
        media_contact_lastname_local_str,
        order_line_type_local_nonprim,
        order_name_local_str,
        pmp_id_local_str,
        po_number_local_str,
        start_date_local_str,
        user_email_local_str
        );

    if (!ssio_insertion_order_create_local_var) {
        goto end;
    }

    return ssio_insertion_order_create_local_var;
end:
    if (accepted_terms_id_local_str) {
        free(accepted_terms_id_local_str);
        accepted_terms_id_local_str = NULL;
    }
    if (accepted_terms_time_local_var) {
        free(accepted_terms_time_local_var);
        accepted_terms_time_local_var = NULL;
    }
    if (agency_link_local_str) {
        free(agency_link_local_str);
        agency_link_local_str = NULL;
    }
    if (billing_contact_email_local_str) {
        free(billing_contact_email_local_str);
        billing_contact_email_local_str = NULL;
    }
    if (billing_contact_firstname_local_str) {
        free(billing_contact_firstname_local_str);
        billing_contact_firstname_local_str = NULL;
    }
    if (billing_contact_lastname_local_str) {
        free(billing_contact_lastname_local_str);
        billing_contact_lastname_local_str = NULL;
    }
    if (billto_billing_address_id_local_str) {
        free(billto_billing_address_id_local_str);
        billto_billing_address_id_local_str = NULL;
    }
    if (billto_business_address_id_local_str) {
        free(billto_business_address_id_local_str);
        billto_business_address_id_local_str = NULL;
    }
    if (billto_company_id_local_str) {
        free(billto_company_id_local_str);
        billto_company_id_local_str = NULL;
    }
    if (budget_amount_local_var) {
        free(budget_amount_local_var);
        budget_amount_local_var = NULL;
    }
    if (currency_info_local_nonprim) {
        currency_info_local_nonprim = 0;
    }
    if (end_date_local_str) {
        free(end_date_local_str);
        end_date_local_str = NULL;
    }
    if (estimated_monthly_spend_local_var) {
        free(estimated_monthly_spend_local_var);
        estimated_monthly_spend_local_var = NULL;
    }
    if (media_contact_email_local_str) {
        free(media_contact_email_local_str);
        media_contact_email_local_str = NULL;
    }
    if (media_contact_firstname_local_str) {
        free(media_contact_firstname_local_str);
        media_contact_firstname_local_str = NULL;
    }
    if (media_contact_lastname_local_str) {
        free(media_contact_lastname_local_str);
        media_contact_lastname_local_str = NULL;
    }
    if (order_line_type_local_nonprim) {
        ssio_order_line_type_free(order_line_type_local_nonprim);
        order_line_type_local_nonprim = NULL;
    }
    if (order_name_local_str) {
        free(order_name_local_str);
        order_name_local_str = NULL;
    }
    if (pmp_id_local_str) {
        free(pmp_id_local_str);
        pmp_id_local_str = NULL;
    }
    if (po_number_local_str) {
        free(po_number_local_str);
        po_number_local_str = NULL;
    }
    if (start_date_local_str) {
        free(start_date_local_str);
        start_date_local_str = NULL;
    }
    if (user_email_local_str) {
        free(user_email_local_str);
        user_email_local_str = NULL;
    }
    return NULL;

}
