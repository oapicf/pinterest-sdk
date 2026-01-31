#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_create_insertion_order_request.h"


char* ssio_create_insertion_order_request_order_line_type_ToString(pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type) {
    char* order_line_typeArray[] =  { "NULL", "BUDGET", "PERPETUALS" };
    return order_line_typeArray[order_line_type];
}

pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e ssio_create_insertion_order_request_order_line_type_FromString(char* order_line_type){
    int stringToReturn = 0;
    char *order_line_typeArray[] =  { "NULL", "BUDGET", "PERPETUALS" };
    size_t sizeofArray = sizeof(order_line_typeArray) / sizeof(order_line_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(order_line_type, order_line_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_create_internal(
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double budget_amount,
    char *end_date,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *po_number,
    char *start_date,
    char *user_email,
    char *accepted_terms_id,
    int accepted_terms_time,
    char *billto_billing_address_id,
    char *billto_business_address_id,
    char *billto_company_id,
    pinterest_rest_api_currency__e currency_info,
    double estimated_monthly_spend,
    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type,
    char *order_name,
    char *pmp_id
    ) {
    ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_local_var = malloc(sizeof(ssio_create_insertion_order_request_t));
    if (!ssio_create_insertion_order_request_local_var) {
        return NULL;
    }
    ssio_create_insertion_order_request_local_var->agency_link = agency_link;
    ssio_create_insertion_order_request_local_var->billing_contact_email = billing_contact_email;
    ssio_create_insertion_order_request_local_var->billing_contact_firstname = billing_contact_firstname;
    ssio_create_insertion_order_request_local_var->billing_contact_lastname = billing_contact_lastname;
    ssio_create_insertion_order_request_local_var->budget_amount = budget_amount;
    ssio_create_insertion_order_request_local_var->end_date = end_date;
    ssio_create_insertion_order_request_local_var->media_contact_email = media_contact_email;
    ssio_create_insertion_order_request_local_var->media_contact_firstname = media_contact_firstname;
    ssio_create_insertion_order_request_local_var->media_contact_lastname = media_contact_lastname;
    ssio_create_insertion_order_request_local_var->po_number = po_number;
    ssio_create_insertion_order_request_local_var->start_date = start_date;
    ssio_create_insertion_order_request_local_var->user_email = user_email;
    ssio_create_insertion_order_request_local_var->accepted_terms_id = accepted_terms_id;
    ssio_create_insertion_order_request_local_var->accepted_terms_time = accepted_terms_time;
    ssio_create_insertion_order_request_local_var->billto_billing_address_id = billto_billing_address_id;
    ssio_create_insertion_order_request_local_var->billto_business_address_id = billto_business_address_id;
    ssio_create_insertion_order_request_local_var->billto_company_id = billto_company_id;
    ssio_create_insertion_order_request_local_var->currency_info = currency_info;
    ssio_create_insertion_order_request_local_var->estimated_monthly_spend = estimated_monthly_spend;
    ssio_create_insertion_order_request_local_var->order_line_type = order_line_type;
    ssio_create_insertion_order_request_local_var->order_name = order_name;
    ssio_create_insertion_order_request_local_var->pmp_id = pmp_id;

    ssio_create_insertion_order_request_local_var->_library_owned = 1;
    return ssio_create_insertion_order_request_local_var;
}

__attribute__((deprecated)) ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_create(
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double budget_amount,
    char *end_date,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *po_number,
    char *start_date,
    char *user_email,
    char *accepted_terms_id,
    int accepted_terms_time,
    char *billto_billing_address_id,
    char *billto_business_address_id,
    char *billto_company_id,
    pinterest_rest_api_currency__e currency_info,
    double estimated_monthly_spend,
    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type,
    char *order_name,
    char *pmp_id
    ) {
    return ssio_create_insertion_order_request_create_internal (
        agency_link,
        billing_contact_email,
        billing_contact_firstname,
        billing_contact_lastname,
        budget_amount,
        end_date,
        media_contact_email,
        media_contact_firstname,
        media_contact_lastname,
        po_number,
        start_date,
        user_email,
        accepted_terms_id,
        accepted_terms_time,
        billto_billing_address_id,
        billto_business_address_id,
        billto_company_id,
        currency_info,
        estimated_monthly_spend,
        order_line_type,
        order_name,
        pmp_id
        );
}

void ssio_create_insertion_order_request_free(ssio_create_insertion_order_request_t *ssio_create_insertion_order_request) {
    if(NULL == ssio_create_insertion_order_request){
        return ;
    }
    if(ssio_create_insertion_order_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_create_insertion_order_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_create_insertion_order_request->agency_link) {
        free(ssio_create_insertion_order_request->agency_link);
        ssio_create_insertion_order_request->agency_link = NULL;
    }
    if (ssio_create_insertion_order_request->billing_contact_email) {
        free(ssio_create_insertion_order_request->billing_contact_email);
        ssio_create_insertion_order_request->billing_contact_email = NULL;
    }
    if (ssio_create_insertion_order_request->billing_contact_firstname) {
        free(ssio_create_insertion_order_request->billing_contact_firstname);
        ssio_create_insertion_order_request->billing_contact_firstname = NULL;
    }
    if (ssio_create_insertion_order_request->billing_contact_lastname) {
        free(ssio_create_insertion_order_request->billing_contact_lastname);
        ssio_create_insertion_order_request->billing_contact_lastname = NULL;
    }
    if (ssio_create_insertion_order_request->end_date) {
        free(ssio_create_insertion_order_request->end_date);
        ssio_create_insertion_order_request->end_date = NULL;
    }
    if (ssio_create_insertion_order_request->media_contact_email) {
        free(ssio_create_insertion_order_request->media_contact_email);
        ssio_create_insertion_order_request->media_contact_email = NULL;
    }
    if (ssio_create_insertion_order_request->media_contact_firstname) {
        free(ssio_create_insertion_order_request->media_contact_firstname);
        ssio_create_insertion_order_request->media_contact_firstname = NULL;
    }
    if (ssio_create_insertion_order_request->media_contact_lastname) {
        free(ssio_create_insertion_order_request->media_contact_lastname);
        ssio_create_insertion_order_request->media_contact_lastname = NULL;
    }
    if (ssio_create_insertion_order_request->po_number) {
        free(ssio_create_insertion_order_request->po_number);
        ssio_create_insertion_order_request->po_number = NULL;
    }
    if (ssio_create_insertion_order_request->start_date) {
        free(ssio_create_insertion_order_request->start_date);
        ssio_create_insertion_order_request->start_date = NULL;
    }
    if (ssio_create_insertion_order_request->user_email) {
        free(ssio_create_insertion_order_request->user_email);
        ssio_create_insertion_order_request->user_email = NULL;
    }
    if (ssio_create_insertion_order_request->accepted_terms_id) {
        free(ssio_create_insertion_order_request->accepted_terms_id);
        ssio_create_insertion_order_request->accepted_terms_id = NULL;
    }
    if (ssio_create_insertion_order_request->billto_billing_address_id) {
        free(ssio_create_insertion_order_request->billto_billing_address_id);
        ssio_create_insertion_order_request->billto_billing_address_id = NULL;
    }
    if (ssio_create_insertion_order_request->billto_business_address_id) {
        free(ssio_create_insertion_order_request->billto_business_address_id);
        ssio_create_insertion_order_request->billto_business_address_id = NULL;
    }
    if (ssio_create_insertion_order_request->billto_company_id) {
        free(ssio_create_insertion_order_request->billto_company_id);
        ssio_create_insertion_order_request->billto_company_id = NULL;
    }
    if (ssio_create_insertion_order_request->order_name) {
        free(ssio_create_insertion_order_request->order_name);
        ssio_create_insertion_order_request->order_name = NULL;
    }
    if (ssio_create_insertion_order_request->pmp_id) {
        free(ssio_create_insertion_order_request->pmp_id);
        ssio_create_insertion_order_request->pmp_id = NULL;
    }
    free(ssio_create_insertion_order_request);
}

cJSON *ssio_create_insertion_order_request_convertToJSON(ssio_create_insertion_order_request_t *ssio_create_insertion_order_request) {
    cJSON *item = cJSON_CreateObject();

    // ssio_create_insertion_order_request->agency_link
    if(ssio_create_insertion_order_request->agency_link) {
    if(cJSON_AddStringToObject(item, "agency_link", ssio_create_insertion_order_request->agency_link) == NULL) {
    goto fail; //String
    }
    }


    // ssio_create_insertion_order_request->billing_contact_email
    if (!ssio_create_insertion_order_request->billing_contact_email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billing_contact_email", ssio_create_insertion_order_request->billing_contact_email) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->billing_contact_firstname
    if (!ssio_create_insertion_order_request->billing_contact_firstname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billing_contact_firstname", ssio_create_insertion_order_request->billing_contact_firstname) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->billing_contact_lastname
    if (!ssio_create_insertion_order_request->billing_contact_lastname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billing_contact_lastname", ssio_create_insertion_order_request->billing_contact_lastname) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->budget_amount
    if(ssio_create_insertion_order_request->budget_amount) {
    if(cJSON_AddNumberToObject(item, "budget_amount", ssio_create_insertion_order_request->budget_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_create_insertion_order_request->end_date
    if(ssio_create_insertion_order_request->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", ssio_create_insertion_order_request->end_date) == NULL) {
    goto fail; //String
    }
    }


    // ssio_create_insertion_order_request->media_contact_email
    if (!ssio_create_insertion_order_request->media_contact_email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_contact_email", ssio_create_insertion_order_request->media_contact_email) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->media_contact_firstname
    if (!ssio_create_insertion_order_request->media_contact_firstname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_contact_firstname", ssio_create_insertion_order_request->media_contact_firstname) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->media_contact_lastname
    if (!ssio_create_insertion_order_request->media_contact_lastname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_contact_lastname", ssio_create_insertion_order_request->media_contact_lastname) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->po_number
    if (!ssio_create_insertion_order_request->po_number) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "po_number", ssio_create_insertion_order_request->po_number) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->start_date
    if (!ssio_create_insertion_order_request->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", ssio_create_insertion_order_request->start_date) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->user_email
    if(ssio_create_insertion_order_request->user_email) {
    if(cJSON_AddStringToObject(item, "user_email", ssio_create_insertion_order_request->user_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_create_insertion_order_request->accepted_terms_id
    if (!ssio_create_insertion_order_request->accepted_terms_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "accepted_terms_id", ssio_create_insertion_order_request->accepted_terms_id) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->accepted_terms_time
    if(ssio_create_insertion_order_request->accepted_terms_time) {
    if(cJSON_AddNumberToObject(item, "accepted_terms_time", ssio_create_insertion_order_request->accepted_terms_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_create_insertion_order_request->billto_billing_address_id
    if (!ssio_create_insertion_order_request->billto_billing_address_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billto_billing_address_id", ssio_create_insertion_order_request->billto_billing_address_id) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->billto_business_address_id
    if (!ssio_create_insertion_order_request->billto_business_address_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billto_business_address_id", ssio_create_insertion_order_request->billto_business_address_id) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->billto_company_id
    if (!ssio_create_insertion_order_request->billto_company_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "billto_company_id", ssio_create_insertion_order_request->billto_company_id) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->currency_info
    if (pinterest_rest_api_currency__NULL == ssio_create_insertion_order_request->currency_info) {
        goto fail;
    }
    cJSON *currency_info_local_JSON = currency_convertToJSON(ssio_create_insertion_order_request->currency_info);
    if(currency_info_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency_info", currency_info_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ssio_create_insertion_order_request->estimated_monthly_spend
    if(ssio_create_insertion_order_request->estimated_monthly_spend) {
    if(cJSON_AddNumberToObject(item, "estimated_monthly_spend", ssio_create_insertion_order_request->estimated_monthly_spend) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_create_insertion_order_request->order_line_type
    if (pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_NULL == ssio_create_insertion_order_request->order_line_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "order_line_type", ssio_create_insertion_order_request_order_line_type_ToString(ssio_create_insertion_order_request->order_line_type)) == NULL)
    {
    goto fail; //Enum
    }


    // ssio_create_insertion_order_request->order_name
    if (!ssio_create_insertion_order_request->order_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "order_name", ssio_create_insertion_order_request->order_name) == NULL) {
    goto fail; //String
    }


    // ssio_create_insertion_order_request->pmp_id
    if (!ssio_create_insertion_order_request->pmp_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pmp_id", ssio_create_insertion_order_request->pmp_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_parseFromJSON(cJSON *ssio_create_insertion_order_requestJSON){

    ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_local_var = NULL;

    // define the local variable for ssio_create_insertion_order_request->currency_info
    pinterest_rest_api_currency__e currency_info_local_nonprim = 0;

    // ssio_create_insertion_order_request->agency_link
    cJSON *agency_link = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "agency_link");
    if (cJSON_IsNull(agency_link)) {
        agency_link = NULL;
    }
    if (agency_link) { 
    if(!cJSON_IsString(agency_link) && !cJSON_IsNull(agency_link))
    {
    goto end; //String
    }
    }

    // ssio_create_insertion_order_request->billing_contact_email
    cJSON *billing_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "billing_contact_email");
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

    // ssio_create_insertion_order_request->billing_contact_firstname
    cJSON *billing_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "billing_contact_firstname");
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

    // ssio_create_insertion_order_request->billing_contact_lastname
    cJSON *billing_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "billing_contact_lastname");
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

    // ssio_create_insertion_order_request->budget_amount
    cJSON *budget_amount = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "budget_amount");
    if (cJSON_IsNull(budget_amount)) {
        budget_amount = NULL;
    }
    if (budget_amount) { 
    if(!cJSON_IsNumber(budget_amount))
    {
    goto end; //Numeric
    }
    }

    // ssio_create_insertion_order_request->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (end_date) { 
    if(!cJSON_IsString(end_date) && !cJSON_IsNull(end_date))
    {
    goto end; //String
    }
    }

    // ssio_create_insertion_order_request->media_contact_email
    cJSON *media_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "media_contact_email");
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

    // ssio_create_insertion_order_request->media_contact_firstname
    cJSON *media_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "media_contact_firstname");
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

    // ssio_create_insertion_order_request->media_contact_lastname
    cJSON *media_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "media_contact_lastname");
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

    // ssio_create_insertion_order_request->po_number
    cJSON *po_number = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "po_number");
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

    // ssio_create_insertion_order_request->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "start_date");
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

    // ssio_create_insertion_order_request->user_email
    cJSON *user_email = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "user_email");
    if (cJSON_IsNull(user_email)) {
        user_email = NULL;
    }
    if (user_email) { 
    if(!cJSON_IsString(user_email) && !cJSON_IsNull(user_email))
    {
    goto end; //String
    }
    }

    // ssio_create_insertion_order_request->accepted_terms_id
    cJSON *accepted_terms_id = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "accepted_terms_id");
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

    // ssio_create_insertion_order_request->accepted_terms_time
    cJSON *accepted_terms_time = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "accepted_terms_time");
    if (cJSON_IsNull(accepted_terms_time)) {
        accepted_terms_time = NULL;
    }
    if (accepted_terms_time) { 
    if(!cJSON_IsNumber(accepted_terms_time))
    {
    goto end; //Numeric
    }
    }

    // ssio_create_insertion_order_request->billto_billing_address_id
    cJSON *billto_billing_address_id = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "billto_billing_address_id");
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

    // ssio_create_insertion_order_request->billto_business_address_id
    cJSON *billto_business_address_id = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "billto_business_address_id");
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

    // ssio_create_insertion_order_request->billto_company_id
    cJSON *billto_company_id = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "billto_company_id");
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

    // ssio_create_insertion_order_request->currency_info
    cJSON *currency_info = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "currency_info");
    if (cJSON_IsNull(currency_info)) {
        currency_info = NULL;
    }
    if (!currency_info) {
        goto end;
    }

    
    currency_info_local_nonprim = currency_parseFromJSON(currency_info); //custom

    // ssio_create_insertion_order_request->estimated_monthly_spend
    cJSON *estimated_monthly_spend = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "estimated_monthly_spend");
    if (cJSON_IsNull(estimated_monthly_spend)) {
        estimated_monthly_spend = NULL;
    }
    if (estimated_monthly_spend) { 
    if(!cJSON_IsNumber(estimated_monthly_spend))
    {
    goto end; //Numeric
    }
    }

    // ssio_create_insertion_order_request->order_line_type
    cJSON *order_line_type = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "order_line_type");
    if (cJSON_IsNull(order_line_type)) {
        order_line_type = NULL;
    }
    if (!order_line_type) {
        goto end;
    }

    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_typeVariable;
    
    if(!cJSON_IsString(order_line_type))
    {
    goto end; //Enum
    }
    order_line_typeVariable = ssio_create_insertion_order_request_order_line_type_FromString(order_line_type->valuestring);

    // ssio_create_insertion_order_request->order_name
    cJSON *order_name = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "order_name");
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

    // ssio_create_insertion_order_request->pmp_id
    cJSON *pmp_id = cJSON_GetObjectItemCaseSensitive(ssio_create_insertion_order_requestJSON, "pmp_id");
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


    ssio_create_insertion_order_request_local_var = ssio_create_insertion_order_request_create_internal (
        agency_link && !cJSON_IsNull(agency_link) ? strdup(agency_link->valuestring) : NULL,
        strdup(billing_contact_email->valuestring),
        strdup(billing_contact_firstname->valuestring),
        strdup(billing_contact_lastname->valuestring),
        budget_amount ? budget_amount->valuedouble : 0,
        end_date && !cJSON_IsNull(end_date) ? strdup(end_date->valuestring) : NULL,
        strdup(media_contact_email->valuestring),
        strdup(media_contact_firstname->valuestring),
        strdup(media_contact_lastname->valuestring),
        strdup(po_number->valuestring),
        strdup(start_date->valuestring),
        user_email && !cJSON_IsNull(user_email) ? strdup(user_email->valuestring) : NULL,
        strdup(accepted_terms_id->valuestring),
        accepted_terms_time ? accepted_terms_time->valuedouble : 0,
        strdup(billto_billing_address_id->valuestring),
        strdup(billto_business_address_id->valuestring),
        strdup(billto_company_id->valuestring),
        currency_info_local_nonprim,
        estimated_monthly_spend ? estimated_monthly_spend->valuedouble : 0,
        order_line_typeVariable,
        strdup(order_name->valuestring),
        strdup(pmp_id->valuestring)
        );

    return ssio_create_insertion_order_request_local_var;
end:
    if (currency_info_local_nonprim) {
        currency_info_local_nonprim = 0;
    }
    return NULL;

}
