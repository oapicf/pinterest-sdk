#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_option.h"



static quiz_pin_option_t *quiz_pin_option_create_internal(
    double *id,
    char *text
    ) {
    quiz_pin_option_t *quiz_pin_option_local_var = malloc(sizeof(quiz_pin_option_t));
    if (!quiz_pin_option_local_var) {
        return NULL;
    }
    memset(quiz_pin_option_local_var, 0, sizeof(quiz_pin_option_t));
    quiz_pin_option_local_var->_library_owned = 1;
    quiz_pin_option_local_var->id = id;
    quiz_pin_option_local_var->text = text;
    return quiz_pin_option_local_var;
}

__attribute__((deprecated)) quiz_pin_option_t *quiz_pin_option_create(
    double *id,
    char *text
    ) {
    double *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(double));
        if (id_copy) *id_copy = *id;
    }
    quiz_pin_option_t *result = quiz_pin_option_create_internal (
        id_copy,
        text
        );
    if (!result) {
        free(id_copy);
    }
    return result;
}

void quiz_pin_option_free(quiz_pin_option_t *quiz_pin_option) {
    if(NULL == quiz_pin_option){
        return ;
    }
    if(quiz_pin_option->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "quiz_pin_option_free");
        return ;
    }
    listEntry_t *listEntry;
    if (quiz_pin_option->id) {
        free(quiz_pin_option->id);
        quiz_pin_option->id = NULL;
    }
    if (quiz_pin_option->text) {
        free(quiz_pin_option->text);
        quiz_pin_option->text = NULL;
    }
    free(quiz_pin_option);
}

cJSON *quiz_pin_option_convertToJSON(quiz_pin_option_t *quiz_pin_option) {
    cJSON *item = cJSON_CreateObject();

    // quiz_pin_option->id
    if(quiz_pin_option->id) {
    if(cJSON_AddNumberToObject(item, "id", *quiz_pin_option->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // quiz_pin_option->text
    if(quiz_pin_option->text) {
    if(cJSON_AddStringToObject(item, "text", quiz_pin_option->text) == NULL) {
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

quiz_pin_option_t *quiz_pin_option_parseFromJSON(cJSON *quiz_pin_optionJSON){

    quiz_pin_option_t *quiz_pin_option_local_var = NULL;

    // define the local variable for quiz_pin_option->id
    double *id_local_var = NULL;

    char *text_local_str = NULL;

    // quiz_pin_option->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(quiz_pin_optionJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    id_local_var = malloc(sizeof(double));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;
    }

    // quiz_pin_option->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(quiz_pin_optionJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }


    if (text && !cJSON_IsNull(text)) text_local_str = strdup(text->valuestring);

    quiz_pin_option_local_var = quiz_pin_option_create_internal (
        id_local_var,
        text_local_str
        );

    if (!quiz_pin_option_local_var) {
        goto end;
    }

    return quiz_pin_option_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (text_local_str) {
        free(text_local_str);
        text_local_str = NULL;
    }
    return NULL;

}
