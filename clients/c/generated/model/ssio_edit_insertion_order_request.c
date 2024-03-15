#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_edit_insertion_order_request.h"



ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_create(
    char *start_date,
    char *end_date,
    char *po_number,
    double budget_amount,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billing_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *media_contact_email,
    char *agency_link,
    char *user_email,
    char *oracle_line_id,
    char *salesforce_order_id,
    char *salesforce_order_line_id,
    char *ads_manager_order_line_id
    ) {
    ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_local_var = malloc(sizeof(ssio_edit_insertion_order_request_t));
    if (!ssio_edit_insertion_order_request_local_var) {
        return NULL;
    }
    ssio_edit_insertion_order_request_local_var->start_date = start_date;
    ssio_edit_insertion_order_request_local_var->end_date = end_date;
    ssio_edit_insertion_order_request_local_var->po_number = po_number;
    ssio_edit_insertion_order_request_local_var->budget_amount = budget_amount;
    ssio_edit_insertion_order_request_local_var->billing_contact_firstname = billing_contact_firstname;
    ssio_edit_insertion_order_request_local_var->billing_contact_lastname = billing_contact_lastname;
    ssio_edit_insertion_order_request_local_var->billing_contact_email = billing_contact_email;
    ssio_edit_insertion_order_request_local_var->media_contact_firstname = media_contact_firstname;
    ssio_edit_insertion_order_request_local_var->media_contact_lastname = media_contact_lastname;
    ssio_edit_insertion_order_request_local_var->media_contact_email = media_contact_email;
    ssio_edit_insertion_order_request_local_var->agency_link = agency_link;
    ssio_edit_insertion_order_request_local_var->user_email = user_email;
    ssio_edit_insertion_order_request_local_var->oracle_line_id = oracle_line_id;
    ssio_edit_insertion_order_request_local_var->salesforce_order_id = salesforce_order_id;
    ssio_edit_insertion_order_request_local_var->salesforce_order_line_id = salesforce_order_line_id;
    ssio_edit_insertion_order_request_local_var->ads_manager_order_line_id = ads_manager_order_line_id;

    return ssio_edit_insertion_order_request_local_var;
}


void ssio_edit_insertion_order_request_free(ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request) {
    if(NULL == ssio_edit_insertion_order_request){
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_edit_insertion_order_request->start_date) {
        free(ssio_edit_insertion_order_request->start_date);
        ssio_edit_insertion_order_request->start_date = NULL;
    }
    if (ssio_edit_insertion_order_request->end_date) {
        free(ssio_edit_insertion_order_request->end_date);
        ssio_edit_insertion_order_request->end_date = NULL;
    }
    if (ssio_edit_insertion_order_request->po_number) {
        free(ssio_edit_insertion_order_request->po_number);
        ssio_edit_insertion_order_request->po_number = NULL;
    }
    if (ssio_edit_insertion_order_request->billing_contact_firstname) {
        free(ssio_edit_insertion_order_request->billing_contact_firstname);
        ssio_edit_insertion_order_request->billing_contact_firstname = NULL;
    }
    if (ssio_edit_insertion_order_request->billing_contact_lastname) {
        free(ssio_edit_insertion_order_request->billing_contact_lastname);
        ssio_edit_insertion_order_request->billing_contact_lastname = NULL;
    }
    if (ssio_edit_insertion_order_request->billing_contact_email) {
        free(ssio_edit_insertion_order_request->billing_contact_email);
        ssio_edit_insertion_order_request->billing_contact_email = NULL;
    }
    if (ssio_edit_insertion_order_request->media_contact_firstname) {
        free(ssio_edit_insertion_order_request->media_contact_firstname);
        ssio_edit_insertion_order_request->media_contact_firstname = NULL;
    }
    if (ssio_edit_insertion_order_request->media_contact_lastname) {
        free(ssio_edit_insertion_order_request->media_contact_lastname);
        ssio_edit_insertion_order_request->media_contact_lastname = NULL;
    }
    if (ssio_edit_insertion_order_request->media_contact_email) {
        free(ssio_edit_insertion_order_request->media_contact_email);
        ssio_edit_insertion_order_request->media_contact_email = NULL;
    }
    if (ssio_edit_insertion_order_request->agency_link) {
        free(ssio_edit_insertion_order_request->agency_link);
        ssio_edit_insertion_order_request->agency_link = NULL;
    }
    if (ssio_edit_insertion_order_request->user_email) {
        free(ssio_edit_insertion_order_request->user_email);
        ssio_edit_insertion_order_request->user_email = NULL;
    }
    if (ssio_edit_insertion_order_request->oracle_line_id) {
        free(ssio_edit_insertion_order_request->oracle_line_id);
        ssio_edit_insertion_order_request->oracle_line_id = NULL;
    }
    if (ssio_edit_insertion_order_request->salesforce_order_id) {
        free(ssio_edit_insertion_order_request->salesforce_order_id);
        ssio_edit_insertion_order_request->salesforce_order_id = NULL;
    }
    if (ssio_edit_insertion_order_request->salesforce_order_line_id) {
        free(ssio_edit_insertion_order_request->salesforce_order_line_id);
        ssio_edit_insertion_order_request->salesforce_order_line_id = NULL;
    }
    if (ssio_edit_insertion_order_request->ads_manager_order_line_id) {
        free(ssio_edit_insertion_order_request->ads_manager_order_line_id);
        ssio_edit_insertion_order_request->ads_manager_order_line_id = NULL;
    }
    free(ssio_edit_insertion_order_request);
}

cJSON *ssio_edit_insertion_order_request_convertToJSON(ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request) {
    cJSON *item = cJSON_CreateObject();

    // ssio_edit_insertion_order_request->start_date
    if(ssio_edit_insertion_order_request->start_date) {
    if(cJSON_AddStringToObject(item, "start_date", ssio_edit_insertion_order_request->start_date) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->end_date
    if(ssio_edit_insertion_order_request->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", ssio_edit_insertion_order_request->end_date) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->po_number
    if(ssio_edit_insertion_order_request->po_number) {
    if(cJSON_AddStringToObject(item, "po_number", ssio_edit_insertion_order_request->po_number) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->budget_amount
    if(ssio_edit_insertion_order_request->budget_amount) {
    if(cJSON_AddNumberToObject(item, "budget_amount", ssio_edit_insertion_order_request->budget_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_edit_insertion_order_request->billing_contact_firstname
    if(ssio_edit_insertion_order_request->billing_contact_firstname) {
    if(cJSON_AddStringToObject(item, "billing_contact_firstname", ssio_edit_insertion_order_request->billing_contact_firstname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->billing_contact_lastname
    if(ssio_edit_insertion_order_request->billing_contact_lastname) {
    if(cJSON_AddStringToObject(item, "billing_contact_lastname", ssio_edit_insertion_order_request->billing_contact_lastname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->billing_contact_email
    if(ssio_edit_insertion_order_request->billing_contact_email) {
    if(cJSON_AddStringToObject(item, "billing_contact_email", ssio_edit_insertion_order_request->billing_contact_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->media_contact_firstname
    if(ssio_edit_insertion_order_request->media_contact_firstname) {
    if(cJSON_AddStringToObject(item, "media_contact_firstname", ssio_edit_insertion_order_request->media_contact_firstname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->media_contact_lastname
    if(ssio_edit_insertion_order_request->media_contact_lastname) {
    if(cJSON_AddStringToObject(item, "media_contact_lastname", ssio_edit_insertion_order_request->media_contact_lastname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->media_contact_email
    if(ssio_edit_insertion_order_request->media_contact_email) {
    if(cJSON_AddStringToObject(item, "media_contact_email", ssio_edit_insertion_order_request->media_contact_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->agency_link
    if(ssio_edit_insertion_order_request->agency_link) {
    if(cJSON_AddStringToObject(item, "agency_link", ssio_edit_insertion_order_request->agency_link) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->user_email
    if(ssio_edit_insertion_order_request->user_email) {
    if(cJSON_AddStringToObject(item, "user_email", ssio_edit_insertion_order_request->user_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->oracle_line_id
    if(ssio_edit_insertion_order_request->oracle_line_id) {
    if(cJSON_AddStringToObject(item, "oracle_line_id", ssio_edit_insertion_order_request->oracle_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->salesforce_order_id
    if(ssio_edit_insertion_order_request->salesforce_order_id) {
    if(cJSON_AddStringToObject(item, "salesforce_order_id", ssio_edit_insertion_order_request->salesforce_order_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->salesforce_order_line_id
    if(ssio_edit_insertion_order_request->salesforce_order_line_id) {
    if(cJSON_AddStringToObject(item, "salesforce_order_line_id", ssio_edit_insertion_order_request->salesforce_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_edit_insertion_order_request->ads_manager_order_line_id
    if(ssio_edit_insertion_order_request->ads_manager_order_line_id) {
    if(cJSON_AddStringToObject(item, "ads_manager_order_line_id", ssio_edit_insertion_order_request->ads_manager_order_line_id) == NULL) {
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

ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_parseFromJSON(cJSON *ssio_edit_insertion_order_requestJSON){

    ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_local_var = NULL;

    // ssio_edit_insertion_order_request->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "start_date");
    if (start_date) { 
    if(!cJSON_IsString(start_date) && !cJSON_IsNull(start_date))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "end_date");
    if (end_date) { 
    if(!cJSON_IsString(end_date) && !cJSON_IsNull(end_date))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->po_number
    cJSON *po_number = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "po_number");
    if (po_number) { 
    if(!cJSON_IsString(po_number) && !cJSON_IsNull(po_number))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->budget_amount
    cJSON *budget_amount = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "budget_amount");
    if (budget_amount) { 
    if(!cJSON_IsNumber(budget_amount))
    {
    goto end; //Numeric
    }
    }

    // ssio_edit_insertion_order_request->billing_contact_firstname
    cJSON *billing_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "billing_contact_firstname");
    if (billing_contact_firstname) { 
    if(!cJSON_IsString(billing_contact_firstname) && !cJSON_IsNull(billing_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->billing_contact_lastname
    cJSON *billing_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "billing_contact_lastname");
    if (billing_contact_lastname) { 
    if(!cJSON_IsString(billing_contact_lastname) && !cJSON_IsNull(billing_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->billing_contact_email
    cJSON *billing_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "billing_contact_email");
    if (billing_contact_email) { 
    if(!cJSON_IsString(billing_contact_email) && !cJSON_IsNull(billing_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->media_contact_firstname
    cJSON *media_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "media_contact_firstname");
    if (media_contact_firstname) { 
    if(!cJSON_IsString(media_contact_firstname) && !cJSON_IsNull(media_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->media_contact_lastname
    cJSON *media_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "media_contact_lastname");
    if (media_contact_lastname) { 
    if(!cJSON_IsString(media_contact_lastname) && !cJSON_IsNull(media_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->media_contact_email
    cJSON *media_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "media_contact_email");
    if (media_contact_email) { 
    if(!cJSON_IsString(media_contact_email) && !cJSON_IsNull(media_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->agency_link
    cJSON *agency_link = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "agency_link");
    if (agency_link) { 
    if(!cJSON_IsString(agency_link) && !cJSON_IsNull(agency_link))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->user_email
    cJSON *user_email = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "user_email");
    if (user_email) { 
    if(!cJSON_IsString(user_email) && !cJSON_IsNull(user_email))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->oracle_line_id
    cJSON *oracle_line_id = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "oracle_line_id");
    if (oracle_line_id) { 
    if(!cJSON_IsString(oracle_line_id) && !cJSON_IsNull(oracle_line_id))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->salesforce_order_id
    cJSON *salesforce_order_id = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "salesforce_order_id");
    if (salesforce_order_id) { 
    if(!cJSON_IsString(salesforce_order_id) && !cJSON_IsNull(salesforce_order_id))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->salesforce_order_line_id
    cJSON *salesforce_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "salesforce_order_line_id");
    if (salesforce_order_line_id) { 
    if(!cJSON_IsString(salesforce_order_line_id) && !cJSON_IsNull(salesforce_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_edit_insertion_order_request->ads_manager_order_line_id
    cJSON *ads_manager_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_edit_insertion_order_requestJSON, "ads_manager_order_line_id");
    if (ads_manager_order_line_id) { 
    if(!cJSON_IsString(ads_manager_order_line_id) && !cJSON_IsNull(ads_manager_order_line_id))
    {
    goto end; //String
    }
    }


    ssio_edit_insertion_order_request_local_var = ssio_edit_insertion_order_request_create (
        start_date && !cJSON_IsNull(start_date) ? strdup(start_date->valuestring) : NULL,
        end_date && !cJSON_IsNull(end_date) ? strdup(end_date->valuestring) : NULL,
        po_number && !cJSON_IsNull(po_number) ? strdup(po_number->valuestring) : NULL,
        budget_amount ? budget_amount->valuedouble : 0,
        billing_contact_firstname && !cJSON_IsNull(billing_contact_firstname) ? strdup(billing_contact_firstname->valuestring) : NULL,
        billing_contact_lastname && !cJSON_IsNull(billing_contact_lastname) ? strdup(billing_contact_lastname->valuestring) : NULL,
        billing_contact_email && !cJSON_IsNull(billing_contact_email) ? strdup(billing_contact_email->valuestring) : NULL,
        media_contact_firstname && !cJSON_IsNull(media_contact_firstname) ? strdup(media_contact_firstname->valuestring) : NULL,
        media_contact_lastname && !cJSON_IsNull(media_contact_lastname) ? strdup(media_contact_lastname->valuestring) : NULL,
        media_contact_email && !cJSON_IsNull(media_contact_email) ? strdup(media_contact_email->valuestring) : NULL,
        agency_link && !cJSON_IsNull(agency_link) ? strdup(agency_link->valuestring) : NULL,
        user_email && !cJSON_IsNull(user_email) ? strdup(user_email->valuestring) : NULL,
        oracle_line_id && !cJSON_IsNull(oracle_line_id) ? strdup(oracle_line_id->valuestring) : NULL,
        salesforce_order_id && !cJSON_IsNull(salesforce_order_id) ? strdup(salesforce_order_id->valuestring) : NULL,
        salesforce_order_line_id && !cJSON_IsNull(salesforce_order_line_id) ? strdup(salesforce_order_line_id->valuestring) : NULL,
        ads_manager_order_line_id && !cJSON_IsNull(ads_manager_order_line_id) ? strdup(ads_manager_order_line_id->valuestring) : NULL
        );

    return ssio_edit_insertion_order_request_local_var;
end:
    return NULL;

}
