#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_common_quiz_pin_data.h"



ad_common_quiz_pin_data_t *ad_common_quiz_pin_data_create(
    list_t *questions,
    list_t *results
    ) {
    ad_common_quiz_pin_data_t *ad_common_quiz_pin_data_local_var = malloc(sizeof(ad_common_quiz_pin_data_t));
    if (!ad_common_quiz_pin_data_local_var) {
        return NULL;
    }
    ad_common_quiz_pin_data_local_var->questions = questions;
    ad_common_quiz_pin_data_local_var->results = results;

    return ad_common_quiz_pin_data_local_var;
}


void ad_common_quiz_pin_data_free(ad_common_quiz_pin_data_t *ad_common_quiz_pin_data) {
    if(NULL == ad_common_quiz_pin_data){
        return ;
    }
    listEntry_t *listEntry;
    if (ad_common_quiz_pin_data->questions) {
        list_ForEach(listEntry, ad_common_quiz_pin_data->questions) {
            quiz_pin_question_free(listEntry->data);
        }
        list_freeList(ad_common_quiz_pin_data->questions);
        ad_common_quiz_pin_data->questions = NULL;
    }
    if (ad_common_quiz_pin_data->results) {
        list_ForEach(listEntry, ad_common_quiz_pin_data->results) {
            quiz_pin_result_free(listEntry->data);
        }
        list_freeList(ad_common_quiz_pin_data->results);
        ad_common_quiz_pin_data->results = NULL;
    }
    free(ad_common_quiz_pin_data);
}

cJSON *ad_common_quiz_pin_data_convertToJSON(ad_common_quiz_pin_data_t *ad_common_quiz_pin_data) {
    cJSON *item = cJSON_CreateObject();

    // ad_common_quiz_pin_data->questions
    if(ad_common_quiz_pin_data->questions) {
    cJSON *questions = cJSON_AddArrayToObject(item, "questions");
    if(questions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *questionsListEntry;
    if (ad_common_quiz_pin_data->questions) {
    list_ForEach(questionsListEntry, ad_common_quiz_pin_data->questions) {
    cJSON *itemLocal = quiz_pin_question_convertToJSON(questionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(questions, itemLocal);
    }
    }
    }


    // ad_common_quiz_pin_data->results
    if(ad_common_quiz_pin_data->results) {
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (ad_common_quiz_pin_data->results) {
    list_ForEach(resultsListEntry, ad_common_quiz_pin_data->results) {
    cJSON *itemLocal = quiz_pin_result_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
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

ad_common_quiz_pin_data_t *ad_common_quiz_pin_data_parseFromJSON(cJSON *ad_common_quiz_pin_dataJSON){

    ad_common_quiz_pin_data_t *ad_common_quiz_pin_data_local_var = NULL;

    // define the local list for ad_common_quiz_pin_data->questions
    list_t *questionsList = NULL;

    // define the local list for ad_common_quiz_pin_data->results
    list_t *resultsList = NULL;

    // ad_common_quiz_pin_data->questions
    cJSON *questions = cJSON_GetObjectItemCaseSensitive(ad_common_quiz_pin_dataJSON, "questions");
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
        quiz_pin_question_t *questionsItem = quiz_pin_question_parseFromJSON(questions_local_nonprimitive);

        list_addElement(questionsList, questionsItem);
    }
    }

    // ad_common_quiz_pin_data->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(ad_common_quiz_pin_dataJSON, "results");
    if (results) { 
    cJSON *results_local_nonprimitive = NULL;
    if(!cJSON_IsArray(results)){
        goto end; //nonprimitive container
    }

    resultsList = list_createList();

    cJSON_ArrayForEach(results_local_nonprimitive,results )
    {
        if(!cJSON_IsObject(results_local_nonprimitive)){
            goto end;
        }
        quiz_pin_result_t *resultsItem = quiz_pin_result_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }
    }


    ad_common_quiz_pin_data_local_var = ad_common_quiz_pin_data_create (
        questions ? questionsList : NULL,
        results ? resultsList : NULL
        );

    return ad_common_quiz_pin_data_local_var;
end:
    if (questionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, questionsList) {
            quiz_pin_question_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(questionsList);
        questionsList = NULL;
    }
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            quiz_pin_result_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    return NULL;

}
