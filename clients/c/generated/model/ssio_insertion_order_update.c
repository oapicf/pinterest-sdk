#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_insertion_order_update.h"



static ssio_insertion_order_update_t *ssio_insertion_order_update_create_internal(
    char *ads_manager_order_line_id,
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double *budget_amount,
    char *end_date,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *oracle_line_id,
    char *po_number,
    char *salesforce_order_id,
    char *salesforce_order_line_id,
    char *start_date,
    char *user_email
    ) {
    ssio_insertion_order_update_t *ssio_insertion_order_update_local_var = malloc(sizeof(ssio_insertion_order_update_t));
    if (!ssio_insertion_order_update_local_var) {
        return NULL;
    }
    memset(ssio_insertion_order_update_local_var, 0, sizeof(ssio_insertion_order_update_t));
    ssio_insertion_order_update_local_var->_library_owned = 1;
    ssio_insertion_order_update_local_var->ads_manager_order_line_id = ads_manager_order_line_id;
    ssio_insertion_order_update_local_var->agency_link = agency_link;
    ssio_insertion_order_update_local_var->billing_contact_email = billing_contact_email;
    ssio_insertion_order_update_local_var->billing_contact_firstname = billing_contact_firstname;
    ssio_insertion_order_update_local_var->billing_contact_lastname = billing_contact_lastname;
    ssio_insertion_order_update_local_var->budget_amount = budget_amount;
    ssio_insertion_order_update_local_var->end_date = end_date;
    ssio_insertion_order_update_local_var->media_contact_email = media_contact_email;
    ssio_insertion_order_update_local_var->media_contact_firstname = media_contact_firstname;
    ssio_insertion_order_update_local_var->media_contact_lastname = media_contact_lastname;
    ssio_insertion_order_update_local_var->oracle_line_id = oracle_line_id;
    ssio_insertion_order_update_local_var->po_number = po_number;
    ssio_insertion_order_update_local_var->salesforce_order_id = salesforce_order_id;
    ssio_insertion_order_update_local_var->salesforce_order_line_id = salesforce_order_line_id;
    ssio_insertion_order_update_local_var->start_date = start_date;
    ssio_insertion_order_update_local_var->user_email = user_email;
    return ssio_insertion_order_update_local_var;
}

__attribute__((deprecated)) ssio_insertion_order_update_t *ssio_insertion_order_update_create(
    char *ads_manager_order_line_id,
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double *budget_amount,
    char *end_date,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *oracle_line_id,
    char *po_number,
    char *salesforce_order_id,
    char *salesforce_order_line_id,
    char *start_date,
    char *user_email
    ) {
    double *budget_amount_copy = NULL;
    if (budget_amount) {
        budget_amount_copy = malloc(sizeof(double));
        if (budget_amount_copy) *budget_amount_copy = *budget_amount;
    }
    ssio_insertion_order_update_t *result = ssio_insertion_order_update_create_internal (
        ads_manager_order_line_id,
        agency_link,
        billing_contact_email,
        billing_contact_firstname,
        billing_contact_lastname,
        budget_amount_copy,
        end_date,
        media_contact_email,
        media_contact_firstname,
        media_contact_lastname,
        oracle_line_id,
        po_number,
        salesforce_order_id,
        salesforce_order_line_id,
        start_date,
        user_email
        );
    if (!result) {
        free(budget_amount_copy);
    }
    return result;
}

void ssio_insertion_order_update_free(ssio_insertion_order_update_t *ssio_insertion_order_update) {
    if(NULL == ssio_insertion_order_update){
        return ;
    }
    if(ssio_insertion_order_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_insertion_order_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_insertion_order_update->ads_manager_order_line_id) {
        free(ssio_insertion_order_update->ads_manager_order_line_id);
        ssio_insertion_order_update->ads_manager_order_line_id = NULL;
    }
    if (ssio_insertion_order_update->agency_link) {
        free(ssio_insertion_order_update->agency_link);
        ssio_insertion_order_update->agency_link = NULL;
    }
    if (ssio_insertion_order_update->billing_contact_email) {
        free(ssio_insertion_order_update->billing_contact_email);
        ssio_insertion_order_update->billing_contact_email = NULL;
    }
    if (ssio_insertion_order_update->billing_contact_firstname) {
        free(ssio_insertion_order_update->billing_contact_firstname);
        ssio_insertion_order_update->billing_contact_firstname = NULL;
    }
    if (ssio_insertion_order_update->billing_contact_lastname) {
        free(ssio_insertion_order_update->billing_contact_lastname);
        ssio_insertion_order_update->billing_contact_lastname = NULL;
    }
    if (ssio_insertion_order_update->budget_amount) {
        free(ssio_insertion_order_update->budget_amount);
        ssio_insertion_order_update->budget_amount = NULL;
    }
    if (ssio_insertion_order_update->end_date) {
        free(ssio_insertion_order_update->end_date);
        ssio_insertion_order_update->end_date = NULL;
    }
    if (ssio_insertion_order_update->media_contact_email) {
        free(ssio_insertion_order_update->media_contact_email);
        ssio_insertion_order_update->media_contact_email = NULL;
    }
    if (ssio_insertion_order_update->media_contact_firstname) {
        free(ssio_insertion_order_update->media_contact_firstname);
        ssio_insertion_order_update->media_contact_firstname = NULL;
    }
    if (ssio_insertion_order_update->media_contact_lastname) {
        free(ssio_insertion_order_update->media_contact_lastname);
        ssio_insertion_order_update->media_contact_lastname = NULL;
    }
    if (ssio_insertion_order_update->oracle_line_id) {
        free(ssio_insertion_order_update->oracle_line_id);
        ssio_insertion_order_update->oracle_line_id = NULL;
    }
    if (ssio_insertion_order_update->po_number) {
        free(ssio_insertion_order_update->po_number);
        ssio_insertion_order_update->po_number = NULL;
    }
    if (ssio_insertion_order_update->salesforce_order_id) {
        free(ssio_insertion_order_update->salesforce_order_id);
        ssio_insertion_order_update->salesforce_order_id = NULL;
    }
    if (ssio_insertion_order_update->salesforce_order_line_id) {
        free(ssio_insertion_order_update->salesforce_order_line_id);
        ssio_insertion_order_update->salesforce_order_line_id = NULL;
    }
    if (ssio_insertion_order_update->start_date) {
        free(ssio_insertion_order_update->start_date);
        ssio_insertion_order_update->start_date = NULL;
    }
    if (ssio_insertion_order_update->user_email) {
        free(ssio_insertion_order_update->user_email);
        ssio_insertion_order_update->user_email = NULL;
    }
    free(ssio_insertion_order_update);
}

cJSON *ssio_insertion_order_update_convertToJSON(ssio_insertion_order_update_t *ssio_insertion_order_update) {
    cJSON *item = cJSON_CreateObject();

    // ssio_insertion_order_update->ads_manager_order_line_id
    if(ssio_insertion_order_update->ads_manager_order_line_id) {
    if(cJSON_AddStringToObject(item, "ads_manager_order_line_id", ssio_insertion_order_update->ads_manager_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->agency_link
    if(ssio_insertion_order_update->agency_link) {
    if(cJSON_AddStringToObject(item, "agency_link", ssio_insertion_order_update->agency_link) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->billing_contact_email
    if(ssio_insertion_order_update->billing_contact_email) {
    if(cJSON_AddStringToObject(item, "billing_contact_email", ssio_insertion_order_update->billing_contact_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->billing_contact_firstname
    if(ssio_insertion_order_update->billing_contact_firstname) {
    if(cJSON_AddStringToObject(item, "billing_contact_firstname", ssio_insertion_order_update->billing_contact_firstname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->billing_contact_lastname
    if(ssio_insertion_order_update->billing_contact_lastname) {
    if(cJSON_AddStringToObject(item, "billing_contact_lastname", ssio_insertion_order_update->billing_contact_lastname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->budget_amount
    if(ssio_insertion_order_update->budget_amount) {
    if(cJSON_AddNumberToObject(item, "budget_amount", *ssio_insertion_order_update->budget_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // ssio_insertion_order_update->end_date
    if(ssio_insertion_order_update->end_date) {
    if(cJSON_AddStringToObject(item, "end_date", ssio_insertion_order_update->end_date) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->media_contact_email
    if(ssio_insertion_order_update->media_contact_email) {
    if(cJSON_AddStringToObject(item, "media_contact_email", ssio_insertion_order_update->media_contact_email) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->media_contact_firstname
    if(ssio_insertion_order_update->media_contact_firstname) {
    if(cJSON_AddStringToObject(item, "media_contact_firstname", ssio_insertion_order_update->media_contact_firstname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->media_contact_lastname
    if(ssio_insertion_order_update->media_contact_lastname) {
    if(cJSON_AddStringToObject(item, "media_contact_lastname", ssio_insertion_order_update->media_contact_lastname) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->oracle_line_id
    if(ssio_insertion_order_update->oracle_line_id) {
    if(cJSON_AddStringToObject(item, "oracle_line_id", ssio_insertion_order_update->oracle_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->po_number
    if(ssio_insertion_order_update->po_number) {
    if(cJSON_AddStringToObject(item, "po_number", ssio_insertion_order_update->po_number) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->salesforce_order_id
    if(ssio_insertion_order_update->salesforce_order_id) {
    if(cJSON_AddStringToObject(item, "salesforce_order_id", ssio_insertion_order_update->salesforce_order_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->salesforce_order_line_id
    if(ssio_insertion_order_update->salesforce_order_line_id) {
    if(cJSON_AddStringToObject(item, "salesforce_order_line_id", ssio_insertion_order_update->salesforce_order_line_id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->start_date
    if(ssio_insertion_order_update->start_date) {
    if(cJSON_AddStringToObject(item, "start_date", ssio_insertion_order_update->start_date) == NULL) {
    goto fail; //String
    }
    }


    // ssio_insertion_order_update->user_email
    if(ssio_insertion_order_update->user_email) {
    if(cJSON_AddStringToObject(item, "user_email", ssio_insertion_order_update->user_email) == NULL) {
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

ssio_insertion_order_update_t *ssio_insertion_order_update_parseFromJSON(cJSON *ssio_insertion_order_updateJSON){

    ssio_insertion_order_update_t *ssio_insertion_order_update_local_var = NULL;

    char *ads_manager_order_line_id_local_str = NULL;

    char *agency_link_local_str = NULL;

    char *billing_contact_email_local_str = NULL;

    char *billing_contact_firstname_local_str = NULL;

    char *billing_contact_lastname_local_str = NULL;

    // define the local variable for ssio_insertion_order_update->budget_amount
    double *budget_amount_local_var = NULL;

    char *end_date_local_str = NULL;

    char *media_contact_email_local_str = NULL;

    char *media_contact_firstname_local_str = NULL;

    char *media_contact_lastname_local_str = NULL;

    char *oracle_line_id_local_str = NULL;

    char *po_number_local_str = NULL;

    char *salesforce_order_id_local_str = NULL;

    char *salesforce_order_line_id_local_str = NULL;

    char *start_date_local_str = NULL;

    char *user_email_local_str = NULL;

    // ssio_insertion_order_update->ads_manager_order_line_id
    cJSON *ads_manager_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "ads_manager_order_line_id");
    if (cJSON_IsNull(ads_manager_order_line_id)) {
        ads_manager_order_line_id = NULL;
    }
    if (ads_manager_order_line_id) { 
    if(!cJSON_IsString(ads_manager_order_line_id) && !cJSON_IsNull(ads_manager_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->agency_link
    cJSON *agency_link = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "agency_link");
    if (cJSON_IsNull(agency_link)) {
        agency_link = NULL;
    }
    if (agency_link) { 
    if(!cJSON_IsString(agency_link) && !cJSON_IsNull(agency_link))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->billing_contact_email
    cJSON *billing_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "billing_contact_email");
    if (cJSON_IsNull(billing_contact_email)) {
        billing_contact_email = NULL;
    }
    if (billing_contact_email) { 
    if(!cJSON_IsString(billing_contact_email) && !cJSON_IsNull(billing_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->billing_contact_firstname
    cJSON *billing_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "billing_contact_firstname");
    if (cJSON_IsNull(billing_contact_firstname)) {
        billing_contact_firstname = NULL;
    }
    if (billing_contact_firstname) { 
    if(!cJSON_IsString(billing_contact_firstname) && !cJSON_IsNull(billing_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->billing_contact_lastname
    cJSON *billing_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "billing_contact_lastname");
    if (cJSON_IsNull(billing_contact_lastname)) {
        billing_contact_lastname = NULL;
    }
    if (billing_contact_lastname) { 
    if(!cJSON_IsString(billing_contact_lastname) && !cJSON_IsNull(billing_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->budget_amount
    cJSON *budget_amount = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "budget_amount");
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

    // ssio_insertion_order_update->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (end_date) { 
    if(!cJSON_IsString(end_date) && !cJSON_IsNull(end_date))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->media_contact_email
    cJSON *media_contact_email = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "media_contact_email");
    if (cJSON_IsNull(media_contact_email)) {
        media_contact_email = NULL;
    }
    if (media_contact_email) { 
    if(!cJSON_IsString(media_contact_email) && !cJSON_IsNull(media_contact_email))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->media_contact_firstname
    cJSON *media_contact_firstname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "media_contact_firstname");
    if (cJSON_IsNull(media_contact_firstname)) {
        media_contact_firstname = NULL;
    }
    if (media_contact_firstname) { 
    if(!cJSON_IsString(media_contact_firstname) && !cJSON_IsNull(media_contact_firstname))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->media_contact_lastname
    cJSON *media_contact_lastname = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "media_contact_lastname");
    if (cJSON_IsNull(media_contact_lastname)) {
        media_contact_lastname = NULL;
    }
    if (media_contact_lastname) { 
    if(!cJSON_IsString(media_contact_lastname) && !cJSON_IsNull(media_contact_lastname))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->oracle_line_id
    cJSON *oracle_line_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "oracle_line_id");
    if (cJSON_IsNull(oracle_line_id)) {
        oracle_line_id = NULL;
    }
    if (oracle_line_id) { 
    if(!cJSON_IsString(oracle_line_id) && !cJSON_IsNull(oracle_line_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->po_number
    cJSON *po_number = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "po_number");
    if (cJSON_IsNull(po_number)) {
        po_number = NULL;
    }
    if (po_number) { 
    if(!cJSON_IsString(po_number) && !cJSON_IsNull(po_number))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->salesforce_order_id
    cJSON *salesforce_order_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "salesforce_order_id");
    if (cJSON_IsNull(salesforce_order_id)) {
        salesforce_order_id = NULL;
    }
    if (salesforce_order_id) { 
    if(!cJSON_IsString(salesforce_order_id) && !cJSON_IsNull(salesforce_order_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->salesforce_order_line_id
    cJSON *salesforce_order_line_id = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "salesforce_order_line_id");
    if (cJSON_IsNull(salesforce_order_line_id)) {
        salesforce_order_line_id = NULL;
    }
    if (salesforce_order_line_id) { 
    if(!cJSON_IsString(salesforce_order_line_id) && !cJSON_IsNull(salesforce_order_line_id))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (start_date) { 
    if(!cJSON_IsString(start_date) && !cJSON_IsNull(start_date))
    {
    goto end; //String
    }
    }

    // ssio_insertion_order_update->user_email
    cJSON *user_email = cJSON_GetObjectItemCaseSensitive(ssio_insertion_order_updateJSON, "user_email");
    if (cJSON_IsNull(user_email)) {
        user_email = NULL;
    }
    if (user_email) { 
    if(!cJSON_IsString(user_email) && !cJSON_IsNull(user_email))
    {
    goto end; //String
    }
    }


    if (ads_manager_order_line_id && !cJSON_IsNull(ads_manager_order_line_id)) ads_manager_order_line_id_local_str = strdup(ads_manager_order_line_id->valuestring);
    if (agency_link && !cJSON_IsNull(agency_link)) agency_link_local_str = strdup(agency_link->valuestring);
    if (billing_contact_email && !cJSON_IsNull(billing_contact_email)) billing_contact_email_local_str = strdup(billing_contact_email->valuestring);
    if (billing_contact_firstname && !cJSON_IsNull(billing_contact_firstname)) billing_contact_firstname_local_str = strdup(billing_contact_firstname->valuestring);
    if (billing_contact_lastname && !cJSON_IsNull(billing_contact_lastname)) billing_contact_lastname_local_str = strdup(billing_contact_lastname->valuestring);
    if (end_date && !cJSON_IsNull(end_date)) end_date_local_str = strdup(end_date->valuestring);
    if (media_contact_email && !cJSON_IsNull(media_contact_email)) media_contact_email_local_str = strdup(media_contact_email->valuestring);
    if (media_contact_firstname && !cJSON_IsNull(media_contact_firstname)) media_contact_firstname_local_str = strdup(media_contact_firstname->valuestring);
    if (media_contact_lastname && !cJSON_IsNull(media_contact_lastname)) media_contact_lastname_local_str = strdup(media_contact_lastname->valuestring);
    if (oracle_line_id && !cJSON_IsNull(oracle_line_id)) oracle_line_id_local_str = strdup(oracle_line_id->valuestring);
    if (po_number && !cJSON_IsNull(po_number)) po_number_local_str = strdup(po_number->valuestring);
    if (salesforce_order_id && !cJSON_IsNull(salesforce_order_id)) salesforce_order_id_local_str = strdup(salesforce_order_id->valuestring);
    if (salesforce_order_line_id && !cJSON_IsNull(salesforce_order_line_id)) salesforce_order_line_id_local_str = strdup(salesforce_order_line_id->valuestring);
    if (start_date && !cJSON_IsNull(start_date)) start_date_local_str = strdup(start_date->valuestring);
    if (user_email && !cJSON_IsNull(user_email)) user_email_local_str = strdup(user_email->valuestring);

    ssio_insertion_order_update_local_var = ssio_insertion_order_update_create_internal (
        ads_manager_order_line_id_local_str,
        agency_link_local_str,
        billing_contact_email_local_str,
        billing_contact_firstname_local_str,
        billing_contact_lastname_local_str,
        budget_amount_local_var,
        end_date_local_str,
        media_contact_email_local_str,
        media_contact_firstname_local_str,
        media_contact_lastname_local_str,
        oracle_line_id_local_str,
        po_number_local_str,
        salesforce_order_id_local_str,
        salesforce_order_line_id_local_str,
        start_date_local_str,
        user_email_local_str
        );

    if (!ssio_insertion_order_update_local_var) {
        goto end;
    }

    return ssio_insertion_order_update_local_var;
end:
    if (ads_manager_order_line_id_local_str) {
        free(ads_manager_order_line_id_local_str);
        ads_manager_order_line_id_local_str = NULL;
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
    if (budget_amount_local_var) {
        free(budget_amount_local_var);
        budget_amount_local_var = NULL;
    }
    if (end_date_local_str) {
        free(end_date_local_str);
        end_date_local_str = NULL;
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
    if (oracle_line_id_local_str) {
        free(oracle_line_id_local_str);
        oracle_line_id_local_str = NULL;
    }
    if (po_number_local_str) {
        free(po_number_local_str);
        po_number_local_str = NULL;
    }
    if (salesforce_order_id_local_str) {
        free(salesforce_order_id_local_str);
        salesforce_order_id_local_str = NULL;
    }
    if (salesforce_order_line_id_local_str) {
        free(salesforce_order_line_id_local_str);
        salesforce_order_line_id_local_str = NULL;
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
