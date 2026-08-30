#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_test_create.h"



static lead_form_test_create_t *lead_form_test_create_create_internal(
    list_t *answers
    ) {
    lead_form_test_create_t *lead_form_test_create_local_var = malloc(sizeof(lead_form_test_create_t));
    if (!lead_form_test_create_local_var) {
        return NULL;
    }
    memset(lead_form_test_create_local_var, 0, sizeof(lead_form_test_create_t));
    lead_form_test_create_local_var->_library_owned = 1;
    lead_form_test_create_local_var->answers = answers;
    return lead_form_test_create_local_var;
}

__attribute__((deprecated)) lead_form_test_create_t *lead_form_test_create_create(
    list_t *answers
    ) {
    lead_form_test_create_t *result = lead_form_test_create_create_internal (
        answers
        );
    if (!result) {
    }
    return result;
}

void lead_form_test_create_free(lead_form_test_create_t *lead_form_test_create) {
    if(NULL == lead_form_test_create){
        return ;
    }
    if(lead_form_test_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_test_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_test_create->answers) {
        list_ForEach(listEntry, lead_form_test_create->answers) {
            free(listEntry->data);
        }
        list_freeList(lead_form_test_create->answers);
        lead_form_test_create->answers = NULL;
    }
    free(lead_form_test_create);
}

cJSON *lead_form_test_create_convertToJSON(lead_form_test_create_t *lead_form_test_create) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_test_create->answers
    if (!lead_form_test_create->answers) {
        goto fail;
    }
    cJSON *answers = cJSON_AddArrayToObject(item, "answers");
    if(answers == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *answersListEntry;
    list_ForEach(answersListEntry, lead_form_test_create->answers) {
    if(cJSON_AddStringToObject(answers, "", answersListEntry->data) == NULL)
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

lead_form_test_create_t *lead_form_test_create_parseFromJSON(cJSON *lead_form_test_createJSON){

    lead_form_test_create_t *lead_form_test_create_local_var = NULL;

    // define the local list for lead_form_test_create->answers
    list_t *answersList = NULL;

    // lead_form_test_create->answers
    cJSON *answers = cJSON_GetObjectItemCaseSensitive(lead_form_test_createJSON, "answers");
    if (cJSON_IsNull(answers)) {
        answers = NULL;
    }
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



    lead_form_test_create_local_var = lead_form_test_create_create_internal (
        answersList
        );

    if (!lead_form_test_create_local_var) {
        goto end;
    }

    return lead_form_test_create_local_var;
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
