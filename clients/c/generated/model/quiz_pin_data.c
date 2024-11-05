#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_data.h"


char* quiz_pin_data_tie_breaker_type_ToString(pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e tie_breaker_type) {
    char* tie_breaker_typeArray[] =  { "NULL", "RANDOM", "CUSTOM" };
    return tie_breaker_typeArray[tie_breaker_type];
}

pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e quiz_pin_data_tie_breaker_type_FromString(char* tie_breaker_type){
    int stringToReturn = 0;
    char *tie_breaker_typeArray[] =  { "NULL", "RANDOM", "CUSTOM" };
    size_t sizeofArray = sizeof(tie_breaker_typeArray) / sizeof(tie_breaker_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(tie_breaker_type, tie_breaker_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

quiz_pin_data_t *quiz_pin_data_create(
    list_t *questions,
    list_t *results,
    pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e tie_breaker_type,
    quiz_pin_result_t *tie_breaker_custom_result
    ) {
    quiz_pin_data_t *quiz_pin_data_local_var = malloc(sizeof(quiz_pin_data_t));
    if (!quiz_pin_data_local_var) {
        return NULL;
    }
    quiz_pin_data_local_var->questions = questions;
    quiz_pin_data_local_var->results = results;
    quiz_pin_data_local_var->tie_breaker_type = tie_breaker_type;
    quiz_pin_data_local_var->tie_breaker_custom_result = tie_breaker_custom_result;

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
    if (quiz_pin_data->tie_breaker_custom_result) {
        quiz_pin_result_free(quiz_pin_data->tie_breaker_custom_result);
        quiz_pin_data->tie_breaker_custom_result = NULL;
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


    // quiz_pin_data->tie_breaker_type
    if(quiz_pin_data->tie_breaker_type != pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "tie_breaker_type", tie_breaker_typequiz_pin_data_ToString(quiz_pin_data->tie_breaker_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // quiz_pin_data->tie_breaker_custom_result
    if(quiz_pin_data->tie_breaker_custom_result) {
    cJSON *tie_breaker_custom_result_local_JSON = quiz_pin_result_convertToJSON(quiz_pin_data->tie_breaker_custom_result);
    if(tie_breaker_custom_result_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tie_breaker_custom_result", tie_breaker_custom_result_local_JSON);
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

quiz_pin_data_t *quiz_pin_data_parseFromJSON(cJSON *quiz_pin_dataJSON){

    quiz_pin_data_t *quiz_pin_data_local_var = NULL;

    // define the local list for quiz_pin_data->questions
    list_t *questionsList = NULL;

    // define the local list for quiz_pin_data->results
    list_t *resultsList = NULL;

    // define the local variable for quiz_pin_data->tie_breaker_custom_result
    quiz_pin_result_t *tie_breaker_custom_result_local_nonprim = NULL;

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

    // quiz_pin_data->tie_breaker_type
    cJSON *tie_breaker_type = cJSON_GetObjectItemCaseSensitive(quiz_pin_dataJSON, "tie_breaker_type");
    pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_e tie_breaker_typeVariable;
    if (tie_breaker_type) { 
    if(!cJSON_IsString(tie_breaker_type))
    {
    goto end; //Enum
    }
    tie_breaker_typeVariable = quiz_pin_data_tie_breaker_type_FromString(tie_breaker_type->valuestring);
    }

    // quiz_pin_data->tie_breaker_custom_result
    cJSON *tie_breaker_custom_result = cJSON_GetObjectItemCaseSensitive(quiz_pin_dataJSON, "tie_breaker_custom_result");
    if (tie_breaker_custom_result) { 
    tie_breaker_custom_result_local_nonprim = quiz_pin_result_parseFromJSON(tie_breaker_custom_result); //nonprimitive
    }


    quiz_pin_data_local_var = quiz_pin_data_create (
        questions ? questionsList : NULL,
        results ? resultsList : NULL,
        tie_breaker_type ? tie_breaker_typeVariable : pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_NULL,
        tie_breaker_custom_result ? tie_breaker_custom_result_local_nonprim : NULL
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
    if (tie_breaker_custom_result_local_nonprim) {
        quiz_pin_result_free(tie_breaker_custom_result_local_nonprim);
        tie_breaker_custom_result_local_nonprim = NULL;
    }
    return NULL;

}
