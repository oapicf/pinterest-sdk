#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_data.h"



quiz_pin_data_t *quiz_pin_data_create(
    list_t *questions,
    list_t *results
    ) {
    quiz_pin_data_t *quiz_pin_data_local_var = malloc(sizeof(quiz_pin_data_t));
    if (!quiz_pin_data_local_var) {
        return NULL;
    }
    quiz_pin_data_local_var->questions = questions;
    quiz_pin_data_local_var->results = results;

    return quiz_pin_data_local_var;
}


void quiz_pin_data_free(quiz_pin_data_t *quiz_pin_data) {
    if(NULL == quiz_pin_data){
        return ;
    }
    listEntry_t *listEntry;
    if (quiz_pin_data->questions) {
        list_ForEach(listEntry, quiz_pin_data->questions) {
            quiz_pin_question_free(listEntry->data);
        }
        list_freeList(quiz_pin_data->questions);
        quiz_pin_data->questions = NULL;
    }
    if (quiz_pin_data->results) {
        list_ForEach(listEntry, quiz_pin_data->results) {
            quiz_pin_result_free(listEntry->data);
        }
        list_freeList(quiz_pin_data->results);
        quiz_pin_data->results = NULL;
    }
    free(quiz_pin_data);
}

cJSON *quiz_pin_data_convertToJSON(quiz_pin_data_t *quiz_pin_data) {
    cJSON *item = cJSON_CreateObject();

    // quiz_pin_data->questions
    if(quiz_pin_data->questions) {
    cJSON *questions = cJSON_AddArrayToObject(item, "questions");
    if(questions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *questionsListEntry;
    if (quiz_pin_data->questions) {
    list_ForEach(questionsListEntry, quiz_pin_data->questions) {
    cJSON *itemLocal = quiz_pin_question_convertToJSON(questionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(questions, itemLocal);
    }
    }
    }


    // quiz_pin_data->results
    if(quiz_pin_data->results) {
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (quiz_pin_data->results) {
    list_ForEach(resultsListEntry, quiz_pin_data->results) {
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

quiz_pin_data_t *quiz_pin_data_parseFromJSON(cJSON *quiz_pin_dataJSON){

    quiz_pin_data_t *quiz_pin_data_local_var = NULL;

    // define the local list for quiz_pin_data->questions
    list_t *questionsList = NULL;

    // define the local list for quiz_pin_data->results
    list_t *resultsList = NULL;

    // quiz_pin_data->questions
    cJSON *questions = cJSON_GetObjectItemCaseSensitive(quiz_pin_dataJSON, "questions");
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

    // quiz_pin_data->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(quiz_pin_dataJSON, "results");
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


    quiz_pin_data_local_var = quiz_pin_data_create (
        questions ? questionsList : NULL,
        results ? resultsList : NULL
        );

    return quiz_pin_data_local_var;
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
