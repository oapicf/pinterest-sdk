#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "customer_list_record_row.h"



static customer_list_record_row_t *customer_list_record_row_create_internal(
    char *email,
    char *external_id,
    char *hashed_phone_number,
    char *hashed_pinner_id,
    char *ip_address,
    char *liveramp_envelope,
    char *maid,
    char *user_agent
    ) {
    customer_list_record_row_t *customer_list_record_row_local_var = malloc(sizeof(customer_list_record_row_t));
    if (!customer_list_record_row_local_var) {
        return NULL;
    }
    memset(customer_list_record_row_local_var, 0, sizeof(customer_list_record_row_t));
    customer_list_record_row_local_var->_library_owned = 1;
    customer_list_record_row_local_var->email = email;
    customer_list_record_row_local_var->external_id = external_id;
    customer_list_record_row_local_var->hashed_phone_number = hashed_phone_number;
    customer_list_record_row_local_var->hashed_pinner_id = hashed_pinner_id;
    customer_list_record_row_local_var->ip_address = ip_address;
    customer_list_record_row_local_var->liveramp_envelope = liveramp_envelope;
    customer_list_record_row_local_var->maid = maid;
    customer_list_record_row_local_var->user_agent = user_agent;
    return customer_list_record_row_local_var;
}

__attribute__((deprecated)) customer_list_record_row_t *customer_list_record_row_create(
    char *email,
    char *external_id,
    char *hashed_phone_number,
    char *hashed_pinner_id,
    char *ip_address,
    char *liveramp_envelope,
    char *maid,
    char *user_agent
    ) {
    customer_list_record_row_t *result = customer_list_record_row_create_internal (
        email,
        external_id,
        hashed_phone_number,
        hashed_pinner_id,
        ip_address,
        liveramp_envelope,
        maid,
        user_agent
        );
    if (!result) {
    }
    return result;
}

void customer_list_record_row_free(customer_list_record_row_t *customer_list_record_row) {
    if(NULL == customer_list_record_row){
        return ;
    }
    if(customer_list_record_row->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "customer_list_record_row_free");
        return ;
    }
    listEntry_t *listEntry;
    if (customer_list_record_row->email) {
        free(customer_list_record_row->email);
        customer_list_record_row->email = NULL;
    }
    if (customer_list_record_row->external_id) {
        free(customer_list_record_row->external_id);
        customer_list_record_row->external_id = NULL;
    }
    if (customer_list_record_row->hashed_phone_number) {
        free(customer_list_record_row->hashed_phone_number);
        customer_list_record_row->hashed_phone_number = NULL;
    }
    if (customer_list_record_row->hashed_pinner_id) {
        free(customer_list_record_row->hashed_pinner_id);
        customer_list_record_row->hashed_pinner_id = NULL;
    }
    if (customer_list_record_row->ip_address) {
        free(customer_list_record_row->ip_address);
        customer_list_record_row->ip_address = NULL;
    }
    if (customer_list_record_row->liveramp_envelope) {
        free(customer_list_record_row->liveramp_envelope);
        customer_list_record_row->liveramp_envelope = NULL;
    }
    if (customer_list_record_row->maid) {
        free(customer_list_record_row->maid);
        customer_list_record_row->maid = NULL;
    }
    if (customer_list_record_row->user_agent) {
        free(customer_list_record_row->user_agent);
        customer_list_record_row->user_agent = NULL;
    }
    free(customer_list_record_row);
}

cJSON *customer_list_record_row_convertToJSON(customer_list_record_row_t *customer_list_record_row) {
    cJSON *item = cJSON_CreateObject();

    // customer_list_record_row->email
    if(customer_list_record_row->email) {
    if(cJSON_AddStringToObject(item, "email", customer_list_record_row->email) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->external_id
    if(customer_list_record_row->external_id) {
    if(cJSON_AddStringToObject(item, "external_id", customer_list_record_row->external_id) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->hashed_phone_number
    if(customer_list_record_row->hashed_phone_number) {
    if(cJSON_AddStringToObject(item, "hashed_phone_number", customer_list_record_row->hashed_phone_number) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->hashed_pinner_id
    if(customer_list_record_row->hashed_pinner_id) {
    if(cJSON_AddStringToObject(item, "hashed_pinner_id", customer_list_record_row->hashed_pinner_id) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->ip_address
    if(customer_list_record_row->ip_address) {
    if(cJSON_AddStringToObject(item, "ip_address", customer_list_record_row->ip_address) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->liveramp_envelope
    if(customer_list_record_row->liveramp_envelope) {
    if(cJSON_AddStringToObject(item, "liveramp_envelope", customer_list_record_row->liveramp_envelope) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->maid
    if(customer_list_record_row->maid) {
    if(cJSON_AddStringToObject(item, "maid", customer_list_record_row->maid) == NULL) {
    goto fail; //String
    }
    }


    // customer_list_record_row->user_agent
    if(customer_list_record_row->user_agent) {
    if(cJSON_AddStringToObject(item, "user_agent", customer_list_record_row->user_agent) == NULL) {
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

customer_list_record_row_t *customer_list_record_row_parseFromJSON(cJSON *customer_list_record_rowJSON){

    customer_list_record_row_t *customer_list_record_row_local_var = NULL;

    char *email_local_str = NULL;

    char *external_id_local_str = NULL;

    char *hashed_phone_number_local_str = NULL;

    char *hashed_pinner_id_local_str = NULL;

    char *ip_address_local_str = NULL;

    char *liveramp_envelope_local_str = NULL;

    char *maid_local_str = NULL;

    char *user_agent_local_str = NULL;

    // customer_list_record_row->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "email");
    if (cJSON_IsNull(email)) {
        email = NULL;
    }
    if (email) { 
    if(!cJSON_IsString(email) && !cJSON_IsNull(email))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "external_id");
    if (cJSON_IsNull(external_id)) {
        external_id = NULL;
    }
    if (external_id) { 
    if(!cJSON_IsString(external_id) && !cJSON_IsNull(external_id))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->hashed_phone_number
    cJSON *hashed_phone_number = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "hashed_phone_number");
    if (cJSON_IsNull(hashed_phone_number)) {
        hashed_phone_number = NULL;
    }
    if (hashed_phone_number) { 
    if(!cJSON_IsString(hashed_phone_number) && !cJSON_IsNull(hashed_phone_number))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->hashed_pinner_id
    cJSON *hashed_pinner_id = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "hashed_pinner_id");
    if (cJSON_IsNull(hashed_pinner_id)) {
        hashed_pinner_id = NULL;
    }
    if (hashed_pinner_id) { 
    if(!cJSON_IsString(hashed_pinner_id) && !cJSON_IsNull(hashed_pinner_id))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->ip_address
    cJSON *ip_address = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "ip_address");
    if (cJSON_IsNull(ip_address)) {
        ip_address = NULL;
    }
    if (ip_address) { 
    if(!cJSON_IsString(ip_address) && !cJSON_IsNull(ip_address))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->liveramp_envelope
    cJSON *liveramp_envelope = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "liveramp_envelope");
    if (cJSON_IsNull(liveramp_envelope)) {
        liveramp_envelope = NULL;
    }
    if (liveramp_envelope) { 
    if(!cJSON_IsString(liveramp_envelope) && !cJSON_IsNull(liveramp_envelope))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->maid
    cJSON *maid = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "maid");
    if (cJSON_IsNull(maid)) {
        maid = NULL;
    }
    if (maid) { 
    if(!cJSON_IsString(maid) && !cJSON_IsNull(maid))
    {
    goto end; //String
    }
    }

    // customer_list_record_row->user_agent
    cJSON *user_agent = cJSON_GetObjectItemCaseSensitive(customer_list_record_rowJSON, "user_agent");
    if (cJSON_IsNull(user_agent)) {
        user_agent = NULL;
    }
    if (user_agent) { 
    if(!cJSON_IsString(user_agent) && !cJSON_IsNull(user_agent))
    {
    goto end; //String
    }
    }


    if (email && !cJSON_IsNull(email)) email_local_str = strdup(email->valuestring);
    if (external_id && !cJSON_IsNull(external_id)) external_id_local_str = strdup(external_id->valuestring);
    if (hashed_phone_number && !cJSON_IsNull(hashed_phone_number)) hashed_phone_number_local_str = strdup(hashed_phone_number->valuestring);
    if (hashed_pinner_id && !cJSON_IsNull(hashed_pinner_id)) hashed_pinner_id_local_str = strdup(hashed_pinner_id->valuestring);
    if (ip_address && !cJSON_IsNull(ip_address)) ip_address_local_str = strdup(ip_address->valuestring);
    if (liveramp_envelope && !cJSON_IsNull(liveramp_envelope)) liveramp_envelope_local_str = strdup(liveramp_envelope->valuestring);
    if (maid && !cJSON_IsNull(maid)) maid_local_str = strdup(maid->valuestring);
    if (user_agent && !cJSON_IsNull(user_agent)) user_agent_local_str = strdup(user_agent->valuestring);

    customer_list_record_row_local_var = customer_list_record_row_create_internal (
        email_local_str,
        external_id_local_str,
        hashed_phone_number_local_str,
        hashed_pinner_id_local_str,
        ip_address_local_str,
        liveramp_envelope_local_str,
        maid_local_str,
        user_agent_local_str
        );

    if (!customer_list_record_row_local_var) {
        goto end;
    }

    return customer_list_record_row_local_var;
end:
    if (email_local_str) {
        free(email_local_str);
        email_local_str = NULL;
    }
    if (external_id_local_str) {
        free(external_id_local_str);
        external_id_local_str = NULL;
    }
    if (hashed_phone_number_local_str) {
        free(hashed_phone_number_local_str);
        hashed_phone_number_local_str = NULL;
    }
    if (hashed_pinner_id_local_str) {
        free(hashed_pinner_id_local_str);
        hashed_pinner_id_local_str = NULL;
    }
    if (ip_address_local_str) {
        free(ip_address_local_str);
        ip_address_local_str = NULL;
    }
    if (liveramp_envelope_local_str) {
        free(liveramp_envelope_local_str);
        liveramp_envelope_local_str = NULL;
    }
    if (maid_local_str) {
        free(maid_local_str);
        maid_local_str = NULL;
    }
    if (user_agent_local_str) {
        free(user_agent_local_str);
        user_agent_local_str = NULL;
    }
    return NULL;

}
