#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_test_request.h"



lead_form_test_request_t *lead_form_test_request_create(
    list_t *answers
    ) {
    lead_form_test_request_t *lead_form_test_request_local_var = malloc(sizeof(lead_form_test_request_t));
    if (!lead_form_test_request_local_var) {
        return NULL;
    }
    lead_form_test_request_local_var->answers = answers;

    return lead_form_test_request_local_var;
}


void lead_form_test_request_free(lead_form_test_request_t *lead_form_test_request) {
    if(NULL == lead_form_test_request){
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_test_request->answers) {
        list_ForEach(listEntry, lead_form_test_request->answers) {
            free(listEntry->data);
        }
        list_freeList(lead_form_test_request->answers);
        lead_form_test_request->answers = NULL;
    }
    free(lead_form_test_request);
}

cJSON *lead_form_test_request_convertToJSON(lead_form_test_request_t *lead_form_test_request) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_test_request->answers
    if (!lead_form_test_request->answers) {
        goto fail;
    }
    cJSON *answers = cJSON_AddArrayToObject(item, "answers");
    if(answers == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *answersListEntry;
    list_ForEach(answersListEntry, lead_form_test_request->answers) {
    if(cJSON_AddStringToObject(answers, "", (char*)answersListEntry->data) == NULL)
    {
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

lead_form_test_request_t *lead_form_test_request_parseFromJSON(cJSON *lead_form_test_requestJSON){

    lead_form_test_request_t *lead_form_test_request_local_var = NULL;

    // define the local list for lead_form_test_request->answers
    list_t *answersList = NULL;

    // lead_form_test_request->answers
    cJSON *answers = cJSON_GetObjectItemCaseSensitive(lead_form_test_requestJSON, "answers");
    if (!answers) {
        goto end;
    }

    
    cJSON *answers_local = NULL;
    if(!cJSON_IsArray(answers)) {
        goto end;//primitive container
    }
    answersList = list_createList();

    cJSON_ArrayForEach(answers_local, answers)
    {
        if(!cJSON_IsString(answers_local))
        {
            goto end;
        }
        list_addElement(answersList , strdup(answers_local->valuestring));
    }


    lead_form_test_request_local_var = lead_form_test_request_create (
        answersList
        );

    return lead_form_test_request_local_var;
end:
    if (answersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, answersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(answersList);
        answersList = NULL;
    }
    return NULL;

}
