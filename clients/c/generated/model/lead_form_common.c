#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_common.h"


char* lead_form_common_status_ToString(pinterest_rest_api_lead_form_common__e status) {
    char* statusArray[] =  { "NULL", "DRAFT", "ACTIVE" };
    return statusArray[status];
}

pinterest_rest_api_lead_form_common__e lead_form_common_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "DRAFT", "ACTIVE" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

lead_form_common_t *lead_form_common_create(
    char *name,
    char *privacy_policy_link,
    int has_accepted_terms,
    char *completion_message,
    lead_form_status_t *status,
    char *disclosure_language,
    list_t *questions,
    list_t *policy_links
    ) {
    lead_form_common_t *lead_form_common_local_var = malloc(sizeof(lead_form_common_t));
    if (!lead_form_common_local_var) {
        return NULL;
    }
    lead_form_common_local_var->name = name;
    lead_form_common_local_var->privacy_policy_link = privacy_policy_link;
    lead_form_common_local_var->has_accepted_terms = has_accepted_terms;
    lead_form_common_local_var->completion_message = completion_message;
    lead_form_common_local_var->status = status;
    lead_form_common_local_var->disclosure_language = disclosure_language;
    lead_form_common_local_var->questions = questions;
    lead_form_common_local_var->policy_links = policy_links;

    return lead_form_common_local_var;
}


void lead_form_common_free(lead_form_common_t *lead_form_common) {
    if(NULL == lead_form_common){
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_common->name) {
        free(lead_form_common->name);
        lead_form_common->name = NULL;
    }
    if (lead_form_common->privacy_policy_link) {
        free(lead_form_common->privacy_policy_link);
        lead_form_common->privacy_policy_link = NULL;
    }
    if (lead_form_common->completion_message) {
        free(lead_form_common->completion_message);
        lead_form_common->completion_message = NULL;
    }
    if (lead_form_common->status) {
        lead_form_status_free(lead_form_common->status);
        lead_form_common->status = NULL;
    }
    if (lead_form_common->disclosure_language) {
        free(lead_form_common->disclosure_language);
        lead_form_common->disclosure_language = NULL;
    }
    if (lead_form_common->questions) {
        list_ForEach(listEntry, lead_form_common->questions) {
            lead_form_question_free(listEntry->data);
        }
        list_freeList(lead_form_common->questions);
        lead_form_common->questions = NULL;
    }
    if (lead_form_common->policy_links) {
        list_ForEach(listEntry, lead_form_common->policy_links) {
            lead_form_common_policy_links_inner_free(listEntry->data);
        }
        list_freeList(lead_form_common->policy_links);
        lead_form_common->policy_links = NULL;
    }
    free(lead_form_common);
}

cJSON *lead_form_common_convertToJSON(lead_form_common_t *lead_form_common) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_common->name
    if(lead_form_common->name) {
    if(cJSON_AddStringToObject(item, "name", lead_form_common->name) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_common->privacy_policy_link
    if(lead_form_common->privacy_policy_link) {
    if(cJSON_AddStringToObject(item, "privacy_policy_link", lead_form_common->privacy_policy_link) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_common->has_accepted_terms
    if(lead_form_common->has_accepted_terms) {
    if(cJSON_AddBoolToObject(item, "has_accepted_terms", lead_form_common->has_accepted_terms) == NULL) {
    goto fail; //Bool
    }
    }


    // lead_form_common->completion_message
    if(lead_form_common->completion_message) {
    if(cJSON_AddStringToObject(item, "completion_message", lead_form_common->completion_message) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_common->status
    if(lead_form_common->status != pinterest_rest_api_lead_form_common__NULL) {
    cJSON *status_local_JSON = lead_form_status_convertToJSON(lead_form_common->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // lead_form_common->disclosure_language
    if(lead_form_common->disclosure_language) {
    if(cJSON_AddStringToObject(item, "disclosure_language", lead_form_common->disclosure_language) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_common->questions
    if(lead_form_common->questions) {
    cJSON *questions = cJSON_AddArrayToObject(item, "questions");
    if(questions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *questionsListEntry;
    if (lead_form_common->questions) {
    list_ForEach(questionsListEntry, lead_form_common->questions) {
    cJSON *itemLocal = lead_form_question_convertToJSON(questionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(questions, itemLocal);
    }
    }
    }


    // lead_form_common->policy_links
    if(lead_form_common->policy_links) {
    cJSON *policy_links = cJSON_AddArrayToObject(item, "policy_links");
    if(policy_links == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *policy_linksListEntry;
    if (lead_form_common->policy_links) {
    list_ForEach(policy_linksListEntry, lead_form_common->policy_links) {
    cJSON *itemLocal = lead_form_common_policy_links_inner_convertToJSON(policy_linksListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(policy_links, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

lead_form_common_t *lead_form_common_parseFromJSON(cJSON *lead_form_commonJSON){

    lead_form_common_t *lead_form_common_local_var = NULL;

    // define the local variable for lead_form_common->status
    lead_form_status_t *status_local_nonprim = NULL;

    // define the local list for lead_form_common->questions
    list_t *questionsList = NULL;

    // define the local list for lead_form_common->policy_links
    list_t *policy_linksList = NULL;

    // lead_form_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // lead_form_common->privacy_policy_link
    cJSON *privacy_policy_link = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "privacy_policy_link");
    if (privacy_policy_link) { 
    if(!cJSON_IsString(privacy_policy_link) && !cJSON_IsNull(privacy_policy_link))
    {
    goto end; //String
    }
    }

    // lead_form_common->has_accepted_terms
    cJSON *has_accepted_terms = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "has_accepted_terms");
    if (has_accepted_terms) { 
    if(!cJSON_IsBool(has_accepted_terms))
    {
    goto end; //Bool
    }
    }

    // lead_form_common->completion_message
    cJSON *completion_message = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "completion_message");
    if (completion_message) { 
    if(!cJSON_IsString(completion_message) && !cJSON_IsNull(completion_message))
    {
    goto end; //String
    }
    }

    // lead_form_common->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "status");
    if (status) { 
    status_local_nonprim = lead_form_status_parseFromJSON(status); //custom
    }

    // lead_form_common->disclosure_language
    cJSON *disclosure_language = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "disclosure_language");
    if (disclosure_language) { 
    if(!cJSON_IsString(disclosure_language) && !cJSON_IsNull(disclosure_language))
    {
    goto end; //String
    }
    }

    // lead_form_common->questions
    cJSON *questions = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "questions");
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

    // lead_form_common->policy_links
    cJSON *policy_links = cJSON_GetObjectItemCaseSensitive(lead_form_commonJSON, "policy_links");
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


    lead_form_common_local_var = lead_form_common_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        privacy_policy_link && !cJSON_IsNull(privacy_policy_link) ? strdup(privacy_policy_link->valuestring) : NULL,
        has_accepted_terms ? has_accepted_terms->valueint : 0,
        completion_message && !cJSON_IsNull(completion_message) ? strdup(completion_message->valuestring) : NULL,
        status ? status_local_nonprim : NULL,
        disclosure_language && !cJSON_IsNull(disclosure_language) ? strdup(disclosure_language->valuestring) : NULL,
        questions ? questionsList : NULL,
        policy_links ? policy_linksList : NULL
        );

    return lead_form_common_local_var;
end:
    if (status_local_nonprim) {
        lead_form_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
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
    if (policy_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, policy_linksList) {
            lead_form_common_policy_links_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(policy_linksList);
        policy_linksList = NULL;
    }
    return NULL;

}
