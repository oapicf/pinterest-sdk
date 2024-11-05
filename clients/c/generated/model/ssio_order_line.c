#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_order_line.h"


char* ssio_order_line_currency_info_ToString(pinterest_rest_api_ssio_order_line__e currency_info) {
    char* currency_infoArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP", "INR", "TRY" };
    return currency_infoArray[currency_info];
}

pinterest_rest_api_ssio_order_line__e ssio_order_line_currency_info_FromString(char* currency_info){
    int stringToReturn = 0;
    char *currency_infoArray[] =  { "NULL", "UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP", "INR", "TRY" };
    size_t sizeofArray = sizeof(currency_infoArray) / sizeof(currency_infoArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency_info, currency_infoArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

ssio_order_line_t *ssio_order_line_create(
    char *salesforce_order_line_id,
    char *ads_manager_order_line_id,
    char *pin_order_id,
    char *last_modified_date_time,
    char *start_date,
    char *end_date,
    char *bill_to_company_name,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billing_contact_email,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    currency_t *currency_info,
    char *agency_link,
    char *po_number,
    char *order_name,
    char *pmp_name,
    char *accepted_terms_id,
    char *accepted_terms_time,
    double budget_amount,
    double estimated_monthly_spend
    ) {
    ssio_order_line_t *ssio_order_line_local_var = malloc(sizeof(ssio_order_line_t));
    if (!ssio_order_line_local_var) {
        return NULL;
    }
    ssio_order_line_local_var->salesforce_order_line_id = salesforce_order_line_id;
    ssio_order_line_local_var->ads_manager_order_line_id = ads_manager_order_line_id;
    ssio_order_line_local_var->pin_order_id = pin_order_id;
    ssio_order_line_local_var->last_modified_date_time = last_modified_date_time;
    ssio_order_line_local_var->start_date = start_date;
    ssio_order_line_local_var->end_date = end_date;
    ssio_order_line_local_var->bill_to_company_name = bill_to_company_name;
    ssio_order_line_local_var->billing_contact_firstname = billing_contact_firstname;
    ssio_order_line_local_var->billing_contact_lastname = billing_contact_lastname;
    ssio_order_line_local_var->billing_contact_email = billing_contact_email;
    ssio_order_line_local_var->media_contact_email = media_contact_email;
    ssio_order_line_local_var->media_contact_firstname = media_contact_firstname;
    ssio_order_line_local_var->media_contact_lastname = media_contact_lastname;
    ssio_order_line_local_var->currency_info = currency_info;
    ssio_order_line_local_var->agency_link = agency_link;
    ssio_order_line_local_var->po_number = po_number;
    ssio_order_line_local_var->order_name = order_name;
    ssio_order_line_local_var->pmp_name = pmp_name;
    ssio_order_line_local_var->accepted_terms_id = accepted_terms_id;
    ssio_order_line_local_var->accepted_terms_time = accepted_terms_time;
    ssio_order_line_local_var->budget_amount = budget_amount;
    ssio_order_line_local_var->estimated_monthly_spend = estimated_monthly_spend;

    return ssio_order_line_local_var;
}


void ssio_order_line_free(ssio_order_line_t *ssio_order_line) {
    if(NULL == ssio_order_line){
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_order_line->salesforce_order_line_id) {
        free(ssio_order_line->salesforce_order_line_id);
        ssio_order_line->salesforce_order_line_id = NULL;
    }
    if (ssio_order_line->ads_manager_order_line_id) {
        free(ssio_order_line->ads_manager_order_line_id);
        ssio_order_line->ads_manager_order_line_id = NULL;
    }
    if (ssio_order_line->pin_order_id) {
        free(ssio_order_line->pin_order_id);
        ssio_order_line->pin_order_id = NULL;
    }
    if (ssio_order_line->last_modified_date_time) {
        free(ssio_order_line->last_modified_date_time);
        ssio_order_line->last_modified_date_time = NULL;
    }
    if (ssio_order_line->start_date) {
        free(ssio_order_line->start_date);
        ssio_order_line->start_date = NULL;
    }
    if (ssio_order_line->end_date) {
        free(ssio_order_line->end_date);
        ssio_order_line->end_date = NULL;
    }
    if (ssio_order_line->bill_to_company_name) {
        free(ssio_order_line->bill_to_company_name);
        ssio_order_line->bill_to_company_name = NULL;
    }
    if (ssio_order_line->billing_contact_firstname) {
        free(ssio_order_line->billing_contact_firstname);
        ssio_order_line->billing_contact_firstname = NULL;
    }
    if (ssio_order_line->billing_contact_lastname) {
        free(ssio_order_line->billing_contact_lastname);
        ssio_order_line->billing_contact_lastname = NULL;
    }
    if (ssio_order_line->billing_contact_email) {
        free(ssio_order_line->billing_contact_email);
        ssio_order_line->billing_contact_email = NULL;
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
    if (ssio_order_line->currency_info) {
        currency_free(ssio_order_line->currency_info);
        ssio_order_line->currency_info = NULL;
    }
    if (ssio_order_line->agency_link) {
        free(ssio_order_line->agency_link);
        ssio_order_line->agency_link = NULL;
    }
    if (ssio_order_line->po_number) {
        free(ssio_order_line->po_number);
        ssio_order_line->po_number = NULL;
    }
    if (ssio_order_line->order_name) {
        free(ssio_order_line->order_name);
        ssio_order_line->order_name = NULL;
    }
    if (ssio_order_line->pmp_name) {
        free(ssio_order_line->pmp_name);
        ssio_order_line->pmp_name = NULL;
    }
    if (ssio_order_line->accepted_terms_id) {
        free(ssio_order_line->accepted_terms_id);
        ssio_order_line->accepted_terms_id = NULL;
    }
    if (ssio_order_line->accepted_terms_time) {
        free(ssio_order_line->accepted_terms_time);
        ssio_order_line->accepted_terms_time = NULL;
    }
    free(ssio_order_line);
}

cJSON *ssio_order_line_convertToJSON(ssio_order_line_t *ssio_order_line) {
    cJSON *item = cJSON_CreateObject();

    // ssio_order_line->salesforce_order_line_id
    if(ssio_order_line->salesforce_order_line_id) {
    if(cJSON_AddStringToObject(item, "salesforce_order_line_id", ssio_order_line->salesforce_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->ads_manager_order_line_id
    if(ssio_order_line->ads_manager_order_line_id) {
    if(cJSON_AddStringToObject(item, "ads_manager_order_line_id", ssio_order_line->ads_manager_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->pin_order_id
    if(ssio_order_line->pin_order_id) {
    if(cJSON_AddStringToObject(item, "pin_order_id", ssio_order_line->pin_order_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->last_modified_date_time
    if(ssio_order_line->last_modified_date_time) {
    if(cJSON_AddStringToObject(item, "last_modified_date_time", ssio_order_line->last_modified_date_time) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->start_date
    if(ssio_order_line->start_date) {
    if(cJSON_AddStringToObject(item, "start_date", ssio_order_line->start_date) == NULL) {
    goto fail; //Date
    }
    }


    // ssio_order_line->end_date
    if(ssio_order_line->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", ssio_order_line->end_date) == NULL) {
    goto fail; //Date
    }
    }


    // ssio_order_line->bill_to_company_name
    if(ssio_order_line->bill_to_company_name) {
    if(cJSON_AddStringToObject(item, "bill_to_company_name", ssio_order_line->bill_to_company_name) == NULL) {
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


    // ssio_order_line->billing_contact_email
    if(ssio_order_line->billing_contact_email) {
    if(cJSON_AddStringToObject(item, "billing_contact_email", ssio_order_line->billing_contact_email) == NULL) {
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


    // ssio_order_line->currency_info
    if(ssio_order_line->currency_info != pinterest_rest_api_ssio_order_line__NULL) {
    cJSON *currency_info_local_JSON = currency_convertToJSON(ssio_order_line->currency_info);
    if(currency_info_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency_info", currency_info_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ssio_order_line->agency_link
    if(ssio_order_line->agency_link) {
    if(cJSON_AddStringToObject(item, "agency_link", ssio_order_line->agency_link) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->po_number
    if(ssio_order_line->po_number) {
    if(cJSON_AddStringToObject(item, "po_number", ssio_order_line->po_number) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->order_name
    if(ssio_order_line->order_name) {
    if(cJSON_AddStringToObject(item, "order_name", ssio_order_line->order_name) == NULL) {
    goto fail; //String
    }
    }


    // ssio_order_line->pmp_name
    if(ssio_order_line->pmp_name) {
    if(cJSON_AddStringToObject(item, "pmp_name", ssio_order_line->pmp_name) == NULL) {
    goto fail; //String
    }
    }


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


    // ssio_order_line->budget_amount
    if(ssio_order_line->budget_amount) {
    if(cJSON_AddNumberToObject(item, "budget_amount", ssio_order_line->budget_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_order_line->estimated_monthly_spend
    if(ssio_order_line->estimated_monthly_spend) {
    if(cJSON_AddNumberToObject(item, "estimated_monthly_spend", ssio_order_line->estimated_monthly_spend) == NULL) {
    goto fail; //Numeric
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
    currency_t *currency_info_local_nonprim = NULL;

    // ssio_order_line->salesforce_order_line_id
    cJSON *salesforce_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "salesforce_order_line_id");
    if (salesforce_order_line_id) { 
    if(!cJSON_IsString(salesforce_order_line_id) && !cJSON_IsNull(salesforce_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->ads_manager_order_line_id
    cJSON *ads_manager_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "ads_manager_order_line_id");
    if (ads_manager_order_line_id) { 
    if(!cJSON_IsString(ads_manager_order_line_id) && !cJSON_IsNull(ads_manager_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->pin_order_id
    cJSON *pin_order_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "pin_order_id");
    if (pin_order_id) { 
    if(!cJSON_IsString(pin_order_id) && !cJSON_IsNull(pin_order_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->last_modified_date_time
    cJSON *last_modified_date_time = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "last_modified_date_time");
    if (last_modified_date_time) { 
    if(!cJSON_IsString(last_modified_date_time) && !cJSON_IsNull(last_modified_date_time))
    {
    goto end; //String
    }
    }

    // ssio_order_line->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "start_date");
    if (start_date) { 
    if(!cJSON_IsString(start_date))
    {
    goto end; //Date
    }
    }

    // ssio_order_line->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "end_date");
    if (end_date) { 
    if(!cJSON_IsString(end_date))
    {
    goto end; //Date
    }
    }

    // ssio_order_line->bill_to_company_name
    cJSON *bill_to_company_name = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "bill_to_company_name");
    if (bill_to_company_name) { 
    if(!cJSON_IsString(bill_to_company_name) && !cJSON_IsNull(bill_to_company_name))
    {
    goto end; //String
    }
    }

    // ssio_order_line->billing_contact_firstname
    cJSON *billing_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "billing_contact_firstname");
    if (billing_contact_firstname) { 
    if(!cJSON_IsString(billing_contact_firstname) && !cJSON_IsNull(billing_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->billing_contact_lastname
    cJSON *billing_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "billing_contact_lastname");
    if (billing_contact_lastname) { 
    if(!cJSON_IsString(billing_contact_lastname) && !cJSON_IsNull(billing_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->billing_contact_email
    cJSON *billing_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "billing_contact_email");
    if (billing_contact_email) { 
    if(!cJSON_IsString(billing_contact_email) && !cJSON_IsNull(billing_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_order_line->media_contact_email
    cJSON *media_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "media_contact_email");
    if (media_contact_email) { 
    if(!cJSON_IsString(media_contact_email) && !cJSON_IsNull(media_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_order_line->media_contact_firstname
    cJSON *media_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "media_contact_firstname");
    if (media_contact_firstname) { 
    if(!cJSON_IsString(media_contact_firstname) && !cJSON_IsNull(media_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->media_contact_lastname
    cJSON *media_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "media_contact_lastname");
    if (media_contact_lastname) { 
    if(!cJSON_IsString(media_contact_lastname) && !cJSON_IsNull(media_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_order_line->currency_info
    cJSON *currency_info = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "currency_info");
    if (currency_info) { 
    currency_info_local_nonprim = currency_parseFromJSON(currency_info); //custom
    }

    // ssio_order_line->agency_link
    cJSON *agency_link = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "agency_link");
    if (agency_link) { 
    if(!cJSON_IsString(agency_link) && !cJSON_IsNull(agency_link))
    {
    goto end; //String
    }
    }

    // ssio_order_line->po_number
    cJSON *po_number = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "po_number");
    if (po_number) { 
    if(!cJSON_IsString(po_number) && !cJSON_IsNull(po_number))
    {
    goto end; //String
    }
    }

    // ssio_order_line->order_name
    cJSON *order_name = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "order_name");
    if (order_name) { 
    if(!cJSON_IsString(order_name) && !cJSON_IsNull(order_name))
    {
    goto end; //String
    }
    }

    // ssio_order_line->pmp_name
    cJSON *pmp_name = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "pmp_name");
    if (pmp_name) { 
    if(!cJSON_IsString(pmp_name) && !cJSON_IsNull(pmp_name))
    {
    goto end; //String
    }
    }

    // ssio_order_line->accepted_terms_id
    cJSON *accepted_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "accepted_terms_id");
    if (accepted_terms_id) { 
    if(!cJSON_IsString(accepted_terms_id) && !cJSON_IsNull(accepted_terms_id))
    {
    goto end; //String
    }
    }

    // ssio_order_line->accepted_terms_time
    cJSON *accepted_terms_time = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "accepted_terms_time");
    if (accepted_terms_time) { 
    if(!cJSON_IsString(accepted_terms_time) && !cJSON_IsNull(accepted_terms_time))
    {
    goto end; //String
    }
    }

    // ssio_order_line->budget_amount
    cJSON *budget_amount = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "budget_amount");
    if (budget_amount) { 
    if(!cJSON_IsNumber(budget_amount))
    {
    goto end; //Numeric
    }
    }

    // ssio_order_line->estimated_monthly_spend
    cJSON *estimated_monthly_spend = cJSON_GetObjectItemCaseSensitive(ssio_order_lineJSON, "estimated_monthly_spend");
    if (estimated_monthly_spend) { 
    if(!cJSON_IsNumber(estimated_monthly_spend))
    {
    goto end; //Numeric
    }
    }


    ssio_order_line_local_var = ssio_order_line_create (
        salesforce_order_line_id && !cJSON_IsNull(salesforce_order_line_id) ? strdup(salesforce_order_line_id->valuestring) : NULL,
        ads_manager_order_line_id && !cJSON_IsNull(ads_manager_order_line_id) ? strdup(ads_manager_order_line_id->valuestring) : NULL,
        pin_order_id && !cJSON_IsNull(pin_order_id) ? strdup(pin_order_id->valuestring) : NULL,
        last_modified_date_time && !cJSON_IsNull(last_modified_date_time) ? strdup(last_modified_date_time->valuestring) : NULL,
        start_date ? strdup(start_date->valuestring) : NULL,
        end_date ? strdup(end_date->valuestring) : NULL,
        bill_to_company_name && !cJSON_IsNull(bill_to_company_name) ? strdup(bill_to_company_name->valuestring) : NULL,
        billing_contact_firstname && !cJSON_IsNull(billing_contact_firstname) ? strdup(billing_contact_firstname->valuestring) : NULL,
        billing_contact_lastname && !cJSON_IsNull(billing_contact_lastname) ? strdup(billing_contact_lastname->valuestring) : NULL,
        billing_contact_email && !cJSON_IsNull(billing_contact_email) ? strdup(billing_contact_email->valuestring) : NULL,
        media_contact_email && !cJSON_IsNull(media_contact_email) ? strdup(media_contact_email->valuestring) : NULL,
        media_contact_firstname && !cJSON_IsNull(media_contact_firstname) ? strdup(media_contact_firstname->valuestring) : NULL,
        media_contact_lastname && !cJSON_IsNull(media_contact_lastname) ? strdup(media_contact_lastname->valuestring) : NULL,
        currency_info ? currency_info_local_nonprim : NULL,
        agency_link && !cJSON_IsNull(agency_link) ? strdup(agency_link->valuestring) : NULL,
        po_number && !cJSON_IsNull(po_number) ? strdup(po_number->valuestring) : NULL,
        order_name && !cJSON_IsNull(order_name) ? strdup(order_name->valuestring) : NULL,
        pmp_name && !cJSON_IsNull(pmp_name) ? strdup(pmp_name->valuestring) : NULL,
        accepted_terms_id && !cJSON_IsNull(accepted_terms_id) ? strdup(accepted_terms_id->valuestring) : NULL,
        accepted_terms_time && !cJSON_IsNull(accepted_terms_time) ? strdup(accepted_terms_time->valuestring) : NULL,
        budget_amount ? budget_amount->valuedouble : 0,
        estimated_monthly_spend ? estimated_monthly_spend->valuedouble : 0
        );

    return ssio_order_line_local_var;
end:
    if (currency_info_local_nonprim) {
        currency_free(currency_info_local_nonprim);
        currency_info_local_nonprim = NULL;
    }
    return NULL;

}
