#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_option.h"



quiz_pin_option_t *quiz_pin_option_create(
    double id,
    char *text
    ) {
    quiz_pin_option_t *quiz_pin_option_local_var = malloc(sizeof(quiz_pin_option_t));
    if (!quiz_pin_option_local_var) {
        return NULL;
    }
    quiz_pin_option_local_var->id = id;
    quiz_pin_option_local_var->text = text;

    return quiz_pin_option_local_var;
}


void quiz_pin_option_free(quiz_pin_option_t *quiz_pin_option) {
    if(NULL == quiz_pin_option){
        return ;
    }
    listEntry_t *listEntry;
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
    if(cJSON_AddNumberToObject(item, "id", quiz_pin_option->id) == NULL) {
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

    // quiz_pin_option->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(quiz_pin_optionJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // quiz_pin_option->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(quiz_pin_optionJSON, "text");
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }


    quiz_pin_option_local_var = quiz_pin_option_create (
        id ? id->valuedouble : 0,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL
        );

    return quiz_pin_option_local_var;
end:
    return NULL;

}
