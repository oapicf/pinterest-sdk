#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_question.h"



quiz_pin_question_t *quiz_pin_question_create(
    double question_id,
    char *question_text,
    list_t *options
    ) {
    quiz_pin_question_t *quiz_pin_question_local_var = malloc(sizeof(quiz_pin_question_t));
    if (!quiz_pin_question_local_var) {
        return NULL;
    }
    quiz_pin_question_local_var->question_id = question_id;
    quiz_pin_question_local_var->question_text = question_text;
    quiz_pin_question_local_var->options = options;

    return quiz_pin_question_local_var;
}


void quiz_pin_question_free(quiz_pin_question_t *quiz_pin_question) {
    if(NULL == quiz_pin_question){
        return ;
    }
    listEntry_t *listEntry;
    if (quiz_pin_question->question_text) {
        free(quiz_pin_question->question_text);
        quiz_pin_question->question_text = NULL;
    }
    if (quiz_pin_question->options) {
        list_ForEach(listEntry, quiz_pin_question->options) {
            quiz_pin_option_free(listEntry->data);
        }
        list_freeList(quiz_pin_question->options);
        quiz_pin_question->options = NULL;
    }
    free(quiz_pin_question);
}

cJSON *quiz_pin_question_convertToJSON(quiz_pin_question_t *quiz_pin_question) {
    cJSON *item = cJSON_CreateObject();

    // quiz_pin_question->question_id
    if(quiz_pin_question->question_id) {
    if(cJSON_AddNumberToObject(item, "question_id", quiz_pin_question->question_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // quiz_pin_question->question_text
    if(quiz_pin_question->question_text) {
    if(cJSON_AddStringToObject(item, "question_text", quiz_pin_question->question_text) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_question->options
    if(quiz_pin_question->options) {
    cJSON *options = cJSON_AddArrayToObject(item, "options");
    if(options == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *optionsListEntry;
    if (quiz_pin_question->options) {
    list_ForEach(optionsListEntry, quiz_pin_question->options) {
    cJSON *itemLocal = quiz_pin_option_convertToJSON(optionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(options, itemLocal);
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

quiz_pin_question_t *quiz_pin_question_parseFromJSON(cJSON *quiz_pin_questionJSON){

    quiz_pin_question_t *quiz_pin_question_local_var = NULL;

    // define the local list for quiz_pin_question->options
    list_t *optionsList = NULL;

    // quiz_pin_question->question_id
    cJSON *question_id = cJSON_GetObjectItemCaseSensitive(quiz_pin_questionJSON, "question_id");
    if (question_id) { 
    if(!cJSON_IsNumber(question_id))
    {
    goto end; //Numeric
    }
    }

    // quiz_pin_question->question_text
    cJSON *question_text = cJSON_GetObjectItemCaseSensitive(quiz_pin_questionJSON, "question_text");
    if (question_text) { 
    if(!cJSON_IsString(question_text) && !cJSON_IsNull(question_text))
    {
    goto end; //String
    }
    }

    // quiz_pin_question->options
    cJSON *options = cJSON_GetObjectItemCaseSensitive(quiz_pin_questionJSON, "options");
    if (options) { 
    cJSON *options_local_nonprimitive = NULL;
    if(!cJSON_IsArray(options)){
        goto end; //nonprimitive container
    }

    optionsList = list_createList();

    cJSON_ArrayForEach(options_local_nonprimitive,options )
    {
        if(!cJSON_IsObject(options_local_nonprimitive)){
            goto end;
        }
        quiz_pin_option_t *optionsItem = quiz_pin_option_parseFromJSON(options_local_nonprimitive);

        list_addElement(optionsList, optionsItem);
    }
    }


    quiz_pin_question_local_var = quiz_pin_question_create (
        question_id ? question_id->valuedouble : 0,
        question_text && !cJSON_IsNull(question_text) ? strdup(question_text->valuestring) : NULL,
        options ? optionsList : NULL
        );

    return quiz_pin_question_local_var;
end:
    if (optionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, optionsList) {
            quiz_pin_option_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(optionsList);
        optionsList = NULL;
    }
    return NULL;

}
