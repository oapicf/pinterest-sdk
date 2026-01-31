#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_response.h"



static lead_form_response_t *lead_form_response_create_internal(
    char *completion_message,
    char *disclosure_language,
    int has_accepted_terms,
    char *name,
    list_t *policy_links,
    char *privacy_policy_link,
    list_t *questions,
    pinterest_rest_api_lead_form_status__e status,
    char *ad_account_id,
    int created_time,
    char *id,
    int updated_time
    ) {
    lead_form_response_t *lead_form_response_local_var = malloc(sizeof(lead_form_response_t));
    if (!lead_form_response_local_var) {
        return NULL;
    }
    lead_form_response_local_var->completion_message = completion_message;
    lead_form_response_local_var->disclosure_language = disclosure_language;
    lead_form_response_local_var->has_accepted_terms = has_accepted_terms;
    lead_form_response_local_var->name = name;
    lead_form_response_local_var->policy_links = policy_links;
    lead_form_response_local_var->privacy_policy_link = privacy_policy_link;
    lead_form_response_local_var->questions = questions;
    lead_form_response_local_var->status = status;
    lead_form_response_local_var->ad_account_id = ad_account_id;
    lead_form_response_local_var->created_time = created_time;
    lead_form_response_local_var->id = id;
    lead_form_response_local_var->updated_time = updated_time;

    lead_form_response_local_var->_library_owned = 1;
    return lead_form_response_local_var;
}

__attribute__((deprecated)) lead_form_response_t *lead_form_response_create(
    char *completion_message,
    char *disclosure_language,
    int has_accepted_terms,
    char *name,
    list_t *policy_links,
    char *privacy_policy_link,
    list_t *questions,
    pinterest_rest_api_lead_form_status__e status,
    char *ad_account_id,
    int created_time,
    char *id,
    int updated_time
    ) {
    return lead_form_response_create_internal (
        completion_message,
        disclosure_language,
        has_accepted_terms,
        name,
        policy_links,
        privacy_policy_link,
        questions,
        status,
        ad_account_id,
        created_time,
        id,
        updated_time
        );
}

void lead_form_response_free(lead_form_response_t *lead_form_response) {
    if(NULL == lead_form_response){
        return ;
    }
    if(lead_form_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_response->completion_message) {
        free(lead_form_response->completion_message);
        lead_form_response->completion_message = NULL;
    }
    if (lead_form_response->disclosure_language) {
        free(lead_form_response->disclosure_language);
        lead_form_response->disclosure_language = NULL;
    }
    if (lead_form_response->name) {
        free(lead_form_response->name);
        lead_form_response->name = NULL;
    }
    if (lead_form_response->policy_links) {
        list_ForEach(listEntry, lead_form_response->policy_links) {
            lead_form_common_policy_links_inner_free(listEntry->data);
        }
        list_freeList(lead_form_response->policy_links);
        lead_form_response->policy_links = NULL;
    }
    if (lead_form_response->privacy_policy_link) {
        free(lead_form_response->privacy_policy_link);
        lead_form_response->privacy_policy_link = NULL;
    }
    if (lead_form_response->questions) {
        list_ForEach(listEntry, lead_form_response->questions) {
            lead_form_question_free(listEntry->data);
        }
        list_freeList(lead_form_response->questions);
        lead_form_response->questions = NULL;
    }
    if (lead_form_response->ad_account_id) {
        free(lead_form_response->ad_account_id);
        lead_form_response->ad_account_id = NULL;
    }
    if (lead_form_response->id) {
        free(lead_form_response->id);
        lead_form_response->id = NULL;
    }
    free(lead_form_response);
}

cJSON *lead_form_response_convertToJSON(lead_form_response_t *lead_form_response) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_response->completion_message
    if(lead_form_response->completion_message) {
    if(cJSON_AddStringToObject(item, "completion_message", lead_form_response->completion_message) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_response->disclosure_language
    if(lead_form_response->disclosure_language) {
    if(cJSON_AddStringToObject(item, "disclosure_language", lead_form_response->disclosure_language) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_response->has_accepted_terms
    if(lead_form_response->has_accepted_terms) {
    if(cJSON_AddBoolToObject(item, "has_accepted_terms", lead_form_response->has_accepted_terms) == NULL) {
    goto fail; //Bool
    }
    }


    // lead_form_response->name
    if(lead_form_response->name) {
    if(cJSON_AddStringToObject(item, "name", lead_form_response->name) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_response->policy_links
    if(lead_form_response->policy_links) {
    cJSON *policy_links = cJSON_AddArrayToObject(item, "policy_links");
    if(policy_links == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *policy_linksListEntry;
    if (lead_form_response->policy_links) {
    list_ForEach(policy_linksListEntry, lead_form_response->policy_links) {
    cJSON *itemLocal = lead_form_common_policy_links_inner_convertToJSON(policy_linksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(policy_links, itemLocal);
    }
    }
    }


    // lead_form_response->privacy_policy_link
    if(lead_form_response->privacy_policy_link) {
    if(cJSON_AddStringToObject(item, "privacy_policy_link", lead_form_response->privacy_policy_link) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_response->questions
    if(lead_form_response->questions) {
    cJSON *questions = cJSON_AddArrayToObject(item, "questions");
    if(questions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *questionsListEntry;
    if (lead_form_response->questions) {
    list_ForEach(questionsListEntry, lead_form_response->questions) {
    cJSON *itemLocal = lead_form_question_convertToJSON(questionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(questions, itemLocal);
    }
    }
    }


    // lead_form_response->status
    if(lead_form_response->status != pinterest_rest_api_lead_form_status__NULL) {
    cJSON *status_local_JSON = lead_form_status_convertToJSON(lead_form_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // lead_form_response->ad_account_id
    if(lead_form_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", lead_form_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_response->created_time
    if(lead_form_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", lead_form_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // lead_form_response->id
    if(lead_form_response->id) {
    if(cJSON_AddStringToObject(item, "id", lead_form_response->id) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_response->updated_time
    if(lead_form_response->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", lead_form_response->updated_time) == NULL) {
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

lead_form_response_t *lead_form_response_parseFromJSON(cJSON *lead_form_responseJSON){

    lead_form_response_t *lead_form_response_local_var = NULL;

    // define the local list for lead_form_response->policy_links
    list_t *policy_linksList = NULL;

    // define the local list for lead_form_response->questions
    list_t *questionsList = NULL;

    // define the local variable for lead_form_response->status
    pinterest_rest_api_lead_form_status__e status_local_nonprim = 0;

    // lead_form_response->completion_message
    cJSON *completion_message = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "completion_message");
    if (cJSON_IsNull(completion_message)) {
        completion_message = NULL;
    }
    if (completion_message) { 
    if(!cJSON_IsString(completion_message) && !cJSON_IsNull(completion_message))
    {
    goto end; //String
    }
    }

    // lead_form_response->disclosure_language
    cJSON *disclosure_language = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "disclosure_language");
    if (cJSON_IsNull(disclosure_language)) {
        disclosure_language = NULL;
    }
    if (disclosure_language) { 
    if(!cJSON_IsString(disclosure_language) && !cJSON_IsNull(disclosure_language))
    {
    goto end; //String
    }
    }

    // lead_form_response->has_accepted_terms
    cJSON *has_accepted_terms = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "has_accepted_terms");
    if (cJSON_IsNull(has_accepted_terms)) {
        has_accepted_terms = NULL;
    }
    if (has_accepted_terms) { 
    if(!cJSON_IsBool(has_accepted_terms))
    {
    goto end; //Bool
    }
    }

    // lead_form_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // lead_form_response->policy_links
    cJSON *policy_links = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "policy_links");
    if (cJSON_IsNull(policy_links)) {
        policy_links = NULL;
    }
    if (policy_links) { 
    cJSON *policy_links_local_nonprimitive = NULL;
    if(!cJSON_IsArray(policy_links)){
        goto end; //nonprimitive container
    }

    policy_linksList = list_createList();

    cJSON_ArrayForEach(policy_links_local_nonprimitive,policy_links )
    {
        if(!cJSON_IsObject(policy_links_local_nonprimitive)){
            goto end;
        }
        lead_form_common_policy_links_inner_t *policy_linksItem = lead_form_common_policy_links_inner_parseFromJSON(policy_links_local_nonprimitive);

        list_addElement(policy_linksList, policy_linksItem);
    }
    }

    // lead_form_response->privacy_policy_link
    cJSON *privacy_policy_link = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "privacy_policy_link");
    if (cJSON_IsNull(privacy_policy_link)) {
        privacy_policy_link = NULL;
    }
    if (privacy_policy_link) { 
    if(!cJSON_IsString(privacy_policy_link) && !cJSON_IsNull(privacy_policy_link))
    {
    goto end; //String
    }
    }

    // lead_form_response->questions
    cJSON *questions = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "questions");
    if (cJSON_IsNull(questions)) {
        questions = NULL;
    }
    if (questions) { 
    cJSON *questions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(questions)){
        goto end; //nonprimitive container
    }

    questionsList = list_createList();

    cJSON_ArrayForEach(questions_local_nonprimitive,questions )
    {
        if(!cJSON_IsObject(questions_local_nonprimitive)){
            goto end;
        }
        lead_form_question_t *questionsItem = lead_form_question_parseFromJSON(questions_local_nonprimitive);

        list_addElement(questionsList, questionsItem);
    }
    }

    // lead_form_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = lead_form_status_parseFromJSON(status); //custom
    }

    // lead_form_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // lead_form_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // lead_form_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // lead_form_response->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(lead_form_responseJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }


    lead_form_response_local_var = lead_form_response_create_internal (
        completion_message && !cJSON_IsNull(completion_message) ? strdup(completion_message->valuestring) : NULL,
        disclosure_language && !cJSON_IsNull(disclosure_language) ? strdup(disclosure_language->valuestring) : NULL,
        has_accepted_terms ? has_accepted_terms->valueint : 0,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        policy_links ? policy_linksList : NULL,
        privacy_policy_link && !cJSON_IsNull(privacy_policy_link) ? strdup(privacy_policy_link->valuestring) : NULL,
        questions ? questionsList : NULL,
        status ? status_local_nonprim : 0,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        updated_time ? updated_time->valuedouble : 0
        );

    return lead_form_response_local_var;
end:
    if (policy_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, policy_linksList) {
            lead_form_common_policy_links_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(policy_linksList);
        policy_linksList = NULL;
    }
    if (questionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, questionsList) {
            lead_form_question_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(questionsList);
        questionsList = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
