#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_batch_update.h"



static lead_form_batch_update_t *lead_form_batch_update_create_internal(
    char *completion_message,
    char *disclosure_language,
    int *has_accepted_terms,
    char *id,
    char *name,
    list_t *policy_links,
    char *privacy_policy_link,
    list_t *questions,
    pinterest_rest_api_lead_form_status__e status
    ) {
    lead_form_batch_update_t *lead_form_batch_update_local_var = malloc(sizeof(lead_form_batch_update_t));
    if (!lead_form_batch_update_local_var) {
        return NULL;
    }
    memset(lead_form_batch_update_local_var, 0, sizeof(lead_form_batch_update_t));
    lead_form_batch_update_local_var->_library_owned = 1;
    lead_form_batch_update_local_var->completion_message = completion_message;
    lead_form_batch_update_local_var->disclosure_language = disclosure_language;
    lead_form_batch_update_local_var->has_accepted_terms = has_accepted_terms;
    lead_form_batch_update_local_var->id = id;
    lead_form_batch_update_local_var->name = name;
    lead_form_batch_update_local_var->policy_links = policy_links;
    lead_form_batch_update_local_var->privacy_policy_link = privacy_policy_link;
    lead_form_batch_update_local_var->questions = questions;
    lead_form_batch_update_local_var->status = status;
    return lead_form_batch_update_local_var;
}

__attribute__((deprecated)) lead_form_batch_update_t *lead_form_batch_update_create(
    char *completion_message,
    char *disclosure_language,
    int *has_accepted_terms,
    char *id,
    char *name,
    list_t *policy_links,
    char *privacy_policy_link,
    list_t *questions,
    pinterest_rest_api_lead_form_status__e status
    ) {
    int *has_accepted_terms_copy = NULL;
    if (has_accepted_terms) {
        has_accepted_terms_copy = malloc(sizeof(int));
        if (has_accepted_terms_copy) *has_accepted_terms_copy = *has_accepted_terms;
    }
    lead_form_batch_update_t *result = lead_form_batch_update_create_internal (
        completion_message,
        disclosure_language,
        has_accepted_terms_copy,
        id,
        name,
        policy_links,
        privacy_policy_link,
        questions,
        status
        );
    if (!result) {
        free(has_accepted_terms_copy);
    }
    return result;
}

void lead_form_batch_update_free(lead_form_batch_update_t *lead_form_batch_update) {
    if(NULL == lead_form_batch_update){
        return ;
    }
    if(lead_form_batch_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_batch_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_batch_update->completion_message) {
        free(lead_form_batch_update->completion_message);
        lead_form_batch_update->completion_message = NULL;
    }
    if (lead_form_batch_update->disclosure_language) {
        free(lead_form_batch_update->disclosure_language);
        lead_form_batch_update->disclosure_language = NULL;
    }
    if (lead_form_batch_update->has_accepted_terms) {
        free(lead_form_batch_update->has_accepted_terms);
        lead_form_batch_update->has_accepted_terms = NULL;
    }
    if (lead_form_batch_update->id) {
        free(lead_form_batch_update->id);
        lead_form_batch_update->id = NULL;
    }
    if (lead_form_batch_update->name) {
        free(lead_form_batch_update->name);
        lead_form_batch_update->name = NULL;
    }
    if (lead_form_batch_update->policy_links) {
        list_ForEach(listEntry, lead_form_batch_update->policy_links) {
            lead_form_policy_link_free(listEntry->data);
        }
        list_freeList(lead_form_batch_update->policy_links);
        lead_form_batch_update->policy_links = NULL;
    }
    if (lead_form_batch_update->privacy_policy_link) {
        free(lead_form_batch_update->privacy_policy_link);
        lead_form_batch_update->privacy_policy_link = NULL;
    }
    if (lead_form_batch_update->questions) {
        list_ForEach(listEntry, lead_form_batch_update->questions) {
            lead_form_question_free(listEntry->data);
        }
        list_freeList(lead_form_batch_update->questions);
        lead_form_batch_update->questions = NULL;
    }
    free(lead_form_batch_update);
}

cJSON *lead_form_batch_update_convertToJSON(lead_form_batch_update_t *lead_form_batch_update) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_batch_update->completion_message
    if(lead_form_batch_update->completion_message) {
    if(cJSON_AddStringToObject(item, "completion_message", lead_form_batch_update->completion_message) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_batch_update->disclosure_language
    if(lead_form_batch_update->disclosure_language) {
    if(cJSON_AddStringToObject(item, "disclosure_language", lead_form_batch_update->disclosure_language) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_batch_update->has_accepted_terms
    if(lead_form_batch_update->has_accepted_terms) {
    if(cJSON_AddBoolToObject(item, "has_accepted_terms", *lead_form_batch_update->has_accepted_terms) == NULL) {
    goto fail; //Bool
    }
    }


    // lead_form_batch_update->id
    if (!lead_form_batch_update->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", lead_form_batch_update->id) == NULL) {
    goto fail; //String
    }


    // lead_form_batch_update->name
    if(lead_form_batch_update->name) {
    if(cJSON_AddStringToObject(item, "name", lead_form_batch_update->name) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_batch_update->policy_links
    if(lead_form_batch_update->policy_links) {
    cJSON *policy_links = cJSON_AddArrayToObject(item, "policy_links");
    if(policy_links == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *policy_linksListEntry;
    if (lead_form_batch_update->policy_links) {
    list_ForEach(policy_linksListEntry, lead_form_batch_update->policy_links) {
    cJSON *itemLocal = lead_form_policy_link_convertToJSON(policy_linksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(policy_links, itemLocal);
    }
    }
    }


    // lead_form_batch_update->privacy_policy_link
    if(lead_form_batch_update->privacy_policy_link) {
    if(cJSON_AddStringToObject(item, "privacy_policy_link", lead_form_batch_update->privacy_policy_link) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_batch_update->questions
    if(lead_form_batch_update->questions) {
    cJSON *questions = cJSON_AddArrayToObject(item, "questions");
    if(questions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *questionsListEntry;
    if (lead_form_batch_update->questions) {
    list_ForEach(questionsListEntry, lead_form_batch_update->questions) {
    cJSON *itemLocal = lead_form_question_convertToJSON(questionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(questions, itemLocal);
    }
    }
    }


    // lead_form_batch_update->status
    if(lead_form_batch_update->status != pinterest_rest_api_lead_form_status__NULL) {
    cJSON *status_local_JSON = lead_form_status_convertToJSON(lead_form_batch_update->status);
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

lead_form_batch_update_t *lead_form_batch_update_parseFromJSON(cJSON *lead_form_batch_updateJSON){

    lead_form_batch_update_t *lead_form_batch_update_local_var = NULL;

    char *completion_message_local_str = NULL;

    char *disclosure_language_local_str = NULL;

    // define the local variable for lead_form_batch_update->has_accepted_terms
    int *has_accepted_terms_local_var = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    // define the local list for lead_form_batch_update->policy_links
    list_t *policy_linksList = NULL;

    char *privacy_policy_link_local_str = NULL;

    // define the local list for lead_form_batch_update->questions
    list_t *questionsList = NULL;

    // define the local variable for lead_form_batch_update->status
    pinterest_rest_api_lead_form_status__e status_local_nonprim = 0;

    // lead_form_batch_update->completion_message
    cJSON *completion_message = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "completion_message");
    if (cJSON_IsNull(completion_message)) {
        completion_message = NULL;
    }
    if (completion_message) { 
    if(!cJSON_IsString(completion_message) && !cJSON_IsNull(completion_message))
    {
    goto end; //String
    }
    }

    // lead_form_batch_update->disclosure_language
    cJSON *disclosure_language = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "disclosure_language");
    if (cJSON_IsNull(disclosure_language)) {
        disclosure_language = NULL;
    }
    if (disclosure_language) { 
    if(!cJSON_IsString(disclosure_language) && !cJSON_IsNull(disclosure_language))
    {
    goto end; //String
    }
    }

    // lead_form_batch_update->has_accepted_terms
    cJSON *has_accepted_terms = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "has_accepted_terms");
    if (cJSON_IsNull(has_accepted_terms)) {
        has_accepted_terms = NULL;
    }
    if (has_accepted_terms) { 
    if(!cJSON_IsBool(has_accepted_terms))
    {
    goto end; //Bool
    }
    has_accepted_terms_local_var = malloc(sizeof(int));
    if(!has_accepted_terms_local_var)
    {
        goto end;
    }
    *has_accepted_terms_local_var = has_accepted_terms->valueint;
    }

    // lead_form_batch_update->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // lead_form_batch_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // lead_form_batch_update->policy_links
    cJSON *policy_links = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "policy_links");
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
        lead_form_policy_link_t *policy_linksItem = lead_form_policy_link_parseFromJSON(policy_links_local_nonprimitive);

        list_addElement(policy_linksList, policy_linksItem);
    }
    }

    // lead_form_batch_update->privacy_policy_link
    cJSON *privacy_policy_link = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "privacy_policy_link");
    if (cJSON_IsNull(privacy_policy_link)) {
        privacy_policy_link = NULL;
    }
    if (privacy_policy_link) { 
    if(!cJSON_IsString(privacy_policy_link) && !cJSON_IsNull(privacy_policy_link))
    {
    goto end; //String
    }
    }

    // lead_form_batch_update->questions
    cJSON *questions = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "questions");
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

    // lead_form_batch_update->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(lead_form_batch_updateJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = lead_form_status_parseFromJSON(status); //custom
    }


    if (completion_message && !cJSON_IsNull(completion_message)) completion_message_local_str = strdup(completion_message->valuestring);
    if (disclosure_language && !cJSON_IsNull(disclosure_language)) disclosure_language_local_str = strdup(disclosure_language->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (privacy_policy_link && !cJSON_IsNull(privacy_policy_link)) privacy_policy_link_local_str = strdup(privacy_policy_link->valuestring);

    lead_form_batch_update_local_var = lead_form_batch_update_create_internal (
        completion_message_local_str,
        disclosure_language_local_str,
        has_accepted_terms_local_var,
        id_local_str,
        name_local_str,
        policy_links ? policy_linksList : NULL,
        privacy_policy_link_local_str,
        questions ? questionsList : NULL,
        status ? status_local_nonprim : 0
        );

    if (!lead_form_batch_update_local_var) {
        goto end;
    }

    return lead_form_batch_update_local_var;
end:
    if (completion_message_local_str) {
        free(completion_message_local_str);
        completion_message_local_str = NULL;
    }
    if (disclosure_language_local_str) {
        free(disclosure_language_local_str);
        disclosure_language_local_str = NULL;
    }
    if (has_accepted_terms_local_var) {
        free(has_accepted_terms_local_var);
        has_accepted_terms_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (policy_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, policy_linksList) {
            lead_form_policy_link_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(policy_linksList);
        policy_linksList = NULL;
    }
    if (privacy_policy_link_local_str) {
        free(privacy_policy_link_local_str);
        privacy_policy_link_local_str = NULL;
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
