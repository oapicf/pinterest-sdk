#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_order_line.h"



static ssio_order_line_t *ssio_order_line_create_internal(
    char *accepted_terms_id,
    char *accepted_terms_time,
    char *ads_manager_order_line_id,
    char *agency_link,
    char *bill_to_company_name,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double budget_amount,
    pinterest_rest_api_currency__e currency_info,
    char *end_date,
    double estimated_monthly_spend,
    char *last_modified_date_time,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *order_name,
    char *pin_order_id,
    char *pmp_name,
    char *po_number,
    char *salesforce_order_line_id,
    char *start_date
    ) {
    ssio_order_line_t *ssio_order_line_local_var = malloc(sizeof(ssio_order_line_t));
    if (!ssio_order_line_local_var) {
        return NULL;
    }
    ssio_order_line_local_var->accepted_terms_id = accepted_terms_id;
    ssio_order_line_local_var->accepted_terms_time = accepted_terms_time;
    ssio_order_line_local_var->ads_manager_order_line_id = ads_manager_order_line_id;
    ssio_order_line_local_var->agency_link = agency_link;
    ssio_order_line_local_var->bill_to_company_name = bill_to_company_name;
    ssio_order_line_local_var->billing_contact_email = billing_contact_email;
    ssio_order_line_local_var->billing_contact_firstname = billing_contact_firstname;
    ssio_order_line_local_var->billing_contact_lastname = billing_contact_lastname;
    ssio_order_line_local_var->budget_amount = budget_amount;
    ssio_order_line_local_var->currency_info = currency_info;
    ssio_order_line_local_var->end_date = end_date;
    ssio_order_line_local_var->estimated_monthly_spend = estimated_monthly_spend;
    ssio_order_line_local_var->last_modified_date_time = last_modified_date_time;
    ssio_order_line_local_var->media_contact_email = media_contact_email;
    ssio_order_line_local_var->media_contact_firstname = media_contact_firstname;
    ssio_order_line_local_var->media_contact_lastname = media_contact_lastname;
    ssio_order_line_local_var->order_name = order_name;
    ssio_order_line_local_var->pin_order_id = pin_order_id;
    ssio_order_line_local_var->pmp_name = pmp_name;
    ssio_order_line_local_var->po_number = po_number;
    ssio_order_line_local_var->salesforce_order_line_id = salesforce_order_line_id;
    ssio_order_line_local_var->start_date = start_date;

    ssio_order_line_local_var->_library_owned = 1;
    return ssio_order_line_local_var;
}

__attribute__((deprecated)) ssio_order_line_t *ssio_order_line_create(
    char *accepted_terms_id,
    char *accepted_terms_time,
    char *ads_manager_order_line_id,
    char *agency_link,
    char *bill_to_company_name,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double budget_amount,
    pinterest_rest_api_currency__e currency_info,
    char *end_date,
    double estimated_monthly_spend,
    char *last_modified_date_time,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *order_name,
    char *pin_order_id,
    char *pmp_name,
    char *po_number,
    char *salesforce_order_line_id,
    char *start_date
    ) {
    return ssio_order_line_create_internal (
        accepted_terms_id,
        accepted_terms_time,
        ads_manager_order_line_id,
        agency_link,
        bill_to_company_name,
        billing_contact_email,
        billing_contact_firstname,
        billing_contact_lastname,
        budget_amount,
        currency_info,
        end_date,
        estimated_monthly_spend,
        last_modified_date_time,
        media_contact_email,
        media_contact_firstname,
        media_contact_lastname,
        order_name,
        pin_order_id,
        pmp_name,
        po_number,
        salesforce_order_line_id,
        start_date
        );
}

void ssio_order_line_free(ssio_order_line_t *ssio_order_line) {
    if(NULL == ssio_order_line){
        return ;
    }
    if(ssio_order_line->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_order_line_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_order_line->accepted_terms_id) {
        free(ssio_order_line->accepted_terms_id);
        ssio_order_line->accepted_terms_id = NULL;
    }
    if (ssio_order_line->accepted_terms_time) {
        free(ssio_order_line->accepted_terms_time);
        ssio_order_line->accepted_terms_time = NULL;
    }
    if (ssio_order_line->ads_manager_order_line_id) {
        free(ssio_order_line->ads_manager_order_line_id);
        ssio_order_line->ads_manager_order_line_id = NULL;
    }
    if (ssio_order_line->agency_link) {
        free(ssio_order_line->agency_link);
        ssio_order_line->agency_link = NULL;
    }
    if (ssio_order_line->bill_to_company_name) {
        free(ssio_order_line->bill_to_company_name);
        ssio_order_line->bill_to_company_name = NULL;
    }
    if (ssio_order_line->billing_contact_email) {
        free(ssio_order_line->billing_contact_email);
        ssio_order_line->billing_contact_email = NULL;
    }
    if (ssio_order_line->billing_contact_firstname) {
        free(ssio_order_line->billing_contact_firstname);
        ssio_order_line->billing_contact_firstname = NULL;
    }
    if (ssio_order_line->billing_contact_lastname) {
        free(ssio_order_line->billing_contact_lastname);
        ssio_order_line->billing_contact_lastname = NULL;
    }
    if (ssio_order_line->end_date) {
        free(ssio_order_line->end_date);
        ssio_order_line->end_date = NULL;
    }
    if (ssio_order_line->last_modified_date_time) {
        free(ssio_order_line->last_modified_date_time);
        ssio_order_line->last_modified_date_time = NULL;
    }
    if (ssio_order_line->media_contact_email) {
        free(ssio_order_line->media_contact_email);
        ssio_order_line->media_contact_email = NULL;
    }
    if (ssio_order_line->media_contact_firstname) {
        free(ssio_order_line->media_contact_firstname);
        ssio_order_line->media_contact_firstname = NULL;
    }
    if (ssio_order_line->media_contact_lastname) {
        free(ssio_order_line->media_contact_lastname);
        ssio_order_line->media_contact_lastname = NULL;
    }
    if (ssio_order_line->order_name) {
        free(ssio_order_line->order_name);
        ssio_order_line->order_name = NULL;
    }
    if (ssio_order_line->pin_order_id) {
        free(ssio_order_line->pin_order_id);
        ssio_order_line->pin_order_id = NULL;
    }
    if (ssio_order_line->pmp_name) {
        free(ssio_order_line->pmp_name);
        ssio_order_line->pmp_name = NULL;
    }
    if (ssio_order_line->po_number) {
        free(ssio_order_line->po_number);
        ssio_order_line->po_number = NULL;
    }
    if (ssio_order_line->salesforce_order_line_id) {
        free(ssio_order_line->salesforce_order_line_id);
        ssio_order_line->salesforce_order_line_id = NULL;
    }
    if (ssio_order_line->start_date) {
        free(ssio_order_line->start_date);
        ssio_order_line->start_date = NULL;
    }
    free(ssio_order_line);
}

cJSON *ssio_order_line_convertToJSON(ssio_order_line_t *ssio_order_line) {
    cJSON *item = cJSON_CreateObject();

    // ssio_order_line->accepted_terms_id
    if(ssio_order_line->accepted_terms_id) {
    if(cJSON_AddStringToObject(item, "accepted_terms_id", ssio_order_line->accepted_terms_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->accepted_terms_time
    if(ssio_order_line->accepted_terms_time) {
    if(cJSON_AddStringToObject(item, "accepted_terms_time", ssio_order_line->accepted_terms_time) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->ads_manager_order_line_id
    if(ssio_order_line->ads_manager_order_line_id) {
    if(cJSON_AddStringToObject(item, "ads_manager_order_line_id", ssio_order_line->ads_manager_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->agency_link
    if(ssio_order_line->agency_link) {
    if(cJSON_AddStringToObject(item, "agency_link", ssio_order_line->agency_link) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->bill_to_company_name
    if(ssio_order_line->bill_to_company_name) {
    if(cJSON_AddStringToObject(item, "bill_to_company_name", ssio_order_line->bill_to_company_name) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->billing_contact_email
    if(ssio_order_line->billing_contact_email) {
    if(cJSON_AddStringToObject(item, "billing_contact_email", ssio_order_line->billing_contact_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->billing_contact_firstname
    if(ssio_order_line->billing_contact_firstname) {
    if(cJSON_AddStringToObject(item, "billing_contact_firstname", ssio_order_line->billing_contact_firstname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->billing_contact_lastname
    if(ssio_order_line->billing_contact_lastname) {
    if(cJSON_AddStringToObject(item, "billing_contact_lastname", ssio_order_line->billing_contact_lastname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->budget_amount
    if(ssio_order_line->budget_amount) {
    if(cJSON_AddNumberToObject(item, "budget_amount", ssio_order_line->budget_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_order_line->currency_info
    if(ssio_order_line->currency_info != pinterest_rest_api_currency__NULL) {
    cJSON *currency_info_local_JSON = currency_convertToJSON(ssio_order_line->currency_info);
    if(currency_info_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency_info", currency_info_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ssio_order_line->end_date
    if(ssio_order_line->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", ssio_order_line->end_date) == NULL) {
    goto fail; //Date
    }
    }


    // ssio_order_line->estimated_monthly_spend
    if(ssio_order_line->estimated_monthly_spend) {
    if(cJSON_AddNumberToObject(item, "estimated_monthly_spend", ssio_order_line->estimated_monthly_spend) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_order_line->last_modified_date_time
    if(ssio_order_line->last_modified_date_time) {
    if(cJSON_AddStringToObject(item, "last_modified_date_time", ssio_order_line->last_modified_date_time) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->media_contact_email
    if(ssio_order_line->media_contact_email) {
    if(cJSON_AddStringToObject(item, "media_contact_email", ssio_order_line->media_contact_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->media_contact_firstname
    if(ssio_order_line->media_contact_firstname) {
    if(cJSON_AddStringToObject(item, "media_contact_firstname", ssio_order_line->media_contact_firstname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->media_contact_lastname
    if(ssio_order_line->media_contact_lastname) {
    if(cJSON_AddStringToObject(item, "media_contact_lastname", ssio_order_line->media_contact_lastname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->order_name
    if(ssio_order_line->order_name) {
    if(cJSON_AddStringToObject(item, "order_name", ssio_order_line->order_name) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->pin_order_id
    if(ssio_order_line->pin_order_id) {
    if(cJSON_AddStringToObject(item, "pin_order_id", ssio_order_line->pin_order_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->pmp_name
    if(ssio_order_line->pmp_name) {
    if(cJSON_AddStringToObject(item, "pmp_name", ssio_order_line->pmp_name) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->po_number
    if(ssio_order_line->po_number) {
    if(cJSON_AddStringToObject(item, "po_number", ssio_order_line->po_number) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->salesforce_order_line_id
    if(ssio_order_line->salesforce_order_line_id) {
    if(cJSON_AddStringToObject(item, "salesforce_order_line_id", ssio_order_line->salesforce_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->start_date
    if(ssio_order_line->start_date) {
    if(cJSON_AddStringToObject(item, "start_date", ssio_order_line->start_date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ssio_order_line_t *ssio_order_line_parseFromJSON(cJSON *ssio_order_lineJSON){

    ssio_order_line_t *ssio_order_line_local_var = NULL;

    // define the local variable for ssio_order_line->currency_info
    pinterest_rest_api_currency__e currency_info_local_nonprim = 0;

    // ssio_order_line->accepted_terms_id
    cJSON *accepted_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "accepted_terms_id");
    if (cJSON_IsNull(accepted_terms_id)) {
        accepted_terms_id = NULL;
    }
    if (accepted_terms_id) { 
    if(!cJSON_IsString(accepted_terms_id) && !cJSON_IsNull(accepted_terms_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->accepted_terms_time
    cJSON *accepted_terms_time = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "accepted_terms_time");
    if (cJSON_IsNull(accepted_terms_time)) {
        accepted_terms_time = NULL;
    }
    if (accepted_terms_time) { 
    if(!cJSON_IsString(accepted_terms_time) && !cJSON_IsNull(accepted_terms_time))
    {
    goto end; //String
    }
    }

    // ssio_order_line->ads_manager_order_line_id
    cJSON *ads_manager_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "ads_manager_order_line_id");
    if (cJSON_IsNull(ads_manager_order_line_id)) {
        ads_manager_order_line_id = NULL;
    }
    if (ads_manager_order_line_id) { 
    if(!cJSON_IsString(ads_manager_order_line_id) && !cJSON_IsNull(ads_manager_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->agency_link
    cJSON *agency_link = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "agency_link");
    if (cJSON_IsNull(agency_link)) {
        agency_link = NULL;
    }
    if (agency_link) { 
    if(!cJSON_IsString(agency_link) && !cJSON_IsNull(agency_link))
    {
    goto end; //String
    }
    }

    // ssio_order_line->bill_to_company_name
    cJSON *bill_to_company_name = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "bill_to_company_name");
    if (cJSON_IsNull(bill_to_company_name)) {
        bill_to_company_name = NULL;
    }
    if (bill_to_company_name) { 
    if(!cJSON_IsString(bill_to_company_name) && !cJSON_IsNull(bill_to_company_name))
    {
    goto end; //String
    }
    }

    // ssio_order_line->billing_contact_email
    cJSON *billing_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "billing_contact_email");
    if (cJSON_IsNull(billing_contact_email)) {
        billing_contact_email = NULL;
    }
    if (billing_contact_email) { 
    if(!cJSON_IsString(billing_contact_email) && !cJSON_IsNull(billing_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_order_line->billing_contact_firstname
    cJSON *billing_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "billing_contact_firstname");
    if (cJSON_IsNull(billing_contact_firstname)) {
        billing_contact_firstname = NULL;
    }
    if (billing_contact_firstname) { 
    if(!cJSON_IsString(billing_contact_firstname) && !cJSON_IsNull(billing_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->billing_contact_lastname
    cJSON *billing_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "billing_contact_lastname");
    if (cJSON_IsNull(billing_contact_lastname)) {
        billing_contact_lastname = NULL;
    }
    if (billing_contact_lastname) { 
    if(!cJSON_IsString(billing_contact_lastname) && !cJSON_IsNull(billing_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->budget_amount
    cJSON *budget_amount = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "budget_amount");
    if (cJSON_IsNull(budget_amount)) {
        budget_amount = NULL;
    }
    if (budget_amount) { 
    if(!cJSON_IsNumber(budget_amount))
    {
    goto end; //Numeric
    }
    }

    // ssio_order_line->currency_info
    cJSON *currency_info = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "currency_info");
    if (cJSON_IsNull(currency_info)) {
        currency_info = NULL;
    }
    if (currency_info) { 
    currency_info_local_nonprim = currency_parseFromJSON(currency_info); //custom
    }

    // ssio_order_line->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (end_date) { 
    if(!cJSON_IsString(end_date))
    {
    goto end; //Date
    }
    }

    // ssio_order_line->estimated_monthly_spend
    cJSON *estimated_monthly_spend = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "estimated_monthly_spend");
    if (cJSON_IsNull(estimated_monthly_spend)) {
        estimated_monthly_spend = NULL;
    }
    if (estimated_monthly_spend) { 
    if(!cJSON_IsNumber(estimated_monthly_spend))
    {
    goto end; //Numeric
    }
    }

    // ssio_order_line->last_modified_date_time
    cJSON *last_modified_date_time = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "last_modified_date_time");
    if (cJSON_IsNull(last_modified_date_time)) {
        last_modified_date_time = NULL;
    }
    if (last_modified_date_time) { 
    if(!cJSON_IsString(last_modified_date_time) && !cJSON_IsNull(last_modified_date_time))
    {
    goto end; //String
    }
    }

    // ssio_order_line->media_contact_email
    cJSON *media_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "media_contact_email");
    if (cJSON_IsNull(media_contact_email)) {
        media_contact_email = NULL;
    }
    if (media_contact_email) { 
    if(!cJSON_IsString(media_contact_email) && !cJSON_IsNull(media_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_order_line->media_contact_firstname
    cJSON *media_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "media_contact_firstname");
    if (cJSON_IsNull(media_contact_firstname)) {
        media_contact_firstname = NULL;
    }
    if (media_contact_firstname) { 
    if(!cJSON_IsString(media_contact_firstname) && !cJSON_IsNull(media_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->media_contact_lastname
    cJSON *media_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "media_contact_lastname");
    if (cJSON_IsNull(media_contact_lastname)) {
        media_contact_lastname = NULL;
    }
    if (media_contact_lastname) { 
    if(!cJSON_IsString(media_contact_lastname) && !cJSON_IsNull(media_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->order_name
    cJSON *order_name = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "order_name");
    if (cJSON_IsNull(order_name)) {
        order_name = NULL;
    }
    if (order_name) { 
    if(!cJSON_IsString(order_name) && !cJSON_IsNull(order_name))
    {
    goto end; //String
    }
    }

    // ssio_order_line->pin_order_id
    cJSON *pin_order_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "pin_order_id");
    if (cJSON_IsNull(pin_order_id)) {
        pin_order_id = NULL;
    }
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->pmp_name
    cJSON *pmp_name = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "pmp_name");
    if (cJSON_IsNull(pmp_name)) {
        pmp_name = NULL;
    }
    if (pmp_name) { 
    if(!cJSON_IsString(pmp_name) && !cJSON_IsNull(pmp_name))
    {
    goto end; //String
    }
    }

    // ssio_order_line->po_number
    cJSON *po_number = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "po_number");
    if (cJSON_IsNull(po_number)) {
        po_number = NULL;
    }
    if (po_number) { 
    if(!cJSON_IsString(po_number) && !cJSON_IsNull(po_number))
    {
    goto end; //String
    }
    }

    // ssio_order_line->salesforce_order_line_id
    cJSON *salesforce_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "salesforce_order_line_id");
    if (cJSON_IsNull(salesforce_order_line_id)) {
        salesforce_order_line_id = NULL;
    }
    if (salesforce_order_line_id) { 
    if(!cJSON_IsString(salesforce_order_line_id) && !cJSON_IsNull(salesforce_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (start_date) { 
    if(!cJSON_IsString(start_date))
    {
    goto end; //Date
    }
    }


    ssio_order_line_local_var = ssio_order_line_create_internal (
        accepted_terms_id && !cJSON_IsNull(accepted_terms_id) ? strdup(accepted_terms_id->valuestring) : NULL,
        accepted_terms_time && !cJSON_IsNull(accepted_terms_time) ? strdup(accepted_terms_time->valuestring) : NULL,
        ads_manager_order_line_id && !cJSON_IsNull(ads_manager_order_line_id) ? strdup(ads_manager_order_line_id->valuestring) : NULL,
        agency_link && !cJSON_IsNull(agency_link) ? strdup(agency_link->valuestring) : NULL,
        bill_to_company_name && !cJSON_IsNull(bill_to_company_name) ? strdup(bill_to_company_name->valuestring) : NULL,
        billing_contact_email && !cJSON_IsNull(billing_contact_email) ? strdup(billing_contact_email->valuestring) : NULL,
        billing_contact_firstname && !cJSON_IsNull(billing_contact_firstname) ? strdup(billing_contact_firstname->valuestring) : NULL,
        billing_contact_lastname && !cJSON_IsNull(billing_contact_lastname) ? strdup(billing_contact_lastname->valuestring) : NULL,
        budget_amount ? budget_amount->valuedouble : 0,
        currency_info ? currency_info_local_nonprim : 0,
        end_date ? strdup(end_date->valuestring) : NULL,
        estimated_monthly_spend ? estimated_monthly_spend->valuedouble : 0,
        last_modified_date_time && !cJSON_IsNull(last_modified_date_time) ? strdup(last_modified_date_time->valuestring) : NULL,
        media_contact_email && !cJSON_IsNull(media_contact_email) ? strdup(media_contact_email->valuestring) : NULL,
        media_contact_firstname && !cJSON_IsNull(media_contact_firstname) ? strdup(media_contact_firstname->valuestring) : NULL,
        media_contact_lastname && !cJSON_IsNull(media_contact_lastname) ? strdup(media_contact_lastname->valuestring) : NULL,
        order_name && !cJSON_IsNull(order_name) ? strdup(order_name->valuestring) : NULL,
        pin_order_id && !cJSON_IsNull(pin_order_id) ? strdup(pin_order_id->valuestring) : NULL,
        pmp_name && !cJSON_IsNull(pmp_name) ? strdup(pmp_name->valuestring) : NULL,
        po_number && !cJSON_IsNull(po_number) ? strdup(po_number->valuestring) : NULL,
        salesforce_order_line_id && !cJSON_IsNull(salesforce_order_line_id) ? strdup(salesforce_order_line_id->valuestring) : NULL,
        start_date ? strdup(start_date->valuestring) : NULL
        );

    return ssio_order_line_local_var;
end:
    if (currency_info_local_nonprim) {
        currency_info_local_nonprim = 0;
    }
    return NULL;

}
